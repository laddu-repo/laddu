package nd;

import android.os.Bundle;
import android.widget.TextView;
import com.playfy.tv.R;
import com.playfy.tv.ui.fragments.PlaylistsFragment;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class b0 implements ve.l {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f9678x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ PlaylistsFragment f9679y;

    public /* synthetic */ b0(PlaylistsFragment playlistsFragment, int i6) {
        this.f9678x = i6;
        this.f9679y = playlistsFragment;
    }

    @Override // ve.l
    public final Object invoke(Object obj) {
        int i6;
        int i10 = this.f9678x;
        he.y yVar = he.y.f6101a;
        PlaylistsFragment playlistsFragment = this.f9679y;
        switch (i10) {
            case 0:
                List list = (List) obj;
                bf.o[] oVarArr = PlaylistsFragment.D0;
                TextView textView = playlistsFragment.N().f3297b;
                if (list.isEmpty()) {
                    i6 = 0;
                } else {
                    i6 = 8;
                }
                textView.setVisibility(i6);
                ((gd.x) playlistsFragment.B0.getValue()).i(list);
                return yVar;
            default:
                kd.d0 it = (kd.d0) obj;
                bf.o[] oVarArr2 = PlaylistsFragment.D0;
                kotlin.jvm.internal.k.e(it, "it");
                l4.x k8 = a8.e.k(playlistsFragment);
                String title = it.f7846b;
                String path = it.f7847c;
                kotlin.jvm.internal.k.e(title, "title");
                kotlin.jvm.internal.k.e(path, "path");
                k8.getClass();
                Bundle bundle = new Bundle();
                bundle.putString("title", title);
                bundle.putString("path", path);
                k8.c(R.id.action_playlistsFragment_to_playlistFragment, bundle, null);
                return yVar;
        }
    }
}
