package o2;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class g1 extends t1.s0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Object f9427n = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f9428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f9429c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f9430d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f9431e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f9432g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f9433h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f9434j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f9435k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final t1.z f9436l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final t1.v f9437m;

    static {
        t1.r rVar = new t1.r();
        p pVar = new p();
        List list = Collections.EMPTY_LIST;
        y9.z0 z0Var = y9.z0.f14637z;
        g2.t tVar = new g2.t();
        t1.x xVar = t1.x.f12153a;
        Uri uri = Uri.EMPTY;
        w1.a.j(((Uri) pVar.f9504x) == null || ((UUID) pVar.f9503w) != null);
        if (uri != null) {
            new t1.w(uri, null, ((UUID) pVar.f9503w) != null ? new t1.u(pVar) : null, list, z0Var, -9223372036854775807L);
        }
        rVar.a();
        tVar.a();
        t1.c0 c0Var = t1.c0.B;
    }

    public g1(long j8, long j9, long j10, long j11, long j12, long j13, boolean z2, boolean z10, boolean z11, t7.k kVar, t1.z zVar, t1.v vVar) {
        this.f9428b = j8;
        this.f9429c = j9;
        this.f9430d = j10;
        this.f9431e = j11;
        this.f = j12;
        this.f9432g = j13;
        this.f9433h = z2;
        this.i = z10;
        this.f9434j = z11;
        this.f9435k = kVar;
        zVar.getClass();
        this.f9436l = zVar;
        this.f9437m = vVar;
    }

    @Override // t1.s0
    public final int b(Object obj) {
        return f9427n.equals(obj) ? 0 : -1;
    }

    @Override // t1.s0
    public final t1.q0 f(int i, t1.q0 q0Var, boolean z2) {
        w1.a.g(i, 1);
        Object obj = z2 ? f9427n : null;
        long j8 = -this.f;
        q0Var.getClass();
        q0Var.h(null, obj, 0, this.f9430d, j8, t1.b.f11920c, false);
        return q0Var;
    }

    @Override // t1.s0
    public final int h() {
        return 1;
    }

    @Override // t1.s0
    public final Object l(int i) {
        w1.a.g(i, 1);
        return f9427n;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002c A[PHI: r1
  0x002c: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v1 long), (r1v5 long) binds: [B:3:0x000c, B:5:0x0010, B:7:0x0016, B:12:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // t1.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final t1.r0 m(int r23, t1.r0 r24, long r25) {
        /*
            r22 = this;
            r0 = r22
            r1 = 1
            r2 = r23
            w1.a.g(r2, r1)
            long r1 = r0.f9432g
            boolean r13 = r0.i
            if (r13 == 0) goto L2c
            boolean r3 = r0.f9434j
            if (r3 != 0) goto L2c
            r3 = 0
            int r3 = (r25 > r3 ? 1 : (r25 == r3 ? 0 : -1))
            if (r3 == 0) goto L2c
            long r3 = r0.f9431e
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L25
        L23:
            r15 = r5
            goto L2d
        L25:
            long r1 = r1 + r25
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L2c
            goto L23
        L2c:
            r15 = r1
        L2d:
            java.lang.Object r1 = t1.r0.f12093q
            r19 = 0
            long r1 = r0.f
            t1.z r4 = r0.f9436l
            java.lang.Object r5 = r0.f9435k
            long r6 = r0.f9428b
            long r8 = r0.f9429c
            boolean r12 = r0.f9433h
            t1.v r14 = r0.f9437m
            long r10 = r0.f9431e
            r3 = r24
            r20 = r1
            r17 = r10
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3.b(r4, r5, r6, r8, r10, r12, r13, r14, r15, r17, r19, r20)
            return r24
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.g1.m(int, t1.r0, long):t1.r0");
    }

    @Override // t1.s0
    public final int o() {
        return 1;
    }
}
