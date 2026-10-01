package h7;

import e7.o;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c implements e {

    /* renamed from: x, reason: collision with root package name */
    public final b f5981x;

    /* renamed from: y, reason: collision with root package name */
    public final b f5982y;

    public c(b bVar, b bVar2) {
        this.f5981x = bVar;
        this.f5982y = bVar2;
    }

    @Override // h7.e
    public final e7.e G0() {
        return new o(this.f5981x.G0(), this.f5982y.G0());
    }

    @Override // h7.e
    public final List Q0() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // h7.e
    public final boolean T0() {
        if (this.f5981x.T0() && this.f5982y.T0()) {
            return true;
        }
        return false;
    }
}
