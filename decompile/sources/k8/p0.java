package k8;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class p0 extends h0 {
    public static final String[] A = {"app_version", "ALTER TABLE messages ADD COLUMN app_version TEXT;", "app_version_int", "ALTER TABLE messages ADD COLUMN app_version_int INTEGER;"};

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final m f7689y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f7690z;

    public p0(p1 p1Var) {
        super(p1Var);
        this.f7689y = new m(this, ((p1) this.f2053w).f7692v);
    }

    @Override // k8.h0
    public final boolean G() {
        return false;
    }

    public final void H() {
        int iDelete;
        p1 p1Var = (p1) this.f2053w;
        D();
        try {
            SQLiteDatabase sQLiteDatabaseJ = J();
            if (sQLiteDatabaseJ == null || (iDelete = sQLiteDatabaseJ.delete("messages", null, null)) <= 0) {
                return;
            }
            v0 v0Var = p1Var.A;
            p1.l(v0Var);
            v0Var.J.b(Integer.valueOf(iDelete), "Reset local analytics data. records");
        } catch (SQLiteException e7) {
            v0 v0Var2 = p1Var.A;
            p1.l(v0Var2);
            v0Var2.B.b(e7, "Error resetting local analytics data. error");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x006f A[PHI: r4
  0x006f: PHI (r4v4 int) = (r4v1 int), (r4v2 int), (r4v1 int) binds: [B:32:0x0080, B:28:0x006d, B:25:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void I() {
        /*
            r10 = this;
            java.lang.String r0 = "Error deleting app launch break from local database"
            java.lang.Object r1 = r10.f2053w
            k8.p1 r1 = (k8.p1) r1
            r10.D()
            boolean r2 = r10.f7690z
            if (r2 == 0) goto Lf
            goto L98
        Lf:
            android.content.Context r2 = r1.f7692v
            java.lang.String r3 = "google_app_measurement_local.db"
            java.io.File r2 = r2.getDatabasePath(r3)
            boolean r2 = r2.exists()
            if (r2 == 0) goto L98
            r2 = 5
            r3 = 0
            r4 = r2
        L20:
            if (r3 >= r2) goto L8c
            r5 = 0
            r6 = 1
            android.database.sqlite.SQLiteDatabase r5 = r10.J()     // Catch: java.lang.Throwable -> L4a android.database.sqlite.SQLiteException -> L4c android.database.sqlite.SQLiteDatabaseLockedException -> L67 android.database.sqlite.SQLiteFullException -> L73
            if (r5 != 0) goto L2d
            r10.f7690z = r6     // Catch: java.lang.Throwable -> L4a android.database.sqlite.SQLiteException -> L4c android.database.sqlite.SQLiteDatabaseLockedException -> L67 android.database.sqlite.SQLiteFullException -> L73
            goto L98
        L2d:
            r5.beginTransaction()     // Catch: java.lang.Throwable -> L4a android.database.sqlite.SQLiteException -> L4c android.database.sqlite.SQLiteDatabaseLockedException -> L67 android.database.sqlite.SQLiteFullException -> L73
            java.lang.String r7 = "messages"
            java.lang.String r8 = "type == ?"
            r9 = 3
            java.lang.String r9 = java.lang.Integer.toString(r9)     // Catch: java.lang.Throwable -> L4a android.database.sqlite.SQLiteException -> L4c android.database.sqlite.SQLiteDatabaseLockedException -> L67 android.database.sqlite.SQLiteFullException -> L73
            java.lang.String[] r9 = new java.lang.String[]{r9}     // Catch: java.lang.Throwable -> L4a android.database.sqlite.SQLiteException -> L4c android.database.sqlite.SQLiteDatabaseLockedException -> L67 android.database.sqlite.SQLiteFullException -> L73
            r5.delete(r7, r8, r9)     // Catch: java.lang.Throwable -> L4a android.database.sqlite.SQLiteException -> L4c android.database.sqlite.SQLiteDatabaseLockedException -> L67 android.database.sqlite.SQLiteFullException -> L73
            r5.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L4a android.database.sqlite.SQLiteException -> L4c android.database.sqlite.SQLiteDatabaseLockedException -> L67 android.database.sqlite.SQLiteFullException -> L73
            r5.endTransaction()     // Catch: java.lang.Throwable -> L4a android.database.sqlite.SQLiteException -> L4c android.database.sqlite.SQLiteDatabaseLockedException -> L67 android.database.sqlite.SQLiteFullException -> L73
            r5.close()
            return
        L4a:
            r0 = move-exception
            goto L86
        L4c:
            r7 = move-exception
            if (r5 == 0) goto L58
            boolean r8 = r5.inTransaction()     // Catch: java.lang.Throwable -> L4a
            if (r8 == 0) goto L58
            r5.endTransaction()     // Catch: java.lang.Throwable -> L4a
        L58:
            k8.v0 r8 = r1.A     // Catch: java.lang.Throwable -> L4a
            k8.p1.l(r8)     // Catch: java.lang.Throwable -> L4a
            k8.t0 r8 = r8.B     // Catch: java.lang.Throwable -> L4a
            r8.b(r7, r0)     // Catch: java.lang.Throwable -> L4a
            r10.f7690z = r6     // Catch: java.lang.Throwable -> L4a
            if (r5 == 0) goto L83
            goto L6f
        L67:
            long r6 = (long) r4     // Catch: java.lang.Throwable -> L4a
            android.os.SystemClock.sleep(r6)     // Catch: java.lang.Throwable -> L4a
            int r4 = r4 + 20
            if (r5 == 0) goto L83
        L6f:
            r5.close()
            goto L83
        L73:
            r7 = move-exception
            k8.v0 r8 = r1.A     // Catch: java.lang.Throwable -> L4a
            k8.p1.l(r8)     // Catch: java.lang.Throwable -> L4a
            k8.t0 r8 = r8.B     // Catch: java.lang.Throwable -> L4a
            r8.b(r7, r0)     // Catch: java.lang.Throwable -> L4a
            r10.f7690z = r6     // Catch: java.lang.Throwable -> L4a
            if (r5 == 0) goto L83
            goto L6f
        L83:
            int r3 = r3 + 1
            goto L20
        L86:
            if (r5 == 0) goto L8b
            r5.close()
        L8b:
            throw r0
        L8c:
            k8.v0 r0 = r1.A
            k8.p1.l(r0)
            k8.t0 r0 = r0.E
            java.lang.String r1 = "Error deleting app launch break from local database in reasonable time"
            r0.a(r1)
        L98:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.p0.I():void");
    }

    public final SQLiteDatabase J() {
        if (this.f7690z) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f7689y.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f7690z = true;
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ae A[Catch: SQLiteException -> 0x0093, SQLiteDatabaseLockedException -> 0x009a, SQLiteFullException -> 0x009e, all -> 0x0154, TRY_ENTER, TryCatch #10 {all -> 0x0154, blocks: (B:30:0x0088, B:32:0x008e, B:43:0x00ae, B:45:0x00cf, B:47:0x00d8, B:49:0x00de, B:59:0x00f8, B:73:0x0120, B:75:0x0126, B:76:0x0129, B:93:0x015b, B:83:0x0144), top: B:109:0x0088 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0120 A[Catch: all -> 0x0154, TRY_ENTER, TryCatch #10 {all -> 0x0154, blocks: (B:30:0x0088, B:32:0x008e, B:43:0x00ae, B:45:0x00cf, B:47:0x00d8, B:49:0x00de, B:59:0x00f8, B:73:0x0120, B:75:0x0126, B:76:0x0129, B:93:0x015b, B:83:0x0144), top: B:109:0x0088 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0150 A[PHI: r8 r10 r17
  0x0150: PHI (r8v5 int) = (r8v3 int), (r8v3 int), (r8v6 int) binds: [B:79:0x013c, B:96:0x016d, B:87:0x014e] A[DONT_GENERATE, DONT_INLINE]
  0x0150: PHI (r10v7 android.database.sqlite.SQLiteDatabase) = 
  (r10v5 android.database.sqlite.SQLiteDatabase)
  (r10v6 android.database.sqlite.SQLiteDatabase)
  (r10v8 android.database.sqlite.SQLiteDatabase)
 binds: [B:79:0x013c, B:96:0x016d, B:87:0x014e] A[DONT_GENERATE, DONT_INLINE]
  0x0150: PHI (r17v7 boolean) = (r17v4 boolean), (r17v5 boolean), (r17v8 boolean) binds: [B:79:0x013c, B:96:0x016d, B:87:0x014e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean K(int r19, byte[] r20) {
        /*
            Method dump skipped, instruction units count: 399
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.p0.K(int, byte[]):boolean");
    }
}
