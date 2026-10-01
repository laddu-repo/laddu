package i5;

import android.database.sqlite.SQLiteStatement;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j extends i implements h5.e {

    /* renamed from: y, reason: collision with root package name */
    public final SQLiteStatement f6624y;

    public j(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f6624y = sQLiteStatement;
    }

    public final int d() {
        return this.f6624y.executeUpdateDelete();
    }
}
