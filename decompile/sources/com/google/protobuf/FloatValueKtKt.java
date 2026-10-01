package com.google.protobuf;

import com.google.protobuf.FloatValue;
import com.google.protobuf.FloatValueKt;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class FloatValueKtKt {
    /* renamed from: -initializefloatValue, reason: not valid java name */
    public static final FloatValue m16initializefloatValue(ve.l block) {
        kotlin.jvm.internal.k.e(block, "block");
        FloatValueKt.Dsl.Companion companion = FloatValueKt.Dsl.Companion;
        FloatValue.Builder newBuilder = FloatValue.newBuilder();
        kotlin.jvm.internal.k.d(newBuilder, "newBuilder()");
        FloatValueKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final FloatValue copy(FloatValue floatValue, ve.l block) {
        kotlin.jvm.internal.k.e(floatValue, "<this>");
        kotlin.jvm.internal.k.e(block, "block");
        FloatValueKt.Dsl.Companion companion = FloatValueKt.Dsl.Companion;
        FloatValue.Builder builder = floatValue.toBuilder();
        kotlin.jvm.internal.k.d(builder, "this.toBuilder()");
        FloatValueKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
