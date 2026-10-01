package w6;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class k implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ gf.k A;

    /* renamed from: x, reason: collision with root package name */
    public boolean f14140x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ f f14141y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserver f14142z;

    public k(f fVar, ViewTreeObserver viewTreeObserver, gf.k kVar) {
        this.f14141y = fVar;
        this.f14142z = viewTreeObserver;
        this.A = kVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        f fVar = this.f14141y;
        h c10 = h8.c.c(fVar);
        if (c10 != null) {
            ViewTreeObserver viewTreeObserver = this.f14142z;
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this);
            } else {
                fVar.f14130a.getViewTreeObserver().removeOnPreDrawListener(this);
            }
            if (!this.f14140x) {
                this.f14140x = true;
                this.A.resumeWith(c10);
            }
        }
        return true;
    }
}
