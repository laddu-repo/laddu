package hb;

import com.google.android.gms.internal.measurement.k4;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f extends k4 {
    @Override // com.google.android.gms.internal.measurement.k4
    public final boolean c(o oVar, c cVar, c cVar2) {
        synchronized (oVar) {
            try {
                if (oVar.f6027y == cVar) {
                    oVar.f6027y = cVar2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.k4
    public final boolean d(o oVar, Object obj, Object obj2) {
        synchronized (oVar) {
            try {
                if (oVar.f6026x == obj) {
                    oVar.f6026x = obj2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.k4
    public final boolean e(o oVar, n nVar, n nVar2) {
        synchronized (oVar) {
            try {
                if (oVar.f6028z == nVar) {
                    oVar.f6028z = nVar2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.k4
    public final c g(o oVar) {
        c cVar;
        c cVar2 = c.f6013d;
        synchronized (oVar) {
            try {
                cVar = oVar.f6027y;
                if (cVar != cVar2) {
                    oVar.f6027y = cVar2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    @Override // com.google.android.gms.internal.measurement.k4
    public final n h(o oVar) {
        n nVar;
        n nVar2 = n.f6023c;
        synchronized (oVar) {
            try {
                nVar = oVar.f6028z;
                if (nVar != nVar2) {
                    oVar.f6028z = nVar2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return nVar;
    }

    @Override // com.google.android.gms.internal.measurement.k4
    public final void o(n nVar, n nVar2) {
        nVar.f6025b = nVar2;
    }

    @Override // com.google.android.gms.internal.measurement.k4
    public final void p(n nVar, Thread thread) {
        nVar.f6024a = thread;
    }
}
