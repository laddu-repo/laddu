package id;

import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.UnityAds;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e implements IUnityAdsShowListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f6823a;

    public e(h hVar) {
        this.f6823a = hVar;
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public final void onUnityAdsShowClick(String placementId) {
        k.e(placementId, "placementId");
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public final void onUnityAdsShowComplete(String placementId, UnityAds.UnityAdsShowCompletionState state) {
        k.e(placementId, "placementId");
        k.e(state, "state");
        h hVar = this.f6823a;
        hVar.f6833e = false;
        if (hVar.f6831c.f7841b && hVar.f6832d) {
            UnityAds.load(hVar.f6834f, new d(hVar));
        }
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public final void onUnityAdsShowFailure(String placementId, UnityAds.UnityAdsShowError error, String message) {
        k.e(placementId, "placementId");
        k.e(error, "error");
        k.e(message, "message");
        this.f6823a.f6833e = false;
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public final void onUnityAdsShowStart(String placementId) {
        k.e(placementId, "placementId");
    }
}
