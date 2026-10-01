package gatewayprotocol.v1;

import gatewayprotocol.v1.CampaignStateKt;
import gatewayprotocol.v1.CampaignStateOuterClass;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class CampaignStateKtKt {
    /* renamed from: -initializecampaignState, reason: not valid java name */
    public static final CampaignStateOuterClass.CampaignState m103initializecampaignState(ve.l block) {
        kotlin.jvm.internal.k.e(block, "block");
        CampaignStateKt.Dsl.Companion companion = CampaignStateKt.Dsl.Companion;
        CampaignStateOuterClass.CampaignState.Builder newBuilder = CampaignStateOuterClass.CampaignState.newBuilder();
        kotlin.jvm.internal.k.d(newBuilder, "newBuilder()");
        CampaignStateKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final CampaignStateOuterClass.CampaignState copy(CampaignStateOuterClass.CampaignState campaignState, ve.l block) {
        kotlin.jvm.internal.k.e(campaignState, "<this>");
        kotlin.jvm.internal.k.e(block, "block");
        CampaignStateKt.Dsl.Companion companion = CampaignStateKt.Dsl.Companion;
        CampaignStateOuterClass.CampaignState.Builder builder = campaignState.toBuilder();
        kotlin.jvm.internal.k.d(builder, "this.toBuilder()");
        CampaignStateKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
