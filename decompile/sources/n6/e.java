package n6;

import bg.c0;
import bg.e0;
import bg.q;
import cf.m;
import cf.n;
import com.unity3d.services.UnityAdsConstants;
import df.k;
import df.u;
import gf.f0;
import gf.y;
import java.io.Closeable;
import java.io.EOFException;
import java.io.Flushable;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e implements Closeable, Flushable {
    public static final k N = new k("[a-z0-9_-]{1,120}");
    public final c0 A;
    public final c0 B;
    public final LinkedHashMap C;
    public final mf.e D;
    public long E;
    public int F;
    public e0 G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public final c M;

    /* renamed from: x, reason: collision with root package name */
    public final c0 f9077x;

    /* renamed from: y, reason: collision with root package name */
    public final long f9078y;

    /* renamed from: z, reason: collision with root package name */
    public final c0 f9079z;

    public e(long j, q qVar, c0 c0Var, y yVar) {
        this.f9077x = c0Var;
        this.f9078y = j;
        if (j > 0) {
            this.f9079z = c0Var.d("journal");
            this.A = c0Var.d("journal.tmp");
            this.B = c0Var.d("journal.bkp");
            this.C = new LinkedHashMap(0, 0.75f, true);
            this.D = f0.b(m.A(f0.e(), yVar.i0(1)));
            this.M = new c(qVar);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0119, code lost:
    
        if (r2 != false) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0112 A[Catch: all -> 0x0035, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0011, B:11:0x0018, B:13:0x0020, B:16:0x0030, B:26:0x003e, B:28:0x0056, B:29:0x0073, B:31:0x0083, B:33:0x008a, B:36:0x005c, B:38:0x006c, B:40:0x00aa, B:42:0x00b1, B:45:0x00b6, B:47:0x00c7, B:50:0x00cc, B:51:0x0107, B:53:0x0112, B:59:0x011b, B:60:0x00e4, B:62:0x00f9, B:64:0x0104, B:67:0x009a, B:69:0x0120, B:70:0x0127), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(n6.e r9, a2.c r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n6.e.d(n6.e, a2.c, boolean):void");
    }

    public static void g0(String str) {
        if (N.c(str)) {
        } else {
            throw new IllegalArgumentException(w8.k.b('\"', "keys must match regex [a-z0-9_-]{1,120}: \"", str).toString());
        }
    }

    public final e0 K() {
        c cVar = this.M;
        cVar.getClass();
        c0 file = this.f9079z;
        kotlin.jvm.internal.k.e(file, "file");
        return bg.b.c(new f(cVar.a(file), new n(this, 9)));
    }

    public final void Q() {
        Iterator it = this.C.values().iterator();
        long j = 0;
        while (it.hasNext()) {
            a aVar = (a) it.next();
            int i6 = 0;
            if (aVar.f9068g == null) {
                while (i6 < 2) {
                    j += aVar.f9063b[i6];
                    i6++;
                }
            } else {
                aVar.f9068g = null;
                while (i6 < 2) {
                    c0 c0Var = (c0) aVar.f9064c.get(i6);
                    c cVar = this.M;
                    cVar.e(c0Var);
                    cVar.e((c0) aVar.f9065d.get(i6));
                    i6++;
                }
                it.remove();
            }
        }
        this.E = j;
    }

    public final void S() {
        bg.f0 d10 = bg.b.d(this.M.l(this.f9079z));
        try {
            String x10 = d10.x(Long.MAX_VALUE);
            String x11 = d10.x(Long.MAX_VALUE);
            String x12 = d10.x(Long.MAX_VALUE);
            String x13 = d10.x(Long.MAX_VALUE);
            String x14 = d10.x(Long.MAX_VALUE);
            if ("libcore.io.DiskLruCache".equals(x10) && UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(x11) && kotlin.jvm.internal.k.a(String.valueOf(1), x12) && kotlin.jvm.internal.k.a(String.valueOf(2), x13) && x14.length() <= 0) {
                int i6 = 0;
                while (true) {
                    try {
                        a0(d10.x(Long.MAX_VALUE));
                        i6++;
                    } catch (EOFException unused) {
                        this.F = i6 - this.C.size();
                        if (!d10.r()) {
                            h0();
                        } else {
                            this.G = K();
                        }
                        try {
                            d10.close();
                            th = null;
                        } catch (Throwable th) {
                            th = th;
                        }
                        if (th == null) {
                            return;
                        } else {
                            throw th;
                        }
                    }
                }
            } else {
                throw new IOException("unexpected journal header: [" + x10 + ", " + x11 + ", " + x12 + ", " + x13 + ", " + x14 + ']');
            }
        } catch (Throwable th2) {
            th = th2;
            try {
                d10.close();
            } catch (Throwable th3) {
                he.a.a(th, th3);
            }
        }
    }

    public final void a0(String str) {
        String substring;
        int P = df.m.P(str, ' ', 0, 6);
        if (P != -1) {
            int i6 = P + 1;
            int P2 = df.m.P(str, ' ', i6, 4);
            LinkedHashMap linkedHashMap = this.C;
            if (P2 == -1) {
                substring = str.substring(i6);
                kotlin.jvm.internal.k.d(substring, "substring(...)");
                if (P == 6 && u.H(str, "REMOVE", false)) {
                    linkedHashMap.remove(substring);
                    return;
                }
            } else {
                substring = str.substring(i6, P2);
                kotlin.jvm.internal.k.d(substring, "substring(...)");
            }
            Object obj = linkedHashMap.get(substring);
            if (obj == null) {
                obj = new a(this, substring);
                linkedHashMap.put(substring, obj);
            }
            a aVar = (a) obj;
            if (P2 != -1 && P == 5 && u.H(str, "CLEAN", false)) {
                String substring2 = str.substring(P2 + 1);
                kotlin.jvm.internal.k.d(substring2, "substring(...)");
                List a02 = df.m.a0(substring2, new char[]{' '});
                aVar.f9066e = true;
                aVar.f9068g = null;
                if (a02.size() == 2) {
                    try {
                        int size = a02.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            aVar.f9063b[i10] = Long.parseLong((String) a02.get(i10));
                        }
                        return;
                    } catch (NumberFormatException unused) {
                        throw new IOException("unexpected journal line: " + a02);
                    }
                }
                throw new IOException("unexpected journal line: " + a02);
            }
            if (P2 == -1 && P == 5 && u.H(str, "DIRTY", false)) {
                aVar.f9068g = new a2.c(this, aVar);
                return;
            } else if (P2 == -1 && P == 4 && u.H(str, "READ", false)) {
                return;
            } else {
                throw new IOException("unexpected journal line: ".concat(str));
            }
        }
        throw new IOException("unexpected journal line: ".concat(str));
    }

    public final void b0(a aVar) {
        e0 e0Var;
        int i6 = aVar.f9069h;
        String str = aVar.f9062a;
        if (i6 > 0 && (e0Var = this.G) != null) {
            e0Var.F("DIRTY");
            e0Var.writeByte(32);
            e0Var.F(str);
            e0Var.writeByte(10);
            e0Var.flush();
        }
        if (aVar.f9069h <= 0 && aVar.f9068g == null) {
            for (int i10 = 0; i10 < 2; i10++) {
                this.M.e((c0) aVar.f9064c.get(i10));
                long j = this.E;
                long[] jArr = aVar.f9063b;
                this.E = j - jArr[i10];
                jArr[i10] = 0;
            }
            this.F++;
            e0 e0Var2 = this.G;
            if (e0Var2 != null) {
                e0Var2.F("REMOVE");
                e0Var2.writeByte(32);
                e0Var2.F(str);
                e0Var2.writeByte(10);
            }
            this.C.remove(str);
            if (this.F >= 2000) {
                y();
                return;
            }
            return;
        }
        aVar.f9067f = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.I && !this.J) {
                for (a aVar : (a[]) this.C.values().toArray(new a[0])) {
                    a2.c cVar = aVar.f9068g;
                    if (cVar != null) {
                        a aVar2 = (a) cVar.f171y;
                        if (kotlin.jvm.internal.k.a(aVar2.f9068g, cVar)) {
                            aVar2.f9067f = true;
                        }
                    }
                }
                f0();
                f0.i(this.D);
                e0 e0Var = this.G;
                kotlin.jvm.internal.k.b(e0Var);
                e0Var.close();
                this.G = null;
                this.J = true;
                return;
            }
            this.J = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized a2.c f(String str) {
        a2.c cVar;
        if (!this.J) {
            g0(str);
            m();
            a aVar = (a) this.C.get(str);
            if (aVar != null) {
                cVar = aVar.f9068g;
            } else {
                cVar = null;
            }
            if (cVar != null) {
                return null;
            }
            if (aVar != null && aVar.f9069h != 0) {
                return null;
            }
            if (!this.K && !this.L) {
                e0 e0Var = this.G;
                kotlin.jvm.internal.k.b(e0Var);
                e0Var.F("DIRTY");
                e0Var.writeByte(32);
                e0Var.F(str);
                e0Var.writeByte(10);
                e0Var.flush();
                if (this.H) {
                    return null;
                }
                if (aVar == null) {
                    aVar = new a(this, str);
                    this.C.put(str, aVar);
                }
                a2.c cVar2 = new a2.c(this, aVar);
                aVar.f9068g = cVar2;
                return cVar2;
            }
            y();
            return null;
        }
        throw new IllegalStateException("cache is closed");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        b0(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f0() {
        /*
            r5 = this;
        L0:
            long r0 = r5.E
            long r2 = r5.f9078y
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L27
            java.util.LinkedHashMap r0 = r5.C
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            n6.a r1 = (n6.a) r1
            boolean r2 = r1.f9067f
            if (r2 != 0) goto L12
            r5.b0(r1)
            goto L0
        L26:
            return
        L27:
            r0 = 0
            r5.K = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n6.e.f0():void");
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (!this.I) {
            return;
        }
        if (!this.J) {
            f0();
            e0 e0Var = this.G;
            kotlin.jvm.internal.k.b(e0Var);
            e0Var.flush();
            return;
        }
        throw new IllegalStateException("cache is closed");
    }

    public final synchronized void h0() {
        Throwable th;
        try {
            e0 e0Var = this.G;
            if (e0Var != null) {
                e0Var.close();
            }
            e0 c10 = bg.b.c(this.M.k(this.A));
            try {
                c10.F("libcore.io.DiskLruCache");
                c10.writeByte(10);
                c10.F(UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
                c10.writeByte(10);
                c10.Z(1);
                c10.writeByte(10);
                c10.Z(2);
                c10.writeByte(10);
                c10.writeByte(10);
                for (a aVar : this.C.values()) {
                    if (aVar.f9068g != null) {
                        c10.F("DIRTY");
                        c10.writeByte(32);
                        c10.F(aVar.f9062a);
                        c10.writeByte(10);
                    } else {
                        c10.F("CLEAN");
                        c10.writeByte(32);
                        c10.F(aVar.f9062a);
                        for (long j : aVar.f9063b) {
                            c10.writeByte(32);
                            c10.Z(j);
                        }
                        c10.writeByte(10);
                    }
                }
                try {
                    c10.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                try {
                    c10.close();
                } catch (Throwable th4) {
                    he.a.a(th3, th4);
                }
                th = th3;
            }
            if (th == null) {
                if (this.M.f(this.f9079z)) {
                    this.M.b(this.f9079z, this.B);
                    this.M.b(this.A, this.f9079z);
                    this.M.e(this.B);
                } else {
                    this.M.b(this.A, this.f9079z);
                }
                this.G = K();
                this.F = 0;
                this.H = false;
                this.L = false;
            } else {
                throw th;
            }
        } catch (Throwable th5) {
            throw th5;
        }
    }

    public final synchronized b l(String str) {
        b a10;
        if (!this.J) {
            g0(str);
            m();
            a aVar = (a) this.C.get(str);
            if (aVar != null && (a10 = aVar.a()) != null) {
                boolean z10 = true;
                this.F++;
                e0 e0Var = this.G;
                kotlin.jvm.internal.k.b(e0Var);
                e0Var.F("READ");
                e0Var.writeByte(32);
                e0Var.F(str);
                e0Var.writeByte(10);
                if (this.F < 2000) {
                    z10 = false;
                }
                if (z10) {
                    y();
                }
                return a10;
            }
            return null;
        }
        throw new IllegalStateException("cache is closed");
    }

    public final synchronized void m() {
        try {
            if (this.I) {
                return;
            }
            this.M.e(this.A);
            if (this.M.f(this.B)) {
                if (this.M.f(this.f9079z)) {
                    this.M.e(this.B);
                } else {
                    this.M.b(this.B, this.f9079z);
                }
            }
            if (this.M.f(this.f9079z)) {
                try {
                    S();
                    Q();
                    this.I = true;
                    return;
                } catch (IOException unused) {
                    try {
                        close();
                        a8.d.c(this.M, this.f9077x);
                        this.J = false;
                    } catch (Throwable th) {
                        this.J = false;
                        throw th;
                    }
                }
            }
            h0();
            this.I = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void y() {
        f0.w(this.D, null, new d(this, null, 0), 3);
    }
}
