package com.google.protobuf;

import com.google.protobuf.Timestamp;
import com.google.protobuf.TimestampKt;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class TimestampKtKt {
    /* renamed from: -initializetimestamp, reason: not valid java name */
    public static final Timestamp m26initializetimestamp(ve.l block) {
        kotlin.jvm.internal.k.e(block, "block");
        TimestampKt.Dsl.Companion companion = TimestampKt.Dsl.Companion;
        Timestamp.Builder newBuilder = Timestamp.newBuilder();
        kotlin.jvm.internal.k.d(newBuilder, "newBuilder()");
        TimestampKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final Timestamp copy(Timestamp timestamp, ve.l block) {
        kotlin.jvm.internal.k.e(timestamp, "<this>");
        kotlin.jvm.internal.k.e(block, "block");
        TimestampKt.Dsl.Companion companion = TimestampKt.Dsl.Companion;
        Timestamp.Builder builder = timestamp.toBuilder();
        kotlin.jvm.internal.k.d(builder, "this.toBuilder()");
        TimestampKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
