package r1;

import java.util.HashSet;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class f0 {

    /* renamed from: a, reason: collision with root package name */
    public static final HashSet f11393a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public static String f11394b = "media3.common";

    public static synchronized void a(String str) {
        synchronized (f0.class) {
            if (f11393a.add(str)) {
                f11394b += ", " + str;
            }
        }
    }

    public static synchronized String b() {
        String str;
        synchronized (f0.class) {
            str = f11394b;
        }
        return str;
    }
}
