package w8;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.unity3d.services.core.di.ServiceProvider;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: g, reason: collision with root package name */
    public static final Object f14195g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public static i0 f14196h;

    /* renamed from: i, reason: collision with root package name */
    public static HandlerThread f14197i;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f14198a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Context f14199b;

    /* renamed from: c, reason: collision with root package name */
    public volatile com.google.android.gms.internal.measurement.h0 f14200c;

    /* renamed from: d, reason: collision with root package name */
    public final z8.a f14201d;

    /* renamed from: e, reason: collision with root package name */
    public final long f14202e;

    /* renamed from: f, reason: collision with root package name */
    public final long f14203f;

    /* JADX WARN: Type inference failed for: r3v2, types: [android.os.Handler, com.google.android.gms.internal.measurement.h0] */
    public i0(Context context, Looper looper) {
        s8.j jVar = new s8.j(this, 1);
        this.f14199b = context.getApplicationContext();
        ?? handler = new Handler(looper, jVar);
        Looper.getMainLooper();
        this.f14200c = handler;
        this.f14201d = z8.a.b();
        this.f14202e = ServiceProvider.SCAR_VERSION_FETCH_TIMEOUT;
        this.f14203f = 300000L;
    }

    public static i0 a(Context context) {
        synchronized (f14195g) {
            try {
                if (f14196h == null) {
                    f14196h = new i0(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f14196h;
    }

    public static HandlerThread b() {
        synchronized (f14195g) {
            try {
                HandlerThread handlerThread = f14197i;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                f14197i = handlerThread2;
                handlerThread2.start();
                return f14197i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final t8.b c(g0 g0Var, b0 b0Var, String str, Executor executor) {
        synchronized (this.f14198a) {
            try {
                h0 h0Var = (h0) this.f14198a.get(g0Var);
                t8.b bVar = null;
                if (executor == null) {
                    executor = null;
                }
                if (h0Var == null) {
                    h0Var = new h0(this, g0Var);
                    h0Var.f14192x.put(b0Var, b0Var);
                    bVar = h0.a(h0Var, str, executor);
                    this.f14198a.put(g0Var, h0Var);
                } else {
                    this.f14200c.removeMessages(0, g0Var);
                    if (!h0Var.f14192x.containsKey(b0Var)) {
                        h0Var.f14192x.put(b0Var, b0Var);
                        int i6 = h0Var.f14193y;
                        if (i6 != 1) {
                            if (i6 == 2) {
                                bVar = h0.a(h0Var, str, executor);
                            }
                        } else {
                            b0Var.onServiceConnected(h0Var.C, h0Var.A);
                        }
                    } else {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=".concat(g0Var.toString()));
                    }
                }
                if (h0Var.f14194z) {
                    return t8.b.B;
                }
                if (bVar == null) {
                    bVar = new t8.b(-1);
                }
                return bVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(String str, ServiceConnection serviceConnection, boolean z10) {
        g0 g0Var = new g0(str, z10);
        x.h(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f14198a) {
            try {
                h0 h0Var = (h0) this.f14198a.get(g0Var);
                if (h0Var != null) {
                    if (h0Var.f14192x.containsKey(serviceConnection)) {
                        h0Var.f14192x.remove(serviceConnection);
                        if (h0Var.f14192x.isEmpty()) {
                            this.f14200c.sendMessageDelayed(this.f14200c.obtainMessage(0, g0Var), this.f14202e);
                        }
                    } else {
                        throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=".concat(g0Var.toString()));
                    }
                } else {
                    throw new IllegalStateException("Nonexistent connection status for service config: ".concat(g0Var.toString()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
