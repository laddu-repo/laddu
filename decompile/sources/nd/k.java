package nd;

import com.playfy.tv.ui.fragments.EventsFragment;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class k extends kotlin.jvm.internal.l implements ve.a {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f9703x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ EventsFragment f9704y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(EventsFragment eventsFragment, int i6) {
        super(0);
        this.f9703x = i6;
        this.f9704y = eventsFragment;
    }

    @Override // ve.a
    public final Object invoke() {
        switch (this.f9703x) {
            case 0:
                return this.f9704y.E().getViewModelStore();
            case 1:
                return this.f9704y.E().getDefaultViewModelCreationExtras();
            default:
                return this.f9704y.E().getDefaultViewModelProviderFactory();
        }
    }
}
