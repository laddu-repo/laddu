package com.google.protobuf;

import com.google.protobuf.Enum;
import com.google.protobuf.EnumKt;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class EnumKtKt {
    /* renamed from: -initializeenum, reason: not valid java name */
    public static final Enum m12initializeenum(ve.l block) {
        kotlin.jvm.internal.k.e(block, "block");
        EnumKt.Dsl.Companion companion = EnumKt.Dsl.Companion;
        Enum.Builder newBuilder = Enum.newBuilder();
        kotlin.jvm.internal.k.d(newBuilder, "newBuilder()");
        EnumKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final Enum copy(Enum r22, ve.l block) {
        kotlin.jvm.internal.k.e(r22, "<this>");
        kotlin.jvm.internal.k.e(block, "block");
        EnumKt.Dsl.Companion companion = EnumKt.Dsl.Companion;
        Enum.Builder builder = r22.toBuilder();
        kotlin.jvm.internal.k.d(builder, "this.toBuilder()");
        EnumKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }

    public static final SourceContext getSourceContextOrNull(EnumOrBuilder enumOrBuilder) {
        kotlin.jvm.internal.k.e(enumOrBuilder, "<this>");
        if (enumOrBuilder.hasSourceContext()) {
            return enumOrBuilder.getSourceContext();
        }
        return null;
    }
}
