package k8;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.media3.decoder.DecoderInputBuffer;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i2 implements Runnable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f7574v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u2 f7575w;

    public /* synthetic */ i2(u2 u2Var, int i) {
        this.f7574v = i;
        this.f7575w = u2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7574v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                this.f7575w.a0();
                break;
            case 1:
                k4 k4Var = this.f7575w.M;
                p1 p1Var = (p1) k4Var.f7607v;
                n1 n1Var = p1Var.B;
                u2 u2Var = p1Var.H;
                d1 d1Var = p1Var.f7696z;
                p1.l(n1Var);
                n1Var.D();
                if (k4Var.A()) {
                    if (k4Var.z()) {
                        p1.j(d1Var);
                        d1Var.S.t(null);
                        Bundle bundle = new Bundle();
                        bundle.putString("source", "(not set)");
                        bundle.putString("medium", "(not set)");
                        bundle.putString("_cis", "intent");
                        bundle.putLong("_cc", 1L);
                        p1.k(u2Var);
                        u2Var.K("auto", "_cmpx", bundle);
                    } else {
                        p1.j(d1Var);
                        c2.b bVar = d1Var.S;
                        String strS = bVar.s();
                        if (TextUtils.isEmpty(strS)) {
                            v0 v0Var = p1Var.A;
                            p1.l(v0Var);
                            v0Var.C.a("Cache still valid but referrer not found");
                        } else {
                            long jG = d1Var.T.g() / 3600000;
                            Uri uri = Uri.parse(strS);
                            Bundle bundle2 = new Bundle();
                            Pair pair = new Pair(uri.getPath(), bundle2);
                            for (String str : uri.getQueryParameterNames()) {
                                bundle2.putString(str, uri.getQueryParameter(str));
                            }
                            ((Bundle) pair.second).putLong("_cc", (jG - 1) * 3600000);
                            Object obj = pair.first;
                            String str2 = obj == null ? "app" : (String) obj;
                            p1.k(u2Var);
                            u2Var.K(str2, "_cmp", (Bundle) pair.second);
                        }
                        bVar.t(null);
                    }
                    p1.j(d1Var);
                    d1Var.T.h(0L);
                    break;
                }
                break;
            case 2:
                u2 u2Var2 = this.f7575w;
                u2Var2.D();
                p1 p1Var2 = (p1) u2Var2.f2053w;
                d1 d1Var2 = p1Var2.f7696z;
                v0 v0Var2 = p1Var2.A;
                p1.j(d1Var2);
                c1 c1Var = d1Var2.P;
                if (c1Var.a()) {
                    p1.l(v0Var2);
                    v0Var2.I.a("Deferred Deep Link already retrieved. Not fetching again.");
                } else {
                    c2.v1 v1Var = d1Var2.Q;
                    long jG2 = v1Var.g();
                    v1Var.h(1 + jG2);
                    if (jG2 >= 5) {
                        p1.l(v0Var2);
                        v0Var2.E.a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                        c1Var.b(true);
                    } else {
                        if (u2Var2.O == null) {
                            u2Var2.O = new j2(u2Var2, p1Var2, 3);
                        }
                        u2Var2.O.b(0L);
                    }
                }
                break;
            default:
                this.f7575w.a0();
                break;
        }
    }
}
