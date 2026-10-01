package z4;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class l implements g5.c {

    /* renamed from: x, reason: collision with root package name */
    public final g5.c f15196x;

    /* renamed from: y, reason: collision with root package name */
    public final long f15197y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ r f15198z;

    public l(r rVar, g5.c delegate) {
        kotlin.jvm.internal.k.e(delegate, "delegate");
        this.f15198z = rVar;
        this.f15196x = delegate;
        this.f15197y = a8.f.J();
    }

    @Override // g5.c
    public final String M(int i6) {
        if (!this.f15198z.f15215d.get()) {
            if (this.f15197y == a8.f.J()) {
                return this.f15196x.M(i6);
            }
            a8.d.m(21, "Attempted to use statement on a different thread");
            throw null;
        }
        a8.d.m(21, "Statement is recycled");
        throw null;
    }

    @Override // g5.c
    public final boolean X() {
        if (!this.f15198z.f15215d.get()) {
            if (this.f15197y == a8.f.J()) {
                return this.f15196x.X();
            }
            a8.d.m(21, "Attempted to use statement on a different thread");
            throw null;
        }
        a8.d.m(21, "Statement is recycled");
        throw null;
    }

    @Override // g5.c
    public final void b(int i6, long j) {
        if (!this.f15198z.f15215d.get()) {
            if (this.f15197y == a8.f.J()) {
                this.f15196x.b(i6, j);
                return;
            } else {
                a8.d.m(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }
        a8.d.m(21, "Statement is recycled");
        throw null;
    }

    @Override // g5.c
    public final void c(int i6) {
        if (!this.f15198z.f15215d.get()) {
            if (this.f15197y == a8.f.J()) {
                this.f15196x.c(i6);
                return;
            } else {
                a8.d.m(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }
        a8.d.m(21, "Statement is recycled");
        throw null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (!this.f15198z.f15215d.get()) {
            if (this.f15197y == a8.f.J()) {
                this.f15196x.close();
                return;
            } else {
                a8.d.m(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }
        a8.d.m(21, "Statement is recycled");
        throw null;
    }

    @Override // g5.c
    public final int getColumnCount() {
        if (!this.f15198z.f15215d.get()) {
            if (this.f15197y == a8.f.J()) {
                return this.f15196x.getColumnCount();
            }
            a8.d.m(21, "Attempted to use statement on a different thread");
            throw null;
        }
        a8.d.m(21, "Statement is recycled");
        throw null;
    }

    @Override // g5.c
    public final String getColumnName(int i6) {
        if (!this.f15198z.f15215d.get()) {
            if (this.f15197y == a8.f.J()) {
                return this.f15196x.getColumnName(i6);
            }
            a8.d.m(21, "Attempted to use statement on a different thread");
            throw null;
        }
        a8.d.m(21, "Statement is recycled");
        throw null;
    }

    @Override // g5.c
    public final long getLong(int i6) {
        if (!this.f15198z.f15215d.get()) {
            if (this.f15197y == a8.f.J()) {
                return this.f15196x.getLong(i6);
            }
            a8.d.m(21, "Attempted to use statement on a different thread");
            throw null;
        }
        a8.d.m(21, "Statement is recycled");
        throw null;
    }

    @Override // g5.c
    public final boolean isNull(int i6) {
        if (!this.f15198z.f15215d.get()) {
            if (this.f15197y == a8.f.J()) {
                return this.f15196x.isNull(i6);
            }
            a8.d.m(21, "Attempted to use statement on a different thread");
            throw null;
        }
        a8.d.m(21, "Statement is recycled");
        throw null;
    }

    @Override // g5.c
    public final void reset() {
        if (!this.f15198z.f15215d.get()) {
            if (this.f15197y == a8.f.J()) {
                this.f15196x.reset();
                return;
            } else {
                a8.d.m(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }
        a8.d.m(21, "Statement is recycled");
        throw null;
    }

    @Override // g5.c
    public final void v(int i6, String value) {
        kotlin.jvm.internal.k.e(value, "value");
        if (!this.f15198z.f15215d.get()) {
            if (this.f15197y == a8.f.J()) {
                this.f15196x.v(i6, value);
                return;
            } else {
                a8.d.m(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }
        a8.d.m(21, "Statement is recycled");
        throw null;
    }

    @Override // g5.c
    public final boolean z() {
        if (getLong(0) == 0) {
            return false;
        }
        return true;
    }
}
