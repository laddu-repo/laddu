package d7;

import b7.y;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class r implements e7.a, d {

    /* renamed from: a, reason: collision with root package name */
    public final y f3949a;

    /* renamed from: b, reason: collision with root package name */
    public final e7.e f3950b;

    /* renamed from: c, reason: collision with root package name */
    public i7.k f3951c;

    public r(y yVar, j7.a aVar, i7.j jVar) {
        this.f3949a = yVar;
        e7.e G0 = jVar.f6674a.G0();
        this.f3950b = G0;
        aVar.f(G0);
        G0.a(this);
    }

    public static int d(int i6, int i10) {
        int i11 = i6 / i10;
        if ((i6 ^ i10) < 0 && i11 * i10 != i6) {
            i11--;
        }
        return i6 - (i11 * i10);
    }

    @Override // e7.a
    public final void a() {
        this.f3949a.invalidateSelf();
    }

    @Override // d7.d
    public final void b(List list, List list2) {
    }
}
