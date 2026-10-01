package w5;

import android.content.Context;
import android.database.Cursor;
import androidx.lifecycle.j1;
import androidx.work.ListenableWorker;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.internal.measurement.j5;
import hb.x;
import j4.b0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import v5.n;
import v5.o;
import x4.z;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class m implements Runnable {
    public static final String Q = o.h("WorkerWrapper");
    public n9.j A;
    public e6.i B;
    public ListenableWorker C;
    public j1 D;
    public n E;
    public v5.b F;
    public c G;
    public WorkDatabase H;
    public e6.j I;
    public b0 J;
    public b0 K;
    public ArrayList L;
    public String M;
    public g6.j N;
    public x O;
    public volatile boolean P;

    /* renamed from: x, reason: collision with root package name */
    public Context f14120x;

    /* renamed from: y, reason: collision with root package name */
    public String f14121y;

    /* renamed from: z, reason: collision with root package name */
    public List f14122z;

    public final void a(n nVar) {
        boolean z10;
        boolean z11 = nVar instanceof v5.m;
        String str = Q;
        if (z11) {
            o.f().g(str, r4.a.k("Worker result SUCCESS for ", this.M), new Throwable[0]);
            if (this.B.c()) {
                d();
                return;
            }
            b0 b0Var = this.J;
            String str2 = this.f14121y;
            e6.j jVar = this.I;
            WorkDatabase workDatabase = this.H;
            workDatabase.c();
            try {
                jVar.l(new String[]{str2}, 3);
                jVar.j(str2, ((v5.m) this.E).f13328a);
                long currentTimeMillis = System.currentTimeMillis();
                ArrayList q9 = b0Var.q(str2);
                int size = q9.size();
                int i6 = 0;
                while (i6 < size) {
                    Object obj = q9.get(i6);
                    i6++;
                    String str3 = (String) obj;
                    if (jVar.e(str3) == 5) {
                        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) b0Var.f7158x;
                        z d10 = z.d(1, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
                        if (str3 == null) {
                            d10.c(1);
                        } else {
                            d10.i(1, str3);
                        }
                        workDatabase_Impl.b();
                        Cursor r10 = j5.r(workDatabase_Impl, d10);
                        try {
                            if (r10.moveToFirst() && r10.getInt(0) != 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                o.f().g(str, "Setting status to enqueued for " + str3, new Throwable[0]);
                                jVar.l(new String[]{str3}, 1);
                                jVar.k(str3, currentTimeMillis);
                            }
                        } finally {
                            r10.close();
                            d10.f();
                        }
                    }
                }
                workDatabase.r();
                workDatabase.h();
                e(false);
                return;
            } catch (Throwable th) {
                workDatabase.h();
                e(false);
                throw th;
            }
        }
        if (nVar instanceof v5.l) {
            o.f().g(str, r4.a.k("Worker result RETRY for ", this.M), new Throwable[0]);
            c();
            return;
        }
        o.f().g(str, r4.a.k("Worker result FAILURE for ", this.M), new Throwable[0]);
        if (this.B.c()) {
            d();
        } else {
            g();
        }
    }

    public final void b() {
        List list = this.f14122z;
        String str = this.f14121y;
        WorkDatabase workDatabase = this.H;
        if (!h()) {
            workDatabase.c();
            try {
                int e10 = this.I.e(str);
                c6.h x10 = workDatabase.x();
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) x10.f1981x;
                workDatabase_Impl.b();
                e6.e eVar = (e6.e) x10.f1983z;
                i5.j a10 = eVar.a();
                if (str == null) {
                    a10.c(1);
                } else {
                    a10.i(1, str);
                }
                workDatabase_Impl.c();
                try {
                    a10.d();
                    workDatabase_Impl.r();
                    if (e10 == 0) {
                        e(false);
                    } else if (e10 == 2) {
                        a(this.E);
                    } else if (!h8.c.e(e10)) {
                        c();
                    }
                    workDatabase.r();
                    workDatabase.h();
                } finally {
                    workDatabase_Impl.h();
                    eVar.c(a10);
                }
            } catch (Throwable th) {
                workDatabase.h();
                throw th;
            }
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((d) it.next()).d(str);
            }
            e.a(this.F, workDatabase, list);
        }
    }

    public final void c() {
        String str = this.f14121y;
        e6.j jVar = this.I;
        WorkDatabase workDatabase = this.H;
        workDatabase.c();
        try {
            jVar.l(new String[]{str}, 1);
            jVar.k(str, System.currentTimeMillis());
            jVar.i(str, -1L);
            workDatabase.r();
        } finally {
            workDatabase.h();
            e(true);
        }
    }

    public final void d() {
        String str = this.f14121y;
        e6.j jVar = this.I;
        WorkDatabase workDatabase = this.H;
        workDatabase.c();
        try {
            jVar.k(str, System.currentTimeMillis());
            jVar.l(new String[]{str}, 1);
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) jVar.f4388a;
            workDatabase_Impl.b();
            e6.e eVar = (e6.e) jVar.f4394g;
            i5.j a10 = eVar.a();
            if (str == null) {
                a10.c(1);
            } else {
                a10.i(1, str);
            }
            workDatabase_Impl.c();
            try {
                a10.d();
                workDatabase_Impl.r();
                workDatabase_Impl.h();
                eVar.c(a10);
                jVar.i(str, -1L);
                workDatabase.r();
            } catch (Throwable th) {
                workDatabase_Impl.h();
                eVar.c(a10);
                throw th;
            }
        } finally {
            workDatabase.h();
            e(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:3:0x0005, B:10:0x0032, B:12:0x003a, B:14:0x0046, B:15:0x005a, B:17:0x005e, B:19:0x0062, B:21:0x0068, B:22:0x006e, B:30:0x007b, B:32:0x007c, B:38:0x0090, B:39:0x0096, B:24:0x006f, B:25:0x0077, B:5:0x0020, B:7:0x0027), top: B:2:0x0005, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0046 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:3:0x0005, B:10:0x0032, B:12:0x003a, B:14:0x0046, B:15:0x005a, B:17:0x005e, B:19:0x0062, B:21:0x0068, B:22:0x006e, B:30:0x007b, B:32:0x007c, B:38:0x0090, B:39:0x0096, B:24:0x006f, B:25:0x0077, B:5:0x0020, B:7:0x0027), top: B:2:0x0005, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(boolean r6) {
        /*
            r5 = this;
            androidx.work.impl.WorkDatabase r0 = r5.H
            r0.c()
            androidx.work.impl.WorkDatabase r0 = r5.H     // Catch: java.lang.Throwable -> L42
            e6.j r0 = r0.y()     // Catch: java.lang.Throwable -> L42
            r0.getClass()     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1"
            r2 = 0
            x4.z r1 = x4.z.d(r2, r1)     // Catch: java.lang.Throwable -> L42
            java.lang.Object r0 = r0.f4388a     // Catch: java.lang.Throwable -> L42
            androidx.work.impl.WorkDatabase_Impl r0 = (androidx.work.impl.WorkDatabase_Impl) r0     // Catch: java.lang.Throwable -> L42
            r0.b()     // Catch: java.lang.Throwable -> L42
            android.database.Cursor r0 = com.google.android.gms.internal.measurement.j5.r(r0, r1)     // Catch: java.lang.Throwable -> L42
            boolean r3 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L2f
            r4 = 1
            if (r3 == 0) goto L31
            int r3 = r0.getInt(r2)     // Catch: java.lang.Throwable -> L2f
            if (r3 == 0) goto L31
            r3 = 1
            goto L32
        L2f:
            r6 = move-exception
            goto L90
        L31:
            r3 = 0
        L32:
            r0.close()     // Catch: java.lang.Throwable -> L42
            r1.f()     // Catch: java.lang.Throwable -> L42
            if (r3 != 0) goto L44
            android.content.Context r0 = r5.f14120x     // Catch: java.lang.Throwable -> L42
            java.lang.Class<androidx.work.impl.background.systemalarm.RescheduleReceiver> r1 = androidx.work.impl.background.systemalarm.RescheduleReceiver.class
            f6.g.a(r0, r1, r2)     // Catch: java.lang.Throwable -> L42
            goto L44
        L42:
            r6 = move-exception
            goto L97
        L44:
            if (r6 == 0) goto L5a
            e6.j r0 = r5.I     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = r5.f14121y     // Catch: java.lang.Throwable -> L42
            java.lang.String[] r1 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> L42
            r0.l(r1, r4)     // Catch: java.lang.Throwable -> L42
            e6.j r0 = r5.I     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = r5.f14121y     // Catch: java.lang.Throwable -> L42
            r2 = -1
            r0.i(r1, r2)     // Catch: java.lang.Throwable -> L42
        L5a:
            e6.i r0 = r5.B     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L7c
            androidx.work.ListenableWorker r0 = r5.C     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L7c
            boolean r0 = r0.isRunInForeground()     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L7c
            w5.c r0 = r5.G     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = r5.f14121y     // Catch: java.lang.Throwable -> L42
            java.lang.Object r2 = r0.H     // Catch: java.lang.Throwable -> L42
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L42
            java.util.HashMap r3 = r0.C     // Catch: java.lang.Throwable -> L79
            r3.remove(r1)     // Catch: java.lang.Throwable -> L79
            r0.i()     // Catch: java.lang.Throwable -> L79
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L79
            goto L7c
        L79:
            r6 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L79
            throw r6     // Catch: java.lang.Throwable -> L42
        L7c:
            androidx.work.impl.WorkDatabase r0 = r5.H     // Catch: java.lang.Throwable -> L42
            r0.r()     // Catch: java.lang.Throwable -> L42
            androidx.work.impl.WorkDatabase r0 = r5.H
            r0.h()
            g6.j r0 = r5.N
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r0.i(r6)
            return
        L90:
            r0.close()     // Catch: java.lang.Throwable -> L42
            r1.f()     // Catch: java.lang.Throwable -> L42
            throw r6     // Catch: java.lang.Throwable -> L42
        L97:
            androidx.work.impl.WorkDatabase r0 = r5.H
            r0.h()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: w5.m.e(boolean):void");
    }

    public final void f() {
        e6.j jVar = this.I;
        String str = this.f14121y;
        int e10 = jVar.e(str);
        String str2 = Q;
        if (e10 == 2) {
            o.f().b(str2, h8.c.m("Status for ", str, " is RUNNING;not doing any work and rescheduling for later execution"), new Throwable[0]);
            e(true);
            return;
        }
        o f3 = o.f();
        StringBuilder q9 = r4.a.q("Status for ", str, " is ");
        q9.append(h8.c.t(e10));
        q9.append("; not doing any work");
        f3.b(str2, q9.toString(), new Throwable[0]);
        e(false);
    }

    public final void g() {
        e6.j jVar = this.I;
        String str = this.f14121y;
        WorkDatabase workDatabase = this.H;
        workDatabase.c();
        try {
            LinkedList linkedList = new LinkedList();
            linkedList.add(str);
            while (!linkedList.isEmpty()) {
                String str2 = (String) linkedList.remove();
                if (jVar.e(str2) != 6) {
                    jVar.l(new String[]{str2}, 4);
                }
                linkedList.addAll(this.J.q(str2));
            }
            jVar.j(str, ((v5.k) this.E).f13327a);
            workDatabase.r();
        } finally {
            workDatabase.h();
            e(false);
        }
    }

    public final boolean h() {
        if (!this.P) {
            return false;
        }
        o.f().b(Q, r4.a.k("Work interrupted for ", this.M), new Throwable[0]);
        if (this.I.e(this.f14121y) == 0) {
            e(false);
            return true;
        }
        e(!h8.c.e(r0));
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c0, code lost:
    
        if (r9 != false) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [g6.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v8, types: [androidx.work.WorkerParameters, java.lang.Object] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 750
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w5.m.run():void");
    }
}
