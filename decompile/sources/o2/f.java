package o2;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class f extends s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f9413c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f9414d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f9415e;
    public final boolean f;

    public f(t1.s0 s0Var, long j8, long j9) throws g {
        super(s0Var);
        if (j9 != Long.MIN_VALUE && j9 < j8) {
            throw new g(2, j8, j9);
        }
        boolean z2 = false;
        if (s0Var.h() != 1) {
            throw new g(0);
        }
        t1.r0 r0VarM = s0Var.m(0, new t1.r0(), 0L);
        long jMax = Math.max(0L, j8);
        if (!r0VarM.f12103k && jMax != 0 && !r0VarM.f12101h) {
            throw new g(1);
        }
        long jMax2 = j9 == Long.MIN_VALUE ? r0VarM.f12105m : Math.max(0L, j9);
        long j10 = r0VarM.f12105m;
        if (j10 != -9223372036854775807L) {
            jMax2 = jMax2 > j10 ? j10 : jMax2;
            if (jMax > jMax2) {
                jMax = jMax2;
            }
        }
        this.f9413c = jMax;
        this.f9414d = jMax2;
        this.f9415e = jMax2 != -9223372036854775807L ? jMax2 - jMax : -9223372036854775807L;
        if (r0VarM.i && (jMax2 == -9223372036854775807L || (j10 != -9223372036854775807L && jMax2 == j10))) {
            z2 = true;
        }
        this.f = z2;
    }

    @Override // o2.s, t1.s0
    public final t1.q0 f(int i, t1.q0 q0Var, boolean z2) {
        this.f9522b.f(0, q0Var, z2);
        long j8 = q0Var.f12090e - this.f9413c;
        long j9 = this.f9415e;
        q0Var.h(q0Var.f12086a, q0Var.f12087b, 0, j9 != -9223372036854775807L ? j9 - j8 : -9223372036854775807L, j8, t1.b.f11920c, false);
        return q0Var;
    }

    @Override // o2.s, t1.s0
    public final t1.r0 m(int i, t1.r0 r0Var, long j8) {
        this.f9522b.m(0, r0Var, 0L);
        long j9 = r0Var.f12108p;
        long j10 = this.f9413c;
        r0Var.f12108p = j9 + j10;
        r0Var.f12105m = this.f9415e;
        r0Var.i = this.f;
        long j11 = r0Var.f12104l;
        if (j11 != -9223372036854775807L) {
            long jMax = Math.max(j11, j10);
            r0Var.f12104l = jMax;
            long j12 = this.f9414d;
            if (j12 != -9223372036854775807L) {
                jMax = Math.min(jMax, j12);
            }
            r0Var.f12104l = jMax - j10;
        }
        long jY = w1.b0.Y(j10);
        long j13 = r0Var.f12099e;
        if (j13 != -9223372036854775807L) {
            r0Var.f12099e = j13 + jY;
        }
        long j14 = r0Var.f;
        if (j14 != -9223372036854775807L) {
            r0Var.f = j14 + jY;
        }
        return r0Var;
    }
}
