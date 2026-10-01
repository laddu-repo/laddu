package ea;

import a2.a2;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import bf.o;
import com.google.android.material.chip.Chip;
import com.playfy.tv.databinding.InputLyBinding;
import com.playfy.tv.ui.fragments.SettingsFragment;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4503a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4504b;

    public /* synthetic */ a(Object obj, int i6) {
        this.f4503a = i6;
        this.f4504b = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        int i6;
        int i10 = this.f4503a;
        Object obj = this.f4504b;
        switch (i10) {
            case 0:
                Chip chip = (Chip) obj;
                ma.g gVar = chip.G;
                if (gVar != null) {
                    ma.a aVar = (ma.a) ((a2) gVar).f162y;
                    if (!z10 ? aVar.e(chip, aVar.f8727e) : aVar.a(chip)) {
                        aVar.d();
                    }
                }
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = chip.F;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z10);
                    return;
                }
                return;
            default:
                o[] oVarArr = SettingsFragment.E0;
                k.e(compoundButton, "<unused var>");
                LinearLayout advContainer = ((InputLyBinding) obj).f3310c;
                k.d(advContainer, "advContainer");
                if (z10) {
                    i6 = 0;
                } else {
                    i6 = 8;
                }
                advContainer.setVisibility(i6);
                return;
        }
    }
}
