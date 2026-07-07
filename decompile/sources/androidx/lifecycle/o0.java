package androidx.lifecycle;

import java.util.Map;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class o0 {

    /* renamed from: k, reason: collision with root package name */
    public static final Object f968k = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f969a;

    /* renamed from: b, reason: collision with root package name */
    public final r.f f970b;

    /* renamed from: c, reason: collision with root package name */
    public int f971c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f972d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f973e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f974f;

    /* renamed from: g, reason: collision with root package name */
    public int f975g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f976h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f977i;
    public final k0 j;

    public o0(int i6) {
        this.f969a = new Object();
        this.f970b = new r.f();
        this.f971c = 0;
        this.f974f = f968k;
        this.j = new k0(this);
        this.f973e = 0;
        this.f975g = 0;
    }

    public static void a(String str) {
        if (q.b.H().f10787f.I()) {
        } else {
            throw new IllegalStateException(h8.c.m("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void b(n0 n0Var) {
        if (n0Var.f966y) {
            if (!n0Var.e()) {
                n0Var.a(false);
                return;
            }
            int i6 = n0Var.f967z;
            int i10 = this.f975g;
            if (i6 >= i10) {
                return;
            }
            n0Var.f967z = i10;
            n0Var.f965x.a(this.f973e);
        }
    }

    public final void c(n0 n0Var) {
        if (this.f976h) {
            this.f977i = true;
            return;
        }
        this.f976h = true;
        do {
            this.f977i = false;
            if (n0Var != null) {
                b(n0Var);
                n0Var = null;
            } else {
                r.f fVar = this.f970b;
                fVar.getClass();
                r.d dVar = new r.d(fVar);
                fVar.f11239z.put(dVar, Boolean.FALSE);
                while (dVar.hasNext()) {
                    b((n0) ((Map.Entry) dVar.next()).getValue());
                    if (this.f977i) {
                        break;
                    }
                }
            }
        } while (this.f977i);
        this.f976h = false;
    }

    public final void d(f0 f0Var, r0 r0Var) {
        Object obj;
        a("observe");
        if (f0Var.getLifecycle().b() != x.f991x) {
            m0 m0Var = new m0(this, f0Var, r0Var);
            r.f fVar = this.f970b;
            r.c a10 = fVar.a(r0Var);
            if (a10 != null) {
                obj = a10.f11232y;
            } else {
                r.c cVar = new r.c(r0Var, m0Var);
                fVar.A++;
                r.c cVar2 = fVar.f11238y;
                if (cVar2 == null) {
                    fVar.f11237x = cVar;
                    fVar.f11238y = cVar;
                } else {
                    cVar2.f11233z = cVar;
                    cVar.A = cVar2;
                    fVar.f11238y = cVar;
                }
                obj = null;
            }
            n0 n0Var = (n0) obj;
            if (n0Var != null && !n0Var.c(f0Var)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            }
            if (n0Var != null) {
                return;
            }
            f0Var.getLifecycle().a(m0Var);
        }
    }

    public void g(Object obj) {
        boolean z10;
        synchronized (this.f969a) {
            if (this.f974f == f968k) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f974f = obj;
        }
        if (!z10) {
            return;
        }
        q.b.H().I(this.j);
    }

    public void h(Object obj) {
        a("setValue");
        this.f975g++;
        this.f973e = obj;
        c(null);
    }

    public o0() {
        this.f969a = new Object();
        this.f970b = new r.f();
        this.f971c = 0;
        Object obj = f968k;
        this.f974f = obj;
        this.j = new k0(this);
        this.f973e = obj;
        this.f975g = -1;
    }

    public void e() {
    }

    public void f() {
    }
}
