package fd;

import com.playfy.tv.R;
import com.playfy.tv.activities.FullBannerActivity;
import com.playfy.tv.activities.PlayerActivity;
import com.playfy.tv.ui.fragments.ChannelsFragment;
import com.playfy.tv.ui.fragments.FavFragment;
import com.playfy.tv.ui.fragments.PlaylistFragment;
import com.playfy.tv.ui.fragments.PlaylistsFragment;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d implements ve.a {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f5170x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f5171y;

    public /* synthetic */ d(Object obj, int i6) {
        this.f5170x = i6;
        this.f5171y = obj;
    }

    @Override // ve.a
    public final Object invoke() {
        switch (this.f5170x) {
            case 0:
                return a8.b.f((FullBannerActivity) this.f5171y).a(kotlin.jvm.internal.x.a(id.h.class), null);
            case 1:
                PlayerActivity playerActivity = (PlayerActivity) this.f5171y;
                return k6.e.n(kotlin.jvm.internal.x.a(od.c0.class), playerActivity.getViewModelStore(), playerActivity.getDefaultViewModelCreationExtras(), a8.b.f(playerActivity));
            case 2:
                return (ChannelsFragment) this.f5171y;
            case 3:
                return (FavFragment) this.f5171y;
            case 4:
                return a8.e.k((PlaylistFragment) this.f5171y).f8199b.e(R.id.playlist_nav);
            default:
                return (PlaylistsFragment) this.f5171y;
        }
    }
}
