// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: proto/VCSECv3.10.14.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.teslamotors.protocol;

@kotlin.jvm.JvmName("-initializecodeDescriptor")
public inline fun codeDescriptor(block: com.teslamotors.protocol.CodeDescriptorKt.Dsl.() -> kotlin.Unit): com.teslamotors.protocol.VCSEC.CodeDescriptor =
  com.teslamotors.protocol.CodeDescriptorKt.Dsl._create(com.teslamotors.protocol.VCSEC.CodeDescriptor.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `VCSEC.CodeDescriptor`
 */
public object CodeDescriptorKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.teslamotors.protocol.VCSEC.CodeDescriptor.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.teslamotors.protocol.VCSEC.CodeDescriptor.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.teslamotors.protocol.VCSEC.CodeDescriptor = _builder.build()

    /**
     * `.VCSEC.UpdaterLocation codeDescriptorLocation = 1;`
     */
    public var codeDescriptorLocation: com.teslamotors.protocol.VCSEC.UpdaterLocation
      @JvmName("getCodeDescriptorLocation")
      get() = _builder.getCodeDescriptorLocation()
      @JvmName("setCodeDescriptorLocation")
      set(value) {
        _builder.setCodeDescriptorLocation(value)
      }
    public var codeDescriptorLocationValue: kotlin.Int
      @JvmName("getCodeDescriptorLocationValue")
      get() = _builder.getCodeDescriptorLocationValue()
      @JvmName("setCodeDescriptorLocationValue")
      set(value) {
        _builder.setCodeDescriptorLocationValue(value)
      }
    /**
     * `.VCSEC.UpdaterLocation codeDescriptorLocation = 1;`
     */
    public fun clearCodeDescriptorLocation() {
      _builder.clearCodeDescriptorLocation()
    }

    /**
     * `uint32 version = 2;`
     */
    public var version: kotlin.Int
      @JvmName("getVersion")
      get() = _builder.getVersion()
      @JvmName("setVersion")
      set(value) {
        _builder.setVersion(value)
      }
    /**
     * `uint32 version = 2;`
     */
    public fun clearVersion() {
      _builder.clearVersion()
    }

    /**
     * `bytes codeDescriptorBytes = 3;`
     */
    public var codeDescriptorBytes: com.google.protobuf.ByteString
      @JvmName("getCodeDescriptorBytes")
      get() = _builder.getCodeDescriptorBytes()
      @JvmName("setCodeDescriptorBytes")
      set(value) {
        _builder.setCodeDescriptorBytes(value)
      }
    /**
     * `bytes codeDescriptorBytes = 3;`
     */
    public fun clearCodeDescriptorBytes() {
      _builder.clearCodeDescriptorBytes()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.teslamotors.protocol.VCSEC.CodeDescriptor.copy(block: com.teslamotors.protocol.CodeDescriptorKt.Dsl.() -> kotlin.Unit): com.teslamotors.protocol.VCSEC.CodeDescriptor =
  com.teslamotors.protocol.CodeDescriptorKt.Dsl._create(this.toBuilder()).apply { block() }._build()

