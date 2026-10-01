package com.unity3d.services.store.gpbl.bridges.billingclient.v8;

import com.unity3d.services.core.reflection.GenericBridge;
import h8.c;
import he.i;
import ie.w;
import kotlin.jvm.internal.f;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class QueryPurchasesParamsBridge extends GenericBridge {
    public static final Companion Companion = new Companion(null);
    private static final String NEW_BUILDER_METHOD = "newBuilder";
    private final Object queryPurchasesParamsBridgeInternalInstance;

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        private final Object callNonVoidStaticMethod(String str) {
            Object invoke = getClassForParams().getMethod(str, null).invoke(null, null);
            if (invoke != null) {
                return invoke;
            }
            throw new IllegalStateException(c.m("Static method ", str, " returned null"));
        }

        public final Class<?> getClassForParams() {
            return Class.forName("com.android.billingclient.api.QueryPurchasesParams");
        }

        public final QueryPurchasesParamsBuilderBridge newBuilder() {
            return new QueryPurchasesParamsBuilderBridge(callNonVoidStaticMethod("newBuilder"));
        }

        private Companion() {
        }
    }

    public QueryPurchasesParamsBridge(Object obj) {
        super(w.v(new i("newBuilder", new Class[0])));
        this.queryPurchasesParamsBridgeInternalInstance = obj;
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    public String getClassName() {
        return "com.android.billingclient.api.QueryPurchasesParams";
    }

    public final Object getQueryPurchasesParamsBridgeInternalInstance() {
        return this.queryPurchasesParamsBridgeInternalInstance;
    }
}
