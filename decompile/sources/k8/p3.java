package k8;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.SystemClock;
import com.google.android.gms.internal.measurement.ag;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class p3 extends h0 {
    public volatile Boolean A;
    public final l3 B;
    public ScheduledExecutorService C;
    public final e3.c D;
    public final ArrayList E;
    public final l3 F;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final o3 f7700y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public i0 f7701z;

    public p3(p1 p1Var) {
        super(p1Var);
        this.E = new ArrayList();
        this.D = new e3.c(p1Var.F);
        this.f7700y = new o3(this);
        this.B = new l3(this, p1Var, 0);
        this.F = new l3(this, p1Var, 1);
    }

    @Override // k8.h0
    public final boolean G() {
        return false;
    }

    public final void H(AtomicReference atomicReference) {
        D();
        E();
        R(new ag(this, atomicReference, T(false)));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void I(android.os.Bundle r8) {
        /*
            r7 = this;
            r7.D()
            r7.E()
            k8.u r4 = new k8.u
            r4.<init>(r8)
            r7.P()
            java.lang.Object r0 = r7.f2053w
            k8.p1 r0 = (k8.p1) r0
            k8.g r1 = r0.f7695y
            r2 = 0
            k8.e0 r3 = k8.f0.X0
            boolean r1 = r1.O(r2, r3)
            r2 = 0
            if (r1 == 0) goto L59
            k8.p0 r0 = r0.n()
            java.lang.Object r1 = r0.f2053w
            k8.p1 r1 = (k8.p1) r1
            k8.t4 r3 = r1.D
            k8.v0 r1 = r1.A
            k8.p1.j(r3)
            byte[] r3 = k8.t4.n0(r4)
            if (r3 != 0) goto L3f
            k8.p1.l(r1)
            k8.t0 r0 = r1.C
            java.lang.String r1 = "Null default event parameters; not writing to database"
            r0.a(r1)
        L3d:
            r0 = r2
            goto L54
        L3f:
            int r5 = r3.length
            r6 = 131072(0x20000, float:1.83671E-40)
            if (r5 <= r6) goto L4f
            k8.p1.l(r1)
            k8.t0 r0 = r1.C
            java.lang.String r1 = "Default event parameters too long for local database. Sending directly to service"
            r0.a(r1)
            goto L3d
        L4f:
            r1 = 4
            boolean r0 = r0.K(r1, r3)
        L54:
            if (r0 == 0) goto L59
            r0 = 1
            r3 = r0
            goto L5a
        L59:
            r3 = r2
        L5a:
            k8.v4 r2 = r7.T(r2)
            k8.l2 r0 = new k8.l2
            r1 = r7
            r5 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            r7.R(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.p3.I(android.os.Bundle):void");
    }

    public final void J() {
        D();
        E();
        if (U()) {
            return;
        }
        if (K()) {
            this.f7700y.a();
            return;
        }
        p1 p1Var = (p1) this.f2053w;
        if (p1Var.f7695y.G()) {
            return;
        }
        List<ResolveInfo> listQueryIntentServices = p1Var.f7692v.getPackageManager().queryIntentServices(new Intent().setClassName(p1Var.f7692v, "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            v0 v0Var = p1Var.A;
            p1.l(v0Var);
            v0Var.B.a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        intent.setComponent(new ComponentName(p1Var.f7692v, "com.google.android.gms.measurement.AppMeasurementService"));
        o3 o3Var = this.f7700y;
        p3 p3Var = o3Var.f7676x;
        p3Var.D();
        Context context = ((p1) p3Var.f2053w).f7692v;
        w7.a aVarB = w7.a.b();
        synchronized (o3Var) {
            try {
                if (o3Var.f7674v) {
                    v0 v0Var2 = ((p1) o3Var.f7676x.f2053w).A;
                    p1.l(v0Var2);
                    v0Var2.J.a("Connection attempt already in progress");
                } else {
                    p3 p3Var2 = o3Var.f7676x;
                    v0 v0Var3 = ((p1) p3Var2.f2053w).A;
                    p1.l(v0Var3);
                    v0Var3.J.a("Using local app measurement service");
                    o3Var.f7674v = true;
                    aVarB.a(context, intent, p3Var2.f7700y, 129);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean K() {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.p3.K():boolean");
    }

    public final void L() {
        D();
        E();
        o3 o3Var = this.f7700y;
        if (o3Var.f7675w != null && (o3Var.f7675w.q() || o3Var.f7675w.r())) {
            o3Var.f7675w.e();
        }
        o3Var.f7675w = null;
        try {
            w7.a.b().c(((p1) this.f2053w).f7692v, o3Var);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f7701z = null;
    }

    public final boolean M() {
        D();
        E();
        if (!K()) {
            return true;
        }
        t4 t4Var = ((p1) this.f2053w).D;
        p1.j(t4Var);
        return t4Var.p0() >= ((Integer) f0.K0.a(null)).intValue();
    }

    public final boolean N() {
        D();
        E();
        if (!K()) {
            return true;
        }
        t4 t4Var = ((p1) this.f2053w).D;
        p1.j(t4Var);
        return t4Var.p0() >= 241200;
    }

    public final void O(ComponentName componentName) {
        D();
        if (this.f7701z != null) {
            this.f7701z = null;
            v0 v0Var = ((p1) this.f2053w).A;
            p1.l(v0Var);
            v0Var.J.b(componentName, "Disconnected from device MeasurementService");
            D();
            J();
        }
    }

    public final void P() {
        ((p1) this.f2053w).getClass();
    }

    public final void Q() {
        D();
        e3.c cVar = this.D;
        ((x7.a) cVar.f4745x).getClass();
        cVar.f4744w = SystemClock.elapsedRealtime();
        ((p1) this.f2053w).getClass();
        this.B.b(((Long) f0.Z.a(null)).longValue());
    }

    public final void R(Runnable runnable) {
        D();
        if (U()) {
            runnable.run();
            return;
        }
        ArrayList arrayList = this.E;
        long size = arrayList.size();
        p1 p1Var = (p1) this.f2053w;
        p1Var.getClass();
        if (size >= 1000) {
            v0 v0Var = p1Var.A;
            p1.l(v0Var);
            v0Var.B.a("Discarding data. Max runnable queue size reached");
        } else {
            arrayList.add(runnable);
            this.F.b(60000L);
            J();
        }
    }

    public final void S() {
        D();
        p1 p1Var = (p1) this.f2053w;
        v0 v0Var = p1Var.A;
        p1.l(v0Var);
        t0 t0Var = v0Var.J;
        ArrayList arrayList = this.E;
        t0Var.b(Integer.valueOf(arrayList.size()), "Processing queued up service tasks");
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            try {
                ((Runnable) obj).run();
            } catch (RuntimeException e7) {
                v0 v0Var2 = p1Var.A;
                p1.l(v0Var2);
                v0Var2.B.b(e7, "Task exception while flushing queue");
            }
        }
        arrayList.clear();
        this.F.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final k8.v4 T(boolean r11) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.p3.T(boolean):k8.v4");
    }

    public final boolean U() {
        D();
        E();
        return this.f7701z != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:259:0x0444 A[Catch: all -> 0x0480, TRY_ENTER, TryCatch #54 {all -> 0x0480, blocks: (B:269:0x0470, B:259:0x0444, B:261:0x044a, B:262:0x044d, B:279:0x0491, B:208:0x037b, B:210:0x0385, B:215:0x0396), top: B:397:0x0470 }] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x047c A[PHI: r5 r7 r24 r25 r27 r37 r38
  0x047c: PHI (r5v15 android.database.sqlite.SQLiteDatabase) = 
  (r5v12 android.database.sqlite.SQLiteDatabase)
  (r5v13 android.database.sqlite.SQLiteDatabase)
  (r5v16 android.database.sqlite.SQLiteDatabase)
 binds: [B:265:0x045f, B:282:0x04a3, B:273:0x047a] A[DONT_GENERATE, DONT_INLINE]
  0x047c: PHI (r7v5 int) = (r7v3 int), (r7v3 int), (r7v6 int) binds: [B:265:0x045f, B:282:0x04a3, B:273:0x047a] A[DONT_GENERATE, DONT_INLINE]
  0x047c: PHI (r24v9 int) = (r24v6 int), (r24v7 int), (r24v10 int) binds: [B:265:0x045f, B:282:0x04a3, B:273:0x047a] A[DONT_GENERATE, DONT_INLINE]
  0x047c: PHI (r25v9 java.lang.String) = (r25v6 java.lang.String), (r25v7 java.lang.String), (r25v10 java.lang.String) binds: [B:265:0x045f, B:282:0x04a3, B:273:0x047a] A[DONT_GENERATE, DONT_INLINE]
  0x047c: PHI (r27v9 java.lang.String) = (r27v6 java.lang.String), (r27v7 java.lang.String), (r27v10 java.lang.String) binds: [B:265:0x045f, B:282:0x04a3, B:273:0x047a] A[DONT_GENERATE, DONT_INLINE]
  0x047c: PHI (r37v9 int) = (r37v6 int), (r37v7 int), (r37v10 int) binds: [B:265:0x045f, B:282:0x04a3, B:273:0x047a] A[DONT_GENERATE, DONT_INLINE]
  0x047c: PHI (r38v9 java.lang.String) = (r38v6 java.lang.String), (r38v7 java.lang.String), (r38v10 java.lang.String) binds: [B:265:0x045f, B:282:0x04a3, B:273:0x047a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0597  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x062c  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x04a6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:457:0x04a6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:459:0x04a6 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void V(k8.i0 r70, u7.a r71, k8.v4 r72) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1754
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.p3.V(k8.i0, u7.a, k8.v4):void");
    }

    public final void W(e eVar) {
        boolean zK;
        D();
        E();
        p1 p1Var = (p1) this.f2053w;
        p1Var.getClass();
        p0 p0VarN = p1Var.n();
        p1 p1Var2 = (p1) p0VarN.f2053w;
        p1.j(p1Var2.D);
        byte[] bArrN0 = t4.n0(eVar);
        if (bArrN0.length > 131072) {
            v0 v0Var = p1Var2.A;
            p1.l(v0Var);
            v0Var.C.a("Conditional user property too long for local database. Sending directly to service");
            zK = false;
        } else {
            zK = p0VarN.K(2, bArrN0);
        }
        R(new j3(this, T(true), zK, new e(eVar)));
    }
}
