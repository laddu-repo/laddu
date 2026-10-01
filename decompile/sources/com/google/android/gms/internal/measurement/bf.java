package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class bf extends n4 {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f2517x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f2518y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ xa f2519z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf(xa xaVar, boolean z2, boolean z10) {
        super("log");
        this.f2519z = xaVar;
        this.f2517x = z2;
        this.f2518y = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0092  */
    @Override // com.google.android.gms.internal.measurement.n4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.measurement.z5 h(com.google.android.gms.internal.measurement.z7 r18, java.util.List r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            java.lang.String r3 = "log"
            r4 = 1
            com.google.android.gms.internal.measurement.jb.j(r3, r4, r2)
            int r3 = r2.size()
            r5 = 0
            com.google.android.gms.internal.measurement.d6 r6 = com.google.android.gms.internal.measurement.z5.f3274a
            com.google.android.gms.internal.measurement.xa r7 = r0.f2519z
            if (r3 != r4) goto L39
            java.lang.Object r2 = r2.get(r5)
            com.google.android.gms.internal.measurement.z5 r2 = (com.google.android.gms.internal.measurement.z5) r2
            java.lang.Object r3 = r1.f3283x
            com.google.android.gms.internal.measurement.f6 r3 = (com.google.android.gms.internal.measurement.f6) r3
            com.google.android.gms.internal.measurement.z5 r1 = r3.f(r1, r2)
            java.lang.String r10 = r1.e()
            java.util.List r11 = java.util.Collections.EMPTY_LIST
            java.lang.Object r1 = r7.f3230y
            r8 = r1
            s5.c r8 = (s5.c) r8
            r9 = 3
            boolean r12 = r0.f2517x
            boolean r13 = r0.f2518y
            r8.K(r9, r10, r11, r12, r13)
            return r6
        L39:
            java.lang.Object r3 = r2.get(r5)
            com.google.android.gms.internal.measurement.z5 r3 = (com.google.android.gms.internal.measurement.z5) r3
            java.lang.Object r5 = r1.f3283x
            com.google.android.gms.internal.measurement.f6 r5 = (com.google.android.gms.internal.measurement.f6) r5
            java.lang.Object r8 = r1.f3283x
            com.google.android.gms.internal.measurement.f6 r8 = (com.google.android.gms.internal.measurement.f6) r8
            com.google.android.gms.internal.measurement.z5 r3 = r5.f(r1, r3)
            java.lang.Double r3 = r3.d()
            double r9 = r3.doubleValue()
            int r3 = com.google.android.gms.internal.measurement.jb.r(r9)
            r5 = 5
            r9 = 2
            if (r3 == r9) goto L6b
            r10 = 3
            if (r3 == r10) goto L69
            if (r3 == r5) goto L67
            r11 = 6
            if (r3 == r11) goto L65
        L63:
            r12 = r10
            goto L6d
        L65:
            r12 = r9
            goto L6d
        L67:
            r12 = r5
            goto L6d
        L69:
            r12 = r4
            goto L6d
        L6b:
            r10 = 4
            goto L63
        L6d:
            java.lang.Object r3 = r2.get(r4)
            com.google.android.gms.internal.measurement.z5 r3 = (com.google.android.gms.internal.measurement.z5) r3
            com.google.android.gms.internal.measurement.z5 r3 = r8.f(r1, r3)
            java.lang.String r13 = r3.e()
            int r3 = r2.size()
            if (r3 != r9) goto L92
            java.util.List r14 = java.util.Collections.EMPTY_LIST
            java.lang.Object r1 = r7.f3230y
            r11 = r1
            s5.c r11 = (s5.c) r11
            boolean r15 = r0.f2517x
            boolean r1 = r0.f2518y
            r16 = r1
            r11.K(r12, r13, r14, r15, r16)
            return r6
        L92:
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
        L97:
            int r3 = r2.size()
            int r3 = java.lang.Math.min(r3, r5)
            if (r9 >= r3) goto Lb5
            java.lang.Object r3 = r2.get(r9)
            com.google.android.gms.internal.measurement.z5 r3 = (com.google.android.gms.internal.measurement.z5) r3
            com.google.android.gms.internal.measurement.z5 r3 = r8.f(r1, r3)
            java.lang.String r3 = r3.e()
            r14.add(r3)
            int r9 = r9 + 1
            goto L97
        Lb5:
            java.lang.Object r1 = r7.f3230y
            r11 = r1
            s5.c r11 = (s5.c) r11
            boolean r15 = r0.f2517x
            boolean r1 = r0.f2518y
            r16 = r1
            r11.K(r12, r13, r14, r15, r16)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.bf.h(com.google.android.gms.internal.measurement.z7, java.util.List):com.google.android.gms.internal.measurement.z5");
    }
}
