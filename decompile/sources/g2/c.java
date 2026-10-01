package g2;

import java.util.ArrayList;
import okhttp3.HttpUrl;
import r1.k0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f5310c = {8, 13, 11, 2, 0, 1, 7};

    /* renamed from: a, reason: collision with root package name */
    public p.l f5311a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5312b;

    public static void a(int i6, ArrayList arrayList) {
        if (a8.f.R(f5310c, i6, 0, 7) != -1 && !arrayList.contains(Integer.valueOf(i6))) {
            arrayList.add(Integer.valueOf(i6));
        }
    }

    public final r1.q b(r1.q qVar) {
        String str;
        if (this.f5312b && this.f5311a.g(qVar)) {
            r1.p a10 = qVar.a();
            String str2 = qVar.f11667k;
            a10.f11611m = k0.p("application/x-media3-cues");
            a10.K = this.f5311a.o(qVar);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(qVar.f11670n);
            if (str2 != null) {
                str = " ".concat(str2);
            } else {
                str = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            sb2.append(str);
            a10.j = sb2.toString();
            a10.f11616r = Long.MAX_VALUE;
            return new r1.q(a10);
        }
        return qVar;
    }
}
