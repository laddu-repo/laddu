package da;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.ComponentName;
import android.os.Build;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import androidx.media3.decoder.DecoderInputBuffer;
import com.google.android.gms.internal.measurement.o6;
import com.google.android.gms.internal.measurement.z6;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import k8.b4;
import k8.c3;
import k8.e1;
import k8.k2;
import k8.n4;
import k8.o3;
import k8.p1;
import k8.p3;
import k8.s3;
import k8.u2;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class m0 implements Runnable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f4433v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f4434w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f4435x;

    public /* synthetic */ m0(int i, Object obj, Object obj2) {
        this.f4433v = i;
        this.f4434w = obj;
        this.f4435x = obj2;
    }

    private final void a() {
        try {
            o();
        } catch (Error e7) {
            synchronized (((a1) this.f4435x).f4391w) {
                ((a1) this.f4435x).f4392x = 1;
                throw e7;
            }
        }
    }

    private final void b() {
        u2 u2Var = (u2) this.f4434w;
        u2Var.D();
        if (Build.VERSION.SDK_INT < 30) {
            return;
        }
        List<b4> list = (List) this.f4435x;
        k8.d1 d1Var = ((p1) u2Var.f2053w).f7696z;
        p1.j(d1Var);
        SparseArray sparseArrayJ = d1Var.J();
        for (b4 b4Var : list) {
            int i = b4Var.f7410x;
            if (!sparseArrayJ.contains(i) || ((Long) sparseArrayJ.get(i)).longValue() < b4Var.f7409w) {
                u2Var.b0().add(b4Var);
            }
        }
        u2Var.c0();
    }

    private final void c() {
        p3 p3Var = (p3) this.f4435x;
        k8.i0 i0Var = p3Var.f7701z;
        p1 p1Var = (p1) p3Var.f2053w;
        if (i0Var == null) {
            k8.v0 v0Var = p1Var.A;
            p1.l(v0Var);
            v0Var.B.a("Failed to send current screen to service");
            return;
        }
        try {
            c3 c3Var = (c3) this.f4434w;
            if (c3Var == null) {
                i0Var.u(0L, null, null, p1Var.f7692v.getPackageName());
            } else {
                i0Var.u(c3Var.f7429c, c3Var.f7427a, c3Var.f7428b, p1Var.f7692v.getPackageName());
            }
            p3Var.Q();
        } catch (RemoteException e7) {
            k8.v0 v0Var2 = ((p1) p3Var.f2053w).A;
            p1.l(v0Var2);
            v0Var2.B.b(e7, "Failed to send current screen to the service");
        }
    }

    private final void d() {
        ((o3) this.f4435x).f7676x.O((ComponentName) this.f4434w);
    }

    private final void e() {
        p3 p3Var = ((o3) this.f4435x).f7676x;
        p3Var.f7701z = null;
        if (((q7.b) this.f4434w).f10894w != 7777) {
            p3Var.S();
            return;
        }
        if (p3Var.C == null) {
            p3Var.C = Executors.newScheduledThreadPool(1);
        }
        p3Var.C.schedule(new androidx.fragment.app.m(13, this), ((Long) k8.f0.f7480a0.a(null)).longValue(), TimeUnit.MILLISECONDS);
    }

    private final void f() {
        n4 n4Var = (n4) this.f4434w;
        n4Var.V();
        Runnable runnable = (Runnable) this.f4435x;
        n4Var.d().D();
        if (n4Var.K == null) {
            n4Var.K = new ArrayList();
        }
        n4Var.K.add(runnable);
        n4Var.q();
    }

    private final /* synthetic */ void g() {
        s5.d dVar = (s5.d) this.f4434w;
        JobParameters jobParameters = (JobParameters) this.f4435x;
        Log.v("FA", "[sgtm] AppMeasurementJobService processed last Scion upload request.");
        ((s3) ((Service) dVar.f11493v)).c(jobParameters);
    }

    private final void h() {
        ((me.h) this.f4435x).E((me.q0) this.f4434w);
    }

    private final void i() {
        try {
            o();
        } catch (Error e7) {
            synchronized (((na.i) this.f4435x).f9062w) {
                ((na.i) this.f4435x).f9063x = 1;
                throw e7;
            }
        }
    }

    private final void j() {
        ((me.h) this.f4434w).E((ne.c) this.f4435x);
    }

    private final void k() {
        o8.o oVar = (o8.o) this.f4434w;
        if (oVar.f9985d) {
            ((o8.k) this.f4435x).f9974y.o();
            return;
        }
        try {
            ((o8.k) this.f4435x).f9974y.l(((o8.k) this.f4435x).f9973x.d(oVar));
        } catch (o8.f e7) {
            if (!(e7.getCause() instanceof Exception)) {
                ((o8.k) this.f4435x).f9974y.n(e7);
                return;
            }
            o8.k kVar = (o8.k) this.f4435x;
            kVar.f9974y.n((Exception) e7.getCause());
        } catch (Exception e10) {
            ((o8.k) this.f4435x).f9974y.n(e10);
        }
    }

    private final void l() {
        o8.k kVar = (o8.k) this.f4435x;
        try {
            o8.o oVar = (o8.o) kVar.f9973x.d((o8.o) this.f4434w);
            if (oVar == null) {
                kVar.z(new NullPointerException("Continuation returned null"));
                return;
            }
            h.p pVar = o8.i.f9965b;
            oVar.d(pVar, kVar);
            oVar.c(pVar, kVar);
            oVar.a(pVar, kVar);
        } catch (o8.f e7) {
            if (!(e7.getCause() instanceof Exception)) {
                kVar.f9974y.n(e7);
            } else {
                kVar.f9974y.n((Exception) e7.getCause());
            }
        } catch (Exception e10) {
            kVar.f9974y.n(e10);
        }
    }

    private final void m() {
        o8.l lVar = (o8.l) this.f4435x;
        synchronized (lVar.f9977x) {
            ((o8.c) lVar.f9978y).u((o8.o) this.f4434w);
        }
    }

    private final void n() {
        o8.l lVar = (o8.l) this.f4435x;
        synchronized (lVar.f9977x) {
            try {
                o8.d dVar = (o8.d) lVar.f9978y;
                if (dVar != null) {
                    Exception excG = ((o8.o) this.f4434w).g();
                    t7.y.g(excG);
                    dVar.z(excG);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        if (r1 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        ((java.lang.Runnable) r10.f4434w).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005c, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005d, code lost:
    
        da.a1.A.a().log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.f4434w), (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007e, code lost:
    
        r10.f4434w = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0080, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x003c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void p() {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L2:
            java.lang.Object r2 = r10.f4435x     // Catch: java.lang.Throwable -> L58
            da.a1 r2 = (da.a1) r2     // Catch: java.lang.Throwable -> L58
            java.util.ArrayDeque r2 = r2.f4391w     // Catch: java.lang.Throwable -> L58
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L58
            r3 = 1
            if (r0 != 0) goto L2c
            java.lang.Object r0 = r10.f4435x     // Catch: java.lang.Throwable -> L20
            da.a1 r0 = (da.a1) r0     // Catch: java.lang.Throwable -> L20
            int r4 = r0.f4392x     // Catch: java.lang.Throwable -> L20
            r5 = 4
            if (r4 != r5) goto L22
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L46
        L18:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L46
        L20:
            r0 = move-exception
            goto L81
        L22:
            long r6 = r0.f4393y     // Catch: java.lang.Throwable -> L20
            r8 = 1
            long r6 = r6 + r8
            r0.f4393y = r6     // Catch: java.lang.Throwable -> L20
            r0.f4392x = r5     // Catch: java.lang.Throwable -> L20
            r0 = r3
        L2c:
            java.lang.Object r4 = r10.f4435x     // Catch: java.lang.Throwable -> L20
            da.a1 r4 = (da.a1) r4     // Catch: java.lang.Throwable -> L20
            java.util.ArrayDeque r4 = r4.f4391w     // Catch: java.lang.Throwable -> L20
            java.lang.Object r4 = r4.poll()     // Catch: java.lang.Throwable -> L20
            java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch: java.lang.Throwable -> L20
            r10.f4434w = r4     // Catch: java.lang.Throwable -> L20
            if (r4 != 0) goto L47
            java.lang.Object r0 = r10.f4435x     // Catch: java.lang.Throwable -> L20
            da.a1 r0 = (da.a1) r0     // Catch: java.lang.Throwable -> L20
            r0.f4392x = r3     // Catch: java.lang.Throwable -> L20
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L46
            goto L18
        L46:
            return
        L47:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L58
            r1 = r1 | r2
            r2 = 0
            java.lang.Object r3 = r10.f4434w     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5c
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5c
            r3.run()     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5c
        L55:
            r10.f4434w = r2     // Catch: java.lang.Throwable -> L58
            goto L2
        L58:
            r0 = move-exception
            goto L83
        L5a:
            r0 = move-exception
            goto L7e
        L5c:
            r3 = move-exception
            da.u0 r4 = da.a1.A     // Catch: java.lang.Throwable -> L5a
            java.util.logging.Logger r4 = r4.a()     // Catch: java.lang.Throwable -> L5a
            java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L5a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5a
            r6.<init>()     // Catch: java.lang.Throwable -> L5a
            java.lang.String r7 = "Exception while executing runnable "
            r6.append(r7)     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r7 = r10.f4434w     // Catch: java.lang.Throwable -> L5a
            java.lang.Runnable r7 = (java.lang.Runnable) r7     // Catch: java.lang.Throwable -> L5a
            r6.append(r7)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L5a
            r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L5a
            goto L55
        L7e:
            r10.f4434w = r2     // Catch: java.lang.Throwable -> L58
            throw r0     // Catch: java.lang.Throwable -> L58
        L81:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            throw r0     // Catch: java.lang.Throwable -> L58
        L83:
            if (r1 == 0) goto L8c
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L8c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: da.m0.p():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        if (r1 == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0051, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0053, code lost:
    
        ((java.lang.Runnable) r10.f4434w).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0061, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0062, code lost:
    
        na.i.A.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.f4434w), (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007f, code lost:
    
        r10.f4434w = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0081, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0041 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void o() {
        /*
            r10 = this;
            int r0 = r10.f4433v
            switch(r0) {
                case 2: goto L8e;
                default: goto L5;
            }
        L5:
            r0 = 0
            r1 = r0
        L7:
            java.lang.Object r2 = r10.f4435x     // Catch: java.lang.Throwable -> L5d
            na.i r2 = (na.i) r2     // Catch: java.lang.Throwable -> L5d
            java.util.ArrayDeque r2 = r2.f9062w     // Catch: java.lang.Throwable -> L5d
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L5d
            r3 = 1
            if (r0 != 0) goto L31
            java.lang.Object r0 = r10.f4435x     // Catch: java.lang.Throwable -> L25
            na.i r0 = (na.i) r0     // Catch: java.lang.Throwable -> L25
            int r4 = r0.f9063x     // Catch: java.lang.Throwable -> L25
            r5 = 4
            if (r4 != r5) goto L27
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L25
            if (r1 == 0) goto L4b
        L1d:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L4b
        L25:
            r0 = move-exception
            goto L82
        L27:
            long r6 = r0.f9064y     // Catch: java.lang.Throwable -> L25
            r8 = 1
            long r6 = r6 + r8
            r0.f9064y = r6     // Catch: java.lang.Throwable -> L25
            r0.f9063x = r5     // Catch: java.lang.Throwable -> L25
            r0 = r3
        L31:
            java.lang.Object r4 = r10.f4435x     // Catch: java.lang.Throwable -> L25
            na.i r4 = (na.i) r4     // Catch: java.lang.Throwable -> L25
            java.util.ArrayDeque r4 = r4.f9062w     // Catch: java.lang.Throwable -> L25
            java.lang.Object r4 = r4.poll()     // Catch: java.lang.Throwable -> L25
            java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch: java.lang.Throwable -> L25
            r10.f4434w = r4     // Catch: java.lang.Throwable -> L25
            if (r4 != 0) goto L4c
            java.lang.Object r0 = r10.f4435x     // Catch: java.lang.Throwable -> L25
            na.i r0 = (na.i) r0     // Catch: java.lang.Throwable -> L25
            r0.f9063x = r3     // Catch: java.lang.Throwable -> L25
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L25
            if (r1 == 0) goto L4b
            goto L1d
        L4b:
            return
        L4c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L25
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L5d
            r1 = r1 | r2
            r2 = 0
            java.lang.Object r3 = r10.f4434w     // Catch: java.lang.Throwable -> L5f java.lang.RuntimeException -> L61
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L5f java.lang.RuntimeException -> L61
            r3.run()     // Catch: java.lang.Throwable -> L5f java.lang.RuntimeException -> L61
        L5a:
            r10.f4434w = r2     // Catch: java.lang.Throwable -> L5d
            goto L7
        L5d:
            r0 = move-exception
            goto L84
        L5f:
            r0 = move-exception
            goto L7f
        L61:
            r3 = move-exception
            java.util.logging.Logger r4 = na.i.A     // Catch: java.lang.Throwable -> L5f
            java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L5f
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5f
            r6.<init>()     // Catch: java.lang.Throwable -> L5f
            java.lang.String r7 = "Exception while executing runnable "
            r6.append(r7)     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r7 = r10.f4434w     // Catch: java.lang.Throwable -> L5f
            java.lang.Runnable r7 = (java.lang.Runnable) r7     // Catch: java.lang.Throwable -> L5f
            r6.append(r7)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L5f
            r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L5f
            goto L5a
        L7f:
            r10.f4434w = r2     // Catch: java.lang.Throwable -> L5d
            throw r0     // Catch: java.lang.Throwable -> L5d
        L82:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L25
            throw r0     // Catch: java.lang.Throwable -> L5d
        L84:
            if (r1 == 0) goto L8d
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L8d:
            throw r0
        L8e:
            r10.p()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: da.m0.o():void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:122|(1:124)(27:126|485|127|(1:131)(2:132|(1:134)(1:135))|471|136|(27:138|(1:140)(1:143)|141|487|144|479|145|146|152|(2:154|(2:156|(2:158|(2:160|(2:162|(2:164|(1:166)(1:167))(1:168))(1:169))(1:170))(1:171))(1:172))(1:173)|174|467|175|(1:177)(1:178)|179|(1:181)(1:182)|183|(1:185)|186|189|(1:191)(7:193|(0)(1:196)|(3:469|198|(1:200)(1:201))(0)|(2:207|(1:209)(4:210|(3:213|(1:495)(1:496)|211)|494|216))(1:216)|(1:218)(1:219)|220|(30:222|(1:224)(1:225)|226|(1:228)|229|(1:231)(1:232)|233|(2:235|(4:240|(1:242)(2:243|(1:245)(1:246))|247|(1:249))(1:(5:239|240|(0)(0)|247|(0))(1:250)))(0)|251|(19:256|(1:258)|(1:272)(1:273)|274|(1:276)|277|(2:282|(1:287))(1:281)|288|(3:292|(1:294)|295)|296|(1:298)|299|(1:303)|304|(3:306|(7:308|(1:310)(1:311)|312|(1:314)|315|(4:319|(1:321)|322|(1:324))|325)(1:327)|326)(10:328|(2:330|(2:343|344)(3:333|(5:335|(1:337)(1:338)|339|(1:341)|342)(0)|344))(1:345)|346|(1:348)|349|481|350|351|355|(5:357|(1:359)(1:360)|(1:364)|(1:366)|367))|368|(3:370|(1:372)(1:373)|(5:375|(1:377)|378|(1:380)|381))|382|383)(1:255)|259|(1:270)|269|(0)(0)|274|(0)|277|(3:279|282|(1:287))(0)|288|(4:290|292|(0)|295)(0)|296|(0)|299|(2:301|303)|304|(0)(0)|368|(0)|382|383)(2:384|385))|192|(0)(0)|(0)(0)|(0)(0)|220|(0)(0))(1:149)|151|152|(0)(0)|174|467|175|(0)(0)|179|(0)(0)|183|(0)|186|189|(0)(0)|192|(0)(0)|(0)(0)|(0)(0)|220|(0)(0))|125|152|(0)(0)|174|467|175|(0)(0)|179|(0)(0)|183|(0)|186|189|(0)(0)|192|(0)(0)|(0)(0)|(0)(0)|220|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x04af, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x04b0, code lost:
    
        k8.p1.l(r15);
        r15.B.c(k8.v0.L(r11), r0, "Fetching Google App Id failed with exception. appId");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:154:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x048d A[Catch: IllegalStateException -> 0x04af, TryCatch #1 {IllegalStateException -> 0x04af, blocks: (B:175:0x0484, B:179:0x0493, B:183:0x049b, B:185:0x049f, B:178:0x048d), top: B:467:0x0484 }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0499 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x049f A[Catch: IllegalStateException -> 0x04af, TRY_LEAVE, TryCatch #1 {IllegalStateException -> 0x04af, blocks: (B:175:0x0484, B:179:0x0493, B:183:0x049b, B:185:0x049f, B:178:0x048d), top: B:467:0x0484 }] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0570  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0645  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x066d  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0671  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x068b  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0728  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0730  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0759  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0788  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x07b9  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x07d7  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0806  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x083b  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x08a9  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0951  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x09c3  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0a17  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0a82  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x04f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:475:0x01ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ad  */
    /* JADX WARN: Type inference failed for: r0v107, types: [k8.t2] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 3328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: da.m0.run():void");
    }

    public String toString() {
        switch (this.f4433v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                hd.a aVar = new hd.a(m0.class.getSimpleName());
                k2 k2Var = (k2) this.f4435x;
                ob.d dVar = new ob.d(21, false);
                ((ob.d) aVar.f6281y).f10106x = dVar;
                aVar.f6281y = dVar;
                dVar.f10105w = k2Var;
                return aVar.toString();
            case 2:
                Runnable runnable = (Runnable) this.f4434w;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb2 = new StringBuilder("SequentialExecutorWorker{state=");
                int i = ((a1) this.f4435x).f4392x;
                sb2.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "RUNNING" : "QUEUED" : "QUEUING" : "IDLE");
                sb2.append("}");
                return sb2.toString();
            case 23:
                Runnable runnable2 = (Runnable) this.f4434w;
                if (runnable2 != null) {
                    return "SequentialExecutorWorker{running=" + runnable2 + "}";
                }
                StringBuilder sb3 = new StringBuilder("SequentialExecutorWorker{state=");
                int i10 = ((na.i) this.f4435x).f9063x;
                sb3.append(i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "null" : "RUNNING" : "QUEUED" : "QUEUING" : "IDLE");
                sb3.append("}");
                return sb3.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ m0(Object obj, Object obj2, boolean z2, int i) {
        this.f4433v = i;
        this.f4435x = obj;
        this.f4434w = obj2;
    }

    public /* synthetic */ m0(Executor executor, int i) {
        this.f4433v = i;
        this.f4435x = executor;
    }

    public m0(e1 e1Var, o6 o6Var, e1 e1Var2) {
        this.f4433v = 8;
        this.f4434w = o6Var;
        this.f4435x = e1Var;
    }

    public m0(u2 u2Var, z6 z6Var) {
        this.f4433v = 11;
        this.f4434w = z6Var;
        Objects.requireNonNull(u2Var);
        this.f4435x = u2Var;
    }

    public m0(p3 p3Var, c3 c3Var) {
        this.f4433v = 17;
        this.f4434w = c3Var;
        Objects.requireNonNull(p3Var);
        this.f4435x = p3Var;
    }

    public m0(s5.d dVar, n4 n4Var, Runnable runnable) {
        this.f4433v = 20;
        this.f4434w = n4Var;
        this.f4435x = runnable;
    }
}
