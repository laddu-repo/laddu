package com.unity3d.ads.datastore;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ProtoDslMarker;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class ByteStringStoreKt {
    public static final ByteStringStoreKt INSTANCE = new ByteStringStoreKt();

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    @ProtoDslMarker
    /* loaded from: classes.dex */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final ByteStringStoreOuterClass.ByteStringStore.Builder _builder;

        /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
        /* loaded from: classes.dex */
        public static final class Companion {
            public /* synthetic */ Companion(f fVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(ByteStringStoreOuterClass.ByteStringStore.Builder builder) {
                k.e(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(ByteStringStoreOuterClass.ByteStringStore.Builder builder, f fVar) {
            this(builder);
        }

        public final /* synthetic */ ByteStringStoreOuterClass.ByteStringStore _build() {
            ByteStringStoreOuterClass.ByteStringStore build = this._builder.build();
            k.d(build, "_builder.build()");
            return build;
        }

        public final void clearData() {
            this._builder.clearData();
        }

        public final ByteString getData() {
            ByteString data = this._builder.getData();
            k.d(data, "_builder.getData()");
            return data;
        }

        public final void setData(ByteString value) {
            k.e(value, "value");
            this._builder.setData(value);
        }

        private Dsl(ByteStringStoreOuterClass.ByteStringStore.Builder builder) {
            this._builder = builder;
        }
    }

    private ByteStringStoreKt() {
    }
}
