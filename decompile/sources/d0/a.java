package d0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a extends c {
    public int E;
    public int F;
    public a0.a G;

    public boolean getAllowsGoneWidget() {
        return this.G.f2t0;
    }

    public int getMargin() {
        return this.G.f3u0;
    }

    public int getType() {
        return this.E;
    }

    @Override // d0.c
    public final void h(a0.d dVar, boolean z10) {
        int i6 = this.E;
        this.F = i6;
        if (z10) {
            if (i6 == 5) {
                this.F = 1;
            } else if (i6 == 6) {
                this.F = 0;
            }
        } else if (i6 == 5) {
            this.F = 0;
        } else if (i6 == 6) {
            this.F = 1;
        }
        if (dVar instanceof a0.a) {
            ((a0.a) dVar).f1s0 = this.F;
        }
    }

    public void setAllowsGoneWidget(boolean z10) {
        this.G.f2t0 = z10;
    }

    public void setDpMargin(int i6) {
        this.G.f3u0 = (int) ((i6 * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i6) {
        this.G.f3u0 = i6;
    }

    public void setType(int i6) {
        this.E = i6;
    }
}
