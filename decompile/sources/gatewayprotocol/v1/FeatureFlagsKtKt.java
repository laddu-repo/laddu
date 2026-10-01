package gatewayprotocol.v1;

import gatewayprotocol.v1.FeatureFlagsKt;
import gatewayprotocol.v1.NativeConfigurationOuterClass;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class FeatureFlagsKtKt {
    /* renamed from: -initializefeatureFlags, reason: not valid java name */
    public static final NativeConfigurationOuterClass.FeatureFlags m116initializefeatureFlags(ve.l block) {
        kotlin.jvm.internal.k.e(block, "block");
        FeatureFlagsKt.Dsl.Companion companion = FeatureFlagsKt.Dsl.Companion;
        NativeConfigurationOuterClass.FeatureFlags.Builder newBuilder = NativeConfigurationOuterClass.FeatureFlags.newBuilder();
        kotlin.jvm.internal.k.d(newBuilder, "newBuilder()");
        FeatureFlagsKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final NativeConfigurationOuterClass.FeatureFlags copy(NativeConfigurationOuterClass.FeatureFlags featureFlags, ve.l block) {
        kotlin.jvm.internal.k.e(featureFlags, "<this>");
        kotlin.jvm.internal.k.e(block, "block");
        FeatureFlagsKt.Dsl.Companion companion = FeatureFlagsKt.Dsl.Companion;
        NativeConfigurationOuterClass.FeatureFlags.Builder builder = featureFlags.toBuilder();
        kotlin.jvm.internal.k.d(builder, "this.toBuilder()");
        FeatureFlagsKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
