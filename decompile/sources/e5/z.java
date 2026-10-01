package e5;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e0 f4842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f4843b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f4842a = new f0();
        } else {
            f4842a = new e0();
        }
        f4843b = new b(Float.class, "translationAlpha", 5);
        new b(Rect.class, "clipBounds", 6);
    }

    public static void a(View view, int i, int i10, int i11, int i12) {
        f4842a.R(view, i, i10, i11, i12);
    }

    public static void b(View view, int i) {
        f4842a.J(view, i);
    }
}
