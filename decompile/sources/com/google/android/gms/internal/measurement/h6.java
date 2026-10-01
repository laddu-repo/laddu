package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h6 implements n6 {

    /* renamed from: a, reason: collision with root package name */
    public final v4 f2246a;

    /* renamed from: b, reason: collision with root package name */
    public final k5 f2247b;

    public h6(k5 k5Var, v4 v4Var) {
        k5 k5Var2 = g5.f2225a;
        this.f2247b = k5Var;
        this.f2246a = v4Var;
    }

    @Override // com.google.android.gms.internal.measurement.n6
    public final void a(Object obj, Object obj2) {
        o6.b(obj, obj2);
    }

    @Override // com.google.android.gms.internal.measurement.n6
    public final m5 b() {
        v4 v4Var = this.f2246a;
        if (v4Var instanceof m5) {
            return (m5) ((m5) v4Var).o(4);
        }
        return ((l5) ((m5) v4Var).o(5)).d();
    }

    @Override // com.google.android.gms.internal.measurement.n6
    public final void c(Object obj, a6 a6Var) {
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.android.gms.internal.measurement.n6
    public final int d(v4 v4Var) {
        t6 t6Var = ((m5) v4Var).zzc;
        int i6 = t6Var.f2450d;
        if (i6 == -1) {
            int i10 = 0;
            for (int i11 = 0; i11 < t6Var.f2447a; i11++) {
                int i12 = t6Var.f2448b[i11] >>> 3;
                c5 c5Var = (c5) t6Var.f2449c[i11];
                int G = d5.G(8);
                int G2 = d5.G(i12) + d5.G(16);
                int G3 = d5.G(24);
                int c10 = c5Var.c();
                i10 += G + G + G2 + r4.a.g(c10, c10, G3);
            }
            t6Var.f2450d = i10;
            return i10;
        }
        return i6;
    }

    @Override // com.google.android.gms.internal.measurement.n6
    public final boolean e(Object obj) {
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.android.gms.internal.measurement.n6
    public final void f(Object obj) {
        this.f2247b.getClass();
        t6 t6Var = ((m5) obj).zzc;
        if (t6Var.f2451e) {
            t6Var.f2451e = false;
        }
        k5 k5Var = g5.f2225a;
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.android.gms.internal.measurement.n6
    public final boolean g(m5 m5Var, m5 m5Var2) {
        if (!m5Var.zzc.equals(m5Var2.zzc)) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.n6
    public final void h(Object obj, byte[] bArr, int i6, int i10, y4 y4Var) {
        m5 m5Var = (m5) obj;
        if (m5Var.zzc == t6.f2446f) {
            m5Var.zzc = t6.a();
        }
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.android.gms.internal.measurement.n6
    public final int i(m5 m5Var) {
        return m5Var.zzc.hashCode();
    }
}
