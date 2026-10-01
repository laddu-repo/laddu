package qd;

import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.UnityAds;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ Throwable A;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f11207x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ IUnityAdsLoadListener f11208y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ String f11209z;

    public /* synthetic */ b(IUnityAdsLoadListener iUnityAdsLoadListener, String str, Throwable th, int i6) {
        this.f11207x = i6;
        this.f11208y = iUnityAdsLoadListener;
        this.f11209z = str;
        this.A = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11207x) {
            case 0:
                UnityAds.load$lambda$22$lambda$21$lambda$20(this.f11208y, this.f11209z, this.A);
                return;
            default:
                UnityAds.load$lambda$26$lambda$25$lambda$24(this.f11208y, this.f11209z, this.A);
                return;
        }
    }
}
