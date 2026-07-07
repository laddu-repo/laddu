package v8;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class r extends m {

    /* renamed from: b, reason: collision with root package name */
    public final s9.h f13473b;

    public r(s9.h hVar) {
        super(4);
        this.f13473b = hVar;
    }

    @Override // v8.m
    public final boolean a(j jVar) {
        if (jVar.j.get(null) == null) {
            return false;
        }
        throw new ClassCastException();
    }

    @Override // v8.m
    public final t8.d[] b(j jVar) {
        if (jVar.j.get(null) == null) {
            return null;
        }
        throw new ClassCastException();
    }

    @Override // v8.m
    public final void c(Status status) {
        this.f13473b.b(new c2.r(status));
    }

    @Override // v8.m
    public final void d(Exception exc) {
        this.f13473b.b(exc);
    }

    @Override // v8.m
    public final void e(j jVar) {
        try {
            h(jVar);
        } catch (DeadObjectException e10) {
            c(m.g(e10));
            throw e10;
        } catch (RemoteException e11) {
            c(m.g(e11));
        } catch (RuntimeException e12) {
            this.f13473b.b(e12);
        }
    }

    public final void h(j jVar) {
        if (jVar.j.remove(null) == null) {
            this.f13473b.c(Boolean.FALSE);
            return;
        }
        throw new ClassCastException();
    }

    @Override // v8.m
    public final /* bridge */ /* synthetic */ void f(s8.l lVar, boolean z10) {
    }
}
