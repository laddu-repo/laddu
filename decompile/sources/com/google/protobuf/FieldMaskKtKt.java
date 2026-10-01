package com.google.protobuf;

import com.google.protobuf.FieldMask;
import com.google.protobuf.FieldMaskKt;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class FieldMaskKtKt {
    /* renamed from: -initializefieldMask, reason: not valid java name */
    public static final FieldMask m15initializefieldMask(ve.l block) {
        kotlin.jvm.internal.k.e(block, "block");
        FieldMaskKt.Dsl.Companion companion = FieldMaskKt.Dsl.Companion;
        FieldMask.Builder newBuilder = FieldMask.newBuilder();
        kotlin.jvm.internal.k.d(newBuilder, "newBuilder()");
        FieldMaskKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final FieldMask copy(FieldMask fieldMask, ve.l block) {
        kotlin.jvm.internal.k.e(fieldMask, "<this>");
        kotlin.jvm.internal.k.e(block, "block");
        FieldMaskKt.Dsl.Companion companion = FieldMaskKt.Dsl.Companion;
        FieldMask.Builder builder = fieldMask.toBuilder();
        kotlin.jvm.internal.k.d(builder, "this.toBuilder()");
        FieldMaskKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
