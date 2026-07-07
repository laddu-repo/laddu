package c6;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import n9.j;
import v5.o;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1975a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1976b;

    public /* synthetic */ e(Object obj, int i6) {
        this.f1975a = i6;
        this.f1976b = obj;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        switch (this.f1975a) {
            case 1:
                j.f((j) this.f1976b, network, true);
                return;
            default:
                super.onAvailable(network);
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        switch (this.f1975a) {
            case 0:
                o.f().b(f.j, "Network capabilities changed: " + networkCapabilities, new Throwable[0]);
                f fVar = (f) this.f1976b;
                fVar.c(fVar.f());
                return;
            default:
                super.onCapabilitiesChanged(network, networkCapabilities);
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        switch (this.f1975a) {
            case 0:
                o.f().b(f.j, "Network connection lost", new Throwable[0]);
                f fVar = (f) this.f1976b;
                fVar.c(fVar.f());
                return;
            default:
                j.f((j) this.f1976b, network, false);
                return;
        }
    }
}
