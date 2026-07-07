package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class k5 implements e6 {

    /* renamed from: b, reason: collision with root package name */
    public static final k5 f2320b = new k5(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2321a;

    public /* synthetic */ k5(int i6) {
        this.f2321a = i6;
    }

    public static final c6 c(Object obj, Object obj2) {
        c6 c6Var = (c6) obj;
        c6 c6Var2 = (c6) obj2;
        if (!c6Var2.isEmpty()) {
            if (!c6Var.f2170x) {
                c6Var = c6Var.a();
            }
            c6Var.c();
            if (!c6Var2.isEmpty()) {
                c6Var.putAll(c6Var2);
            }
        }
        return c6Var;
    }

    @Override // com.google.android.gms.internal.measurement.e6
    public boolean a(Class cls) {
        switch (this.f2321a) {
            case 0:
                return m5.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.internal.measurement.e6
    public m6 b(Class cls) {
        switch (this.f2321a) {
            case 0:
                if (m5.class.isAssignableFrom(cls)) {
                    try {
                        return (m6) m5.l(cls.asSubclass(m5.class)).o(3);
                    } catch (Exception e10) {
                        throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
                    }
                }
                throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }
}
