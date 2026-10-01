package t0;

import android.graphics.Insets;
import android.view.WindowInsets;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class p1 extends o1 {

    /* renamed from: o, reason: collision with root package name */
    public l0.c f12394o;

    /* renamed from: p, reason: collision with root package name */
    public l0.c f12395p;

    /* renamed from: q, reason: collision with root package name */
    public l0.c f12396q;

    public p1(w1 w1Var, WindowInsets windowInsets) {
        super(w1Var, windowInsets);
        this.f12394o = null;
        this.f12395p = null;
        this.f12396q = null;
    }

    @Override // t0.t1
    public l0.c g() {
        Insets mandatorySystemGestureInsets;
        if (this.f12395p == null) {
            mandatorySystemGestureInsets = this.f12378c.getMandatorySystemGestureInsets();
            this.f12395p = l0.c.c(mandatorySystemGestureInsets);
        }
        return this.f12395p;
    }

    @Override // t0.t1
    public l0.c i() {
        Insets systemGestureInsets;
        if (this.f12394o == null) {
            systemGestureInsets = this.f12378c.getSystemGestureInsets();
            this.f12394o = l0.c.c(systemGestureInsets);
        }
        return this.f12394o;
    }

    @Override // t0.t1
    public l0.c k() {
        Insets tappableElementInsets;
        if (this.f12396q == null) {
            tappableElementInsets = this.f12378c.getTappableElementInsets();
            this.f12396q = l0.c.c(tappableElementInsets);
        }
        return this.f12396q;
    }

    @Override // t0.m1, t0.t1
    public w1 l(int i6, int i10, int i11, int i12) {
        WindowInsets inset;
        inset = this.f12378c.inset(i6, i10, i11, i12);
        return w1.h(null, inset);
    }

    @Override // t0.n1, t0.t1
    public void q(l0.c cVar) {
    }
}
