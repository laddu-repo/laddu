package y1;

import java.util.ArrayDeque;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class k implements e {

    /* renamed from: a, reason: collision with root package name */
    public final r8.c f14813a;

    /* renamed from: e, reason: collision with root package name */
    public final h[] f14817e;

    /* renamed from: f, reason: collision with root package name */
    public final j[] f14818f;

    /* renamed from: g, reason: collision with root package name */
    public int f14819g;

    /* renamed from: h, reason: collision with root package name */
    public int f14820h;

    /* renamed from: i, reason: collision with root package name */
    public h f14821i;
    public f j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f14822k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f14823l;

    /* renamed from: m, reason: collision with root package name */
    public int f14824m;

    /* renamed from: b, reason: collision with root package name */
    public final Object f14814b = new Object();

    /* renamed from: n, reason: collision with root package name */
    public long f14825n = -9223372036854775807L;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque f14815c = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f14816d = new ArrayDeque();

    public k(h[] hVarArr, j[] jVarArr) {
        this.f14817e = hVarArr;
        this.f14819g = hVarArr.length;
        for (int i6 = 0; i6 < this.f14819g; i6++) {
            this.f14817e[i6] = g();
        }
        this.f14818f = jVarArr;
        this.f14820h = jVarArr.length;
        for (int i10 = 0; i10 < this.f14820h; i10++) {
            this.f14818f[i10] = h();
        }
        r8.c cVar = new r8.c(this);
        this.f14813a = cVar;
        cVar.start();
    }

    @Override // y1.e
    public void a() {
        synchronized (this.f14814b) {
            this.f14823l = true;
            this.f14814b.notify();
        }
        try {
            this.f14813a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // y1.e
    public final void b(long j) {
        boolean z10;
        synchronized (this.f14814b) {
            try {
                if (this.f14819g != this.f14817e.length && !this.f14822k) {
                    z10 = false;
                    u1.c.g(z10);
                    this.f14825n = j;
                }
                z10 = true;
                u1.c.g(z10);
                this.f14825n = j;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // y1.e
    public final Object e() {
        boolean z10;
        h hVar;
        synchronized (this.f14814b) {
            try {
                f fVar = this.j;
                if (fVar == null) {
                    if (this.f14821i == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    u1.c.g(z10);
                    int i6 = this.f14819g;
                    if (i6 == 0) {
                        hVar = null;
                    } else {
                        h[] hVarArr = this.f14817e;
                        int i10 = i6 - 1;
                        this.f14819g = i10;
                        hVar = hVarArr[i10];
                    }
                    this.f14821i = hVar;
                } else {
                    throw fVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return hVar;
    }

    @Override // y1.e
    public final void flush() {
        synchronized (this.f14814b) {
            try {
                this.f14822k = true;
                this.f14824m = 0;
                h hVar = this.f14821i;
                if (hVar != null) {
                    hVar.clear();
                    h[] hVarArr = this.f14817e;
                    int i6 = this.f14819g;
                    this.f14819g = i6 + 1;
                    hVarArr[i6] = hVar;
                    this.f14821i = null;
                }
                while (!this.f14815c.isEmpty()) {
                    h hVar2 = (h) this.f14815c.removeFirst();
                    hVar2.clear();
                    h[] hVarArr2 = this.f14817e;
                    int i10 = this.f14819g;
                    this.f14819g = i10 + 1;
                    hVarArr2[i10] = hVar2;
                }
                while (!this.f14816d.isEmpty()) {
                    ((j) this.f14816d.removeFirst()).release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract h g();

    public abstract j h();

    public abstract f i(Throwable th);

    public abstract f j(h hVar, j jVar, boolean z10);

    public final boolean k() {
        f i6;
        boolean z10;
        synchronized (this.f14814b) {
            while (!this.f14823l) {
                try {
                    if (!this.f14815c.isEmpty() && this.f14820h > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        break;
                    }
                    this.f14814b.wait();
                } finally {
                }
            }
            if (this.f14823l) {
                return false;
            }
            h hVar = (h) this.f14815c.removeFirst();
            j[] jVarArr = this.f14818f;
            int i10 = this.f14820h - 1;
            this.f14820h = i10;
            j jVar = jVarArr[i10];
            boolean z11 = this.f14822k;
            this.f14822k = false;
            if (hVar.isEndOfStream()) {
                jVar.addFlag(4);
            } else {
                jVar.timeUs = hVar.B;
                if (hVar.isFirstSample()) {
                    jVar.addFlag(134217728);
                }
                if (!m(hVar.B)) {
                    jVar.shouldBeSkipped = true;
                }
                try {
                    i6 = j(hVar, jVar, z11);
                } catch (OutOfMemoryError e10) {
                    i6 = i(e10);
                } catch (RuntimeException e11) {
                    i6 = i(e11);
                }
                if (i6 != null) {
                    synchronized (this.f14814b) {
                        this.j = i6;
                    }
                    return false;
                }
            }
            synchronized (this.f14814b) {
                try {
                    if (this.f14822k) {
                        jVar.release();
                    } else if (jVar.shouldBeSkipped) {
                        this.f14824m++;
                        jVar.release();
                    } else {
                        jVar.skippedOutputBufferCount = this.f14824m;
                        this.f14824m = 0;
                        this.f14816d.addLast(jVar);
                    }
                    hVar.clear();
                    h[] hVarArr = this.f14817e;
                    int i11 = this.f14819g;
                    this.f14819g = i11 + 1;
                    hVarArr[i11] = hVar;
                } finally {
                }
            }
            return true;
        }
    }

    @Override // y1.e
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final j d() {
        synchronized (this.f14814b) {
            try {
                f fVar = this.j;
                if (fVar == null) {
                    if (this.f14816d.isEmpty()) {
                        return null;
                    }
                    return (j) this.f14816d.removeFirst();
                }
                throw fVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean m(long j) {
        boolean z10;
        synchronized (this.f14814b) {
            long j10 = this.f14825n;
            if (j10 != -9223372036854775807L && j < j10) {
                z10 = false;
            }
            z10 = true;
        }
        return z10;
    }

    @Override // y1.e
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final void f(h hVar) {
        boolean z10;
        synchronized (this.f14814b) {
            try {
                f fVar = this.j;
                if (fVar == null) {
                    if (hVar == this.f14821i) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    u1.c.b(z10);
                    this.f14815c.addLast(hVar);
                    if (!this.f14815c.isEmpty() && this.f14820h > 0) {
                        this.f14814b.notify();
                    }
                    this.f14821i = null;
                } else {
                    throw fVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void o(j jVar) {
        synchronized (this.f14814b) {
            jVar.clear();
            j[] jVarArr = this.f14818f;
            int i6 = this.f14820h;
            this.f14820h = i6 + 1;
            jVarArr[i6] = jVar;
            if (!this.f14815c.isEmpty() && this.f14820h > 0) {
                this.f14814b.notify();
            }
        }
    }

    public final void p(int i6) {
        boolean z10;
        int i10 = this.f14819g;
        h[] hVarArr = this.f14817e;
        if (i10 == hVarArr.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        u1.c.g(z10);
        for (h hVar : hVarArr) {
            hVar.b(i6);
        }
    }
}
