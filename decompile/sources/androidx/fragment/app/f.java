package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements p0.b, qc.j, r2.n {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f1013v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f1014w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f1015x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f1016y;

    public /* synthetic */ f(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f1013v = obj;
        this.f1014w = obj2;
        this.f1015x = obj3;
        this.f1016y = obj4;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0066  */
    @Override // r2.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public y9.z0 a(int r17, t1.t0 r18, int[] r19) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.f.a(int, t1.t0, int[]):y9.z0");
    }

    @Override // qc.j
    public void c(String str, boolean z2) {
        qc.h hVar = (qc.h) this.f1013v;
        String str2 = (String) this.f1014w;
        String str3 = (String) this.f1015x;
        HashMap map = (HashMap) this.f1016y;
        if (!z2) {
            hVar.h("http://error", null);
            return;
        }
        try {
            hVar.h(str2 + fa.b.n(str2, str, str3), map);
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException unused) {
            hVar.h("http://error", null);
        }
    }

    @Override // p0.b
    public void onCancel() {
        View view = (View) this.f1013v;
        l lVar = (l) this.f1014w;
        g gVar = (g) this.f1015x;
        c1 c1Var = (c1) this.f1016y;
        de.i.e(lVar, "this$0");
        de.i.e(gVar, "$animationInfo");
        de.i.e(c1Var, "$operation");
        view.clearAnimation();
        lVar.f1044a.endViewTransition(view);
        gVar.d();
        if (q0.I(2)) {
            Log.v("FragmentManager", "Animation from operation " + c1Var + " has been cancelled.");
        }
    }
}
