package w4;

import android.view.View;
import android.view.ViewPropertyAnimator;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g implements Runnable {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f13873x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ ArrayList f13874y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ m f13875z;

    public /* synthetic */ g(m mVar, ArrayList arrayList, int i6) {
        this.f13873x = i6;
        this.f13875z = mVar;
        this.f13874y = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        switch (this.f13873x) {
            case 0:
                ArrayList arrayList = this.f13874y;
                int size = arrayList.size();
                int i6 = 0;
                while (true) {
                    m mVar = this.f13875z;
                    if (i6 < size) {
                        Object obj = arrayList.get(i6);
                        i6++;
                        l lVar = (l) obj;
                        i1 i1Var = lVar.f13934a;
                        int i10 = lVar.f13935b;
                        int i11 = lVar.f13936c;
                        int i12 = lVar.f13937d;
                        int i13 = lVar.f13938e;
                        mVar.getClass();
                        View view2 = i1Var.f13897a;
                        int i14 = i12 - i10;
                        int i15 = i13 - i11;
                        if (i14 != 0) {
                            view2.animate().translationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        }
                        if (i15 != 0) {
                            view2.animate().translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        }
                        ViewPropertyAnimator animate = view2.animate();
                        mVar.f13949p.add(i1Var);
                        animate.setDuration(mVar.f13974e).setListener(new i(mVar, i1Var, i14, view2, i15, animate)).start();
                    } else {
                        arrayList.clear();
                        mVar.f13946m.remove(arrayList);
                        return;
                    }
                }
            case 1:
                ArrayList arrayList2 = this.f13874y;
                int size2 = arrayList2.size();
                int i16 = 0;
                while (true) {
                    m mVar2 = this.f13875z;
                    if (i16 < size2) {
                        Object obj2 = arrayList2.get(i16);
                        i16++;
                        k kVar = (k) obj2;
                        ArrayList arrayList3 = mVar2.f13951r;
                        long j = mVar2.f13975f;
                        i1 i1Var2 = kVar.f13923a;
                        View view3 = null;
                        if (i1Var2 == null) {
                            view = null;
                        } else {
                            view = i1Var2.f13897a;
                        }
                        i1 i1Var3 = kVar.f13924b;
                        if (i1Var3 != null) {
                            view3 = i1Var3.f13897a;
                        }
                        View view4 = view3;
                        if (view != null) {
                            ViewPropertyAnimator duration = view.animate().setDuration(j);
                            arrayList3.add(kVar.f13923a);
                            duration.translationX(kVar.f13927e - kVar.f13925c);
                            duration.translationY(kVar.f13928f - kVar.f13926d);
                            duration.alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setListener(new j(mVar2, kVar, duration, view, 0)).start();
                        }
                        if (view4 != null) {
                            ViewPropertyAnimator animate2 = view4.animate();
                            arrayList3.add(kVar.f13924b);
                            animate2.translationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(j).alpha(1.0f).setListener(new j(mVar2, kVar, animate2, view4, 1)).start();
                        }
                    } else {
                        arrayList2.clear();
                        mVar2.f13947n.remove(arrayList2);
                        return;
                    }
                }
            default:
                ArrayList arrayList4 = this.f13874y;
                int size3 = arrayList4.size();
                int i17 = 0;
                while (true) {
                    m mVar3 = this.f13875z;
                    if (i17 < size3) {
                        Object obj3 = arrayList4.get(i17);
                        i17++;
                        i1 i1Var4 = (i1) obj3;
                        mVar3.getClass();
                        View view5 = i1Var4.f13897a;
                        ViewPropertyAnimator animate3 = view5.animate();
                        mVar3.f13948o.add(i1Var4);
                        animate3.alpha(1.0f).setDuration(mVar3.f13972c).setListener(new h(mVar3, i1Var4, view5, animate3)).start();
                    } else {
                        arrayList4.clear();
                        mVar3.f13945l.remove(arrayList4);
                        return;
                    }
                }
        }
    }
}
