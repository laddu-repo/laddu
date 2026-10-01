package p0;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f implements g {

    /* renamed from: c, reason: collision with root package name */
    public static final Locale[] f10446c = new Locale[0];

    /* renamed from: a, reason: collision with root package name */
    public final Locale[] f10447a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10448b;

    static {
        new Locale("en", "XA");
        new Locale("ar", "XB");
        String[] split = "en-Latn".split("-", -1);
        if (split.length > 2) {
            new Locale(split[0], split[1], split[2]);
        } else if (split.length > 1) {
            new Locale(split[0], split[1]);
        } else {
            if (split.length == 1) {
                new Locale(split[0]);
                return;
            }
            throw new IllegalArgumentException("Can not parse language tag: [en-Latn]");
        }
    }

    public f(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f10447a = f10446c;
            this.f10448b = HttpUrl.FRAGMENT_ENCODE_SET;
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb2 = new StringBuilder();
        for (int i6 = 0; i6 < localeArr.length; i6++) {
            Locale locale = localeArr[i6];
            if (locale != null) {
                if (!hashSet.contains(locale)) {
                    Locale locale2 = (Locale) locale.clone();
                    arrayList.add(locale2);
                    sb2.append(locale2.getLanguage());
                    String country = locale2.getCountry();
                    if (country != null && !country.isEmpty()) {
                        sb2.append('-');
                        sb2.append(locale2.getCountry());
                    }
                    if (i6 < localeArr.length - 1) {
                        sb2.append(',');
                    }
                    hashSet.add(locale2);
                }
            } else {
                throw new NullPointerException(h8.c.j(i6, "list[", "] is null"));
            }
        }
        this.f10447a = (Locale[]) arrayList.toArray(new Locale[0]);
        this.f10448b = sb2.toString();
    }

    @Override // p0.g
    public final String a() {
        return this.f10448b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        Locale[] localeArr = ((f) obj).f10447a;
        Locale[] localeArr2 = this.f10447a;
        if (localeArr2.length != localeArr.length) {
            return false;
        }
        for (int i6 = 0; i6 < localeArr2.length; i6++) {
            if (!localeArr2[i6].equals(localeArr[i6])) {
                return false;
            }
        }
        return true;
    }

    @Override // p0.g
    public final Locale get(int i6) {
        if (i6 >= 0) {
            Locale[] localeArr = this.f10447a;
            if (i6 < localeArr.length) {
                return localeArr[i6];
            }
            return null;
        }
        return null;
    }

    @Override // p0.g
    public final Object getLocaleList() {
        return null;
    }

    public final int hashCode() {
        int i6 = 1;
        for (Locale locale : this.f10447a) {
            i6 = (i6 * 31) + locale.hashCode();
        }
        return i6;
    }

    @Override // p0.g
    public final boolean isEmpty() {
        if (this.f10447a.length == 0) {
            return true;
        }
        return false;
    }

    @Override // p0.g
    public final int size() {
        return this.f10447a.length;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        int i6 = 0;
        while (true) {
            Locale[] localeArr = this.f10447a;
            if (i6 < localeArr.length) {
                sb2.append(localeArr[i6]);
                if (i6 < localeArr.length - 1) {
                    sb2.append(',');
                }
                i6++;
            } else {
                sb2.append("]");
                return sb2.toString();
            }
        }
    }
}
