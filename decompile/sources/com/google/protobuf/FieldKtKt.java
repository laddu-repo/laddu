package com.google.protobuf;

import com.google.protobuf.Field;
import com.google.protobuf.FieldKt;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class FieldKtKt {
    /* renamed from: -initializefield, reason: not valid java name */
    public static final Field m14initializefield(ve.l block) {
        kotlin.jvm.internal.k.e(block, "block");
        FieldKt.Dsl.Companion companion = FieldKt.Dsl.Companion;
        Field.Builder newBuilder = Field.newBuilder();
        kotlin.jvm.internal.k.d(newBuilder, "newBuilder()");
        FieldKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final Field copy(Field field, ve.l block) {
        kotlin.jvm.internal.k.e(field, "<this>");
        kotlin.jvm.internal.k.e(block, "block");
        FieldKt.Dsl.Companion companion = FieldKt.Dsl.Companion;
        Field.Builder builder = field.toBuilder();
        kotlin.jvm.internal.k.d(builder, "this.toBuilder()");
        FieldKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
