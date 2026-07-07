package com.google.protobuf;

import com.google.protobuf.Empty;
import com.google.protobuf.EmptyKt;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class EmptyKtKt {
    /* renamed from: -initializeempty, reason: not valid java name */
    public static final Empty m11initializeempty(ve.l block) {
        kotlin.jvm.internal.k.e(block, "block");
        EmptyKt.Dsl.Companion companion = EmptyKt.Dsl.Companion;
        Empty.Builder newBuilder = Empty.newBuilder();
        kotlin.jvm.internal.k.d(newBuilder, "newBuilder()");
        EmptyKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final Empty copy(Empty empty, ve.l block) {
        kotlin.jvm.internal.k.e(empty, "<this>");
        kotlin.jvm.internal.k.e(block, "block");
        EmptyKt.Dsl.Companion companion = EmptyKt.Dsl.Companion;
        Empty.Builder builder = empty.toBuilder();
        kotlin.jvm.internal.k.d(builder, "this.toBuilder()");
        EmptyKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
