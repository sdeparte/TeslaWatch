// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: proto/VCSECv3.10.14.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.teslamotors.protocol;

@kotlin.jvm.JvmName("-initializecommandStatus")
public inline fun commandStatus(block: com.teslamotors.protocol.CommandStatusKt.Dsl.() -> kotlin.Unit): com.teslamotors.protocol.VCSEC.CommandStatus =
  com.teslamotors.protocol.CommandStatusKt.Dsl._create(com.teslamotors.protocol.VCSEC.CommandStatus.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `VCSEC.CommandStatus`
 */
public object CommandStatusKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.teslamotors.protocol.VCSEC.CommandStatus.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.teslamotors.protocol.VCSEC.CommandStatus.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.teslamotors.protocol.VCSEC.CommandStatus = _builder.build()

    /**
     * `.VCSEC.OperationStatus_E operationStatus = 1;`
     */
    public var operationStatus: com.teslamotors.protocol.VCSEC.OperationStatus_E
      @JvmName("getOperationStatus")
      get() = _builder.getOperationStatus()
      @JvmName("setOperationStatus")
      set(value) {
        _builder.setOperationStatus(value)
      }
    public var operationStatusValue: kotlin.Int
      @JvmName("getOperationStatusValue")
      get() = _builder.getOperationStatusValue()
      @JvmName("setOperationStatusValue")
      set(value) {
        _builder.setOperationStatusValue(value)
      }
    /**
     * `.VCSEC.OperationStatus_E operationStatus = 1;`
     */
    public fun clearOperationStatus() {
      _builder.clearOperationStatus()
    }

    /**
     * `.VCSEC.SignedMessage_status signedMessageStatus = 2;`
     */
    public var signedMessageStatus: com.teslamotors.protocol.VCSEC.SignedMessage_status
      @JvmName("getSignedMessageStatus")
      get() = _builder.getSignedMessageStatus()
      @JvmName("setSignedMessageStatus")
      set(value) {
        _builder.setSignedMessageStatus(value)
      }
    /**
     * `.VCSEC.SignedMessage_status signedMessageStatus = 2;`
     */
    public fun clearSignedMessageStatus() {
      _builder.clearSignedMessageStatus()
    }
    /**
     * `.VCSEC.SignedMessage_status signedMessageStatus = 2;`
     * @return Whether the signedMessageStatus field is set.
     */
    public fun hasSignedMessageStatus(): kotlin.Boolean {
      return _builder.hasSignedMessageStatus()
    }

    /**
     * `.VCSEC.WhitelistOperation_status whitelistOperationStatus = 3;`
     */
    public var whitelistOperationStatus: com.teslamotors.protocol.VCSEC.WhitelistOperation_status
      @JvmName("getWhitelistOperationStatus")
      get() = _builder.getWhitelistOperationStatus()
      @JvmName("setWhitelistOperationStatus")
      set(value) {
        _builder.setWhitelistOperationStatus(value)
      }
    /**
     * `.VCSEC.WhitelistOperation_status whitelistOperationStatus = 3;`
     */
    public fun clearWhitelistOperationStatus() {
      _builder.clearWhitelistOperationStatus()
    }
    /**
     * `.VCSEC.WhitelistOperation_status whitelistOperationStatus = 3;`
     * @return Whether the whitelistOperationStatus field is set.
     */
    public fun hasWhitelistOperationStatus(): kotlin.Boolean {
      return _builder.hasWhitelistOperationStatus()
    }
    public val subMessageCase: com.teslamotors.protocol.VCSEC.CommandStatus.SubMessageCase
      @JvmName("getSubMessageCase")
      get() = _builder.getSubMessageCase()

    public fun clearSubMessage() {
      _builder.clearSubMessage()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.teslamotors.protocol.VCSEC.CommandStatus.copy(block: com.teslamotors.protocol.CommandStatusKt.Dsl.() -> kotlin.Unit): com.teslamotors.protocol.VCSEC.CommandStatus =
  com.teslamotors.protocol.CommandStatusKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val com.teslamotors.protocol.VCSEC.CommandStatusOrBuilder.signedMessageStatusOrNull: com.teslamotors.protocol.VCSEC.SignedMessage_status?
  get() = if (hasSignedMessageStatus()) getSignedMessageStatus() else null

public val com.teslamotors.protocol.VCSEC.CommandStatusOrBuilder.whitelistOperationStatusOrNull: com.teslamotors.protocol.VCSEC.WhitelistOperation_status?
  get() = if (hasWhitelistOperationStatus()) getWhitelistOperationStatus() else null

