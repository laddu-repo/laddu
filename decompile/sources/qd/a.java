package qd;

import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.UnityAds;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f11204x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ IUnityAdsInitializationListener f11205y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Throwable f11206z;

    public /* synthetic */ a(IUnityAdsInitializationListener iUnityAdsInitializationListener, Throwable th, int i6) {
        this.f11204x = i6;
        this.f11205y = iUnityAdsInitializationListener;
        this.f11206z = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11204x) {
            case 0:
                UnityAds.initialize$lambda$9$lambda$8$lambda$7(this.f11205y, this.f11206z);
                return;
            default:
                UnityAds.initialize$lambda$4$lambda$3$lambda$2(this.f11205y, this.f11206z);
                return;
        }
    }
}
