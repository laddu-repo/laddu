package n9;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.SystemClock;
import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h3 extends g0 {
    public final g3 A;
    public h0 B;
    public volatile Boolean C;
    public final d3 D;
    public ScheduledExecutorService E;
    public final d2.i F;
    public final ArrayList G;
    public final d3 H;

    public h3(n1 n1Var) {
        super(n1Var);
        this.G = new ArrayList();
        this.F = new d2.i(n1Var.H);
        this.A = new g3(this);
        this.D = new d3(this, n1Var, 0);
        this.H = new d3(this, n1Var, 1);
    }

    @Override // n9.g0
    public final boolean g1() {
        return false;
    }

    public final void h1(AtomicReference atomicReference) {
        d1();
        e1();
        r1(new d6.b(this, atomicReference, t1(false)));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i1(android.os.Bundle r8) {
        /*
            r7 = this;
            r7.d1()
            r7.e1()
            n9.u r4 = new n9.u
            r4.<init>(r8)
            r7.p1()
            java.lang.Object r0 = r7.f4301y
            n9.n1 r0 = (n9.n1) r0
            n9.g r1 = r0.A
            r2 = 0
            n9.d0 r3 = n9.e0.f9236d1
            boolean r1 = r1.n1(r2, r3)
            r2 = 0
            if (r1 == 0) goto L59
            n9.o0 r0 = r0.i()
            java.lang.Object r1 = r0.f4301y
            n9.n1 r1 = (n9.n1) r1
            n9.j4 r3 = r1.F
            n9.u0 r1 = r1.C
            n9.n1.e(r3)
            byte[] r3 = n9.j4.I1(r4)
            if (r3 != 0) goto L3f
            n9.n1.g(r1)
            n9.s0 r0 = r1.E
            java.lang.String r1 = "Null default event parameters; not writing to database"
            r0.a(r1)
        L3d:
            r0 = 0
            goto L54
        L3f:
            int r5 = r3.length
            r6 = 131072(0x20000, float:1.83671E-40)
            if (r5 <= r6) goto L4f
            n9.n1.g(r1)
            n9.s0 r0 = r1.E
            java.lang.String r1 = "Default event parameters too long for local database. Sending directly to service"
            r0.a(r1)
            goto L3d
        L4f:
            r1 = 4
            boolean r0 = r0.k1(r1, r3)
        L54:
            if (r0 == 0) goto L59
            r0 = 1
            r3 = 1
            goto L5a
        L59:
            r3 = 0
        L5a:
            n9.l4 r2 = r7.t1(r2)
            n9.f2 r0 = new n9.f2
            r1 = r7
            r5 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            r7.r1(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.h3.i1(android.os.Bundle):void");
    }

    public final void j1() {
        d1();
        e1();
        if (!u1()) {
            if (!k1()) {
                n1 n1Var = (n1) this.f4301y;
                if (!n1Var.A.g1()) {
                    List<ResolveInfo> queryIntentServices = n1Var.f9413x.getPackageManager().queryIntentServices(new Intent().setClassName(n1Var.f9413x, "com.google.android.gms.measurement.AppMeasurementService"), 65536);
                    if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                        Intent intent = new Intent("com.google.android.gms.measurement.START");
                        intent.setComponent(new ComponentName(n1Var.f9413x, "com.google.android.gms.measurement.AppMeasurementService"));
                        g3 g3Var = this.A;
                        h3 h3Var = g3Var.f9330z;
                        h3Var.d1();
                        Context context = ((n1) h3Var.f4301y).f9413x;
                        z8.a b10 = z8.a.b();
                        synchronized (g3Var) {
                            try {
                                if (g3Var.f9328x) {
                                    u0 u0Var = ((n1) g3Var.f9330z.f4301y).C;
                                    n1.g(u0Var);
                                    u0Var.L.a("Connection attempt already in progress");
                                    return;
                                } else {
                                    h3 h3Var2 = g3Var.f9330z;
                                    u0 u0Var2 = ((n1) h3Var2.f4301y).C;
                                    n1.g(u0Var2);
                                    u0Var2.L.a("Using local app measurement service");
                                    g3Var.f9328x = true;
                                    b10.a(context, intent, h3Var2.A, 129);
                                    return;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    u0 u0Var3 = n1Var.C;
                    n1.g(u0Var3);
                    u0Var3.D.a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
                    return;
                }
                return;
            }
            this.A.b();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean k1() {
        /*
            Method dump skipped, instructions count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.h3.k1():boolean");
    }

    public final void l1() {
        d1();
        e1();
        g3 g3Var = this.A;
        if (g3Var.f9329y != null && (g3Var.f9329y.i() || g3Var.f9329y.f())) {
            g3Var.f9329y.h();
        }
        g3Var.f9329y = null;
        try {
            z8.a.b().c(((n1) this.f4301y).f9413x, g3Var);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.B = null;
    }

    public final boolean m1() {
        d1();
        e1();
        if (k1()) {
            j4 j4Var = ((n1) this.f4301y).F;
            n1.e(j4Var);
            if (j4Var.K1() < ((Integer) e0.K0.a(null)).intValue()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean n1() {
        d1();
        e1();
        if (k1()) {
            j4 j4Var = ((n1) this.f4301y).F;
            n1.e(j4Var);
            if (j4Var.K1() < 241200) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void o1(ComponentName componentName) {
        d1();
        if (this.B != null) {
            this.B = null;
            u0 u0Var = ((n1) this.f4301y).C;
            n1.g(u0Var);
            u0Var.L.b(componentName, "Disconnected from device MeasurementService");
            d1();
            j1();
        }
    }

    public final void p1() {
        ((n1) this.f4301y).getClass();
    }

    public final void q1() {
        d1();
        d2.i iVar = this.F;
        ((a9.a) iVar.f3733z).getClass();
        iVar.f3732y = SystemClock.elapsedRealtime();
        ((n1) this.f4301y).getClass();
        this.D.b(((Long) e0.Z.a(null)).longValue());
    }

    public final void r1(Runnable runnable) {
        d1();
        if (u1()) {
            runnable.run();
            return;
        }
        ArrayList arrayList = this.G;
        long size = arrayList.size();
        n1 n1Var = (n1) this.f4301y;
        n1Var.getClass();
        if (size >= 1000) {
            u0 u0Var = n1Var.C;
            n1.g(u0Var);
            u0Var.D.a("Discarding data. Max runnable queue size reached");
        } else {
            arrayList.add(runnable);
            this.H.b(60000L);
            j1();
        }
    }

    public final void s1() {
        d1();
        n1 n1Var = (n1) this.f4301y;
        u0 u0Var = n1Var.C;
        n1.g(u0Var);
        s0 s0Var = u0Var.L;
        ArrayList arrayList = this.G;
        s0Var.b(Integer.valueOf(arrayList.size()), "Processing queued up service tasks");
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            try {
                ((Runnable) obj).run();
            } catch (RuntimeException e10) {
                u0 u0Var2 = n1Var.C;
                n1.g(u0Var2);
                u0Var2.D.b(e10, "Task exception while flushing queue");
            }
        }
        arrayList.clear();
        this.H.c();
    }

    public final l4 t1(boolean z10) {
        long abs;
        Pair pair;
        n1 n1Var = (n1) this.f4301y;
        n1Var.getClass();
        m0 l10 = n1Var.l();
        String str = null;
        if (z10) {
            u0 u0Var = n1Var.C;
            n1.g(u0Var);
            n1 n1Var2 = (n1) u0Var.f4301y;
            c1 c1Var = n1Var2.B;
            n1.e(c1Var);
            if (c1Var.C != null) {
                c1 c1Var2 = n1Var2.B;
                n1.e(c1Var2);
                i4.m0 m0Var = c1Var2.C;
                c1 c1Var3 = (c1) m0Var.B;
                c1Var3.d1();
                c1Var3.d1();
                long j = ((c1) m0Var.B).h1().getLong((String) m0Var.f6460y, 0L);
                if (j == 0) {
                    m0Var.s();
                    abs = 0;
                } else {
                    ((n1) c1Var3.f4301y).H.getClass();
                    abs = Math.abs(j - System.currentTimeMillis());
                }
                long j10 = m0Var.A;
                if (abs >= j10) {
                    if (abs > j10 + j10) {
                        m0Var.s();
                    } else {
                        String string = c1Var3.h1().getString((String) m0Var.f6461z, null);
                        long j11 = c1Var3.h1().getLong((String) m0Var.f6459x, 0L);
                        m0Var.s();
                        if (string != null && j11 > 0) {
                            pair = new Pair(string, Long.valueOf(j11));
                        } else {
                            pair = c1.X;
                        }
                        if (pair != null && pair != c1.X) {
                            String valueOf = String.valueOf(pair.second);
                            String str2 = (String) pair.first;
                            StringBuilder sb2 = new StringBuilder(valueOf.length() + 1 + String.valueOf(str2).length());
                            sb2.append(valueOf);
                            sb2.append(":");
                            sb2.append(str2);
                            str = sb2.toString();
                        }
                    }
                }
                pair = null;
                if (pair != null) {
                    String valueOf2 = String.valueOf(pair.second);
                    String str22 = (String) pair.first;
                    StringBuilder sb22 = new StringBuilder(valueOf2.length() + 1 + String.valueOf(str22).length());
                    sb22.append(valueOf2);
                    sb22.append(":");
                    sb22.append(str22);
                    str = sb22.toString();
                }
            }
        }
        return l10.h1(str);
    }

    public final boolean u1() {
        d1();
        e1();
        if (this.B != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0467 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0467 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0405 A[Catch: all -> 0x0441, TRY_ENTER, TryCatch #21 {all -> 0x0441, blocks: (B:207:0x0431, B:230:0x0405, B:232:0x040b, B:233:0x040e, B:221:0x0452, B:343:0x0346, B:347:0x0350, B:348:0x0361), top: B:206:0x0431 }] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0467 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:285:0x02c2 A[Catch: all -> 0x01ea, SQLiteException -> 0x029c, SQLiteDatabaseLockedException -> 0x02a1, SQLiteFullException -> 0x02a5, TryCatch #45 {all -> 0x01ea, blocks: (B:177:0x01c5, B:180:0x01d9, B:182:0x01de, B:189:0x0202, B:190:0x0205, B:193:0x01fe, B:240:0x020b, B:243:0x021f, B:245:0x0237, B:248:0x0240, B:249:0x0243, B:251:0x0231, B:254:0x0247, B:257:0x025b, B:259:0x0273, B:264:0x027d, B:265:0x0280, B:262:0x026d, B:275:0x0284, B:283:0x0298, B:285:0x02c2, B:293:0x02cc, B:294:0x02cf, B:299:0x02bc, B:270:0x02dc, B:272:0x02e9, B:340:0x0331), top: B:176:0x01c5 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0600  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0608  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v1(n9.h0 r67, x8.a r68, n9.l4 r69) {
        /*
            Method dump skipped, instructions count: 1716
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.h3.v1(n9.h0, x8.a, n9.l4):void");
    }

    public final void w1(e eVar) {
        boolean k12;
        d1();
        e1();
        n1 n1Var = (n1) this.f4301y;
        n1Var.getClass();
        o0 i6 = n1Var.i();
        n1 n1Var2 = (n1) i6.f4301y;
        n1.e(n1Var2.F);
        byte[] I1 = j4.I1(eVar);
        if (I1.length > 131072) {
            u0 u0Var = n1Var2.C;
            n1.g(u0Var);
            u0Var.E.a("Conditional user property too long for local database. Sending directly to service");
            k12 = false;
        } else {
            k12 = i6.k1(2, I1);
        }
        r1(new b3(this, t1(true), k12, new e(eVar)));
    }
}
