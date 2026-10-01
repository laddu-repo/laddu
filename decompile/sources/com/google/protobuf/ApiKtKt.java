package com.google.protobuf;

import com.google.protobuf.Api;
import com.google.protobuf.ApiKt;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class ApiKtKt {
    /* renamed from: -initializeapi, reason: not valid java name */
    public static final Api m6initializeapi(ve.l block) {
        kotlin.jvm.internal.k.e(block, "block");
        ApiKt.Dsl.Companion companion = ApiKt.Dsl.Companion;
        Api.Builder newBuilder = Api.newBuilder();
        kotlin.jvm.internal.k.d(newBuilder, "newBuilder()");
        ApiKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final Api copy(Api api, ve.l block) {
        kotlin.jvm.internal.k.e(api, "<this>");
        kotlin.jvm.internal.k.e(block, "block");
        ApiKt.Dsl.Companion companion = ApiKt.Dsl.Companion;
        Api.Builder builder = api.toBuilder();
        kotlin.jvm.internal.k.d(builder, "this.toBuilder()");
        ApiKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }

    public static final SourceContext getSourceContextOrNull(ApiOrBuilder apiOrBuilder) {
        kotlin.jvm.internal.k.e(apiOrBuilder, "<this>");
        if (apiOrBuilder.hasSourceContext()) {
            return apiOrBuilder.getSourceContext();
        }
        return null;
    }
}
