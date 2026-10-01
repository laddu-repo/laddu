package com.google.protobuf;

import com.google.protobuf.Value;
import com.google.protobuf.ValueKt;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class ValueKtKt {
    /* renamed from: -initializevalue, reason: not valid java name */
    public static final Value m30initializevalue(ve.l block) {
        kotlin.jvm.internal.k.e(block, "block");
        ValueKt.Dsl.Companion companion = ValueKt.Dsl.Companion;
        Value.Builder newBuilder = Value.newBuilder();
        kotlin.jvm.internal.k.d(newBuilder, "newBuilder()");
        ValueKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final Value copy(Value value, ve.l block) {
        kotlin.jvm.internal.k.e(value, "<this>");
        kotlin.jvm.internal.k.e(block, "block");
        ValueKt.Dsl.Companion companion = ValueKt.Dsl.Companion;
        Value.Builder builder = value.toBuilder();
        kotlin.jvm.internal.k.d(builder, "this.toBuilder()");
        ValueKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }

    public static final ListValue getListValueOrNull(ValueOrBuilder valueOrBuilder) {
        kotlin.jvm.internal.k.e(valueOrBuilder, "<this>");
        if (valueOrBuilder.hasListValue()) {
            return valueOrBuilder.getListValue();
        }
        return null;
    }

    public static final Struct getStructValueOrNull(ValueOrBuilder valueOrBuilder) {
        kotlin.jvm.internal.k.e(valueOrBuilder, "<this>");
        if (valueOrBuilder.hasStructValue()) {
            return valueOrBuilder.getStructValue();
        }
        return null;
    }
}
