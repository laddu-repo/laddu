package q2;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d1 extends r1.d1 {

    /* renamed from: q, reason: collision with root package name */
    public static final Object f10845q = new Object();

    /* renamed from: e, reason: collision with root package name */
    public final long f10846e;

    /* renamed from: f, reason: collision with root package name */
    public final long f10847f;

    /* renamed from: g, reason: collision with root package name */
    public final long f10848g;

    /* renamed from: h, reason: collision with root package name */
    public final long f10849h;

    /* renamed from: i, reason: collision with root package name */
    public final long f10850i;
    public final long j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f10851k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f10852l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f10853m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f10854n;

    /* renamed from: o, reason: collision with root package name */
    public final r1.e0 f10855o;

    /* renamed from: p, reason: collision with root package name */
    public final r1.z f10856p;

    static {
        boolean z10;
        r1.y yVar;
        r1.v vVar = new r1.v();
        f5.b bVar = new f5.b();
        List list = Collections.EMPTY_LIST;
        db.c1 c1Var = db.c1.B;
        e2.t tVar = new e2.t();
        r1.b0 b0Var = r1.b0.f11307d;
        Uri uri = Uri.EMPTY;
        if (((Uri) bVar.f5022e) != null && ((UUID) bVar.f5021d) == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        u1.c.g(z10);
        if (uri != null) {
            if (((UUID) bVar.f5021d) != null) {
                yVar = new r1.y(bVar);
            } else {
                yVar = null;
            }
            new r1.a0(uri, null, yVar, null, list, null, c1Var, -9223372036854775807L);
        }
        new r1.w(vVar);
        new r1.z(tVar);
        r1.h0 h0Var = r1.h0.K;
    }

    public d1(long j, boolean z10, boolean z11, r1.e0 e0Var) {
        this(j, j, 0L, 0L, z10, false, z11, null, e0Var);
    }

    @Override // r1.d1
    public final int b(Object obj) {
        if (f10845q.equals(obj)) {
            return 0;
        }
        return -1;
    }

    @Override // r1.d1
    public final r1.a1 f(int i6, r1.a1 a1Var, boolean z10) {
        Object obj;
        u1.c.c(i6, 1);
        if (z10) {
            obj = f10845q;
        } else {
            obj = null;
        }
        Object obj2 = obj;
        long j = -this.f10850i;
        a1Var.getClass();
        a1Var.h(null, obj2, 0, this.f10848g, j, r1.b.f11302c, false);
        return a1Var;
    }

    @Override // r1.d1
    public final int h() {
        return 1;
    }

    @Override // r1.d1
    public final Object l(int i6) {
        u1.c.c(i6, 1);
        return f10845q;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        if (r1 > r5) goto L10;
     */
    @Override // r1.d1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final r1.c1 m(int r25, r1.c1 r26, long r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = 1
            r2 = r25
            u1.c.c(r2, r1)
            long r1 = r0.j
            boolean r14 = r0.f10852l
            if (r14 == 0) goto L2d
            boolean r3 = r0.f10853m
            if (r3 != 0) goto L2d
            r3 = 0
            int r5 = (r27 > r3 ? 1 : (r27 == r3 ? 0 : -1))
            if (r5 == 0) goto L2d
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r5 = r0.f10849h
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto L26
        L23:
            r16 = r3
            goto L2f
        L26:
            long r1 = r1 + r27
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 <= 0) goto L2d
            goto L23
        L2d:
            r16 = r1
        L2f:
            java.lang.Object r4 = r1.c1.f11318q
            r21 = 0
            long r1 = r0.f10850i
            r1.e0 r5 = r0.f10855o
            java.lang.Object r6 = r0.f10854n
            long r7 = r0.f10846e
            long r9 = r0.f10847f
            boolean r13 = r0.f10851k
            r1.z r15 = r0.f10856p
            long r11 = r0.f10849h
            r20 = 0
            r3 = r26
            r22 = r1
            r18 = r11
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3.b(r4, r5, r6, r7, r9, r11, r13, r14, r15, r16, r18, r20, r21, r22)
            return r26
        */
        throw new UnsupportedOperationException("Method not decompiled: q2.d1.m(int, r1.c1, long):r1.c1");
    }

    @Override // r1.d1
    public final int o() {
        return 1;
    }

    public d1(long j, long j10, long j11, long j12, boolean z10, boolean z11, boolean z12, Object obj, r1.e0 e0Var) {
        this(-9223372036854775807L, -9223372036854775807L, j, j10, j11, j12, z10, z11, false, obj, e0Var, z12 ? e0Var.f11380c : null);
    }

    public d1(long j, long j10, long j11, long j12, long j13, long j14, boolean z10, boolean z11, boolean z12, Object obj, r1.e0 e0Var, r1.z zVar) {
        this.f10846e = j;
        this.f10847f = j10;
        this.f10848g = j11;
        this.f10849h = j12;
        this.f10850i = j13;
        this.j = j14;
        this.f10851k = z10;
        this.f10852l = z11;
        this.f10853m = z12;
        this.f10854n = obj;
        e0Var.getClass();
        this.f10855o = e0Var;
        this.f10856p = zVar;
    }
}
