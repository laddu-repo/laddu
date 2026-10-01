package com.google.protobuf;

import com.google.protobuf.EnumValue;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class EnumValueKt {
    public static final EnumValueKt INSTANCE = new EnumValueKt();

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    @ProtoDslMarker
    /* loaded from: classes.dex */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final EnumValue.Builder _builder;

        /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
        /* loaded from: classes.dex */
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(EnumValue.Builder builder) {
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

        public /* synthetic */ Dsl(EnumValue.Builder builder, kotlin.jvm.internal.f fVar) {
            this(builder);
        }

        public final /* synthetic */ EnumValue _build() {
            EnumValue build = this._builder.build();
            kotlin.jvm.internal.k.d(build, "_builder.build()");
            return build;
        }

        public final /* synthetic */ void addAllOptions(DslList dslList, Iterable values) {
            kotlin.jvm.internal.k.e(dslList, "<this>");
            kotlin.jvm.internal.k.e(values, "values");
            this._builder.addAllOptions(values);
        }

        public final /* synthetic */ void addOptions(DslList dslList, Option value) {
            kotlin.jvm.internal.k.e(dslList, "<this>");
            kotlin.jvm.internal.k.e(value, "value");
            this._builder.addOptions(value);
        }

        public final void clearName() {
            this._builder.clearName();
        }

        public final void clearNumber() {
            this._builder.clearNumber();
        }

        public final /* synthetic */ void clearOptions(DslList dslList) {
            kotlin.jvm.internal.k.e(dslList, "<this>");
            this._builder.clearOptions();
        }

        public final String getName() {
            String name = this._builder.getName();
            kotlin.jvm.internal.k.d(name, "_builder.getName()");
            return name;
        }

        public final int getNumber() {
            return this._builder.getNumber();
        }

        public final /* synthetic */ DslList getOptions() {
            List<Option> optionsList = this._builder.getOptionsList();
            kotlin.jvm.internal.k.d(optionsList, "_builder.getOptionsList()");
            return new DslList(optionsList);
        }

        public final /* synthetic */ void plusAssignAllOptions(DslList<Option, OptionsProxy> dslList, Iterable<Option> values) {
            kotlin.jvm.internal.k.e(dslList, "<this>");
            kotlin.jvm.internal.k.e(values, "values");
            addAllOptions(dslList, values);
        }

        public final /* synthetic */ void plusAssignOptions(DslList<Option, OptionsProxy> dslList, Option value) {
            kotlin.jvm.internal.k.e(dslList, "<this>");
            kotlin.jvm.internal.k.e(value, "value");
            addOptions(dslList, value);
        }

        public final void setName(String value) {
            kotlin.jvm.internal.k.e(value, "value");
            this._builder.setName(value);
        }

        public final void setNumber(int i6) {
            this._builder.setNumber(i6);
        }

        public final /* synthetic */ void setOptions(DslList dslList, int i6, Option value) {
            kotlin.jvm.internal.k.e(dslList, "<this>");
            kotlin.jvm.internal.k.e(value, "value");
            this._builder.setOptions(i6, value);
        }

        private Dsl(EnumValue.Builder builder) {
            this._builder = builder;
        }
    }

    private EnumValueKt() {
    }
}
