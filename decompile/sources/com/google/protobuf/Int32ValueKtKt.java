package com.google.protobuf;

import com.google.protobuf.Int32Value;
import com.google.protobuf.Int32ValueKt;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class Int32ValueKtKt {
    /* renamed from: -initializeint32Value, reason: not valid java name */
    public static final Int32Value m17initializeint32Value(ve.l block) {
        kotlin.jvm.internal.k.e(block, "block");
        Int32ValueKt.Dsl.Companion companion = Int32ValueKt.Dsl.Companion;
        Int32Value.Builder newBuilder = Int32Value.newBuilder();
        kotlin.jvm.internal.k.d(newBuilder, "newBuilder()");
        Int32ValueKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final Int32Value copy(Int32Value int32Value, ve.l block) {
        kotlin.jvm.internal.k.e(int32Value, "<this>");
        kotlin.jvm.internal.k.e(block, "block");
        Int32ValueKt.Dsl.Companion companion = Int32ValueKt.Dsl.Companion;
        Int32Value.Builder builder = int32Value.toBuilder();
        kotlin.jvm.internal.k.d(builder, "this.toBuilder()");
        Int32ValueKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
