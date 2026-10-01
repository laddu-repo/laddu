package gatewayprotocol.v1;

import gatewayprotocol.v1.PrivacyUpdateRequestKt;
import gatewayprotocol.v1.PrivacyUpdateRequestOuterClass;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class PrivacyUpdateRequestKtKt {
    /* renamed from: -initializeprivacyUpdateRequest, reason: not valid java name */
    public static final PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest m134initializeprivacyUpdateRequest(ve.l block) {
        kotlin.jvm.internal.k.e(block, "block");
        PrivacyUpdateRequestKt.Dsl.Companion companion = PrivacyUpdateRequestKt.Dsl.Companion;
        PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.Builder newBuilder = PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.newBuilder();
        kotlin.jvm.internal.k.d(newBuilder, "newBuilder()");
        PrivacyUpdateRequestKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest copy(PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest privacyUpdateRequest, ve.l block) {
        kotlin.jvm.internal.k.e(privacyUpdateRequest, "<this>");
        kotlin.jvm.internal.k.e(block, "block");
        PrivacyUpdateRequestKt.Dsl.Companion companion = PrivacyUpdateRequestKt.Dsl.Companion;
        PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.Builder builder = privacyUpdateRequest.toBuilder();
        kotlin.jvm.internal.k.d(builder, "this.toBuilder()");
        PrivacyUpdateRequestKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
