package e5;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends e0 {
    @Override // android.support.v4.media.session.b
    public final void I(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // e5.e0, android.support.v4.media.session.b
    public final void J(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // e5.e0
    public final void R(View view, int i, int i10, int i11, int i12) {
        view.setLeftTopRightBottom(i, i10, i11, i12);
    }

    @Override // e5.e0
    public final void S(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // e5.e0
    public final void T(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    @Override // android.support.v4.media.session.b
    public final float w(View view) {
        return view.getTransitionAlpha();
    }
}
