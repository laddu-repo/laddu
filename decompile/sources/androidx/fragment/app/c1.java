package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y f992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f993d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f994e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f995g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x0 f996h;

    public c1(int i, int i10, x0 x0Var, p0.c cVar) {
        d0.d.q(i, "finalState");
        d0.d.q(i10, "lifecycleImpact");
        y yVar = x0Var.f1130c;
        de.i.d(yVar, "fragmentStateManager.fragment");
        d0.d.q(i, "finalState");
        d0.d.q(i10, "lifecycleImpact");
        de.i.e(yVar, "fragment");
        this.f990a = i;
        this.f991b = i10;
        this.f992c = yVar;
        this.f993d = new ArrayList();
        this.f994e = new LinkedHashSet();
        cVar.a(new d1(0, this));
        this.f996h = x0Var;
    }

    public final void a() {
        LinkedHashSet linkedHashSet = this.f994e;
        if (this.f) {
            return;
        }
        this.f = true;
        if (linkedHashSet.isEmpty()) {
            b();
            return;
        }
        for (p0.c cVar : new LinkedHashSet(linkedHashSet)) {
            synchronized (cVar) {
                try {
                    if (!cVar.f10177a) {
                        cVar.f10177a = true;
                        cVar.f10179c = true;
                        p0.b bVar = cVar.f10178b;
                        if (bVar != null) {
                            try {
                                bVar.onCancel();
                            } catch (Throwable th) {
                                synchronized (cVar) {
                                    cVar.f10179c = false;
                                    cVar.notifyAll();
                                    throw th;
                                }
                            }
                        }
                        synchronized (cVar) {
                            cVar.f10179c = false;
                            cVar.notifyAll();
                        }
                    }
                } finally {
                }
            }
        }
    }

    public final void b() {
        if (!this.f995g) {
            if (q0.I(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f995g = true;
            ArrayList arrayList = this.f993d;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((Runnable) obj).run();
            }
        }
        this.f996h.k();
    }

    public final void c(int i, int i10) {
        d0.d.q(i, "finalState");
        d0.d.q(i10, "lifecycleImpact");
        int iC = y.e.c(i10);
        y yVar = this.f992c;
        if (iC == 0) {
            if (this.f990a != 1) {
                if (q0.I(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + yVar + " mFinalState = " + j4.a.y(this.f990a) + " -> " + j4.a.y(i) + '.');
                }
                this.f990a = i;
                return;
            }
            return;
        }
        if (iC == 1) {
            if (this.f990a == 1) {
                if (q0.I(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + yVar + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + j4.a.x(this.f991b) + " to ADDING.");
                }
                this.f990a = 2;
                this.f991b = 2;
                return;
            }
            return;
        }
        if (iC != 2) {
            return;
        }
        if (q0.I(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + yVar + " mFinalState = " + j4.a.y(this.f990a) + " -> REMOVED. mLifecycleImpact  = " + j4.a.x(this.f991b) + " to REMOVING.");
        }
        this.f990a = 1;
        this.f991b = 3;
    }

    public final void d() {
        int i = this.f991b;
        x0 x0Var = this.f996h;
        if (i != 2) {
            if (i == 3) {
                y yVar = x0Var.f1130c;
                de.i.d(yVar, "fragmentStateManager.fragment");
                View viewJ = yVar.J();
                if (q0.I(2)) {
                    Log.v("FragmentManager", "Clearing focus " + viewJ.findFocus() + " on view " + viewJ + " for Fragment " + yVar);
                }
                viewJ.clearFocus();
                return;
            }
            return;
        }
        y yVar2 = x0Var.f1130c;
        de.i.d(yVar2, "fragmentStateManager.fragment");
        View viewFindFocus = yVar2.f1135b0.findFocus();
        if (viewFindFocus != null) {
            yVar2.g().f1125k = viewFindFocus;
            if (q0.I(2)) {
                Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + yVar2);
            }
        }
        View viewJ2 = this.f992c.J();
        if (viewJ2.getParent() == null) {
            x0Var.b();
            viewJ2.setAlpha(0.0f);
        }
        if (viewJ2.getAlpha() == 0.0f && viewJ2.getVisibility() == 0) {
            viewJ2.setVisibility(4);
        }
        w wVar = yVar2.f1138e0;
        viewJ2.setAlpha(wVar == null ? 1.0f : wVar.f1124j);
    }

    public final String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {finalState = " + j4.a.y(this.f990a) + " lifecycleImpact = " + j4.a.x(this.f991b) + " fragment = " + this.f992c + '}';
    }
}
