package fd;

import android.view.View;
import com.playfy.tv.activities.MainActivity;
import com.playfy.tv.ui.fragments.PlaylistFragment;
import com.playfy.tv.ui.fragments.PlaylistsFragment;
import com.playfy.tv.ui.fragments.SettingsFragment;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements View.OnClickListener {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f5183x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ i.h f5184y;

    public /* synthetic */ g(i.h hVar, int i6) {
        this.f5183x = i6;
        this.f5184y = hVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = this.f5183x;
        i.h hVar = this.f5184y;
        switch (i6) {
            case 0:
                bf.o[] oVarArr = MainActivity.J;
                hVar.dismiss();
                return;
            case 1:
                bf.o[] oVarArr2 = MainActivity.J;
                hVar.dismiss();
                return;
            case 2:
                hVar.dismiss();
                return;
            case 3:
                int i10 = PlaylistFragment.F0;
                hVar.dismiss();
                return;
            case 4:
                bf.o[] oVarArr3 = PlaylistsFragment.D0;
                hVar.dismiss();
                return;
            case 5:
                bf.o[] oVarArr4 = PlaylistsFragment.D0;
                hVar.dismiss();
                return;
            case 6:
                bf.o[] oVarArr5 = SettingsFragment.E0;
                hVar.dismiss();
                return;
            case 7:
                bf.o[] oVarArr6 = SettingsFragment.E0;
                hVar.dismiss();
                return;
            case 8:
                bf.o[] oVarArr7 = SettingsFragment.E0;
                hVar.dismiss();
                return;
            case 9:
                bf.o[] oVarArr8 = SettingsFragment.E0;
                hVar.dismiss();
                return;
            case 10:
                bf.o[] oVarArr9 = SettingsFragment.E0;
                hVar.dismiss();
                return;
            case 11:
                bf.o[] oVarArr10 = SettingsFragment.E0;
                hVar.dismiss();
                return;
            case 12:
                bf.o[] oVarArr11 = SettingsFragment.E0;
                hVar.dismiss();
                return;
            default:
                bf.o[] oVarArr12 = SettingsFragment.E0;
                hVar.dismiss();
                return;
        }
    }
}
