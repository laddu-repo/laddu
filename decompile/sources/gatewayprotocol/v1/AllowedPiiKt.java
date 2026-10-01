package gatewayprotocol.v1;

import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.AllowedPiiOuterClass;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class AllowedPiiKt {
    public static final AllowedPiiKt INSTANCE = new AllowedPiiKt();

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    @ProtoDslMarker
    /* loaded from: classes.dex */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final AllowedPiiOuterClass.AllowedPii.Builder _builder;

        /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
        /* loaded from: classes.dex */
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(AllowedPiiOuterClass.AllowedPii.Builder builder) {
                kotlin.jvm.internal.k.e(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(AllowedPiiOuterClass.AllowedPii.Builder builder, kotlin.jvm.internal.f fVar) {
            this(builder);
        }

        public final /* synthetic */ AllowedPiiOuterClass.AllowedPii _build() {
            AllowedPiiOuterClass.AllowedPii build = this._builder.build();
            kotlin.jvm.internal.k.d(build, "_builder.build()");
            return build;
        }

        public final void clearAppsetId() {
            this._builder.clearAppsetId();
        }

        public final void clearFid() {
            this._builder.clearFid();
        }

        public final void clearIdfa() {
            this._builder.clearIdfa();
        }

        public final void clearIdfv() {
            this._builder.clearIdfv();
        }

        public final boolean getAppsetId() {
            return this._builder.getAppsetId();
        }

        public final boolean getFid() {
            return this._builder.getFid();
        }

        public final boolean getIdfa() {
            return this._builder.getIdfa();
        }

        public final boolean getIdfv() {
            return this._builder.getIdfv();
        }

        public final void setAppsetId(boolean z10) {
            this._builder.setAppsetId(z10);
        }

        public final void setFid(boolean z10) {
            this._builder.setFid(z10);
        }

        public final void setIdfa(boolean z10) {
            this._builder.setIdfa(z10);
        }

        public final void setIdfv(boolean z10) {
            this._builder.setIdfv(z10);
        }

        private Dsl(AllowedPiiOuterClass.AllowedPii.Builder builder) {
            this._builder = builder;
        }
    }

    private AllowedPiiKt() {
    }
}
