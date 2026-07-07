package a0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean[] f114a = new boolean[3];

    /* JADX WARN: Code restructure failed: missing block: B:163:0x028e, code lost:
    
        if (r7.f24d == r6) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0110, code lost:
    
        if (r4.f24d == r12) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:265:0x068d  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x06a1  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x06a8  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x06a4  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x069b  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x056e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(a0.e r40, y.c r41, java.util.ArrayList r42, int r43) {
        /*
            Method dump skipped, instructions count: 1765
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.j.a(a0.e, y.c, java.util.ArrayList, int):void");
    }

    public static void b(e eVar, y.c cVar, d dVar) {
        dVar.f57o = -1;
        c cVar2 = dVar.M;
        int[] iArr = dVar.f59p0;
        c cVar3 = dVar.L;
        c cVar4 = dVar.J;
        c cVar5 = dVar.K;
        c cVar6 = dVar.I;
        dVar.f58p = -1;
        int[] iArr2 = eVar.f59p0;
        if (iArr2[0] != 2 && iArr[0] == 4) {
            int i6 = cVar6.f27g;
            int q9 = eVar.q() - cVar5.f27g;
            cVar6.f29i = cVar.k(cVar6);
            cVar5.f29i = cVar.k(cVar5);
            cVar.d(cVar6.f29i, i6);
            cVar.d(cVar5.f29i, q9);
            dVar.f57o = 2;
            dVar.Y = i6;
            int i10 = q9 - i6;
            dVar.U = i10;
            int i11 = dVar.f33b0;
            if (i10 < i11) {
                dVar.U = i11;
            }
        }
        if (iArr2[1] != 2 && iArr[1] == 4) {
            int i12 = cVar4.f27g;
            int k8 = eVar.k() - cVar3.f27g;
            cVar4.f29i = cVar.k(cVar4);
            cVar3.f29i = cVar.k(cVar3);
            cVar.d(cVar4.f29i, i12);
            cVar.d(cVar3.f29i, k8);
            if (dVar.f31a0 > 0 || dVar.f43g0 == 8) {
                y.f k9 = cVar.k(cVar2);
                cVar2.f29i = k9;
                cVar.d(k9, dVar.f31a0 + i12);
            }
            dVar.f58p = 2;
            dVar.Z = i12;
            int i13 = k8 - i12;
            dVar.V = i13;
            int i14 = dVar.f35c0;
            if (i13 < i14) {
                dVar.V = i14;
            }
        }
    }

    public static final boolean c(int i6, int i10) {
        if ((i6 & i10) == i10) {
            return true;
        }
        return false;
    }
}
