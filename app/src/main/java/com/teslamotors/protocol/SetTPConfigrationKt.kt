// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: proto/VCSECv3.10.14.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.teslamotors.protocol;

@kotlin.jvm.JvmName("-initializesetTPConfigration")
public inline fun setTPConfigration(block: com.teslamotors.protocol.SetTPConfigrationKt.Dsl.() -> kotlin.Unit): com.teslamotors.protocol.VCSEC.SetTPConfigration =
  com.teslamotors.protocol.SetTPConfigrationKt.Dsl._create(com.teslamotors.protocol.VCSEC.SetTPConfigration.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `VCSEC.SetTPConfigration`
 */
public object SetTPConfigrationKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.teslamotors.protocol.VCSEC.SetTPConfigration.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.teslamotors.protocol.VCSEC.SetTPConfigration.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.teslamotors.protocol.VCSEC.SetTPConfigration = _builder.build()

    /**
     * `.VCSEC.TPStationaryConfig stationaryConfig = 1;`
     */
    public var stationaryConfig: com.teslamotors.protocol.VCSEC.TPStationaryConfig
      @JvmName("getStationaryConfig")
      get() = _builder.getStationaryConfig()
      @JvmName("setStationaryConfig")
      set(value) {
        _builder.setStationaryConfig(value)
      }
    /**
     * `.VCSEC.TPStationaryConfig stationaryConfig = 1;`
     */
    public fun clearStationaryConfig() {
      _builder.clearStationaryConfig()
    }
    /**
     * `.VCSEC.TPStationaryConfig stationaryConfig = 1;`
     * @return Whether the stationaryConfig field is set.
     */
    public fun hasStationaryConfig(): kotlin.Boolean {
      return _builder.hasStationaryConfig()
    }

    /**
     * `.VCSEC.TPMotionConfig motionConfig = 2;`
     */
    public var motionConfig: com.teslamotors.protocol.VCSEC.TPMotionConfig
      @JvmName("getMotionConfig")
      get() = _builder.getMotionConfig()
      @JvmName("setMotionConfig")
      set(value) {
        _builder.setMotionConfig(value)
      }
    /**
     * `.VCSEC.TPMotionConfig motionConfig = 2;`
     */
    public fun clearMotionConfig() {
      _builder.clearMotionConfig()
    }
    /**
     * `.VCSEC.TPMotionConfig motionConfig = 2;`
     * @return Whether the motionConfig field is set.
     */
    public fun hasMotionConfig(): kotlin.Boolean {
      return _builder.hasMotionConfig()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.teslamotors.protocol.VCSEC.SetTPConfigration.copy(block: com.teslamotors.protocol.SetTPConfigrationKt.Dsl.() -> kotlin.Unit): com.teslamotors.protocol.VCSEC.SetTPConfigration =
  com.teslamotors.protocol.SetTPConfigrationKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val com.teslamotors.protocol.VCSEC.SetTPConfigrationOrBuilder.stationaryConfigOrNull: com.teslamotors.protocol.VCSEC.TPStationaryConfig?
  get() = if (hasStationaryConfig()) getStationaryConfig() else null

public val com.teslamotors.protocol.VCSEC.SetTPConfigrationOrBuilder.motionConfigOrNull: com.teslamotors.protocol.VCSEC.TPMotionConfig?
  get() = if (hasMotionConfig()) getMotionConfig() else null

