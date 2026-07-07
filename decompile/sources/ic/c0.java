package ic;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final long f6738a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b, reason: collision with root package name */
    public static final Object f6739b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static r9.a f6740c;

    public static void a(Context context) {
        if (f6740c == null) {
            r9.a aVar = new r9.a(context);
            f6740c = aVar;
            synchronized (aVar.f11887a) {
                aVar.f11893g = true;
            }
        }
    }

    public static void b(Intent intent) {
        synchronized (f6739b) {
            try {
                if (f6740c != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    f6740c.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void c(Context context, f0 f0Var, Intent intent) {
        synchronized (f6739b) {
            try {
                a(context);
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                if (!booleanExtra) {
                    f6740c.a(f6738a);
                }
                s9.n b10 = f0Var.b(intent);
                a2.e0 e0Var = new a2.e0(intent, 27);
                b10.getClass();
                b10.f12276b.d(new s9.l((Executor) s9.i.f12264a, (s9.c) e0Var));
                b10.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ComponentName d(Context context, Intent intent) {
        synchronized (f6739b) {
            try {
                a(context);
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                ComponentName startService = context.startService(intent);
                if (startService == null) {
                    return null;
                }
                if (!booleanExtra) {
                    f6740c.a(f6738a);
                }
                return startService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
