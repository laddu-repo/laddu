package p;

import androidx.appcompat.widget.Toolbar;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class f3 implements Runnable {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f10241x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Toolbar f10242y;

    public /* synthetic */ f3(Toolbar toolbar, int i6) {
        this.f10241x = i6;
        this.f10242y = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10241x) {
            case 0:
                this.f10242y.c();
                return;
            default:
                this.f10242y.n();
                return;
        }
    }
}
