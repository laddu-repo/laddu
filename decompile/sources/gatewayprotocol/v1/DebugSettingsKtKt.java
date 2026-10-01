package gatewayprotocol.v1;

import gatewayprotocol.v1.DebugSettingsKt;
import gatewayprotocol.v1.NativeConfigurationOuterClass;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class DebugSettingsKtKt {
    /* renamed from: -initializedebugSettings, reason: not valid java name */
    public static final NativeConfigurationOuterClass.DebugSettings m105initializedebugSettings(ve.l block) {
        kotlin.jvm.internal.k.e(block, "block");
        DebugSettingsKt.Dsl.Companion companion = DebugSettingsKt.Dsl.Companion;
        NativeConfigurationOuterClass.DebugSettings.Builder newBuilder = NativeConfigurationOuterClass.DebugSettings.newBuilder();
        kotlin.jvm.internal.k.d(newBuilder, "newBuilder()");
        DebugSettingsKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final NativeConfigurationOuterClass.DebugSettings copy(NativeConfigurationOuterClass.DebugSettings debugSettings, ve.l block) {
        kotlin.jvm.internal.k.e(debugSettings, "<this>");
        kotlin.jvm.internal.k.e(block, "block");
        DebugSettingsKt.Dsl.Companion companion = DebugSettingsKt.Dsl.Companion;
        NativeConfigurationOuterClass.DebugSettings.Builder builder = debugSettings.toBuilder();
        kotlin.jvm.internal.k.d(builder, "this.toBuilder()");
        DebugSettingsKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
