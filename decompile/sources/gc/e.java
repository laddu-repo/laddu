package gc;

import android.content.Intent;
import android.provider.Settings;
import com.google.android.material.appbar.MaterialToolbar;
import com.livxow.tv.activities.MainActivity;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements nc.c, ic.a, e.b {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ MainActivity f5803v;

    public /* synthetic */ e(MainActivity mainActivity) {
        this.f5803v = mainActivity;
    }

    @Override // ic.a
    public void c(String str) {
        MainActivity mainActivity = this.f5803v;
        ((MaterialToolbar) mainActivity.W.A).setTitle(str);
        if (str.equals(mainActivity.X) || str.equals("Categories") || str.equals("Sports") || str.equals("Highlights") || str.equals("Menu")) {
            if (mainActivity.Y) {
                com.bumptech.glide.f fVarN = mainActivity.n();
                Objects.requireNonNull(fVarN);
                fVarN.O(false);
                mainActivity.Y = false;
                return;
            }
            return;
        }
        if (mainActivity.Z) {
            return;
        }
        com.bumptech.glide.f fVarN2 = mainActivity.n();
        Objects.requireNonNull(fVarN2);
        fVarN2.O(true);
        ((MaterialToolbar) mainActivity.W.A).setNavigationOnClickListener(new com.google.android.material.datepicker.n(6, mainActivity));
        mainActivity.Y = true;
    }

    @Override // nc.c
    public void g(int i) {
        int i10 = MainActivity.f3631i0;
        int i11 = fc.l.nav_settings;
        MainActivity mainActivity = this.f5803v;
        ((MaterialToolbar) mainActivity.W.A).setTitle(i == i11 ? "Menu" : i == fc.l.nav_highlights ? "Highlights" : i == fc.l.nav_sports ? "Sports" : i == fc.l.nav_cats ? "Categories" : mainActivity.X);
        if (mainActivity.Y) {
            com.bumptech.glide.f fVarN = mainActivity.n();
            Objects.requireNonNull(fVarN);
            fVarN.O(false);
            mainActivity.Y = false;
        }
    }

    @Override // e.b
    public void i(Object obj) {
        androidx.fragment.app.e eVar = this.f5803v.f3636e0;
        if (eVar != null) {
            ((Intent) eVar.f1008w).putExtra("isPlayerActivity", !Settings.canDrawOverlays((MainActivity) eVar.f1009x));
        }
    }
}
