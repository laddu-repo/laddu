package p;

import android.view.View;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h implements Runnable {

    /* renamed from: x, reason: collision with root package name */
    public final f f10261x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ j f10262y;

    public h(j jVar, f fVar) {
        this.f10262y = jVar;
        this.f10261x = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o.j jVar;
        j jVar2 = this.f10262y;
        o.l lVar = jVar2.f10273z;
        if (lVar != null && (jVar = lVar.f9780e) != null) {
            jVar.G(lVar);
        }
        View view = (View) jVar2.E;
        if (view != null && view.getWindowToken() != null) {
            f fVar = this.f10261x;
            if (!fVar.b()) {
                if (fVar.f9841e != null) {
                    fVar.d(0, 0, false, false);
                }
            }
            jVar2.P = fVar;
        }
        jVar2.R = null;
    }
}
