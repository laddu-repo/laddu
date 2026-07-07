package com.google.protobuf;

import com.google.protobuf.UInt32Value;
import com.google.protobuf.UInt32ValueKt;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class UInt32ValueKtKt {
    /* renamed from: -initializeuInt32Value, reason: not valid java name */
    public static final UInt32Value m28initializeuInt32Value(ve.l block) {
        kotlin.jvm.internal.k.e(block, "block");
        UInt32ValueKt.Dsl.Companion companion = UInt32ValueKt.Dsl.Companion;
        UInt32Value.Builder newBuilder = UInt32Value.newBuilder();
        kotlin.jvm.internal.k.d(newBuilder, "newBuilder()");
        UInt32ValueKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final UInt32Value copy(UInt32Value uInt32Value, ve.l block) {
        kotlin.jvm.internal.k.e(uInt32Value, "<this>");
        kotlin.jvm.internal.k.e(block, "block");
        UInt32ValueKt.Dsl.Companion companion = UInt32ValueKt.Dsl.Companion;
        UInt32Value.Builder builder = uInt32Value.toBuilder();
        kotlin.jvm.internal.k.d(builder, "this.toBuilder()");
        UInt32ValueKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
