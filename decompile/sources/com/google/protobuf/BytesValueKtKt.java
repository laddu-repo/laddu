package com.google.protobuf;

import com.google.protobuf.BytesValue;
import com.google.protobuf.BytesValueKt;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class BytesValueKtKt {
    /* renamed from: -initializebytesValue, reason: not valid java name */
    public static final BytesValue m8initializebytesValue(ve.l block) {
        kotlin.jvm.internal.k.e(block, "block");
        BytesValueKt.Dsl.Companion companion = BytesValueKt.Dsl.Companion;
        BytesValue.Builder newBuilder = BytesValue.newBuilder();
        kotlin.jvm.internal.k.d(newBuilder, "newBuilder()");
        BytesValueKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final BytesValue copy(BytesValue bytesValue, ve.l block) {
        kotlin.jvm.internal.k.e(bytesValue, "<this>");
        kotlin.jvm.internal.k.e(block, "block");
        BytesValueKt.Dsl.Companion companion = BytesValueKt.Dsl.Companion;
        BytesValue.Builder builder = bytesValue.toBuilder();
        kotlin.jvm.internal.k.d(builder, "this.toBuilder()");
        BytesValueKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
