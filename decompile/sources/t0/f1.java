package t0;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f1 extends l1 {

    /* renamed from: e, reason: collision with root package name */
    public static Field f12344e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f12345f = false;

    /* renamed from: g, reason: collision with root package name */
    public static Constructor f12346g = null;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f12347h = false;

    /* renamed from: c, reason: collision with root package name */
    public WindowInsets f12348c;

    /* renamed from: d, reason: collision with root package name */
    public l0.c f12349d;

    public f1() {
        this.f12348c = i();
    }

    private static WindowInsets i() {
        if (!f12345f) {
            try {
                f12344e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e10) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e10);
            }
            f12345f = true;
        }
        Field field = f12344e;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e11) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e11);
            }
        }
        if (!f12347h) {
            try {
                f12346g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e12) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e12);
            }
            f12347h = true;
        }
        Constructor constructor = f12346g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e13) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e13);
            }
        }
        return null;
    }

    @Override // t0.l1
    public w1 b() {
        a();
        w1 h4 = w1.h(null, this.f12348c);
        l0.c[] cVarArr = this.f12370b;
        t1 t1Var = h4.f12417a;
        t1Var.o(cVarArr);
        t1Var.q(this.f12349d);
        return h4;
    }

    @Override // t0.l1
    public void e(l0.c cVar) {
        this.f12349d = cVar;
    }

    @Override // t0.l1
    public void g(l0.c cVar) {
        WindowInsets windowInsets = this.f12348c;
        if (windowInsets != null) {
            this.f12348c = windowInsets.replaceSystemWindowInsets(cVar.f8062a, cVar.f8063b, cVar.f8064c, cVar.f8065d);
        }
    }

    public f1(w1 w1Var) {
        super(w1Var);
        this.f12348c = w1Var.g();
    }
}
