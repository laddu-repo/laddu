package x4;

import android.content.Context;
import android.content.Intent;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public boolean f14634a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f14635b;

    /* renamed from: c, reason: collision with root package name */
    public final a f14636c;

    /* renamed from: d, reason: collision with root package name */
    public final e1.g f14637d;

    /* renamed from: e, reason: collision with root package name */
    public final List f14638e;

    /* renamed from: f, reason: collision with root package name */
    public final z4.b f14639f;

    /* renamed from: g, reason: collision with root package name */
    public h5.b f14640g;

    public s(a aVar, cf.n nVar) {
        v vVar = aVar.f14540g;
        this.f14636c = aVar;
        this.f14637d = new e1.g(-1, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET);
        List list = aVar.f14538e;
        ie.r rVar = ie.r.f6846x;
        this.f14638e = list == null ? rVar : list;
        ArrayList Q = ie.j.Q(list == null ? rVar : list, new r(new cf.n(this, 20)));
        Context context = aVar.f14534a;
        String str = aVar.f14535b;
        h5.c cVar = aVar.f14536c;
        w5.a migrationContainer = aVar.f14537d;
        boolean z10 = aVar.f14539f;
        Executor queryExecutor = aVar.f14541h;
        Executor transactionExecutor = aVar.f14542i;
        Intent intent = aVar.j;
        boolean z11 = aVar.f14543k;
        boolean z12 = aVar.f14544l;
        Set set = aVar.f14545m;
        String str2 = aVar.f14546n;
        File file = aVar.f14547o;
        Callable callable = aVar.f14548p;
        List typeConverters = aVar.f14549q;
        List autoMigrationSpecs = aVar.f14550r;
        boolean z13 = aVar.s;
        g5.b bVar = aVar.f14551t;
        le.h hVar = aVar.f14552u;
        kotlin.jvm.internal.k.e(context, "context");
        kotlin.jvm.internal.k.e(migrationContainer, "migrationContainer");
        kotlin.jvm.internal.k.e(queryExecutor, "queryExecutor");
        kotlin.jvm.internal.k.e(transactionExecutor, "transactionExecutor");
        kotlin.jvm.internal.k.e(typeConverters, "typeConverters");
        kotlin.jvm.internal.k.e(autoMigrationSpecs, "autoMigrationSpecs");
        this.f14639f = new a5.b(new k7.c((h5.d) nVar.invoke(new a(context, str, cVar, migrationContainer, Q, z10, vVar, queryExecutor, transactionExecutor, intent, z11, z12, set, str2, file, callable, typeConverters, autoMigrationSpecs, z13, bVar, hVar))));
        boolean z14 = vVar == v.f14660z;
        h5.d c10 = c();
        if (c10 != null) {
            c10.setWriteAheadLoggingEnabled(z14);
        }
    }

    public static final void a(s sVar, g5.a aVar) {
        Object b10;
        e1.g gVar = sVar.f14637d;
        a aVar2 = sVar.f14636c;
        v vVar = aVar2.f14540g;
        v vVar2 = v.f14660z;
        if (vVar == vVar2) {
            a8.d.d(aVar, "PRAGMA journal_mode = WAL");
        } else {
            a8.d.d(aVar, "PRAGMA journal_mode = TRUNCATE");
        }
        if (aVar2.f14540g == vVar2) {
            a8.d.d(aVar, "PRAGMA synchronous = NORMAL");
        } else {
            a8.d.d(aVar, "PRAGMA synchronous = FULL");
        }
        b(aVar);
        g5.c d02 = aVar.d0("PRAGMA user_version");
        try {
            d02.X();
            int i6 = (int) d02.getLong(0);
            c9.a.c(d02, null);
            int i10 = gVar.f4157a;
            if (i6 != i10) {
                a8.d.d(aVar, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    if (i6 == 0) {
                        sVar.d(aVar);
                    } else {
                        sVar.e(aVar, i6, i10);
                    }
                    a8.d.d(aVar, "PRAGMA user_version = " + i10);
                    b10 = he.y.f6101a;
                } catch (Throwable th) {
                    b10 = he.a.b(th);
                }
                if (!(b10 instanceof he.j)) {
                    a8.d.d(aVar, "END TRANSACTION");
                }
                Throwable a10 = he.k.a(b10);
                if (a10 != null) {
                    a8.d.d(aVar, "ROLLBACK TRANSACTION");
                    throw a10;
                }
            }
            sVar.f(aVar);
        } finally {
        }
    }

    public static void b(g5.a aVar) {
        g5.c d02 = aVar.d0("PRAGMA busy_timeout");
        try {
            d02.X();
            long j = d02.getLong(0);
            c9.a.c(d02, null);
            if (j < 3000) {
                a8.d.d(aVar, "PRAGMA busy_timeout = 3000");
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                c9.a.c(d02, th);
                throw th2;
            }
        }
    }

    public final h5.d c() {
        a5.b bVar;
        k7.c cVar;
        z4.b bVar2 = this.f14639f;
        if (bVar2 instanceof a5.b) {
            bVar = (a5.b) bVar2;
        } else {
            bVar = null;
        }
        if (bVar == null || (cVar = bVar.f569x) == null) {
            return null;
        }
        return (h5.d) cVar.f7745y;
    }

    public final void d(g5.a connection) {
        kotlin.jvm.internal.k.e(connection, "connection");
        g5.c d02 = connection.d0("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z10 = false;
            if (d02.X()) {
                if (d02.getLong(0) == 0) {
                    z10 = true;
                }
            }
            c9.a.c(d02, null);
            e1.g gVar = this.f14637d;
            gVar.a(connection);
            if (!z10) {
                r8.a v10 = gVar.v(connection);
                if (!v10.f11871c) {
                    throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + v10.f11870b).toString());
                }
            }
            a8.d.d(connection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            a8.d.d(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + ((String) gVar.f4158b) + "')");
            gVar.r(connection);
            Iterator it = this.f14638e.iterator();
            while (it.hasNext()) {
                ((u) it.next()).getClass();
                if (connection instanceof a5.a) {
                    h5.b db2 = ((a5.a) connection).f568x;
                    kotlin.jvm.internal.k.e(db2, "db");
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                c9.a.c(d02, th);
                throw th2;
            }
        }
    }

    public final void e(g5.a connection, int i6, int i10) {
        kotlin.jvm.internal.k.e(connection, "connection");
        a aVar = this.f14636c;
        List<b5.a> h4 = dg.b.h(aVar.f14537d, i6, i10);
        e1.g gVar = this.f14637d;
        if (h4 != null) {
            gVar.u(connection);
            for (b5.a aVar2 : h4) {
                aVar2.getClass();
                if (connection instanceof a5.a) {
                    aVar2.a(((a5.a) connection).f568x);
                } else {
                    throw new Error("Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function.");
                }
            }
            r8.a v10 = gVar.v(connection);
            if (v10.f11871c) {
                gVar.t(connection);
                a8.d.d(connection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                a8.d.d(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + ((String) gVar.f4158b) + "')");
                return;
            }
            throw new IllegalStateException(("Migration didn't properly handle: " + v10.f11870b).toString());
        }
        if (!dg.b.k(aVar, i6, i10)) {
            if (aVar.s) {
                g5.c d02 = connection.d0("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
                try {
                    je.c h10 = a8.g.h();
                    while (d02.X()) {
                        String M = d02.M(0);
                        if (!df.u.H(M, "sqlite_", false) && !M.equals("android_metadata")) {
                            h10.add(new he.i(M, Boolean.valueOf(kotlin.jvm.internal.k.a(d02.M(1), "view"))));
                        }
                    }
                    je.c c10 = a8.g.c(h10);
                    c9.a.c(d02, null);
                    ListIterator listIterator = c10.listIterator(0);
                    while (true) {
                        je.a aVar3 = (je.a) listIterator;
                        if (!aVar3.hasNext()) {
                            break;
                        }
                        he.i iVar = (he.i) aVar3.next();
                        String str = (String) iVar.f6076x;
                        if (((Boolean) iVar.f6077y).booleanValue()) {
                            a8.d.d(connection, "DROP VIEW IF EXISTS " + str);
                        } else {
                            a8.d.d(connection, "DROP TABLE IF EXISTS " + str);
                        }
                    }
                } finally {
                }
            } else {
                gVar.c(connection);
            }
            Iterator it = this.f14638e.iterator();
            while (it.hasNext()) {
                ((u) it.next()).getClass();
                if (connection instanceof a5.a) {
                    h5.b db2 = ((a5.a) connection).f568x;
                    kotlin.jvm.internal.k.e(db2, "db");
                }
            }
            gVar.a(connection);
            return;
        }
        throw new IllegalStateException(("A migration from " + i6 + " to " + i10 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions.").toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(g5.a r10) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.s.f(g5.a):void");
    }

    public s(a aVar, e1.g gVar) {
        int i6;
        z4.f fVar;
        v vVar = aVar.f14540g;
        h5.c cVar = aVar.f14536c;
        String str = aVar.f14535b;
        this.f14636c = aVar;
        this.f14637d = gVar;
        List list = aVar.f14538e;
        this.f14638e = list == null ? ie.r.f6846x : list;
        g5.b bVar = aVar.f14551t;
        if (bVar != null) {
            if (str == null) {
                fVar = new z4.f(new s8.l(this, bVar));
            } else {
                s8.l lVar = new s8.l(this, bVar);
                int ordinal = vVar.ordinal();
                if (ordinal == 1) {
                    i6 = 1;
                } else {
                    if (ordinal != 2) {
                        throw new IllegalStateException(("Can't get max number of reader for journal mode '" + vVar + '\'').toString());
                    }
                    i6 = 4;
                }
                int ordinal2 = vVar.ordinal();
                if (ordinal2 != 1 && ordinal2 != 2) {
                    throw new IllegalStateException(("Can't get max number of writers for journal mode '" + vVar + '\'').toString());
                }
                fVar = new z4.f(lVar, str, i6);
            }
            this.f14639f = fVar;
        } else if (cVar != null) {
            Context context = aVar.f14534a;
            kotlin.jvm.internal.k.e(context, "context");
            this.f14639f = new a5.b(new k7.c(cVar.k(new a2.c(context, str, new q(this, gVar.f4157a), false))));
        } else {
            throw new IllegalArgumentException("SQLiteManager was constructed with both null driver and open helper factory!");
        }
        boolean z10 = vVar == v.f14660z;
        h5.d c10 = c();
        if (c10 != null) {
            c10.setWriteAheadLoggingEnabled(z10);
        }
    }
}
