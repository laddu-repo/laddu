package t0;

import android.graphics.Insets;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a1 extends WindowInsetsAnimation.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final ic.o f12315a;

    /* renamed from: b, reason: collision with root package name */
    public List f12316b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f12317c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f12318d;

    public a1(ic.o oVar) {
        super(0);
        this.f12318d = new HashMap();
        this.f12315a = oVar;
    }

    public final d1 a(WindowInsetsAnimation windowInsetsAnimation) {
        d1 d1Var = (d1) this.f12318d.get(windowInsetsAnimation);
        if (d1Var == null) {
            d1Var = new d1(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                d1Var.f12338a = new b1(windowInsetsAnimation);
            }
            this.f12318d.put(windowInsetsAnimation, d1Var);
        }
        return d1Var;
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        ic.o oVar = this.f12315a;
        a(windowInsetsAnimation);
        ((View) oVar.f6773d).setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.f12318d.remove(windowInsetsAnimation);
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        ic.o oVar = this.f12315a;
        a(windowInsetsAnimation);
        View view = (View) oVar.f6773d;
        int[] iArr = (int[]) oVar.f6774e;
        view.getLocationOnScreen(iArr);
        oVar.f6770a = iArr[1];
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        float fraction;
        ArrayList arrayList = this.f12317c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f12317c = arrayList2;
            this.f12316b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation l10 = a2.o.l(list.get(size));
            d1 a10 = a(l10);
            fraction = l10.getFraction();
            a10.f12338a.d(fraction);
            this.f12317c.add(a10);
        }
        ic.o oVar = this.f12315a;
        w1 h4 = w1.h(null, windowInsets);
        oVar.f(h4, this.f12316b);
        return h4.g();
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        Insets lowerBound;
        Insets upperBound;
        ic.o oVar = this.f12315a;
        a(windowInsetsAnimation);
        lowerBound = bounds.getLowerBound();
        l0.c c10 = l0.c.c(lowerBound);
        upperBound = bounds.getUpperBound();
        l0.c c11 = l0.c.c(upperBound);
        View view = (View) oVar.f6773d;
        int[] iArr = (int[]) oVar.f6774e;
        view.getLocationOnScreen(iArr);
        int i6 = oVar.f6770a - iArr[1];
        oVar.f6771b = i6;
        view.setTranslationY(i6);
        a2.o.y();
        return a2.o.j(c10.d(), c11.d());
    }
}
