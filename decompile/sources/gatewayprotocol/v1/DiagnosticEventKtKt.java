package gatewayprotocol.v1;

import gatewayprotocol.v1.DiagnosticEventKt;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.TimestampsOuterClass;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class DiagnosticEventKtKt {
    /* renamed from: -initializediagnosticEvent, reason: not valid java name */
    public static final DiagnosticEventRequestOuterClass.DiagnosticEvent m108initializediagnosticEvent(ve.l block) {
        kotlin.jvm.internal.k.e(block, "block");
        DiagnosticEventKt.Dsl.Companion companion = DiagnosticEventKt.Dsl.Companion;
        DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder newBuilder = DiagnosticEventRequestOuterClass.DiagnosticEvent.newBuilder();
        kotlin.jvm.internal.k.d(newBuilder, "newBuilder()");
        DiagnosticEventKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final DiagnosticEventRequestOuterClass.DiagnosticEvent copy(DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent, ve.l block) {
        kotlin.jvm.internal.k.e(diagnosticEvent, "<this>");
        kotlin.jvm.internal.k.e(block, "block");
        DiagnosticEventKt.Dsl.Companion companion = DiagnosticEventKt.Dsl.Companion;
        DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder builder = diagnosticEvent.toBuilder();
        kotlin.jvm.internal.k.d(builder, "this.toBuilder()");
        DiagnosticEventKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }

    public static final TimestampsOuterClass.Timestamps getTimestampsOrNull(DiagnosticEventRequestOuterClass.DiagnosticEventOrBuilder diagnosticEventOrBuilder) {
        kotlin.jvm.internal.k.e(diagnosticEventOrBuilder, "<this>");
        if (diagnosticEventOrBuilder.hasTimestamps()) {
            return diagnosticEventOrBuilder.getTimestamps();
        }
        return null;
    }
}
