package sb;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static WeakReference f11754d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f11755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ad.c f11756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f11757c;

    public s(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f11757c = scheduledThreadPoolExecutor;
        this.f11755a = sharedPreferences;
    }

    public final synchronized r a() {
        r rVar;
        String strR = this.f11756b.r();
        Pattern pattern = r.f11750d;
        rVar = null;
        if (!TextUtils.isEmpty(strR)) {
            String[] strArrSplit = strR.split("!", -1);
            if (strArrSplit.length == 2) {
                rVar = new r(strArrSplit[0], strArrSplit[1]);
            }
        }
        return rVar;
    }

    public final synchronized void b() {
        this.f11756b = ad.c.m(this.f11755a, this.f11757c);
    }

    public final synchronized void c(r rVar) {
        this.f11756b.s(rVar.f11753c);
    }
}
