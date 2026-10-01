package okhttp3;

import df.m;
import df.u;
import he.i;
import ie.r;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.z;
import okhttp3.internal.Util;
import okhttp3.internal.http.DatesKt;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import we.a;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class Headers implements Iterable<i>, a {
    public static final Companion Companion = new Companion(null);
    private final String[] namesAndValues;

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class Builder {
        private final List<String> namesAndValues = new ArrayList(20);

        public final Builder add(String line) {
            k.e(line, "line");
            int P = m.P(line, ':', 0, 6);
            if (P != -1) {
                String substring = line.substring(0, P);
                k.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                String obj = m.n0(substring).toString();
                String substring2 = line.substring(P + 1);
                k.d(substring2, "this as java.lang.String).substring(startIndex)");
                add(obj, substring2);
                return this;
            }
            throw new IllegalArgumentException("Unexpected header: ".concat(line).toString());
        }

        public final Builder addAll(Headers headers) {
            k.e(headers, "headers");
            int size = headers.size();
            for (int i6 = 0; i6 < size; i6++) {
                addLenient$okhttp(headers.name(i6), headers.value(i6));
            }
            return this;
        }

        public final Builder addLenient$okhttp(String line) {
            k.e(line, "line");
            int P = m.P(line, ':', 1, 4);
            if (P != -1) {
                String substring = line.substring(0, P);
                k.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                String substring2 = line.substring(P + 1);
                k.d(substring2, "this as java.lang.String).substring(startIndex)");
                addLenient$okhttp(substring, substring2);
                return this;
            }
            if (line.charAt(0) == ':') {
                String substring3 = line.substring(1);
                k.d(substring3, "this as java.lang.String).substring(startIndex)");
                addLenient$okhttp(HttpUrl.FRAGMENT_ENCODE_SET, substring3);
                return this;
            }
            addLenient$okhttp(HttpUrl.FRAGMENT_ENCODE_SET, line);
            return this;
        }

        public final Builder addUnsafeNonAscii(String name, String value) {
            k.e(name, "name");
            k.e(value, "value");
            Headers.Companion.checkName(name);
            addLenient$okhttp(name, value);
            return this;
        }

        public final Headers build() {
            return new Headers((String[]) this.namesAndValues.toArray(new String[0]), null);
        }

        public final String get(String name) {
            k.e(name, "name");
            int size = this.namesAndValues.size() - 2;
            int l10 = a.a.l(size, 0, -2);
            if (l10 <= size) {
                while (!name.equalsIgnoreCase(this.namesAndValues.get(size))) {
                    if (size != l10) {
                        size -= 2;
                    } else {
                        return null;
                    }
                }
                return this.namesAndValues.get(size + 1);
            }
            return null;
        }

        public final List<String> getNamesAndValues$okhttp() {
            return this.namesAndValues;
        }

        public final Builder removeAll(String name) {
            k.e(name, "name");
            int i6 = 0;
            while (i6 < this.namesAndValues.size()) {
                if (name.equalsIgnoreCase(this.namesAndValues.get(i6))) {
                    this.namesAndValues.remove(i6);
                    this.namesAndValues.remove(i6);
                    i6 -= 2;
                }
                i6 += 2;
            }
            return this;
        }

        public final Builder set(String name, Date value) {
            k.e(name, "name");
            k.e(value, "value");
            set(name, DatesKt.toHttpDateString(value));
            return this;
        }

        @IgnoreJRERequirement
        public final Builder set(String name, Instant value) {
            long epochMilli;
            k.e(name, "name");
            k.e(value, "value");
            epochMilli = value.toEpochMilli();
            return set(name, new Date(epochMilli));
        }

        public final Builder set(String name, String value) {
            k.e(name, "name");
            k.e(value, "value");
            Companion companion = Headers.Companion;
            companion.checkName(name);
            companion.checkValue(value, name);
            removeAll(name);
            addLenient$okhttp(name, value);
            return this;
        }

        public final Builder add(String name, String value) {
            k.e(name, "name");
            k.e(value, "value");
            Companion companion = Headers.Companion;
            companion.checkName(name);
            companion.checkValue(value, name);
            addLenient$okhttp(name, value);
            return this;
        }

        public final Builder add(String name, Date value) {
            k.e(name, "name");
            k.e(value, "value");
            add(name, DatesKt.toHttpDateString(value));
            return this;
        }

        public final Builder addLenient$okhttp(String name, String value) {
            k.e(name, "name");
            k.e(value, "value");
            this.namesAndValues.add(name);
            this.namesAndValues.add(m.n0(value).toString());
            return this;
        }

        @IgnoreJRERequirement
        public final Builder add(String name, Instant value) {
            long epochMilli;
            k.e(name, "name");
            k.e(value, "value");
            epochMilli = value.toEpochMilli();
            add(name, new Date(epochMilli));
            return this;
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void checkName(String str) {
            if (str.length() > 0) {
                int length = str.length();
                for (int i6 = 0; i6 < length; i6++) {
                    char charAt = str.charAt(i6);
                    if ('!' > charAt || charAt >= 127) {
                        throw new IllegalArgumentException(Util.format("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i6), str).toString());
                    }
                }
                return;
            }
            throw new IllegalArgumentException("name is empty");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void checkValue(String str, String str2) {
            String concat;
            int length = str.length();
            for (int i6 = 0; i6 < length; i6++) {
                char charAt = str.charAt(i6);
                if (charAt != '\t' && (' ' > charAt || charAt >= 127)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(Util.format("Unexpected char %#04x at %d in %s value", Integer.valueOf(charAt), Integer.valueOf(i6), str2));
                    if (Util.isSensitiveHeader(str2)) {
                        concat = HttpUrl.FRAGMENT_ENCODE_SET;
                    } else {
                        concat = ": ".concat(str);
                    }
                    sb2.append(concat);
                    throw new IllegalArgumentException(sb2.toString().toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String get(String[] strArr, String str) {
            int length = strArr.length - 2;
            int l10 = a.a.l(length, 0, -2);
            if (l10 <= length) {
                while (!u.A(str, strArr[length], true)) {
                    if (length != l10) {
                        length -= 2;
                    } else {
                        return null;
                    }
                }
                return strArr[length + 1];
            }
            return null;
        }

        /* renamed from: -deprecated_of, reason: not valid java name */
        public final Headers m208deprecated_of(String... namesAndValues) {
            k.e(namesAndValues, "namesAndValues");
            return of((String[]) Arrays.copyOf(namesAndValues, namesAndValues.length));
        }

        public final Headers of(String... namesAndValues) {
            k.e(namesAndValues, "namesAndValues");
            if (namesAndValues.length % 2 == 0) {
                String[] strArr = (String[]) namesAndValues.clone();
                int length = strArr.length;
                int i6 = 0;
                for (int i10 = 0; i10 < length; i10++) {
                    String str = strArr[i10];
                    if (str != null) {
                        strArr[i10] = m.n0(str).toString();
                    } else {
                        throw new IllegalArgumentException("Headers cannot be null");
                    }
                }
                int l10 = a.a.l(0, strArr.length - 1, 2);
                if (l10 >= 0) {
                    while (true) {
                        String str2 = strArr[i6];
                        String str3 = strArr[i6 + 1];
                        checkName(str2);
                        checkValue(str3, str2);
                        if (i6 == l10) {
                            break;
                        }
                        i6 += 2;
                    }
                }
                return new Headers(strArr, null);
            }
            throw new IllegalArgumentException("Expected alternating header names and values");
        }

        private Companion() {
        }

        /* renamed from: -deprecated_of, reason: not valid java name */
        public final Headers m207deprecated_of(Map<String, String> headers) {
            k.e(headers, "headers");
            return of(headers);
        }

        public final Headers of(Map<String, String> map) {
            k.e(map, "<this>");
            String[] strArr = new String[map.size() * 2];
            int i6 = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                String obj = m.n0(key).toString();
                String obj2 = m.n0(value).toString();
                checkName(obj);
                checkValue(obj2, obj);
                strArr[i6] = obj;
                strArr[i6 + 1] = obj2;
                i6 += 2;
            }
            return new Headers(strArr, null);
        }
    }

    public /* synthetic */ Headers(String[] strArr, f fVar) {
        this(strArr);
    }

    public static final Headers of(Map<String, String> map) {
        return Companion.of(map);
    }

    /* renamed from: -deprecated_size, reason: not valid java name */
    public final int m206deprecated_size() {
        return size();
    }

    public final long byteCount() {
        String[] strArr = this.namesAndValues;
        long length = strArr.length * 2;
        for (int i6 = 0; i6 < strArr.length; i6++) {
            length += this.namesAndValues[i6].length();
        }
        return length;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof Headers) && Arrays.equals(this.namesAndValues, ((Headers) obj).namesAndValues)) {
            return true;
        }
        return false;
    }

    public final String get(String name) {
        k.e(name, "name");
        return Companion.get(this.namesAndValues, name);
    }

    public final Date getDate(String name) {
        k.e(name, "name");
        String str = get(name);
        if (str != null) {
            return DatesKt.toHttpDateOrNull(str);
        }
        return null;
    }

    @IgnoreJRERequirement
    public final Instant getInstant(String name) {
        Instant instant;
        k.e(name, "name");
        Date date = getDate(name);
        if (date != null) {
            instant = date.toInstant();
            return instant;
        }
        return null;
    }

    public int hashCode() {
        return Arrays.hashCode(this.namesAndValues);
    }

    @Override // java.lang.Iterable
    public Iterator<i> iterator() {
        int size = size();
        i[] iVarArr = new i[size];
        for (int i6 = 0; i6 < size; i6++) {
            iVarArr[i6] = new i(name(i6), value(i6));
        }
        return z.e(iVarArr);
    }

    public final String name(int i6) {
        return this.namesAndValues[i6 * 2];
    }

    public final Set<String> names() {
        u.B();
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        int size = size();
        for (int i6 = 0; i6 < size; i6++) {
            treeSet.add(name(i6));
        }
        Set<String> unmodifiableSet = Collections.unmodifiableSet(treeSet);
        k.d(unmodifiableSet, "unmodifiableSet(result)");
        return unmodifiableSet;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        List<String> namesAndValues$okhttp = builder.getNamesAndValues$okhttp();
        String[] elements = this.namesAndValues;
        k.e(namesAndValues$okhttp, "<this>");
        k.e(elements, "elements");
        namesAndValues$okhttp.addAll(ie.i.X(elements));
        return builder;
    }

    public final int size() {
        return this.namesAndValues.length / 2;
    }

    public final Map<String, List<String>> toMultimap() {
        u.B();
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        int size = size();
        for (int i6 = 0; i6 < size; i6++) {
            String name = name(i6);
            Locale US = Locale.US;
            k.d(US, "US");
            String lowerCase = name.toLowerCase(US);
            k.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            List list = (List) treeMap.get(lowerCase);
            if (list == null) {
                list = new ArrayList(2);
                treeMap.put(lowerCase, list);
            }
            list.add(value(i6));
        }
        return treeMap;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int size = size();
        for (int i6 = 0; i6 < size; i6++) {
            String name = name(i6);
            String value = value(i6);
            sb2.append(name);
            sb2.append(": ");
            if (Util.isSensitiveHeader(name)) {
                value = "██";
            }
            sb2.append(value);
            sb2.append("\n");
        }
        String sb3 = sb2.toString();
        k.d(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public final String value(int i6) {
        return this.namesAndValues[(i6 * 2) + 1];
    }

    public final List<String> values(String name) {
        k.e(name, "name");
        int size = size();
        ArrayList arrayList = null;
        for (int i6 = 0; i6 < size; i6++) {
            if (name.equalsIgnoreCase(name(i6))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(value(i6));
            }
        }
        if (arrayList != null) {
            List<String> unmodifiableList = Collections.unmodifiableList(arrayList);
            k.d(unmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
            return unmodifiableList;
        }
        return r.f6846x;
    }

    private Headers(String[] strArr) {
        this.namesAndValues = strArr;
    }

    public static final Headers of(String... strArr) {
        return Companion.of(strArr);
    }
}
