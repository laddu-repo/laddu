package ma;

import android.widget.ImageButton;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class q extends ImageButton {

    /* renamed from: x, reason: collision with root package name */
    public int f8797x;

    public final void a(int i6, boolean z10) {
        super.setVisibility(i6);
        if (z10) {
            this.f8797x = i6;
        }
    }

    public final int getUserSetVisibility() {
        return this.f8797x;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i6) {
        a(i6, true);
    }
}
