package com.unity3d.services.store.gpbl.bridges.billingclient.v8;

import com.unity3d.services.core.reflection.GenericBridge;
import he.i;
import ie.w;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class PendingPurchasesParamsBuilderBridge extends GenericBridge {
    private static final String BUILD_METHOD = "build";
    public static final Companion Companion = new Companion(null);
    private static final String ENABLE_ONE_TIME_PRODUCT_METHOD = "enableOneTimeProducts";
    private final Object builderInstance;

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PendingPurchasesParamsBuilderBridge(Object builderInstance) {
        super(w.v(new i(ENABLE_ONE_TIME_PRODUCT_METHOD, new Class[0]), new i(BUILD_METHOD, new Class[0])));
        k.e(builderInstance, "builderInstance");
        this.builderInstance = builderInstance;
    }

    public final PendingPurchasesParamsBridge build() {
        return new PendingPurchasesParamsBridge(callNonVoidMethod(BUILD_METHOD, this.builderInstance, new Object[0]));
    }

    public final PendingPurchasesParamsBuilderBridge enableOneTimeProducts() {
        callVoidMethod(ENABLE_ONE_TIME_PRODUCT_METHOD, this.builderInstance, new Object[0]);
        return this;
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    public String getClassName() {
        return "com.android.billingclient.api.PendingPurchasesParams$Builder";
    }
}
