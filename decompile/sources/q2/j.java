package q2;

import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j implements i0, f2.m {
    public final /* synthetic */ l A;

    /* renamed from: x, reason: collision with root package name */
    public final Object f10893x;

    /* renamed from: y, reason: collision with root package name */
    public b2.k f10894y;

    /* renamed from: z, reason: collision with root package name */
    public f2.l f10895z;

    public j(l lVar, Object obj) {
        this.A = lVar;
        this.f10894y = lVar.b(null);
        this.f10895z = new f2.l(lVar.A.f4677c, 0, null);
        this.f10893x = obj;
    }

    @Override // f2.m
    public final void B(int i6, c0 c0Var, int i10) {
        if (a(i6, c0Var)) {
            this.f10895z.c(i10);
        }
    }

    @Override // f2.m
    public final void K(int i6, c0 c0Var, Exception exc) {
        if (a(i6, c0Var)) {
            this.f10895z.d(exc);
        }
    }

    @Override // q2.i0
    public final void L(int i6, c0 c0Var, u uVar, n2.g gVar) {
        if (a(i6, c0Var)) {
            b2.k kVar = this.f10894y;
            n2.g b10 = b(gVar, c0Var);
            kVar.getClass();
            kVar.g(new f0(kVar, uVar, b10, 1));
        }
    }

    @Override // q2.i0
    public final void M(int i6, c0 c0Var, n2.g gVar) {
        if (a(i6, c0Var)) {
            b2.k kVar = this.f10894y;
            n2.g b10 = b(gVar, c0Var);
            kVar.getClass();
            kVar.g(new b2.b(19, kVar, b10));
        }
    }

    public final boolean a(int i6, c0 c0Var) {
        c0 c0Var2;
        Object obj = this.f10893x;
        l lVar = this.A;
        if (c0Var != null) {
            c0Var2 = lVar.w(obj, c0Var);
            if (c0Var2 == null) {
                return false;
            }
        } else {
            c0Var2 = null;
        }
        int y9 = lVar.y(i6, obj);
        b2.k kVar = this.f10894y;
        if (kVar.f1383y != y9 || !Objects.equals((c0) kVar.f1384z, c0Var2)) {
            this.f10894y = new b2.k((CopyOnWriteArrayList) lVar.f10830z.A, y9, c0Var2);
        }
        f2.l lVar2 = this.f10895z;
        if (lVar2.f4675a != y9 || !Objects.equals(lVar2.f4676b, c0Var2)) {
            this.f10895z = new f2.l(lVar.A.f4677c, y9, c0Var2);
            return true;
        }
        return true;
    }

    public final n2.g b(n2.g gVar, c0 c0Var) {
        long j = gVar.f9002d;
        l lVar = this.A;
        Object obj = this.f10893x;
        long x10 = lVar.x(j, obj);
        long j10 = gVar.f9003e;
        long x11 = lVar.x(j10, obj);
        if (x10 == j && x11 == j10) {
            return gVar;
        }
        return new n2.g(gVar.f8999a, gVar.f9000b, (r1.q) gVar.f9004f, gVar.f9001c, gVar.f9005g, x10, x11);
    }

    @Override // q2.i0
    public final void j(int i6, c0 c0Var, u uVar, n2.g gVar, IOException iOException, boolean z10) {
        if (a(i6, c0Var)) {
            b2.k kVar = this.f10894y;
            n2.g b10 = b(gVar, c0Var);
            kVar.getClass();
            kVar.g(new g0(kVar, uVar, b10, iOException, z10));
        }
    }

    @Override // f2.m
    public final void l(int i6, c0 c0Var) {
        if (a(i6, c0Var)) {
            this.f10895z.e();
        }
    }

    @Override // f2.m
    public final void n(int i6, c0 c0Var) {
        if (a(i6, c0Var)) {
            this.f10895z.b();
        }
    }

    @Override // q2.i0
    public final void u(int i6, c0 c0Var, u uVar, n2.g gVar, int i10) {
        if (a(i6, c0Var)) {
            b2.k kVar = this.f10894y;
            n2.g b10 = b(gVar, c0Var);
            kVar.getClass();
            kVar.g(new e0(kVar, uVar, b10, i10));
        }
    }

    @Override // q2.i0
    public final void v(int i6, c0 c0Var, u uVar, n2.g gVar) {
        if (a(i6, c0Var)) {
            b2.k kVar = this.f10894y;
            n2.g b10 = b(gVar, c0Var);
            kVar.getClass();
            kVar.g(new f0(kVar, uVar, b10, 0));
        }
    }

    @Override // q2.i0
    public final void w(int i6, c0 c0Var, n2.g gVar) {
        if (a(i6, c0Var)) {
            b2.k kVar = this.f10894y;
            n2.g b10 = b(gVar, c0Var);
            c0 c0Var2 = (c0) kVar.f1384z;
            c0Var2.getClass();
            kVar.g(new i4.h0(kVar, c0Var2, b10, 10));
        }
    }

    @Override // f2.m
    public final void z(int i6, c0 c0Var) {
        if (a(i6, c0Var)) {
            this.f10895z.a();
        }
    }
}
