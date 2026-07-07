package com.google.protobuf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f2961a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final Class f2962b;

    /* renamed from: c, reason: collision with root package name */
    public static final long f2963c;

    static {
        Class<?> cls;
        long n10;
        try {
            cls = Class.forName("java.io.FileOutputStream");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        f2962b = cls;
        if (cls != null) {
            if (q4.f3026e) {
                n10 = q4.f3024c.n(cls.getDeclaredField("channel"));
                f2963c = n10;
            }
        }
        n10 = -1;
        f2963c = n10;
    }
}
