package okhttp3.internal.tls;

import df.m;
import df.u;
import h8.c;
import ie.j;
import ie.r;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.jvm.internal.k;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class OkHostnameVerifier implements HostnameVerifier {
    private static final int ALT_DNS_NAME = 2;
    private static final int ALT_IPA_NAME = 7;
    public static final OkHostnameVerifier INSTANCE = new OkHostnameVerifier();

    private OkHostnameVerifier() {
    }

    private final String asciiToLowercase(String str) {
        if (isAscii(str)) {
            Locale US = Locale.US;
            k.d(US, "US");
            String lowerCase = str.toLowerCase(US);
            k.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            return lowerCase;
        }
        return str;
    }

    private final List<String> getSubjectAltNames(X509Certificate x509Certificate, int i6) {
        Object obj;
        r rVar = r.f6846x;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return rVar;
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && k.a(list.get(0), Integer.valueOf(i6)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return rVar;
        }
    }

    private final boolean isAscii(String str) {
        int i6;
        char c10;
        int length = str.length();
        int length2 = str.length();
        if (length2 >= 0) {
            if (length2 <= str.length()) {
                long j = 0;
                int i10 = 0;
                while (i10 < length2) {
                    char charAt = str.charAt(i10);
                    if (charAt < 128) {
                        j++;
                    } else {
                        if (charAt < 2048) {
                            i6 = 2;
                        } else if (charAt >= 55296 && charAt <= 57343) {
                            int i11 = i10 + 1;
                            if (i11 < length2) {
                                c10 = str.charAt(i11);
                            } else {
                                c10 = 0;
                            }
                            if (charAt <= 56319 && c10 >= 56320 && c10 <= 57343) {
                                j += 4;
                                i10 += 2;
                            } else {
                                j++;
                                i10 = i11;
                            }
                        } else {
                            i6 = 3;
                        }
                        j += i6;
                    }
                    i10++;
                }
                if (length != ((int) j)) {
                    return false;
                }
                return true;
            }
            StringBuilder n10 = c.n(length2, "endIndex > string.length: ", " > ");
            n10.append(str.length());
            throw new IllegalArgumentException(n10.toString().toString());
        }
        throw new IllegalArgumentException(c.l("endIndex < beginIndex: ", " < ", length2, 0).toString());
    }

    private final boolean verifyHostname(String str, X509Certificate x509Certificate) {
        String asciiToLowercase = asciiToLowercase(str);
        List<String> subjectAltNames = getSubjectAltNames(x509Certificate, 2);
        if (subjectAltNames != null && subjectAltNames.isEmpty()) {
            return false;
        }
        Iterator<T> it = subjectAltNames.iterator();
        while (it.hasNext()) {
            if (INSTANCE.verifyHostname(asciiToLowercase, (String) it.next())) {
                return true;
            }
        }
        return false;
    }

    private final boolean verifyIpAddress(String str, X509Certificate x509Certificate) {
        String canonicalHost = HostnamesKt.toCanonicalHost(str);
        List<String> subjectAltNames = getSubjectAltNames(x509Certificate, 7);
        if (subjectAltNames == null || !subjectAltNames.isEmpty()) {
            Iterator<T> it = subjectAltNames.iterator();
            while (it.hasNext()) {
                if (k.a(canonicalHost, HostnamesKt.toCanonicalHost((String) it.next()))) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final List<String> allSubjectAltNames(X509Certificate certificate) {
        k.e(certificate, "certificate");
        return j.P(getSubjectAltNames(certificate, 2), getSubjectAltNames(certificate, 7));
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String host, SSLSession session) {
        k.e(host, "host");
        k.e(session, "session");
        if (!isAscii(host)) {
            return false;
        }
        try {
            Certificate certificate = session.getPeerCertificates()[0];
            k.c(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            return verify(host, (X509Certificate) certificate);
        } catch (SSLException unused) {
            return false;
        }
    }

    public final boolean verify(String host, X509Certificate certificate) {
        k.e(host, "host");
        k.e(certificate, "certificate");
        return Util.canParseAsIpAddress(host) ? verifyIpAddress(host, certificate) : verifyHostname(host, certificate);
    }

    private final boolean verifyHostname(String str, String str2) {
        int length;
        if (str != null && str.length() != 0 && !u.H(str, ".", false) && !u.z(str, "..", false) && str2 != null && str2.length() != 0 && !u.H(str2, ".", false) && !u.z(str2, "..", false)) {
            if (!u.z(str, ".", false)) {
                str = str.concat(".");
            }
            if (!u.z(str2, ".", false)) {
                str2 = str2.concat(".");
            }
            String asciiToLowercase = asciiToLowercase(str2);
            if (!m.I(asciiToLowercase, "*", false)) {
                return k.a(str, asciiToLowercase);
            }
            if (u.H(asciiToLowercase, "*.", false) && m.P(asciiToLowercase, '*', 1, 4) == -1 && str.length() >= asciiToLowercase.length() && !"*.".equals(asciiToLowercase)) {
                String substring = asciiToLowercase.substring(1);
                k.d(substring, "this as java.lang.String).substring(startIndex)");
                if (u.z(str, substring, false) && ((length = str.length() - substring.length()) <= 0 || m.U(str, '.', length - 1, 4) == -1)) {
                    return true;
                }
            }
        }
        return false;
    }
}
