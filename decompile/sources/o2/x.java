package o2;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class x extends t1.s0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t1.z f9564b;

    public x(t1.z zVar) {
        this.f9564b = zVar;
    }

    @Override // t1.s0
    public final int b(Object obj) {
        return obj == w.f9556e ? 0 : -1;
    }

    @Override // t1.s0
    public final t1.q0 f(int i, t1.q0 q0Var, boolean z2) {
        q0Var.h(z2 ? 0 : null, z2 ? w.f9556e : null, 0, -9223372036854775807L, 0L, t1.b.f11920c, true);
        return q0Var;
    }

    @Override // t1.s0
    public final int h() {
        return 1;
    }

    @Override // t1.s0
    public final Object l(int i) {
        return w.f9556e;
    }

    @Override // t1.s0
    public final t1.r0 m(int i, t1.r0 r0Var, long j8) {
        Object obj = t1.r0.f12093q;
        r0Var.b(this.f9564b, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0L);
        r0Var.f12103k = true;
        return r0Var;
    }

    @Override // t1.s0
    public final int o() {
        return 1;
    }
}
