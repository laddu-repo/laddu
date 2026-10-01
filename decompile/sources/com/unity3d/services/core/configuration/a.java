package com.unity3d.services.core.configuration;

import com.unity3d.ads.core.domain.HttpClientProvider;
import com.unity3d.services.core.configuration.InitializeThread;
import gf.c0;
import le.c;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements p {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f3411x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ HttpClientProvider f3412y;

    public /* synthetic */ a(HttpClientProvider httpClientProvider, int i6) {
        this.f3411x = i6;
        this.f3412y = httpClientProvider;
    }

    @Override // ve.p
    public final Object invoke(Object obj, Object obj2) {
        c0 c0Var = (c0) obj;
        c cVar = (c) obj2;
        switch (this.f3411x) {
            case 0:
                return InitializeThread.InitializeStateConfig.a(this.f3412y, c0Var, cVar);
            case 1:
                return InitializeThread.InitializeStateDownloadWebView.a(this.f3412y, c0Var, cVar);
            default:
                return InitializeThread.InitializeStateLoadWeb.a(this.f3412y, c0Var, cVar);
        }
    }
}
