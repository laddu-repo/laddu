package gatewayprotocol.v1;

import gatewayprotocol.v1.DynamicDeviceInfoKt;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class DynamicDeviceInfoKtKt {
    /* renamed from: -initializedynamicDeviceInfo, reason: not valid java name */
    public static final DynamicDeviceInfoOuterClass.DynamicDeviceInfo m114initializedynamicDeviceInfo(ve.l block) {
        kotlin.jvm.internal.k.e(block, "block");
        DynamicDeviceInfoKt.Dsl.Companion companion = DynamicDeviceInfoKt.Dsl.Companion;
        DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder newBuilder = DynamicDeviceInfoOuterClass.DynamicDeviceInfo.newBuilder();
        kotlin.jvm.internal.k.d(newBuilder, "newBuilder()");
        DynamicDeviceInfoKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final DynamicDeviceInfoOuterClass.DynamicDeviceInfo copy(DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo, ve.l block) {
        kotlin.jvm.internal.k.e(dynamicDeviceInfo, "<this>");
        kotlin.jvm.internal.k.e(block, "block");
        DynamicDeviceInfoKt.Dsl.Companion companion = DynamicDeviceInfoKt.Dsl.Companion;
        DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder builder = dynamicDeviceInfo.toBuilder();
        kotlin.jvm.internal.k.d(builder, "this.toBuilder()");
        DynamicDeviceInfoKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }

    public static final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android getAndroidOrNull(DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder dynamicDeviceInfoOrBuilder) {
        kotlin.jvm.internal.k.e(dynamicDeviceInfoOrBuilder, "<this>");
        if (dynamicDeviceInfoOrBuilder.hasAndroid()) {
            return dynamicDeviceInfoOrBuilder.getAndroid();
        }
        return null;
    }

    public static final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios getIosOrNull(DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder dynamicDeviceInfoOrBuilder) {
        kotlin.jvm.internal.k.e(dynamicDeviceInfoOrBuilder, "<this>");
        if (dynamicDeviceInfoOrBuilder.hasIos()) {
            return dynamicDeviceInfoOrBuilder.getIos();
        }
        return null;
    }

    public static final NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports getNetworkCapabilityTransportsOrNull(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder androidOrBuilder) {
        kotlin.jvm.internal.k.e(androidOrBuilder, "<this>");
        if (androidOrBuilder.hasNetworkCapabilityTransports()) {
            return androidOrBuilder.getNetworkCapabilityTransports();
        }
        return null;
    }

    public static final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android copy(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android android2, ve.l block) {
        kotlin.jvm.internal.k.e(android2, "<this>");
        kotlin.jvm.internal.k.e(block, "block");
        DynamicDeviceInfoKt.AndroidKt.Dsl.Companion companion = DynamicDeviceInfoKt.AndroidKt.Dsl.Companion;
        DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder builder = android2.toBuilder();
        kotlin.jvm.internal.k.d(builder, "this.toBuilder()");
        DynamicDeviceInfoKt.AndroidKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }

    public static final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios copy(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios ios, ve.l block) {
        kotlin.jvm.internal.k.e(ios, "<this>");
        kotlin.jvm.internal.k.e(block, "block");
        DynamicDeviceInfoKt.IosKt.Dsl.Companion companion = DynamicDeviceInfoKt.IosKt.Dsl.Companion;
        DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder builder = ios.toBuilder();
        kotlin.jvm.internal.k.d(builder, "this.toBuilder()");
        DynamicDeviceInfoKt.IosKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
