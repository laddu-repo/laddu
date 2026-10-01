package gatewayprotocol.v1;

import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import gatewayprotocol.v1.TransactionEventRequestKt;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class TransactionEventRequestKtKt {
    /* renamed from: -initializetransactionEventRequest, reason: not valid java name */
    public static final TransactionEventRequestOuterClass.TransactionEventRequest m148initializetransactionEventRequest(ve.l block) {
        kotlin.jvm.internal.k.e(block, "block");
        TransactionEventRequestKt.Dsl.Companion companion = TransactionEventRequestKt.Dsl.Companion;
        TransactionEventRequestOuterClass.TransactionEventRequest.Builder newBuilder = TransactionEventRequestOuterClass.TransactionEventRequest.newBuilder();
        kotlin.jvm.internal.k.d(newBuilder, "newBuilder()");
        TransactionEventRequestKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final TransactionEventRequestOuterClass.TransactionEventRequest copy(TransactionEventRequestOuterClass.TransactionEventRequest transactionEventRequest, ve.l block) {
        kotlin.jvm.internal.k.e(transactionEventRequest, "<this>");
        kotlin.jvm.internal.k.e(block, "block");
        TransactionEventRequestKt.Dsl.Companion companion = TransactionEventRequestKt.Dsl.Companion;
        TransactionEventRequestOuterClass.TransactionEventRequest.Builder builder = transactionEventRequest.toBuilder();
        kotlin.jvm.internal.k.d(builder, "this.toBuilder()");
        TransactionEventRequestKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }

    public static final DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfoOrNull(TransactionEventRequestOuterClass.TransactionEventRequestOrBuilder transactionEventRequestOrBuilder) {
        kotlin.jvm.internal.k.e(transactionEventRequestOrBuilder, "<this>");
        if (transactionEventRequestOrBuilder.hasDynamicDeviceInfo()) {
            return transactionEventRequestOrBuilder.getDynamicDeviceInfo();
        }
        return null;
    }

    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfoOrNull(TransactionEventRequestOuterClass.TransactionEventRequestOrBuilder transactionEventRequestOrBuilder) {
        kotlin.jvm.internal.k.e(transactionEventRequestOrBuilder, "<this>");
        if (transactionEventRequestOrBuilder.hasStaticDeviceInfo()) {
            return transactionEventRequestOrBuilder.getStaticDeviceInfo();
        }
        return null;
    }
}
