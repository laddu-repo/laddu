package gatewayprotocol.v1;

import gatewayprotocol.v1.PrivacyUpdateResponseKt;
import gatewayprotocol.v1.PrivacyUpdateResponseOuterClass;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class PrivacyUpdateResponseKtKt {
    /* renamed from: -initializeprivacyUpdateResponse, reason: not valid java name */
    public static final PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse m135initializeprivacyUpdateResponse(ve.l block) {
        kotlin.jvm.internal.k.e(block, "block");
        PrivacyUpdateResponseKt.Dsl.Companion companion = PrivacyUpdateResponseKt.Dsl.Companion;
        PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse.Builder newBuilder = PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse.newBuilder();
        kotlin.jvm.internal.k.d(newBuilder, "newBuilder()");
        PrivacyUpdateResponseKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse copy(PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse privacyUpdateResponse, ve.l block) {
        kotlin.jvm.internal.k.e(privacyUpdateResponse, "<this>");
        kotlin.jvm.internal.k.e(block, "block");
        PrivacyUpdateResponseKt.Dsl.Companion companion = PrivacyUpdateResponseKt.Dsl.Companion;
        PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse.Builder builder = privacyUpdateResponse.toBuilder();
        kotlin.jvm.internal.k.d(builder, "this.toBuilder()");
        PrivacyUpdateResponseKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
