package gatewayprotocol.v1;

import gatewayprotocol.v1.InitializationDeviceInfoKt;
import gatewayprotocol.v1.InitializationRequestOuterClass;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class InitializationDeviceInfoKtKt {
    /* renamed from: -initializeinitializationDeviceInfo, reason: not valid java name */
    public static final InitializationRequestOuterClass.InitializationDeviceInfo m122initializeinitializationDeviceInfo(ve.l block) {
        kotlin.jvm.internal.k.e(block, "block");
        InitializationDeviceInfoKt.Dsl.Companion companion = InitializationDeviceInfoKt.Dsl.Companion;
        InitializationRequestOuterClass.InitializationDeviceInfo.Builder newBuilder = InitializationRequestOuterClass.InitializationDeviceInfo.newBuilder();
        kotlin.jvm.internal.k.d(newBuilder, "newBuilder()");
        InitializationDeviceInfoKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final InitializationRequestOuterClass.InitializationDeviceInfo copy(InitializationRequestOuterClass.InitializationDeviceInfo initializationDeviceInfo, ve.l block) {
        kotlin.jvm.internal.k.e(initializationDeviceInfo, "<this>");
        kotlin.jvm.internal.k.e(block, "block");
        InitializationDeviceInfoKt.Dsl.Companion companion = InitializationDeviceInfoKt.Dsl.Companion;
        InitializationRequestOuterClass.InitializationDeviceInfo.Builder builder = initializationDeviceInfo.toBuilder();
        kotlin.jvm.internal.k.d(builder, "this.toBuilder()");
        InitializationDeviceInfoKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
