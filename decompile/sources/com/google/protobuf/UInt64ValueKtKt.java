package com.google.protobuf;

import com.google.protobuf.UInt64Value;
import com.google.protobuf.UInt64ValueKt;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class UInt64ValueKtKt {
    /* renamed from: -initializeuInt64Value, reason: not valid java name */
    public static final UInt64Value m29initializeuInt64Value(ve.l block) {
        kotlin.jvm.internal.k.e(block, "block");
        UInt64ValueKt.Dsl.Companion companion = UInt64ValueKt.Dsl.Companion;
        UInt64Value.Builder newBuilder = UInt64Value.newBuilder();
        kotlin.jvm.internal.k.d(newBuilder, "newBuilder()");
        UInt64ValueKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final UInt64Value copy(UInt64Value uInt64Value, ve.l block) {
        kotlin.jvm.internal.k.e(uInt64Value, "<this>");
        kotlin.jvm.internal.k.e(block, "block");
        UInt64ValueKt.Dsl.Companion companion = UInt64ValueKt.Dsl.Companion;
        UInt64Value.Builder builder = uInt64Value.toBuilder();
        kotlin.jvm.internal.k.d(builder, "this.toBuilder()");
        UInt64ValueKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
