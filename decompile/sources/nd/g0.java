package nd;

import android.content.SharedPreferences;
import com.playfy.tv.ui.fragments.SettingsFragment;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g0 implements ve.a {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f9695x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ SettingsFragment f9696y;

    public /* synthetic */ g0(SettingsFragment settingsFragment, int i6) {
        this.f9695x = i6;
        this.f9696y = settingsFragment;
    }

    @Override // ve.a
    public final Object invoke() {
        switch (this.f9695x) {
            case 0:
                return a8.b.f(this.f9696y).a(kotlin.jvm.internal.x.a(SharedPreferences.class), null);
            default:
                return a8.b.f(this.f9696y).a(kotlin.jvm.internal.x.a(xf.c.class), null);
        }
    }
}
