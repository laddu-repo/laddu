package p7;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f10397h;
    public static PendingIntent i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Pattern f10398j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v.i f10399a = new v.i(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f10400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d0.h f10401c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f10402d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Messenger f10403e;
    public Messenger f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public g f10404g;

    public b(Context context) {
        this.f10400b = context;
        d0.h hVar = new d0.h();
        hVar.f3758w = 0;
        hVar.f3759x = context;
        this.f10401c = hVar;
        this.f10403e = new Messenger(new e(this, Looper.getMainLooper()));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f10402d = scheduledThreadPoolExecutor;
    }

    public static synchronized String b() {
        int i10;
        i10 = f10397h;
        f10397h = i10 + 1;
        return Integer.toString(i10);
    }

    public static synchronized void c(Context context, Intent intent) {
        try {
            if (i == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                i = PendingIntent.getBroadcast(context, 0, intent2, e8.a.f4860a);
            }
            intent.putExtra("app", i);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final o8.o a(android.os.Bundle r8) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.b.a(android.os.Bundle):o8.o");
    }

    public final void d(String str, Bundle bundle) {
        synchronized (this.f10399a) {
            try {
                o8.h hVar = (o8.h) this.f10399a.remove(str);
                if (hVar != null) {
                    hVar.a(bundle);
                    return;
                }
                Log.w("Rpc", "Missing callback for " + str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
