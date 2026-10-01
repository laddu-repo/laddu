package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class t1 implements p5 {

    /* renamed from: b, reason: collision with root package name */
    public static final t1 f2427b = new t1(0);

    /* renamed from: c, reason: collision with root package name */
    public static final t1 f2428c = new t1(1);

    /* renamed from: d, reason: collision with root package name */
    public static final t1 f2429d = new t1(2);

    /* renamed from: e, reason: collision with root package name */
    public static final t1 f2430e = new t1(3);

    /* renamed from: f, reason: collision with root package name */
    public static final t1 f2431f = new t1(4);

    /* renamed from: g, reason: collision with root package name */
    public static final t1 f2432g = new t1(5);

    /* renamed from: h, reason: collision with root package name */
    public static final t1 f2433h = new t1(6);

    /* renamed from: i, reason: collision with root package name */
    public static final t1 f2434i = new t1(7);
    public static final t1 j = new t1(8);

    /* renamed from: k, reason: collision with root package name */
    public static final t1 f2435k = new t1(9);

    /* renamed from: l, reason: collision with root package name */
    public static final t1 f2436l = new t1(10);

    /* renamed from: m, reason: collision with root package name */
    public static final t1 f2437m = new t1(11);

    /* renamed from: n, reason: collision with root package name */
    public static final t1 f2438n = new t1(12);

    /* renamed from: o, reason: collision with root package name */
    public static final t1 f2439o = new t1(13);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2440a;

    public /* synthetic */ t1(int i6) {
        this.f2440a = i6;
    }

    @Override // com.google.android.gms.internal.measurement.p5
    public final boolean a(int i6) {
        switch (this.f2440a) {
            case 0:
                if (i6 == 0 || i6 == 1 || i6 == 2 || i6 == 3 || i6 == 4) {
                    return true;
                }
                return false;
            case 1:
                switch (i6) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        return true;
                    default:
                        return false;
                }
            case 2:
                if (i6 == 0 || i6 == 1 || i6 == 2) {
                    return true;
                }
                return false;
            case 3:
                if (a.a.z(i6) != 0) {
                    return true;
                }
                return false;
            case 4:
                if (i6 == 0 || i6 == 1 || i6 == 2) {
                    return true;
                }
                return false;
            case 5:
                if (i6 == 0 || i6 == 1 || i6 == 2 || i6 == 3 || i6 == 4 || i6 == 5) {
                    return true;
                }
                return false;
            case 6:
                if (i6 == 0 || i6 == 1 || i6 == 2 || i6 == 3 || i6 == 4) {
                    return true;
                }
                return false;
            case 7:
                if (i6 == 0 || i6 == 1 || i6 == 2) {
                    return true;
                }
                return false;
            case 8:
                if (i6 == 0 || i6 == 1) {
                    return true;
                }
                return false;
            case 9:
                if (i6 == 1 || i6 == 2) {
                    return true;
                }
                return false;
            case 10:
                if (r4.a.c(i6) != 0) {
                    return true;
                }
                return false;
            case 11:
                if (i6 == 0 || i6 == 1 || i6 == 2 || i6 == 3 || i6 == 4 || i6 == 5) {
                    return true;
                }
                return false;
            case 12:
                if (i6 == 0 || i6 == 1 || i6 == 2 || i6 == 3 || i6 == 4) {
                    return true;
                }
                return false;
            default:
                if (i6 == 0 || i6 == 1 || i6 == 2 || i6 == 3 || i6 == 4) {
                    return true;
                }
                return false;
        }
    }
}
