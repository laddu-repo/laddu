package a5;

import i5.j;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g extends h {
    public final j A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h5.b db2, String sql) {
        super(db2, sql);
        k.e(db2, "db");
        k.e(sql, "sql");
        this.A = db2.k(sql);
    }

    @Override // g5.c
    public final String M(int i6) {
        d();
        a8.d.m(21, "no row");
        throw null;
    }

    @Override // g5.c
    public final boolean X() {
        d();
        this.A.f6624y.execute();
        return false;
    }

    @Override // g5.c
    public final void b(int i6, long j) {
        d();
        this.A.b(i6, j);
    }

    @Override // g5.c
    public final void c(int i6) {
        d();
        this.A.c(i6);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.A.close();
        this.f578z = true;
    }

    @Override // g5.c
    public final int getColumnCount() {
        d();
        return 0;
    }

    @Override // g5.c
    public final String getColumnName(int i6) {
        d();
        a8.d.m(21, "no row");
        throw null;
    }

    @Override // g5.c
    public final long getLong(int i6) {
        d();
        a8.d.m(21, "no row");
        throw null;
    }

    @Override // g5.c
    public final boolean isNull(int i6) {
        d();
        a8.d.m(21, "no row");
        throw null;
    }

    @Override // g5.c
    public final void v(int i6, String value) {
        k.e(value, "value");
        d();
        this.A.i(i6, value);
    }

    @Override // g5.c
    public final void reset() {
    }
}
