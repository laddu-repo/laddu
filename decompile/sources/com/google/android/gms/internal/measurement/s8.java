package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class s8 implements r8 {

    /* renamed from: a, reason: collision with root package name */
    public static final o4 f2419a;

    /* renamed from: b, reason: collision with root package name */
    public static final o4 f2420b;

    /* renamed from: c, reason: collision with root package name */
    public static final o4 f2421c;

    /* renamed from: d, reason: collision with root package name */
    public static final o4 f2422d;

    /* renamed from: e, reason: collision with root package name */
    public static final o4 f2423e;

    /* renamed from: f, reason: collision with root package name */
    public static final o4 f2424f;

    static {
        p4 p4Var = new p4(n4.a(), true, true);
        f2419a = p4Var.q("measurement.test.boolean_flag", false);
        f2420b = p4Var.p("measurement.test.cached_long_flag", -1L);
        Double valueOf = Double.valueOf(-3.0d);
        Object obj = o4.f2371g;
        f2421c = new o4(p4Var, "measurement.test.double_flag", valueOf, 2);
        f2422d = p4Var.p("measurement.test.int_flag", -2L);
        f2423e = p4Var.p("measurement.test.long_flag", -1L);
        f2424f = p4Var.r("measurement.test.string_flag", "---");
    }
}
