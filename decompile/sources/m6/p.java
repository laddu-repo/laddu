package m6;

import bg.f0;
import java.io.Closeable;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class p extends a0 {
    public final Closeable A;
    public boolean B;
    public f0 C;

    /* renamed from: x, reason: collision with root package name */
    public final bg.c0 f8673x;

    /* renamed from: y, reason: collision with root package name */
    public final bg.q f8674y;

    /* renamed from: z, reason: collision with root package name */
    public final String f8675z;

    public p(bg.c0 c0Var, bg.q qVar, String str, Closeable closeable) {
        this.f8673x = c0Var;
        this.f8674y = qVar;
        this.f8675z = str;
        this.A = closeable;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            this.B = true;
            f0 f0Var = this.C;
            if (f0Var != null) {
                a7.f.a(f0Var);
            }
            Closeable closeable = this.A;
            if (closeable != null) {
                a7.f.a(closeable);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // m6.a0
    public final synchronized bg.c0 d() {
        if (!this.B) {
        } else {
            throw new IllegalStateException("closed");
        }
        return this.f8673x;
    }

    @Override // m6.a0
    public final bg.c0 f() {
        return d();
    }

    @Override // m6.a0
    public final a8.b l() {
        return null;
    }

    @Override // m6.a0
    public final synchronized bg.m m() {
        if (!this.B) {
            f0 f0Var = this.C;
            if (f0Var != null) {
                return f0Var;
            }
            f0 d10 = bg.b.d(this.f8674y.l(this.f8673x));
            this.C = d10;
            return d10;
        }
        throw new IllegalStateException("closed");
    }
}
