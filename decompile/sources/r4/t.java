package r4;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class t implements v4.c {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final v4.c f11223v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long f11224w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ z f11225x;

    public t(z zVar, v4.c cVar) {
        de.i.e(cVar, "delegate");
        this.f11225x = zVar;
        this.f11223v = cVar;
        this.f11224w = u1.c.n();
    }

    @Override // v4.c
    public final void K(int i, String str) {
        de.i.e(str, "value");
        if (this.f11225x.f11239e) {
            p4.v.P(21, "Statement is recycled");
            throw null;
        }
        if (this.f11224w == u1.c.n()) {
            this.f11223v.K(i, str);
        } else {
            p4.v.P(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // v4.c
    public final boolean P() {
        return getLong(0) != 0;
    }

    @Override // v4.c
    public final boolean Z() {
        if (this.f11225x.f11239e) {
            p4.v.P(21, "Statement is recycled");
            throw null;
        }
        if (this.f11224w == u1.c.n()) {
            return this.f11223v.Z();
        }
        p4.v.P(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        if (this.f11225x.f11239e) {
            p4.v.P(21, "Statement is recycled");
            throw null;
        }
        if (this.f11224w == u1.c.n()) {
            this.f11223v.close();
        } else {
            p4.v.P(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // v4.c
    public final void e(int i) {
        if (this.f11225x.f11239e) {
            p4.v.P(21, "Statement is recycled");
            throw null;
        }
        if (this.f11224w == u1.c.n()) {
            this.f11223v.e(i);
        } else {
            p4.v.P(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // v4.c
    public final int getColumnCount() {
        if (this.f11225x.f11239e) {
            p4.v.P(21, "Statement is recycled");
            throw null;
        }
        if (this.f11224w == u1.c.n()) {
            return this.f11223v.getColumnCount();
        }
        p4.v.P(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // v4.c
    public final String getColumnName(int i) {
        if (this.f11225x.f11239e) {
            p4.v.P(21, "Statement is recycled");
            throw null;
        }
        if (this.f11224w == u1.c.n()) {
            return this.f11223v.getColumnName(i);
        }
        p4.v.P(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // v4.c
    public final long getLong(int i) {
        if (this.f11225x.f11239e) {
            p4.v.P(21, "Statement is recycled");
            throw null;
        }
        if (this.f11224w == u1.c.n()) {
            return this.f11223v.getLong(i);
        }
        p4.v.P(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // v4.c
    public final void h() {
        if (this.f11225x.f11239e) {
            p4.v.P(21, "Statement is recycled");
            throw null;
        }
        if (this.f11224w == u1.c.n()) {
            this.f11223v.h();
        } else {
            p4.v.P(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // v4.c
    public final boolean isNull(int i) {
        if (this.f11225x.f11239e) {
            p4.v.P(21, "Statement is recycled");
            throw null;
        }
        if (this.f11224w == u1.c.n()) {
            return this.f11223v.isNull(i);
        }
        p4.v.P(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // v4.c
    public final String n(int i) {
        if (this.f11225x.f11239e) {
            p4.v.P(21, "Statement is recycled");
            throw null;
        }
        if (this.f11224w == u1.c.n()) {
            return this.f11223v.n(i);
        }
        p4.v.P(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // v4.c
    public final void o(long j8) {
        if (this.f11225x.f11239e) {
            p4.v.P(21, "Statement is recycled");
            throw null;
        }
        if (this.f11224w == u1.c.n()) {
            this.f11223v.o(j8);
        } else {
            p4.v.P(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // v4.c
    public final void reset() {
        if (this.f11225x.f11239e) {
            p4.v.P(21, "Statement is recycled");
            throw null;
        }
        if (this.f11224w == u1.c.n()) {
            this.f11223v.reset();
        } else {
            p4.v.P(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }
}
