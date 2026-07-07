package gf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class v0 implements Runnable, Comparable, q0 {
    private volatile Object _heap;

    /* renamed from: x, reason: collision with root package name */
    public long f5718x;

    /* renamed from: y, reason: collision with root package name */
    public int f5719y = -1;

    public v0(long j) {
        this.f5718x = j;
    }

    public final mf.a0 a() {
        Object obj = this._heap;
        if (obj instanceof mf.a0) {
            return (mf.a0) obj;
        }
        return null;
    }

    public final int c(long j, w0 w0Var, x0 x0Var) {
        v0 v0Var;
        boolean z10;
        synchronized (this) {
            if (this._heap == f0.f5666b) {
                return 2;
            }
            synchronized (w0Var) {
                try {
                    v0[] v0VarArr = w0Var.f8849a;
                    if (v0VarArr != null) {
                        v0Var = v0VarArr[0];
                    } else {
                        v0Var = null;
                    }
                    if (x0.E.get(x0Var) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        return 1;
                    }
                    if (v0Var == null) {
                        w0Var.f5721c = j;
                    } else {
                        long j10 = v0Var.f5718x;
                        if (j10 - j < 0) {
                            j = j10;
                        }
                        if (j - w0Var.f5721c > 0) {
                            w0Var.f5721c = j;
                        }
                    }
                    long j11 = this.f5718x;
                    long j12 = w0Var.f5721c;
                    if (j11 - j12 < 0) {
                        this.f5718x = j12;
                    }
                    w0Var.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.f5718x - ((v0) obj).f5718x;
        if (j > 0) {
            return 1;
        }
        if (j < 0) {
            return -1;
        }
        return 0;
    }

    @Override // gf.q0
    public final void d() {
        w0 w0Var;
        synchronized (this) {
            try {
                Object obj = this._heap;
                h5.a aVar = f0.f5666b;
                if (obj == aVar) {
                    return;
                }
                if (obj instanceof w0) {
                    w0Var = (w0) obj;
                } else {
                    w0Var = null;
                }
                if (w0Var != null) {
                    w0Var.c(this);
                }
                this._heap = aVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(w0 w0Var) {
        if (this._heap != f0.f5666b) {
            this._heap = w0Var;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public String toString() {
        return "Delayed[nanos=" + this.f5718x + ']';
    }
}
