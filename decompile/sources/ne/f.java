package ne;

import android.os.Build;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public Method f9730a;

    /* renamed from: b, reason: collision with root package name */
    public Method f9731b;

    /* renamed from: c, reason: collision with root package name */
    public Method f9732c;

    public f(Method method, Method method2, Method method3) {
        this.f9730a = method;
        this.f9731b = method2;
        this.f9732c = method3;
    }

    public static void a() {
        if (Build.VERSION.SDK_INT < 29) {
        } else {
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }
    }
}
