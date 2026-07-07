package m8;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.tasks.Task;
import g8.i;
import i4.w0;
import java.util.HashMap;
import nc.j;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements o8.b, n8.e, s9.a {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ long f8720x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f8721y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f8722z;

    public /* synthetic */ g(long j, Object obj, Object obj2) {
        this.f8721y = obj;
        this.f8722z = obj2;
        this.f8720x = j;
    }

    @Override // n8.e
    public Object apply(Object obj) {
        boolean z10;
        String str = (String) this.f8721y;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i6 = ((j8.c) this.f8722z).f7306x;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i6)});
        try {
            if (rawQuery.getCount() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            rawQuery.close();
            long j = this.f8720x;
            if (!z10) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("log_source", str);
                contentValues.put("reason", Integer.valueOf(i6));
                contentValues.put("events_dropped_count", Long.valueOf(j));
                sQLiteDatabase.insert("log_event_dropped", null, contentValues);
                return null;
            }
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i6)});
            return null;
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    @Override // s9.a
    public Object e(Task task) {
        return ((j) this.f8721y).b(task, this.f8720x, (HashMap) this.f8722z);
    }

    @Override // o8.b
    public Object execute() {
        e6.j jVar = (e6.j) this.f8721y;
        i iVar = (i) this.f8722z;
        n8.d dVar = (n8.d) jVar.f4390c;
        long f3 = ((p8.a) jVar.f4394g).f() + this.f8720x;
        n8.g gVar = (n8.g) dVar;
        gVar.getClass();
        gVar.l(new w0(f3, iVar));
        return null;
    }

    public /* synthetic */ g(j jVar, long j, HashMap hashMap) {
        this.f8721y = jVar;
        this.f8720x = j;
        this.f8722z = hashMap;
    }
}
