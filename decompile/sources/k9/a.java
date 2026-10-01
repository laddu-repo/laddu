package k9;

import android.R;
import android.content.res.ColorStateList;
import com.bumptech.glide.c;
import o.z;
import p8.b;
import p8.k;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class a extends z {
    public static final int B = k.Widget_MaterialComponents_CompoundButton_RadioButton;
    public static final int[][] C = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public boolean A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ColorStateList f7863z;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f7863z == null) {
            int iO = c.o(this, g.a.colorControlActivated);
            int iO2 = c.o(this, b.colorOnSurface);
            int iO3 = c.o(this, b.colorSurface);
            this.f7863z = new ColorStateList(C, new int[]{c.A(1.0f, iO3, iO), c.A(0.54f, iO3, iO2), c.A(0.38f, iO3, iO2), c.A(0.38f, iO3, iO2)});
        }
        return this.f7863z;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.A && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z2) {
        this.A = z2;
        if (z2) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }
}
