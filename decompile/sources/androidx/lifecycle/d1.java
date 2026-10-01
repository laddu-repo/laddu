package androidx.lifecycle;

import android.os.Bundle;
import gf.c2;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class d1 {

    /* renamed from: a, reason: collision with root package name */
    public static final ua.f f902a;

    /* renamed from: b, reason: collision with root package name */
    public static final w8.l f903b;

    /* renamed from: c, reason: collision with root package name */
    public static final zb.d f904c;

    /* renamed from: d, reason: collision with root package name */
    public static final o5.e0 f905d = new Object();

    /* JADX WARN: Type inference failed for: r0v3, types: [o5.e0, java.lang.Object] */
    static {
        int i6 = 3;
        f902a = new ua.f(i6);
        f903b = new w8.l(i6);
        f904c = new zb.d(i6);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [androidx.lifecycle.o0, java.lang.Object, androidx.lifecycle.k] */
    /* JADX WARN: Type inference failed for: r4v2, types: [androidx.lifecycle.d, java.lang.Object] */
    public static k a(kf.h hVar) {
        kotlin.jvm.internal.k.e(hVar, "<this>");
        int i6 = 0;
        q qVar = new q(hVar, null, i6);
        ?? o0Var = new o0();
        o0Var.f951l = new r.f();
        gf.m1 m1Var = new gf.m1(null);
        of.e eVar = gf.o0.f5693a;
        mf.e b10 = gf.f0.b(mf.o.f8875a.A.plus(le.i.f8353x).plus(m1Var));
        i iVar = new i(o0Var, i6);
        ?? obj = new Object();
        obj.f896a = o0Var;
        obj.f897b = qVar;
        obj.f898c = b10;
        obj.f899d = iVar;
        o0Var.f952m = obj;
        if (hVar instanceof kf.d1) {
            if (q.b.H().f10787f.I()) {
                o0Var.h(((kf.d1) hVar).getValue());
                return o0Var;
            }
            o0Var.g(((kf.d1) hVar).getValue());
        }
        return o0Var;
    }

    public static final void b(k1 k1Var, e5.e registry, y lifecycle) {
        kotlin.jvm.internal.k.e(registry, "registry");
        kotlin.jvm.internal.k.e(lifecycle, "lifecycle");
        b1 b1Var = (b1) k1Var.d("androidx.lifecycle.savedstate.vm.tag");
        if (b1Var != null && !b1Var.f889z) {
            b1Var.a0(lifecycle, registry);
            x b10 = lifecycle.b();
            if (b10 != x.f992y && b10.compareTo(x.A) < 0) {
                lifecycle.a(new n(lifecycle, registry));
            } else {
                registry.d();
            }
        }
    }

    public static final a1 c(o1.c cVar) {
        e1 e1Var;
        a1 a1Var;
        kotlin.jvm.internal.k.e(cVar, "<this>");
        e5.g gVar = (e5.g) cVar.a(f902a);
        if (gVar != null) {
            q1 q1Var = (q1) cVar.a(f903b);
            if (q1Var != null) {
                Bundle bundle = (Bundle) cVar.a(f904c);
                String str = (String) cVar.a(o1.f978b);
                if (str != null) {
                    e5.d b10 = gVar.getSavedStateRegistry().b();
                    Bundle bundle2 = null;
                    if (b10 instanceof e1) {
                        e1Var = (e1) b10;
                    } else {
                        e1Var = null;
                    }
                    if (e1Var != null) {
                        LinkedHashMap linkedHashMap = f(q1Var).f914b;
                        a1 a1Var2 = (a1) linkedHashMap.get(str);
                        if (a1Var2 == null) {
                            e1Var.b();
                            Bundle bundle3 = e1Var.f910c;
                            if (bundle3 != null && bundle3.containsKey(str)) {
                                Bundle bundle4 = bundle3.getBundle(str);
                                if (bundle4 == null) {
                                    bundle4 = k6.e.b((he.i[]) Arrays.copyOf(new he.i[0], 0));
                                }
                                bundle3.remove(str);
                                if (bundle3.isEmpty()) {
                                    e1Var.f910c = null;
                                }
                                bundle2 = bundle4;
                            }
                            if (bundle2 != null) {
                                bundle = bundle2;
                            }
                            if (bundle == null) {
                                a1Var = new a1();
                            } else {
                                ClassLoader classLoader = a1.class.getClassLoader();
                                kotlin.jvm.internal.k.b(classLoader);
                                bundle.setClassLoader(classLoader);
                                a1Var = new a1(a8.i.s(bundle));
                            }
                            linkedHashMap.put(str, a1Var);
                            return a1Var;
                        }
                        return a1Var2;
                    }
                    throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
                }
                throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            }
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
    }

    public static final void d(e5.g gVar) {
        x b10 = gVar.getLifecycle().b();
        if (b10 != x.f992y && b10 != x.f993z) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (gVar.getSavedStateRegistry().b() == null) {
            e1 e1Var = new e1(gVar.getSavedStateRegistry(), (q1) gVar);
            gVar.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider", e1Var);
            gVar.getLifecycle().a(new h(e1Var, 1));
        }
    }

    public static final a0 e(f0 f0Var) {
        kotlin.jvm.internal.k.e(f0Var, "<this>");
        y lifecycle = f0Var.getLifecycle();
        kotlin.jvm.internal.k.e(lifecycle, "<this>");
        o1 o1Var = lifecycle.f994a;
        while (true) {
            a0 a0Var = (a0) ((AtomicReference) o1Var.f979a).get();
            if (a0Var != null) {
                return a0Var;
            }
            c2 e10 = gf.f0.e();
            of.e eVar = gf.o0.f5693a;
            a0 a0Var2 = new a0(lifecycle, cf.m.A(e10, mf.o.f8875a.A));
            AtomicReference atomicReference = (AtomicReference) o1Var.f979a;
            do {
                le.c cVar = null;
                if (atomicReference.compareAndSet(null, a0Var2)) {
                    of.e eVar2 = gf.o0.f5693a;
                    gf.f0.w(a0Var2, mf.o.f8875a.A, new z(a0Var2, cVar, 0), 2);
                    return a0Var2;
                }
            } while (atomicReference.get() == null);
        }
    }

    public static final f1 f(q1 q1Var) {
        o1 p10 = w8.l.p(q1Var, new c1(0));
        return (f1) ((ic.s) p10.f979a).p("androidx.lifecycle.internal.SavedStateHandlesVM", kotlin.jvm.internal.x.a(f1.class));
    }

    public static final p1.a g(k1 k1Var) {
        p1.a aVar;
        kotlin.jvm.internal.k.e(k1Var, "<this>");
        synchronized (f905d) {
            aVar = (p1.a) k1Var.d("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (aVar == null) {
                le.h hVar = le.i.f8353x;
                try {
                    of.e eVar = gf.o0.f5693a;
                    hVar = mf.o.f8875a.A;
                } catch (he.h | IllegalStateException unused) {
                }
                p1.a aVar2 = new p1.a(hVar.plus(gf.f0.e()));
                k1Var.b("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", aVar2);
                aVar = aVar2;
            }
        }
        return aVar;
    }

    public static z7.b h(k1 k1Var, ve.p pVar) {
        of.e eVar = gf.o0.f5693a;
        hf.d dispatcher = mf.o.f8875a;
        kotlin.jvm.internal.k.e(dispatcher, "dispatcher");
        z7.b bVar = new z7.b(dispatcher);
        gf.f0.w(bVar, le.i.f8353x, new dd.c(bVar, pVar, (le.c) null), 2).y(new b1.r(bVar, 6));
        p1.b bVar2 = k1Var.f954a;
        if (bVar2 != null) {
            bVar2.a(bVar);
        }
        return bVar;
    }
}
