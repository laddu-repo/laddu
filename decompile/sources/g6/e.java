package g6;

import hb.x;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: x, reason: collision with root package name */
    public final j f5471x;

    /* renamed from: y, reason: collision with root package name */
    public final x f5472y;

    public e(j jVar, x xVar) {
        this.f5471x = jVar;
        this.f5472y = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f5471x.f5476x == this) {
            if (h.C.g(this.f5471x, this, h.f(this.f5472y))) {
                h.c(this.f5471x);
            }
        }
    }
}
