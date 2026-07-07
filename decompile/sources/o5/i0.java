package o5;

import android.os.Build;
import android.view.View;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class i0 extends g0 {
    public static boolean F = true;

    @Override // o5.e0
    public void n(View view, int i6) {
        if (Build.VERSION.SDK_INT == 28) {
            super.n(view, i6);
        } else if (F) {
            try {
                h0.a(view, i6);
            } catch (NoSuchMethodError unused) {
                F = false;
            }
        }
    }
}
