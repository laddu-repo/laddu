package com.google.protobuf;

import com.google.protobuf.SourceContext;
import com.google.protobuf.kotlin.ProtoDslMarker;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class SourceContextKt {
    public static final SourceContextKt INSTANCE = new SourceContextKt();

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    @ProtoDslMarker
    /* loaded from: classes.dex */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final SourceContext.Builder _builder;

        /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
        /* loaded from: classes.dex */
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(SourceContext.Builder builder) {
                kotlin.jvm.internal.k.e(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(SourceContext.Builder builder, kotlin.jvm.internal.f fVar) {
            this(builder);
        }

        public final /* synthetic */ SourceContext _build() {
            SourceContext build = this._builder.build();
            kotlin.jvm.internal.k.d(build, "_builder.build()");
            return build;
        }

        public final void clearFileName() {
            this._builder.clearFileName();
        }

        public final String getFileName() {
            String fileName = this._builder.getFileName();
            kotlin.jvm.internal.k.d(fileName, "_builder.getFileName()");
            return fileName;
        }

        public final void setFileName(String value) {
            kotlin.jvm.internal.k.e(value, "value");
            this._builder.setFileName(value);
        }

        private Dsl(SourceContext.Builder builder) {
            this._builder = builder;
        }
    }

    private SourceContextKt() {
    }
}
