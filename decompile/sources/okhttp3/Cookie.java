package okhttp3;

import com.unity3d.services.UnityAdsConstants;
import df.m;
import df.u;
import h8.c;
import ie.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.k;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import okhttp3.internal.http.DatesKt;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import r4.a;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class Cookie {
    private final String domain;
    private final long expiresAt;
    private final boolean hostOnly;
    private final boolean httpOnly;
    private final String name;
    private final String path;
    private final boolean persistent;
    private final boolean secure;
    private final String value;
    public static final Companion Companion = new Companion(null);
    private static final Pattern YEAR_PATTERN = Pattern.compile("(\\d{2,4})[^\\d]*");
    private static final Pattern MONTH_PATTERN = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    private static final Pattern DAY_OF_MONTH_PATTERN = Pattern.compile("(\\d{1,2})[^\\d]*");
    private static final Pattern TIME_PATTERN = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class Builder {
        private String domain;
        private boolean hostOnly;
        private boolean httpOnly;
        private String name;
        private boolean persistent;
        private boolean secure;
        private String value;
        private long expiresAt = DatesKt.MAX_DATE;
        private String path = "/";

        public final Cookie build() {
            String str = this.name;
            if (str != null) {
                String str2 = this.value;
                if (str2 != null) {
                    long j = this.expiresAt;
                    String str3 = this.domain;
                    if (str3 != null) {
                        return new Cookie(str, str2, j, str3, this.path, this.secure, this.httpOnly, this.persistent, this.hostOnly, null);
                    }
                    throw new NullPointerException("builder.domain == null");
                }
                throw new NullPointerException("builder.value == null");
            }
            throw new NullPointerException("builder.name == null");
        }

        public final Builder domain(String domain) {
            k.e(domain, "domain");
            return domain(domain, false);
        }

        public final Builder expiresAt(long j) {
            if (j <= 0) {
                j = Long.MIN_VALUE;
            }
            if (j > DatesKt.MAX_DATE) {
                j = 253402300799999L;
            }
            this.expiresAt = j;
            this.persistent = true;
            return this;
        }

        public final Builder hostOnlyDomain(String domain) {
            k.e(domain, "domain");
            return domain(domain, true);
        }

        public final Builder httpOnly() {
            this.httpOnly = true;
            return this;
        }

        public final Builder name(String name) {
            k.e(name, "name");
            if (k.a(m.n0(name).toString(), name)) {
                this.name = name;
                return this;
            }
            throw new IllegalArgumentException("name is not trimmed");
        }

        public final Builder path(String path) {
            k.e(path, "path");
            if (u.H(path, "/", false)) {
                this.path = path;
                return this;
            }
            throw new IllegalArgumentException("path must start with '/'");
        }

        public final Builder secure() {
            this.secure = true;
            return this;
        }

        public final Builder value(String value) {
            k.e(value, "value");
            if (k.a(m.n0(value).toString(), value)) {
                this.value = value;
                return this;
            }
            throw new IllegalArgumentException("value is not trimmed");
        }

        private final Builder domain(String str, boolean z10) {
            String canonicalHost = HostnamesKt.toCanonicalHost(str);
            if (canonicalHost != null) {
                this.domain = canonicalHost;
                this.hostOnly = z10;
                return this;
            }
            throw new IllegalArgumentException(a.k("unexpected domain: ", str));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        private final int dateCharacterOffset(String str, int i6, int i10, boolean z10) {
            boolean z11;
            while (i6 < i10) {
                char charAt = str.charAt(i6);
                if ((charAt >= ' ' || charAt == '\t') && charAt < 127 && (('0' > charAt || charAt >= ':') && (('a' > charAt || charAt >= '{') && (('A' > charAt || charAt >= '[') && charAt != ':')))) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (z11 == (!z10)) {
                    return i6;
                }
                i6++;
            }
            return i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean domainMatch(String str, String str2) {
            if (k.a(str, str2) || (u.z(str, str2, false) && str.charAt((str.length() - str2.length()) - 1) == '.' && !Util.canParseAsIpAddress(str))) {
                return true;
            }
            return false;
        }

        private final String parseDomain(String str) {
            if (!u.z(str, ".", false)) {
                String canonicalHost = HostnamesKt.toCanonicalHost(m.X(str, "."));
                if (canonicalHost != null) {
                    return canonicalHost;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException("Failed requirement.");
        }

        private final long parseExpires(String str, int i6, int i10) {
            int dateCharacterOffset = dateCharacterOffset(str, i6, i10, false);
            Matcher matcher = Cookie.TIME_PATTERN.matcher(str);
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            while (dateCharacterOffset < i10) {
                int dateCharacterOffset2 = dateCharacterOffset(str, dateCharacterOffset + 1, i10, true);
                matcher.region(dateCharacterOffset, dateCharacterOffset2);
                if (i12 == -1 && matcher.usePattern(Cookie.TIME_PATTERN).matches()) {
                    String group = matcher.group(1);
                    k.d(group, "matcher.group(1)");
                    i12 = Integer.parseInt(group);
                    String group2 = matcher.group(2);
                    k.d(group2, "matcher.group(2)");
                    i15 = Integer.parseInt(group2);
                    String group3 = matcher.group(3);
                    k.d(group3, "matcher.group(3)");
                    i16 = Integer.parseInt(group3);
                } else if (i13 == -1 && matcher.usePattern(Cookie.DAY_OF_MONTH_PATTERN).matches()) {
                    String group4 = matcher.group(1);
                    k.d(group4, "matcher.group(1)");
                    i13 = Integer.parseInt(group4);
                } else if (i14 == -1 && matcher.usePattern(Cookie.MONTH_PATTERN).matches()) {
                    String group5 = matcher.group(1);
                    k.d(group5, "matcher.group(1)");
                    Locale US = Locale.US;
                    k.d(US, "US");
                    String lowerCase = group5.toLowerCase(US);
                    k.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    String pattern = Cookie.MONTH_PATTERN.pattern();
                    k.d(pattern, "MONTH_PATTERN.pattern()");
                    i14 = m.Q(pattern, lowerCase, 0, false, 6) / 4;
                } else if (i11 == -1 && matcher.usePattern(Cookie.YEAR_PATTERN).matches()) {
                    String group6 = matcher.group(1);
                    k.d(group6, "matcher.group(1)");
                    i11 = Integer.parseInt(group6);
                }
                dateCharacterOffset = dateCharacterOffset(str, dateCharacterOffset2 + 1, i10, false);
            }
            if (70 <= i11 && i11 < 100) {
                i11 += 1900;
            }
            if (i11 >= 0 && i11 < 70) {
                i11 += 2000;
            }
            if (i11 >= 1601) {
                if (i14 != -1) {
                    if (1 <= i13 && i13 < 32) {
                        if (i12 >= 0 && i12 < 24) {
                            if (i15 >= 0 && i15 < 60) {
                                if (i16 >= 0 && i16 < 60) {
                                    GregorianCalendar gregorianCalendar = new GregorianCalendar(Util.UTC);
                                    gregorianCalendar.setLenient(false);
                                    gregorianCalendar.set(1, i11);
                                    gregorianCalendar.set(2, i14 - 1);
                                    gregorianCalendar.set(5, i13);
                                    gregorianCalendar.set(11, i12);
                                    gregorianCalendar.set(12, i15);
                                    gregorianCalendar.set(13, i16);
                                    gregorianCalendar.set(14, 0);
                                    return gregorianCalendar.getTimeInMillis();
                                }
                                throw new IllegalArgumentException("Failed requirement.");
                            }
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                    throw new IllegalArgumentException("Failed requirement.");
                }
                throw new IllegalArgumentException("Failed requirement.");
            }
            throw new IllegalArgumentException("Failed requirement.");
        }

        private final long parseMaxAge(String input) {
            try {
                long parseLong = Long.parseLong(input);
                if (parseLong <= 0) {
                    return Long.MIN_VALUE;
                }
                return parseLong;
            } catch (NumberFormatException e10) {
                Pattern compile = Pattern.compile("-?\\d+");
                k.d(compile, "compile(...)");
                k.e(input, "input");
                if (compile.matcher(input).matches()) {
                    if (u.H(input, "-", false)) {
                        return Long.MIN_VALUE;
                    }
                    return Long.MAX_VALUE;
                }
                throw e10;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean pathMatch(HttpUrl httpUrl, String str) {
            String encodedPath = httpUrl.encodedPath();
            if (!k.a(encodedPath, str)) {
                if (!u.H(encodedPath, str, false) || (!u.z(str, "/", false) && encodedPath.charAt(str.length()) != '/')) {
                    return false;
                }
                return true;
            }
            return true;
        }

        public final Cookie parse(HttpUrl url, String setCookie) {
            k.e(url, "url");
            k.e(setCookie, "setCookie");
            return parse$okhttp(System.currentTimeMillis(), url, setCookie);
        }

        public final Cookie parse$okhttp(long j, HttpUrl url, String setCookie) {
            long j10;
            long j11;
            String str;
            k.e(url, "url");
            k.e(setCookie, "setCookie");
            int delimiterOffset$default = Util.delimiterOffset$default(setCookie, ';', 0, 0, 6, (Object) null);
            int delimiterOffset$default2 = Util.delimiterOffset$default(setCookie, '=', 0, delimiterOffset$default, 2, (Object) null);
            String str2 = null;
            if (delimiterOffset$default2 != delimiterOffset$default) {
                String trimSubstring$default = Util.trimSubstring$default(setCookie, 0, delimiterOffset$default2, 1, null);
                if (trimSubstring$default.length() != 0 && Util.indexOfControlOrNonAscii(trimSubstring$default) == -1) {
                    String trimSubstring = Util.trimSubstring(setCookie, delimiterOffset$default2 + 1, delimiterOffset$default);
                    if (Util.indexOfControlOrNonAscii(trimSubstring) == -1) {
                        int i6 = delimiterOffset$default + 1;
                        int length = setCookie.length();
                        String str3 = null;
                        boolean z10 = false;
                        long j12 = -1;
                        boolean z11 = true;
                        boolean z12 = false;
                        long j13 = DatesKt.MAX_DATE;
                        boolean z13 = false;
                        while (i6 < length) {
                            int delimiterOffset = Util.delimiterOffset(setCookie, ';', i6, length);
                            int delimiterOffset2 = Util.delimiterOffset(setCookie, '=', i6, delimiterOffset);
                            String trimSubstring2 = Util.trimSubstring(setCookie, i6, delimiterOffset2);
                            if (delimiterOffset2 < delimiterOffset) {
                                str = Util.trimSubstring(setCookie, delimiterOffset2 + 1, delimiterOffset);
                            } else {
                                str = HttpUrl.FRAGMENT_ENCODE_SET;
                            }
                            if (u.A(trimSubstring2, "expires", true)) {
                                try {
                                    j13 = parseExpires(str, 0, str.length());
                                } catch (NumberFormatException | IllegalArgumentException unused) {
                                }
                            } else if (u.A(trimSubstring2, "max-age", true)) {
                                j12 = parseMaxAge(str);
                            } else {
                                if (u.A(trimSubstring2, "domain", true)) {
                                    str2 = parseDomain(str);
                                    z11 = false;
                                } else if (u.A(trimSubstring2, "path", true)) {
                                    str3 = str;
                                } else if (u.A(trimSubstring2, "secure", true)) {
                                    z13 = true;
                                } else if (u.A(trimSubstring2, "httponly", true)) {
                                    z10 = true;
                                }
                                i6 = delimiterOffset + 1;
                            }
                            z12 = true;
                            i6 = delimiterOffset + 1;
                        }
                        if (j12 == Long.MIN_VALUE) {
                            j10 = Long.MIN_VALUE;
                        } else if (j12 != -1) {
                            if (j12 <= 9223372036854775L) {
                                j11 = j12 * UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT;
                            } else {
                                j11 = Long.MAX_VALUE;
                            }
                            long j14 = j + j11;
                            if (j14 >= j && j14 <= DatesKt.MAX_DATE) {
                                j10 = j14;
                            } else {
                                j10 = 253402300799999L;
                            }
                        } else {
                            j10 = j13;
                        }
                        String host = url.host();
                        if (str2 == null) {
                            str2 = host;
                        } else if (!domainMatch(host, str2)) {
                            return null;
                        }
                        if (host.length() != str2.length() && PublicSuffixDatabase.Companion.get().getEffectiveTldPlusOne(str2) == null) {
                            return null;
                        }
                        String str4 = "/";
                        if (str3 == null || !u.H(str3, "/", false)) {
                            String encodedPath = url.encodedPath();
                            int U = m.U(encodedPath, '/', 0, 6);
                            if (U != 0) {
                                str4 = encodedPath.substring(0, U);
                                k.d(str4, "this as java.lang.String…ing(startIndex, endIndex)");
                            }
                            str3 = str4;
                        }
                        return new Cookie(trimSubstring$default, trimSubstring, j10, str2, str3, z13, z10, z12, z11, null);
                    }
                }
            }
            return null;
        }

        public final List<Cookie> parseAll(HttpUrl url, Headers headers) {
            k.e(url, "url");
            k.e(headers, "headers");
            List<String> values = headers.values("Set-Cookie");
            int size = values.size();
            ArrayList arrayList = null;
            for (int i6 = 0; i6 < size; i6++) {
                Cookie parse = parse(url, values.get(i6));
                if (parse != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(parse);
                }
            }
            if (arrayList != null) {
                List<Cookie> unmodifiableList = Collections.unmodifiableList(arrayList);
                k.d(unmodifiableList, "{\n        Collections.un…ableList(cookies)\n      }");
                return unmodifiableList;
            }
            return r.f6846x;
        }

        private Companion() {
        }
    }

    public /* synthetic */ Cookie(String str, String str2, long j, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13, f fVar) {
        this(str, str2, j, str3, str4, z10, z11, z12, z13);
    }

    public static final Cookie parse(HttpUrl httpUrl, String str) {
        return Companion.parse(httpUrl, str);
    }

    public static final List<Cookie> parseAll(HttpUrl httpUrl, Headers headers) {
        return Companion.parseAll(httpUrl, headers);
    }

    /* renamed from: -deprecated_domain, reason: not valid java name */
    public final String m188deprecated_domain() {
        return this.domain;
    }

    /* renamed from: -deprecated_expiresAt, reason: not valid java name */
    public final long m189deprecated_expiresAt() {
        return this.expiresAt;
    }

    /* renamed from: -deprecated_hostOnly, reason: not valid java name */
    public final boolean m190deprecated_hostOnly() {
        return this.hostOnly;
    }

    /* renamed from: -deprecated_httpOnly, reason: not valid java name */
    public final boolean m191deprecated_httpOnly() {
        return this.httpOnly;
    }

    /* renamed from: -deprecated_name, reason: not valid java name */
    public final String m192deprecated_name() {
        return this.name;
    }

    /* renamed from: -deprecated_path, reason: not valid java name */
    public final String m193deprecated_path() {
        return this.path;
    }

    /* renamed from: -deprecated_persistent, reason: not valid java name */
    public final boolean m194deprecated_persistent() {
        return this.persistent;
    }

    /* renamed from: -deprecated_secure, reason: not valid java name */
    public final boolean m195deprecated_secure() {
        return this.secure;
    }

    /* renamed from: -deprecated_value, reason: not valid java name */
    public final String m196deprecated_value() {
        return this.value;
    }

    public final String domain() {
        return this.domain;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Cookie) {
            Cookie cookie = (Cookie) obj;
            if (k.a(cookie.name, this.name) && k.a(cookie.value, this.value) && cookie.expiresAt == this.expiresAt && k.a(cookie.domain, this.domain) && k.a(cookie.path, this.path) && cookie.secure == this.secure && cookie.httpOnly == this.httpOnly && cookie.persistent == this.persistent && cookie.hostOnly == this.hostOnly) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final long expiresAt() {
        return this.expiresAt;
    }

    @IgnoreJRERequirement
    public int hashCode() {
        int i6;
        int i10;
        int i11;
        int g10 = c.g(this.value, c.g(this.name, 527, 31), 31);
        long j = this.expiresAt;
        int g11 = c.g(this.path, c.g(this.domain, (g10 + ((int) (j ^ (j >>> 32)))) * 31, 31), 31);
        int i12 = 1237;
        if (this.secure) {
            i6 = 1231;
        } else {
            i6 = 1237;
        }
        int i13 = (g11 + i6) * 31;
        if (this.httpOnly) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i14 = (i13 + i10) * 31;
        if (this.persistent) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        int i15 = (i14 + i11) * 31;
        if (this.hostOnly) {
            i12 = 1231;
        }
        return i15 + i12;
    }

    public final boolean hostOnly() {
        return this.hostOnly;
    }

    public final boolean httpOnly() {
        return this.httpOnly;
    }

    public final boolean matches(HttpUrl url) {
        boolean domainMatch;
        k.e(url, "url");
        if (!this.hostOnly) {
            domainMatch = Companion.domainMatch(url.host(), this.domain);
        } else {
            domainMatch = k.a(url.host(), this.domain);
        }
        if (!domainMatch || !Companion.pathMatch(url, this.path)) {
            return false;
        }
        if (this.secure && !url.isHttps()) {
            return false;
        }
        return true;
    }

    public final String name() {
        return this.name;
    }

    public final String path() {
        return this.path;
    }

    public final boolean persistent() {
        return this.persistent;
    }

    public final boolean secure() {
        return this.secure;
    }

    public String toString() {
        return toString$okhttp(false);
    }

    public final String toString$okhttp(boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.name);
        sb2.append('=');
        sb2.append(this.value);
        if (this.persistent) {
            if (this.expiresAt == Long.MIN_VALUE) {
                sb2.append("; max-age=0");
            } else {
                sb2.append("; expires=");
                sb2.append(DatesKt.toHttpDateString(new Date(this.expiresAt)));
            }
        }
        if (!this.hostOnly) {
            sb2.append("; domain=");
            if (z10) {
                sb2.append(".");
            }
            sb2.append(this.domain);
        }
        sb2.append("; path=");
        sb2.append(this.path);
        if (this.secure) {
            sb2.append("; secure");
        }
        if (this.httpOnly) {
            sb2.append("; httponly");
        }
        String sb3 = sb2.toString();
        k.d(sb3, "toString()");
        return sb3;
    }

    public final String value() {
        return this.value;
    }

    private Cookie(String str, String str2, long j, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.name = str;
        this.value = str2;
        this.expiresAt = j;
        this.domain = str3;
        this.path = str4;
        this.secure = z10;
        this.httpOnly = z11;
        this.persistent = z12;
        this.hostOnly = z13;
    }
}
