package gatewayprotocol.v1;

import gatewayprotocol.v1.AdRequestKt;
import gatewayprotocol.v1.AdRequestOuterClass;
import gatewayprotocol.v1.CampaignStateOuterClass;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.MediationInfoOuterClass;
import gatewayprotocol.v1.SessionCountersOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class AdRequestKtKt {
    /* renamed from: -initializeadRequest, reason: not valid java name */
    public static final AdRequestOuterClass.AdRequest m95initializeadRequest(ve.l block) {
        kotlin.jvm.internal.k.e(block, "block");
        AdRequestKt.Dsl.Companion companion = AdRequestKt.Dsl.Companion;
        AdRequestOuterClass.AdRequest.Builder newBuilder = AdRequestOuterClass.AdRequest.newBuilder();
        kotlin.jvm.internal.k.d(newBuilder, "newBuilder()");
        AdRequestKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final AdRequestOuterClass.AdRequest copy(AdRequestOuterClass.AdRequest adRequest, ve.l block) {
        kotlin.jvm.internal.k.e(adRequest, "<this>");
        kotlin.jvm.internal.k.e(block, "block");
        AdRequestKt.Dsl.Companion companion = AdRequestKt.Dsl.Companion;
        AdRequestOuterClass.AdRequest.Builder builder = adRequest.toBuilder();
        kotlin.jvm.internal.k.d(builder, "this.toBuilder()");
        AdRequestKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }

    public static final AdRequestOuterClass.BannerSize getBannerSizeOrNull(AdRequestOuterClass.AdRequestOrBuilder adRequestOrBuilder) {
        kotlin.jvm.internal.k.e(adRequestOrBuilder, "<this>");
        if (adRequestOrBuilder.hasBannerSize()) {
            return adRequestOrBuilder.getBannerSize();
        }
        return null;
    }

    public static final CampaignStateOuterClass.CampaignState getCampaignStateOrNull(AdRequestOuterClass.AdRequestOrBuilder adRequestOrBuilder) {
        kotlin.jvm.internal.k.e(adRequestOrBuilder, "<this>");
        if (adRequestOrBuilder.hasCampaignState()) {
            return adRequestOrBuilder.getCampaignState();
        }
        return null;
    }

    public static final DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfoOrNull(AdRequestOuterClass.AdRequestOrBuilder adRequestOrBuilder) {
        kotlin.jvm.internal.k.e(adRequestOrBuilder, "<this>");
        if (adRequestOrBuilder.hasDynamicDeviceInfo()) {
            return adRequestOrBuilder.getDynamicDeviceInfo();
        }
        return null;
    }

    public static final MediationInfoOuterClass.MediationInfo getMediationInfoOrNull(AdRequestOuterClass.AdRequestOrBuilder adRequestOrBuilder) {
        kotlin.jvm.internal.k.e(adRequestOrBuilder, "<this>");
        if (adRequestOrBuilder.hasMediationInfo()) {
            return adRequestOrBuilder.getMediationInfo();
        }
        return null;
    }

    public static final SessionCountersOuterClass.SessionCounters getSessionCountersOrNull(AdRequestOuterClass.AdRequestOrBuilder adRequestOrBuilder) {
        kotlin.jvm.internal.k.e(adRequestOrBuilder, "<this>");
        if (adRequestOrBuilder.hasSessionCounters()) {
            return adRequestOrBuilder.getSessionCounters();
        }
        return null;
    }

    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfoOrNull(AdRequestOuterClass.AdRequestOrBuilder adRequestOrBuilder) {
        kotlin.jvm.internal.k.e(adRequestOrBuilder, "<this>");
        if (adRequestOrBuilder.hasStaticDeviceInfo()) {
            return adRequestOrBuilder.getStaticDeviceInfo();
        }
        return null;
    }
}
