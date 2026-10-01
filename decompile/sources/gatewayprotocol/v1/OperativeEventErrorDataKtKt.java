package gatewayprotocol.v1;

import gatewayprotocol.v1.OperativeEventErrorDataKt;
import gatewayprotocol.v1.OperativeEventRequestOuterClass;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class OperativeEventErrorDataKtKt {
    /* renamed from: -initializeoperativeEventErrorData, reason: not valid java name */
    public static final OperativeEventRequestOuterClass.OperativeEventErrorData m130initializeoperativeEventErrorData(ve.l block) {
        kotlin.jvm.internal.k.e(block, "block");
        OperativeEventErrorDataKt.Dsl.Companion companion = OperativeEventErrorDataKt.Dsl.Companion;
        OperativeEventRequestOuterClass.OperativeEventErrorData.Builder newBuilder = OperativeEventRequestOuterClass.OperativeEventErrorData.newBuilder();
        kotlin.jvm.internal.k.d(newBuilder, "newBuilder()");
        OperativeEventErrorDataKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final OperativeEventRequestOuterClass.OperativeEventErrorData copy(OperativeEventRequestOuterClass.OperativeEventErrorData operativeEventErrorData, ve.l block) {
        kotlin.jvm.internal.k.e(operativeEventErrorData, "<this>");
        kotlin.jvm.internal.k.e(block, "block");
        OperativeEventErrorDataKt.Dsl.Companion companion = OperativeEventErrorDataKt.Dsl.Companion;
        OperativeEventRequestOuterClass.OperativeEventErrorData.Builder builder = operativeEventErrorData.toBuilder();
        kotlin.jvm.internal.k.d(builder, "this.toBuilder()");
        OperativeEventErrorDataKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
