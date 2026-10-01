package s0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d extends c {

    /* renamed from: c, reason: collision with root package name */
    public final Object f11963c;

    public d(int i6) {
        super(i6);
        this.f11963c = new Object();
    }

    @Override // s0.c
    public final Object a() {
        Object a10;
        synchronized (this.f11963c) {
            a10 = super.a();
        }
        return a10;
    }

    @Override // s0.c
    public final boolean c(Object obj) {
        boolean c10;
        synchronized (this.f11963c) {
            c10 = super.c(obj);
        }
        return c10;
    }
}
