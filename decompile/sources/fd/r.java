package fd;

import com.playfy.tv.activities.MainActivity;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class r implements ve.a {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f5208x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ MainActivity f5209y;

    public /* synthetic */ r(MainActivity mainActivity, int i6) {
        this.f5208x = i6;
        this.f5209y = mainActivity;
    }

    @Override // ve.a
    public final Object invoke() {
        switch (this.f5208x) {
            case 0:
                return a8.b.f(this.f5209y).a(kotlin.jvm.internal.x.a(id.h.class), null);
            case 1:
                return this.f5209y.getDefaultViewModelProviderFactory();
            case 2:
                return this.f5209y.getViewModelStore();
            default:
                return this.f5209y.getDefaultViewModelCreationExtras();
        }
    }
}
