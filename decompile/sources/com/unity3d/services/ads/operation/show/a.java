package com.unity3d.services.ads.operation.show;

import com.unity3d.ads.UnityAds;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ String A;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f3408x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ ShowOperationState f3409y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ UnityAds.UnityAdsShowError f3410z;

    public /* synthetic */ a(ShowOperationState showOperationState, UnityAds.UnityAdsShowError unityAdsShowError, String str, int i6) {
        this.f3408x = i6;
        this.f3409y = showOperationState;
        this.f3410z = unityAdsShowError;
        this.A = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3408x) {
            case 0:
                ShowModuleDecoratorTimeout.a(this.f3409y, this.f3410z, this.A);
                return;
            default:
                this.f3409y.lambda$onUnityAdsShowFailure$0(this.f3410z, this.A);
                return;
        }
    }
}
