package fd;

import com.playfy.tv.activities.FullBannerActivity;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f5166x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ FullBannerActivity f5167y;

    public /* synthetic */ c(FullBannerActivity fullBannerActivity, int i6) {
        this.f5166x = i6;
        this.f5167y = fullBannerActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.f5166x;
        FullBannerActivity fullBannerActivity = this.f5167y;
        switch (i6) {
            case 0:
                bf.o[] oVarArr = FullBannerActivity.H;
                if (!fullBannerActivity.isFinishing() && !fullBannerActivity.isDestroyed()) {
                    fullBannerActivity.T().f3144d.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(800L).withEndAction(new c(fullBannerActivity, 1)).start();
                    return;
                }
                return;
            default:
                bf.o[] oVarArr2 = FullBannerActivity.H;
                fullBannerActivity.V();
                return;
        }
    }
}
