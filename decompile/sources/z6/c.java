package z6;

import v6.f;
import v6.l;
import v6.s;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c implements e {

    /* renamed from: x, reason: collision with root package name */
    public final x6.a f15222x;

    /* renamed from: y, reason: collision with root package name */
    public final l f15223y;

    public c(x6.a aVar, l lVar) {
        this.f15222x = aVar;
        this.f15223y = lVar;
    }

    @Override // z6.e
    public final void a() {
        l lVar = this.f15223y;
        boolean z10 = lVar instanceof s;
        x6.a aVar = this.f15222x;
        if (z10) {
            aVar.b(((s) lVar).f13424a);
        } else {
            if (lVar instanceof f) {
                aVar.b(((f) lVar).f13357a);
                return;
            }
            throw new RuntimeException();
        }
    }
}
