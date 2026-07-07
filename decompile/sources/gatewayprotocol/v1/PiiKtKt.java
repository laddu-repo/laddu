package gatewayprotocol.v1;

import gatewayprotocol.v1.PiiKt;
import gatewayprotocol.v1.PiiOuterClass;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class PiiKtKt {
    /* renamed from: -initializepii, reason: not valid java name */
    public static final PiiOuterClass.Pii m132initializepii(ve.l block) {
        kotlin.jvm.internal.k.e(block, "block");
        PiiKt.Dsl.Companion companion = PiiKt.Dsl.Companion;
        PiiOuterClass.Pii.Builder newBuilder = PiiOuterClass.Pii.newBuilder();
        kotlin.jvm.internal.k.d(newBuilder, "newBuilder()");
        PiiKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final PiiOuterClass.Pii copy(PiiOuterClass.Pii pii, ve.l block) {
        kotlin.jvm.internal.k.e(pii, "<this>");
        kotlin.jvm.internal.k.e(block, "block");
        PiiKt.Dsl.Companion companion = PiiKt.Dsl.Companion;
        PiiOuterClass.Pii.Builder builder = pii.toBuilder();
        kotlin.jvm.internal.k.d(builder, "this.toBuilder()");
        PiiKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
