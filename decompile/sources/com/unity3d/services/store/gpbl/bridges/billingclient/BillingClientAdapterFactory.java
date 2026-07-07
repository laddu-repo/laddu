package com.unity3d.services.store.gpbl.bridges.billingclient;

import android.content.Context;
import com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientBuilderBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.v8.QueryProductDetailsResultsBridge;
import he.a;
import he.j;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class BillingClientAdapterFactory {
    private final BillingClientAdapter createV6Adapter(Context context, int i6) {
        Object b10;
        try {
            BillingClientBuilderBridge builder = BillingClientBridge.newBuilder(context);
            k.d(builder, "builder");
            b10 = new com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientAdapter(builder, i6);
        } catch (Throwable th) {
            b10 = a.b(th);
        }
        if (b10 instanceof j) {
            b10 = null;
        }
        return (BillingClientAdapter) b10;
    }

    public static /* synthetic */ BillingClientAdapter createV6Adapter$default(BillingClientAdapterFactory billingClientAdapterFactory, Context context, int i6, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i6 = 6;
        }
        return billingClientAdapterFactory.createV6Adapter(context, i6);
    }

    /* renamed from: createV8Adapter-IoAF18A, reason: not valid java name */
    private final Object m89createV8AdapterIoAF18A(Context context) {
        try {
            com.unity3d.services.store.gpbl.bridges.billingclient.v8.BillingClientAdapter billingClientAdapter = new com.unity3d.services.store.gpbl.bridges.billingclient.v8.BillingClientAdapter(com.unity3d.services.store.gpbl.bridges.billingclient.v8.BillingClientBridge.Companion.newBuilder(context));
            if (new QueryProductDetailsResultsBridge(new Object()).exists()) {
                return billingClientAdapter;
            }
            throw new FallbackException(7);
        } catch (Throwable th) {
            return a.b(th);
        }
    }

    public final BillingClientAdapter createBillingClientAdapter(Context context) {
        BillingClientAdapter createV6Adapter$default;
        k.e(context, "context");
        Object m89createV8AdapterIoAF18A = m89createV8AdapterIoAF18A(context);
        Throwable a10 = he.k.a(m89createV8AdapterIoAF18A);
        if (a10 != null) {
            if (a10 instanceof FallbackException) {
                createV6Adapter$default = createV6Adapter(context, ((FallbackException) a10).getDetectedVersion());
            } else {
                createV6Adapter$default = createV6Adapter$default(this, context, 0, 2, null);
            }
            m89createV8AdapterIoAF18A = createV6Adapter$default;
        }
        return (BillingClientAdapter) m89createV8AdapterIoAF18A;
    }
}
