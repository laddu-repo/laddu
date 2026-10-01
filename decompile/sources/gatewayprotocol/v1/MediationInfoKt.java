package gatewayprotocol.v1;

import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.ClientInfoOuterClass;
import gatewayprotocol.v1.MediationInfoOuterClass;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class MediationInfoKt {
    public static final MediationInfoKt INSTANCE = new MediationInfoKt();

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    @ProtoDslMarker
    /* loaded from: classes.dex */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final MediationInfoOuterClass.MediationInfo.Builder _builder;

        /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
        /* loaded from: classes.dex */
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(MediationInfoOuterClass.MediationInfo.Builder builder) {
                kotlin.jvm.internal.k.e(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(MediationInfoOuterClass.MediationInfo.Builder builder, kotlin.jvm.internal.f fVar) {
            this(builder);
        }

        public final /* synthetic */ MediationInfoOuterClass.MediationInfo _build() {
            MediationInfoOuterClass.MediationInfo build = this._builder.build();
            kotlin.jvm.internal.k.d(build, "_builder.build()");
            return build;
        }

        public final void clearAdapterVersion() {
            this._builder.clearAdapterVersion();
        }

        public final void clearCustomName() {
            this._builder.clearCustomName();
        }

        public final void clearProvider() {
            this._builder.clearProvider();
        }

        public final void clearVersion() {
            this._builder.clearVersion();
        }

        public final String getAdapterVersion() {
            String adapterVersion = this._builder.getAdapterVersion();
            kotlin.jvm.internal.k.d(adapterVersion, "_builder.getAdapterVersion()");
            return adapterVersion;
        }

        public final String getCustomName() {
            String customName = this._builder.getCustomName();
            kotlin.jvm.internal.k.d(customName, "_builder.getCustomName()");
            return customName;
        }

        public final ClientInfoOuterClass.MediationProvider getProvider() {
            ClientInfoOuterClass.MediationProvider provider = this._builder.getProvider();
            kotlin.jvm.internal.k.d(provider, "_builder.getProvider()");
            return provider;
        }

        public final int getProviderValue() {
            return this._builder.getProviderValue();
        }

        public final String getVersion() {
            String version = this._builder.getVersion();
            kotlin.jvm.internal.k.d(version, "_builder.getVersion()");
            return version;
        }

        public final boolean hasAdapterVersion() {
            return this._builder.hasAdapterVersion();
        }

        public final boolean hasCustomName() {
            return this._builder.hasCustomName();
        }

        public final boolean hasVersion() {
            return this._builder.hasVersion();
        }

        public final void setAdapterVersion(String value) {
            kotlin.jvm.internal.k.e(value, "value");
            this._builder.setAdapterVersion(value);
        }

        public final void setCustomName(String value) {
            kotlin.jvm.internal.k.e(value, "value");
            this._builder.setCustomName(value);
        }

        public final void setProvider(ClientInfoOuterClass.MediationProvider value) {
            kotlin.jvm.internal.k.e(value, "value");
            this._builder.setProvider(value);
        }

        public final void setProviderValue(int i6) {
            this._builder.setProviderValue(i6);
        }

        public final void setVersion(String value) {
            kotlin.jvm.internal.k.e(value, "value");
            this._builder.setVersion(value);
        }

        private Dsl(MediationInfoOuterClass.MediationInfo.Builder builder) {
            this._builder = builder;
        }
    }

    private MediationInfoKt() {
    }
}
