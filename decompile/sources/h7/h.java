package h7;

import a7.k;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class h implements d, i7.c, c {
    public static final x6.c A = new x6.c("proto");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final j f6171v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final j7.a f6172w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final j7.a f6173x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final a f6174y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final nd.a f6175z;

    public h(j7.a aVar, j7.a aVar2, a aVar3, j jVar, nd.a aVar4) {
        this.f6171v = jVar;
        this.f6172w = aVar;
        this.f6173x = aVar2;
        this.f6174y = aVar3;
        this.f6175z = aVar4;
    }

    public static String D(Iterable iterable) {
        StringBuilder sb2 = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb2.append(((b) it.next()).f6164a);
            if (it.hasNext()) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    public static Object G(Cursor cursor, f fVar) {
        try {
            return fVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public static Long i(SQLiteDatabase sQLiteDatabase, k kVar) {
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(kVar.f205a, String.valueOf(k7.a.a(kVar.f207c))));
        byte[] bArr = kVar.f206b;
        if (bArr != null) {
            sb2.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb2.append(" and extras is null");
        }
        Cursor cursorQuery = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb2.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !cursorQuery.moveToNext() ? null : Long.valueOf(cursorQuery.getLong(0));
        } finally {
            cursorQuery.close();
        }
    }

    public final void A(long j8, d7.c cVar, String str) {
        l(new g7.f(str, cVar, j8));
    }

    public final Object B(i7.b bVar) {
        SQLiteDatabase sQLiteDatabaseA = a();
        j7.a aVar = this.f6173x;
        long jD = aVar.d();
        while (true) {
            try {
                sQLiteDatabaseA.beginTransaction();
                try {
                    Object objE = bVar.e();
                    sQLiteDatabaseA.setTransactionSuccessful();
                    return objE;
                } finally {
                    sQLiteDatabaseA.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e7) {
                if (aVar.d() >= ((long) this.f6174y.f6161c) + jD) {
                    throw new i7.a("Timed out while trying to acquire the lock.", e7);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    public final SQLiteDatabase a() {
        j jVar = this.f6171v;
        Objects.requireNonNull(jVar);
        j7.a aVar = this.f6173x;
        long jD = aVar.d();
        while (true) {
            try {
                return jVar.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e7) {
                if (aVar.d() >= ((long) this.f6174y.f6161c) + jD) {
                    throw new i7.a("Timed out while trying to open db.", e7);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f6171v.close();
    }

    public final Object l(f fVar) {
        SQLiteDatabase sQLiteDatabaseA = a();
        sQLiteDatabaseA.beginTransaction();
        try {
            Object objApply = fVar.apply(sQLiteDatabaseA);
            sQLiteDatabaseA.setTransactionSuccessful();
            return objApply;
        } finally {
            sQLiteDatabaseA.endTransaction();
        }
    }

    public final ArrayList m(SQLiteDatabase sQLiteDatabase, k kVar, int i) {
        ArrayList arrayList = new ArrayList();
        Long lI = i(sQLiteDatabase, kVar);
        if (lI == null) {
            return arrayList;
        }
        G(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{lI.toString()}, null, null, null, String.valueOf(i)), new ed.d(this, arrayList, kVar, 3));
        return arrayList;
    }
}
