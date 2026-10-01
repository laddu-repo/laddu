package p0;

import android.os.LocaleList;
import java.util.Locale;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    public final LocaleList f10449a;

    public h(Object obj) {
        this.f10449a = j2.e.h(obj);
    }

    @Override // p0.g
    public final String a() {
        String languageTags;
        languageTags = this.f10449a.toLanguageTags();
        return languageTags;
    }

    public final boolean equals(Object obj) {
        boolean equals;
        equals = this.f10449a.equals(((g) obj).getLocaleList());
        return equals;
    }

    @Override // p0.g
    public final Locale get(int i6) {
        Locale locale;
        locale = this.f10449a.get(i6);
        return locale;
    }

    @Override // p0.g
    public final Object getLocaleList() {
        return this.f10449a;
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.f10449a.hashCode();
        return hashCode;
    }

    @Override // p0.g
    public final boolean isEmpty() {
        boolean isEmpty;
        isEmpty = this.f10449a.isEmpty();
        return isEmpty;
    }

    @Override // p0.g
    public final int size() {
        int size;
        size = this.f10449a.size();
        return size;
    }

    public final String toString() {
        String localeList;
        localeList = this.f10449a.toString();
        return localeList;
    }
}
