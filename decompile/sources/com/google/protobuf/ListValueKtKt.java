package com.google.protobuf;

import com.google.protobuf.ListValue;
import com.google.protobuf.ListValueKt;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class ListValueKtKt {
    /* renamed from: -initializelistValue, reason: not valid java name */
    public static final ListValue m19initializelistValue(ve.l block) {
        kotlin.jvm.internal.k.e(block, "block");
        ListValueKt.Dsl.Companion companion = ListValueKt.Dsl.Companion;
        ListValue.Builder newBuilder = ListValue.newBuilder();
        kotlin.jvm.internal.k.d(newBuilder, "newBuilder()");
        ListValueKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final ListValue copy(ListValue listValue, ve.l block) {
        kotlin.jvm.internal.k.e(listValue, "<this>");
        kotlin.jvm.internal.k.e(block, "block");
        ListValueKt.Dsl.Companion companion = ListValueKt.Dsl.Companion;
        ListValue.Builder builder = listValue.toBuilder();
        kotlin.jvm.internal.k.d(builder, "this.toBuilder()");
        ListValueKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
