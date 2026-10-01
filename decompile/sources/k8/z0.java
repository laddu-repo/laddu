package k8;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.internal.measurement.x9;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class z0 extends h4 {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f7858z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z0(n4 n4Var, int i) {
        super(n4Var);
        this.f7858z = i;
    }

    @Override // k8.h4
    public final void G() {
        int i = this.f7858z;
    }

    public boolean H() {
        E();
        ConnectivityManager connectivityManager = (ConnectivityManager) ((p1) this.f2053w).f7692v.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = null;
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public void K(String str, i4 i4Var, x9 x9Var, x0 x0Var) {
        String str2;
        String str3 = i4Var.f7578a;
        p1 p1Var = (p1) this.f2053w;
        D();
        E();
        try {
            URL url = new URI(str3).toURL();
            this.f7447x.j0();
            byte[] bArrA = x9Var.a();
            n1 n1Var = p1Var.B;
            p1.l(n1Var);
            Map map = i4Var.f7579b;
            if (map == null) {
                map = Collections.EMPTY_MAP;
            }
            str2 = str;
            try {
                n1Var.P(new y0(this, str2, url, bArrA, map, x0Var));
            } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
                v0 v0Var = p1Var.A;
                p1.l(v0Var);
                v0Var.B.c(v0.L(str2), str3, "Failed to parse URL. Not uploading MeasurementBatch. appId");
            }
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused2) {
            str2 = str;
        }
    }

    private final void I() {
    }

    private final void J() {
    }
}
