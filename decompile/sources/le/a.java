package le;

import cf.m;
import kotlin.jvm.internal.k;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class a implements f {
    private final g key;

    public a(g key) {
        k.e(key, "key");
        this.key = key;
    }

    @Override // le.h
    public /* bridge */ <R> R fold(R r10, p pVar) {
        return (R) m.l(this, r10, pVar);
    }

    @Override // le.h
    public /* bridge */ <E extends f> E get(g gVar) {
        return (E) m.o(this, gVar);
    }

    @Override // le.f
    public g getKey() {
        return this.key;
    }

    @Override // le.h
    public /* bridge */ h minusKey(g gVar) {
        return m.x(this, gVar);
    }

    @Override // le.h
    public /* bridge */ h plus(h hVar) {
        return m.A(this, hVar);
    }
}
