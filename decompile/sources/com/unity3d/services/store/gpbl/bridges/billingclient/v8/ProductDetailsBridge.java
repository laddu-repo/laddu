package com.unity3d.services.store.gpbl.bridges.billingclient.v8;

import com.unity3d.services.core.reflection.GenericBridge;
import com.unity3d.services.store.gpbl.BillingOriginalJsonResponse;
import df.m;
import df.u;
import he.i;
import ie.w;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.k;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class ProductDetailsBridge extends GenericBridge implements BillingOriginalJsonResponse {
    public static final Companion Companion = new Companion(null);
    private static final String TO_STRING_METHOD = "toString";
    private final Object internalRef;

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
    public ProductDetailsBridge(Object internalRef) {
        super(w.v(new i(TO_STRING_METHOD, new Class[0])));
        k.e(internalRef, "internalRef");
        this.internalRef = internalRef;
    }

    private final String parseOriginalJson(String str) {
        try {
            int Q = m.Q(str, "jsonString='", 0, false, 6) + 12;
            int Q2 = m.Q(str, "', parsedJson=", 0, false, 6);
            if (1 <= Q && Q < Q2) {
                String substring = str.substring(Q, Q2);
                k.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                return u.F(substring, "\\/", "/");
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    public String getClassName() {
        return "com.android.billingclient.api.ProductDetails";
    }

    @Override // com.unity3d.services.store.gpbl.BillingOriginalJsonResponse
    public JSONObject getOriginalJson() {
        try {
            String parseOriginalJson = parseOriginalJson(toString());
            if (parseOriginalJson != null) {
                return new JSONObject(parseOriginalJson);
            }
            return new JSONObject();
        } catch (JSONException unused) {
            return new JSONObject();
        }
    }

    public String toString() {
        Object callNonVoidMethod = callNonVoidMethod(TO_STRING_METHOD, this.internalRef, new Object[0]);
        k.c(callNonVoidMethod, "null cannot be cast to non-null type kotlin.String");
        return (String) callNonVoidMethod;
    }
}
