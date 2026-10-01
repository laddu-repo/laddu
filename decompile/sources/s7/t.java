package s7;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Map;
import k8.b0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class t extends o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.bumptech.glide.manager.t f11550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o8.h f11551c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b0 f11552d;

    public t(int i, com.bumptech.glide.manager.t tVar, o8.h hVar, b0 b0Var) {
        super(i);
        this.f11551c = hVar;
        this.f11550b = tVar;
        this.f11552d = b0Var;
        if (i == 2 && tVar.f2437w) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // s7.o
    public final q7.d[] a(j jVar) {
        return (q7.d[]) this.f11550b.f2438x;
    }

    @Override // s7.o
    public final boolean b(j jVar) {
        return this.f11550b.f2437w;
    }

    @Override // s7.o
    public final int c(j jVar) {
        return 0;
    }

    @Override // s7.o
    public final void d(Status status) {
        this.f11552d.getClass();
        this.f11551c.b(status.f2461x != null ? new r7.j(status) : new r7.d(status));
    }

    @Override // s7.o
    public final void e(Exception exc) {
        this.f11551c.b(exc);
    }

    @Override // s7.o
    public final void f(p2.c cVar, boolean z2) {
        Boolean boolValueOf = Boolean.valueOf(z2);
        Map map = (Map) cVar.f10197x;
        o8.h hVar = this.f11551c;
        map.put(hVar, boolValueOf);
        o8.o oVar = hVar.f9963a;
        p2.c cVar2 = new p2.c(cVar, hVar);
        oVar.getClass();
        oVar.f9983b.h(new o8.l(o8.i.f9964a, cVar2));
        oVar.q();
    }

    @Override // s7.o
    public final void g(j jVar) throws DeadObjectException {
        o8.h hVar = this.f11551c;
        try {
            com.bumptech.glide.manager.t tVar = this.f11550b;
            ((g) ((com.bumptech.glide.manager.t) tVar.f2439y).f2438x).accept(jVar.f11521e, hVar);
        } catch (DeadObjectException e7) {
            throw e7;
        } catch (RemoteException e10) {
            d(o.h(e10));
        } catch (RuntimeException e11) {
            hVar.b(e11);
        }
    }
}
