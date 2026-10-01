package ld;

import j1.p0;
import j1.w0;
import j1.y;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class n extends s5.a {

    /* renamed from: b, reason: collision with root package name */
    public final p0 f8343b;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8347f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o f8348g;

    /* renamed from: d, reason: collision with root package name */
    public j1.a f8345d = null;

    /* renamed from: e, reason: collision with root package name */
    public y f8346e = null;

    /* renamed from: c, reason: collision with root package name */
    public final int f8344c = 1;

    public n(o oVar, p0 p0Var) {
        this.f8348g = oVar;
        this.f8343b = p0Var;
    }

    @Override // s5.a
    public final void a(Object obj) {
        y yVar = (y) obj;
        if (this.f8345d == null) {
            p0 p0Var = this.f8343b;
            p0Var.getClass();
            this.f8345d = new j1.a(p0Var);
        }
        j1.a aVar = this.f8345d;
        aVar.getClass();
        p0 p0Var2 = yVar.S;
        if (p0Var2 != null && p0Var2 != aVar.f6871r) {
            throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + yVar.toString() + " is already attached to a FragmentManager.");
        }
        aVar.b(new w0(6, yVar));
        if (yVar.equals(this.f8346e)) {
            this.f8346e = null;
        }
    }

    @Override // s5.a
    public final void b() {
        j1.a aVar = this.f8345d;
        if (aVar != null) {
            if (!this.f8347f) {
                try {
                    this.f8347f = true;
                    if (!aVar.f6861g) {
                        aVar.f6862h = false;
                        aVar.f6871r.A(aVar, true);
                    } else {
                        throw new IllegalStateException("This transaction is already being added to the back stack");
                    }
                } finally {
                    this.f8347f = false;
                }
            }
            this.f8345d = null;
        }
    }

    @Override // s5.a
    public final int c() {
        return this.f8348g.Q0.size();
    }

    @Override // s5.a
    public final void e(s5.g gVar) {
        if (gVar.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }
}
