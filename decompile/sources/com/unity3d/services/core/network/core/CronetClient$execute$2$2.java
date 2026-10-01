package com.unity3d.services.core.network.core;

import he.y;
import kotlin.jvm.internal.l;
import org.chromium.net.UrlRequest;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class CronetClient$execute$2$2 extends l implements ve.l {
    final /* synthetic */ UrlRequest $req;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CronetClient$execute$2$2(UrlRequest urlRequest) {
        super(1);
        this.$req = urlRequest;
    }

    @Override // ve.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return y.f6101a;
    }

    public final void invoke(Throwable th) {
        this.$req.cancel();
    }
}
