package gatewayprotocol.v1;

import gatewayprotocol.v1.InitializationResponseOuterClass;
import gatewayprotocol.v1.PlacementKt;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class PlacementKtKt {
    /* renamed from: -initializeplacement, reason: not valid java name */
    public static final InitializationResponseOuterClass.Placement m133initializeplacement(ve.l block) {
        kotlin.jvm.internal.k.e(block, "block");
        PlacementKt.Dsl.Companion companion = PlacementKt.Dsl.Companion;
        InitializationResponseOuterClass.Placement.Builder newBuilder = InitializationResponseOuterClass.Placement.newBuilder();
        kotlin.jvm.internal.k.d(newBuilder, "newBuilder()");
        PlacementKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final InitializationResponseOuterClass.Placement copy(InitializationResponseOuterClass.Placement placement, ve.l block) {
        kotlin.jvm.internal.k.e(placement, "<this>");
        kotlin.jvm.internal.k.e(block, "block");
        PlacementKt.Dsl.Companion companion = PlacementKt.Dsl.Companion;
        InitializationResponseOuterClass.Placement.Builder builder = placement.toBuilder();
        kotlin.jvm.internal.k.d(builder, "this.toBuilder()");
        PlacementKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
