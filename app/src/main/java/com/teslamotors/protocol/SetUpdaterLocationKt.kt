// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: proto/VCSECv3.10.14.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.teslamotors.protocol;

@kotlin.jvm.JvmName("-initializesetUpdaterLocation")
public inline fun setUpdaterLocation(block: com.teslamotors.protocol.SetUpdaterLocationKt.Dsl.() -> kotlin.Unit): com.teslamotors.protocol.VCSEC.SetUpdaterLocation =
  com.teslamotors.protocol.SetUpdaterLocationKt.Dsl._create(com.teslamotors.protocol.VCSEC.SetUpdaterLocation.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `VCSEC.SetUpdaterLocation`
 */
public object SetUpdaterLocationKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.teslamotors.protocol.VCSEC.SetUpdaterLocation.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.teslamotors.protocol.VCSEC.SetUpdaterLocation.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.teslamotors.protocol.VCSEC.SetUpdaterLocation = _builder.build()

    /**
     * `.VCSEC.UpdaterLocation updaterLocation = 1;`
     */
    public var updaterLocation: com.teslamotors.protocol.VCSEC.UpdaterLocation
      @JvmName("getUpdaterLocation")
      get() = _builder.getUpdaterLocation()
      @JvmName("setUpdaterLocation")
      set(value) {
        _builder.setUpdaterLocation(value)
      }
    public var updaterLocationValue: kotlin.Int
      @JvmName("getUpdaterLocationValue")
      get() = _builder.getUpdaterLocationValue()
      @JvmName("setUpdaterLocationValue")
      set(value) {
        _builder.setUpdaterLocationValue(value)
      }
    /**
     * `.VCSEC.UpdaterLocation updaterLocation = 1;`
     */
    public fun clearUpdaterLocation() {
      _builder.clearUpdaterLocation()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.teslamotors.protocol.VCSEC.SetUpdaterLocation.copy(block: com.teslamotors.protocol.SetUpdaterLocationKt.Dsl.() -> kotlin.Unit): com.teslamotors.protocol.VCSEC.SetUpdaterLocation =
  com.teslamotors.protocol.SetUpdaterLocationKt.Dsl._create(this.toBuilder()).apply { block() }._build()

