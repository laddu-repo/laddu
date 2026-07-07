package d1;

import android.view.View;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d extends c9.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3665d;

    public /* synthetic */ d(int i6) {
        this.f3665d = i6;
    }

    @Override // c9.a
    public final float i(Object obj) {
        switch (this.f3665d) {
            case 0:
                return ((View) obj).getAlpha();
            case 1:
                return ((View) obj).getScaleX();
            case 2:
                return ((View) obj).getScaleY();
            case 3:
                return ((View) obj).getRotation();
            case 4:
                return ((View) obj).getRotationX();
            default:
                return ((View) obj).getRotationY();
        }
    }

    @Override // c9.a
    public final void u(Object obj, float f3) {
        switch (this.f3665d) {
            case 0:
                ((View) obj).setAlpha(f3);
                return;
            case 1:
                ((View) obj).setScaleX(f3);
                return;
            case 2:
                ((View) obj).setScaleY(f3);
                return;
            case 3:
                ((View) obj).setRotation(f3);
                return;
            case 4:
                ((View) obj).setRotationX(f3);
                return;
            default:
                ((View) obj).setRotationY(f3);
                return;
        }
    }
}
