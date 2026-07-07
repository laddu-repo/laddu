package m6;

import bg.e0;
import bg.f0;
import java.io.File;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d0 extends a0 {
    public ve.a A;
    public bg.c0 B;

    /* renamed from: x, reason: collision with root package name */
    public final a8.b f8650x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f8651y;

    /* renamed from: z, reason: collision with root package name */
    public bg.m f8652z;

    public d0(bg.m mVar, ve.a aVar, a8.b bVar) {
        this.f8650x = bVar;
        this.f8652z = mVar;
        this.A = aVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            this.f8651y = true;
            bg.m mVar = this.f8652z;
            if (mVar != null) {
                a7.f.a(mVar);
            }
            bg.c0 c0Var = this.B;
            if (c0Var != null) {
                bg.x xVar = bg.q.f1741a;
                xVar.getClass();
                xVar.d(c0Var);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // m6.a0
    public final synchronized bg.c0 d() {
        Throwable th;
        if (!this.f8651y) {
            bg.c0 c0Var = this.B;
            if (c0Var != null) {
                return c0Var;
            }
            ve.a aVar = this.A;
            kotlin.jvm.internal.k.b(aVar);
            File file = (File) aVar.invoke();
            if (file.isDirectory()) {
                String str = bg.c0.f1692y;
                bg.c0 u3 = zb.d.u(File.createTempFile("tmp", null, file));
                e0 c10 = bg.b.c(bg.q.f1741a.k(u3));
                try {
                    bg.m mVar = this.f8652z;
                    kotlin.jvm.internal.k.b(mVar);
                    c10.T(mVar);
                    try {
                        c10.close();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    try {
                        c10.close();
                    } catch (Throwable th4) {
                        he.a.a(th3, th4);
                    }
                    th = th3;
                }
                if (th == null) {
                    this.f8652z = null;
                    this.B = u3;
                    this.A = null;
                    return u3;
                }
                throw th;
            }
            throw new IllegalStateException("cacheDirectory must be a directory.");
        }
        throw new IllegalStateException("closed");
    }

    @Override // m6.a0
    public final synchronized bg.c0 f() {
        if (!this.f8651y) {
        } else {
            throw new IllegalStateException("closed");
        }
        return this.B;
    }

    @Override // m6.a0
    public final a8.b l() {
        return this.f8650x;
    }

    @Override // m6.a0
    public final synchronized bg.m m() {
        if (!this.f8651y) {
            bg.m mVar = this.f8652z;
            if (mVar != null) {
                return mVar;
            }
            bg.x xVar = bg.q.f1741a;
            bg.c0 c0Var = this.B;
            kotlin.jvm.internal.k.b(c0Var);
            f0 d10 = bg.b.d(xVar.l(c0Var));
            this.f8652z = d10;
            return d10;
        }
        throw new IllegalStateException("closed");
    }
}
