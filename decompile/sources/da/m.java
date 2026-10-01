package da;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class m extends qf.g {
    @Override // qf.g
    public final void C(s sVar, s sVar2) {
        sVar.f4446b = sVar2;
    }

    @Override // qf.g
    public final void D(s sVar, Thread thread) {
        sVar.f4445a = thread;
    }

    @Override // qf.g
    public final boolean f(k kVar, h hVar, h hVar2) {
        synchronized (kVar) {
            try {
                if (kVar.f4451w != hVar) {
                    return false;
                }
                kVar.f4451w = hVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // qf.g
    public final boolean g(t tVar, Object obj, Object obj2) {
        synchronized (tVar) {
            try {
                if (tVar.f4450v != obj) {
                    return false;
                }
                tVar.f4450v = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // qf.g
    public final boolean h(t tVar, s sVar, s sVar2) {
        synchronized (tVar) {
            try {
                if (tVar.f4452x != sVar) {
                    return false;
                }
                tVar.f4452x = sVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // qf.g
    public final h r(k kVar) {
        h hVar;
        h hVar2 = h.f4416d;
        synchronized (kVar) {
            try {
                hVar = kVar.f4451w;
                if (hVar != hVar2) {
                    kVar.f4451w = hVar2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return hVar;
    }

    @Override // qf.g
    public final s s(k kVar) {
        s sVar;
        s sVar2 = s.f4444c;
        synchronized (kVar) {
            try {
                sVar = kVar.f4452x;
                if (sVar != sVar2) {
                    kVar.f4452x = sVar2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return sVar;
    }
}
