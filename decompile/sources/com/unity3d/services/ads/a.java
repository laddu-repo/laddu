package com.unity3d.services.ads;

import com.unity3d.ads.IUnityAdsTokenListener;
import com.unity3d.ads.UnityAds;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f3399x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ IUnityAdsTokenListener f3400y;

    public /* synthetic */ a(IUnityAdsTokenListener iUnityAdsTokenListener, int i6) {
        this.f3399x = i6;
        this.f3400y = iUnityAdsTokenListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3399x) {
            case 0:
                UnityAdsImplementation.b(this.f3400y);
                return;
            case 1:
                UnityAds.g(this.f3400y);
                return;
            default:
                UnityAds.d(this.f3400y);
                return;
        }
    }
}
