package p0;

import android.os.Build;
import java.util.Locale;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static final e f10444b = a(new Locale[0]);

    /* renamed from: a, reason: collision with root package name */
    public final g f10445a;

    public e(g gVar) {
        this.f10445a = gVar;
    }

    public static e a(Locale... localeArr) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new e(new h(b.a(localeArr)));
        }
        return new e(new f(localeArr));
    }

    public static e b(String str) {
        if (str != null && !str.isEmpty()) {
            String[] split = str.split(",", -1);
            int length = split.length;
            Locale[] localeArr = new Locale[length];
            for (int i6 = 0; i6 < length; i6++) {
                String str2 = split[i6];
                int i10 = d.f10443a;
                localeArr[i6] = Locale.forLanguageTag(str2);
            }
            return a(localeArr);
        }
        return f10444b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (this.f10445a.equals(((e) obj).f10445a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f10445a.hashCode();
    }

    public final String toString() {
        return this.f10445a.toString();
    }
}
