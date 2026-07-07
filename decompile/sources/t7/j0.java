package t7;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.internal.measurement.t6;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class j0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f12367g = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static j0 f12368h;
    public static HandlerThread i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f12369a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f12370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile t6 f12371c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w7.a f12372d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f12373e;
    public final long f;

    public j0(Context context, Looper looper) {
        n6.f fVar = new n6.f(3, this);
        this.f12370b = context.getApplicationContext();
        t6 t6Var = new t6(looper, fVar);
        Looper.getMainLooper();
        this.f12371c = t6Var;
        this.f12372d = w7.a.b();
        this.f12373e = 5000L;
        this.f = 300000L;
    }

    public static j0 a(Context context) {
        synchronized (f12367g) {
            try {
                if (f12368h == null) {
                    f12368h = new j0(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f12368h;
    }

    public static HandlerThread b() {
        synchronized (f12367g) {
            try {
                HandlerThread handlerThread = i;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                i = handlerThread2;
                handlerThread2.start();
                return i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final q7.b c(h0 h0Var, d0 d0Var, String str, Executor executor) {
        q7.b bVarA;
        HashMap map = this.f12369a;
        synchronized (map) {
            try {
                i0 i0Var = (i0) map.get(h0Var);
                if (executor == null) {
                    executor = null;
                }
                if (i0Var == null) {
                    i0Var = new i0(this, h0Var);
                    i0Var.f12357v.put(d0Var, d0Var);
                    bVarA = i0Var.a(str, executor);
                    map.put(h0Var, i0Var);
                } else {
                    this.f12371c.removeMessages(0, h0Var);
                    if (i0Var.f12357v.containsKey(d0Var)) {
                        String string = h0Var.toString();
                        StringBuilder sb2 = new StringBuilder(string.length() + 81);
                        sb2.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb2.append(string);
                        throw new IllegalStateException(sb2.toString());
                    }
                    i0Var.f12357v.put(d0Var, d0Var);
                    int i10 = i0Var.f12358w;
                    if (i10 == 1) {
                        d0Var.onServiceConnected(i0Var.A, i0Var.f12360y);
                    } else if (i10 == 2) {
                        bVarA = i0Var.a(str, executor);
                    }
                    bVarA = null;
                }
                if (i0Var.f12359x) {
                    return q7.b.A;
                }
                if (bVarA == null) {
                    bVarA = new q7.b(-1, null, null);
                }
                return bVarA;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(String str, ServiceConnection serviceConnection, boolean z2) {
        h0 h0Var = new h0(str, z2);
        y.h(serviceConnection, "ServiceConnection must not be null");
        HashMap map = this.f12369a;
        synchronized (map) {
            try {
                i0 i0Var = (i0) map.get(h0Var);
                if (i0Var == null) {
                    String string = h0Var.toString();
                    StringBuilder sb2 = new StringBuilder(string.length() + 50);
                    sb2.append("Nonexistent connection status for service config: ");
                    sb2.append(string);
                    throw new IllegalStateException(sb2.toString());
                }
                if (!i0Var.f12357v.containsKey(serviceConnection)) {
                    String string2 = h0Var.toString();
                    StringBuilder sb3 = new StringBuilder(string2.length() + 76);
                    sb3.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb3.append(string2);
                    throw new IllegalStateException(sb3.toString());
                }
                i0Var.f12357v.remove(serviceConnection);
                if (i0Var.f12357v.isEmpty()) {
                    this.f12371c.sendMessageDelayed(this.f12371c.obtainMessage(0, h0Var), this.f12373e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
