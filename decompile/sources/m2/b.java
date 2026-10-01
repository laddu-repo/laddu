package m2;

import java.util.regex.Pattern;
import r1.l0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f8430a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8431b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8432c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8433d;

    public b(int i6, int i10, int i11, String str) {
        this.f8430a = i6;
        this.f8431b = str;
        this.f8432c = i10;
        this.f8433d = i11;
    }

    public static b a(String str) {
        boolean z10;
        boolean z11;
        String str2 = u1.a0.f12750a;
        String[] split = str.split(" ", 2);
        if (split.length == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        u1.c.b(z10);
        String str3 = split[0];
        Pattern pattern = a0.f8422a;
        try {
            int parseInt = Integer.parseInt(str3);
            int i6 = -1;
            String[] split2 = split[1].trim().split("/", -1);
            if (split2.length >= 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            u1.c.b(z11);
            String str4 = split2[1];
            try {
                int parseInt2 = Integer.parseInt(str4);
                if (split2.length == 3) {
                    String str5 = split2[2];
                    try {
                        i6 = Integer.parseInt(str5);
                    } catch (NumberFormatException e10) {
                        throw l0.b(str5, e10);
                    }
                }
                return new b(parseInt, parseInt2, i6, split2[0]);
            } catch (NumberFormatException e11) {
                throw l0.b(str4, e11);
            }
        } catch (NumberFormatException e12) {
            throw l0.b(str3, e12);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f8430a == bVar.f8430a && this.f8431b.equals(bVar.f8431b) && this.f8432c == bVar.f8432c && this.f8433d == bVar.f8433d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((h8.c.g(this.f8431b, (217 + this.f8430a) * 31, 31) + this.f8432c) * 31) + this.f8433d;
    }
}
