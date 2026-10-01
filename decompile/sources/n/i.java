package n;

import p.m3;
import t0.v0;
import t0.w0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i extends w0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8934a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8935b;

    /* renamed from: c, reason: collision with root package name */
    public int f8936c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f8937d;

    public i(j jVar) {
        this.f8934a = 0;
        this.f8937d = jVar;
        this.f8935b = false;
        this.f8936c = 0;
    }

    @Override // t0.w0, t0.v0
    public void a() {
        switch (this.f8934a) {
            case 1:
                this.f8935b = true;
                return;
            default:
                return;
        }
    }

    @Override // t0.w0, t0.v0
    public final void b() {
        switch (this.f8934a) {
            case 0:
                if (!this.f8935b) {
                    this.f8935b = true;
                    v0 v0Var = ((j) this.f8937d).f8941d;
                    if (v0Var != null) {
                        v0Var.b();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((m3) this.f8937d).f10301a.setVisibility(0);
                return;
        }
    }

    @Override // t0.v0
    public final void c() {
        switch (this.f8934a) {
            case 0:
                int i6 = this.f8936c + 1;
                this.f8936c = i6;
                j jVar = (j) this.f8937d;
                if (i6 == jVar.f8938a.size()) {
                    v0 v0Var = jVar.f8941d;
                    if (v0Var != null) {
                        v0Var.c();
                    }
                    this.f8936c = 0;
                    this.f8935b = false;
                    jVar.f8942e = false;
                    return;
                }
                return;
            default:
                if (!this.f8935b) {
                    ((m3) this.f8937d).f10301a.setVisibility(this.f8936c);
                    return;
                }
                return;
        }
    }

    public i(m3 m3Var, int i6) {
        this.f8934a = 1;
        this.f8937d = m3Var;
        this.f8936c = i6;
        this.f8935b = false;
    }
}
