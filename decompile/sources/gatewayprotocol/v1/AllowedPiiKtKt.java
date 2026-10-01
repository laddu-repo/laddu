package gatewayprotocol.v1;

import gatewayprotocol.v1.AllowedPiiKt;
import gatewayprotocol.v1.AllowedPiiOuterClass;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class AllowedPiiKtKt {
    /* renamed from: -initializeallowedPii, reason: not valid java name */
    public static final AllowedPiiOuterClass.AllowedPii m97initializeallowedPii(ve.l block) {
        kotlin.jvm.internal.k.e(block, "block");
        AllowedPiiKt.Dsl.Companion companion = AllowedPiiKt.Dsl.Companion;
        AllowedPiiOuterClass.AllowedPii.Builder newBuilder = AllowedPiiOuterClass.AllowedPii.newBuilder();
        kotlin.jvm.internal.k.d(newBuilder, "newBuilder()");
        AllowedPiiKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final AllowedPiiOuterClass.AllowedPii copy(AllowedPiiOuterClass.AllowedPii allowedPii, ve.l block) {
        kotlin.jvm.internal.k.e(allowedPii, "<this>");
        kotlin.jvm.internal.k.e(block, "block");
        AllowedPiiKt.Dsl.Companion companion = AllowedPiiKt.Dsl.Companion;
        AllowedPiiOuterClass.AllowedPii.Builder builder = allowedPii.toBuilder();
        kotlin.jvm.internal.k.d(builder, "this.toBuilder()");
        AllowedPiiKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
