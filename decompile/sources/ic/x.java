package ic;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: d, reason: collision with root package name */
    public static WeakReference f6798d;

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f6799a;

    /* renamed from: b, reason: collision with root package name */
    public b4.h f6800b;

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f6801c;

    public x(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f6801c = scheduledThreadPoolExecutor;
        this.f6799a = sharedPreferences;
    }

    public final synchronized w a() {
        w wVar;
        String k8 = this.f6800b.k();
        Pattern pattern = w.f6794d;
        wVar = null;
        if (!TextUtils.isEmpty(k8)) {
            String[] split = k8.split("!", -1);
            if (split.length == 2) {
                wVar = new w(split[0], split[1]);
            }
        }
        return wVar;
    }

    public final synchronized void b() {
        this.f6800b = b4.h.g(this.f6799a, this.f6801c);
    }

    public final synchronized void c(w wVar) {
        this.f6800b.l(wVar.f6797c);
    }
}
