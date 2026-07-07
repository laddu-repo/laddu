package id;

import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.UnityAds;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a implements IUnityAdsInitializationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f6816a;

    public a(h hVar) {
        this.f6816a = hVar;
    }

    @Override // com.unity3d.ads.IUnityAdsInitializationListener
    public final void onInitializationComplete() {
        h hVar = this.f6816a;
        hVar.f6832d = true;
        if (hVar.f6831c.f7841b) {
            UnityAds.load(hVar.f6834f, new d(hVar));
        }
    }

    @Override // com.unity3d.ads.IUnityAdsInitializationListener
    public final void onInitializationFailed(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str) {
    }
}
