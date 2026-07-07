package com.google.protobuf;

import com.google.protobuf.Int64Value;
import com.google.protobuf.Int64ValueKt;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class Int64ValueKtKt {
    /* renamed from: -initializeint64Value, reason: not valid java name */
    public static final Int64Value m18initializeint64Value(ve.l block) {
        kotlin.jvm.internal.k.e(block, "block");
        Int64ValueKt.Dsl.Companion companion = Int64ValueKt.Dsl.Companion;
        Int64Value.Builder newBuilder = Int64Value.newBuilder();
        kotlin.jvm.internal.k.d(newBuilder, "newBuilder()");
        Int64ValueKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final Int64Value copy(Int64Value int64Value, ve.l block) {
        kotlin.jvm.internal.k.e(int64Value, "<this>");
        kotlin.jvm.internal.k.e(block, "block");
        Int64ValueKt.Dsl.Companion companion = Int64ValueKt.Dsl.Companion;
        Int64Value.Builder builder = int64Value.toBuilder();
        kotlin.jvm.internal.k.d(builder, "this.toBuilder()");
        Int64ValueKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
