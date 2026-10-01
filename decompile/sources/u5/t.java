package u5;

import android.content.pm.PackageInfo;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class t extends c {

    /* renamed from: d, reason: collision with root package name */
    public final Pattern f12919d;

    public t() {
        super("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");
        this.f12919d = Pattern.compile("\\A\\d+");
    }

    @Override // u5.c
    public final boolean a() {
        if (Build.VERSION.SDK_INT >= 33) {
            return true;
        }
        return false;
    }

    @Override // u5.c
    public final boolean b() {
        int i6;
        PackageInfo packageInfo;
        boolean b10 = super.b();
        if (b10 && (i6 = Build.VERSION.SDK_INT) < 29) {
            int i10 = t5.h.f12611a;
            if (i6 >= 26) {
                packageInfo = i.a();
            } else {
                try {
                    packageInfo = t5.h.b();
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                    packageInfo = null;
                }
            }
            if (packageInfo == null) {
                return false;
            }
            Matcher matcher = this.f12919d.matcher(packageInfo.versionName);
            if (!matcher.find() || Integer.parseInt(packageInfo.versionName.substring(matcher.start(), matcher.end())) < 105) {
                return false;
            }
            return true;
        }
        return b10;
    }
}
