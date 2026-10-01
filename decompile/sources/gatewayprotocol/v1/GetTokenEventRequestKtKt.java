package gatewayprotocol.v1;

import gatewayprotocol.v1.GetTokenEventRequestKt;
import gatewayprotocol.v1.GetTokenEventRequestOuterClass;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class GetTokenEventRequestKtKt {
    /* renamed from: -initializegetTokenEventRequest, reason: not valid java name */
    public static final GetTokenEventRequestOuterClass.GetTokenEventRequest m117initializegetTokenEventRequest(ve.l block) {
        kotlin.jvm.internal.k.e(block, "block");
        GetTokenEventRequestKt.Dsl.Companion companion = GetTokenEventRequestKt.Dsl.Companion;
        GetTokenEventRequestOuterClass.GetTokenEventRequest.Builder newBuilder = GetTokenEventRequestOuterClass.GetTokenEventRequest.newBuilder();
        kotlin.jvm.internal.k.d(newBuilder, "newBuilder()");
        GetTokenEventRequestKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final GetTokenEventRequestOuterClass.GetTokenEventRequest copy(GetTokenEventRequestOuterClass.GetTokenEventRequest getTokenEventRequest, ve.l block) {
        kotlin.jvm.internal.k.e(getTokenEventRequest, "<this>");
        kotlin.jvm.internal.k.e(block, "block");
        GetTokenEventRequestKt.Dsl.Companion companion = GetTokenEventRequestKt.Dsl.Companion;
        GetTokenEventRequestOuterClass.GetTokenEventRequest.Builder builder = getTokenEventRequest.toBuilder();
        kotlin.jvm.internal.k.d(builder, "this.toBuilder()");
        GetTokenEventRequestKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
