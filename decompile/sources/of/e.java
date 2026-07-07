package of;

import gf.y;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e extends h {

    /* renamed from: z, reason: collision with root package name */
    public static final e f10176z;

    /* JADX WARN: Type inference failed for: r0v0, types: [of.h, gf.y, of.e] */
    static {
        int i6 = k.f10184c;
        int i10 = k.f10185d;
        long j = k.f10186e;
        String str = k.f10182a;
        ?? yVar = new y();
        yVar.f10178y = new c(i6, i10, j, str);
        f10176z = yVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // gf.y
    public final y i0(int i6) {
        mf.a.a(1);
        if (1 >= k.f10184c) {
            return this;
        }
        return super.i0(1);
    }

    @Override // gf.y
    public final String toString() {
        return "Dispatchers.Default";
    }
}
