package j1;

import android.util.Log;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public int f6874a;

    /* renamed from: b, reason: collision with root package name */
    public int f6875b;

    /* renamed from: c, reason: collision with root package name */
    public final y f6876c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f6877d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f6878e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f6879f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f6880g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f6881h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f6882i;
    public final ArrayList j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f6883k;

    /* renamed from: l, reason: collision with root package name */
    public final v0 f6884l;

    public a1(int i6, int i10, v0 v0Var) {
        h8.c.o(i6, "finalState");
        h8.c.o(i10, "lifecycleImpact");
        y fragment = v0Var.f6992c;
        kotlin.jvm.internal.k.d(fragment, "fragmentStateManager.fragment");
        h8.c.o(i6, "finalState");
        h8.c.o(i10, "lifecycleImpact");
        kotlin.jvm.internal.k.e(fragment, "fragment");
        this.f6874a = i6;
        this.f6875b = i10;
        this.f6876c = fragment;
        this.f6877d = new ArrayList();
        this.f6882i = true;
        ArrayList arrayList = new ArrayList();
        this.j = arrayList;
        this.f6883k = arrayList;
        this.f6884l = v0Var;
    }

    public final void a(ViewGroup container) {
        kotlin.jvm.internal.k.e(container, "container");
        this.f6881h = false;
        if (!this.f6878e) {
            this.f6878e = true;
            if (this.j.isEmpty()) {
                b();
                return;
            }
            for (z0 z0Var : ie.j.Z(this.f6883k)) {
                z0Var.getClass();
                if (!z0Var.f7049b) {
                    z0Var.a(container);
                }
                z0Var.f7049b = true;
            }
        }
    }

    public final void b() {
        this.f6881h = false;
        if (!this.f6879f) {
            if (p0.L(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f6879f = true;
            ArrayList arrayList = this.f6877d;
            int size = arrayList.size();
            int i6 = 0;
            while (i6 < size) {
                Object obj = arrayList.get(i6);
                i6++;
                ((Runnable) obj).run();
            }
        }
        this.f6876c.K = false;
        this.f6884l.k();
    }

    public final void c(z0 z0Var) {
        ArrayList arrayList = this.j;
        if (arrayList.remove(z0Var) && arrayList.isEmpty()) {
            b();
        }
    }

    public final void d(int i6, int i10) {
        h8.c.o(i6, "finalState");
        h8.c.o(i10, "lifecycleImpact");
        int c10 = y.e.c(i10);
        y yVar = this.f6876c;
        if (c10 != 0) {
            if (c10 != 1) {
                if (c10 == 2) {
                    if (p0.L(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + yVar + " mFinalState = " + h8.c.v(this.f6874a) + " -> REMOVED. mLifecycleImpact  = " + h8.c.u(this.f6875b) + " to REMOVING.");
                    }
                    this.f6874a = 1;
                    this.f6875b = 3;
                    this.f6882i = true;
                    return;
                }
                return;
            }
            if (this.f6874a == 1) {
                if (p0.L(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + yVar + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + h8.c.u(this.f6875b) + " to ADDING.");
                }
                this.f6874a = 2;
                this.f6875b = 2;
                this.f6882i = true;
                return;
            }
            return;
        }
        if (this.f6874a != 1) {
            if (p0.L(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: For fragment " + yVar + " mFinalState = " + h8.c.v(this.f6874a) + " -> " + h8.c.v(i6) + '.');
            }
            this.f6874a = i6;
        }
    }

    public final String toString() {
        StringBuilder q9 = r4.a.q("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
        q9.append(h8.c.v(this.f6874a));
        q9.append(" lifecycleImpact = ");
        q9.append(h8.c.u(this.f6875b));
        q9.append(" fragment = ");
        q9.append(this.f6876c);
        q9.append('}');
        return q9.toString();
    }
}
