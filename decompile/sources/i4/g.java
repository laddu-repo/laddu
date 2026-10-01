package i4;

import android.os.Bundle;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: f, reason: collision with root package name */
    public static final String f6353f;

    /* renamed from: g, reason: collision with root package name */
    public static final String f6354g;

    /* renamed from: h, reason: collision with root package name */
    public static final String f6355h;

    /* renamed from: i, reason: collision with root package name */
    public static final String f6356i;
    public static final String j;

    /* renamed from: k, reason: collision with root package name */
    public static final String f6357k;

    /* renamed from: a, reason: collision with root package name */
    public final int f6358a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6359b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6360c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6361d;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f6362e;

    static {
        String str = u1.a0.f12750a;
        f6353f = Integer.toString(0, 36);
        f6354g = Integer.toString(1, 36);
        f6355h = Integer.toString(2, 36);
        f6356i = Integer.toString(3, 36);
        j = Integer.toString(4, 36);
        f6357k = Integer.toString(5, 36);
    }

    public g(int i6, int i10, String str, int i11, Bundle bundle, int i12) {
        this.f6358a = i6;
        this.f6359b = i10;
        this.f6360c = str;
        this.f6361d = i11;
        this.f6362e = bundle;
    }

    public static g a(Bundle bundle) {
        int i6 = bundle.getInt(f6353f, 0);
        int i10 = bundle.getInt(j, 0);
        String string = bundle.getString(f6354g);
        string.getClass();
        String str = f6355h;
        u1.c.b(bundle.containsKey(str));
        int i11 = bundle.getInt(str);
        Bundle bundle2 = bundle.getBundle(f6356i);
        int i12 = bundle.getInt(f6357k, 0);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new g(i6, i10, string, i11, bundle2, i12);
    }
}
