package m8;

import a2.a2;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import b7.k;
import e6.j;
import g8.i;
import i4.w0;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements o8.b, rb.f {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f8717x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ long f8718y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f8719z;

    public /* synthetic */ f(j jVar, Iterable iterable, i iVar, long j) {
        this.f8717x = 0;
        this.f8719z = jVar;
        this.A = iterable;
        this.B = iVar;
        this.f8718y = j;
    }

    @Override // rb.f
    public ScheduledFuture a(a2 a2Var) {
        switch (this.f8717x) {
            case 1:
                rb.e eVar = (rb.e) this.f8719z;
                Runnable runnable = (Runnable) this.A;
                return eVar.f11939y.schedule(new rb.d(eVar, runnable, a2Var, 1), this.f8718y, (TimeUnit) this.B);
            default:
                rb.e eVar2 = (rb.e) this.f8719z;
                Callable callable = (Callable) this.A;
                return eVar2.f11939y.schedule(new k(eVar2, callable, a2Var, 2), this.f8718y, (TimeUnit) this.B);
        }
    }

    @Override // o8.b
    public Object execute() {
        j jVar = (j) this.f8719z;
        Iterable iterable = (Iterable) this.A;
        i iVar = (i) this.B;
        n8.g gVar = (n8.g) ((n8.d) jVar.f4390c);
        gVar.getClass();
        if (iterable.iterator().hasNext()) {
            String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + n8.g.Q(iterable);
            SQLiteDatabase d10 = gVar.d();
            d10.beginTransaction();
            try {
                d10.compileStatement(str).execute();
                Cursor rawQuery = d10.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (rawQuery.moveToNext()) {
                    try {
                        gVar.y(rawQuery.getInt(0), j8.c.MAX_RETRIES_REACHED, rawQuery.getString(1));
                    } catch (Throwable th) {
                        rawQuery.close();
                        throw th;
                    }
                }
                rawQuery.close();
                d10.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                d10.setTransactionSuccessful();
            } finally {
                d10.endTransaction();
            }
        }
        gVar.l(new w0(((p8.a) jVar.f4394g).f() + this.f8718y, iVar));
        return null;
    }

    public /* synthetic */ f(rb.e eVar, Object obj, long j, TimeUnit timeUnit, int i6) {
        this.f8717x = i6;
        this.f8719z = eVar;
        this.A = obj;
        this.f8718y = j;
        this.B = timeUnit;
    }
}
