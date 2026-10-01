package n9;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class c2 implements Runnable {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f9198x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ m2 f9199y;

    public /* synthetic */ c2(m2 m2Var, int i6) {
        this.f9198x = i6;
        this.f9199y = m2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        switch (this.f9198x) {
            case 0:
                this.f9199y.z1();
                return;
            case 1:
                u5.r rVar = this.f9199y.P;
                n1 n1Var = (n1) rVar.f12916y;
                l1 l1Var = n1Var.D;
                m2 m2Var = n1Var.J;
                c1 c1Var = n1Var.B;
                n1.g(l1Var);
                l1Var.d1();
                if (rVar.F()) {
                    if (rVar.E()) {
                        n1.e(c1Var);
                        c1Var.U.m(null);
                        Bundle bundle = new Bundle();
                        bundle.putString("source", "(not set)");
                        bundle.putString("medium", "(not set)");
                        bundle.putString("_cis", "intent");
                        bundle.putLong("_cc", 1L);
                        n1.f(m2Var);
                        m2Var.k1("auto", "_cmpx", bundle);
                    } else {
                        n1.e(c1Var);
                        a2.c cVar = c1Var.U;
                        String l10 = cVar.l();
                        if (TextUtils.isEmpty(l10)) {
                            u0 u0Var = n1Var.C;
                            n1.g(u0Var);
                            u0Var.E.a("Cache still valid but referrer not found");
                        } else {
                            long c10 = c1Var.V.c() / 3600000;
                            Uri parse = Uri.parse(l10);
                            Bundle bundle2 = new Bundle();
                            Pair pair = new Pair(parse.getPath(), bundle2);
                            for (String str2 : parse.getQueryParameterNames()) {
                                bundle2.putString(str2, parse.getQueryParameter(str2));
                            }
                            ((Bundle) pair.second).putLong("_cc", (c10 - 1) * 3600000);
                            Object obj = pair.first;
                            if (obj == null) {
                                str = "app";
                            } else {
                                str = (String) obj;
                            }
                            n1.f(m2Var);
                            m2Var.k1(str, "_cmp", (Bundle) pair.second);
                        }
                        cVar.m(null);
                    }
                    n1.e(c1Var);
                    c1Var.V.h(0L);
                    return;
                }
                return;
            case 2:
                m2 m2Var2 = this.f9199y;
                m2Var2.d1();
                n1 n1Var2 = (n1) m2Var2.f4301y;
                c1 c1Var2 = n1Var2.B;
                u0 u0Var2 = n1Var2.C;
                n1.e(c1Var2);
                b1 b1Var = c1Var2.R;
                if (!b1Var.a()) {
                    a2.d2 d2Var = c1Var2.S;
                    long c11 = d2Var.c();
                    d2Var.h(1 + c11);
                    if (c11 >= 5) {
                        n1.g(u0Var2);
                        u0Var2.G.a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                        b1Var.b(true);
                        return;
                    } else {
                        if (m2Var2.R == null) {
                            m2Var2.R = new d2(m2Var2, n1Var2, 3);
                        }
                        m2Var2.R.b(0L);
                        return;
                    }
                }
                n1.g(u0Var2);
                u0Var2.K.a("Deferred Deep Link already retrieved. Not fetching again.");
                return;
            default:
                this.f9199y.z1();
                return;
        }
    }
}
