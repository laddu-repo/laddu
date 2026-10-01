package i4;

import android.os.Bundle;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final String f6467a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f6468b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f6469c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f6470d;

    static {
        String str = u1.a0.f12750a;
        f6467a = Integer.toString(0, 36);
        f6468b = Integer.toString(1, 36);
        f6469c = Integer.toString(2, 36);
        f6470d = Integer.toString(3, 36);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, i4.o] */
    public static o a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(f6467a);
        bundle.getBoolean(f6468b, false);
        bundle.getBoolean(f6469c, false);
        bundle.getBoolean(f6470d, false);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        ?? obj = new Object();
        new Bundle(bundle2);
        return obj;
    }
}
