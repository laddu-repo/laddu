package v3;

import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class j extends y1.j implements d {

    /* renamed from: x, reason: collision with root package name */
    public d f13280x;

    /* renamed from: y, reason: collision with root package name */
    public long f13281y;

    @Override // v3.d
    public final int c(long j) {
        d dVar = this.f13280x;
        dVar.getClass();
        return dVar.c(j - this.f13281y);
    }

    @Override // y1.j, y1.a
    public final void clear() {
        super.clear();
        this.f13280x = null;
    }

    @Override // v3.d
    public final long e(int i6) {
        d dVar = this.f13280x;
        dVar.getClass();
        return dVar.e(i6) + this.f13281y;
    }

    @Override // v3.d
    public final List p(long j) {
        d dVar = this.f13280x;
        dVar.getClass();
        return dVar.p(j - this.f13281y);
    }

    @Override // v3.d
    public final int s() {
        d dVar = this.f13280x;
        dVar.getClass();
        return dVar.s();
    }
}
