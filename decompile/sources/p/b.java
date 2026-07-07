package p;

import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f10204x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f10205y;

    public /* synthetic */ b(ActionBarOverlayLayout actionBarOverlayLayout, int i6) {
        this.f10204x = i6;
        this.f10205y = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10204x) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f10205y;
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.T = actionBarOverlayLayout.A.animate().translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setListener(actionBarOverlayLayout.U);
                return;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f10205y;
                actionBarOverlayLayout2.h();
                actionBarOverlayLayout2.T = actionBarOverlayLayout2.A.animate().translationY(-actionBarOverlayLayout2.A.getHeight()).setListener(actionBarOverlayLayout2.U);
                return;
        }
    }
}
