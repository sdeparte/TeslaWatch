// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: proto/VCSECv3.10.14.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.teslamotors.protocol;

@kotlin.jvm.JvmName("-initializegetCodeDescriptor")
public inline fun getCodeDescriptor(block: com.teslamotors.protocol.GetCodeDescriptorKt.Dsl.() -> kotlin.Unit): com.teslamotors.protocol.VCSEC.GetCodeDescriptor =
  com.teslamotors.protocol.GetCodeDescriptorKt.Dsl._create(com.teslamotors.protocol.VCSEC.GetCodeDescriptor.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `VCSEC.GetCodeDescriptor`
 */
public object GetCodeDescriptorKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.teslamotors.protocol.VCSEC.GetCodeDescriptor.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.teslamotors.protocol.VCSEC.GetCodeDescriptor.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.teslamotors.protocol.VCSEC.GetCodeDescriptor = _builder.build()

    /**
     * `.VCSEC.UpdaterLocation location = 1;`
     */
    public var location: com.teslamotors.protocol.VCSEC.UpdaterLocation
      @JvmName("getLocation")
      get() = _builder.getLocation()
      @JvmName("setLocation")
      set(value) {
        _builder.setLocation(value)
      }
    public var locationValue: kotlin.Int
      @JvmName("getLocationValue")
      get() = _builder.getLocationValue()
      @JvmName("setLocationValue")
      set(value) {
        _builder.setLocationValue(value)
      }
    /**
     * `.VCSEC.UpdaterLocation location = 1;`
     */
    public fun clearLocation() {
      _builder.clearLocation()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.teslamotors.protocol.VCSEC.GetCodeDescriptor.copy(block: com.teslamotors.protocol.GetCodeDescriptorKt.Dsl.() -> kotlin.Unit): com.teslamotors.protocol.VCSEC.GetCodeDescriptor =
  com.teslamotors.protocol.GetCodeDescriptorKt.Dsl._create(this.toBuilder()).apply { block() }._build()

