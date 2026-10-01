package sb;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f11778a = TimeUnit.MINUTES.toMillis(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f11779b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static n8.a f11780c;

    public static void a(Context context) {
        if (f11780c == null) {
            n8.a aVar = new n8.a(context);
            f11780c = aVar;
            synchronized (aVar.f9018a) {
                aVar.f9023g = true;
            }
        }
    }

    public static void b(Intent intent) {
        synchronized (f11779b) {
            try {
                if (f11780c != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    f11780c.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void c(Context context, a0 a0Var, Intent intent) {
        synchronized (f11779b) {
            try {
                a(context);
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                if (!booleanExtra) {
                    f11780c.a(f11778a);
                }
                o8.o oVarB = a0Var.b(intent);
                pa.a aVar = new pa.a(5, intent);
                oVarB.getClass();
                oVarB.f9983b.h(new o8.l(o8.i.f9964a, aVar));
                oVarB.q();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ComponentName d(Context context, Intent intent) {
        synchronized (f11779b) {
            try {
                a(context);
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                ComponentName componentNameStartService = context.startService(intent);
                if (componentNameStartService == null) {
                    return null;
                }
                if (!booleanExtra) {
                    f11780c.a(f11778a);
                }
                return componentNameStartService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
