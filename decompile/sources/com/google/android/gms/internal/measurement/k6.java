package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class k6 {

    /* renamed from: c, reason: collision with root package name */
    public static final k6 f2322c = new k6();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f2324b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final a6 f2323a = new a6(0);

    public final n6 a(Class cls) {
        k5 k5Var;
        n6 u3;
        Charset charset = t5.f2444a;
        if (cls != null) {
            ConcurrentHashMap concurrentHashMap = this.f2324b;
            n6 n6Var = (n6) concurrentHashMap.get(cls);
            if (n6Var == null) {
                a6 a6Var = this.f2323a;
                a6Var.getClass();
                k5 k5Var2 = o6.f2380a;
                m5.class.isAssignableFrom(cls);
                m6 b10 = ((a6) a6Var.f2145a).b(cls);
                if ((b10.f2348d & 2) == 2) {
                    k5 k5Var3 = o6.f2380a;
                    k5 k5Var4 = g5.f2225a;
                    u3 = new h6(k5Var3, b10.f2345a);
                } else {
                    int i6 = i6.f2260a;
                    int i10 = x5.f2521a;
                    k5 k5Var5 = o6.f2380a;
                    if (b10.a() - 1 != 1) {
                        k5Var = g5.f2225a;
                    } else {
                        k5Var = null;
                    }
                    int i11 = d6.f2187a;
                    u3 = g6.u(b10, k5Var5, k5Var);
                }
                n6 n6Var2 = (n6) concurrentHashMap.putIfAbsent(cls, u3);
                if (n6Var2 != null) {
                    return n6Var2;
                }
                return u3;
            }
            return n6Var;
        }
        throw new NullPointerException("messageType");
    }
}
