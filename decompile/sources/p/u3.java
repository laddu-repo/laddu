package p;

import android.os.Build;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class u3 {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f10392a;

    /* renamed from: b, reason: collision with root package name */
    public static Method f10393b;

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f10394c;

    static {
        boolean z10;
        if (Build.VERSION.SDK_INT >= 27) {
            z10 = true;
        } else {
            z10 = false;
        }
        f10394c = z10;
    }
}
