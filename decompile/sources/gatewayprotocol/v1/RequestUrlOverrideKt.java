package gatewayprotocol.v1;

import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.InitializationResponseOuterClass;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class RequestUrlOverrideKt {
    public static final RequestUrlOverrideKt INSTANCE = new RequestUrlOverrideKt();

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    @ProtoDslMarker
    /* loaded from: classes.dex */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final InitializationResponseOuterClass.RequestUrlOverride.Builder _builder;

        /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
        /* loaded from: classes.dex */
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(InitializationResponseOuterClass.RequestUrlOverride.Builder builder) {
                kotlin.jvm.internal.k.e(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(InitializationResponseOuterClass.RequestUrlOverride.Builder builder, kotlin.jvm.internal.f fVar) {
            this(builder);
        }

        public final /* synthetic */ InitializationResponseOuterClass.RequestUrlOverride _build() {
            InitializationResponseOuterClass.RequestUrlOverride build = this._builder.build();
            kotlin.jvm.internal.k.d(build, "_builder.build()");
            return build;
        }

        public final void clearRequestType() {
            this._builder.clearRequestType();
        }

        public final void clearUrl() {
            this._builder.clearUrl();
        }

        public final InitializationResponseOuterClass.RequestType getRequestType() {
            InitializationResponseOuterClass.RequestType requestType = this._builder.getRequestType();
            kotlin.jvm.internal.k.d(requestType, "_builder.getRequestType()");
            return requestType;
        }

        public final int getRequestTypeValue() {
            return this._builder.getRequestTypeValue();
        }

        public final String getUrl() {
            String url = this._builder.getUrl();
            kotlin.jvm.internal.k.d(url, "_builder.getUrl()");
            return url;
        }

        public final void setRequestType(InitializationResponseOuterClass.RequestType value) {
            kotlin.jvm.internal.k.e(value, "value");
            this._builder.setRequestType(value);
        }

        public final void setRequestTypeValue(int i6) {
            this._builder.setRequestTypeValue(i6);
        }

        public final void setUrl(String value) {
            kotlin.jvm.internal.k.e(value, "value");
            this._builder.setUrl(value);
        }

        private Dsl(InitializationResponseOuterClass.RequestUrlOverride.Builder builder) {
            this._builder = builder;
        }
    }

    private RequestUrlOverrideKt() {
    }
}
