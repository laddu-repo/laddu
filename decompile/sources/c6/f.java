package c6;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import v5.o;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f extends d {
    public static final String j = o.h("NetworkStateTracker");

    /* renamed from: g, reason: collision with root package name */
    public final ConnectivityManager f1977g;

    /* renamed from: h, reason: collision with root package name */
    public final e f1978h;

    /* renamed from: i, reason: collision with root package name */
    public final c2.g f1979i;

    public f(Context context, h6.a aVar) {
        super(context, aVar);
        this.f1977g = (ConnectivityManager) this.f1971b.getSystemService("connectivity");
        if (Build.VERSION.SDK_INT >= 24) {
            this.f1978h = new e(this, 0);
        } else {
            this.f1979i = new c2.g(this, 2);
        }
    }

    @Override // c6.d
    public final Object a() {
        return f();
    }

    @Override // c6.d
    public final void d() {
        int i6 = Build.VERSION.SDK_INT;
        String str = j;
        if (i6 >= 24) {
            try {
                o.f().b(str, "Registering network callback", new Throwable[0]);
                this.f1977g.registerDefaultNetworkCallback(this.f1978h);
                return;
            } catch (IllegalArgumentException | SecurityException e10) {
                o.f().e(str, "Received exception while registering network callback", e10);
                return;
            }
        }
        o.f().b(str, "Registering broadcast receiver", new Throwable[0]);
        this.f1971b.registerReceiver(this.f1979i, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // c6.d
    public final void e() {
        int i6 = Build.VERSION.SDK_INT;
        String str = j;
        if (i6 >= 24) {
            try {
                o.f().b(str, "Unregistering network callback", new Throwable[0]);
                this.f1977g.unregisterNetworkCallback(this.f1978h);
                return;
            } catch (IllegalArgumentException | SecurityException e10) {
                o.f().e(str, "Received exception while unregistering network callback", e10);
                return;
            }
        }
        o.f().b(str, "Unregistering broadcast receiver", new Throwable[0]);
        this.f1971b.unregisterReceiver(this.f1979i);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [a6.a, java.lang.Object] */
    public final a6.a f() {
        boolean z10;
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        boolean z11;
        ConnectivityManager connectivityManager = this.f1977g;
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z12 = false;
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                activeNetwork = connectivityManager.getActiveNetwork();
                networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
            } catch (SecurityException e10) {
                o.f().e(j, "Unable to validate active network", e10);
            }
            if (networkCapabilities != null) {
                if (networkCapabilities.hasCapability(16)) {
                    z11 = true;
                    boolean isActiveNetworkMetered = connectivityManager.isActiveNetworkMetered();
                    if (activeNetworkInfo != null && !activeNetworkInfo.isRoaming()) {
                        z12 = true;
                    }
                    ?? obj = new Object();
                    obj.f579a = z10;
                    obj.f580b = z11;
                    obj.f581c = isActiveNetworkMetered;
                    obj.f582d = z12;
                    return obj;
                }
            }
        }
        z11 = false;
        boolean isActiveNetworkMetered2 = connectivityManager.isActiveNetworkMetered();
        if (activeNetworkInfo != null) {
            z12 = true;
        }
        ?? obj2 = new Object();
        obj2.f579a = z10;
        obj2.f580b = z11;
        obj2.f581c = isActiveNetworkMetered2;
        obj2.f582d = z12;
        return obj2;
    }
}
