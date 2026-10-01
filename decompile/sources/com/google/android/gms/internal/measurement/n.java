package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public interface n {

    /* renamed from: a, reason: collision with root package name */
    public static final r f2352a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final l f2353b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static final f f2354c = new f("continue");

    /* renamed from: d, reason: collision with root package name */
    public static final f f2355d = new f("break");

    /* renamed from: e, reason: collision with root package name */
    public static final f f2356e = new f("return");

    /* renamed from: f, reason: collision with root package name */
    public static final e f2357f = new e(Boolean.TRUE);

    /* renamed from: g, reason: collision with root package name */
    public static final e f2358g = new e(Boolean.FALSE);

    /* renamed from: h, reason: collision with root package name */
    public static final q f2359h = new q(HttpUrl.FRAGMENT_ENCODE_SET);

    Double b();

    Boolean e();

    String f();

    Iterator g();

    n h(String str, ic.s sVar, ArrayList arrayList);

    n j();
}
