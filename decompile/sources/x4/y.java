package x4;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.internal.measurement.j5;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class y extends ca.e {

    /* renamed from: c, reason: collision with root package name */
    public a f14678c;

    /* renamed from: d, reason: collision with root package name */
    public final List f14679d;

    /* renamed from: e, reason: collision with root package name */
    public final w4.c f14680e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(a configuration, w4.c cVar) {
        super(12, 1);
        kotlin.jvm.internal.k.e(configuration, "configuration");
        this.f14679d = configuration.f14538e;
        this.f14678c = configuration;
        this.f14680e = cVar;
    }

    @Override // ca.e
    public final void i(i5.c cVar) {
        boolean z10 = false;
        Cursor E = cVar.E(new h5.a("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'", 0));
        try {
            if (E.moveToFirst()) {
                if (E.getInt(0) == 0) {
                    z10 = true;
                }
            }
            E.close();
            w4.c.d(cVar);
            if (!z10) {
                r8.a f3 = w4.c.f(cVar);
                if (!f3.f11871c) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: " + f3.f11870b);
                }
            }
            cVar.h("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            cVar.h("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
            int i6 = WorkDatabase_Impl.f1191u;
            List list = this.f14679d;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((u) it.next()).getClass();
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                jb.b.j(E, th);
                throw th2;
            }
        }
    }

    @Override // ca.e
    public final void j(i5.c cVar, int i6, int i10) {
        l(cVar, i6, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0063  */
    @Override // ca.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(i5.c r5) {
        /*
            r4 = this;
            h5.a r0 = new h5.a
            java.lang.String r1 = "SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'"
            r2 = 0
            r0.<init>(r1, r2)
            android.database.Cursor r0 = r5.E(r0)
            boolean r1 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L1d
            int r1 = r0.getInt(r2)     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L1d
            r1 = 1
            goto L1e
        L1a:
            r5 = move-exception
            goto Lbb
        L1d:
            r1 = 0
        L1e:
            r0.close()
            r0 = 0
            if (r1 == 0) goto L63
            h5.a r1 = new h5.a
            java.lang.String r3 = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"
            r1.<init>(r3, r2)
            android.database.Cursor r1 = r5.E(r1)
            boolean r3 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L3a
            if (r3 == 0) goto L3c
            java.lang.String r2 = r1.getString(r2)     // Catch: java.lang.Throwable -> L3a
            goto L3d
        L3a:
            r5 = move-exception
            goto L5d
        L3c:
            r2 = r0
        L3d:
            r1.close()
            java.lang.String r1 = "c103703e120ae8cc73c9248622f3cd1e"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L75
            java.lang.String r1 = "49f946663a8deb7054212b8adda248c6"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L51
            goto L75
        L51:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: c103703e120ae8cc73c9248622f3cd1e, found: "
            java.lang.String r0 = r4.a.k(r0, r2)
            r5.<init>(r0)
            throw r5
        L5d:
            throw r5     // Catch: java.lang.Throwable -> L5e
        L5e:
            r0 = move-exception
            jb.b.j(r1, r5)
            throw r0
        L63:
            r8.a r1 = w4.c.f(r5)
            boolean r2 = r1.f11871c
            if (r2 == 0) goto La5
            java.lang.String r1 = "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)"
            r5.h(r1)
            java.lang.String r1 = "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')"
            r5.h(r1)
        L75:
            w4.c r1 = r4.f14680e
            java.lang.Object r1 = r1.f13822a
            androidx.work.impl.WorkDatabase_Impl r1 = (androidx.work.impl.WorkDatabase_Impl) r1
            int r2 = androidx.work.impl.WorkDatabase_Impl.f1191u
            java.lang.String r2 = "PRAGMA foreign_keys = ON"
            r5.h(r2)
            a5.a r2 = new a5.a
            r2.<init>(r5)
            r1.p(r2)
            java.util.List r1 = r4.f14679d
            if (r1 == 0) goto La2
            java.util.Iterator r1 = r1.iterator()
        L92:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto La2
            java.lang.Object r2 = r1.next()
            x4.u r2 = (x4.u) r2
            r2.a(r5)
            goto L92
        La2:
            r4.f14678c = r0
            return
        La5:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Pre-packaged database has an invalid schema: "
            r0.<init>(r2)
            java.lang.String r1 = r1.f11870b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        Lbb:
            throw r5     // Catch: java.lang.Throwable -> Lbc
        Lbc:
            r1 = move-exception
            jb.b.j(r0, r5)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.y.k(i5.c):void");
    }

    @Override // ca.e
    public final void l(i5.c cVar, int i6, int i10) {
        a aVar = this.f14678c;
        if (aVar != null) {
            w5.a aVar2 = aVar.f14537d;
            aVar2.getClass();
            List<b5.a> h4 = dg.b.h(aVar2, i6, i10);
            if (h4 != null) {
                j5.f(new a5.a(cVar));
                for (b5.a aVar3 : h4) {
                    aVar3.getClass();
                    aVar3.a(cVar);
                }
                r8.a f3 = w4.c.f(cVar);
                if (f3.f11871c) {
                    cVar.h("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                    cVar.h("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
                    return;
                }
                throw new IllegalStateException("Migration didn't properly handle: " + f3.f11870b);
            }
        }
        a aVar4 = this.f14678c;
        if (aVar4 != null && !dg.b.k(aVar4, i6, i10)) {
            if (aVar4.s) {
                Cursor E = cVar.E(new h5.a("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'", 0));
                try {
                    je.c h10 = a8.g.h();
                    while (E.moveToNext()) {
                        String string = E.getString(0);
                        kotlin.jvm.internal.k.b(string);
                        if (!df.u.H(string, "sqlite_", false) && !string.equals("android_metadata")) {
                            h10.add(new he.i(string, Boolean.valueOf(kotlin.jvm.internal.k.a(E.getString(1), "view"))));
                        }
                    }
                    je.c c10 = a8.g.c(h10);
                    E.close();
                    ListIterator listIterator = c10.listIterator(0);
                    while (true) {
                        je.a aVar5 = (je.a) listIterator;
                        if (!aVar5.hasNext()) {
                            break;
                        }
                        he.i iVar = (he.i) aVar5.next();
                        String str = (String) iVar.f6076x;
                        if (((Boolean) iVar.f6077y).booleanValue()) {
                            cVar.h("DROP VIEW IF EXISTS " + str);
                        } else {
                            cVar.h("DROP TABLE IF EXISTS " + str);
                        }
                    }
                } finally {
                }
            } else {
                cVar.h("DROP TABLE IF EXISTS `Dependency`");
                cVar.h("DROP TABLE IF EXISTS `WorkSpec`");
                cVar.h("DROP TABLE IF EXISTS `WorkTag`");
                cVar.h("DROP TABLE IF EXISTS `SystemIdInfo`");
                cVar.h("DROP TABLE IF EXISTS `WorkName`");
                cVar.h("DROP TABLE IF EXISTS `WorkProgress`");
                cVar.h("DROP TABLE IF EXISTS `Preference`");
                int i11 = WorkDatabase_Impl.f1191u;
            }
            List list = this.f14679d;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((u) it.next()).getClass();
                }
            }
            w4.c.d(cVar);
            return;
        }
        throw new IllegalStateException("A migration from " + i6 + " to " + i10 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
    }

    @Override // ca.e
    public final void h(i5.c cVar) {
    }
}
