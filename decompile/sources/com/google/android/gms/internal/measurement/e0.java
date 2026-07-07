package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final c6.h f2192a;

    /* renamed from: b, reason: collision with root package name */
    public ic.s f2193b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.lifecycle.j1 f2194c;

    /* renamed from: d, reason: collision with root package name */
    public final t f2195d;

    public e0() {
        c6.h hVar = new c6.h(2);
        this.f2192a = hVar;
        this.f2193b = ((ic.s) hVar.f1982y).C();
        this.f2194c = new androidx.lifecycle.j1(7);
        this.f2195d = new t(3);
        final int i6 = 1;
        Callable callable = new Callable(this) { // from class: com.google.android.gms.internal.measurement.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e0 f2138b;

            {
                this.f2138b = this;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                switch (i6) {
                    case 0:
                        return new m4(this.f2138b.f2194c);
                    default:
                        return new m4(this.f2138b.f2195d);
                }
            }
        };
        a6 a6Var = (a6) hVar.A;
        ((HashMap) a6Var.f2145a).put("internal.registerCallback", callable);
        final int i10 = 0;
        ((HashMap) a6Var.f2145a).put("internal.eventLogger", new Callable(this) { // from class: com.google.android.gms.internal.measurement.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e0 f2138b;

            {
                this.f2138b = this;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                switch (i10) {
                    case 0:
                        return new m4(this.f2138b.f2194c);
                    default:
                        return new m4(this.f2138b.f2195d);
                }
            }
        });
    }

    public final boolean a(b bVar) {
        androidx.lifecycle.j1 j1Var = this.f2194c;
        try {
            j1Var.f949y = bVar;
            j1Var.f950z = bVar.clone();
            ((ArrayList) j1Var.A).clear();
            ((ic.s) this.f2192a.f1983z).E("runtime.counter", new g(Double.valueOf(0.0d)));
            this.f2195d.d(this.f2193b.C(), j1Var);
            if (((b) j1Var.f950z).equals((b) j1Var.f949y)) {
                if (((ArrayList) j1Var.A).isEmpty()) {
                    return false;
                }
                return true;
            }
            return true;
        } catch (Throwable th) {
            throw new Exception(th);
        }
    }

    public final void b(w3 w3Var) {
        h hVar;
        try {
            c6.h hVar2 = this.f2192a;
            this.f2193b = ((ic.s) hVar2.f1982y).C();
            if (!(hVar2.D(this.f2193b, (x3[]) w3Var.p().toArray(new x3[0])) instanceof f)) {
                for (v3 v3Var : w3Var.q().p()) {
                    List q9 = v3Var.q();
                    String p10 = v3Var.p();
                    Iterator it = q9.iterator();
                    while (it.hasNext()) {
                        n D = hVar2.D(this.f2193b, (x3) it.next());
                        if (D instanceof k) {
                            ic.s sVar = this.f2193b;
                            if (!sVar.D(p10)) {
                                hVar = null;
                            } else {
                                n G = sVar.G(p10);
                                if (G instanceof h) {
                                    hVar = (h) G;
                                } else {
                                    throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(p10)));
                                }
                            }
                            if (hVar != null) {
                                hVar.i(this.f2193b, Collections.singletonList(D));
                            } else {
                                throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(p10)));
                            }
                        } else {
                            throw new IllegalArgumentException("Invalid rule definition");
                        }
                    }
                }
                return;
            }
            throw new IllegalStateException("Program loading failed");
        } catch (Throwable th) {
            throw new Exception(th);
        }
    }
}
