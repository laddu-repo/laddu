package e2;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.Build;
import java.util.HashSet;
import java.util.Iterator;
import va.t1;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f4713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f4714d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f4715e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f4716g;

    public w(Context context, int i) {
        switch (i) {
            case 1:
                de.i.e(context, "context");
                this.f4711a = context;
                this.f4713c = new Object();
                this.f4714d = new HashSet();
                Object systemService = context.getSystemService("connectivity");
                ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
                this.f4715e = connectivityManager;
                com.bumptech.glide.manager.q qVar = new com.bumptech.glide.manager.q(3, this);
                this.f = qVar;
                int i10 = Build.VERSION.SDK_INT;
                if (connectivityManager != null) {
                    NetworkRequest networkRequestBuild = new NetworkRequest.Builder().addTransportType(0).addTransportType(1).addTransportType(3).build();
                    com.bumptech.glide.manager.p pVar = new com.bumptech.glide.manager.p(1, this);
                    this.f4716g = pVar;
                    connectivityManager.registerNetworkCallback(networkRequestBuild, pVar);
                } else {
                    try {
                        if (i10 >= 33) {
                            context.registerReceiver(qVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"), 2);
                        } else {
                            context.registerReceiver(qVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                        }
                        this.f4712b = true;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            default:
                this.f4711a = context;
                this.f4713c = b.f4550c;
                this.f4715e = e0.f4608a;
                this.f = e0.f4609b;
                break;
        }
    }

    public static final void a(w wVar) {
        synchronized (wVar.f4713c) {
            Iterator it = ((HashSet) wVar.f4714d).iterator();
            de.i.d(it, "iterator(...)");
            while (it.hasNext()) {
                fd.c cVar = ((fd.b) it.next()).f5385a;
                cVar.f5386v.d(new ac.g0(8, cVar));
            }
        }
    }

    public boolean b() {
        return t1.i(this.f4711a);
    }

    public void c() {
        synchronized (this.f4713c) {
            ((HashSet) this.f4714d).clear();
            if (this.f4712b) {
                try {
                    this.f4711a.unregisterReceiver((com.bumptech.glide.manager.q) this.f);
                } catch (Exception unused) {
                }
            }
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f4715e;
            if (connectivityManager != null) {
                com.bumptech.glide.manager.p pVar = (com.bumptech.glide.manager.p) this.f4716g;
                if (pVar != null) {
                    connectivityManager.unregisterNetworkCallback(pVar);
                }
            }
        }
    }

    public void d(fd.b bVar) {
        de.i.e(bVar, "networkChangeListener");
        synchronized (this.f4713c) {
            ((HashSet) this.f4714d).remove(bVar);
        }
    }
}
