package com.google.protobuf;

import com.google.protobuf.Struct;
import com.google.protobuf.StructKt;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class StructKtKt {
    /* renamed from: -initializestruct, reason: not valid java name */
    public static final Struct m25initializestruct(ve.l block) {
        kotlin.jvm.internal.k.e(block, "block");
        StructKt.Dsl.Companion companion = StructKt.Dsl.Companion;
        Struct.Builder newBuilder = Struct.newBuilder();
        kotlin.jvm.internal.k.d(newBuilder, "newBuilder()");
        StructKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final Struct copy(Struct struct, ve.l block) {
        kotlin.jvm.internal.k.e(struct, "<this>");
        kotlin.jvm.internal.k.e(block, "block");
        StructKt.Dsl.Companion companion = StructKt.Dsl.Companion;
        Struct.Builder builder = struct.toBuilder();
        kotlin.jvm.internal.k.d(builder, "this.toBuilder()");
        StructKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
