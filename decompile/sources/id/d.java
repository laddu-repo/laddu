package id;

import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.UnityAds;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d implements IUnityAdsLoadListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f6822a;

    public d(h hVar) {
        this.f6822a = hVar;
    }

    @Override // com.unity3d.ads.IUnityAdsLoadListener
    public final void onUnityAdsAdLoaded(String placementId) {
        k.e(placementId, "placementId");
        this.f6822a.f6833e = true;
    }

    @Override // com.unity3d.ads.IUnityAdsLoadListener
    public final void onUnityAdsFailedToLoad(String placementId, UnityAds.UnityAdsLoadError error, String message) {
        k.e(placementId, "placementId");
        k.e(error, "error");
        k.e(message, "message");
        this.f6822a.f6833e = false;
    }
}
