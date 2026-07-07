package pa;

import android.os.SystemClock;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f10625x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ d f10626y;

    public /* synthetic */ b(d dVar, int i6) {
        this.f10625x = i6;
        this.f10626y = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10625x) {
            case 0:
                d dVar = this.f10626y;
                if (dVar.A > 0) {
                    SystemClock.uptimeMillis();
                }
                dVar.setVisibility(0);
                return;
            default:
                d dVar2 = this.f10626y;
                ((o) dVar2.getCurrentDrawable()).d(false, false, true);
                if ((dVar2.getProgressDrawable() == null || !dVar2.getProgressDrawable().isVisible()) && (dVar2.getIndeterminateDrawable() == null || !dVar2.getIndeterminateDrawable().isVisible())) {
                    dVar2.setVisibility(4);
                }
                dVar2.getClass();
                return;
        }
    }
}
