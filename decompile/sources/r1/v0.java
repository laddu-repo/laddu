package r1;

import android.os.Bundle;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class v0 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f11719a;

    static {
        String str = u1.a0.f12750a;
        f11719a = Integer.toString(0, 36);
    }

    public static v0 a(Bundle bundle) {
        String str = f11719a;
        int i6 = bundle.getInt(str, -1);
        boolean z10 = false;
        boolean z11 = true;
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 == 3) {
                        String str2 = y0.f11759d;
                        if (bundle.getInt(str, -1) != 3) {
                            z11 = false;
                        }
                        u1.c.b(z11);
                        if (bundle.getBoolean(y0.f11759d, false)) {
                            return new y0(bundle.getBoolean(y0.f11760e, false));
                        }
                        return new y0();
                    }
                    throw new IllegalArgumentException(h8.c.i(i6, "Unknown RatingType: "));
                }
                String str3 = w0.f11736d;
                if (bundle.getInt(str, -1) == 2) {
                    z10 = true;
                }
                u1.c.b(z10);
                int i10 = bundle.getInt(w0.f11736d, 5);
                float f3 = bundle.getFloat(w0.f11737e, -1.0f);
                if (f3 == -1.0f) {
                    return new w0(i10);
                }
                return new w0(i10, f3);
            }
            String str4 = m0.f11586c;
            if (bundle.getInt(str, -1) == 1) {
                z10 = true;
            }
            u1.c.b(z10);
            float f10 = bundle.getFloat(m0.f11586c, -1.0f);
            if (f10 == -1.0f) {
                return new m0();
            }
            return new m0(f10);
        }
        String str5 = s.f11688d;
        if (bundle.getInt(str, -1) != 0) {
            z11 = false;
        }
        u1.c.b(z11);
        if (bundle.getBoolean(s.f11688d, false)) {
            return new s(bundle.getBoolean(s.f11689e, false));
        }
        return new s();
    }

    public abstract boolean b();

    public abstract Bundle c();
}
