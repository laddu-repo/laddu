package androidx.lifecycle;

import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h0 extends y {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f927b = true;

    /* renamed from: c, reason: collision with root package name */
    public r.a f928c = new r.a();

    /* renamed from: d, reason: collision with root package name */
    public x f929d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f930e;

    /* renamed from: f, reason: collision with root package name */
    public int f931f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f932g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f933h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f934i;
    public final kf.f1 j;

    public h0(f0 f0Var) {
        x xVar = x.f992y;
        this.f929d = xVar;
        this.f934i = new ArrayList();
        this.f930e = new WeakReference(f0Var);
        this.j = kf.y0.c(xVar);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, androidx.lifecycle.g0] */
    @Override // androidx.lifecycle.y
    public final void a(e0 observer) {
        d0 nVar;
        Object obj;
        f0 f0Var;
        w wVar;
        kotlin.jvm.internal.k.e(observer, "observer");
        e("addObserver");
        x xVar = this.f929d;
        x xVar2 = x.f991x;
        if (xVar != xVar2) {
            xVar2 = x.f992y;
        }
        ?? obj2 = new Object();
        HashMap hashMap = j0.f946a;
        boolean z10 = observer instanceof d0;
        boolean z11 = observer instanceof l;
        int i6 = 0;
        if (z10 && z11) {
            nVar = new n((l) observer, (d0) observer);
        } else if (z11) {
            nVar = new n((l) observer, (d0) null);
        } else if (z10) {
            nVar = (d0) observer;
        } else {
            Class<?> cls = observer.getClass();
            if (j0.b(cls) == 2) {
                Object obj3 = j0.f947b.get(cls);
                kotlin.jvm.internal.k.b(obj3);
                List list = (List) obj3;
                if (list.size() != 1) {
                    int size = list.size();
                    r[] rVarArr = new r[size];
                    if (size <= 0) {
                        nVar = new h(rVarArr, i6);
                    } else {
                        j0.a((Constructor) list.get(0), observer);
                        throw null;
                    }
                } else {
                    j0.a((Constructor) list.get(0), observer);
                    throw null;
                }
            } else {
                nVar = new n(observer);
            }
        }
        obj2.f919b = nVar;
        obj2.f918a = xVar2;
        r.a aVar = this.f928c;
        r.c a10 = aVar.a(observer);
        if (a10 != null) {
            obj = a10.f11232y;
        } else {
            HashMap hashMap2 = aVar.B;
            r.c cVar = new r.c(observer, obj2);
            aVar.A++;
            r.c cVar2 = aVar.f11238y;
            if (cVar2 == null) {
                aVar.f11237x = cVar;
                aVar.f11238y = cVar;
            } else {
                cVar2.f11233z = cVar;
                cVar.A = cVar2;
                aVar.f11238y = cVar;
            }
            hashMap2.put(observer, cVar);
            obj = null;
        }
        if (((g0) obj) != null || (f0Var = (f0) this.f930e.get()) == null) {
            return;
        }
        if (this.f931f != 0 || this.f932g) {
            i6 = 1;
        }
        x d10 = d(observer);
        this.f931f++;
        while (obj2.f918a.compareTo(d10) < 0 && this.f928c.B.containsKey(observer)) {
            x xVar3 = obj2.f918a;
            ArrayList arrayList = this.f934i;
            arrayList.add(xVar3);
            u uVar = w.Companion;
            x state = obj2.f918a;
            uVar.getClass();
            kotlin.jvm.internal.k.e(state, "state");
            int ordinal = state.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        wVar = null;
                    } else {
                        wVar = w.ON_RESUME;
                    }
                } else {
                    wVar = w.ON_START;
                }
            } else {
                wVar = w.ON_CREATE;
            }
            if (wVar != null) {
                obj2.a(f0Var, wVar);
                arrayList.remove(arrayList.size() - 1);
                d10 = d(observer);
            } else {
                throw new IllegalStateException("no event up from " + obj2.f918a);
            }
        }
        if (i6 == 0) {
            i();
        }
        this.f931f--;
    }

    @Override // androidx.lifecycle.y
    public final x b() {
        return this.f929d;
    }

    @Override // androidx.lifecycle.y
    public final void c(e0 observer) {
        kotlin.jvm.internal.k.e(observer, "observer");
        e("removeObserver");
        this.f928c.b(observer);
    }

    public final x d(e0 e0Var) {
        r.c cVar;
        x xVar;
        HashMap hashMap = this.f928c.B;
        x xVar2 = null;
        if (hashMap.containsKey(e0Var)) {
            cVar = ((r.c) hashMap.get(e0Var)).A;
        } else {
            cVar = null;
        }
        if (cVar != null) {
            xVar = ((g0) cVar.f11232y).f918a;
        } else {
            xVar = null;
        }
        ArrayList arrayList = this.f934i;
        if (!arrayList.isEmpty()) {
            xVar2 = (x) arrayList.get(arrayList.size() - 1);
        }
        x state1 = this.f929d;
        kotlin.jvm.internal.k.e(state1, "state1");
        if (xVar == null || xVar.compareTo(state1) >= 0) {
            xVar = state1;
        }
        if (xVar2 != null && xVar2.compareTo(xVar) < 0) {
            return xVar2;
        }
        return xVar;
    }

    public final void e(String str) {
        if (this.f927b && !q.b.H().f10787f.I()) {
            throw new IllegalStateException(h8.c.m("Method ", str, " must be called on the main thread").toString());
        }
    }

    public final void f(w event) {
        kotlin.jvm.internal.k.e(event, "event");
        e("handleLifecycleEvent");
        g(event.a());
    }

    public final void g(x next) {
        if (this.f929d != next) {
            f0 f0Var = (f0) this.f930e.get();
            x current = this.f929d;
            kotlin.jvm.internal.k.e(current, "current");
            kotlin.jvm.internal.k.e(next, "next");
            x xVar = x.f992y;
            x xVar2 = x.f991x;
            if (current == xVar && next == xVar2) {
                throw new IllegalStateException(("State must be at least '" + x.f993z + "' to be moved to '" + next + "' in component " + f0Var).toString());
            }
            if (current == xVar2 && current != next) {
                throw new IllegalStateException(("State is '" + xVar2 + "' and cannot be moved to `" + next + "` in component " + f0Var).toString());
            }
            this.f929d = next;
            if (!this.f932g && this.f931f == 0) {
                this.f932g = true;
                i();
                this.f932g = false;
                if (this.f929d == xVar2) {
                    this.f928c = new r.a();
                    return;
                }
                return;
            }
            this.f933h = true;
        }
    }

    public final void h(x state) {
        kotlin.jvm.internal.k.e(state, "state");
        e("setCurrentState");
        g(state);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        r12.f933h = false;
        r12.j.g(r12.f929d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i() {
        /*
            Method dump skipped, instructions count: 409
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.h0.i():void");
    }
}
