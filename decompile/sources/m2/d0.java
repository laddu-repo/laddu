package m2;

import android.net.Uri;
import db.c1;
import db.k0;
import java.util.Arrays;
import r1.l0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f8451a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8452b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri f8453c;

    public d0(int i6, long j, Uri uri) {
        this.f8451a = j;
        this.f8452b = i6;
        this.f8453c = uri;
    }

    public static c1 a(Uri uri, String str) {
        db.r.e(4, "initialCapacity");
        Object[] objArr = new Object[4];
        String str2 = u1.a0.f12750a;
        int i6 = -1;
        String[] split = str.split(",", -1);
        int length = split.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            String str3 = split[i10];
            String[] split2 = str3.split(";", i6);
            int length2 = split2.length;
            int i12 = i10;
            long j = -9223372036854775807L;
            int i13 = 0;
            Uri uri2 = null;
            int i14 = -1;
            while (i13 < length2) {
                String str4 = split2[i13];
                try {
                    String[] split3 = str4.split("=", 2);
                    String str5 = split3[0];
                    String str6 = split3[1];
                    int hashCode = str5.hashCode();
                    String[] strArr = split;
                    if (hashCode != 113759) {
                        if (hashCode != 116079) {
                            if (hashCode == 1524180539 && str5.equals("rtptime")) {
                                j = Long.parseLong(str6);
                                i13++;
                                split = strArr;
                            }
                            throw l0.b(str5, null);
                        }
                        if (str5.equals("url")) {
                            uri2 = b(uri, str6);
                            i13++;
                            split = strArr;
                        } else {
                            throw l0.b(str5, null);
                        }
                    } else if (str5.equals("seq")) {
                        i14 = Integer.parseInt(str6);
                        i13++;
                        split = strArr;
                    } else {
                        throw l0.b(str5, null);
                    }
                } catch (Exception e10) {
                    throw l0.b(str4, e10);
                }
                throw l0.b(str4, e10);
            }
            String[] strArr2 = split;
            if (uri2 != null && uri2.getScheme() != null) {
                i6 = -1;
                if (i14 != -1 || j != -9223372036854775807L) {
                    d0 d0Var = new d0(i14, j, uri2);
                    int i15 = i11 + 1;
                    int f3 = db.e0.f(objArr.length, i15);
                    if (f3 > objArr.length) {
                        objArr = Arrays.copyOf(objArr, f3);
                    }
                    objArr[i11] = d0Var;
                    i11 = i15;
                    split = strArr2;
                    i10 = i12 + 1;
                }
            }
            throw l0.b(str3, null);
        }
        return k0.h(i11, objArr);
    }

    public static Uri b(Uri uri, String str) {
        String scheme = uri.getScheme();
        scheme.getClass();
        u1.c.b(scheme.equals("rtsp"));
        Uri parse = Uri.parse(str);
        if (parse.isAbsolute()) {
            return parse;
        }
        Uri parse2 = Uri.parse("rtsp://" + str);
        String uri2 = uri.toString();
        String host = parse2.getHost();
        host.getClass();
        if (host.equals(uri.getHost())) {
            return parse2;
        }
        if (uri2.endsWith("/")) {
            return u1.a.o(uri2, str);
        }
        return u1.a.o(uri2.concat("/"), str);
    }
}
