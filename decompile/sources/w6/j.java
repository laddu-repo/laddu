package w6;

import android.view.ViewTreeObserver;
import he.y;
import ve.l;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j implements l {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ f f14137x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserver f14138y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ k f14139z;

    public j(f fVar, ViewTreeObserver viewTreeObserver, k kVar) {
        this.f14137x = fVar;
        this.f14138y = viewTreeObserver;
        this.f14139z = kVar;
    }

    @Override // ve.l
    public final Object invoke(Object obj) {
        ViewTreeObserver viewTreeObserver = this.f14138y;
        boolean isAlive = viewTreeObserver.isAlive();
        k kVar = this.f14139z;
        if (isAlive) {
            viewTreeObserver.removeOnPreDrawListener(kVar);
        } else {
            this.f14137x.f14130a.getViewTreeObserver().removeOnPreDrawListener(kVar);
        }
        return y.f6101a;
    }
}
