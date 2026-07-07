package r6;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class i implements d, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f11335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f11336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile h f11337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile c f11338d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f11339e = 3;
    public int f = 3;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f11340g;

    public i(Object obj, d dVar) {
        this.f11336b = obj;
        this.f11335a = dVar;
    }

    @Override // r6.d, r6.c
    public final boolean a() {
        boolean z2;
        synchronized (this.f11336b) {
            try {
                z2 = this.f11338d.a() || this.f11337c.a();
            } finally {
            }
        }
        return z2;
    }

    @Override // r6.c
    public final boolean b() {
        boolean z2;
        synchronized (this.f11336b) {
            z2 = this.f11339e == 3;
        }
        return z2;
    }

    @Override // r6.d
    public final void c(c cVar) {
        synchronized (this.f11336b) {
            try {
                if (!cVar.equals(this.f11337c)) {
                    this.f = 5;
                    return;
                }
                this.f11339e = 5;
                d dVar = this.f11335a;
                if (dVar != null) {
                    dVar.c(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // r6.c
    public final void clear() {
        synchronized (this.f11336b) {
            this.f11340g = false;
            this.f11339e = 3;
            this.f = 3;
            this.f11338d.clear();
            this.f11337c.clear();
        }
    }

    @Override // r6.d
    public final boolean d(c cVar) {
        boolean z2;
        synchronized (this.f11336b) {
            try {
                d dVar = this.f11335a;
                z2 = (dVar == null || dVar.d(this)) && (cVar.equals(this.f11337c) || this.f11339e != 4);
            } finally {
            }
        }
        return z2;
    }

    @Override // r6.d
    public final boolean e(c cVar) {
        boolean z2;
        synchronized (this.f11336b) {
            try {
                d dVar = this.f11335a;
                z2 = (dVar == null || dVar.e(this)) && cVar.equals(this.f11337c) && this.f11339e != 2;
            } finally {
            }
        }
        return z2;
    }

    @Override // r6.c
    public final void f() {
        synchronized (this.f11336b) {
            try {
                if (!d0.d.d(this.f)) {
                    this.f = 2;
                    this.f11338d.f();
                }
                if (!d0.d.d(this.f11339e)) {
                    this.f11339e = 2;
                    this.f11337c.f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // r6.c
    public final void g() {
        synchronized (this.f11336b) {
            try {
                this.f11340g = true;
                try {
                    if (this.f11339e != 4 && this.f != 1) {
                        this.f = 1;
                        this.f11338d.g();
                    }
                    if (this.f11340g && this.f11339e != 1) {
                        this.f11339e = 1;
                        this.f11337c.g();
                    }
                    this.f11340g = false;
                } catch (Throwable th) {
                    this.f11340g = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // r6.d
    public final d getRoot() {
        d root;
        synchronized (this.f11336b) {
            try {
                d dVar = this.f11335a;
                root = dVar != null ? dVar.getRoot() : this;
            } catch (Throwable th) {
                throw th;
            }
        }
        return root;
    }

    @Override // r6.c
    public final boolean h(c cVar) {
        if (!(cVar instanceof i)) {
            return false;
        }
        i iVar = (i) cVar;
        if (this.f11337c == null) {
            if (iVar.f11337c != null) {
                return false;
            }
        } else if (!this.f11337c.h(iVar.f11337c)) {
            return false;
        }
        return this.f11338d == null ? iVar.f11338d == null : this.f11338d.h(iVar.f11338d);
    }

    @Override // r6.d
    public final void i(c cVar) {
        synchronized (this.f11336b) {
            try {
                if (cVar.equals(this.f11338d)) {
                    this.f = 4;
                    return;
                }
                this.f11339e = 4;
                d dVar = this.f11335a;
                if (dVar != null) {
                    dVar.i(this);
                }
                if (!d0.d.d(this.f)) {
                    this.f11338d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // r6.c
    public final boolean isRunning() {
        boolean z2;
        synchronized (this.f11336b) {
            z2 = true;
            if (this.f11339e != 1) {
                z2 = false;
            }
        }
        return z2;
    }

    @Override // r6.c
    public final boolean j() {
        boolean z2;
        synchronized (this.f11336b) {
            z2 = this.f11339e == 4;
        }
        return z2;
    }

    @Override // r6.d
    public final boolean k(c cVar) {
        boolean z2;
        synchronized (this.f11336b) {
            try {
                d dVar = this.f11335a;
                z2 = (dVar == null || dVar.k(this)) && cVar.equals(this.f11337c) && !a();
            } finally {
            }
        }
        return z2;
    }
}
