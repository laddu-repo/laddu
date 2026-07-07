package com.google.protobuf;

import com.google.protobuf.Mixin;
import com.google.protobuf.MixinKt;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class MixinKtKt {
    /* renamed from: -initializemixin, reason: not valid java name */
    public static final Mixin m21initializemixin(ve.l block) {
        kotlin.jvm.internal.k.e(block, "block");
        MixinKt.Dsl.Companion companion = MixinKt.Dsl.Companion;
        Mixin.Builder newBuilder = Mixin.newBuilder();
        kotlin.jvm.internal.k.d(newBuilder, "newBuilder()");
        MixinKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final Mixin copy(Mixin mixin, ve.l block) {
        kotlin.jvm.internal.k.e(mixin, "<this>");
        kotlin.jvm.internal.k.e(block, "block");
        MixinKt.Dsl.Companion companion = MixinKt.Dsl.Companion;
        Mixin.Builder builder = mixin.toBuilder();
        kotlin.jvm.internal.k.d(builder, "this.toBuilder()");
        MixinKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
