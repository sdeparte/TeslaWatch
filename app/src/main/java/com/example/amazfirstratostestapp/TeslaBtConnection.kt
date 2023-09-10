package com.example.amazfirstratostestapp

import android.util.Base64
import com.google.protobuf.ByteString
import com.teslamotors.protocol.VCSEC
import org.bouncycastle.jce.ECNamedCurveTable
import org.bouncycastle.jce.interfaces.ECPrivateKey
import org.bouncycastle.jce.interfaces.ECPublicKey
import org.bouncycastle.jce.provider.BouncyCastleProvider
import org.bouncycastle.jce.spec.ECPrivateKeySpec
import org.bouncycastle.jce.spec.ECPublicKeySpec
import java.io.InputStream
import java.math.BigInteger
import java.nio.ByteBuffer
import java.security.KeyFactory

class TeslaBtConnection {
    companion object {
        fun getPrivateKeyFromRaw(key: BigInteger): ECPrivateKey {
            val ecParameterSpec = ECNamedCurveTable.getParameterSpec("secp256r1")
            val privateKeySpec = ECPrivateKeySpec(key, ecParameterSpec)
            val keyFactory = KeyFactory.getInstance("ECDSA", BouncyCastleProvider())

            return keyFactory.generatePrivate(privateKeySpec) as ECPrivateKey
        }

        fun getPublicKeyFromRaw(privateKey: ECPrivateKey): ECPublicKey {
            val ecParameterSpec = ECNamedCurveTable.getParameterSpec("secp256r1")
            val w = ecParameterSpec.g.multiply((privateKey as org.bouncycastle.jce.interfaces.ECPrivateKey).getD())
            val publicKeySpec = ECPublicKeySpec(w, ecParameterSpec)
            val keyFactory = KeyFactory.getInstance("ECDSA", BouncyCastleProvider())

            return keyFactory.generatePublic(publicKeySpec) as ECPublicKey
        }

        fun test(stream: InputStream) {
            val keyData = stream.bufferedReader().use { it.readText() }
                .replace("-----BEGIN EC PRIVATE KEY-----\n", "")
                .replace(System.lineSeparator(), "")
                .replace("-----BEGIN EC PRIVATE KEY-----", "")

            val privKeyRaw = Base64.decode(keyData, Base64.DEFAULT)
            val privateKey = getPrivateKeyFromRaw(BigInteger(1, privKeyRaw))

            val publicKey = getPublicKeyFromRaw(privateKey)

            println("Public Key:")
            println(publicKey.toString())

            val uncompressedPublicKey = publicKey.q.getEncoded(false)

            val keyBuilder = VCSEC.PublicKey.newBuilder()
            keyBuilder.publicKeyRaw = ByteString.copyFrom(uncompressedPublicKey)
            val key = keyBuilder.build()

            val permissionChangeBuilder = VCSEC.PermissionChange.newBuilder()
            permissionChangeBuilder.addPermission(VCSEC.WhitelistKeyPermission_E.WHITELISTKEYPERMISSION_LOCAL_DRIVE)
            permissionChangeBuilder.addPermission(VCSEC.WhitelistKeyPermission_E.WHITELISTKEYPERMISSION_LOCAL_UNLOCK)
            permissionChangeBuilder.addPermission(VCSEC.WhitelistKeyPermission_E.WHITELISTKEYPERMISSION_REMOTE_DRIVE)
            permissionChangeBuilder.addPermission(VCSEC.WhitelistKeyPermission_E.WHITELISTKEYPERMISSION_REMOTE_UNLOCK)
            permissionChangeBuilder.key = key
            val permissionChange = permissionChangeBuilder.build()

            val metadataForKeyBuilder = VCSEC.KeyMetadata.newBuilder()
            metadataForKeyBuilder.keyFormFactor = VCSEC.KeyFormFactor.KEY_FORM_FACTOR_ANDROID_DEVICE
            val metadataForKey = metadataForKeyBuilder.build()

            val whitelistOperationBuilder = VCSEC.WhitelistOperation.newBuilder()
            whitelistOperationBuilder.addKeyToWhitelistAndAddPermissions = permissionChange
            whitelistOperationBuilder.metadataForKey = metadataForKey
            val whitelistOperation = whitelistOperationBuilder.build()

            val unsignedMessageBuilder = VCSEC.UnsignedMessage.newBuilder()
            unsignedMessageBuilder.whitelistOperation = whitelistOperation
            val unsignedMessage = unsignedMessageBuilder.build()

            println("\nUnsigned Message Layout:")
            println(unsignedMessage)

            val protoMsg = unsignedMessage.toByteString()

            val signedMessageBuilder = VCSEC.SignedMessage.newBuilder()
            signedMessageBuilder.protobufMessageAsBytes = protoMsg
            signedMessageBuilder.signatureType = VCSEC.SignatureType.SIGNATURE_TYPE_PRESENT_KEY
            val signedMessage = signedMessageBuilder.build()

            val toVCSECMessageBuilder = VCSEC.ToVCSECMessage.newBuilder()
            toVCSECMessageBuilder.signedMessage = signedMessage
            val toVCSECMessage = toVCSECMessageBuilder.build()

            println("\nTo VCSEC Message Layout:")
            println(toVCSECMessage)

            val authMsg = toVCSECMessage.toByteArray()

            val prependedMsg = ByteBuffer.allocate(2 + authMsg.size).putShort(authMsg.size.toShort()).put(authMsg).array()

            println("\nFinal Message To Send To Vehicle:")
            println(prependedMsg.toString())
        }
    }
}