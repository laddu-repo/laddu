package com.google.protobuf;

import com.google.protobuf.DoubleValue;
import com.google.protobuf.DoubleValueKt;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class DoubleValueKtKt {
    /* renamed from: -initializedoubleValue, reason: not valid java name */
    public static final DoubleValue m9initializedoubleValue(ve.l block) {
        kotlin.jvm.internal.k.e(block, "block");
        DoubleValueKt.Dsl.Companion companion = DoubleValueKt.Dsl.Companion;
        DoubleValue.Builder newBuilder = DoubleValue.newBuilder();
        kotlin.jvm.internal.k.d(newBuilder, "newBuilder()");
        DoubleValueKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final DoubleValue copy(DoubleValue doubleValue, ve.l block) {
        kotlin.jvm.internal.k.e(doubleValue, "<this>");
        kotlin.jvm.internal.k.e(block, "block");
        DoubleValueKt.Dsl.Companion companion = DoubleValueKt.Dsl.Companion;
        DoubleValue.Builder builder = doubleValue.toBuilder();
        kotlin.jvm.internal.k.d(builder, "this.toBuilder()");
        DoubleValueKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
