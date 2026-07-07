package p0;

import android.os.Build;
import java.util.Locale;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class a {
    static {
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 30) {
            m0.a.b(30);
        }
        if (i6 >= 30) {
            m0.a.b(31);
        }
        if (i6 >= 30) {
            m0.a.b(33);
        }
        if (i6 >= 30) {
            m0.a.b(1000000);
        }
    }

    public static final boolean a() {
        Integer num;
        Integer num2 = 0;
        int i6 = Build.VERSION.SDK_INT;
        if (i6 < 31) {
            if (i6 >= 30) {
                String CODENAME = Build.VERSION.CODENAME;
                k.d(CODENAME, "CODENAME");
                if (!"REL".equals(CODENAME)) {
                    Locale locale = Locale.ROOT;
                    String upperCase = CODENAME.toUpperCase(locale);
                    k.d(upperCase, "toUpperCase(...)");
                    if (upperCase.equals("BAKLAVA")) {
                        num = num2;
                    } else {
                        num = null;
                    }
                    String upperCase2 = "S".toUpperCase(locale);
                    k.d(upperCase2, "toUpperCase(...)");
                    if (!upperCase2.equals("BAKLAVA")) {
                        num2 = null;
                    }
                    if (num != null && num2 != null) {
                        if (num.intValue() >= num2.intValue()) {
                            return true;
                        }
                    } else if (num == null && num2 == null) {
                        String upperCase3 = CODENAME.toUpperCase(locale);
                        k.d(upperCase3, "toUpperCase(...)");
                        String upperCase4 = "S".toUpperCase(locale);
                        k.d(upperCase4, "toUpperCase(...)");
                        if (upperCase3.compareTo(upperCase4) >= 0) {
                            return true;
                        }
                    } else if (num != null) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }
}
