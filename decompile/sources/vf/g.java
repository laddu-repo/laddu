package vf;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class g extends v {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public v f13608e;

    public g(v vVar) {
        de.i.e(vVar, "delegate");
        this.f13608e = vVar;
    }

    @Override // vf.v
    public final v a() {
        return this.f13608e.a();
    }

    @Override // vf.v
    public final v b() {
        return this.f13608e.b();
    }

    @Override // vf.v
    public final long c() {
        return this.f13608e.c();
    }

    @Override // vf.v
    public final v d(long j8) {
        return this.f13608e.d(j8);
    }

    @Override // vf.v
    public final boolean e() {
        return this.f13608e.e();
    }

    @Override // vf.v
    public final void f() throws InterruptedIOException {
        this.f13608e.f();
    }

    @Override // vf.v
    public final v g(long j8) {
        de.i.e(TimeUnit.MILLISECONDS, "unit");
        return this.f13608e.g(j8);
    }
}
