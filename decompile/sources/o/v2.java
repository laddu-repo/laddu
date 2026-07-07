package o;

import android.os.Build;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class v2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Method f9321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Method f9322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Method f9323c;

    public v2(Method method, Method method2, Method method3) {
        this.f9321a = method;
        this.f9322b = method2;
        this.f9323c = method3;
    }

    public static void a() {
        if (Build.VERSION.SDK_INT >= 29) {
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }
    }
}
