package b2;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.j5;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseCommonRegistrar;
import com.unity3d.ads.metadata.MediationMetaData;
import db.q1;
import hb.x;
import i4.b0;
import i4.g1;
import i4.h0;
import i4.h1;
import i4.l1;
import i4.n0;
import i4.o0;
import i4.o1;
import i4.s;
import i4.s1;
import i4.u0;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import nc.o;
import okhttp3.HttpUrl;
import q2.c0;
import q2.i0;
import q2.q;
import r1.c1;
import r1.d1;
import r1.e1;
import r1.f1;
import r1.i1;
import r1.j1;
import s9.n;
import u1.a0;
import y2.r;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements u1.m, u1.l, n0, u1.g, g1, s9.c, s9.a, qb.d, o8.b, n8.e, s9.g, r {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f1353x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f1354y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f1355z;

    public /* synthetic */ b(int i6, Object obj, Object obj2) {
        this.f1353x = i6;
        this.f1354y = obj;
        this.f1355z = obj2;
    }

    private final Object h(Task task) {
        ic.h hVar = (ic.h) this.f1354y;
        String str = (String) this.f1355z;
        synchronized (hVar) {
            ((v.e) hVar.f6757b).remove(str);
        }
        return task;
    }

    private final Object i(Task task) {
        nc.j jVar = (nc.j) this.f1354y;
        Date date = (Date) this.f1355z;
        if (task.h()) {
            o oVar = jVar.f9637g;
            synchronized (oVar.f9667b) {
                oVar.f9666a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
            }
            return task;
        }
        Exception e10 = task.e();
        if (e10 == null) {
            return task;
        }
        if (e10 instanceof mc.g) {
            jVar.f9637g.h();
            return task;
        }
        jVar.f9637g.g();
        return task;
    }

    @Override // y2.r
    public y2.o[] a(Uri uri, Map map) {
        y2.o aVar;
        q qVar = (q) this.f1354y;
        r1.q qVar2 = (r1.q) this.f1355z;
        if (qVar.f10932c.g(qVar2)) {
            aVar = new v3.h(qVar.f10932c.c(qVar2), null);
        } else {
            aVar = new g3.a(qVar2);
        }
        return new y2.o[]{aVar};
    }

    @Override // u1.g
    public void accept(Object obj) {
        switch (this.f1353x) {
            case 4:
                h1 h1Var = (h1) this.f1354y;
                j1 j1Var = (j1) this.f1355z;
                l1 l1Var = (l1) obj;
                h1Var.getClass();
                db.n0 n0Var = j1Var.D;
                if (!n0Var.isEmpty()) {
                    i1 c10 = j1Var.a().c();
                    q1 it = n0Var.values().iterator();
                    while (it.hasNext()) {
                        f1 f1Var = (f1) it.next();
                        e1 e1Var = (e1) h1Var.f6395h.E.get(f1Var.f11397a.f11387b);
                        if (e1Var != null && f1Var.f11397a.f11386a == e1Var.f11386a) {
                            c10.a(new f1(e1Var, f1Var.f11398b));
                        } else {
                            c10.a(f1Var);
                        }
                    }
                    j1Var = c10.b();
                }
                l1Var.A0(j1Var);
                return;
            case 5:
                h1 h1Var2 = (h1) this.f1354y;
                s sVar = (s) this.f1355z;
                b0 b0Var = (b0) h1Var2.f6392e.get();
                if (b0Var != null && !b0Var.j()) {
                    b0Var.g(sVar, false);
                    return;
                }
                return;
            default:
                k kVar = (k) this.f1354y;
                ((i0) obj).M(kVar.f1383y, (c0) kVar.f1384z, (n2.g) this.f1355z);
                return;
        }
    }

    @Override // n8.e
    public Object apply(Object obj) {
        n8.g gVar = (n8.g) this.f1354y;
        g8.i iVar = (g8.i) this.f1355z;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        n8.a aVar = gVar.A;
        ArrayList m9 = gVar.m(sQLiteDatabase, iVar, aVar.f9132b);
        for (d8.d dVar : d8.d.values()) {
            if (dVar != iVar.f5541c) {
                int size = aVar.f9132b - m9.size();
                if (size <= 0) {
                    break;
                }
                androidx.lifecycle.j1 a10 = g8.i.a();
                a10.E(iVar.f5539a);
                if (dVar != null) {
                    a10.A = dVar;
                    a10.f950z = iVar.f5540b;
                    m9.addAll(gVar.m(sQLiteDatabase, a10.g(), size));
                } else {
                    throw new NullPointerException("Null priority");
                }
            }
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i6 = 0; i6 < m9.size(); i6++) {
            sb2.append(((n8.b) m9.get(i6)).f9136a);
            if (i6 < m9.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        Cursor query = sQLiteDatabase.query("event_metadata", new String[]{"event_id", MediationMetaData.KEY_NAME, "value"}, sb2.toString(), null, null, null, null);
        while (query.moveToNext()) {
            try {
                long j = query.getLong(0);
                Set set = (Set) hashMap.get(Long.valueOf(j));
                if (set == null) {
                    set = new HashSet();
                    hashMap.put(Long.valueOf(j), set);
                }
                set.add(new n8.f(query.getString(1), query.getString(2)));
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        }
        query.close();
        ListIterator listIterator = m9.listIterator();
        while (listIterator.hasNext()) {
            n8.b bVar = (n8.b) listIterator.next();
            long j10 = bVar.f9136a;
            if (hashMap.containsKey(Long.valueOf(j10))) {
                androidx.lifecycle.d c10 = bVar.f9138c.c();
                for (n8.f fVar : (Set) hashMap.get(Long.valueOf(j10))) {
                    c10.a(fVar.f9139a, fVar.f9140b);
                }
                listIterator.set(new n8.b(j10, bVar.f9137b, c10.d()));
            }
        }
        return m9;
    }

    @Override // s9.g
    public n b(Object obj) {
        nc.e eVar = (nc.e) this.f1354y;
        nc.g gVar = (nc.g) this.f1355z;
        synchronized (eVar) {
            eVar.f9609c = dg.b.j(gVar);
        }
        return dg.b.j(gVar);
    }

    @Override // i4.g1
    public Object c(b0 b0Var, s sVar, int i6) {
        switch (this.f1353x) {
            case 6:
                g1 g1Var = (g1) this.f1354y;
                u0 u0Var = (u0) this.f1355z;
                if (b0Var.j()) {
                    return j5.l(new s1(-100));
                }
                return a0.d0((x) g1Var.c(b0Var, sVar, i6), new h0(b0Var, sVar, u0Var, 1));
            default:
                g1 g1Var2 = (g1) this.f1354y;
                i4.f1 f1Var = (i4.f1) this.f1355z;
                if (b0Var.j()) {
                    return j5.l(new s1(-100));
                }
                return a0.d0((x) g1Var2.c(b0Var, sVar, i6), new h0(b0Var, sVar, f1Var, 2));
        }
    }

    @Override // qb.d
    public Object d(c6.h hVar) {
        String valueOf;
        int i6;
        switch (this.f1353x) {
            case 10:
                String str = (String) this.f1354y;
                u0 u0Var = (u0) this.f1355z;
                Context context = (Context) hVar.a(Context.class);
                switch (u0Var.f6567x) {
                    case 16:
                        ApplicationInfo applicationInfo = context.getApplicationInfo();
                        if (applicationInfo != null) {
                            valueOf = String.valueOf(applicationInfo.targetSdkVersion);
                            break;
                        }
                        valueOf = HttpUrl.FRAGMENT_ENCODE_SET;
                        break;
                    case 17:
                        ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                        if (applicationInfo2 != null && Build.VERSION.SDK_INT >= 24) {
                            i6 = applicationInfo2.minSdkVersion;
                            valueOf = String.valueOf(i6);
                            break;
                        }
                        valueOf = HttpUrl.FRAGMENT_ENCODE_SET;
                        break;
                    case 18:
                        int i10 = Build.VERSION.SDK_INT;
                        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                            valueOf = "tv";
                            break;
                        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                            valueOf = "watch";
                            break;
                        } else if (i10 >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                            valueOf = "auto";
                            break;
                        } else {
                            if (i10 >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                                valueOf = "embedded";
                                break;
                            }
                            valueOf = HttpUrl.FRAGMENT_ENCODE_SET;
                            break;
                        }
                        break;
                    default:
                        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                        if (installerPackageName != null) {
                            valueOf = FirebaseCommonRegistrar.a(installerPackageName);
                            break;
                        }
                        valueOf = HttpUrl.FRAGMENT_ENCODE_SET;
                        break;
                }
                return new lc.a(str, valueOf);
            default:
                String str2 = (String) this.f1354y;
                qb.b bVar = (qb.b) this.f1355z;
                try {
                    Trace.beginSection(str2);
                    return bVar.f11158f.d(hVar);
                } finally {
                    Trace.endSection();
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d5 A[Catch: all -> 0x0055, TryCatch #3 {all -> 0x0055, blocks: (B:34:0x003c, B:38:0x0041, B:39:0x0042, B:43:0x005d, B:45:0x00d1, B:47:0x00d5, B:64:0x00d9), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d9 A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #3 {all -> 0x0055, blocks: (B:34:0x003c, B:38:0x0041, B:39:0x0042, B:43:0x005d, B:45:0x00d1, B:47:0x00d5, B:64:0x00d9), top: B:4:0x0018 }] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v4, types: [s9.n] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r14v3, types: [nc.m] */
    @Override // s9.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object e(com.google.android.gms.tasks.Task r14) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.b.e(com.google.android.gms.tasks.Task):java.lang.Object");
    }

    @Override // o8.b
    public Object execute() {
        switch (this.f1353x) {
            case 11:
                e6.j jVar = (e6.j) this.f1354y;
                Iterable iterable = (Iterable) this.f1355z;
                n8.g gVar = (n8.g) ((n8.d) jVar.f4390c);
                gVar.getClass();
                if (iterable.iterator().hasNext()) {
                    gVar.d().compileStatement("DELETE FROM events WHERE _id in " + n8.g.Q(iterable)).execute();
                    return null;
                }
                return null;
            default:
                e6.j jVar2 = (e6.j) this.f1354y;
                for (Map.Entry entry : ((HashMap) this.f1355z).entrySet()) {
                    ((n8.g) ((n8.c) jVar2.f4396i)).y(((Integer) entry.getValue()).intValue(), j8.c.INVALID_PAYLOD, (String) entry.getKey());
                }
                return null;
        }
    }

    @Override // i4.n0
    public void f(s sVar) {
        switch (this.f1353x) {
            case 2:
                o0 o0Var = (o0) this.f1354y;
                Bundle bundle = (Bundle) this.f1355z;
                b0 b0Var = o0Var.f6473g;
                if (bundle == null) {
                    Bundle bundle2 = Bundle.EMPTY;
                }
                b0Var.n(sVar);
                return;
            default:
                o0 o0Var2 = (o0) this.f1354y;
                j4.o oVar = (j4.o) this.f1355z;
                o0Var2.getClass();
                String str = oVar.f7194x;
                if (TextUtils.isEmpty(str)) {
                    u1.a.p("MediaSessionLegacyStub", "onRemoveQueueItem(): Media ID shouldn't be null");
                    return;
                }
                l1 l1Var = o0Var2.f6473g.f6318t;
                if (!l1Var.n0(17)) {
                    u1.a.p("MediaSessionLegacyStub", "Can't remove item by ID without COMMAND_GET_TIMELINE being available");
                    return;
                }
                d1 y02 = l1Var.y0();
                c1 c1Var = new c1();
                for (int i6 = 0; i6 < y02.o(); i6++) {
                    if (TextUtils.equals(y02.m(i6, c1Var, 0L).f11329c.f11378a, str)) {
                        l1Var.L(i6);
                        return;
                    }
                }
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0582  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x05dd  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:194:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0533  */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20, types: [b2.k] */
    /* JADX WARN: Type inference failed for: r2v50 */
    @Override // u1.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void g(java.lang.Object r24, r1.o r25) {
        /*
            Method dump skipped, instructions count: 1612
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.b.g(java.lang.Object, r1.o):void");
    }

    @Override // u1.l
    public void invoke(Object obj) {
        a aVar = (a) this.f1354y;
        n2.g gVar = (n2.g) this.f1355z;
        l lVar = (l) obj;
        lVar.getClass();
        c0 c0Var = aVar.f1347d;
        if (c0Var != null) {
            r1.q qVar = (r1.q) gVar.f9004f;
            qVar.getClass();
            int i6 = gVar.f9001c;
            h hVar = lVar.f1387c;
            d1 d1Var = aVar.f1345b;
            c0Var.getClass();
            k kVar = new k(qVar, i6, hVar.d(d1Var, c0Var));
            int i10 = gVar.f9000b;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            return;
                        }
                        lVar.f1401r = kVar;
                        return;
                    }
                } else {
                    lVar.f1400q = kVar;
                    return;
                }
            }
            lVar.f1399p = kVar;
        }
    }

    @Override // s9.c
    public void onComplete(Task task) {
        ((ic.g) this.f1354y).a((Intent) this.f1355z);
    }

    public /* synthetic */ b(o0 o0Var, o1 o1Var, Bundle bundle) {
        this.f1353x = 2;
        this.f1354y = o0Var;
        this.f1355z = bundle;
    }
}
