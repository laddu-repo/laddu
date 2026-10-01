package gatewayprotocol.v1;

import gatewayprotocol.v1.DeveloperConsentKt;
import gatewayprotocol.v1.DeveloperConsentOuterClass;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class DeveloperConsentKtKt {
    /* renamed from: -initializedeveloperConsent, reason: not valid java name */
    public static final DeveloperConsentOuterClass.DeveloperConsent m106initializedeveloperConsent(ve.l block) {
        kotlin.jvm.internal.k.e(block, "block");
        DeveloperConsentKt.Dsl.Companion companion = DeveloperConsentKt.Dsl.Companion;
        DeveloperConsentOuterClass.DeveloperConsent.Builder newBuilder = DeveloperConsentOuterClass.DeveloperConsent.newBuilder();
        kotlin.jvm.internal.k.d(newBuilder, "newBuilder()");
        DeveloperConsentKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final DeveloperConsentOuterClass.DeveloperConsent copy(DeveloperConsentOuterClass.DeveloperConsent developerConsent, ve.l block) {
        kotlin.jvm.internal.k.e(developerConsent, "<this>");
        kotlin.jvm.internal.k.e(block, "block");
        DeveloperConsentKt.Dsl.Companion companion = DeveloperConsentKt.Dsl.Companion;
        DeveloperConsentOuterClass.DeveloperConsent.Builder builder = developerConsent.toBuilder();
        kotlin.jvm.internal.k.d(builder, "this.toBuilder()");
        DeveloperConsentKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
