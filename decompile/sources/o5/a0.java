package o5;

import android.view.ViewGroup;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class a0 {
    public static int a(ViewGroup viewGroup, int i6) {
        return viewGroup.getChildDrawingOrder(i6);
    }

    public static void b(ViewGroup viewGroup, boolean z10) {
        viewGroup.suppressLayout(z10);
    }
}
