package n3;

import a8.g;
import r1.g0;
import r1.i0;
import r1.q;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f9027a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9028b;

    /* renamed from: c, reason: collision with root package name */
    public final long f9029c;

    /* renamed from: d, reason: collision with root package name */
    public final long f9030d;

    /* renamed from: e, reason: collision with root package name */
    public final long f9031e;

    public a(long j, long j10, long j11, long j12, long j13) {
        this.f9027a = j;
        this.f9028b = j10;
        this.f9029c = j11;
        this.f9030d = j12;
        this.f9031e = j13;
    }

    @Override // r1.i0
    public final /* synthetic */ q a() {
        return null;
    }

    @Override // r1.i0
    public final /* synthetic */ byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f9027a == aVar.f9027a && this.f9028b == aVar.f9028b && this.f9029c == aVar.f9029c && this.f9030d == aVar.f9030d && this.f9031e == aVar.f9031e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return g.k(this.f9031e) + ((g.k(this.f9030d) + ((g.k(this.f9029c) + ((g.k(this.f9028b) + ((g.k(this.f9027a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f9027a + ", photoSize=" + this.f9028b + ", photoPresentationTimestampUs=" + this.f9029c + ", videoStartPosition=" + this.f9030d + ", videoSize=" + this.f9031e;
    }

    @Override // r1.i0
    public final /* synthetic */ void b(g0 g0Var) {
    }
}
