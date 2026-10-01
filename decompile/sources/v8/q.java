package v8;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.measurement.j4;
import java.util.Map;
import o5.e0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class q extends m {

    /* renamed from: b, reason: collision with root package name */
    public final j4 f13470b;

    /* renamed from: c, reason: collision with root package name */
    public final s9.h f13471c;

    /* renamed from: d, reason: collision with root package name */
    public final e0 f13472d;

    public q(j4 j4Var, s9.h hVar, e0 e0Var) {
        super(2);
        this.f13471c = hVar;
        this.f13470b = j4Var;
        this.f13472d = e0Var;
        if (!j4Var.f2310y) {
        } else {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // v8.m
    public final boolean a(j jVar) {
        return this.f13470b.f2310y;
    }

    @Override // v8.m
    public final t8.d[] b(j jVar) {
        return (t8.d[]) this.f13470b.f2311z;
    }

    @Override // v8.m
    public final void c(Status status) {
        c2.r rVar;
        this.f13472d.getClass();
        if (status.f2136z != null) {
            rVar = new c2.r(status);
        } else {
            rVar = new c2.r(status);
        }
        this.f13471c.b(rVar);
    }

    @Override // v8.m
    public final void d(Exception exc) {
        this.f13471c.b(exc);
    }

    @Override // v8.m
    public final void e(j jVar) {
        s9.h hVar = this.f13471c;
        try {
            this.f13470b.a(jVar.f13454f, hVar);
        } catch (DeadObjectException e10) {
            throw e10;
        } catch (RemoteException e11) {
            c(m.g(e11));
        } catch (RuntimeException e12) {
            hVar.b(e12);
        }
    }

    @Override // v8.m
    public final void f(s8.l lVar, boolean z10) {
        Boolean valueOf = Boolean.valueOf(z10);
        Map map = (Map) lVar.f12252z;
        s9.h hVar = this.f13471c;
        map.put(hVar, valueOf);
        s9.n nVar = hVar.f12263a;
        s8.l lVar2 = new s8.l(lVar, hVar, 9, false);
        nVar.getClass();
        nVar.f12276b.d(new s9.l(s9.i.f12264a, lVar2));
        nVar.p();
    }
}
