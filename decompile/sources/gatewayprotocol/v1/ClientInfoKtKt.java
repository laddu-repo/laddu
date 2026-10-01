package gatewayprotocol.v1;

import gatewayprotocol.v1.ClientInfoKt;
import gatewayprotocol.v1.ClientInfoOuterClass;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class ClientInfoKtKt {
    /* renamed from: -initializeclientInfo, reason: not valid java name */
    public static final ClientInfoOuterClass.ClientInfo m104initializeclientInfo(ve.l block) {
        kotlin.jvm.internal.k.e(block, "block");
        ClientInfoKt.Dsl.Companion companion = ClientInfoKt.Dsl.Companion;
        ClientInfoOuterClass.ClientInfo.Builder newBuilder = ClientInfoOuterClass.ClientInfo.newBuilder();
        kotlin.jvm.internal.k.d(newBuilder, "newBuilder()");
        ClientInfoKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final ClientInfoOuterClass.ClientInfo copy(ClientInfoOuterClass.ClientInfo clientInfo, ve.l block) {
        kotlin.jvm.internal.k.e(clientInfo, "<this>");
        kotlin.jvm.internal.k.e(block, "block");
        ClientInfoKt.Dsl.Companion companion = ClientInfoKt.Dsl.Companion;
        ClientInfoOuterClass.ClientInfo.Builder builder = clientInfo.toBuilder();
        kotlin.jvm.internal.k.d(builder, "this.toBuilder()");
        ClientInfoKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
