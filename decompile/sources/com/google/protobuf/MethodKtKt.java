package com.google.protobuf;

import com.google.protobuf.Method;
import com.google.protobuf.MethodKt;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class MethodKtKt {
    /* renamed from: -initializemethod, reason: not valid java name */
    public static final Method m20initializemethod(ve.l block) {
        kotlin.jvm.internal.k.e(block, "block");
        MethodKt.Dsl.Companion companion = MethodKt.Dsl.Companion;
        Method.Builder newBuilder = Method.newBuilder();
        kotlin.jvm.internal.k.d(newBuilder, "newBuilder()");
        MethodKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final Method copy(Method method, ve.l block) {
        kotlin.jvm.internal.k.e(method, "<this>");
        kotlin.jvm.internal.k.e(block, "block");
        MethodKt.Dsl.Companion companion = MethodKt.Dsl.Companion;
        Method.Builder builder = method.toBuilder();
        kotlin.jvm.internal.k.d(builder, "this.toBuilder()");
        MethodKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
