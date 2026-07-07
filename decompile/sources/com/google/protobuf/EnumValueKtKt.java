package com.google.protobuf;

import com.google.protobuf.EnumValue;
import com.google.protobuf.EnumValueKt;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class EnumValueKtKt {
    /* renamed from: -initializeenumValue, reason: not valid java name */
    public static final EnumValue m13initializeenumValue(ve.l block) {
        kotlin.jvm.internal.k.e(block, "block");
        EnumValueKt.Dsl.Companion companion = EnumValueKt.Dsl.Companion;
        EnumValue.Builder newBuilder = EnumValue.newBuilder();
        kotlin.jvm.internal.k.d(newBuilder, "newBuilder()");
        EnumValueKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final EnumValue copy(EnumValue enumValue, ve.l block) {
        kotlin.jvm.internal.k.e(enumValue, "<this>");
        kotlin.jvm.internal.k.e(block, "block");
        EnumValueKt.Dsl.Companion companion = EnumValueKt.Dsl.Companion;
        EnumValue.Builder builder = enumValue.toBuilder();
        kotlin.jvm.internal.k.d(builder, "this.toBuilder()");
        EnumValueKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
