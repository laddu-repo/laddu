package ea;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;
import ma.k;
import ma.l;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b extends android.support.v4.media.session.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4505a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4506b;

    public /* synthetic */ b(Object obj, int i6) {
        this.f4505a = i6;
        this.f4506b = obj;
    }

    @Override // android.support.v4.media.session.b
    public final void n(int i6) {
        switch (this.f4505a) {
            case 0:
                return;
            default:
                l lVar = (l) this.f4506b;
                lVar.f8789e = true;
                k kVar = (k) lVar.f8790f.get();
                if (kVar != null) {
                    kVar.a();
                    return;
                }
                return;
        }
    }

    @Override // android.support.v4.media.session.b
    public final void o(Typeface typeface, boolean z10) {
        CharSequence text;
        switch (this.f4505a) {
            case 0:
                Chip chip = (Chip) this.f4506b;
                f fVar = chip.B;
                if (fVar.f4525j1) {
                    text = fVar.f4528l0;
                } else {
                    text = chip.getText();
                }
                chip.setText(text);
                chip.requestLayout();
                chip.invalidate();
                return;
            default:
                if (!z10) {
                    l lVar = (l) this.f4506b;
                    lVar.f8789e = true;
                    k kVar = (k) lVar.f8790f.get();
                    if (kVar != null) {
                        kVar.a();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    private final void y(int i6) {
    }
}
