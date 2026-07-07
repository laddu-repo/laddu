package fd;

import android.content.Context;
import android.content.SharedPreferences;
import android.media.AudioManager;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageButton;
import androidx.lifecycle.d1;
import com.playfy.tv.activities.MainActivity;
import com.playfy.tv.activities.PlayerActivity;
import com.playfy.tv.ui.fragments.PlaylistsFragment;
import od.k0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements View.OnClickListener {
    public final /* synthetic */ Object A;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f5187x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f5188y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f5189z;

    public /* synthetic */ h(PlaylistsFragment playlistsFragment, kd.d0 d0Var, i.h hVar) {
        this.f5187x = 3;
        this.f5189z = playlistsFragment;
        this.A = d0Var;
        this.f5188y = hVar;
    }

    /* JADX WARN: Type inference failed for: r8v12, types: [he.f, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z10;
        int i6;
        int i10 = this.f5187x;
        int i11 = 0;
        Object obj = this.f5188y;
        Object obj2 = this.A;
        Object obj3 = this.f5189z;
        switch (i10) {
            case 0:
                bf.o[] oVarArr = MainActivity.J;
                ((i.h) obj).dismiss();
                String string = ((SharedPreferences) obj2).getString("telegram", "https://t.me/+YJMkvc9WBsRjMDdl");
                kotlin.jvm.internal.k.b(string);
                cf.m.y((MainActivity) obj3, string, false);
                return;
            case 1:
                PlayerActivity playerActivity = (PlayerActivity) obj;
                kotlin.jvm.internal.u uVar = (kotlin.jvm.internal.u) obj3;
                ImageButton imageButton = (ImageButton) obj2;
                bf.o[] oVarArr2 = PlayerActivity.V;
                int streamVolume = playerActivity.X().getStreamVolume(3);
                if (streamVolume <= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                AudioManager X = playerActivity.X();
                if (z10) {
                    i6 = uVar.f8053x;
                } else {
                    i6 = 0;
                }
                X.setStreamVolume(3, i6, 0);
                uVar.f8053x = streamVolume;
                imageButton.setSelected(z10);
                return;
            case 2:
                gd.p pVar = (gd.p) obj3;
                View view2 = (View) obj2;
                int b10 = ((gd.k) obj).b();
                if (b10 != -1) {
                    Object h4 = pVar.h(b10);
                    if (h4 instanceof kd.l) {
                        Context context = view2.getContext();
                        kotlin.jvm.internal.k.d(context, "getContext(...)");
                        kd.l lVar = (kd.l) h4;
                        gd.p.j(pVar, context, String.valueOf(lVar.f7876x), lVar.A, (Parcelable) h4);
                        return;
                    }
                    return;
                }
                return;
            default:
                kd.d0 m3UPlaylist = (kd.d0) obj2;
                bf.o[] oVarArr3 = PlaylistsFragment.D0;
                k0 k0Var = (k0) ((PlaylistsFragment) obj3).A0.getValue();
                k0Var.getClass();
                kotlin.jvm.internal.k.e(m3UPlaylist, "m3UPlaylist");
                gf.f0.w(d1.g(k0Var), null, new od.j0(k0Var, m3UPlaylist, null, i11), 3);
                ((i.h) obj).dismiss();
                return;
        }
    }

    public /* synthetic */ h(Object obj, Object obj2, Object obj3, int i6) {
        this.f5187x = i6;
        this.f5188y = obj;
        this.f5189z = obj2;
        this.A = obj3;
    }
}
