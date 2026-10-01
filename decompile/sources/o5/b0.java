package o5;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final e0 f9938a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f9939b;

    /* JADX WARN: Type inference failed for: r0v1, types: [o5.e0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [o5.e0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [o5.e0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [o5.e0, java.lang.Object] */
    static {
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 29) {
            f9938a = new Object();
        } else if (i6 >= 23) {
            f9938a = new Object();
        } else if (i6 >= 22) {
            f9938a = new Object();
        } else {
            f9938a = new Object();
        }
        f9939b = new b(Float.class, "translationAlpha", 5);
        new b(Rect.class, "clipBounds", 6);
    }

    public static void a(View view, int i6, int i10, int i11, int i12) {
        f9938a.k(view, i6, i10, i11, i12);
    }

    public static void b(View view, int i6) {
        f9938a.n(view, i6);
    }
}
