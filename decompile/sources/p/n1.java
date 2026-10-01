package p;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class n1 {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f10320a = {R.attr.state_checked};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f10321b = new int[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Rect f10322c = new Rect();

    public static void a(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i6 = Build.VERSION.SDK_INT;
        int[] iArr = f10320a;
        int[] iArr2 = f10321b;
        if (i6 == 21 && "android.graphics.drawable.VectorDrawable".equals(name)) {
            int[] state = drawable.getState();
            if (state != null && state.length != 0) {
                drawable.setState(iArr2);
            } else {
                drawable.setState(iArr);
            }
            drawable.setState(state);
            return;
        }
        if (i6 >= 29 && i6 < 31 && "android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            int[] state2 = drawable.getState();
            if (state2 != null && state2.length != 0) {
                drawable.setState(iArr2);
            } else {
                drawable.setState(iArr);
            }
            drawable.setState(state2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Rect b(Drawable drawable) {
        int i6;
        int i10;
        int i11;
        int i12;
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 29) {
            Insets a10 = m1.a(drawable);
            i6 = a10.left;
            i10 = a10.top;
            i11 = a10.right;
            i12 = a10.bottom;
            return new Rect(i6, i10, i11, i12);
        }
        boolean z10 = drawable instanceof m0.c;
        Drawable drawable2 = drawable;
        if (z10) {
            drawable2 = ((m0.d) ((m0.c) drawable)).C;
        }
        if (i13 < 29) {
            if (l1.f10284a) {
                try {
                    Object invoke = l1.f10285b.invoke(drawable2, null);
                    if (invoke != null) {
                        return new Rect(l1.f10286c.getInt(invoke), l1.f10287d.getInt(invoke), l1.f10288e.getInt(invoke), l1.f10289f.getInt(invoke));
                    }
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
        } else {
            boolean z11 = l1.f10284a;
        }
        return f10322c;
    }

    public static PorterDuff.Mode c(int i6, PorterDuff.Mode mode) {
        if (i6 != 3) {
            if (i6 != 5) {
                if (i6 != 9) {
                    switch (i6) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }
}
