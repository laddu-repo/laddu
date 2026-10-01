package ic;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import i4.i0;
import i4.u0;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f6754c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static f0 f6755d;

    /* renamed from: a, reason: collision with root package name */
    public final Object f6756a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f6757b;

    public h(ExecutorService executorService) {
        this.f6757b = new v.l(0);
        this.f6756a = executorService;
    }

    public static s9.n a(Context context, Intent intent, boolean z10) {
        f0 f0Var;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (f6754c) {
            try {
                if (f6755d == null) {
                    f6755d = new f0(context);
                }
                f0Var = f6755d;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z10) {
            if (s.k().r(context)) {
                c0.c(context, f0Var, intent);
            } else {
                f0Var.b(intent);
            }
            return dg.b.j(-1);
        }
        return f0Var.b(intent).j(new q.a(1), new u0(11));
    }

    public s9.n b(Intent intent) {
        boolean z10;
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        boolean z11 = false;
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        Context context = (Context) this.f6756a;
        q.a aVar = (q.a) this.f6757b;
        if (a9.b.d() && context.getApplicationInfo().targetSdkVersion >= 26) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((intent.getFlags() & 268435456) != 0) {
            z11 = true;
        }
        if (z10 && !z11) {
            return a(context, intent, z11);
        }
        return dg.b.c(aVar, new b7.d(2, context, intent)).d(aVar, new i0(context, intent, z11));
    }

    public h(Context context) {
        this.f6756a = context;
        this.f6757b = new q.a(1);
    }
}
