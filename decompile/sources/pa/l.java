package pa;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import i.m0;
import java.util.Iterator;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10689a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10690b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10691c;

    public /* synthetic */ l(int i6, Object obj, Object obj2) {
        this.f10689a = i6;
        this.f10690b = obj;
        this.f10691c = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i6 = this.f10689a;
        Object obj = this.f10691c;
        Object obj2 = this.f10690b;
        switch (i6) {
            case 0:
                m mVar = (m) obj2;
                e eVar = (e) obj;
                mVar.getClass();
                if (eVar.b(true) && eVar.f10644m != 0 && mVar.isVisible()) {
                    mVar.invalidateSelf();
                    return;
                }
                return;
            case 1:
                ((View) ((m0) ((u5.r) obj2).f12916y).f6231e.getParent()).invalidate();
                return;
            default:
                AppBarLayout appBarLayout = (AppBarLayout) obj2;
                int i10 = AppBarLayout.f2559a0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((ua.i) obj).p(floatValue);
                Drawable drawable = appBarLayout.T;
                if (drawable instanceof ua.i) {
                    ((ua.i) drawable).p(floatValue);
                }
                Iterator it = appBarLayout.N.iterator();
                if (!it.hasNext()) {
                    Iterator it2 = appBarLayout.O.iterator();
                    if (!it2.hasNext()) {
                        return;
                    } else {
                        throw r4.a.i(it2);
                    }
                }
                throw r4.a.i(it);
        }
    }
}
