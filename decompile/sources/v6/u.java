package v6;

import androidx.lifecycle.e0;
import androidx.lifecycle.f0;
import androidx.lifecycle.y;
import gf.a2;
import gf.b1;
import gf.j1;
import gf.o0;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class u implements r {
    public final y A;
    public final j1 B;

    /* renamed from: x, reason: collision with root package name */
    public final l6.k f13433x;

    /* renamed from: y, reason: collision with root package name */
    public final k f13434y;

    /* renamed from: z, reason: collision with root package name */
    public final x6.a f13435z;

    public u(l6.k kVar, k kVar2, x6.a aVar, y yVar, j1 j1Var) {
        this.f13433x = kVar;
        this.f13434y = kVar2;
        this.f13435z = aVar;
        this.A = yVar;
        this.B = j1Var;
    }

    @Override // androidx.lifecycle.l
    public final void K(f0 f0Var) {
        v c10 = a7.f.c(this.f13435z.f14692y);
        synchronized (c10) {
            try {
                a2 a2Var = c10.f13438z;
                le.c cVar = null;
                if (a2Var != null) {
                    a2Var.d(null);
                }
                b1 b1Var = b1.f5652x;
                of.e eVar = o0.f5693a;
                c10.f13438z = gf.f0.w(b1Var, mf.o.f8875a.A, new n6.d(c10, cVar, 4), 2);
                c10.f13437y = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.lifecycle.l
    public final void S(f0 owner) {
        kotlin.jvm.internal.k.e(owner, "owner");
    }

    @Override // androidx.lifecycle.l
    public final void d(f0 owner) {
        kotlin.jvm.internal.k.e(owner, "owner");
    }

    @Override // androidx.lifecycle.l
    public final /* synthetic */ void f(f0 f0Var) {
        r4.a.b(f0Var);
    }

    @Override // v6.r
    public final void m() {
        x6.a aVar = this.f13435z;
        if (aVar.f14692y.isAttachedToWindow()) {
            return;
        }
        v c10 = a7.f.c(aVar.f14692y);
        u uVar = c10.A;
        if (uVar != null) {
            y yVar = uVar.A;
            uVar.B.d(null);
            x6.a aVar2 = uVar.f13435z;
            if (aVar2 instanceof e0) {
                yVar.c(aVar2);
            }
            yVar.c(uVar);
        }
        c10.A = this;
        throw new CancellationException("'ViewTarget.view' must be attached to a window.");
    }

    @Override // v6.r
    public final void start() {
        y yVar = this.A;
        yVar.a(this);
        x6.a aVar = this.f13435z;
        if (aVar instanceof e0) {
            x6.a aVar2 = aVar;
            yVar.c(aVar2);
            yVar.a(aVar2);
        }
        v c10 = a7.f.c(aVar.f14692y);
        u uVar = c10.A;
        if (uVar != null) {
            y yVar2 = uVar.A;
            uVar.B.d(null);
            x6.a aVar3 = uVar.f13435z;
            if (aVar3 instanceof e0) {
                yVar2.c(aVar3);
            }
            yVar2.c(uVar);
        }
        c10.A = this;
    }

    @Override // v6.r
    public final /* synthetic */ void Q() {
    }

    @Override // androidx.lifecycle.l
    public final /* synthetic */ void l(f0 f0Var) {
    }

    @Override // androidx.lifecycle.l
    public final /* synthetic */ void y(f0 f0Var) {
    }
}
