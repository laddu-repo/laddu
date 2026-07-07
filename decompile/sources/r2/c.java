package r2;

import r1.q;
import u1.a0;
import u1.t;
import y2.e0;
import y2.f0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f11776a;

    /* renamed from: b, reason: collision with root package name */
    public final q f11777b;

    /* renamed from: c, reason: collision with root package name */
    public final y2.n f11778c = new y2.n();

    /* renamed from: d, reason: collision with root package name */
    public q f11779d;

    /* renamed from: e, reason: collision with root package name */
    public f0 f11780e;

    /* renamed from: f, reason: collision with root package name */
    public long f11781f;

    public c(int i6, int i10, q qVar) {
        this.f11776a = i10;
        this.f11777b = qVar;
    }

    @Override // y2.f0
    public final /* synthetic */ void a(int i6, t tVar) {
        w8.k.a(this, tVar, i6);
    }

    @Override // y2.f0
    public final void b(t tVar, int i6, int i10) {
        f0 f0Var = this.f11780e;
        String str = a0.f12750a;
        f0Var.a(i6, tVar);
    }

    @Override // y2.f0
    public final void c(long j, int i6, int i10, int i11, e0 e0Var) {
        long j10 = this.f11781f;
        if (j10 != -9223372036854775807L && j >= j10) {
            this.f11780e = this.f11778c;
        }
        f0 f0Var = this.f11780e;
        String str = a0.f12750a;
        f0Var.c(j, i6, i10, i11, e0Var);
    }

    @Override // y2.f0
    public final int d(r1.i iVar, int i6, boolean z10) {
        f0 f0Var = this.f11780e;
        String str = a0.f12750a;
        return f0Var.e(iVar, i6, z10);
    }

    @Override // y2.f0
    public final int e(r1.i iVar, int i6, boolean z10) {
        return d(iVar, i6, z10);
    }

    @Override // y2.f0
    public final void f(q qVar) {
        q qVar2 = this.f11777b;
        if (qVar2 != null) {
            qVar = qVar.d(qVar2);
        }
        this.f11779d = qVar;
        f0 f0Var = this.f11780e;
        String str = a0.f12750a;
        f0Var.f(qVar);
    }
}
