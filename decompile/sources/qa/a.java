package qa;

import android.R;
import android.content.res.ColorStateList;
import jb.b;
import p.c0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a extends c0 {
    public static final int[][] D = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public ColorStateList B;
    public boolean C;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.B == null) {
            int o10 = b.o(this, com.playfy.tv.R.attr.colorControlActivated);
            int o11 = b.o(this, com.playfy.tv.R.attr.colorOnSurface);
            int o12 = b.o(this, com.playfy.tv.R.attr.colorSurface);
            this.B = new ColorStateList(D, new int[]{b.u(1.0f, o12, o10), b.u(0.54f, o12, o11), b.u(0.38f, o12, o11), b.u(0.38f, o12, o11)});
        }
        return this.B;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.C && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.C = z10;
        if (z10) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }
}
