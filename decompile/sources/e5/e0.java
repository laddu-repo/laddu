package e5;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public class e0 extends android.support.v4.media.session.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f4794e = true;
    public static boolean f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f4795g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f4796h = true;

    @Override // android.support.v4.media.session.b
    public void J(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.J(view, i);
        } else if (f4796h) {
            try {
                d0.a(view, i);
            } catch (NoSuchMethodError unused) {
                f4796h = false;
            }
        }
    }

    public void R(View view, int i, int i10, int i11, int i12) {
        if (f4795g) {
            try {
                c0.a(view, i, i10, i11, i12);
            } catch (NoSuchMethodError unused) {
                f4795g = false;
            }
        }
    }

    public void S(View view, Matrix matrix) {
        if (f4794e) {
            try {
                b0.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                f4794e = false;
            }
        }
    }

    public void T(View view, Matrix matrix) {
        if (f) {
            try {
                b0.c(view, matrix);
            } catch (NoSuchMethodError unused) {
                f = false;
            }
        }
    }
}
