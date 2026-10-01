package com.unity3d.ads.core.domain.billing;

import he.a;
import he.j;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class IsBillingClientAvailable {
    public final boolean invoke() {
        Object b10;
        try {
            b10 = Class.forName("com.android.billingclient.api.BillingClient");
        } catch (Throwable th) {
            b10 = a.b(th);
        }
        return !(b10 instanceof j);
    }
}
