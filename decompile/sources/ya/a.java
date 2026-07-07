package ya;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a extends ob.a {

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f15024y;

    public /* synthetic */ a(int i6) {
        this.f15024y = i6;
    }

    @Override // ob.a
    public final void h(TabLayout tabLayout, View view, View view2, float f3, Drawable drawable) {
        float sin;
        float cos;
        float b10;
        switch (this.f15024y) {
            case 0:
                RectF e10 = ob.a.e(tabLayout, view);
                RectF e11 = ob.a.e(tabLayout, view2);
                if (e10.left < e11.left) {
                    double d10 = (f3 * 3.141592653589793d) / 2.0d;
                    sin = (float) (1.0d - Math.cos(d10));
                    cos = (float) Math.sin(d10);
                } else {
                    double d11 = (f3 * 3.141592653589793d) / 2.0d;
                    sin = (float) Math.sin(d11);
                    cos = (float) (1.0d - Math.cos(d11));
                }
                drawable.setBounds(u9.a.c(sin, (int) e10.left, (int) e11.left), drawable.getBounds().top, u9.a.c(cos, (int) e10.right, (int) e11.right), drawable.getBounds().bottom);
                return;
            default:
                if (f3 >= 0.5f) {
                    view = view2;
                }
                RectF e12 = ob.a.e(tabLayout, view);
                if (f3 < 0.5f) {
                    b10 = u9.a.b(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.5f, f3);
                } else {
                    b10 = u9.a.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 0.5f, 1.0f, f3);
                }
                drawable.setBounds((int) e12.left, drawable.getBounds().top, (int) e12.right, drawable.getBounds().bottom);
                drawable.setAlpha((int) (b10 * 255.0f));
                return;
        }
    }
}
