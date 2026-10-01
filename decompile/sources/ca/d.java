package ca;

import com.google.android.material.carousel.CarouselLayoutManager;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d extends e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1997c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f1998d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(CarouselLayoutManager carouselLayoutManager, int i6) {
        super(1, 0);
        this.f1997c = i6;
        switch (i6) {
            case 1:
                this.f1998d = carouselLayoutManager;
                super(0, 0);
                return;
            default:
                this.f1998d = carouselLayoutManager;
                return;
        }
    }

    @Override // ca.e
    public final int c() {
        switch (this.f1997c) {
            case 0:
                return this.f1998d.f14017o;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f1998d;
                return carouselLayoutManager.f14017o - carouselLayoutManager.D();
        }
    }

    @Override // ca.e
    public final int d() {
        switch (this.f1997c) {
            case 0:
                return this.f1998d.E();
            default:
                return 0;
        }
    }

    @Override // ca.e
    public final int e() {
        switch (this.f1997c) {
            case 0:
                CarouselLayoutManager carouselLayoutManager = this.f1998d;
                return carouselLayoutManager.f14016n - carouselLayoutManager.F();
            default:
                return this.f1998d.f14016n;
        }
    }

    @Override // ca.e
    public final int f() {
        switch (this.f1997c) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f1998d;
                if (carouselLayoutManager.E0()) {
                    return carouselLayoutManager.f14016n;
                }
                return 0;
        }
    }

    @Override // ca.e
    public final int g() {
        switch (this.f1997c) {
            case 0:
                return 0;
            default:
                return this.f1998d.G();
        }
    }
}
