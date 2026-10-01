package okhttp3;

import df.u;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.k;
import r4.a;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class MediaType {
    private static final String QUOTED = "\"([^\"]*)\"";
    private static final String TOKEN = "([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)";
    private final String mediaType;
    private final String[] parameterNamesAndValues;
    private final String subtype;
    private final String type;
    public static final Companion Companion = new Companion(null);
    private static final Pattern TYPE_SUBTYPE = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    private static final Pattern PARAMETER = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        /* renamed from: -deprecated_get, reason: not valid java name */
        public final MediaType m234deprecated_get(String mediaType) {
            k.e(mediaType, "mediaType");
            return get(mediaType);
        }

        /* renamed from: -deprecated_parse, reason: not valid java name */
        public final MediaType m235deprecated_parse(String mediaType) {
            k.e(mediaType, "mediaType");
            return parse(mediaType);
        }

        public final MediaType get(String str) {
            k.e(str, "<this>");
            Matcher matcher = MediaType.TYPE_SUBTYPE.matcher(str);
            if (matcher.lookingAt()) {
                String group = matcher.group(1);
                k.d(group, "typeSubtype.group(1)");
                Locale US = Locale.US;
                k.d(US, "US");
                String lowerCase = group.toLowerCase(US);
                k.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                String group2 = matcher.group(2);
                k.d(group2, "typeSubtype.group(2)");
                String lowerCase2 = group2.toLowerCase(US);
                k.d(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                ArrayList arrayList = new ArrayList();
                Matcher matcher2 = MediaType.PARAMETER.matcher(str);
                int end = matcher.end();
                while (end < str.length()) {
                    matcher2.region(end, str.length());
                    if (matcher2.lookingAt()) {
                        String group3 = matcher2.group(1);
                        if (group3 == null) {
                            end = matcher2.end();
                        } else {
                            String group4 = matcher2.group(2);
                            if (group4 == null) {
                                group4 = matcher2.group(3);
                            } else if (u.H(group4, "'", false) && u.z(group4, "'", false) && group4.length() > 2) {
                                group4 = group4.substring(1, group4.length() - 1);
                                k.d(group4, "this as java.lang.String…ing(startIndex, endIndex)");
                            }
                            arrayList.add(group3);
                            arrayList.add(group4);
                            end = matcher2.end();
                        }
                    } else {
                        StringBuilder sb2 = new StringBuilder("Parameter is not formatted correctly: \"");
                        String substring = str.substring(end);
                        k.d(substring, "this as java.lang.String).substring(startIndex)");
                        sb2.append(substring);
                        sb2.append("\" for: \"");
                        throw new IllegalArgumentException(a.n(sb2, str, '\"').toString());
                    }
                }
                return new MediaType(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]), null);
            }
            throw new IllegalArgumentException(w8.k.b('\"', "No subtype found for: \"", str).toString());
        }

        public final MediaType parse(String str) {
            k.e(str, "<this>");
            try {
                return get(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        private Companion() {
        }
    }

    public /* synthetic */ MediaType(String str, String str2, String str3, String[] strArr, f fVar) {
        this(str, str2, str3, strArr);
    }

    public static /* synthetic */ Charset charset$default(MediaType mediaType, Charset charset, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            charset = null;
        }
        return mediaType.charset(charset);
    }

    public static final MediaType get(String str) {
        return Companion.get(str);
    }

    public static final MediaType parse(String str) {
        return Companion.parse(str);
    }

    /* renamed from: -deprecated_subtype, reason: not valid java name */
    public final String m232deprecated_subtype() {
        return this.subtype;
    }

    /* renamed from: -deprecated_type, reason: not valid java name */
    public final String m233deprecated_type() {
        return this.type;
    }

    public final Charset charset() {
        return charset$default(this, null, 1, null);
    }

    public boolean equals(Object obj) {
        if ((obj instanceof MediaType) && k.a(((MediaType) obj).mediaType, this.mediaType)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.mediaType.hashCode();
    }

    public final String parameter(String name) {
        k.e(name, "name");
        int i6 = 0;
        int l10 = a.a.l(0, this.parameterNamesAndValues.length - 1, 2);
        if (l10 >= 0) {
            while (!u.A(this.parameterNamesAndValues[i6], name, true)) {
                if (i6 != l10) {
                    i6 += 2;
                } else {
                    return null;
                }
            }
            return this.parameterNamesAndValues[i6 + 1];
        }
        return null;
    }

    public final String subtype() {
        return this.subtype;
    }

    public String toString() {
        return this.mediaType;
    }

    public final String type() {
        return this.type;
    }

    private MediaType(String str, String str2, String str3, String[] strArr) {
        this.mediaType = str;
        this.type = str2;
        this.subtype = str3;
        this.parameterNamesAndValues = strArr;
    }

    public final Charset charset(Charset charset) {
        String parameter = parameter("charset");
        if (parameter == null) {
            return charset;
        }
        try {
            return Charset.forName(parameter);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }
}
