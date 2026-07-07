package cc;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import w8.l;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: b, reason: collision with root package name */
    public static final long f2043b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f2044c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d, reason: collision with root package name */
    public static k f2045d;

    /* renamed from: a, reason: collision with root package name */
    public final l f2046a;

    public k(l lVar) {
        this.f2046a = lVar;
    }

    public final boolean a(dc.b bVar) {
        if (!TextUtils.isEmpty(bVar.f4075c)) {
            long j = bVar.f4078f + bVar.f4077e;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f2046a.getClass();
            if (j < timeUnit.toSeconds(System.currentTimeMillis()) + f2043b) {
                return true;
            }
            return false;
        }
        return true;
    }
}
