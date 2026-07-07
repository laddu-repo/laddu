package i5;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import d.a0;
import java.lang.reflect.Method;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c implements h5.b {
    public static final Object A;

    /* renamed from: y, reason: collision with root package name */
    public static final String[] f6607y = new String[0];

    /* renamed from: z, reason: collision with root package name */
    public static final Object f6608z;

    /* renamed from: x, reason: collision with root package name */
    public final SQLiteDatabase f6609x;

    static {
        a0 a0Var = new a0(3);
        he.g gVar = he.g.f6075z;
        f6608z = he.a.c(gVar, a0Var);
        A = he.a.c(gVar, new a0(4));
    }

    public c(SQLiteDatabase sQLiteDatabase) {
        this.f6609x = sQLiteDatabase;
    }

    @Override // h5.b
    public final void A(Object[] objArr) {
        this.f6609x.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr);
    }

    @Override // h5.b
    public final void B() {
        this.f6609x.setTransactionSuccessful();
    }

    @Override // h5.b
    public final void C() {
        this.f6609x.beginTransactionNonExclusive();
    }

    @Override // h5.b
    public final Cursor E(h5.f fVar) {
        final a aVar = new a(fVar);
        Cursor rawQueryWithFactory = this.f6609x.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: i5.b
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                h5.f fVar2 = a.this.f6605x;
                k.b(sQLiteQuery);
                fVar2.y(new i(sQLiteQuery));
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, fVar.K(), f6607y, null);
        k.d(rawQueryWithFactory, "rawQueryWithFactory(...)");
        return rawQueryWithFactory;
    }

    @Override // h5.b
    public final void J() {
        this.f6609x.endTransaction();
    }

    @Override // h5.b
    public final boolean U() {
        return this.f6609x.inTransaction();
    }

    @Override // h5.b
    public final boolean W() {
        return this.f6609x.isWriteAheadLoggingEnabled();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f6609x.close();
    }

    @Override // h5.b
    public final void e() {
        this.f6609x.beginTransaction();
    }

    @Override // h5.b
    public final void h(String sql) {
        k.e(sql, "sql");
        this.f6609x.execSQL(sql);
    }

    @Override // h5.b
    public final boolean isOpen() {
        return this.f6609x.isOpen();
    }

    @Override // h5.b
    public final j k(String sql) {
        k.e(sql, "sql");
        SQLiteStatement compileStatement = this.f6609x.compileStatement(sql);
        k.d(compileStatement, "compileStatement(...)");
        return new j(compileStatement);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [he.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [he.f, java.lang.Object] */
    @Override // h5.b
    public final void q() {
        ?? r22 = A;
        if (((Method) r22.getValue()) != null) {
            ?? r32 = f6608z;
            if (((Method) r32.getValue()) != null) {
                Method method = (Method) r22.getValue();
                k.b(method);
                Method method2 = (Method) r32.getValue();
                k.b(method2);
                Object invoke = method2.invoke(this.f6609x, null);
                if (invoke != null) {
                    method.invoke(invoke, 0, null, 0, null);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
        }
        e();
    }
}
