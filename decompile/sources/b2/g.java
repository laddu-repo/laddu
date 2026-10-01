package b2;

import q2.c0;
import r1.d1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f1364a;

    /* renamed from: b, reason: collision with root package name */
    public int f1365b;

    /* renamed from: c, reason: collision with root package name */
    public long f1366c;

    /* renamed from: d, reason: collision with root package name */
    public final c0 f1367d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1368e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1369f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ h f1370g;

    public g(h hVar, String str, int i6, c0 c0Var) {
        long j;
        this.f1370g = hVar;
        this.f1364a = str;
        this.f1365b = i6;
        if (c0Var == null) {
            j = -1;
        } else {
            j = c0Var.f10837d;
        }
        this.f1366c = j;
        if (c0Var != null && c0Var.b()) {
            this.f1367d = c0Var;
        }
    }

    public final boolean a(a aVar) {
        c0 c0Var = aVar.f1347d;
        d1 d1Var = aVar.f1345b;
        if (c0Var == null) {
            if (this.f1365b != aVar.f1346c) {
                return true;
            }
            return false;
        }
        long j = this.f1366c;
        if (j != -1) {
            if (c0Var.f10837d <= j) {
                c0 c0Var2 = this.f1367d;
                if (c0Var2 != null) {
                    int i6 = c0Var2.f10835b;
                    int b10 = d1Var.b(c0Var.f10834a);
                    int b11 = d1Var.b(c0Var2.f10834a);
                    if (c0Var.f10837d >= c0Var2.f10837d && b10 >= b11) {
                        if (b10 <= b11) {
                            if (c0Var.b()) {
                                int i10 = c0Var.f10835b;
                                int i11 = c0Var.f10836c;
                                if (i10 <= i6) {
                                    if (i10 == i6 && i11 > c0Var2.f10836c) {
                                        return true;
                                    }
                                    return false;
                                }
                                return true;
                            }
                            int i12 = c0Var.f10838e;
                            if (i12 == -1 || i12 > i6) {
                                return true;
                            }
                            return false;
                        }
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r0 < r8.o()) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(r1.d1 r7, r1.d1 r8) {
        /*
            r6 = this;
            int r0 = r6.f1365b
            int r1 = r7.o()
            r2 = 0
            r3 = -1
            if (r0 < r1) goto L13
            int r7 = r8.o()
            if (r0 >= r7) goto L11
            goto L36
        L11:
            r0 = -1
            goto L36
        L13:
            b2.h r1 = r6.f1370g
            r1.c1 r4 = r1.f1373a
            r7.n(r0, r4)
            int r0 = r4.f11339n
        L1c:
            int r5 = r4.f11340o
            if (r0 > r5) goto L11
            java.lang.Object r5 = r7.l(r0)
            int r5 = r8.b(r5)
            if (r5 == r3) goto L33
            r1.a1 r7 = r1.f1374b
            r1.a1 r7 = r8.f(r5, r7, r2)
            int r0 = r7.f11297c
            goto L36
        L33:
            int r0 = r0 + 1
            goto L1c
        L36:
            r6.f1365b = r0
            if (r0 != r3) goto L3b
            goto L4a
        L3b:
            q2.c0 r7 = r6.f1367d
            if (r7 != 0) goto L40
            goto L48
        L40:
            java.lang.Object r7 = r7.f10834a
            int r7 = r8.b(r7)
            if (r7 == r3) goto L4a
        L48:
            r7 = 1
            return r7
        L4a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.g.b(r1.d1, r1.d1):boolean");
    }
}
