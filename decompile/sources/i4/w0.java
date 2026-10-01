package i4;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class w0 implements g1, n8.e {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ long f6589x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f6590y;

    public /* synthetic */ w0(long j, g8.i iVar) {
        this.f6589x = j;
        this.f6590y = iVar;
    }

    @Override // n8.e
    public Object apply(Object obj) {
        g8.i iVar = (g8.i) this.f6590y;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.f6589x));
        String str = iVar.f5539a;
        d8.d dVar = iVar.f5541c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(q8.a.a(dVar))}) < 1) {
            contentValues.put("backend_name", iVar.f5539a);
            contentValues.put(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, Integer.valueOf(q8.a.a(dVar)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    @Override // i4.g1
    public Object c(b0 b0Var, s sVar, int i6) {
        return b0Var.q(sVar, db.k0.o((r1.e0) this.f6590y), 0, this.f6589x);
    }

    public /* synthetic */ w0(r1.e0 e0Var, long j) {
        this.f6590y = e0Var;
        this.f6589x = j;
    }
}
