package i5;

import android.database.sqlite.SQLiteProgram;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class i implements h5.e {

    /* renamed from: x, reason: collision with root package name */
    public final SQLiteProgram f6623x;

    public i(SQLiteProgram delegate) {
        k.e(delegate, "delegate");
        this.f6623x = delegate;
    }

    @Override // h5.e
    public final void D(int i6, byte[] bArr) {
        this.f6623x.bindBlob(i6, bArr);
    }

    @Override // h5.e
    public final void b(int i6, long j) {
        this.f6623x.bindLong(i6, j);
    }

    @Override // h5.e
    public final void c(int i6) {
        this.f6623x.bindNull(i6);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f6623x.close();
    }

    @Override // h5.e
    public final void i(int i6, String value) {
        k.e(value, "value");
        this.f6623x.bindString(i6, value);
    }

    @Override // h5.e
    public final void o(int i6, double d10) {
        this.f6623x.bindDouble(i6, d10);
    }
}
