package com.google.protobuf;

import com.google.protobuf.Option;
import com.google.protobuf.OptionKt;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class OptionKtKt {
    /* renamed from: -initializeoption, reason: not valid java name */
    public static final Option m22initializeoption(ve.l block) {
        kotlin.jvm.internal.k.e(block, "block");
        OptionKt.Dsl.Companion companion = OptionKt.Dsl.Companion;
        Option.Builder newBuilder = Option.newBuilder();
        kotlin.jvm.internal.k.d(newBuilder, "newBuilder()");
        OptionKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final Option copy(Option option, ve.l block) {
        kotlin.jvm.internal.k.e(option, "<this>");
        kotlin.jvm.internal.k.e(block, "block");
        OptionKt.Dsl.Companion companion = OptionKt.Dsl.Companion;
        Option.Builder builder = option.toBuilder();
        kotlin.jvm.internal.k.d(builder, "this.toBuilder()");
        OptionKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }

    public static final Any getValueOrNull(OptionOrBuilder optionOrBuilder) {
        kotlin.jvm.internal.k.e(optionOrBuilder, "<this>");
        if (optionOrBuilder.hasValue()) {
            return optionOrBuilder.getValue();
        }
        return null;
    }
}
