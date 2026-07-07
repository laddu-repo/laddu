package gatewayprotocol.v1;

import gatewayprotocol.v1.ErrorKt;
import gatewayprotocol.v1.ErrorOuterClass;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class ErrorKtKt {
    /* renamed from: -initializeerror, reason: not valid java name */
    public static final ErrorOuterClass.Error m115initializeerror(ve.l block) {
        kotlin.jvm.internal.k.e(block, "block");
        ErrorKt.Dsl.Companion companion = ErrorKt.Dsl.Companion;
        ErrorOuterClass.Error.Builder newBuilder = ErrorOuterClass.Error.newBuilder();
        kotlin.jvm.internal.k.d(newBuilder, "newBuilder()");
        ErrorKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final ErrorOuterClass.Error copy(ErrorOuterClass.Error error, ve.l block) {
        kotlin.jvm.internal.k.e(error, "<this>");
        kotlin.jvm.internal.k.e(block, "block");
        ErrorKt.Dsl.Companion companion = ErrorKt.Dsl.Companion;
        ErrorOuterClass.Error.Builder builder = error.toBuilder();
        kotlin.jvm.internal.k.d(builder, "this.toBuilder()");
        ErrorKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
