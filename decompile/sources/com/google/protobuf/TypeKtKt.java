package com.google.protobuf;

import com.google.protobuf.Type;
import com.google.protobuf.TypeKt;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class TypeKtKt {
    /* renamed from: -initializetype, reason: not valid java name */
    public static final Type m27initializetype(ve.l block) {
        kotlin.jvm.internal.k.e(block, "block");
        TypeKt.Dsl.Companion companion = TypeKt.Dsl.Companion;
        Type.Builder newBuilder = Type.newBuilder();
        kotlin.jvm.internal.k.d(newBuilder, "newBuilder()");
        TypeKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final Type copy(Type type, ve.l block) {
        kotlin.jvm.internal.k.e(type, "<this>");
        kotlin.jvm.internal.k.e(block, "block");
        TypeKt.Dsl.Companion companion = TypeKt.Dsl.Companion;
        Type.Builder builder = type.toBuilder();
        kotlin.jvm.internal.k.d(builder, "this.toBuilder()");
        TypeKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }

    public static final SourceContext getSourceContextOrNull(TypeOrBuilder typeOrBuilder) {
        kotlin.jvm.internal.k.e(typeOrBuilder, "<this>");
        if (typeOrBuilder.hasSourceContext()) {
            return typeOrBuilder.getSourceContext();
        }
        return null;
    }
}
