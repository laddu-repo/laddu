package w4;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j0 implements Runnable {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f13919x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f13920y;

    public /* synthetic */ j0(RecyclerView recyclerView, int i6) {
        this.f13919x = i6;
        this.f13920y = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        long j;
        int i6 = this.f13919x;
        RecyclerView recyclerView = this.f13920y;
        switch (i6) {
            case 0:
                if (recyclerView.R && !recyclerView.isLayoutRequested()) {
                    if (!recyclerView.P) {
                        recyclerView.requestLayout();
                        return;
                    } else if (recyclerView.U) {
                        recyclerView.T = true;
                        return;
                    } else {
                        recyclerView.n();
                        return;
                    }
                }
                return;
            default:
                o0 o0Var = recyclerView.f1133l0;
                if (o0Var != null) {
                    m mVar = (m) o0Var;
                    long j10 = mVar.f13973d;
                    ArrayList arrayList = mVar.f13942h;
                    boolean isEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = mVar.j;
                    boolean isEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = mVar.f13944k;
                    boolean isEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = mVar.f13943i;
                    boolean isEmpty4 = arrayList4.isEmpty();
                    if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList.get(i10);
                            int i11 = i10 + 1;
                            i1 i1Var = (i1) obj;
                            View view = i1Var.f13897a;
                            ViewPropertyAnimator animate = view.animate();
                            mVar.f13950q.add(i1Var);
                            animate.setDuration(j10).alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setListener(new h(mVar, i1Var, animate, view)).start();
                            i10 = i11;
                            arrayList = arrayList;
                            isEmpty = isEmpty;
                        }
                        boolean z11 = isEmpty;
                        arrayList.clear();
                        if (!isEmpty2) {
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.addAll(arrayList2);
                            mVar.f13946m.add(arrayList5);
                            arrayList2.clear();
                            g gVar = new g(mVar, arrayList5, 0);
                            if (!z11) {
                                View view2 = ((l) arrayList5.get(0)).f13934a.f13897a;
                                WeakHashMap weakHashMap = t0.q0.f12397a;
                                view2.postOnAnimationDelayed(gVar, j10);
                            } else {
                                gVar.run();
                            }
                        }
                        if (!isEmpty3) {
                            ArrayList arrayList6 = new ArrayList();
                            arrayList6.addAll(arrayList3);
                            mVar.f13947n.add(arrayList6);
                            arrayList3.clear();
                            g gVar2 = new g(mVar, arrayList6, 1);
                            if (!z11) {
                                View view3 = ((k) arrayList6.get(0)).f13923a.f13897a;
                                WeakHashMap weakHashMap2 = t0.q0.f12397a;
                                view3.postOnAnimationDelayed(gVar2, j10);
                            } else {
                                gVar2.run();
                            }
                        }
                        if (!isEmpty4) {
                            ArrayList arrayList7 = new ArrayList();
                            arrayList7.addAll(arrayList4);
                            mVar.f13945l.add(arrayList7);
                            arrayList4.clear();
                            g gVar3 = new g(mVar, arrayList7, 2);
                            if (z11 && isEmpty2 && isEmpty3) {
                                gVar3.run();
                            } else {
                                long j11 = 0;
                                if (z11) {
                                    j10 = 0;
                                }
                                if (!isEmpty2) {
                                    j = mVar.f13974e;
                                } else {
                                    j = 0;
                                }
                                if (!isEmpty3) {
                                    j11 = mVar.f13975f;
                                }
                                long max = Math.max(j, j11) + j10;
                                z10 = false;
                                View view4 = ((i1) arrayList7.get(0)).f13897a;
                                WeakHashMap weakHashMap3 = t0.q0.f12397a;
                                view4.postOnAnimationDelayed(gVar3, max);
                                recyclerView.J0 = z10;
                                return;
                            }
                        }
                    }
                }
                z10 = false;
                recyclerView.J0 = z10;
                return;
        }
    }
}
