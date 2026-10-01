package gatewayprotocol.v1;

import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class DiagnosticEventRequestKt {
    public static final DiagnosticEventRequestKt INSTANCE = new DiagnosticEventRequestKt();

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    @ProtoDslMarker
    /* loaded from: classes.dex */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final DiagnosticEventRequestOuterClass.DiagnosticEventRequest.Builder _builder;

        /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
        /* loaded from: classes.dex */
        public static final class BatchProxy extends DslProxy {
            private BatchProxy() {
            }
        }

        /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
        /* loaded from: classes.dex */
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(DiagnosticEventRequestOuterClass.DiagnosticEventRequest.Builder builder) {
                kotlin.jvm.internal.k.e(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(DiagnosticEventRequestOuterClass.DiagnosticEventRequest.Builder builder, kotlin.jvm.internal.f fVar) {
            this(builder);
        }

        public final /* synthetic */ DiagnosticEventRequestOuterClass.DiagnosticEventRequest _build() {
            DiagnosticEventRequestOuterClass.DiagnosticEventRequest build = this._builder.build();
            kotlin.jvm.internal.k.d(build, "_builder.build()");
            return build;
        }

        public final /* synthetic */ void addAllBatch(DslList dslList, Iterable values) {
            kotlin.jvm.internal.k.e(dslList, "<this>");
            kotlin.jvm.internal.k.e(values, "values");
            this._builder.addAllBatch(values);
        }

        public final /* synthetic */ void addBatch(DslList dslList, DiagnosticEventRequestOuterClass.DiagnosticEvent value) {
            kotlin.jvm.internal.k.e(dslList, "<this>");
            kotlin.jvm.internal.k.e(value, "value");
            this._builder.addBatch(value);
        }

        public final /* synthetic */ void clearBatch(DslList dslList) {
            kotlin.jvm.internal.k.e(dslList, "<this>");
            this._builder.clearBatch();
        }

        public final /* synthetic */ DslList getBatch() {
            List<DiagnosticEventRequestOuterClass.DiagnosticEvent> batchList = this._builder.getBatchList();
            kotlin.jvm.internal.k.d(batchList, "_builder.getBatchList()");
            return new DslList(batchList);
        }

        public final /* synthetic */ void plusAssignAllBatch(DslList<DiagnosticEventRequestOuterClass.DiagnosticEvent, BatchProxy> dslList, Iterable<DiagnosticEventRequestOuterClass.DiagnosticEvent> values) {
            kotlin.jvm.internal.k.e(dslList, "<this>");
            kotlin.jvm.internal.k.e(values, "values");
            addAllBatch(dslList, values);
        }

        public final /* synthetic */ void plusAssignBatch(DslList<DiagnosticEventRequestOuterClass.DiagnosticEvent, BatchProxy> dslList, DiagnosticEventRequestOuterClass.DiagnosticEvent value) {
            kotlin.jvm.internal.k.e(dslList, "<this>");
            kotlin.jvm.internal.k.e(value, "value");
            addBatch(dslList, value);
        }

        public final /* synthetic */ void setBatch(DslList dslList, int i6, DiagnosticEventRequestOuterClass.DiagnosticEvent value) {
            kotlin.jvm.internal.k.e(dslList, "<this>");
            kotlin.jvm.internal.k.e(value, "value");
            this._builder.setBatch(i6, value);
        }

        private Dsl(DiagnosticEventRequestOuterClass.DiagnosticEventRequest.Builder builder) {
            this._builder = builder;
        }
    }

    private DiagnosticEventRequestKt() {
    }
}
