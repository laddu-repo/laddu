package e8;

import com.google.android.gms.internal.measurement.k4;
import g8.l;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a implements l {

    /* renamed from: c, reason: collision with root package name */
    public static final String f4462c;

    /* renamed from: d, reason: collision with root package name */
    public static final Set f4463d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f4464e;

    /* renamed from: f, reason: collision with root package name */
    public static final a f4465f;

    /* renamed from: a, reason: collision with root package name */
    public final String f4466a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4467b;

    static {
        String l10 = k4.l("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f4462c = l10;
        String l11 = k4.l("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String l12 = k4.l("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f4463d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new d8.c("proto"), new d8.c("json"))));
        f4464e = new a(l10, null);
        f4465f = new a(l11, l12);
    }

    public a(String str, String str2) {
        this.f4466a = str;
        this.f4467b = str2;
    }

    public static a a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (!str2.isEmpty()) {
                    String str3 = split[1];
                    if (str3.isEmpty()) {
                        str3 = null;
                    }
                    return new a(str2, str3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }
}
