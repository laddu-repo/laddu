package p0;

import android.content.Context;
import android.content.res.Configuration;
import android.icu.text.DecimalFormatSymbols;
import android.os.LocaleList;
import android.os.UserManager;
import android.view.PointerIcon;
import java.util.Locale;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class b {
    public static LocaleList a(Locale... localeArr) {
        return new LocaleList(localeArr);
    }

    public static String b() {
        LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
        if (adjustedDefault.size() > 0) {
            return adjustedDefault.get(0).toLanguageTag();
        }
        return null;
    }

    public static DecimalFormatSymbols c(Locale locale) {
        return DecimalFormatSymbols.getInstance(locale);
    }

    public static LocaleList d(Configuration configuration) {
        return configuration.getLocales();
    }

    public static PointerIcon e(Context context) {
        return PointerIcon.getSystemIcon(context, 1002);
    }

    public static boolean f(Context context) {
        return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
    }
}
