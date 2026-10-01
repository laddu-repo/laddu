package sb;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f11725c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static a0 f11726d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f11727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f11728b;

    public i(ExecutorService executorService) {
        this.f11728b = new v.e(0);
        this.f11727a = executorService;
    }

    public static o8.o a(Context context, Intent intent, boolean z2) {
        a0 a0Var;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (f11725c) {
            try {
                if (f11726d == null) {
                    f11726d = new a0(context);
                }
                a0Var = f11726d;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z2) {
            return a0Var.b(intent).e(new l4.d(0), new ma.p(13));
        }
        if (p.s().v(context)) {
            x.c(context, a0Var, intent);
        } else {
            a0Var.b(intent);
        }
        return b8.h.o(-1);
    }

    public o8.o b(final Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        final Context context = (Context) this.f11727a;
        l4.d dVar = (l4.d) this.f11728b;
        boolean z2 = x7.b.d() && context.getApplicationInfo().targetSdkVersion >= 26;
        final boolean z10 = (intent.getFlags() & 268435456) != 0;
        return (!z2 || z10) ? b8.h.d(dVar, new j5.d(1, context, intent)).f(dVar, new o8.a() { // from class: sb.h
            @Override // o8.a
            public final Object d(o8.o oVar) {
                return (x7.b.d() && ((Integer) oVar.h()).intValue() == 402) ? i.a(context, intent, z10).e(new l4.d(0), new ma.p(12)) : oVar;
            }
        }) : a(context, intent, z10);
    }

    public i(Context context) {
        this.f11727a = context;
        this.f11728b = new l4.d(0);
    }
}
