package p4;

import android.database.Cursor;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class x extends w4.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f10371c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f10372d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s5.d f10373e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(a aVar, s5.d dVar) {
        super(7, 0);
        de.i.e(aVar, "configuration");
        this.f10372d = aVar.f10270e;
        this.f10371c = aVar;
        this.f10373e = dVar;
    }

    @Override // w4.b
    public final void i(x4.c cVar) throws IOException {
        Cursor cursorF0 = cVar.f0("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z2 = false;
            if (cursorF0.moveToFirst()) {
                if (cursorF0.getInt(0) == 0) {
                    z2 = true;
                }
            }
            cursorF0.close();
            cVar.s("CREATE TABLE IF NOT EXISTS `requests` (`_id` INTEGER NOT NULL, `_namespace` TEXT NOT NULL, `_url` TEXT NOT NULL, `_file` TEXT NOT NULL, `_group` INTEGER NOT NULL, `_priority` INTEGER NOT NULL, `_headers` TEXT NOT NULL, `_written_bytes` INTEGER NOT NULL, `_total_bytes` INTEGER NOT NULL, `_status` INTEGER NOT NULL, `_error` INTEGER NOT NULL, `_network_type` INTEGER NOT NULL, `_created` INTEGER NOT NULL, `_tag` TEXT, `_enqueue_action` INTEGER NOT NULL, `_identifier` INTEGER NOT NULL, `_download_on_enqueue` INTEGER NOT NULL, `_extras` TEXT NOT NULL, `_auto_retry_max_attempts` INTEGER NOT NULL, `_auto_retry_attempts` INTEGER NOT NULL, PRIMARY KEY(`_id`))");
            cVar.s("CREATE UNIQUE INDEX IF NOT EXISTS `index_requests__file` ON `requests` (`_file`)");
            cVar.s("CREATE INDEX IF NOT EXISTS `index_requests__group__status` ON `requests` (`_group`, `_status`)");
            cVar.s("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            cVar.s("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '460643a974555d792b8f5a6e1a5d323c')");
            if (!z2) {
                l7.a aVarZ = s5.d.z(cVar);
                if (!aVarZ.f8300b) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: " + aVarZ.f8301c);
                }
            }
            cVar.s("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            cVar.s("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '460643a974555d792b8f5a6e1a5d323c')");
            List list = this.f10372d;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((p) it.next()).getClass();
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                u1.c.h(cursorF0, th);
                throw th2;
            }
        }
    }

    @Override // w4.b
    public final void j(x4.c cVar, int i, int i10) throws Exception {
        l(cVar, i, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0018  */
    @Override // w4.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(x4.c r6) throws java.lang.Exception {
        /*
            r5 = this;
            java.lang.String r0 = "SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'"
            android.database.Cursor r0 = r6.f0(r0)
            boolean r1 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L15
            r2 = 0
            if (r1 == 0) goto L18
            int r1 = r0.getInt(r2)     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto L18
            r1 = 1
            goto L19
        L15:
            r6 = move-exception
            goto Lb5
        L18:
            r1 = r2
        L19:
            r0.close()
            r0 = 0
            if (r1 == 0) goto L5f
            ab.a r1 = new ab.a
            java.lang.String r3 = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"
            r4 = 3
            r1.<init>(r4, r3)
            android.database.Cursor r1 = r6.l0(r1)
            boolean r3 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L36
            if (r3 == 0) goto L38
            java.lang.String r2 = r1.getString(r2)     // Catch: java.lang.Throwable -> L36
            goto L39
        L36:
            r6 = move-exception
            goto L59
        L38:
            r2 = r0
        L39:
            r1.close()
            java.lang.String r1 = "460643a974555d792b8f5a6e1a5d323c"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L71
            java.lang.String r1 = "946eca6b182e63ebe50cf82e483715bf"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L4d
            goto L71
        L4d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: 460643a974555d792b8f5a6e1a5d323c, found: "
            java.lang.String r0 = d0.d.k(r0, r2)
            r6.<init>(r0)
            throw r6
        L59:
            throw r6     // Catch: java.lang.Throwable -> L5a
        L5a:
            r0 = move-exception
            u1.c.h(r1, r6)
            throw r0
        L5f:
            l7.a r1 = s5.d.z(r6)
            boolean r2 = r1.f8300b
            if (r2 == 0) goto L9f
            java.lang.String r1 = "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)"
            r6.s(r1)
            java.lang.String r1 = "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '460643a974555d792b8f5a6e1a5d323c')"
            r6.s(r1)
        L71:
            s5.d r1 = r5.f10373e
            java.lang.Object r1 = r1.f11493v
            com.tonyodev.fetch2.database.DownloadDatabase_Impl r1 = (com.tonyodev.fetch2.database.DownloadDatabase_Impl) r1
            y4.a r2 = new y4.a
            r2.<init>(r6)
            r1.o(r2)
            java.util.List r1 = r5.f10372d
            if (r1 == 0) goto L9c
            java.util.Iterator r1 = r1.iterator()
        L87:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L9c
            java.lang.Object r2 = r1.next()
            p4.p r2 = (p4.p) r2
            r2.getClass()
            ac.t r2 = r2.f10335a
            r2.a(r6)
            goto L87
        L9c:
            r5.f10371c = r0
            return
        L9f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Pre-packaged database has an invalid schema: "
            r0.<init>(r2)
            java.lang.String r1 = r1.f8301c
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        Lb5:
            throw r6     // Catch: java.lang.Throwable -> Lb6
        Lb6:
            r1 = move-exception
            u1.c.h(r0, r6)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.x.k(x4.c):void");
    }

    @Override // w4.b
    public final void l(x4.c cVar, int i, int i10) throws Exception {
        a aVar = this.f10371c;
        if (aVar != null) {
            s sVar = aVar.f10269d;
            sVar.getClass();
            List<bd.a> listM = com.bumptech.glide.c.m(sVar, i, i10);
            if (listM != null) {
                b8.h.l(new y4.a(cVar));
                for (bd.a aVar2 : listM) {
                    aVar2.getClass();
                    aVar2.a(cVar);
                }
                l7.a aVarZ = s5.d.z(cVar);
                if (!aVarZ.f8300b) {
                    throw new IllegalStateException("Migration didn't properly handle: " + aVarZ.f8301c);
                }
                cVar.s("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                cVar.s("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '460643a974555d792b8f5a6e1a5d323c')");
                return;
            }
        }
        a aVar3 = this.f10371c;
        if (aVar3 == null || com.bumptech.glide.c.z(aVar3, i, i10)) {
            throw new IllegalStateException("A migration from " + i + " to " + i10 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
        }
        if (aVar3.f10282s) {
            Cursor cursorF0 = cVar.f0("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
            try {
                qd.c cVarJ = fa.b.j();
                while (cursorF0.moveToNext()) {
                    String string = cursorF0.getString(0);
                    de.i.b(string);
                    if (!ke.p.B(string, "sqlite_", false) && !string.equals("android_metadata")) {
                        cVarJ.add(new od.f(string, Boolean.valueOf(de.i.a(cursorF0.getString(1), "view"))));
                    }
                }
                qd.c cVarB = fa.b.b(cVarJ);
                cursorF0.close();
                ListIterator listIterator = cVarB.listIterator(0);
                while (true) {
                    qd.a aVar4 = (qd.a) listIterator;
                    if (!aVar4.hasNext()) {
                        break;
                    }
                    od.f fVar = (od.f) aVar4.next();
                    String str = (String) fVar.f10116v;
                    if (((Boolean) fVar.f10117w).booleanValue()) {
                        cVar.s("DROP VIEW IF EXISTS " + str);
                    } else {
                        cVar.s("DROP TABLE IF EXISTS " + str);
                    }
                }
            } finally {
            }
        } else {
            cVar.s("DROP TABLE IF EXISTS `requests`");
        }
        List list = this.f10372d;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((p) it.next()).getClass();
            }
        }
        cVar.s("CREATE TABLE IF NOT EXISTS `requests` (`_id` INTEGER NOT NULL, `_namespace` TEXT NOT NULL, `_url` TEXT NOT NULL, `_file` TEXT NOT NULL, `_group` INTEGER NOT NULL, `_priority` INTEGER NOT NULL, `_headers` TEXT NOT NULL, `_written_bytes` INTEGER NOT NULL, `_total_bytes` INTEGER NOT NULL, `_status` INTEGER NOT NULL, `_error` INTEGER NOT NULL, `_network_type` INTEGER NOT NULL, `_created` INTEGER NOT NULL, `_tag` TEXT, `_enqueue_action` INTEGER NOT NULL, `_identifier` INTEGER NOT NULL, `_download_on_enqueue` INTEGER NOT NULL, `_extras` TEXT NOT NULL, `_auto_retry_max_attempts` INTEGER NOT NULL, `_auto_retry_attempts` INTEGER NOT NULL, PRIMARY KEY(`_id`))");
        cVar.s("CREATE UNIQUE INDEX IF NOT EXISTS `index_requests__file` ON `requests` (`_file`)");
        cVar.s("CREATE INDEX IF NOT EXISTS `index_requests__group__status` ON `requests` (`_group`, `_status`)");
        cVar.s("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        cVar.s("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '460643a974555d792b8f5a6e1a5d323c')");
    }

    @Override // w4.b
    public final void h(x4.c cVar) {
    }
}
