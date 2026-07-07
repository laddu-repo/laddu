package com.google.protobuf;

import com.google.protobuf.BoolValue;
import com.google.protobuf.BoolValueKt;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class BoolValueKtKt {
    /* renamed from: -initializeboolValue, reason: not valid java name */
    public static final BoolValue m7initializeboolValue(ve.l block) {
        kotlin.jvm.internal.k.e(block, "block");
        BoolValueKt.Dsl.Companion companion = BoolValueKt.Dsl.Companion;
        BoolValue.Builder newBuilder = BoolValue.newBuilder();
        kotlin.jvm.internal.k.d(newBuilder, "newBuilder()");
        BoolValueKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final BoolValue copy(BoolValue boolValue, ve.l block) {
        kotlin.jvm.internal.k.e(boolValue, "<this>");
        kotlin.jvm.internal.k.e(block, "block");
        BoolValueKt.Dsl.Companion companion = BoolValueKt.Dsl.Companion;
        BoolValue.Builder builder = boolValue.toBuilder();
        kotlin.jvm.internal.k.d(builder, "this.toBuilder()");
        BoolValueKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
