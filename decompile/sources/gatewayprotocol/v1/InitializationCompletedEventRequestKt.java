package gatewayprotocol.v1;

import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class InitializationCompletedEventRequestKt {
    public static final InitializationCompletedEventRequestKt INSTANCE = new InitializationCompletedEventRequestKt();

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    @ProtoDslMarker
    /* loaded from: classes.dex */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder _builder;

        /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
        /* loaded from: classes.dex */
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder builder) {
                kotlin.jvm.internal.k.e(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder builder, kotlin.jvm.internal.f fVar) {
            this(builder);
        }

        public final /* synthetic */ InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest _build() {
            InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest build = this._builder.build();
            kotlin.jvm.internal.k.d(build, "_builder.build()");
            return build;
        }

        public final void clearDynamicDeviceInfo() {
            this._builder.clearDynamicDeviceInfo();
        }

        public final void clearStaticDeviceInfo() {
            this._builder.clearStaticDeviceInfo();
        }

        public final DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
            DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo = this._builder.getDynamicDeviceInfo();
            kotlin.jvm.internal.k.d(dynamicDeviceInfo, "_builder.getDynamicDeviceInfo()");
            return dynamicDeviceInfo;
        }

        public final StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
            StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo = this._builder.getStaticDeviceInfo();
            kotlin.jvm.internal.k.d(staticDeviceInfo, "_builder.getStaticDeviceInfo()");
            return staticDeviceInfo;
        }

        public final boolean hasDynamicDeviceInfo() {
            return this._builder.hasDynamicDeviceInfo();
        }

        public final boolean hasStaticDeviceInfo() {
            return this._builder.hasStaticDeviceInfo();
        }

        public final void setDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo value) {
            kotlin.jvm.internal.k.e(value, "value");
            this._builder.setDynamicDeviceInfo(value);
        }

        public final void setStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo value) {
            kotlin.jvm.internal.k.e(value, "value");
            this._builder.setStaticDeviceInfo(value);
        }

        private Dsl(InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder builder) {
            this._builder = builder;
        }
    }

    private InitializationCompletedEventRequestKt() {
    }
}
