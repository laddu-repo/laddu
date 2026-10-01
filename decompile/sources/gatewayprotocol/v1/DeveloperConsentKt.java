package gatewayprotocol.v1;

import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.DeveloperConsentOuterClass;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class DeveloperConsentKt {
    public static final DeveloperConsentKt INSTANCE = new DeveloperConsentKt();

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    @ProtoDslMarker
    /* loaded from: classes.dex */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final DeveloperConsentOuterClass.DeveloperConsent.Builder _builder;

        /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
        /* loaded from: classes.dex */
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(DeveloperConsentOuterClass.DeveloperConsent.Builder builder) {
                kotlin.jvm.internal.k.e(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
        /* loaded from: classes.dex */
        public static final class OptionsProxy extends DslProxy {
            private OptionsProxy() {
            }
        }

        public /* synthetic */ Dsl(DeveloperConsentOuterClass.DeveloperConsent.Builder builder, kotlin.jvm.internal.f fVar) {
            this(builder);
        }

        public final /* synthetic */ DeveloperConsentOuterClass.DeveloperConsent _build() {
            DeveloperConsentOuterClass.DeveloperConsent build = this._builder.build();
            kotlin.jvm.internal.k.d(build, "_builder.build()");
            return build;
        }

        public final /* synthetic */ void addAllOptions(DslList dslList, Iterable values) {
            kotlin.jvm.internal.k.e(dslList, "<this>");
            kotlin.jvm.internal.k.e(values, "values");
            this._builder.addAllOptions(values);
        }

        public final /* synthetic */ void addOptions(DslList dslList, DeveloperConsentOuterClass.DeveloperConsentOption value) {
            kotlin.jvm.internal.k.e(dslList, "<this>");
            kotlin.jvm.internal.k.e(value, "value");
            this._builder.addOptions(value);
        }

        public final /* synthetic */ void clearOptions(DslList dslList) {
            kotlin.jvm.internal.k.e(dslList, "<this>");
            this._builder.clearOptions();
        }

        public final /* synthetic */ DslList getOptions() {
            List<DeveloperConsentOuterClass.DeveloperConsentOption> optionsList = this._builder.getOptionsList();
            kotlin.jvm.internal.k.d(optionsList, "_builder.getOptionsList()");
            return new DslList(optionsList);
        }

        public final /* synthetic */ void plusAssignAllOptions(DslList<DeveloperConsentOuterClass.DeveloperConsentOption, OptionsProxy> dslList, Iterable<DeveloperConsentOuterClass.DeveloperConsentOption> values) {
            kotlin.jvm.internal.k.e(dslList, "<this>");
            kotlin.jvm.internal.k.e(values, "values");
            addAllOptions(dslList, values);
        }

        public final /* synthetic */ void plusAssignOptions(DslList<DeveloperConsentOuterClass.DeveloperConsentOption, OptionsProxy> dslList, DeveloperConsentOuterClass.DeveloperConsentOption value) {
            kotlin.jvm.internal.k.e(dslList, "<this>");
            kotlin.jvm.internal.k.e(value, "value");
            addOptions(dslList, value);
        }

        public final /* synthetic */ void setOptions(DslList dslList, int i6, DeveloperConsentOuterClass.DeveloperConsentOption value) {
            kotlin.jvm.internal.k.e(dslList, "<this>");
            kotlin.jvm.internal.k.e(value, "value");
            this._builder.setOptions(i6, value);
        }

        private Dsl(DeveloperConsentOuterClass.DeveloperConsent.Builder builder) {
            this._builder = builder;
        }
    }

    private DeveloperConsentKt() {
    }
}
