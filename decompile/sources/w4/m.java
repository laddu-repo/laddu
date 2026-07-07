package w4;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class m extends o0 {
    public static TimeInterpolator s;

    /* renamed from: g, reason: collision with root package name */
    public boolean f13941g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f13942h;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f13943i;
    public ArrayList j;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f13944k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f13945l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f13946m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f13947n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f13948o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f13949p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f13950q;

    /* renamed from: r, reason: collision with root package name */
    public ArrayList f13951r;

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((i1) arrayList.get(size)).f13897a.animate().cancel();
        }
    }

    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Object, w4.k] */
    @Override // w4.o0
    public final boolean a(i1 i1Var, i1 i1Var2, b2.j jVar, b2.j jVar2) {
        int i6;
        int i10;
        int i11 = jVar.f1380a;
        int i12 = jVar.f1381b;
        if (i1Var2.p()) {
            int i13 = jVar.f1380a;
            i10 = jVar.f1381b;
            i6 = i13;
        } else {
            i6 = jVar2.f1380a;
            i10 = jVar2.f1381b;
        }
        if (i1Var == i1Var2) {
            return g(i1Var, i11, i12, i6, i10);
        }
        View view = i1Var.f13897a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        l(i1Var);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = i1Var2.f13897a;
        l(i1Var2);
        view2.setTranslationX(-((int) ((i6 - i11) - translationX)));
        view2.setTranslationY(-((int) ((i10 - i12) - translationY)));
        view2.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ArrayList arrayList = this.f13944k;
        ?? obj = new Object();
        obj.f13923a = i1Var;
        obj.f13924b = i1Var2;
        obj.f13925c = i11;
        obj.f13926d = i12;
        obj.f13927e = i6;
        obj.f13928f = i10;
        arrayList.add(obj);
        return true;
    }

    @Override // w4.o0
    public final void d(i1 i1Var) {
        ArrayList arrayList = this.f13945l;
        ArrayList arrayList2 = this.f13946m;
        ArrayList arrayList3 = this.f13947n;
        View view = i1Var.f13897a;
        view.animate().cancel();
        ArrayList arrayList4 = this.j;
        int size = arrayList4.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((l) arrayList4.get(size)).f13934a == i1Var) {
                view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                view.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                c(i1Var);
                arrayList4.remove(size);
            }
        }
        j(this.f13944k, i1Var);
        if (this.f13942h.remove(i1Var)) {
            view.setAlpha(1.0f);
            c(i1Var);
        }
        if (this.f13943i.remove(i1Var)) {
            view.setAlpha(1.0f);
            c(i1Var);
        }
        for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList5 = (ArrayList) arrayList3.get(size2);
            j(arrayList5, i1Var);
            if (arrayList5.isEmpty()) {
                arrayList3.remove(size2);
            }
        }
        for (int size3 = arrayList2.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList6 = (ArrayList) arrayList2.get(size3);
            int size4 = arrayList6.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((l) arrayList6.get(size4)).f13934a == i1Var) {
                    view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    view.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    c(i1Var);
                    arrayList6.remove(size4);
                    if (arrayList6.isEmpty()) {
                        arrayList2.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = arrayList.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList.get(size5);
            if (arrayList7.remove(i1Var)) {
                view.setAlpha(1.0f);
                c(i1Var);
                if (arrayList7.isEmpty()) {
                    arrayList.remove(size5);
                }
            }
        }
        this.f13950q.remove(i1Var);
        this.f13948o.remove(i1Var);
        this.f13951r.remove(i1Var);
        this.f13949p.remove(i1Var);
        i();
    }

    @Override // w4.o0
    public final void e() {
        ArrayList arrayList = this.f13947n;
        ArrayList arrayList2 = this.f13945l;
        ArrayList arrayList3 = this.f13946m;
        ArrayList arrayList4 = this.f13944k;
        ArrayList arrayList5 = this.f13943i;
        ArrayList arrayList6 = this.f13942h;
        ArrayList arrayList7 = this.j;
        int size = arrayList7.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            l lVar = (l) arrayList7.get(size);
            View view = lVar.f13934a.f13897a;
            view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            view.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            c(lVar.f13934a);
            arrayList7.remove(size);
        }
        for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
            c((i1) arrayList6.get(size2));
            arrayList6.remove(size2);
        }
        int size3 = arrayList5.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            i1 i1Var = (i1) arrayList5.get(size3);
            i1Var.f13897a.setAlpha(1.0f);
            c(i1Var);
            arrayList5.remove(size3);
        }
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            k kVar = (k) arrayList4.get(size4);
            i1 i1Var2 = kVar.f13923a;
            if (i1Var2 != null) {
                k(kVar, i1Var2);
            }
            i1 i1Var3 = kVar.f13924b;
            if (i1Var3 != null) {
                k(kVar, i1Var3);
            }
        }
        arrayList4.clear();
        if (!f()) {
            return;
        }
        for (int size5 = arrayList3.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList8 = (ArrayList) arrayList3.get(size5);
            for (int size6 = arrayList8.size() - 1; size6 >= 0; size6--) {
                l lVar2 = (l) arrayList8.get(size6);
                View view2 = lVar2.f13934a.f13897a;
                view2.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                view2.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                c(lVar2.f13934a);
                arrayList8.remove(size6);
                if (arrayList8.isEmpty()) {
                    arrayList3.remove(arrayList8);
                }
            }
        }
        for (int size7 = arrayList2.size() - 1; size7 >= 0; size7--) {
            ArrayList arrayList9 = (ArrayList) arrayList2.get(size7);
            for (int size8 = arrayList9.size() - 1; size8 >= 0; size8--) {
                i1 i1Var4 = (i1) arrayList9.get(size8);
                i1Var4.f13897a.setAlpha(1.0f);
                c(i1Var4);
                arrayList9.remove(size8);
                if (arrayList9.isEmpty()) {
                    arrayList2.remove(arrayList9);
                }
            }
        }
        for (int size9 = arrayList.size() - 1; size9 >= 0; size9--) {
            ArrayList arrayList10 = (ArrayList) arrayList.get(size9);
            for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                k kVar2 = (k) arrayList10.get(size10);
                i1 i1Var5 = kVar2.f13923a;
                if (i1Var5 != null) {
                    k(kVar2, i1Var5);
                }
                i1 i1Var6 = kVar2.f13924b;
                if (i1Var6 != null) {
                    k(kVar2, i1Var6);
                }
                if (arrayList10.isEmpty()) {
                    arrayList.remove(arrayList10);
                }
            }
        }
        h(this.f13950q);
        h(this.f13949p);
        h(this.f13948o);
        h(this.f13951r);
        ArrayList arrayList11 = this.f13971b;
        if (arrayList11.size() <= 0) {
            arrayList11.clear();
            return;
        }
        throw h8.c.h(0, arrayList11);
    }

    @Override // w4.o0
    public final boolean f() {
        if (this.f13943i.isEmpty() && this.f13944k.isEmpty() && this.j.isEmpty() && this.f13942h.isEmpty() && this.f13949p.isEmpty() && this.f13950q.isEmpty() && this.f13948o.isEmpty() && this.f13951r.isEmpty() && this.f13946m.isEmpty() && this.f13945l.isEmpty() && this.f13947n.isEmpty()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, w4.l] */
    public final boolean g(i1 i1Var, int i6, int i10, int i11, int i12) {
        View view = i1Var.f13897a;
        int translationX = i6 + ((int) view.getTranslationX());
        int translationY = i10 + ((int) i1Var.f13897a.getTranslationY());
        l(i1Var);
        int i13 = i11 - translationX;
        int i14 = i12 - translationY;
        if (i13 == 0 && i14 == 0) {
            c(i1Var);
            return false;
        }
        if (i13 != 0) {
            view.setTranslationX(-i13);
        }
        if (i14 != 0) {
            view.setTranslationY(-i14);
        }
        ArrayList arrayList = this.j;
        ?? obj = new Object();
        obj.f13934a = i1Var;
        obj.f13935b = translationX;
        obj.f13936c = translationY;
        obj.f13937d = i11;
        obj.f13938e = i12;
        arrayList.add(obj);
        return true;
    }

    public final void i() {
        if (!f()) {
            ArrayList arrayList = this.f13971b;
            if (arrayList.size() <= 0) {
                arrayList.clear();
                return;
            }
            throw h8.c.h(0, arrayList);
        }
    }

    public final void j(ArrayList arrayList, i1 i1Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            k kVar = (k) arrayList.get(size);
            if (k(kVar, i1Var) && kVar.f13923a == null && kVar.f13924b == null) {
                arrayList.remove(kVar);
            }
        }
    }

    public final boolean k(k kVar, i1 i1Var) {
        if (kVar.f13924b == i1Var) {
            kVar.f13924b = null;
        } else if (kVar.f13923a == i1Var) {
            kVar.f13923a = null;
        } else {
            return false;
        }
        View view = i1Var.f13897a;
        View view2 = i1Var.f13897a;
        view.setAlpha(1.0f);
        view2.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        view2.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        c(i1Var);
        return true;
    }

    public final void l(i1 i1Var) {
        if (s == null) {
            s = new ValueAnimator().getInterpolator();
        }
        i1Var.f13897a.animate().setInterpolator(s);
        d(i1Var);
    }
}
