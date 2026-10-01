package te;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class e extends h {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final e f12563y;

    static {
        int i = k.f12571c;
        int i10 = k.f12572d;
        long j8 = k.f12573e;
        String str = k.f12569a;
        e eVar = new e();
        eVar.f12565x = new c(i, i10, j8, str);
        f12563y = eVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // me.s
    public final String toString() {
        return "Dispatchers.Default";
    }
}
