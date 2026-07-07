package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h5 {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f2243c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final p6 f2244a = new p6();

    /* renamed from: b, reason: collision with root package name */
    public boolean f2245b;

    static {
        new h5(0);
    }

    public h5() {
    }

    public static void b(d5 d5Var, b7 b7Var, int i6, Object obj) {
        if (b7Var != b7.A) {
            d5Var.r(i6, b7Var.f2160y);
            c7 c7Var = c7.f2171x;
            switch (b7Var.ordinal()) {
                case 0:
                    d5Var.D(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                    return;
                case 1:
                    d5Var.B(Float.floatToRawIntBits(((Float) obj).floatValue()));
                    return;
                case 2:
                    d5Var.C(((Long) obj).longValue());
                    return;
                case 3:
                    d5Var.C(((Long) obj).longValue());
                    return;
                case 4:
                    d5Var.z(((Integer) obj).intValue());
                    return;
                case 5:
                    d5Var.D(((Long) obj).longValue());
                    return;
                case 6:
                    d5Var.B(((Integer) obj).intValue());
                    return;
                case 7:
                    d5Var.y(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                    return;
                case 8:
                    if (obj instanceof c5) {
                        d5Var.x((c5) obj);
                        return;
                    } else {
                        d5Var.F((String) obj);
                        return;
                    }
                case 9:
                    ((m5) ((v4) obj)).d(d5Var);
                    return;
                case 10:
                    d5Var.getClass();
                    m5 m5Var = (m5) ((v4) obj);
                    d5Var.A(m5Var.k());
                    m5Var.d(d5Var);
                    return;
                case 11:
                    if (obj instanceof c5) {
                        d5Var.x((c5) obj);
                        return;
                    }
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    d5Var.A(length);
                    d5Var.E(length, bArr);
                    return;
                case 12:
                    d5Var.A(((Integer) obj).intValue());
                    return;
                case 13:
                    if (obj instanceof o5) {
                        d5Var.z(((o5) obj).b());
                        return;
                    } else {
                        d5Var.z(((Integer) obj).intValue());
                        return;
                    }
                case 14:
                    d5Var.B(((Integer) obj).intValue());
                    return;
                case 15:
                    d5Var.D(((Long) obj).longValue());
                    return;
                case 16:
                    int intValue = ((Integer) obj).intValue();
                    d5Var.A((intValue >> 31) ^ (intValue + intValue));
                    return;
                case 17:
                    long longValue = ((Long) obj).longValue();
                    d5Var.C((longValue >> 63) ^ (longValue + longValue));
                    return;
                default:
                    return;
            }
        }
        Charset charset = t5.f2444a;
        d5Var.r(i6, 3);
        ((m5) ((v4) obj)).d(d5Var);
        d5Var.r(i6, 4);
    }

    public final void a() {
        Map unmodifiableMap;
        Map unmodifiableMap2;
        if (this.f2245b) {
            return;
        }
        p6 p6Var = this.f2244a;
        int i6 = p6Var.f2391y;
        for (int i10 = 0; i10 < i6; i10++) {
            Object obj = p6Var.a(i10).f2399y;
            if (obj instanceof m5) {
                ((m5) obj).g();
            }
        }
        Iterator it = p6Var.b().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof m5) {
                ((m5) value).g();
            }
        }
        if (!p6Var.A) {
            if (p6Var.f2391y <= 0) {
                Iterator it2 = p6Var.b().iterator();
                if (it2.hasNext()) {
                    ((Map.Entry) it2.next()).getKey().getClass();
                    throw new ClassCastException();
                }
            } else {
                p6Var.a(0).f2398x.getClass();
                throw new ClassCastException();
            }
        }
        if (!p6Var.A) {
            if (p6Var.f2392z.isEmpty()) {
                unmodifiableMap = Collections.EMPTY_MAP;
            } else {
                unmodifiableMap = Collections.unmodifiableMap(p6Var.f2392z);
            }
            p6Var.f2392z = unmodifiableMap;
            if (p6Var.C.isEmpty()) {
                unmodifiableMap2 = Collections.EMPTY_MAP;
            } else {
                unmodifiableMap2 = Collections.unmodifiableMap(p6Var.C);
            }
            p6Var.C = unmodifiableMap2;
            p6Var.A = true;
        }
        this.f2245b = true;
    }

    public final Object clone() {
        h5 h5Var = new h5();
        p6 p6Var = this.f2244a;
        if (p6Var.f2391y <= 0) {
            Iterator it = p6Var.b().iterator();
            if (!it.hasNext()) {
                return h5Var;
            }
            Map.Entry entry = (Map.Entry) it.next();
            if (entry.getKey() == null) {
                entry.getValue();
                throw null;
            }
            throw new ClassCastException();
        }
        p6Var.a(0).f2398x.getClass();
        throw new ClassCastException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h5)) {
            return false;
        }
        return this.f2244a.equals(((h5) obj).f2244a);
    }

    public final int hashCode() {
        return this.f2244a.hashCode();
    }

    public h5(int i6) {
        a();
        a();
    }
}
