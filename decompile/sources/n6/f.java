package n6;

import bg.j0;
import bg.k;
import bg.r;
import cf.n;
import java.io.IOException;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f extends r {

    /* renamed from: x, reason: collision with root package name */
    public final n f9080x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f9081y;

    public f(j0 j0Var, n nVar) {
        super(j0Var);
        this.f9080x = nVar;
    }

    @Override // bg.r, bg.j0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            super.close();
        } catch (IOException e10) {
            this.f9081y = true;
            this.f9080x.invoke(e10);
        }
    }

    @Override // bg.r, bg.j0, java.io.Flushable
    public final void flush() {
        try {
            super.flush();
        } catch (IOException e10) {
            this.f9081y = true;
            this.f9080x.invoke(e10);
        }
    }

    @Override // bg.r, bg.j0
    public final void write(k kVar, long j) {
        if (this.f9081y) {
            kVar.skip(j);
            return;
        }
        try {
            super.write(kVar, j);
        } catch (IOException e10) {
            this.f9081y = true;
            this.f9080x.invoke(e10);
        }
    }
}
