package a7;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class l implements ComponentCallbacks2 {
    public boolean A;
    public boolean B = true;

    /* renamed from: x, reason: collision with root package name */
    public final WeakReference f613x;

    /* renamed from: y, reason: collision with root package name */
    public Context f614y;

    /* renamed from: z, reason: collision with root package name */
    public u6.f f615z;

    public l(l6.k kVar) {
        this.f613x = new WeakReference(kVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v5, types: [u6.f] */
    public final synchronized void a() {
        ?? r02;
        try {
            l6.k kVar = (l6.k) this.f613x.get();
            if (kVar != null) {
                if (this.f615z == null) {
                    if (kVar.f8249e.f607b) {
                        Context context = kVar.f8245a;
                        ConnectivityManager connectivityManager = (ConnectivityManager) i0.f.e(context, ConnectivityManager.class);
                        if (connectivityManager != null && i0.f.a(context, "android.permission.ACCESS_NETWORK_STATE") == 0) {
                            try {
                                r02 = new n9.j(connectivityManager, this);
                            } catch (Exception unused) {
                                r02 = new Object();
                            }
                        } else {
                            r02 = new Object();
                        }
                    } else {
                        r02 = new Object();
                    }
                    this.f615z = r02;
                    this.B = r02.a();
                }
            } else {
                b();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b() {
        try {
            if (this.A) {
                return;
            }
            this.A = true;
            Context context = this.f614y;
            if (context != null) {
                context.unregisterComponentCallbacks(this);
            }
            u6.f fVar = this.f615z;
            if (fVar != null) {
                fVar.shutdown();
            }
            this.f613x.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final synchronized void onConfigurationChanged(Configuration configuration) {
        if (((l6.k) this.f613x.get()) == null) {
            b();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final synchronized void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public final synchronized void onTrimMemory(int i6) {
        l6.k kVar = (l6.k) this.f613x.get();
        if (kVar != null) {
            t6.c cVar = (t6.c) kVar.f8247c.getValue();
            if (cVar != null) {
                cVar.f12616a.q(i6);
                cVar.f12617b.v(i6);
            }
        } else {
            b();
        }
    }
}
