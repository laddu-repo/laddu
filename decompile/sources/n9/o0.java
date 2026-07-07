package n9;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.SystemClock;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class o0 extends g0 {
    public static final String[] C = {"app_version", "ALTER TABLE messages ADD COLUMN app_version TEXT;", "app_version_int", "ALTER TABLE messages ADD COLUMN app_version_int INTEGER;"};
    public final n A;
    public boolean B;

    public o0(n1 n1Var) {
        super(n1Var);
        this.A = new n(this, ((n1) this.f4301y).f9413x);
    }

    @Override // n9.g0
    public final boolean g1() {
        return false;
    }

    public final void h1() {
        int delete;
        n1 n1Var = (n1) this.f4301y;
        d1();
        try {
            SQLiteDatabase j12 = j1();
            if (j12 != null && (delete = j12.delete("messages", null, null)) > 0) {
                u0 u0Var = n1Var.C;
                n1.g(u0Var);
                u0Var.L.b(Integer.valueOf(delete), "Reset local analytics data. records");
            }
        } catch (SQLiteException e10) {
            u0 u0Var2 = n1Var.C;
            n1.g(u0Var2);
            u0Var2.D.b(e10, "Error resetting local analytics data. error");
        }
    }

    public final boolean i1() {
        n1 n1Var = (n1) this.f4301y;
        d1();
        if (!this.B && n1Var.f9413x.getDatabasePath("google_app_measurement_local.db").exists()) {
            int i6 = 0;
            int i10 = 5;
            while (true) {
                if (i6 < 5) {
                    SQLiteDatabase sQLiteDatabase = null;
                    try {
                        try {
                            SQLiteDatabase j12 = j1();
                            if (j12 == null) {
                                this.B = true;
                            } else {
                                j12.beginTransaction();
                                j12.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                                j12.setTransactionSuccessful();
                                j12.endTransaction();
                                j12.close();
                                return true;
                            }
                        } catch (SQLiteDatabaseLockedException unused) {
                            SystemClock.sleep(i10);
                            i10 += 20;
                            if (0 == 0) {
                            }
                            sQLiteDatabase.close();
                        } catch (SQLiteFullException e10) {
                            u0 u0Var = n1Var.C;
                            n1.g(u0Var);
                            u0Var.D.b(e10, "Error deleting app launch break from local database");
                            this.B = true;
                            if (0 == 0) {
                            }
                            sQLiteDatabase.close();
                        }
                    } catch (SQLiteException e11) {
                        if (0 != 0) {
                            try {
                                if (sQLiteDatabase.inTransaction()) {
                                    sQLiteDatabase.endTransaction();
                                }
                            } catch (Throwable th) {
                                if (0 != 0) {
                                    sQLiteDatabase.close();
                                }
                                throw th;
                            }
                        }
                        u0 u0Var2 = n1Var.C;
                        n1.g(u0Var2);
                        u0Var2.D.b(e11, "Error deleting app launch break from local database");
                        this.B = true;
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                    }
                } else {
                    u0 u0Var3 = n1Var.C;
                    n1.g(u0Var3);
                    u0Var3.G.a("Error deleting app launch break from local database in reasonable time");
                    break;
                }
                i6++;
            }
        }
        return false;
    }

    public final SQLiteDatabase j1() {
        if (this.B) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.A.getWritableDatabase();
        if (writableDatabase == null) {
            this.B = true;
            return null;
        }
        return writableDatabase;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0173 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0173 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0124 A[Catch: all -> 0x0157, TRY_ENTER, TryCatch #9 {all -> 0x0157, blocks: (B:93:0x0088, B:95:0x008e, B:65:0x00ae, B:67:0x00cf, B:70:0x00d8, B:73:0x00de, B:74:0x00fd, B:42:0x0124, B:44:0x012a, B:45:0x012d, B:33:0x015e, B:21:0x0147), top: B:92:0x0088 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0173 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean k1(int r19, byte[] r20) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.o0.k1(int, byte[]):boolean");
    }
}
