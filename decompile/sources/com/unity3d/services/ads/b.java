package com.unity3d.services.ads;

import com.unity3d.ads.IUnityAdsInitializationListener;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f3401x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ IUnityAdsInitializationListener f3402y;

    public /* synthetic */ b(IUnityAdsInitializationListener iUnityAdsInitializationListener, int i6) {
        this.f3401x = i6;
        this.f3402y = iUnityAdsInitializationListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3401x) {
            case 0:
                UnityAdsImplementation.lambda$initialize$0(this.f3402y);
                return;
            default:
                this.f3402y.onInitializationComplete();
                return;
        }
    }
}
