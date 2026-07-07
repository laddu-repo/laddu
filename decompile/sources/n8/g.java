package n8;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import i4.h0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g implements d, o8.c, c {
    public static final d8.c C = new d8.c("proto");
    public final a A;
    public final ge.a B;

    /* renamed from: x, reason: collision with root package name */
    public final i f9141x;

    /* renamed from: y, reason: collision with root package name */
    public final p8.a f9142y;

    /* renamed from: z, reason: collision with root package name */
    public final p8.a f9143z;

    public g(p8.a aVar, p8.a aVar2, a aVar3, i iVar, ge.a aVar4) {
        this.f9141x = iVar;
        this.f9142y = aVar;
        this.f9143z = aVar2;
        this.A = aVar3;
        this.B = aVar4;
    }

    public static String Q(Iterable iterable) {
        StringBuilder sb2 = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb2.append(((b) it.next()).f9136a);
            if (it.hasNext()) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    public static Object S(Cursor cursor, e eVar) {
        try {
            return eVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public static Long f(SQLiteDatabase sQLiteDatabase, g8.i iVar) {
        Long valueOf;
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(iVar.f5539a, String.valueOf(q8.a.a(iVar.f5541c))));
        byte[] bArr = iVar.f5540b;
        if (bArr != null) {
            sb2.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb2.append(" and extras is null");
        }
        Cursor query = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb2.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            if (!query.moveToNext()) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(query.getLong(0));
            }
            return valueOf;
        } finally {
            query.close();
        }
    }

    public final Object K(o8.b bVar) {
        SQLiteDatabase d10 = d();
        p8.a aVar = this.f9143z;
        long f3 = aVar.f();
        while (true) {
            try {
                d10.beginTransaction();
                try {
                    Object execute = bVar.execute();
                    d10.setTransactionSuccessful();
                    return execute;
                } finally {
                    d10.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e10) {
                if (aVar.f() < this.A.f9133c + f3) {
                    SystemClock.sleep(50L);
                } else {
                    throw new RuntimeException("Timed out while trying to acquire the lock.", e10);
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f9141x.close();
    }

    public final SQLiteDatabase d() {
        i iVar = this.f9141x;
        Objects.requireNonNull(iVar);
        p8.a aVar = this.f9143z;
        long f3 = aVar.f();
        while (true) {
            try {
                return iVar.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e10) {
                if (aVar.f() < this.A.f9133c + f3) {
                    SystemClock.sleep(50L);
                } else {
                    throw new RuntimeException("Timed out while trying to open db.", e10);
                }
            }
        }
    }

    public final Object l(e eVar) {
        SQLiteDatabase d10 = d();
        d10.beginTransaction();
        try {
            Object apply = eVar.apply(d10);
            d10.setTransactionSuccessful();
            return apply;
        } finally {
            d10.endTransaction();
        }
    }

    public final ArrayList m(SQLiteDatabase sQLiteDatabase, g8.i iVar, int i6) {
        ArrayList arrayList = new ArrayList();
        Long f3 = f(sQLiteDatabase, iVar);
        if (f3 == null) {
            return arrayList;
        }
        S(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{f3.toString()}, null, null, null, String.valueOf(i6)), new h0(this, arrayList, iVar, 6));
        return arrayList;
    }

    public final void y(long j, j8.c cVar, String str) {
        l(new m8.g(j, str, cVar));
    }
}
