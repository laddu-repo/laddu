package me;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class l0 implements Runnable, Comparable, h0 {
    private volatile Object _heap;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f8707v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f8708w = -1;

    public l0(long j8) {
        this.f8707v = j8;
    }

    public final re.x a() {
        Object obj = this._heap;
        if (obj instanceof re.x) {
            return (re.x) obj;
        }
        return null;
    }

    @Override // me.h0
    public final void b() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                re.t tVar = x.f8743b;
                if (obj == tVar) {
                    return;
                }
                m0 m0Var = obj instanceof m0 ? (m0) obj : null;
                if (m0Var != null) {
                    m0Var.b(this);
                }
                this._heap = tVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j8 = this.f8707v - ((l0) obj).f8707v;
        if (j8 > 0) {
            return 1;
        }
        return j8 < 0 ? -1 : 0;
    }

    public final int d(long j8, m0 m0Var, n0 n0Var) {
        synchronized (this) {
            if (this._heap == x.f8743b) {
                return 2;
            }
            synchronized (m0Var) {
                try {
                    l0[] l0VarArr = m0Var.f11410a;
                    l0 l0Var = l0VarArr != null ? l0VarArr[0] : null;
                    if (n0.D.get(n0Var) != 0) {
                        return 1;
                    }
                    if (l0Var == null) {
                        m0Var.f8710c = j8;
                    } else {
                        long j9 = l0Var.f8707v;
                        if (j9 - j8 < 0) {
                            j8 = j9;
                        }
                        if (j8 - m0Var.f8710c > 0) {
                            m0Var.f8710c = j8;
                        }
                    }
                    long j10 = this.f8707v;
                    long j11 = m0Var.f8710c;
                    if (j10 - j11 < 0) {
                        this.f8707v = j11;
                    }
                    m0Var.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void e(m0 m0Var) {
        if (this._heap == x.f8743b) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = m0Var;
    }

    public String toString() {
        return "Delayed[nanos=" + this.f8707v + ']';
    }
}
