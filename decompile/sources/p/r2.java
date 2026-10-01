package p;

import androidx.appcompat.widget.SearchView;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class r2 implements Runnable {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f10370x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ SearchView f10371y;

    public /* synthetic */ r2(SearchView searchView, int i6) {
        this.f10370x = i6;
        this.f10371y = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10370x) {
            case 0:
                this.f10371y.s();
                return;
            default:
                x0.a aVar = this.f10371y.f783p0;
                if (aVar instanceof a3) {
                    aVar.b(null);
                    return;
                }
                return;
        }
    }
}
