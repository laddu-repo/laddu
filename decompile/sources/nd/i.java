package nd;

import com.playfy.tv.ui.fragments.ChannelsFragment;
import com.playfy.tv.ui.fragments.FavFragment;
import com.playfy.tv.ui.fragments.PlaylistsFragment;
import od.k0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i implements ve.a {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f9700x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ j1.y f9701y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ ve.a f9702z;

    public /* synthetic */ i(j1.y yVar, ve.a aVar, int i6) {
        this.f9700x = i6;
        this.f9701y = yVar;
        this.f9702z = aVar;
    }

    @Override // ve.a
    public final Object invoke() {
        switch (this.f9700x) {
            case 0:
                ChannelsFragment channelsFragment = (ChannelsFragment) this.f9701y;
                return k6.e.n(kotlin.jvm.internal.x.a(od.q.class), ((ChannelsFragment) ((fd.d) this.f9702z).f5171y).getViewModelStore(), channelsFragment.getDefaultViewModelCreationExtras(), a8.b.f(channelsFragment));
            case 1:
                FavFragment favFragment = (FavFragment) this.f9701y;
                return k6.e.n(kotlin.jvm.internal.x.a(od.u.class), ((FavFragment) ((fd.d) this.f9702z).f5171y).getViewModelStore(), favFragment.getDefaultViewModelCreationExtras(), a8.b.f(favFragment));
            default:
                PlaylistsFragment playlistsFragment = (PlaylistsFragment) this.f9701y;
                return k6.e.n(kotlin.jvm.internal.x.a(k0.class), ((PlaylistsFragment) ((fd.d) this.f9702z).f5171y).getViewModelStore(), playlistsFragment.getDefaultViewModelCreationExtras(), a8.b.f(playlistsFragment));
        }
    }
}
