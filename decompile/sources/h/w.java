package h;

import android.content.res.Configuration;
import android.os.LocaleList;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class w {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    public static p0.g b(Configuration configuration) {
        return p0.g.b(configuration.getLocales().toLanguageTags());
    }

    public static void c(p0.g gVar) {
        LocaleList.setDefault(LocaleList.forLanguageTags(gVar.f10183a.a()));
    }

    public static void d(Configuration configuration, p0.g gVar) {
        configuration.setLocales(LocaleList.forLanguageTags(gVar.f10183a.a()));
    }
}
