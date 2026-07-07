package gatewayprotocol.v1;

import gatewayprotocol.v1.InitializationResponseOuterClass;
import gatewayprotocol.v1.RequestUrlOverrideKt;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class RequestUrlOverrideKtKt {
    /* renamed from: -initializerequestUrlOverride, reason: not valid java name */
    public static final InitializationResponseOuterClass.RequestUrlOverride m139initializerequestUrlOverride(ve.l block) {
        kotlin.jvm.internal.k.e(block, "block");
        RequestUrlOverrideKt.Dsl.Companion companion = RequestUrlOverrideKt.Dsl.Companion;
        InitializationResponseOuterClass.RequestUrlOverride.Builder newBuilder = InitializationResponseOuterClass.RequestUrlOverride.newBuilder();
        kotlin.jvm.internal.k.d(newBuilder, "newBuilder()");
        RequestUrlOverrideKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final InitializationResponseOuterClass.RequestUrlOverride copy(InitializationResponseOuterClass.RequestUrlOverride requestUrlOverride, ve.l block) {
        kotlin.jvm.internal.k.e(requestUrlOverride, "<this>");
        kotlin.jvm.internal.k.e(block, "block");
        RequestUrlOverrideKt.Dsl.Companion companion = RequestUrlOverrideKt.Dsl.Companion;
        InitializationResponseOuterClass.RequestUrlOverride.Builder builder = requestUrlOverride.toBuilder();
        kotlin.jvm.internal.k.d(builder, "this.toBuilder()");
        RequestUrlOverrideKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
