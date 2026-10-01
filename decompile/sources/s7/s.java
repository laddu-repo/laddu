package s7;

import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.media3.decoder.DecoderInputBuffer;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.measurement.f1;
import com.google.android.gms.internal.measurement.le;
import com.google.android.gms.internal.measurement.ya;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class s extends o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o8.h f11547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f11548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f11549d;

    public s(int i, o8.h hVar) {
        super(i);
        this.f11547b = hVar;
    }

    @Override // s7.o
    public final q7.d[] a(j jVar) {
        switch (this.f11548c) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                return (q7.d[]) ((q) this.f11549d).f11539a.f1687x;
            default:
                q qVar = (q) jVar.i.get((f) this.f11549d);
                if (qVar == null) {
                    return null;
                }
                return (q7.d[]) qVar.f11539a.f1687x;
        }
    }

    @Override // s7.o
    public final boolean b(j jVar) {
        switch (this.f11548c) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                return ((q) this.f11549d).f11539a.f1685v;
            default:
                q qVar = (q) jVar.i.get((f) this.f11549d);
                return qVar != null && qVar.f11539a.f1685v;
        }
    }

    @Override // s7.o
    public final int c(j jVar) {
        switch (this.f11548c) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                return 0;
            default:
                return ((q) jVar.i.get((f) this.f11549d)) != null ? 0 : -1;
        }
    }

    @Override // s7.o
    public final void d(Status status) {
        this.f11547b.b(new r7.d(status));
    }

    @Override // s7.o
    public final void e(Exception exc) {
        this.f11547b.b(exc);
    }

    @Override // s7.o
    public final /* bridge */ /* synthetic */ void f(p2.c cVar, boolean z2) {
        int i = this.f11548c;
    }

    @Override // s7.o
    public final void g(j jVar) throws DeadObjectException {
        try {
            k(jVar);
        } catch (DeadObjectException e7) {
            d(o.h(e7));
            throw e7;
        } catch (RemoteException e10) {
            d(o.h(e10));
        } catch (RuntimeException e11) {
            this.f11547b.b(e11);
        }
    }

    public final void k(j jVar) {
        switch (this.f11548c) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                q qVar = (q) this.f11549d;
                c2.b bVar = qVar.f11539a;
                ((a7.j) ((le) bVar.f1688y).f2863b).accept(jVar.f11521e, this.f11547b);
                f fVar = (f) ((q7.h) bVar.f1686w).f10917w;
                if (fVar != null) {
                    jVar.i.put(fVar, qVar);
                }
                break;
            default:
                q qVar2 = (q) jVar.i.remove((f) this.f11549d);
                if (qVar2 == null) {
                    this.f11547b.c(Boolean.FALSE);
                } else {
                    r7.c cVar = jVar.f11521e;
                    ((f1) ((le) qVar2.f11540b.f7546w).f2864c).getClass();
                    int i = ya.f3254k;
                    ((q7.h) qVar2.f11539a.f1686w).f10917w = null;
                }
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s(f fVar, o8.h hVar) {
        this(4, hVar);
        this.f11548c = 1;
        this.f11549d = fVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s(q qVar, o8.h hVar) {
        this(3, hVar);
        this.f11548c = 0;
        this.f11549d = qVar;
    }

    private final /* bridge */ /* synthetic */ void i(p2.c cVar, boolean z2) {
    }

    private final /* bridge */ /* synthetic */ void j(p2.c cVar, boolean z2) {
    }
}
