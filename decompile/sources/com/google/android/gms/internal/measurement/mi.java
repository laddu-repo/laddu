package com.google.android.gms.internal.measurement;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class mi extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jb f2900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jb f2901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f2902d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2903e;

    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public mi(com.google.android.gms.internal.measurement.jb r11, com.google.android.gms.internal.measurement.jb r12) {
        /*
            r10 = this;
            r10.<init>()
            r10.f2900b = r11
            r10.f2901c = r12
            int r11 = r12.a()
            r12 = 28
            r0 = 0
            r1 = 1
            if (r11 > r12) goto L13
            r12 = r1
            goto L14
        L13:
            r12 = r0
        L14:
            if (r12 == 0) goto L60
            int[] r12 = new int[r11]
            r10.f2902d = r12
            r2 = 0
            r4 = r0
            r5 = r4
        L1e:
            if (r4 >= r11) goto L5d
            com.google.android.gms.internal.measurement.sh r6 = r10.d(r4)
            long r7 = r6.f3096e
            long r7 = r7 | r2
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 != 0) goto L54
            r2 = r0
        L2c:
            r3 = -1
            if (r2 >= r5) goto L41
            r9 = r12[r2]
            r9 = r9 & 31
            com.google.android.gms.internal.measurement.sh r9 = r10.d(r9)
            boolean r9 = r6.equals(r9)
            if (r9 == 0) goto L3e
            goto L42
        L3e:
            int r2 = r2 + 1
            goto L2c
        L41:
            r2 = r3
        L42:
            if (r2 == r3) goto L54
            boolean r3 = r6.f3094c
            if (r3 == 0) goto L50
            r3 = r12[r2]
            int r6 = r4 + 4
            int r6 = r1 << r6
            r3 = r3 | r6
            goto L51
        L50:
            r3 = r4
        L51:
            r12[r2] = r3
            goto L59
        L54:
            int r2 = r5 + 1
            r12[r5] = r4
            r5 = r2
        L59:
            int r4 = r4 + 1
            r2 = r7
            goto L1e
        L5d:
            r10.f2903e = r5
            return
        L60:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "metadata size too large"
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.mi.<init>(com.google.android.gms.internal.measurement.jb, com.google.android.gms.internal.measurement.jb):void");
    }

    @Override // com.google.android.gms.internal.measurement.c
    public final void a(ji jiVar, ei eiVar) {
        for (int i = 0; i < this.f2903e; i++) {
            int i10 = this.f2902d[i];
            sh shVarD = d(i10 & 31);
            if (shVarD.f3094c) {
                jiVar.b(shVarD, new li(this, shVarD, i10), eiVar);
            } else {
                jb jbVar = this.f2900b;
                int iA = jbVar.a();
                if (i10 >= iA) {
                    jbVar = this.f2901c;
                    i10 -= iA;
                }
                jiVar.a(shVarD, shVarD.f3093b.cast(jbVar.l(i10)), eiVar);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.c
    public final int b() {
        return this.f2903e;
    }

    @Override // com.google.android.gms.internal.measurement.c
    public final Set c() {
        return new androidx.datastore.preferences.protobuf.z0(2, this);
    }

    public final sh d(int i) {
        jb jbVar = this.f2900b;
        int iA = jbVar.a();
        return i >= iA ? this.f2901c.g(i - iA) : jbVar.g(i);
    }
}
