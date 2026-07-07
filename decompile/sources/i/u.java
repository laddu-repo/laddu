package i;

import android.content.res.Configuration;
import android.os.LocaleList;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class u {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales;
        LocaleList locales2;
        boolean equals;
        locales = configuration.getLocales();
        locales2 = configuration2.getLocales();
        equals = locales.equals(locales2);
        if (!equals) {
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }
    }

    public static p0.e b(Configuration configuration) {
        LocaleList locales;
        String languageTags;
        locales = configuration.getLocales();
        languageTags = locales.toLanguageTags();
        return p0.e.b(languageTags);
    }

    public static void c(p0.e eVar) {
        LocaleList forLanguageTags;
        forLanguageTags = LocaleList.forLanguageTags(eVar.f10445a.a());
        LocaleList.setDefault(forLanguageTags);
    }

    public static void d(Configuration configuration, p0.e eVar) {
        LocaleList forLanguageTags;
        forLanguageTags = LocaleList.forLanguageTags(eVar.f10445a.a());
        configuration.setLocales(forLanguageTags);
    }
}
