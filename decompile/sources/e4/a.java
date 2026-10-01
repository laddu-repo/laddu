package e4;

import java.util.regex.Pattern;
import okhttp3.HttpUrl;
import u1.t;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f4303c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f4304d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* renamed from: a, reason: collision with root package name */
    public final t f4305a = new t();

    /* renamed from: b, reason: collision with root package name */
    public final StringBuilder f4306b = new StringBuilder();

    public static String a(t tVar, StringBuilder sb2) {
        boolean z10 = false;
        sb2.setLength(0);
        int i6 = tVar.f12812b;
        int i10 = tVar.f12813c;
        while (i6 < i10 && !z10) {
            char c10 = (char) tVar.f12811a[i6];
            if ((c10 < 'A' || c10 > 'Z') && ((c10 < 'a' || c10 > 'z') && ((c10 < '0' || c10 > '9') && c10 != '#' && c10 != '-' && c10 != '.' && c10 != '_'))) {
                z10 = true;
            } else {
                i6++;
                sb2.append(c10);
            }
        }
        tVar.L(i6 - tVar.f12812b);
        return sb2.toString();
    }

    public static String b(t tVar, StringBuilder sb2) {
        c(tVar);
        if (tVar.a() == 0) {
            return null;
        }
        String a10 = a(tVar, sb2);
        if (!a10.isEmpty()) {
            return a10;
        }
        return HttpUrl.FRAGMENT_ENCODE_SET + ((char) tVar.y());
    }

    public static void c(t tVar) {
        while (true) {
            for (boolean z10 = true; tVar.a() > 0 && z10; z10 = false) {
                int i6 = tVar.f12812b;
                byte[] bArr = tVar.f12811a;
                byte b10 = bArr[i6];
                char c10 = (char) b10;
                if (c10 != '\t' && c10 != '\n' && c10 != '\f' && c10 != '\r' && c10 != ' ') {
                    int i10 = tVar.f12813c;
                    int i11 = i6 + 2;
                    if (i11 <= i10) {
                        int i12 = i6 + 1;
                        if (b10 == 47 && bArr[i12] == 42) {
                            while (true) {
                                int i13 = i11 + 1;
                                if (i13 >= i10) {
                                    break;
                                }
                                if (((char) bArr[i11]) == '*' && ((char) bArr[i13]) == '/') {
                                    i11 += 2;
                                    i10 = i11;
                                } else {
                                    i11 = i13;
                                }
                            }
                            tVar.L(i10 - tVar.f12812b);
                        }
                    }
                } else {
                    tVar.L(1);
                }
            }
            return;
        }
    }
}
