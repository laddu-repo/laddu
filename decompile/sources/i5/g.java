package i5;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g extends SQLiteOpenHelper {
    public static final /* synthetic */ int D = 0;
    public boolean A;
    public final j5.a B;
    public boolean C;

    /* renamed from: x, reason: collision with root package name */
    public final Context f6617x;

    /* renamed from: y, reason: collision with root package name */
    public final k7.c f6618y;

    /* renamed from: z, reason: collision with root package name */
    public final ca.e f6619z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, String str, final k7.c cVar, final ca.e callback) {
        super(context, str, null, callback.f2000b, new DatabaseErrorHandler() { // from class: i5.d
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                int i6 = g.D;
                k.b(sQLiteDatabase);
                c p10 = s1.c.p(cVar, sQLiteDatabase);
                ca.e.this.getClass();
                Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + p10 + ".path");
                SQLiteDatabase sQLiteDatabase2 = p10.f6609x;
                if (!sQLiteDatabase2.isOpen()) {
                    String path = sQLiteDatabase2.getPath();
                    if (path != null) {
                        ca.e.a(path);
                        return;
                    }
                    return;
                }
                List<Pair<String, String>> list = null;
                try {
                    try {
                        list = sQLiteDatabase2.getAttachedDbs();
                    } catch (SQLiteException unused) {
                    }
                    try {
                        p10.close();
                    } catch (IOException unused2) {
                    }
                } finally {
                    if (list != null) {
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            Object second = ((Pair) it.next()).second;
                            k.d(second, "second");
                            ca.e.a((String) second);
                        }
                    } else {
                        String path2 = sQLiteDatabase2.getPath();
                        if (path2 != null) {
                            ca.e.a(path2);
                        }
                    }
                }
            }
        });
        String str2;
        k.e(context, "context");
        k.e(callback, "callback");
        this.f6617x = context;
        this.f6618y = cVar;
        this.f6619z = callback;
        if (str == null) {
            str2 = UUID.randomUUID().toString();
            k.d(str2, "toString(...)");
        } else {
            str2 = str;
        }
        this.B = new j5.a(str2, context.getCacheDir(), false);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        j5.a aVar = this.B;
        try {
            aVar.a(aVar.f7226a);
            super.close();
            this.f6618y.f7745y = null;
            this.C = false;
        } finally {
            aVar.b();
        }
    }

    public final h5.b d(boolean z10) {
        boolean z11;
        j5.a aVar = this.B;
        try {
            if (!this.C && getDatabaseName() != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            aVar.a(z11);
            this.A = false;
            SQLiteDatabase f3 = f(z10);
            if (this.A) {
                close();
                h5.b d10 = d(z10);
                aVar.b();
                return d10;
            }
            c p10 = s1.c.p(this.f6618y, f3);
            aVar.b();
            return p10;
        } catch (Throwable th) {
            aVar.b();
            throw th;
        }
    }

    public final SQLiteDatabase f(boolean z10) {
        SQLiteDatabase readableDatabase;
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z11 = this.C;
        if (databaseName != null && !z11 && (parentFile = this.f6617x.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
            }
        }
        try {
            if (z10) {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                k.b(writableDatabase);
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase2 = getReadableDatabase();
            k.b(readableDatabase2);
            return readableDatabase2;
        } catch (Throwable unused) {
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                if (z10) {
                    readableDatabase = getWritableDatabase();
                    k.b(readableDatabase);
                } else {
                    readableDatabase = getReadableDatabase();
                    k.b(readableDatabase);
                }
                return readableDatabase;
            } catch (Throwable th) {
                th = th;
                if (th instanceof e) {
                    e eVar = (e) th;
                    int ordinal = eVar.f6612x.ordinal();
                    th = eVar.f6613y;
                    if (ordinal != 0 && ordinal != 1 && ordinal != 2 && ordinal != 3) {
                        if (ordinal == 4) {
                            if (!(th instanceof SQLiteException)) {
                                throw th;
                            }
                        } else {
                            throw new RuntimeException();
                        }
                    } else {
                        throw th;
                    }
                }
                throw th;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase db2) {
        k.e(db2, "db");
        boolean z10 = this.A;
        ca.e eVar = this.f6619z;
        if (!z10 && eVar.f2000b != db2.getVersion()) {
            db2.setMaxSqlCacheSize(1);
        }
        try {
            eVar.h(s1.c.p(this.f6618y, db2));
        } catch (Throwable th) {
            throw new e(f.f6614x, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sqLiteDatabase) {
        k.e(sqLiteDatabase, "sqLiteDatabase");
        try {
            this.f6619z.i(s1.c.p(this.f6618y, sqLiteDatabase));
        } catch (Throwable th) {
            throw new e(f.f6615y, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase db2, int i6, int i10) {
        k.e(db2, "db");
        this.A = true;
        try {
            this.f6619z.j(s1.c.p(this.f6618y, db2), i6, i10);
        } catch (Throwable th) {
            throw new e(f.A, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase db2) {
        k.e(db2, "db");
        if (!this.A) {
            try {
                this.f6619z.k(s1.c.p(this.f6618y, db2));
            } catch (Throwable th) {
                throw new e(f.B, th);
            }
        }
        this.C = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sqLiteDatabase, int i6, int i10) {
        k.e(sqLiteDatabase, "sqLiteDatabase");
        this.A = true;
        try {
            this.f6619z.l(s1.c.p(this.f6618y, sqLiteDatabase), i6, i10);
        } catch (Throwable th) {
            throw new e(f.f6616z, th);
        }
    }
}
