package gatewayprotocol.v1;

import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.NativeConfigurationOuterClass;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class DebugSettingsKt {
    public static final DebugSettingsKt INSTANCE = new DebugSettingsKt();

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    @ProtoDslMarker
    /* loaded from: classes.dex */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final NativeConfigurationOuterClass.DebugSettings.Builder _builder;

        /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
        /* loaded from: classes.dex */
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(NativeConfigurationOuterClass.DebugSettings.Builder builder) {
                kotlin.jvm.internal.k.e(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(NativeConfigurationOuterClass.DebugSettings.Builder builder, kotlin.jvm.internal.f fVar) {
            this(builder);
        }

        public final /* synthetic */ NativeConfigurationOuterClass.DebugSettings _build() {
            NativeConfigurationOuterClass.DebugSettings build = this._builder.build();
            kotlin.jvm.internal.k.d(build, "_builder.build()");
            return build;
        }

        public final void clearCleanCache() {
            this._builder.clearCleanCache();
        }

        public final void clearEnableTracing() {
            this._builder.clearEnableTracing();
        }

        public final void clearWebviewInspectable() {
            this._builder.clearWebviewInspectable();
        }

        public final boolean getCleanCache() {
            return this._builder.getCleanCache();
        }

        public final boolean getEnableTracing() {
            return this._builder.getEnableTracing();
        }

        public final boolean getWebviewInspectable() {
            return this._builder.getWebviewInspectable();
        }

        public final void setCleanCache(boolean z10) {
            this._builder.setCleanCache(z10);
        }

        public final void setEnableTracing(boolean z10) {
            this._builder.setEnableTracing(z10);
        }

        public final void setWebviewInspectable(boolean z10) {
            this._builder.setWebviewInspectable(z10);
        }

        private Dsl(NativeConfigurationOuterClass.DebugSettings.Builder builder) {
            this._builder = builder;
        }
    }

    private DebugSettingsKt() {
    }
}
