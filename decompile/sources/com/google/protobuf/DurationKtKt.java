package com.google.protobuf;

import com.google.protobuf.Duration;
import com.google.protobuf.DurationKt;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class DurationKtKt {
    /* renamed from: -initializeduration, reason: not valid java name */
    public static final Duration m10initializeduration(ve.l block) {
        kotlin.jvm.internal.k.e(block, "block");
        DurationKt.Dsl.Companion companion = DurationKt.Dsl.Companion;
        Duration.Builder newBuilder = Duration.newBuilder();
        kotlin.jvm.internal.k.d(newBuilder, "newBuilder()");
        DurationKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final Duration copy(Duration duration, ve.l block) {
        kotlin.jvm.internal.k.e(duration, "<this>");
        kotlin.jvm.internal.k.e(block, "block");
        DurationKt.Dsl.Companion companion = DurationKt.Dsl.Companion;
        Duration.Builder builder = duration.toBuilder();
        kotlin.jvm.internal.k.d(builder, "this.toBuilder()");
        DurationKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
