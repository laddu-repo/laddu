package com.unity3d.services.store.gpbl.bridges.billingclient.v8;

import com.unity3d.services.core.reflection.GenericBridge;
import he.i;
import ie.w;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class ProductBuilderBridge extends GenericBridge {
    private static final String BUILD_METHOD = "build";
    public static final Companion Companion = new Companion(null);
    private static final String SET_PRODUCT_ID_METHOD = "setProductId";
    private static final String SET_PRODUCT_TYPE_METHOD = "setProductType";
    private Object builderInstance;

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
    public ProductBuilderBridge(Object builderInstance) {
        super(w.y(new i(SET_PRODUCT_ID_METHOD, new Class[]{String.class}), new i(SET_PRODUCT_TYPE_METHOD, new Class[]{String.class}), new i(BUILD_METHOD, new Class[0])));
        k.e(builderInstance, "builderInstance");
        this.builderInstance = builderInstance;
    }

    public final ProductBridge build() {
        return new ProductBridge(callNonVoidMethod(BUILD_METHOD, this.builderInstance, new Object[0]));
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    public String getClassName() {
        return "com.android.billingclient.api.QueryProductDetailsParams$Product$Builder";
    }

    public final ProductBuilderBridge setProductId(String productId) {
        k.e(productId, "productId");
        Object callNonVoidMethod = callNonVoidMethod(SET_PRODUCT_ID_METHOD, this.builderInstance, productId);
        k.d(callNonVoidMethod, "callNonVoidMethod(SET_PR…ilderInstance, productId)");
        this.builderInstance = callNonVoidMethod;
        return this;
    }

    public final ProductBuilderBridge setProductType(String productType) {
        k.e(productType, "productType");
        Object callNonVoidMethod = callNonVoidMethod(SET_PRODUCT_TYPE_METHOD, this.builderInstance, productType);
        k.d(callNonVoidMethod, "callNonVoidMethod(SET_PR…derInstance, productType)");
        this.builderInstance = callNonVoidMethod;
        return this;
    }
}
