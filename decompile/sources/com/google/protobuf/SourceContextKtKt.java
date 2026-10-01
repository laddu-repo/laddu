package com.google.protobuf;

import com.google.protobuf.SourceContext;
import com.google.protobuf.SourceContextKt;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class SourceContextKtKt {
    /* renamed from: -initializesourceContext, reason: not valid java name */
    public static final SourceContext m23initializesourceContext(ve.l block) {
        kotlin.jvm.internal.k.e(block, "block");
        SourceContextKt.Dsl.Companion companion = SourceContextKt.Dsl.Companion;
        SourceContext.Builder newBuilder = SourceContext.newBuilder();
        kotlin.jvm.internal.k.d(newBuilder, "newBuilder()");
        SourceContextKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final SourceContext copy(SourceContext sourceContext, ve.l block) {
        kotlin.jvm.internal.k.e(sourceContext, "<this>");
        kotlin.jvm.internal.k.e(block, "block");
        SourceContextKt.Dsl.Companion companion = SourceContextKt.Dsl.Companion;
        SourceContext.Builder builder = sourceContext.toBuilder();
        kotlin.jvm.internal.k.d(builder, "this.toBuilder()");
        SourceContextKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
