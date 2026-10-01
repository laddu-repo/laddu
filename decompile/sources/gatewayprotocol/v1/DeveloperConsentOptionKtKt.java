package gatewayprotocol.v1;

import gatewayprotocol.v1.DeveloperConsentOptionKt;
import gatewayprotocol.v1.DeveloperConsentOuterClass;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class DeveloperConsentOptionKtKt {
    /* renamed from: -initializedeveloperConsentOption, reason: not valid java name */
    public static final DeveloperConsentOuterClass.DeveloperConsentOption m107initializedeveloperConsentOption(ve.l block) {
        kotlin.jvm.internal.k.e(block, "block");
        DeveloperConsentOptionKt.Dsl.Companion companion = DeveloperConsentOptionKt.Dsl.Companion;
        DeveloperConsentOuterClass.DeveloperConsentOption.Builder newBuilder = DeveloperConsentOuterClass.DeveloperConsentOption.newBuilder();
        kotlin.jvm.internal.k.d(newBuilder, "newBuilder()");
        DeveloperConsentOptionKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final DeveloperConsentOuterClass.DeveloperConsentOption copy(DeveloperConsentOuterClass.DeveloperConsentOption developerConsentOption, ve.l block) {
        kotlin.jvm.internal.k.e(developerConsentOption, "<this>");
        kotlin.jvm.internal.k.e(block, "block");
        DeveloperConsentOptionKt.Dsl.Companion companion = DeveloperConsentOptionKt.Dsl.Companion;
        DeveloperConsentOuterClass.DeveloperConsentOption.Builder builder = developerConsentOption.toBuilder();
        kotlin.jvm.internal.k.d(builder, "this.toBuilder()");
        DeveloperConsentOptionKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
