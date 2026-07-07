package i;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.unity3d.services.UnityAdsConstants;
import java.util.WeakHashMap;
import t0.q0;
import t0.w0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class k0 extends w0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6222a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f6223b;

    public /* synthetic */ k0(m0 m0Var, int i6) {
        this.f6222a = i6;
        this.f6223b = m0Var;
    }

    @Override // t0.v0
    public final void c() {
        View view;
        int i6 = this.f6222a;
        m0 m0Var = this.f6223b;
        switch (i6) {
            case 0:
                if (m0Var.f6241p && (view = m0Var.f6234h) != null) {
                    view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    m0Var.f6231e.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                m0Var.f6231e.setVisibility(8);
                m0Var.f6231e.setTransitioning(false);
                m0Var.f6244t = null;
                j4.b0 b0Var = m0Var.f6237l;
                if (b0Var != null) {
                    b0Var.v(m0Var.f6236k);
                    m0Var.f6236k = null;
                    m0Var.f6237l = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = m0Var.f6230d;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = q0.f12397a;
                    t0.f0.c(actionBarOverlayLayout);
                    return;
                }
                return;
            default:
                m0Var.f6244t = null;
                m0Var.f6231e.requestLayout();
                return;
        }
    }
}
