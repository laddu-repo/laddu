package okhttp3;

import a.a;
import android.support.v4.media.session.b;
import com.unity3d.services.core.network.model.HttpRequest;
import df.m;
import df.u;
import h8.c;
import ie.l;
import ie.r;
import ie.t;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.k;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class HttpUrl {
    public static final String FORM_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#&!$(),~";
    public static final String FRAGMENT_ENCODE_SET = "";
    public static final String FRAGMENT_ENCODE_SET_URI = " \"#<>\\^`{|}";
    public static final String PASSWORD_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
    public static final String PATH_SEGMENT_ENCODE_SET = " \"<>^`{}|/\\?#";
    public static final String PATH_SEGMENT_ENCODE_SET_URI = "[]";
    public static final String QUERY_COMPONENT_ENCODE_SET = " !\"#$&'(),/:;<=>?@[]\\^`{|}~";
    public static final String QUERY_COMPONENT_ENCODE_SET_URI = "\\^`{|}";
    public static final String QUERY_COMPONENT_REENCODE_SET = " \"'<>#&=";
    public static final String QUERY_ENCODE_SET = " \"'<>#";
    public static final String USERNAME_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
    private final String fragment;
    private final String host;
    private final boolean isHttps;
    private final String password;
    private final List<String> pathSegments;
    private final int port;
    private final List<String> queryNamesAndValues;
    private final String scheme;
    private final String url;
    private final String username;
    public static final Companion Companion = new Companion(null);
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class Builder {
        public static final Companion Companion = new Companion(null);
        public static final String INVALID_HOST = "Invalid URL host";
        private String encodedFragment;
        private final List<String> encodedPathSegments;
        private List<String> encodedQueryNamesAndValues;
        private String host;
        private String scheme;
        private String encodedUsername = HttpUrl.FRAGMENT_ENCODE_SET;
        private String encodedPassword = HttpUrl.FRAGMENT_ENCODE_SET;
        private int port = -1;

        /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
        /* loaded from: classes.dex */
        public static final class Companion {
            public /* synthetic */ Companion(f fVar) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int parsePort(String str, int i6, int i10) {
                int parseInt;
                try {
                    parseInt = Integer.parseInt(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, i6, i10, HttpUrl.FRAGMENT_ENCODE_SET, false, false, false, false, null, 248, null));
                } catch (NumberFormatException unused) {
                }
                if (1 > parseInt || parseInt >= 65536) {
                    return -1;
                }
                return parseInt;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int portColonOffset(String str, int i6, int i10) {
                while (i6 < i10) {
                    char charAt = str.charAt(i6);
                    if (charAt != '[') {
                        if (charAt == ':') {
                            return i6;
                        }
                        i6++;
                    }
                    do {
                        i6++;
                        if (i6 < i10) {
                        }
                        i6++;
                    } while (str.charAt(i6) != ']');
                    i6++;
                }
                return i10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int schemeDelimiterOffset(String str, int i6, int i10) {
                if (i10 - i6 < 2) {
                    return -1;
                }
                char charAt = str.charAt(i6);
                if ((k.g(charAt, 97) >= 0 && k.g(charAt, 122) <= 0) || (k.g(charAt, 65) >= 0 && k.g(charAt, 90) <= 0)) {
                    while (true) {
                        i6++;
                        if (i6 >= i10) {
                            break;
                        }
                        char charAt2 = str.charAt(i6);
                        if ('a' > charAt2 || charAt2 >= '{') {
                            if ('A' > charAt2 || charAt2 >= '[') {
                                if ('0' > charAt2 || charAt2 >= ':') {
                                    if (charAt2 != '+' && charAt2 != '-' && charAt2 != '.') {
                                        if (charAt2 == ':') {
                                            return i6;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return -1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int slashCount(String str, int i6, int i10) {
                int i11 = 0;
                while (i6 < i10) {
                    char charAt = str.charAt(i6);
                    if (charAt != '\\' && charAt != '/') {
                        break;
                    }
                    i11++;
                    i6++;
                }
                return i11;
            }

            private Companion() {
            }
        }

        public Builder() {
            ArrayList arrayList = new ArrayList();
            this.encodedPathSegments = arrayList;
            arrayList.add(HttpUrl.FRAGMENT_ENCODE_SET);
        }

        private final int effectivePort() {
            int i6 = this.port;
            if (i6 != -1) {
                return i6;
            }
            Companion companion = HttpUrl.Companion;
            String str = this.scheme;
            k.b(str);
            return companion.defaultPort(str);
        }

        private final boolean isDot(String str) {
            if (k.a(str, ".") || u.A(str, "%2e", true)) {
                return true;
            }
            return false;
        }

        private final boolean isDotDot(String str) {
            if (k.a(str, "..") || u.A(str, "%2e.", true) || u.A(str, ".%2e", true) || u.A(str, "%2e%2e", true)) {
                return true;
            }
            return false;
        }

        private final void pop() {
            if (this.encodedPathSegments.remove(r0.size() - 1).length() == 0 && !this.encodedPathSegments.isEmpty()) {
                this.encodedPathSegments.set(r0.size() - 1, HttpUrl.FRAGMENT_ENCODE_SET);
            } else {
                this.encodedPathSegments.add(HttpUrl.FRAGMENT_ENCODE_SET);
            }
        }

        private final void push(String str, int i6, int i10, boolean z10, boolean z11) {
            String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, i6, i10, HttpUrl.PATH_SEGMENT_ENCODE_SET, z11, false, false, false, null, 240, null);
            if (!isDot(canonicalize$okhttp$default)) {
                if (isDotDot(canonicalize$okhttp$default)) {
                    pop();
                    return;
                }
                if (this.encodedPathSegments.get(r14.size() - 1).length() == 0) {
                    this.encodedPathSegments.set(r14.size() - 1, canonicalize$okhttp$default);
                } else {
                    this.encodedPathSegments.add(canonicalize$okhttp$default);
                }
                if (z10) {
                    this.encodedPathSegments.add(HttpUrl.FRAGMENT_ENCODE_SET);
                }
            }
        }

        private final void removeAllCanonicalQueryParameters(String str) {
            List<String> list = this.encodedQueryNamesAndValues;
            k.b(list);
            int size = list.size() - 2;
            int l10 = a.l(size, 0, -2);
            if (l10 > size) {
                return;
            }
            while (true) {
                List<String> list2 = this.encodedQueryNamesAndValues;
                k.b(list2);
                if (k.a(str, list2.get(size))) {
                    List<String> list3 = this.encodedQueryNamesAndValues;
                    k.b(list3);
                    list3.remove(size + 1);
                    List<String> list4 = this.encodedQueryNamesAndValues;
                    k.b(list4);
                    list4.remove(size);
                    List<String> list5 = this.encodedQueryNamesAndValues;
                    k.b(list5);
                    if (list5.isEmpty()) {
                        this.encodedQueryNamesAndValues = null;
                        return;
                    }
                }
                if (size != l10) {
                    size -= 2;
                } else {
                    return;
                }
            }
        }

        private final void resolvePath(String str, int i6, int i10) {
            boolean z10;
            if (i6 != i10) {
                char charAt = str.charAt(i6);
                if (charAt != '/' && charAt != '\\') {
                    List<String> list = this.encodedPathSegments;
                    list.set(list.size() - 1, HttpUrl.FRAGMENT_ENCODE_SET);
                } else {
                    this.encodedPathSegments.clear();
                    this.encodedPathSegments.add(HttpUrl.FRAGMENT_ENCODE_SET);
                    i6++;
                }
                int i11 = i6;
                while (i11 < i10) {
                    int delimiterOffset = Util.delimiterOffset(str, "/\\", i11, i10);
                    if (delimiterOffset < i10) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    String str2 = str;
                    push(str2, i11, delimiterOffset, z10, true);
                    if (z10) {
                        i11 = delimiterOffset + 1;
                        str = str2;
                    } else {
                        str = str2;
                        i11 = delimiterOffset;
                    }
                }
            }
        }

        public final Builder addEncodedPathSegment(String encodedPathSegment) {
            k.e(encodedPathSegment, "encodedPathSegment");
            push(encodedPathSegment, 0, encodedPathSegment.length(), false, true);
            return this;
        }

        public final Builder addEncodedPathSegments(String encodedPathSegments) {
            k.e(encodedPathSegments, "encodedPathSegments");
            return addPathSegments(encodedPathSegments, true);
        }

        public final Builder addEncodedQueryParameter(String encodedName, String str) {
            String str2;
            k.e(encodedName, "encodedName");
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            List<String> list = this.encodedQueryNamesAndValues;
            k.b(list);
            Companion companion = HttpUrl.Companion;
            list.add(Companion.canonicalize$okhttp$default(companion, encodedName, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, 211, null));
            List<String> list2 = this.encodedQueryNamesAndValues;
            k.b(list2);
            if (str != null) {
                str2 = Companion.canonicalize$okhttp$default(companion, str, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, 211, null);
            } else {
                str2 = null;
            }
            list2.add(str2);
            return this;
        }

        public final Builder addPathSegment(String pathSegment) {
            k.e(pathSegment, "pathSegment");
            push(pathSegment, 0, pathSegment.length(), false, false);
            return this;
        }

        public final Builder addPathSegments(String pathSegments) {
            k.e(pathSegments, "pathSegments");
            return addPathSegments(pathSegments, false);
        }

        public final Builder addQueryParameter(String name, String str) {
            String str2;
            k.e(name, "name");
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            List<String> list = this.encodedQueryNamesAndValues;
            k.b(list);
            Companion companion = HttpUrl.Companion;
            list.add(Companion.canonicalize$okhttp$default(companion, name, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, 219, null));
            List<String> list2 = this.encodedQueryNamesAndValues;
            k.b(list2);
            if (str != null) {
                str2 = Companion.canonicalize$okhttp$default(companion, str, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, 219, null);
            } else {
                str2 = null;
            }
            list2.add(str2);
            return this;
        }

        public final HttpUrl build() {
            ArrayList arrayList;
            String str;
            String str2 = this.scheme;
            if (str2 != null) {
                Companion companion = HttpUrl.Companion;
                String percentDecode$okhttp$default = Companion.percentDecode$okhttp$default(companion, this.encodedUsername, 0, 0, false, 7, null);
                String percentDecode$okhttp$default2 = Companion.percentDecode$okhttp$default(companion, this.encodedPassword, 0, 0, false, 7, null);
                String str3 = this.host;
                if (str3 != null) {
                    int effectivePort = effectivePort();
                    List<String> list = this.encodedPathSegments;
                    ArrayList arrayList2 = new ArrayList(l.x(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(Companion.percentDecode$okhttp$default(HttpUrl.Companion, (String) it.next(), 0, 0, false, 7, null));
                    }
                    List<String> list2 = this.encodedQueryNamesAndValues;
                    String str4 = null;
                    if (list2 != null) {
                        ArrayList arrayList3 = new ArrayList(l.x(list2, 10));
                        for (String str5 : list2) {
                            if (str5 != null) {
                                str = Companion.percentDecode$okhttp$default(HttpUrl.Companion, str5, 0, 0, true, 3, null);
                            } else {
                                str = null;
                            }
                            arrayList3.add(str);
                        }
                        arrayList = arrayList3;
                    } else {
                        arrayList = null;
                    }
                    String str6 = this.encodedFragment;
                    if (str6 != null) {
                        str4 = Companion.percentDecode$okhttp$default(HttpUrl.Companion, str6, 0, 0, false, 7, null);
                    }
                    return new HttpUrl(str2, percentDecode$okhttp$default, percentDecode$okhttp$default2, str3, effectivePort, arrayList2, arrayList, str4, toString());
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        public final Builder encodedFragment(String str) {
            String str2;
            if (str != null) {
                str2 = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, HttpUrl.FRAGMENT_ENCODE_SET, true, false, false, true, null, 179, null);
            } else {
                str2 = null;
            }
            this.encodedFragment = str2;
            return this;
        }

        public final Builder encodedPassword(String encodedPassword) {
            k.e(encodedPassword, "encodedPassword");
            this.encodedPassword = Companion.canonicalize$okhttp$default(HttpUrl.Companion, encodedPassword, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 243, null);
            return this;
        }

        public final Builder encodedPath(String encodedPath) {
            k.e(encodedPath, "encodedPath");
            if (u.H(encodedPath, "/", false)) {
                resolvePath(encodedPath, 0, encodedPath.length());
                return this;
            }
            throw new IllegalArgumentException("unexpected encodedPath: ".concat(encodedPath).toString());
        }

        public final Builder encodedQuery(String str) {
            List<String> list;
            Companion companion;
            String canonicalize$okhttp$default;
            if (str != null && (canonicalize$okhttp$default = Companion.canonicalize$okhttp$default((companion = HttpUrl.Companion), str, 0, 0, HttpUrl.QUERY_ENCODE_SET, true, false, true, false, null, 211, null)) != null) {
                list = companion.toQueryNamesAndValues$okhttp(canonicalize$okhttp$default);
            } else {
                list = null;
            }
            this.encodedQueryNamesAndValues = list;
            return this;
        }

        public final Builder encodedUsername(String encodedUsername) {
            k.e(encodedUsername, "encodedUsername");
            this.encodedUsername = Companion.canonicalize$okhttp$default(HttpUrl.Companion, encodedUsername, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 243, null);
            return this;
        }

        public final Builder fragment(String str) {
            String str2;
            if (str != null) {
                str2 = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, HttpUrl.FRAGMENT_ENCODE_SET, false, false, false, true, null, 187, null);
            } else {
                str2 = null;
            }
            this.encodedFragment = str2;
            return this;
        }

        public final String getEncodedFragment$okhttp() {
            return this.encodedFragment;
        }

        public final String getEncodedPassword$okhttp() {
            return this.encodedPassword;
        }

        public final List<String> getEncodedPathSegments$okhttp() {
            return this.encodedPathSegments;
        }

        public final List<String> getEncodedQueryNamesAndValues$okhttp() {
            return this.encodedQueryNamesAndValues;
        }

        public final String getEncodedUsername$okhttp() {
            return this.encodedUsername;
        }

        public final String getHost$okhttp() {
            return this.host;
        }

        public final int getPort$okhttp() {
            return this.port;
        }

        public final String getScheme$okhttp() {
            return this.scheme;
        }

        public final Builder host(String host) {
            k.e(host, "host");
            String canonicalHost = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(HttpUrl.Companion, host, 0, 0, false, 7, null));
            if (canonicalHost != null) {
                this.host = canonicalHost;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: ".concat(host));
        }

        public final Builder parse$okhttp(HttpUrl httpUrl, String str) {
            String str2;
            int delimiterOffset;
            char c10;
            int i6;
            String str3;
            int i10;
            String str4;
            int i11;
            int i12;
            char c11;
            int i13;
            String input = str;
            k.e(input, "input");
            int indexOfFirstNonAsciiWhitespace$default = Util.indexOfFirstNonAsciiWhitespace$default(input, 0, 0, 3, null);
            int indexOfLastNonAsciiWhitespace$default = Util.indexOfLastNonAsciiWhitespace$default(input, indexOfFirstNonAsciiWhitespace$default, 0, 2, null);
            Companion companion = Companion;
            int schemeDelimiterOffset = companion.schemeDelimiterOffset(input, indexOfFirstNonAsciiWhitespace$default, indexOfLastNonAsciiWhitespace$default);
            String str5 = "this as java.lang.String…ing(startIndex, endIndex)";
            char c12 = 65535;
            if (schemeDelimiterOffset != -1) {
                if (u.G(indexOfFirstNonAsciiWhitespace$default, input, "https:", true)) {
                    this.scheme = HttpRequest.DEFAULT_SCHEME;
                    indexOfFirstNonAsciiWhitespace$default += 6;
                } else if (u.G(indexOfFirstNonAsciiWhitespace$default, input, "http:", true)) {
                    this.scheme = "http";
                    indexOfFirstNonAsciiWhitespace$default += 5;
                } else {
                    StringBuilder sb2 = new StringBuilder("Expected URL scheme 'http' or 'https' but was '");
                    String substring = input.substring(0, schemeDelimiterOffset);
                    k.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    sb2.append(substring);
                    sb2.append('\'');
                    throw new IllegalArgumentException(sb2.toString());
                }
            } else if (httpUrl != null) {
                this.scheme = httpUrl.scheme();
            } else {
                if (input.length() > 6) {
                    str2 = m.l0(6, input).concat("...");
                } else {
                    str2 = input;
                }
                throw new IllegalArgumentException(r4.a.k("Expected URL scheme 'http' or 'https' but no scheme was found for ", str2));
            }
            int slashCount = companion.slashCount(input, indexOfFirstNonAsciiWhitespace$default, indexOfLastNonAsciiWhitespace$default);
            char c13 = '?';
            char c14 = '#';
            if (slashCount < 2 && httpUrl != null && k.a(httpUrl.scheme(), this.scheme)) {
                this.encodedUsername = httpUrl.encodedUsername();
                this.encodedPassword = httpUrl.encodedPassword();
                this.host = httpUrl.host();
                this.port = httpUrl.port();
                this.encodedPathSegments.clear();
                this.encodedPathSegments.addAll(httpUrl.encodedPathSegments());
                if (indexOfFirstNonAsciiWhitespace$default == indexOfLastNonAsciiWhitespace$default || input.charAt(indexOfFirstNonAsciiWhitespace$default) == '#') {
                    encodedQuery(httpUrl.encodedQuery());
                }
                i6 = indexOfLastNonAsciiWhitespace$default;
            } else {
                int i14 = indexOfFirstNonAsciiWhitespace$default + slashCount;
                boolean z10 = false;
                boolean z11 = false;
                while (true) {
                    delimiterOffset = Util.delimiterOffset(input, "@/\\?#", i14, indexOfLastNonAsciiWhitespace$default);
                    if (delimiterOffset != indexOfLastNonAsciiWhitespace$default) {
                        c10 = input.charAt(delimiterOffset);
                    } else {
                        c10 = 65535;
                    }
                    if (c10 == c12 || c10 == c14 || c10 == '/' || c10 == '\\' || c10 == c13) {
                        break;
                    }
                    if (c10 == '@') {
                        if (!z10) {
                            int delimiterOffset2 = Util.delimiterOffset(input, ':', i14, delimiterOffset);
                            Companion companion2 = HttpUrl.Companion;
                            i10 = indexOfLastNonAsciiWhitespace$default;
                            str4 = str5;
                            String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(companion2, input, i14, delimiterOffset2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                            if (z11) {
                                canonicalize$okhttp$default = this.encodedUsername + "%40" + canonicalize$okhttp$default;
                            }
                            this.encodedUsername = canonicalize$okhttp$default;
                            if (delimiterOffset2 != delimiterOffset) {
                                i12 = delimiterOffset;
                                this.encodedPassword = Companion.canonicalize$okhttp$default(companion2, str, delimiterOffset2 + 1, i12, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                                z10 = true;
                            } else {
                                i12 = delimiterOffset;
                            }
                            input = str;
                            i11 = i12;
                            z11 = true;
                        } else {
                            i10 = indexOfLastNonAsciiWhitespace$default;
                            str4 = str5;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(this.encodedPassword);
                            sb3.append("%40");
                            input = str;
                            i11 = delimiterOffset;
                            sb3.append(Companion.canonicalize$okhttp$default(HttpUrl.Companion, input, i14, delimiterOffset, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null));
                            this.encodedPassword = sb3.toString();
                        }
                        i14 = i11 + 1;
                        indexOfLastNonAsciiWhitespace$default = i10;
                        str5 = str4;
                        c13 = '?';
                        c12 = 65535;
                        c14 = '#';
                    }
                }
                i6 = indexOfLastNonAsciiWhitespace$default;
                String str6 = str5;
                Companion companion3 = Companion;
                int portColonOffset = companion3.portColonOffset(input, i14, delimiterOffset);
                int i15 = portColonOffset + 1;
                if (i15 < delimiterOffset) {
                    this.host = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(HttpUrl.Companion, input, i14, portColonOffset, false, 4, null));
                    int parsePort = companion3.parsePort(input, i15, delimiterOffset);
                    this.port = parsePort;
                    if (parsePort != -1) {
                        str3 = str6;
                    } else {
                        StringBuilder sb4 = new StringBuilder("Invalid URL port: \"");
                        String substring2 = input.substring(i15, delimiterOffset);
                        k.d(substring2, str6);
                        sb4.append(substring2);
                        sb4.append('\"');
                        throw new IllegalArgumentException(sb4.toString().toString());
                    }
                } else {
                    str3 = str6;
                    Companion companion4 = HttpUrl.Companion;
                    this.host = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(companion4, input, i14, portColonOffset, false, 4, null));
                    String str7 = this.scheme;
                    k.b(str7);
                    this.port = companion4.defaultPort(str7);
                }
                if (this.host != null) {
                    indexOfFirstNonAsciiWhitespace$default = delimiterOffset;
                } else {
                    StringBuilder sb5 = new StringBuilder("Invalid URL host: \"");
                    String substring3 = input.substring(i14, portColonOffset);
                    k.d(substring3, str3);
                    sb5.append(substring3);
                    sb5.append('\"');
                    throw new IllegalArgumentException(sb5.toString().toString());
                }
            }
            int i16 = i6;
            int delimiterOffset3 = Util.delimiterOffset(input, "?#", indexOfFirstNonAsciiWhitespace$default, i16);
            resolvePath(input, indexOfFirstNonAsciiWhitespace$default, delimiterOffset3);
            if (delimiterOffset3 < i16 && input.charAt(delimiterOffset3) == '?') {
                c11 = '#';
                int delimiterOffset4 = Util.delimiterOffset(input, '#', delimiterOffset3, i16);
                Companion companion5 = HttpUrl.Companion;
                this.encodedQueryNamesAndValues = companion5.toQueryNamesAndValues$okhttp(Companion.canonicalize$okhttp$default(companion5, input, delimiterOffset3 + 1, delimiterOffset4, HttpUrl.QUERY_ENCODE_SET, true, false, true, false, null, 208, null));
                i13 = delimiterOffset4;
            } else {
                c11 = '#';
                i13 = delimiterOffset3;
            }
            if (i13 < i16 && input.charAt(i13) == c11) {
                this.encodedFragment = Companion.canonicalize$okhttp$default(HttpUrl.Companion, input, i13 + 1, i16, HttpUrl.FRAGMENT_ENCODE_SET, true, false, false, true, null, 176, null);
            }
            return this;
        }

        public final Builder password(String password) {
            k.e(password, "password");
            this.encodedPassword = Companion.canonicalize$okhttp$default(HttpUrl.Companion, password, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }

        public final Builder port(int i6) {
            if (1 <= i6 && i6 < 65536) {
                this.port = i6;
                return this;
            }
            throw new IllegalArgumentException(c.i(i6, "unexpected port: ").toString());
        }

        public final Builder query(String str) {
            List<String> list;
            Companion companion;
            String canonicalize$okhttp$default;
            if (str != null && (canonicalize$okhttp$default = Companion.canonicalize$okhttp$default((companion = HttpUrl.Companion), str, 0, 0, HttpUrl.QUERY_ENCODE_SET, false, false, true, false, null, 219, null)) != null) {
                list = companion.toQueryNamesAndValues$okhttp(canonicalize$okhttp$default);
            } else {
                list = null;
            }
            this.encodedQueryNamesAndValues = list;
            return this;
        }

        public final Builder reencodeForUri$okhttp() {
            String str;
            String str2;
            String str3 = this.host;
            String str4 = null;
            if (str3 != null) {
                Pattern compile = Pattern.compile("[\"<>^`{|}]");
                k.d(compile, "compile(...)");
                str = compile.matcher(str3).replaceAll(HttpUrl.FRAGMENT_ENCODE_SET);
                k.d(str, "replaceAll(...)");
            } else {
                str = null;
            }
            this.host = str;
            int size = this.encodedPathSegments.size();
            for (int i6 = 0; i6 < size; i6++) {
                List<String> list = this.encodedPathSegments;
                list.set(i6, Companion.canonicalize$okhttp$default(HttpUrl.Companion, list.get(i6), 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, true, true, false, false, null, 227, null));
            }
            List<String> list2 = this.encodedQueryNamesAndValues;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    String str5 = list2.get(i10);
                    if (str5 != null) {
                        str2 = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str5, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET_URI, true, true, true, false, null, 195, null);
                    } else {
                        str2 = null;
                    }
                    list2.set(i10, str2);
                }
            }
            String str6 = this.encodedFragment;
            if (str6 != null) {
                str4 = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str6, 0, 0, HttpUrl.FRAGMENT_ENCODE_SET_URI, true, true, false, true, null, 163, null);
            }
            this.encodedFragment = str4;
            return this;
        }

        public final Builder removeAllEncodedQueryParameters(String encodedName) {
            k.e(encodedName, "encodedName");
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(Companion.canonicalize$okhttp$default(HttpUrl.Companion, encodedName, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, 211, null));
            return this;
        }

        public final Builder removeAllQueryParameters(String name) {
            k.e(name, "name");
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(Companion.canonicalize$okhttp$default(HttpUrl.Companion, name, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, 219, null));
            return this;
        }

        public final Builder removePathSegment(int i6) {
            this.encodedPathSegments.remove(i6);
            if (this.encodedPathSegments.isEmpty()) {
                this.encodedPathSegments.add(HttpUrl.FRAGMENT_ENCODE_SET);
            }
            return this;
        }

        public final Builder scheme(String scheme) {
            k.e(scheme, "scheme");
            if (scheme.equalsIgnoreCase("http")) {
                this.scheme = "http";
                return this;
            }
            if (scheme.equalsIgnoreCase(HttpRequest.DEFAULT_SCHEME)) {
                this.scheme = HttpRequest.DEFAULT_SCHEME;
                return this;
            }
            throw new IllegalArgumentException("unexpected scheme: ".concat(scheme));
        }

        public final void setEncodedFragment$okhttp(String str) {
            this.encodedFragment = str;
        }

        public final void setEncodedPassword$okhttp(String str) {
            k.e(str, "<set-?>");
            this.encodedPassword = str;
        }

        public final Builder setEncodedPathSegment(int i6, String encodedPathSegment) {
            k.e(encodedPathSegment, "encodedPathSegment");
            String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, encodedPathSegment, 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET, true, false, false, false, null, 243, null);
            this.encodedPathSegments.set(i6, canonicalize$okhttp$default);
            if (!isDot(canonicalize$okhttp$default) && !isDotDot(canonicalize$okhttp$default)) {
                return this;
            }
            throw new IllegalArgumentException("unexpected path segment: ".concat(encodedPathSegment).toString());
        }

        public final void setEncodedQueryNamesAndValues$okhttp(List<String> list) {
            this.encodedQueryNamesAndValues = list;
        }

        public final Builder setEncodedQueryParameter(String encodedName, String str) {
            k.e(encodedName, "encodedName");
            removeAllEncodedQueryParameters(encodedName);
            addEncodedQueryParameter(encodedName, str);
            return this;
        }

        public final void setEncodedUsername$okhttp(String str) {
            k.e(str, "<set-?>");
            this.encodedUsername = str;
        }

        public final void setHost$okhttp(String str) {
            this.host = str;
        }

        public final Builder setPathSegment(int i6, String pathSegment) {
            k.e(pathSegment, "pathSegment");
            String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, pathSegment, 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET, false, false, false, false, null, 251, null);
            if (!isDot(canonicalize$okhttp$default) && !isDotDot(canonicalize$okhttp$default)) {
                this.encodedPathSegments.set(i6, canonicalize$okhttp$default);
                return this;
            }
            throw new IllegalArgumentException("unexpected path segment: ".concat(pathSegment).toString());
        }

        public final void setPort$okhttp(int i6) {
            this.port = i6;
        }

        public final Builder setQueryParameter(String name, String str) {
            k.e(name, "name");
            removeAllQueryParameters(name);
            addQueryParameter(name, str);
            return this;
        }

        public final void setScheme$okhttp(String str) {
            this.scheme = str;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            String str = this.scheme;
            if (str != null) {
                sb2.append(str);
                sb2.append("://");
            } else {
                sb2.append("//");
            }
            if (this.encodedUsername.length() > 0 || this.encodedPassword.length() > 0) {
                sb2.append(this.encodedUsername);
                if (this.encodedPassword.length() > 0) {
                    sb2.append(':');
                    sb2.append(this.encodedPassword);
                }
                sb2.append('@');
            }
            String str2 = this.host;
            if (str2 != null) {
                if (m.J(str2, ':')) {
                    sb2.append('[');
                    sb2.append(this.host);
                    sb2.append(']');
                } else {
                    sb2.append(this.host);
                }
            }
            if (this.port != -1 || this.scheme != null) {
                int effectivePort = effectivePort();
                String str3 = this.scheme;
                if (str3 == null || effectivePort != HttpUrl.Companion.defaultPort(str3)) {
                    sb2.append(':');
                    sb2.append(effectivePort);
                }
            }
            Companion companion = HttpUrl.Companion;
            companion.toPathString$okhttp(this.encodedPathSegments, sb2);
            if (this.encodedQueryNamesAndValues != null) {
                sb2.append('?');
                List<String> list = this.encodedQueryNamesAndValues;
                k.b(list);
                companion.toQueryString$okhttp(list, sb2);
            }
            if (this.encodedFragment != null) {
                sb2.append('#');
                sb2.append(this.encodedFragment);
            }
            String sb3 = sb2.toString();
            k.d(sb3, "StringBuilder().apply(builderAction).toString()");
            return sb3;
        }

        public final Builder username(String username) {
            k.e(username, "username");
            this.encodedUsername = Companion.canonicalize$okhttp$default(HttpUrl.Companion, username, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }

        private final Builder addPathSegments(String str, boolean z10) {
            int i6 = 0;
            while (true) {
                int delimiterOffset = Util.delimiterOffset(str, "/\\", i6, str.length());
                String str2 = str;
                boolean z11 = z10;
                push(str2, i6, delimiterOffset, delimiterOffset < str.length(), z11);
                i6 = delimiterOffset + 1;
                if (i6 > str2.length()) {
                    return this;
                }
                str = str2;
                z10 = z11;
            }
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public static /* synthetic */ String canonicalize$okhttp$default(Companion companion, String str, int i6, int i10, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i6 = 0;
            }
            if ((i11 & 2) != 0) {
                i10 = str.length();
            }
            if ((i11 & 8) != 0) {
                z10 = false;
            }
            if ((i11 & 16) != 0) {
                z11 = false;
            }
            if ((i11 & 32) != 0) {
                z12 = false;
            }
            if ((i11 & 64) != 0) {
                z13 = false;
            }
            if ((i11 & 128) != 0) {
                charset = null;
            }
            return companion.canonicalize$okhttp(str, i6, i10, str2, z10, z11, z12, z13, charset);
        }

        private final boolean isPercentEncoded(String str, int i6, int i10) {
            int i11 = i6 + 2;
            if (i11 < i10 && str.charAt(i6) == '%' && Util.parseHexDigit(str.charAt(i6 + 1)) != -1 && Util.parseHexDigit(str.charAt(i11)) != -1) {
                return true;
            }
            return false;
        }

        public static /* synthetic */ String percentDecode$okhttp$default(Companion companion, String str, int i6, int i10, boolean z10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i6 = 0;
            }
            if ((i11 & 2) != 0) {
                i10 = str.length();
            }
            if ((i11 & 4) != 0) {
                z10 = false;
            }
            return companion.percentDecode$okhttp(str, i6, i10, z10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0 */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v2, types: [bg.k] */
        /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v4 */
        /* JADX WARN: Type inference failed for: r1v5 */
        private final void writeCanonicalized(bg.k kVar, String str, int i6, int i10, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) {
            String str3;
            ?? r12 = 0;
            while (i6 < i10) {
                int codePointAt = str.codePointAt(i6);
                if (!z10 || (codePointAt != 9 && codePointAt != 10 && codePointAt != 12 && codePointAt != 13)) {
                    if (codePointAt == 43 && z12) {
                        if (z10) {
                            str3 = "+";
                        } else {
                            str3 = "%2B";
                        }
                        kVar.s0(str3);
                    } else if (codePointAt >= 32 && codePointAt != 127 && ((codePointAt < 128 || z13) && !m.J(str2, (char) codePointAt) && (codePointAt != 37 || (z10 && (!z11 || isPercentEncoded(str, i6, i10)))))) {
                        kVar.u0(codePointAt);
                    } else {
                        if (r12 == 0) {
                            r12 = new Object();
                        }
                        if (charset != null && !charset.equals(StandardCharsets.UTF_8)) {
                            r12.r0(str, i6, Character.charCount(codePointAt) + i6, charset);
                        } else {
                            r12.u0(codePointAt);
                        }
                        while (!r12.r()) {
                            byte readByte = r12.readByte();
                            kVar.l0(37);
                            kVar.l0(HttpUrl.HEX_DIGITS[((readByte & 255) >> 4) & 15]);
                            kVar.l0(HttpUrl.HEX_DIGITS[readByte & 15]);
                        }
                    }
                }
                i6 += Character.charCount(codePointAt);
                r12 = r12;
            }
        }

        private final void writePercentDecoded(bg.k kVar, String str, int i6, int i10, boolean z10) {
            int i11;
            while (i6 < i10) {
                int codePointAt = str.codePointAt(i6);
                if (codePointAt == 37 && (i11 = i6 + 2) < i10) {
                    int parseHexDigit = Util.parseHexDigit(str.charAt(i6 + 1));
                    int parseHexDigit2 = Util.parseHexDigit(str.charAt(i11));
                    if (parseHexDigit != -1 && parseHexDigit2 != -1) {
                        kVar.l0((parseHexDigit << 4) + parseHexDigit2);
                        i6 = Character.charCount(codePointAt) + i11;
                    }
                    kVar.u0(codePointAt);
                    i6 += Character.charCount(codePointAt);
                } else {
                    if (codePointAt == 43 && z10) {
                        kVar.l0(32);
                        i6++;
                    }
                    kVar.u0(codePointAt);
                    i6 += Character.charCount(codePointAt);
                }
            }
        }

        /* renamed from: -deprecated_get, reason: not valid java name */
        public final HttpUrl m228deprecated_get(String url) {
            k.e(url, "url");
            return get(url);
        }

        /* renamed from: -deprecated_parse, reason: not valid java name */
        public final HttpUrl m231deprecated_parse(String url) {
            k.e(url, "url");
            return parse(url);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, bg.k] */
        public final String canonicalize$okhttp(String str, int i6, int i10, String encodeSet, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) {
            k.e(str, "<this>");
            k.e(encodeSet, "encodeSet");
            int i11 = i6;
            while (i11 < i10) {
                int codePointAt = str.codePointAt(i11);
                if (codePointAt >= 32 && codePointAt != 127 && ((codePointAt < 128 || z13) && !m.J(encodeSet, (char) codePointAt) && ((codePointAt != 37 || (z10 && (!z11 || isPercentEncoded(str, i11, i10)))) && (codePointAt != 43 || !z12)))) {
                    i11 += Character.charCount(codePointAt);
                } else {
                    ?? obj = new Object();
                    obj.t0(str, i6, i11);
                    writeCanonicalized(obj, str, i11, i10, encodeSet, z10, z11, z12, z13, charset);
                    return obj.h0();
                }
            }
            String substring = str.substring(i6, i10);
            k.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }

        public final int defaultPort(String scheme) {
            k.e(scheme, "scheme");
            if (scheme.equals("http")) {
                return 80;
            }
            if (scheme.equals(HttpRequest.DEFAULT_SCHEME)) {
                return 443;
            }
            return -1;
        }

        public final HttpUrl get(String str) {
            k.e(str, "<this>");
            return new Builder().parse$okhttp(null, str).build();
        }

        public final HttpUrl parse(String str) {
            k.e(str, "<this>");
            try {
                return get(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, bg.k] */
        public final String percentDecode$okhttp(String str, int i6, int i10, boolean z10) {
            k.e(str, "<this>");
            for (int i11 = i6; i11 < i10; i11++) {
                char charAt = str.charAt(i11);
                if (charAt == '%' || (charAt == '+' && z10)) {
                    ?? obj = new Object();
                    obj.t0(str, i6, i11);
                    writePercentDecoded(obj, str, i11, i10, z10);
                    return obj.h0();
                }
            }
            String substring = str.substring(i6, i10);
            k.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }

        public final void toPathString$okhttp(List<String> list, StringBuilder out) {
            k.e(list, "<this>");
            k.e(out, "out");
            int size = list.size();
            for (int i6 = 0; i6 < size; i6++) {
                out.append('/');
                out.append(list.get(i6));
            }
        }

        public final List<String> toQueryNamesAndValues$okhttp(String str) {
            k.e(str, "<this>");
            ArrayList arrayList = new ArrayList();
            int i6 = 0;
            while (i6 <= str.length()) {
                int P = m.P(str, '&', i6, 4);
                if (P == -1) {
                    P = str.length();
                }
                int P2 = m.P(str, '=', i6, 4);
                if (P2 != -1 && P2 <= P) {
                    String substring = str.substring(i6, P2);
                    k.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(substring);
                    String substring2 = str.substring(P2 + 1, P);
                    k.d(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(substring2);
                } else {
                    String substring3 = str.substring(i6, P);
                    k.d(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(substring3);
                    arrayList.add(null);
                }
                i6 = P + 1;
            }
            return arrayList;
        }

        public final void toQueryString$okhttp(List<String> list, StringBuilder out) {
            k.e(list, "<this>");
            k.e(out, "out");
            af.a u3 = b.u(b.w(0, list.size()), 2);
            int i6 = u3.f709x;
            int i10 = u3.f710y;
            int i11 = u3.f711z;
            if ((i11 <= 0 || i6 > i10) && (i11 >= 0 || i10 > i6)) {
                return;
            }
            while (true) {
                String str = list.get(i6);
                String str2 = list.get(i6 + 1);
                if (i6 > 0) {
                    out.append('&');
                }
                out.append(str);
                if (str2 != null) {
                    out.append('=');
                    out.append(str2);
                }
                if (i6 != i10) {
                    i6 += i11;
                } else {
                    return;
                }
            }
        }

        private Companion() {
        }

        /* renamed from: -deprecated_get, reason: not valid java name */
        public final HttpUrl m230deprecated_get(URL url) {
            k.e(url, "url");
            return get(url);
        }

        public final HttpUrl get(URL url) {
            k.e(url, "<this>");
            String url2 = url.toString();
            k.d(url2, "toString()");
            return parse(url2);
        }

        /* renamed from: -deprecated_get, reason: not valid java name */
        public final HttpUrl m229deprecated_get(URI uri) {
            k.e(uri, "uri");
            return get(uri);
        }

        public final HttpUrl get(URI uri) {
            k.e(uri, "<this>");
            String uri2 = uri.toString();
            k.d(uri2, "toString()");
            return parse(uri2);
        }
    }

    public HttpUrl(String scheme, String username, String password, String host, int i6, List<String> pathSegments, List<String> list, String str, String url) {
        k.e(scheme, "scheme");
        k.e(username, "username");
        k.e(password, "password");
        k.e(host, "host");
        k.e(pathSegments, "pathSegments");
        k.e(url, "url");
        this.scheme = scheme;
        this.username = username;
        this.password = password;
        this.host = host;
        this.port = i6;
        this.pathSegments = pathSegments;
        this.queryNamesAndValues = list;
        this.fragment = str;
        this.url = url;
        this.isHttps = k.a(scheme, HttpRequest.DEFAULT_SCHEME);
    }

    public static final int defaultPort(String str) {
        return Companion.defaultPort(str);
    }

    public static final HttpUrl get(String str) {
        return Companion.get(str);
    }

    public static final HttpUrl parse(String str) {
        return Companion.parse(str);
    }

    /* renamed from: -deprecated_encodedFragment, reason: not valid java name */
    public final String m209deprecated_encodedFragment() {
        return encodedFragment();
    }

    /* renamed from: -deprecated_encodedPassword, reason: not valid java name */
    public final String m210deprecated_encodedPassword() {
        return encodedPassword();
    }

    /* renamed from: -deprecated_encodedPath, reason: not valid java name */
    public final String m211deprecated_encodedPath() {
        return encodedPath();
    }

    /* renamed from: -deprecated_encodedPathSegments, reason: not valid java name */
    public final List<String> m212deprecated_encodedPathSegments() {
        return encodedPathSegments();
    }

    /* renamed from: -deprecated_encodedQuery, reason: not valid java name */
    public final String m213deprecated_encodedQuery() {
        return encodedQuery();
    }

    /* renamed from: -deprecated_encodedUsername, reason: not valid java name */
    public final String m214deprecated_encodedUsername() {
        return encodedUsername();
    }

    /* renamed from: -deprecated_fragment, reason: not valid java name */
    public final String m215deprecated_fragment() {
        return this.fragment;
    }

    /* renamed from: -deprecated_host, reason: not valid java name */
    public final String m216deprecated_host() {
        return this.host;
    }

    /* renamed from: -deprecated_password, reason: not valid java name */
    public final String m217deprecated_password() {
        return this.password;
    }

    /* renamed from: -deprecated_pathSegments, reason: not valid java name */
    public final List<String> m218deprecated_pathSegments() {
        return this.pathSegments;
    }

    /* renamed from: -deprecated_pathSize, reason: not valid java name */
    public final int m219deprecated_pathSize() {
        return pathSize();
    }

    /* renamed from: -deprecated_port, reason: not valid java name */
    public final int m220deprecated_port() {
        return this.port;
    }

    /* renamed from: -deprecated_query, reason: not valid java name */
    public final String m221deprecated_query() {
        return query();
    }

    /* renamed from: -deprecated_queryParameterNames, reason: not valid java name */
    public final Set<String> m222deprecated_queryParameterNames() {
        return queryParameterNames();
    }

    /* renamed from: -deprecated_querySize, reason: not valid java name */
    public final int m223deprecated_querySize() {
        return querySize();
    }

    /* renamed from: -deprecated_scheme, reason: not valid java name */
    public final String m224deprecated_scheme() {
        return this.scheme;
    }

    /* renamed from: -deprecated_uri, reason: not valid java name */
    public final URI m225deprecated_uri() {
        return uri();
    }

    /* renamed from: -deprecated_url, reason: not valid java name */
    public final URL m226deprecated_url() {
        return url();
    }

    /* renamed from: -deprecated_username, reason: not valid java name */
    public final String m227deprecated_username() {
        return this.username;
    }

    public final String encodedFragment() {
        if (this.fragment == null) {
            return null;
        }
        String substring = this.url.substring(m.P(this.url, '#', 0, 6) + 1);
        k.d(substring, "this as java.lang.String).substring(startIndex)");
        return substring;
    }

    public final String encodedPassword() {
        if (this.password.length() == 0) {
            return FRAGMENT_ENCODE_SET;
        }
        String substring = this.url.substring(m.P(this.url, ':', this.scheme.length() + 3, 4) + 1, m.P(this.url, '@', 0, 6));
        k.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String encodedPath() {
        int P = m.P(this.url, '/', this.scheme.length() + 3, 4);
        String str = this.url;
        String substring = this.url.substring(P, Util.delimiterOffset(str, "?#", P, str.length()));
        k.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final List<String> encodedPathSegments() {
        int P = m.P(this.url, '/', this.scheme.length() + 3, 4);
        String str = this.url;
        int delimiterOffset = Util.delimiterOffset(str, "?#", P, str.length());
        ArrayList arrayList = new ArrayList();
        while (P < delimiterOffset) {
            int i6 = P + 1;
            int delimiterOffset2 = Util.delimiterOffset(this.url, '/', i6, delimiterOffset);
            String substring = this.url.substring(i6, delimiterOffset2);
            k.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(substring);
            P = delimiterOffset2;
        }
        return arrayList;
    }

    public final String encodedQuery() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        int P = m.P(this.url, '?', 0, 6) + 1;
        String str = this.url;
        String substring = this.url.substring(P, Util.delimiterOffset(str, '#', P, str.length()));
        k.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String encodedUsername() {
        if (this.username.length() == 0) {
            return FRAGMENT_ENCODE_SET;
        }
        int length = this.scheme.length() + 3;
        String str = this.url;
        String substring = this.url.substring(length, Util.delimiterOffset(str, ":@", length, str.length()));
        k.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof HttpUrl) && k.a(((HttpUrl) obj).url, this.url)) {
            return true;
        }
        return false;
    }

    public final String fragment() {
        return this.fragment;
    }

    public int hashCode() {
        return this.url.hashCode();
    }

    public final String host() {
        return this.host;
    }

    public final boolean isHttps() {
        return this.isHttps;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.setScheme$okhttp(this.scheme);
        builder.setEncodedUsername$okhttp(encodedUsername());
        builder.setEncodedPassword$okhttp(encodedPassword());
        builder.setHost$okhttp(this.host);
        builder.setPort$okhttp(this.port != Companion.defaultPort(this.scheme) ? this.port : -1);
        builder.getEncodedPathSegments$okhttp().clear();
        builder.getEncodedPathSegments$okhttp().addAll(encodedPathSegments());
        builder.encodedQuery(encodedQuery());
        builder.setEncodedFragment$okhttp(encodedFragment());
        return builder;
    }

    public final String password() {
        return this.password;
    }

    public final List<String> pathSegments() {
        return this.pathSegments;
    }

    public final int pathSize() {
        return this.pathSegments.size();
    }

    public final int port() {
        return this.port;
    }

    public final String query() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        Companion.toQueryString$okhttp(this.queryNamesAndValues, sb2);
        return sb2.toString();
    }

    public final String queryParameter(String name) {
        k.e(name, "name");
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            af.a u3 = b.u(b.w(0, list.size()), 2);
            int i6 = u3.f709x;
            int i10 = u3.f710y;
            int i11 = u3.f711z;
            if ((i11 > 0 && i6 <= i10) || (i11 < 0 && i10 <= i6)) {
                while (!name.equals(this.queryNamesAndValues.get(i6))) {
                    if (i6 != i10) {
                        i6 += i11;
                    } else {
                        return null;
                    }
                }
                return this.queryNamesAndValues.get(i6 + 1);
            }
            return null;
        }
        return null;
    }

    public final String queryParameterName(int i6) {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            String str = list.get(i6 * 2);
            k.b(str);
            return str;
        }
        throw new IndexOutOfBoundsException();
    }

    public final Set<String> queryParameterNames() {
        if (this.queryNamesAndValues == null) {
            return t.f6848x;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        af.a u3 = b.u(b.w(0, this.queryNamesAndValues.size()), 2);
        int i6 = u3.f709x;
        int i10 = u3.f710y;
        int i11 = u3.f711z;
        if ((i11 > 0 && i6 <= i10) || (i11 < 0 && i10 <= i6)) {
            while (true) {
                String str = this.queryNamesAndValues.get(i6);
                k.b(str);
                linkedHashSet.add(str);
                if (i6 == i10) {
                    break;
                }
                i6 += i11;
            }
        }
        Set<String> unmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        k.d(unmodifiableSet, "unmodifiableSet(result)");
        return unmodifiableSet;
    }

    public final String queryParameterValue(int i6) {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.get((i6 * 2) + 1);
        }
        throw new IndexOutOfBoundsException();
    }

    public final List<String> queryParameterValues(String name) {
        k.e(name, "name");
        if (this.queryNamesAndValues == null) {
            return r.f6846x;
        }
        ArrayList arrayList = new ArrayList();
        af.a u3 = b.u(b.w(0, this.queryNamesAndValues.size()), 2);
        int i6 = u3.f709x;
        int i10 = u3.f710y;
        int i11 = u3.f711z;
        if ((i11 > 0 && i6 <= i10) || (i11 < 0 && i10 <= i6)) {
            while (true) {
                if (name.equals(this.queryNamesAndValues.get(i6))) {
                    arrayList.add(this.queryNamesAndValues.get(i6 + 1));
                }
                if (i6 == i10) {
                    break;
                }
                i6 += i11;
            }
        }
        List<String> unmodifiableList = Collections.unmodifiableList(arrayList);
        k.d(unmodifiableList, "unmodifiableList(result)");
        return unmodifiableList;
    }

    public final int querySize() {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    public final String redact() {
        Builder newBuilder = newBuilder("/...");
        k.b(newBuilder);
        return newBuilder.username(FRAGMENT_ENCODE_SET).password(FRAGMENT_ENCODE_SET).build().toString();
    }

    public final HttpUrl resolve(String link) {
        k.e(link, "link");
        Builder newBuilder = newBuilder(link);
        if (newBuilder != null) {
            return newBuilder.build();
        }
        return null;
    }

    public final String scheme() {
        return this.scheme;
    }

    public String toString() {
        return this.url;
    }

    public final String topPrivateDomain() {
        if (Util.canParseAsIpAddress(this.host)) {
            return null;
        }
        return PublicSuffixDatabase.Companion.get().getEffectiveTldPlusOne(this.host);
    }

    public final URI uri() {
        String input = newBuilder().reencodeForUri$okhttp().toString();
        try {
            return new URI(input);
        } catch (URISyntaxException e10) {
            try {
                Pattern compile = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                k.d(compile, "compile(...)");
                k.e(input, "input");
                String replaceAll = compile.matcher(input).replaceAll(FRAGMENT_ENCODE_SET);
                k.d(replaceAll, "replaceAll(...)");
                URI create = URI.create(replaceAll);
                k.d(create, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final URL url() {
        try {
            return new URL(this.url);
        } catch (MalformedURLException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final String username() {
        return this.username;
    }

    public static final HttpUrl get(URI uri) {
        return Companion.get(uri);
    }

    public static final HttpUrl get(URL url) {
        return Companion.get(url);
    }

    public final Builder newBuilder(String link) {
        k.e(link, "link");
        try {
            return new Builder().parse$okhttp(this, link);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
