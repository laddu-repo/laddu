package a2;

import android.os.Bundle;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class q extends r1.n0 {
    public final int G;
    public final String H;
    public final int I;
    public final r1.q J;
    public final int K;
    public final q2.c0 L;
    public final boolean M;

    public q(int i6, Exception exc, int i10) {
        this(i6, exc, i10, null, -1, null, 4, null, false);
    }

    public final q a(q2.c0 c0Var) {
        String message = getMessage();
        String str = u1.a0.f12750a;
        return new q(message, getCause(), this.f11589x, this.G, this.H, this.I, this.J, this.K, c0Var, this.f11590y, this.M);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(String str, Throwable th, int i6, int i10, String str2, int i11, r1.q qVar, int i12, q2.c0 c0Var, long j, boolean z10) {
        super(str, th, i6, j);
        Bundle bundle = Bundle.EMPTY;
        u1.c.b(!z10 || i10 == 1);
        u1.c.b(th != null || i10 == 3);
        this.G = i10;
        this.H = str2;
        this.I = i11;
        this.J = qVar;
        this.K = i12;
        this.L = c0Var;
        this.M = z10;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public q(int r14, java.lang.Throwable r15, int r16, java.lang.String r17, int r18, r1.q r19, int r20, q2.c0 r21, boolean r22) {
        /*
            r13 = this;
            r8 = r20
            if (r14 == 0) goto L63
            r0 = 3
            r1 = 1
            if (r14 == r1) goto L16
            if (r14 == r0) goto L13
            java.lang.String r0 = "Unexpected runtime error"
        Lc:
            r5 = r17
            r6 = r18
            r7 = r19
            goto L6b
        L13:
            java.lang.String r0 = "Remote error"
            goto Lc
        L16:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r5 = r17
            r2.append(r5)
            java.lang.String r3 = " error, index="
            r2.append(r3)
            r6 = r18
            r2.append(r6)
            java.lang.String r3 = ", format="
            r2.append(r3)
            r7 = r19
            r2.append(r7)
            java.lang.String r3 = ", format_supported="
            r2.append(r3)
            java.lang.String r3 = u1.a0.f12750a
            if (r8 == 0) goto L59
            if (r8 == r1) goto L56
            r1 = 2
            if (r8 == r1) goto L53
            if (r8 == r0) goto L50
            r0 = 4
            if (r8 != r0) goto L4a
            java.lang.String r0 = "YES"
            goto L5b
        L4a:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            r14.<init>()
            throw r14
        L50:
            java.lang.String r0 = "NO_EXCEEDS_CAPABILITIES"
            goto L5b
        L53:
            java.lang.String r0 = "NO_UNSUPPORTED_DRM"
            goto L5b
        L56:
            java.lang.String r0 = "NO_UNSUPPORTED_TYPE"
            goto L5b
        L59:
            java.lang.String r0 = "NO"
        L5b:
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            goto L6b
        L63:
            r5 = r17
            r6 = r18
            r7 = r19
            java.lang.String r0 = "Source error"
        L6b:
            r1 = 0
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L78
            java.lang.String r1 = ": null"
            java.lang.String r0 = w8.k.c(r0, r1)
        L78:
            r1 = r0
            long r10 = android.os.SystemClock.elapsedRealtime()
            r0 = r13
            r4 = r14
            r2 = r15
            r3 = r16
            r9 = r21
            r12 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.q.<init>(int, java.lang.Throwable, int, java.lang.String, int, r1.q, int, q2.c0, boolean):void");
    }
}
