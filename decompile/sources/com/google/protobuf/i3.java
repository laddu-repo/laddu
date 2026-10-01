package com.google.protobuf;

import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i3 {

    /* renamed from: c, reason: collision with root package name */
    public static final i3 f2941c = new i3();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f2943b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final n2 f2942a = new n2(0);

    public final q3 a(Class cls) {
        q3 B;
        Class cls2;
        Internal.checkNotNull(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f2943b;
        q3 q3Var = (q3) concurrentHashMap.get(cls);
        if (q3Var == null) {
            n2 n2Var = this.f2942a;
            n2Var.getClass();
            Class cls3 = r3.f3036a;
            if (!GeneratedMessageLite.class.isAssignableFrom(cls) && (cls2 = r3.f3036a) != null && !cls2.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
            }
            s2 a10 = ((t2) n2Var.f2995a).a(cls);
            if (a10.a()) {
                if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
                    B = new x2(r3.f3038c, y0.f3119a, a10.b());
                } else {
                    j4 j4Var = r3.f3037b;
                    v0 v0Var = y0.f3120b;
                    if (v0Var != null) {
                        B = new x2(j4Var, v0Var, a10.b());
                    } else {
                        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                    }
                }
            } else if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
                if (l2.f2982a[a10.getSyntax().ordinal()] != 1) {
                    B = w2.B(a10, b3.f2875b, i2.f2940b, r3.f3038c, y0.f3119a, r2.f3035b);
                } else {
                    B = w2.B(a10, b3.f2875b, i2.f2940b, r3.f3038c, null, r2.f3035b);
                }
            } else if (l2.f2982a[a10.getSyntax().ordinal()] != 1) {
                a3 a3Var = b3.f2874a;
                g2 g2Var = i2.f2939a;
                j4 j4Var2 = r3.f3037b;
                v0 v0Var2 = y0.f3120b;
                if (v0Var2 != null) {
                    B = w2.B(a10, a3Var, g2Var, j4Var2, v0Var2, r2.f3034a);
                } else {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
            } else {
                B = w2.B(a10, b3.f2874a, i2.f2939a, r3.f3037b, null, r2.f3034a);
            }
            Internal.checkNotNull(cls, "messageType");
            Internal.checkNotNull(B, "schema");
            q3 q3Var2 = (q3) concurrentHashMap.putIfAbsent(cls, B);
            if (q3Var2 != null) {
                return q3Var2;
            }
            return B;
        }
        return q3Var;
    }
}
