package gatewayprotocol.v1;

import gatewayprotocol.v1.AdDataRefreshResponseKt;
import gatewayprotocol.v1.AdDataRefreshResponseOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class AdDataRefreshResponseKtKt {
    /* renamed from: -initializeadDataRefreshResponse, reason: not valid java name */
    public static final AdDataRefreshResponseOuterClass.AdDataRefreshResponse m91initializeadDataRefreshResponse(ve.l block) {
        kotlin.jvm.internal.k.e(block, "block");
        AdDataRefreshResponseKt.Dsl.Companion companion = AdDataRefreshResponseKt.Dsl.Companion;
        AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder newBuilder = AdDataRefreshResponseOuterClass.AdDataRefreshResponse.newBuilder();
        kotlin.jvm.internal.k.d(newBuilder, "newBuilder()");
        AdDataRefreshResponseKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final AdDataRefreshResponseOuterClass.AdDataRefreshResponse copy(AdDataRefreshResponseOuterClass.AdDataRefreshResponse adDataRefreshResponse, ve.l block) {
        kotlin.jvm.internal.k.e(adDataRefreshResponse, "<this>");
        kotlin.jvm.internal.k.e(block, "block");
        AdDataRefreshResponseKt.Dsl.Companion companion = AdDataRefreshResponseKt.Dsl.Companion;
        AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder builder = adDataRefreshResponse.toBuilder();
        kotlin.jvm.internal.k.d(builder, "this.toBuilder()");
        AdDataRefreshResponseKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }

    public static final ErrorOuterClass.Error getErrorOrNull(AdDataRefreshResponseOuterClass.AdDataRefreshResponseOrBuilder adDataRefreshResponseOrBuilder) {
        kotlin.jvm.internal.k.e(adDataRefreshResponseOrBuilder, "<this>");
        if (adDataRefreshResponseOrBuilder.hasError()) {
            return adDataRefreshResponseOrBuilder.getError();
        }
        return null;
    }
}
