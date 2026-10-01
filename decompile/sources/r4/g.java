package r4;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class g implements v4.c {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final v4.c f11188v;

    public g(v4.c cVar) {
        this.f11188v = cVar;
    }

    @Override // v4.c
    public final void K(int i, String str) {
        de.i.e(str, "value");
        this.f11188v.K(i, str);
    }

    @Override // v4.c
    public final boolean P() {
        return this.f11188v.P();
    }

    @Override // v4.c
    public final boolean Z() {
        return this.f11188v.Z();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        v4.c cVar = this.f11188v;
        cVar.reset();
        cVar.h();
    }

    @Override // v4.c
    public final void e(int i) {
        this.f11188v.e(i);
    }

    @Override // v4.c
    public final int getColumnCount() {
        return this.f11188v.getColumnCount();
    }

    @Override // v4.c
    public final String getColumnName(int i) {
        return this.f11188v.getColumnName(i);
    }

    @Override // v4.c
    public final long getLong(int i) {
        return this.f11188v.getLong(i);
    }

    @Override // v4.c
    public final void h() {
        this.f11188v.h();
    }

    @Override // v4.c
    public final boolean isNull(int i) {
        return this.f11188v.isNull(i);
    }

    @Override // v4.c
    public final String n(int i) {
        return this.f11188v.n(i);
    }

    @Override // v4.c
    public final void o(long j8) {
        this.f11188v.o(j8);
    }

    @Override // v4.c
    public final void reset() {
        this.f11188v.reset();
    }
}
