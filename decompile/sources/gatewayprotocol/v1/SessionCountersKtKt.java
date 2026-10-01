package gatewayprotocol.v1;

import gatewayprotocol.v1.SessionCountersKt;
import gatewayprotocol.v1.SessionCountersOuterClass;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class SessionCountersKtKt {
    /* renamed from: -initializesessionCounters, reason: not valid java name */
    public static final SessionCountersOuterClass.SessionCounters m140initializesessionCounters(ve.l block) {
        kotlin.jvm.internal.k.e(block, "block");
        SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.Companion;
        SessionCountersOuterClass.SessionCounters.Builder newBuilder = SessionCountersOuterClass.SessionCounters.newBuilder();
        kotlin.jvm.internal.k.d(newBuilder, "newBuilder()");
        SessionCountersKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final SessionCountersOuterClass.SessionCounters copy(SessionCountersOuterClass.SessionCounters sessionCounters, ve.l block) {
        kotlin.jvm.internal.k.e(sessionCounters, "<this>");
        kotlin.jvm.internal.k.e(block, "block");
        SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.Companion;
        SessionCountersOuterClass.SessionCounters.Builder builder = sessionCounters.toBuilder();
        kotlin.jvm.internal.k.d(builder, "this.toBuilder()");
        SessionCountersKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
