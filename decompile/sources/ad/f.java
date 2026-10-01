package ad;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import com.tonyodev.fetch2.database.DownloadDatabase;
import de.i;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import k8.k2;
import p4.q;
import p4.s;
import p4.t;
import p4.u;
import p4.y;
import x4.j;
import zc.h;
import zc.l;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class f implements Closeable {
    public final DownloadDatabase A;
    public final w4.a B;
    public final String C;
    public final String D;
    public final ArrayList E;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ab.a f488v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final com.bumptech.glide.manager.e f489w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final k2 f490x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public volatile boolean f491y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public s5.d f492z;

    public f(Context context, ab.a aVar, bd.a[] aVarArr, com.bumptech.glide.manager.e eVar, k2 k2Var) {
        i.e(context, "context");
        i.e(aVar, "logger");
        this.f488v = aVar;
        this.f489w = eVar;
        this.f490x = k2Var;
        q qVarN = z7.b.n(context, DownloadDatabase.class, "LibGlobalFetchLib.db");
        bd.a[] aVarArr2 = (bd.a[]) Arrays.copyOf(aVarArr, aVarArr.length);
        LinkedHashSet linkedHashSet = qVarN.f10345l;
        i.e(aVarArr2, "migrations");
        for (bd.a aVar2 : aVarArr2) {
            linkedHashSet.add(Integer.valueOf(aVar2.f1610a));
            linkedHashSet.add(Integer.valueOf(aVar2.f1611b));
        }
        s sVar = qVarN.f10343j;
        bd.a[] aVarArr3 = (bd.a[]) Arrays.copyOf(aVarArr2, aVarArr2.length);
        sVar.getClass();
        i.e(aVarArr3, "migrations");
        for (bd.a aVar3 : aVarArr3) {
            sVar.b(aVar3);
        }
        DownloadDatabase downloadDatabase = (DownloadDatabase) qVarN.a();
        this.A = downloadDatabase;
        this.B = downloadDatabase.j().e0();
        this.C = "SELECT _id FROM requests WHERE _status = '1' OR _status = '2'";
        this.D = "SELECT _id FROM requests WHERE _status = '1' OR _status = '2' OR _status = '9'";
        this.E = new ArrayList();
    }

    public final List A(zc.i iVar) throws Throwable {
        y yVar;
        f fVar;
        ArrayList arrayList;
        y yVar2;
        i.e(iVar, "prioritySort");
        H();
        zc.i iVar2 = zc.i.f14905v;
        w.b bVar = zc.a.f14870w;
        w2.f fVar2 = zc.g.f14895w;
        w1.i iVar3 = zc.b.f14878w;
        w1.i iVar4 = l.f14913w;
        w.b bVar2 = h.f14900w;
        DownloadDatabase downloadDatabase = this.A;
        if (iVar == iVar2) {
            c cVarQ = downloadDatabase.q();
            cVarQ.getClass();
            y yVarA = y.a(1, "SELECT * FROM requests WHERE _status = ? ORDER BY _priority DESC, _created ASC");
            yVarA.N(1, 1);
            u uVar = (u) cVarQ.f479w;
            uVar.b();
            Cursor cursorG = b8.h.G(uVar, yVarA);
            try {
                int iQ = android.support.v4.media.session.b.q(cursorG, "_id");
                int iQ2 = android.support.v4.media.session.b.q(cursorG, "_namespace");
                int iQ3 = android.support.v4.media.session.b.q(cursorG, "_url");
                int iQ4 = android.support.v4.media.session.b.q(cursorG, "_file");
                int iQ5 = android.support.v4.media.session.b.q(cursorG, "_group");
                int iQ6 = android.support.v4.media.session.b.q(cursorG, "_priority");
                int iQ7 = android.support.v4.media.session.b.q(cursorG, "_headers");
                int iQ8 = android.support.v4.media.session.b.q(cursorG, "_written_bytes");
                int iQ9 = android.support.v4.media.session.b.q(cursorG, "_total_bytes");
                int iQ10 = android.support.v4.media.session.b.q(cursorG, "_status");
                int iQ11 = android.support.v4.media.session.b.q(cursorG, "_error");
                int iQ12 = android.support.v4.media.session.b.q(cursorG, "_network_type");
                int iQ13 = android.support.v4.media.session.b.q(cursorG, "_created");
                yVar2 = yVarA;
                try {
                    int iQ14 = android.support.v4.media.session.b.q(cursorG, "_tag");
                    int iQ15 = android.support.v4.media.session.b.q(cursorG, "_enqueue_action");
                    int iQ16 = android.support.v4.media.session.b.q(cursorG, "_identifier");
                    int iQ17 = android.support.v4.media.session.b.q(cursorG, "_download_on_enqueue");
                    int iQ18 = android.support.v4.media.session.b.q(cursorG, "_extras");
                    int iQ19 = android.support.v4.media.session.b.q(cursorG, "_auto_retry_max_attempts");
                    int iQ20 = android.support.v4.media.session.b.q(cursorG, "_auto_retry_attempts");
                    int i = iQ14;
                    arrayList = new ArrayList(cursorG.getCount());
                    while (cursorG.moveToNext()) {
                        e eVar = new e();
                        ArrayList arrayList2 = arrayList;
                        eVar.f483v = cursorG.getInt(iQ);
                        eVar.h(cursorG.getString(iQ2));
                        eVar.j(cursorG.getString(iQ3));
                        eVar.g(cursorG.getString(iQ4));
                        eVar.f487z = cursorG.getInt(iQ5);
                        int i10 = cursorG.getInt(iQ6);
                        bVar2.getClass();
                        eVar.A = w.b.c(i10);
                        eVar.B = kb.e.i(cursorG.getString(iQ7));
                        int i11 = iQ;
                        eVar.C = cursorG.getLong(iQ8);
                        eVar.D = cursorG.getLong(iQ9);
                        int i12 = cursorG.getInt(iQ10);
                        iVar4.getClass();
                        eVar.E = w1.i.b(i12);
                        int i13 = cursorG.getInt(iQ11);
                        iVar3.getClass();
                        eVar.F = w1.i.a(i13);
                        int i14 = cursorG.getInt(iQ12);
                        fVar2.getClass();
                        eVar.G = w2.f.a(i14);
                        eVar.H = cursorG.getLong(iQ13);
                        int i15 = i;
                        eVar.I = cursorG.isNull(i15) ? null : cursorG.getString(i15);
                        int i16 = iQ15;
                        int i17 = cursorG.getInt(i16);
                        bVar.getClass();
                        i = i15;
                        eVar.J = w.b.b(i17);
                        int i18 = iQ10;
                        int i19 = iQ16;
                        int i20 = iQ2;
                        eVar.K = cursorG.getLong(i19);
                        int i21 = iQ17;
                        eVar.L = cursorG.getInt(i21) != 0;
                        int i22 = iQ18;
                        eVar.M = kb.e.f(cursorG.getString(i22));
                        int i23 = iQ19;
                        eVar.N = cursorG.getInt(i23);
                        int i24 = iQ20;
                        eVar.O = cursorG.getInt(i24);
                        arrayList2.add(eVar);
                        iQ17 = i21;
                        iQ2 = i20;
                        iQ16 = i19;
                        iQ18 = i22;
                        iQ10 = i18;
                        iQ15 = i16;
                        iQ19 = i23;
                        iQ20 = i24;
                        arrayList = arrayList2;
                        iQ = i11;
                    }
                    cursorG.close();
                    yVar2.i();
                    fVar = this;
                } catch (Throwable th) {
                    th = th;
                    cursorG.close();
                    yVar2.i();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                yVar2 = yVarA;
            }
        } else {
            c cVarQ2 = downloadDatabase.q();
            cVarQ2.getClass();
            y yVarA2 = y.a(1, "SELECT * FROM requests WHERE _status = ? ORDER BY _priority DESC, _created DESC");
            yVarA2.N(1, 1);
            u uVar2 = (u) cVarQ2.f479w;
            uVar2.b();
            Cursor cursorG2 = b8.h.G(uVar2, yVarA2);
            try {
                int iQ21 = android.support.v4.media.session.b.q(cursorG2, "_id");
                int iQ22 = android.support.v4.media.session.b.q(cursorG2, "_namespace");
                int iQ23 = android.support.v4.media.session.b.q(cursorG2, "_url");
                int iQ24 = android.support.v4.media.session.b.q(cursorG2, "_file");
                int iQ25 = android.support.v4.media.session.b.q(cursorG2, "_group");
                int iQ26 = android.support.v4.media.session.b.q(cursorG2, "_priority");
                int iQ27 = android.support.v4.media.session.b.q(cursorG2, "_headers");
                int iQ28 = android.support.v4.media.session.b.q(cursorG2, "_written_bytes");
                int iQ29 = android.support.v4.media.session.b.q(cursorG2, "_total_bytes");
                int iQ30 = android.support.v4.media.session.b.q(cursorG2, "_status");
                int iQ31 = android.support.v4.media.session.b.q(cursorG2, "_error");
                int iQ32 = android.support.v4.media.session.b.q(cursorG2, "_network_type");
                int iQ33 = android.support.v4.media.session.b.q(cursorG2, "_created");
                int iQ34 = android.support.v4.media.session.b.q(cursorG2, "_tag");
                yVar = yVarA2;
                try {
                    int iQ35 = android.support.v4.media.session.b.q(cursorG2, "_enqueue_action");
                    int iQ36 = android.support.v4.media.session.b.q(cursorG2, "_identifier");
                    int iQ37 = android.support.v4.media.session.b.q(cursorG2, "_download_on_enqueue");
                    int iQ38 = android.support.v4.media.session.b.q(cursorG2, "_extras");
                    int iQ39 = android.support.v4.media.session.b.q(cursorG2, "_auto_retry_max_attempts");
                    int iQ40 = android.support.v4.media.session.b.q(cursorG2, "_auto_retry_attempts");
                    int i25 = iQ34;
                    ArrayList arrayList3 = new ArrayList(cursorG2.getCount());
                    while (cursorG2.moveToNext()) {
                        e eVar2 = new e();
                        ArrayList arrayList4 = arrayList3;
                        eVar2.f483v = cursorG2.getInt(iQ21);
                        eVar2.h(cursorG2.getString(iQ22));
                        eVar2.j(cursorG2.getString(iQ23));
                        eVar2.g(cursorG2.getString(iQ24));
                        eVar2.f487z = cursorG2.getInt(iQ25);
                        int i26 = cursorG2.getInt(iQ26);
                        bVar2.getClass();
                        eVar2.A = w.b.c(i26);
                        eVar2.B = kb.e.i(cursorG2.getString(iQ27));
                        int i27 = iQ21;
                        eVar2.C = cursorG2.getLong(iQ28);
                        eVar2.D = cursorG2.getLong(iQ29);
                        int i28 = cursorG2.getInt(iQ30);
                        iVar4.getClass();
                        eVar2.E = w1.i.b(i28);
                        int i29 = cursorG2.getInt(iQ31);
                        iVar3.getClass();
                        eVar2.F = w1.i.a(i29);
                        int i30 = cursorG2.getInt(iQ32);
                        fVar2.getClass();
                        eVar2.G = w2.f.a(i30);
                        eVar2.H = cursorG2.getLong(iQ33);
                        int i31 = i25;
                        eVar2.I = cursorG2.isNull(i31) ? null : cursorG2.getString(i31);
                        int i32 = iQ35;
                        int i33 = cursorG2.getInt(i32);
                        bVar.getClass();
                        int i34 = iQ30;
                        eVar2.J = w.b.b(i33);
                        iQ35 = i32;
                        int i35 = iQ36;
                        eVar2.K = cursorG2.getLong(i35);
                        int i36 = iQ37;
                        eVar2.L = cursorG2.getInt(i36) != 0;
                        int i37 = iQ38;
                        eVar2.M = kb.e.f(cursorG2.getString(i37));
                        int i38 = iQ39;
                        eVar2.N = cursorG2.getInt(i38);
                        int i39 = iQ40;
                        eVar2.O = cursorG2.getInt(i39);
                        arrayList4.add(eVar2);
                        arrayList3 = arrayList4;
                        iQ30 = i34;
                        i25 = i31;
                        iQ36 = i35;
                        iQ37 = i36;
                        iQ39 = i38;
                        iQ40 = i39;
                        iQ38 = i37;
                        iQ21 = i27;
                    }
                    cursorG2.close();
                    yVar.i();
                    fVar = this;
                    arrayList = arrayList3;
                } catch (Throwable th3) {
                    th = th3;
                    cursorG2.close();
                    yVar.i();
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                yVar = yVarA2;
            }
        }
        if (!fVar.D(arrayList, false)) {
            return arrayList;
        }
        ArrayList arrayList5 = new ArrayList();
        int size = arrayList.size();
        int i40 = 0;
        while (i40 < size) {
            Object obj = arrayList.get(i40);
            i40++;
            if (((e) obj).E == l.f14915y) {
                arrayList5.add(obj);
            }
        }
        return arrayList5;
    }

    public final od.f B(e eVar) {
        H();
        c cVarQ = this.A.q();
        u uVar = (u) cVarQ.f479w;
        uVar.b();
        uVar.c();
        try {
            a aVar = (a) cVarQ.f480x;
            j jVarA = aVar.a();
            try {
                aVar.e(jVarA, eVar);
                long jExecuteInsert = jVarA.f14224w.executeInsert();
                aVar.d(jVarA);
                uVar.j().e0().R();
                uVar.g();
                return new od.f(eVar, Boolean.valueOf(jExecuteInsert != -1));
            } catch (Throwable th) {
                aVar.d(jVarA);
                throw th;
            }
        } catch (Throwable th2) {
            uVar.g();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean D(java.util.List r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ad.f.D(java.util.List, boolean):boolean");
    }

    public final void G() {
        H();
        com.bumptech.glide.manager.e eVar = this.f489w;
        synchronized (eVar.f2413w) {
            if (!eVar.f2412v) {
                D(i(), true);
                eVar.f2412v = true;
            }
        }
    }

    public final void H() {
        if (this.f491y) {
            throw new a5.d("LibGlobalFetchLib database is closed");
        }
    }

    public final void I(e eVar) {
        i.e(eVar, "downloadInfo");
        H();
        c cVarQ = this.A.q();
        u uVar = (u) cVarQ.f479w;
        uVar.b();
        uVar.c();
        try {
            b bVar = (b) cVarQ.A;
            j jVarA = bVar.a();
            try {
                bVar.e(jVarA, eVar);
                jVarA.a();
                bVar.d(jVarA);
                uVar.j().e0().R();
            } catch (Throwable th) {
                bVar.d(jVarA);
                throw th;
            }
        } finally {
            uVar.g();
        }
    }

    public final void a(e eVar) {
        H();
        c cVarQ = this.A.q();
        u uVar = (u) cVarQ.f479w;
        uVar.b();
        uVar.c();
        try {
            b bVar = (b) cVarQ.f482z;
            j jVarA = bVar.a();
            try {
                bVar.e(jVarA, eVar);
                jVarA.a();
                bVar.d(jVarA);
                uVar.j().e0().R();
            } catch (Throwable th) {
                bVar.d(jVarA);
                throw th;
            }
        } finally {
            uVar.g();
        }
    }

    public final void c0(e eVar) {
        ab.a aVar = this.f488v;
        w4.a aVar2 = this.B;
        i.e(eVar, "downloadInfo");
        H();
        try {
            aVar2.k();
            aVar2.Q(new Object[]{Long.valueOf(eVar.C), Long.valueOf(eVar.D), Integer.valueOf(eVar.E.f14917v), Integer.valueOf(eVar.f483v)});
            aVar2.R();
        } catch (SQLiteException unused) {
            aVar.getClass();
        }
        try {
            aVar2.j();
        } catch (SQLiteException unused2) {
            aVar.getClass();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f491y) {
            return;
        }
        this.f491y = true;
        try {
            this.B.close();
        } catch (Exception unused) {
        }
        try {
            hd.a aVar = this.A.f;
            synchronized (aVar) {
                if (((AtomicBoolean) aVar.f6281y).compareAndSet(false, true)) {
                    while (((AtomicInteger) aVar.f6280x).get() != 0) {
                    }
                    ((t) aVar.f6279w).b();
                }
            }
        } catch (Exception unused2) {
        }
        this.f488v.getClass();
    }

    public final List i() throws Throwable {
        y yVar;
        int iQ;
        H();
        c cVarQ = this.A.q();
        Object obj = cVarQ.f481y;
        y yVarA = y.a(0, "SELECT * FROM requests");
        u uVar = (u) cVarQ.f479w;
        uVar.b();
        Cursor cursorG = b8.h.G(uVar, yVarA);
        try {
            int iQ2 = android.support.v4.media.session.b.q(cursorG, "_id");
            int iQ3 = android.support.v4.media.session.b.q(cursorG, "_namespace");
            int iQ4 = android.support.v4.media.session.b.q(cursorG, "_url");
            int iQ5 = android.support.v4.media.session.b.q(cursorG, "_file");
            int iQ6 = android.support.v4.media.session.b.q(cursorG, "_group");
            int iQ7 = android.support.v4.media.session.b.q(cursorG, "_priority");
            int iQ8 = android.support.v4.media.session.b.q(cursorG, "_headers");
            int iQ9 = android.support.v4.media.session.b.q(cursorG, "_written_bytes");
            int iQ10 = android.support.v4.media.session.b.q(cursorG, "_total_bytes");
            int iQ11 = android.support.v4.media.session.b.q(cursorG, "_status");
            int iQ12 = android.support.v4.media.session.b.q(cursorG, "_error");
            int iQ13 = android.support.v4.media.session.b.q(cursorG, "_network_type");
            int iQ14 = android.support.v4.media.session.b.q(cursorG, "_created");
            yVar = yVarA;
            try {
                iQ = android.support.v4.media.session.b.q(cursorG, "_tag");
            } catch (Throwable th) {
                th = th;
            }
            try {
                int iQ15 = android.support.v4.media.session.b.q(cursorG, "_enqueue_action");
                int iQ16 = android.support.v4.media.session.b.q(cursorG, "_identifier");
                int iQ17 = android.support.v4.media.session.b.q(cursorG, "_download_on_enqueue");
                int iQ18 = android.support.v4.media.session.b.q(cursorG, "_extras");
                int iQ19 = android.support.v4.media.session.b.q(cursorG, "_auto_retry_max_attempts");
                int iQ20 = android.support.v4.media.session.b.q(cursorG, "_auto_retry_attempts");
                int i = iQ;
                ArrayList arrayList = new ArrayList(cursorG.getCount());
                while (cursorG.moveToNext()) {
                    e eVar = new e();
                    ArrayList arrayList2 = arrayList;
                    eVar.f483v = cursorG.getInt(iQ2);
                    eVar.h(cursorG.getString(iQ3));
                    eVar.j(cursorG.getString(iQ4));
                    eVar.g(cursorG.getString(iQ5));
                    eVar.f487z = cursorG.getInt(iQ6);
                    int i10 = cursorG.getInt(iQ7);
                    h.f14900w.getClass();
                    eVar.A = w.b.c(i10);
                    eVar.B = kb.e.i(cursorG.getString(iQ8));
                    int i11 = iQ2;
                    eVar.C = cursorG.getLong(iQ9);
                    eVar.D = cursorG.getLong(iQ10);
                    int i12 = cursorG.getInt(iQ11);
                    l.f14913w.getClass();
                    eVar.E = w1.i.b(i12);
                    int i13 = cursorG.getInt(iQ12);
                    zc.b.f14878w.getClass();
                    eVar.F = w1.i.a(i13);
                    int i14 = cursorG.getInt(iQ13);
                    zc.g.f14895w.getClass();
                    eVar.G = w2.f.a(i14);
                    eVar.H = cursorG.getLong(iQ14);
                    int i15 = i;
                    eVar.I = cursorG.isNull(i15) ? null : cursorG.getString(i15);
                    int i16 = iQ15;
                    int i17 = cursorG.getInt(i16);
                    zc.a.f14870w.getClass();
                    i = i15;
                    eVar.J = w.b.b(i17);
                    int i18 = iQ14;
                    int i19 = iQ16;
                    eVar.K = cursorG.getLong(i19);
                    int i20 = iQ17;
                    eVar.L = cursorG.getInt(i20) != 0;
                    int i21 = iQ18;
                    eVar.M = kb.e.f(cursorG.getString(i21));
                    iQ17 = i20;
                    int i22 = iQ19;
                    eVar.N = cursorG.getInt(i22);
                    iQ19 = i22;
                    int i23 = iQ20;
                    eVar.O = cursorG.getInt(i23);
                    arrayList2.add(eVar);
                    iQ18 = i21;
                    iQ14 = i18;
                    iQ15 = i16;
                    iQ16 = i19;
                    iQ20 = i23;
                    arrayList = arrayList2;
                    iQ2 = i11;
                }
                List list = arrayList;
                cursorG.close();
                yVar.i();
                D(list, false);
                return list;
            } catch (Throwable th2) {
                th = th2;
                cursorG.close();
                yVar.i();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            yVar = yVarA;
        }
    }

    public final e l(String str) throws Throwable {
        y yVar;
        i.e(str, "file");
        H();
        c cVarQ = this.A.q();
        Object obj = cVarQ.f481y;
        y yVarA = y.a(1, "SELECT * FROM requests WHERE _file = ?");
        yVarA.t(1, str);
        u uVar = (u) cVarQ.f479w;
        uVar.b();
        Cursor cursorG = b8.h.G(uVar, yVarA);
        try {
            int iQ = android.support.v4.media.session.b.q(cursorG, "_id");
            int iQ2 = android.support.v4.media.session.b.q(cursorG, "_namespace");
            int iQ3 = android.support.v4.media.session.b.q(cursorG, "_url");
            int iQ4 = android.support.v4.media.session.b.q(cursorG, "_file");
            int iQ5 = android.support.v4.media.session.b.q(cursorG, "_group");
            int iQ6 = android.support.v4.media.session.b.q(cursorG, "_priority");
            int iQ7 = android.support.v4.media.session.b.q(cursorG, "_headers");
            int iQ8 = android.support.v4.media.session.b.q(cursorG, "_written_bytes");
            int iQ9 = android.support.v4.media.session.b.q(cursorG, "_total_bytes");
            int iQ10 = android.support.v4.media.session.b.q(cursorG, "_status");
            int iQ11 = android.support.v4.media.session.b.q(cursorG, "_error");
            int iQ12 = android.support.v4.media.session.b.q(cursorG, "_network_type");
            int iQ13 = android.support.v4.media.session.b.q(cursorG, "_created");
            yVar = yVarA;
            try {
                int iQ14 = android.support.v4.media.session.b.q(cursorG, "_tag");
                try {
                    int iQ15 = android.support.v4.media.session.b.q(cursorG, "_enqueue_action");
                    int iQ16 = android.support.v4.media.session.b.q(cursorG, "_identifier");
                    int iQ17 = android.support.v4.media.session.b.q(cursorG, "_download_on_enqueue");
                    int iQ18 = android.support.v4.media.session.b.q(cursorG, "_extras");
                    int iQ19 = android.support.v4.media.session.b.q(cursorG, "_auto_retry_max_attempts");
                    int iQ20 = android.support.v4.media.session.b.q(cursorG, "_auto_retry_attempts");
                    e eVar = null;
                    if (cursorG.moveToFirst()) {
                        e eVar2 = new e();
                        eVar2.f483v = cursorG.getInt(iQ);
                        eVar2.h(cursorG.getString(iQ2));
                        eVar2.j(cursorG.getString(iQ3));
                        eVar2.g(cursorG.getString(iQ4));
                        eVar2.f487z = cursorG.getInt(iQ5);
                        int i = cursorG.getInt(iQ6);
                        h.f14900w.getClass();
                        eVar2.A = w.b.c(i);
                        eVar2.B = kb.e.i(cursorG.getString(iQ7));
                        eVar2.C = cursorG.getLong(iQ8);
                        eVar2.D = cursorG.getLong(iQ9);
                        int i10 = cursorG.getInt(iQ10);
                        l.f14913w.getClass();
                        eVar2.E = w1.i.b(i10);
                        int i11 = cursorG.getInt(iQ11);
                        zc.b.f14878w.getClass();
                        eVar2.F = w1.i.a(i11);
                        int i12 = cursorG.getInt(iQ12);
                        zc.g.f14895w.getClass();
                        eVar2.G = w2.f.a(i12);
                        eVar2.H = cursorG.getLong(iQ13);
                        eVar2.I = cursorG.isNull(iQ14) ? null : cursorG.getString(iQ14);
                        int i13 = cursorG.getInt(iQ15);
                        zc.a.f14870w.getClass();
                        eVar2.J = w.b.b(i13);
                        eVar2.K = cursorG.getLong(iQ16);
                        eVar2.L = cursorG.getInt(iQ17) != 0;
                        eVar2.M = kb.e.f(cursorG.getString(iQ18));
                        eVar2.N = cursorG.getInt(iQ19);
                        eVar2.O = cursorG.getInt(iQ20);
                        eVar = eVar2;
                    }
                    cursorG.close();
                    yVar.i();
                    if (eVar == null) {
                        return eVar;
                    }
                    D(fa.b.s(eVar), false);
                    return eVar;
                } catch (Throwable th) {
                    th = th;
                    cursorG.close();
                    yVar.i();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            yVar = yVarA;
        }
    }

    public final List m(int i) throws Throwable {
        y yVar;
        int iQ;
        int iQ2;
        int iQ3;
        int iQ4;
        int iQ5;
        int iQ6;
        int iQ7;
        int iQ8;
        int iQ9;
        int iQ10;
        int iQ11;
        int iQ12;
        int iQ13;
        int iQ14;
        H();
        c cVarQ = this.A.q();
        Object obj = cVarQ.f481y;
        y yVarA = y.a(1, "SELECT * FROM requests WHERE _group = ?");
        yVarA.N(1, i);
        u uVar = (u) cVarQ.f479w;
        uVar.b();
        Cursor cursorG = b8.h.G(uVar, yVarA);
        try {
            iQ = android.support.v4.media.session.b.q(cursorG, "_id");
            iQ2 = android.support.v4.media.session.b.q(cursorG, "_namespace");
            iQ3 = android.support.v4.media.session.b.q(cursorG, "_url");
            iQ4 = android.support.v4.media.session.b.q(cursorG, "_file");
            iQ5 = android.support.v4.media.session.b.q(cursorG, "_group");
            iQ6 = android.support.v4.media.session.b.q(cursorG, "_priority");
            iQ7 = android.support.v4.media.session.b.q(cursorG, "_headers");
            iQ8 = android.support.v4.media.session.b.q(cursorG, "_written_bytes");
            iQ9 = android.support.v4.media.session.b.q(cursorG, "_total_bytes");
            iQ10 = android.support.v4.media.session.b.q(cursorG, "_status");
            iQ11 = android.support.v4.media.session.b.q(cursorG, "_error");
            iQ12 = android.support.v4.media.session.b.q(cursorG, "_network_type");
            iQ13 = android.support.v4.media.session.b.q(cursorG, "_created");
            yVar = yVarA;
            try {
                iQ14 = android.support.v4.media.session.b.q(cursorG, "_tag");
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
            yVar = yVarA;
        }
        try {
            int iQ15 = android.support.v4.media.session.b.q(cursorG, "_enqueue_action");
            int iQ16 = android.support.v4.media.session.b.q(cursorG, "_identifier");
            int iQ17 = android.support.v4.media.session.b.q(cursorG, "_download_on_enqueue");
            int iQ18 = android.support.v4.media.session.b.q(cursorG, "_extras");
            int iQ19 = android.support.v4.media.session.b.q(cursorG, "_auto_retry_max_attempts");
            int iQ20 = android.support.v4.media.session.b.q(cursorG, "_auto_retry_attempts");
            int i10 = iQ14;
            ArrayList arrayList = new ArrayList(cursorG.getCount());
            while (cursorG.moveToNext()) {
                e eVar = new e();
                ArrayList arrayList2 = arrayList;
                eVar.f483v = cursorG.getInt(iQ);
                eVar.h(cursorG.getString(iQ2));
                eVar.j(cursorG.getString(iQ3));
                eVar.g(cursorG.getString(iQ4));
                eVar.f487z = cursorG.getInt(iQ5);
                int i11 = cursorG.getInt(iQ6);
                h.f14900w.getClass();
                eVar.A = w.b.c(i11);
                eVar.B = kb.e.i(cursorG.getString(iQ7));
                int i12 = iQ;
                eVar.C = cursorG.getLong(iQ8);
                eVar.D = cursorG.getLong(iQ9);
                int i13 = cursorG.getInt(iQ10);
                l.f14913w.getClass();
                eVar.E = w1.i.b(i13);
                int i14 = cursorG.getInt(iQ11);
                zc.b.f14878w.getClass();
                eVar.F = w1.i.a(i14);
                int i15 = cursorG.getInt(iQ12);
                zc.g.f14895w.getClass();
                eVar.G = w2.f.a(i15);
                eVar.H = cursorG.getLong(iQ13);
                int i16 = i10;
                eVar.I = cursorG.isNull(i16) ? null : cursorG.getString(i16);
                int i17 = iQ15;
                int i18 = cursorG.getInt(i17);
                zc.a.f14870w.getClass();
                eVar.J = w.b.b(i18);
                int i19 = iQ13;
                int i20 = iQ16;
                eVar.K = cursorG.getLong(i20);
                int i21 = iQ17;
                eVar.L = cursorG.getInt(i21) != 0;
                int i22 = iQ18;
                eVar.M = kb.e.f(cursorG.getString(i22));
                iQ17 = i21;
                int i23 = iQ19;
                eVar.N = cursorG.getInt(i23);
                iQ19 = i23;
                int i24 = iQ20;
                eVar.O = cursorG.getInt(i24);
                arrayList2.add(eVar);
                iQ13 = i19;
                iQ15 = i17;
                iQ16 = i20;
                iQ18 = i22;
                iQ20 = i24;
                i10 = i16;
                arrayList = arrayList2;
                iQ = i12;
            }
            List list = arrayList;
            cursorG.close();
            yVar.i();
            D(list, false);
            return list;
        } catch (Throwable th3) {
            th = th3;
            cursorG.close();
            yVar.i();
            throw th;
        }
    }
}
