package s8;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: h, reason: collision with root package name */
    public static int f12225h;

    /* renamed from: i, reason: collision with root package name */
    public static PendingIntent f12226i;
    public static final Pattern j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* renamed from: b, reason: collision with root package name */
    public final Context f12228b;

    /* renamed from: c, reason: collision with root package name */
    public final d0.g f12229c;

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f12230d;

    /* renamed from: f, reason: collision with root package name */
    public Messenger f12232f;

    /* renamed from: g, reason: collision with root package name */
    public g f12233g;

    /* renamed from: a, reason: collision with root package name */
    public final v.l f12227a = new v.l(0);

    /* renamed from: e, reason: collision with root package name */
    public final Messenger f12231e = new Messenger(new e(this, Looper.getMainLooper()));

    public b(Context context) {
        this.f12228b = context;
        this.f12229c = new d0.g(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f12230d = scheduledThreadPoolExecutor;
    }

    public static synchronized String b() {
        String num;
        synchronized (b.class) {
            int i6 = f12225h;
            f12225h = i6 + 1;
            num = Integer.toString(i6);
        }
        return num;
    }

    public static synchronized void c(Context context, Intent intent) {
        synchronized (b.class) {
            try {
                if (f12226i == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    f12226i = PendingIntent.getBroadcast(context, 0, intent2, h9.a.f6004a);
                }
                intent.putExtra("app", f12226i);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final s9.n a(Bundle bundle) {
        String b10 = b();
        s9.h hVar = new s9.h();
        synchronized (this.f12227a) {
            this.f12227a.put(b10, hVar);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f12229c.f() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        c(this.f12228b, intent);
        intent.putExtra("kid", "|ID|" + b10 + "|");
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Sending ".concat(String.valueOf(intent.getExtras())));
        }
        intent.putExtra("google.messenger", this.f12231e);
        if (this.f12232f != null || this.f12233g != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f12232f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    Messenger messenger2 = this.f12233g.f12239x;
                    messenger2.getClass();
                    messenger2.send(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            hVar.f12263a.i(h.f12241z, new n9.j(this, b10, this.f12230d.schedule(new a1.e(hVar, 21), 30L, TimeUnit.SECONDS), 11));
            return hVar.f12263a;
        }
        if (this.f12229c.f() == 2) {
            this.f12228b.sendBroadcast(intent);
        } else {
            this.f12228b.startService(intent);
        }
        hVar.f12263a.i(h.f12241z, new n9.j(this, b10, this.f12230d.schedule(new a1.e(hVar, 21), 30L, TimeUnit.SECONDS), 11));
        return hVar.f12263a;
    }

    public final void d(String str, Bundle bundle) {
        synchronized (this.f12227a) {
            try {
                s9.h hVar = (s9.h) this.f12227a.remove(str);
                if (hVar == null) {
                    Log.w("Rpc", "Missing callback for " + str);
                    return;
                }
                hVar.a(bundle);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
