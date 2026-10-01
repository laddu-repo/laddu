package o5;

import android.graphics.Matrix;
import android.view.View;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j0 extends i0 {
    @Override // o5.e0
    public final float j(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // o5.g0, o5.e0
    public final void k(View view, int i6, int i10, int i11, int i12) {
        view.setLeftTopRightBottom(i6, i10, i11, i12);
    }

    @Override // o5.e0
    public final void m(View view, float f3) {
        view.setTransitionAlpha(f3);
    }

    @Override // o5.i0, o5.e0
    public final void n(View view, int i6) {
        view.setTransitionVisibility(i6);
    }

    @Override // o5.e0
    public final void p(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // o5.e0
    public final void q(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
