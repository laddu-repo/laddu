package b2;

import a2.s;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import q2.c0;
import r1.a1;
import r1.c1;
import r1.d1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: h, reason: collision with root package name */
    public static final s f1371h = new s(1);

    /* renamed from: i, reason: collision with root package name */
    public static final Random f1372i = new Random();

    /* renamed from: d, reason: collision with root package name */
    public l f1376d;

    /* renamed from: f, reason: collision with root package name */
    public String f1378f;

    /* renamed from: a, reason: collision with root package name */
    public final c1 f1373a = new c1();

    /* renamed from: b, reason: collision with root package name */
    public final a1 f1374b = new a1();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f1375c = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public d1 f1377e = d1.f11368a;

    /* renamed from: g, reason: collision with root package name */
    public long f1379g = -1;

    public final void a(g gVar) {
        long j = gVar.f1366c;
        if (j != -1) {
            this.f1379g = j;
        }
        this.f1378f = null;
    }

    public final synchronized void b(a aVar) {
        l lVar;
        try {
            String str = this.f1378f;
            if (str != null) {
                g gVar = (g) this.f1375c.get(str);
                gVar.getClass();
                a(gVar);
            }
            Iterator it = this.f1375c.values().iterator();
            while (it.hasNext()) {
                g gVar2 = (g) it.next();
                it.remove();
                if (gVar2.f1368e && (lVar = this.f1376d) != null) {
                    lVar.d(aVar, gVar2.f1364a);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
    
        if (r12 != (-1)) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009b A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final b2.g c(int r19, q2.c0 r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            java.util.HashMap r3 = r0.f1375c
            java.util.Collection r4 = r3.values()
            java.util.Iterator r4 = r4.iterator()
            r5 = 0
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L16:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L9f
            java.lang.Object r8 = r4.next()
            b2.g r8 = (b2.g) r8
            long r9 = r8.f1366c
            q2.c0 r11 = r8.f1367d
            r12 = -1
            int r14 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r14 != 0) goto L57
            int r9 = r8.f1365b
            if (r1 != r9) goto L57
            if (r2 == 0) goto L57
            long r9 = r2.f10837d
            b2.h r14 = r8.f1370g
            java.util.HashMap r15 = r14.f1375c
            r16 = r12
            java.lang.String r12 = r14.f1378f
            java.lang.Object r12 = r15.get(r12)
            b2.g r12 = (b2.g) r12
            if (r12 == 0) goto L4b
            long r12 = r12.f1366c
            int r15 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r15 == 0) goto L4b
            goto L50
        L4b:
            long r12 = r14.f1379g
            r14 = 1
            long r12 = r12 + r14
        L50:
            int r14 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r14 < 0) goto L59
            r8.f1366c = r9
            goto L59
        L57:
            r16 = r12
        L59:
            if (r2 != 0) goto L60
            int r9 = r8.f1365b
            if (r1 != r9) goto L16
            goto L83
        L60:
            long r9 = r2.f10837d
            if (r11 != 0) goto L71
            boolean r12 = r2.b()
            if (r12 != 0) goto L16
            long r12 = r8.f1366c
            int r14 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r14 != 0) goto L16
            goto L83
        L71:
            long r12 = r11.f10837d
            int r14 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r14 != 0) goto L16
            int r9 = r2.f10835b
            int r10 = r11.f10835b
            if (r9 != r10) goto L16
            int r9 = r2.f10836c
            int r10 = r11.f10836c
            if (r9 != r10) goto L16
        L83:
            long r9 = r8.f1366c
            int r12 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r12 == 0) goto L9b
            int r12 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r12 >= 0) goto L8e
            goto L9b
        L8e:
            if (r12 != 0) goto L16
            java.lang.String r9 = u1.a0.f12750a
            q2.c0 r9 = r5.f1367d
            if (r9 == 0) goto L16
            if (r11 == 0) goto L16
            r5 = r8
            goto L16
        L9b:
            r5 = r8
            r6 = r9
            goto L16
        L9f:
            if (r5 != 0) goto Lb1
            a2.s r4 = b2.h.f1371h
            java.lang.Object r4 = r4.get()
            java.lang.String r4 = (java.lang.String) r4
            b2.g r5 = new b2.g
            r5.<init>(r0, r4, r1, r2)
            r3.put(r4, r5)
        Lb1:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.h.c(int, q2.c0):b2.g");
    }

    public final synchronized String d(d1 d1Var, c0 c0Var) {
        return c(d1Var.g(c0Var.f10834a, this.f1374b).f11297c, c0Var).f1364a;
    }

    public final void e(a aVar) {
        c0 c0Var;
        d1 d1Var = aVar.f1345b;
        int i6 = aVar.f1346c;
        c0 c0Var2 = aVar.f1347d;
        boolean p10 = d1Var.p();
        HashMap hashMap = this.f1375c;
        if (p10) {
            String str = this.f1378f;
            if (str != null) {
                g gVar = (g) hashMap.get(str);
                gVar.getClass();
                a(gVar);
                return;
            }
            return;
        }
        g gVar2 = (g) hashMap.get(this.f1378f);
        this.f1378f = c(i6, c0Var2).f1364a;
        f(aVar);
        if (c0Var2 != null) {
            long j = c0Var2.f10837d;
            if (c0Var2.b()) {
                if (gVar2 == null || gVar2.f1366c != j || (c0Var = gVar2.f1367d) == null || c0Var.f10835b != c0Var2.f10835b || c0Var.f10836c != c0Var2.f10836c) {
                    c(i6, new c0(j, c0Var2.f10834a));
                    this.f1376d.getClass();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036 A[Catch: all -> 0x0050, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x0010, B:10:0x0014, B:12:0x0024, B:19:0x0036, B:21:0x0042, B:23:0x0048, B:27:0x002b, B:29:0x0053, B:31:0x005f, B:32:0x0063, B:34:0x0068, B:36:0x006e, B:38:0x0085, B:39:0x00b2, B:41:0x00b6, B:42:0x00bd, B:44:0x00c7, B:46:0x00cb, B:48:0x00d8, B:51:0x00df), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void f(b2.a r10) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.h.f(b2.a):void");
    }

    public final synchronized void g(a aVar, int i6) {
        boolean z10;
        try {
            this.f1376d.getClass();
            if (i6 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            Iterator it = this.f1375c.values().iterator();
            while (it.hasNext()) {
                g gVar = (g) it.next();
                if (gVar.a(aVar)) {
                    it.remove();
                    if (gVar.f1368e) {
                        boolean equals = gVar.f1364a.equals(this.f1378f);
                        if (z10 && equals) {
                            boolean z11 = gVar.f1369f;
                        }
                        if (equals) {
                            a(gVar);
                        }
                        this.f1376d.d(aVar, gVar.f1364a);
                    }
                }
            }
            e(aVar);
        } catch (Throwable th) {
            throw th;
        }
    }
}
