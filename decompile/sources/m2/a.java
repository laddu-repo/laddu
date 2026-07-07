package m2;

import db.n0;
import java.util.HashMap;
import java.util.Locale;
import r1.l0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f8413a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8414b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8415c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8416d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f8417e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public int f8418f = -1;

    /* renamed from: g, reason: collision with root package name */
    public String f8419g;

    /* renamed from: h, reason: collision with root package name */
    public String f8420h;

    /* renamed from: i, reason: collision with root package name */
    public String f8421i;

    public a(String str, String str2, int i6, int i10) {
        this.f8413a = str;
        this.f8414b = i6;
        this.f8415c = str2;
        this.f8416d = i10;
    }

    public static String b(int i6, int i10, int i11, String str) {
        String str2 = u1.a0.f12750a;
        Locale locale = Locale.US;
        return i6 + " " + str + "/" + i10 + "/" + i11;
    }

    public final c a() {
        boolean z10;
        String b10;
        b a10;
        HashMap hashMap = this.f8417e;
        try {
            if (hashMap.containsKey("rtpmap")) {
                String str = (String) hashMap.get("rtpmap");
                String str2 = u1.a0.f12750a;
                a10 = b.a(str);
            } else {
                int i6 = this.f8416d;
                if (i6 < 96) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                u1.c.b(z10);
                if (i6 != 0) {
                    if (i6 != 8) {
                        if (i6 != 10) {
                            if (i6 == 11) {
                                b10 = b(11, 44100, 1, "L16");
                            } else {
                                throw new IllegalStateException(h8.c.i(i6, "Unsupported static paylod type "));
                            }
                        } else {
                            b10 = b(10, 44100, 2, "L16");
                        }
                    } else {
                        b10 = b(8, 8000, 1, "PCMA");
                    }
                } else {
                    b10 = b(0, 8000, 1, "PCMU");
                }
                a10 = b.a(b10);
            }
            return new c(this, n0.a(hashMap), a10);
        } catch (l0 e10) {
            throw new IllegalStateException(e10);
        }
    }
}
