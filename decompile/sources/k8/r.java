package k8;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f7728d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f7729e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u f7730g;

    public r(p1 p1Var, String str, String str2, String str3, long j8, long j9, long j10, Bundle bundle) {
        u uVar;
        t7.y.d(str2);
        t7.y.d(str3);
        this.f7725a = str2;
        this.f7726b = str3;
        this.f7727c = true == TextUtils.isEmpty(str) ? null : str;
        this.f7728d = j8;
        this.f7729e = j9;
        this.f = j10;
        if (j10 != 0 && j10 > j8) {
            v0 v0Var = p1Var.A;
            p1.l(v0Var);
            v0Var.E.b(v0.L(str2), "Event created with reverse previous/current timestamps. appId");
        }
        if (bundle == null || bundle.isEmpty()) {
            uVar = new u(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    v0 v0Var2 = p1Var.A;
                    p1.l(v0Var2);
                    v0Var2.B.a("Param name can't be null");
                    it.remove();
                } else {
                    t4 t4Var = p1Var.D;
                    p1.j(t4Var);
                    Object objM = t4Var.M(bundle2.get(next), next);
                    if (objM == null) {
                        v0 v0Var3 = p1Var.A;
                        p1.l(v0Var3);
                        v0Var3.E.b(p1Var.E.b(next), "Param value can't be null");
                        it.remove();
                    } else {
                        t4 t4Var2 = p1Var.D;
                        p1.j(t4Var2);
                        t4Var2.U(bundle2, next, objM);
                    }
                }
            }
            uVar = new u(bundle2);
        }
        this.f7730g = uVar;
    }

    public final r a(p1 p1Var, long j8) {
        return new r(p1Var, this.f7727c, this.f7725a, this.f7726b, this.f7728d, this.f7729e, j8, this.f7730g);
    }

    public final String toString() {
        String string = this.f7730g.toString();
        String str = this.f7725a;
        int length = String.valueOf(str).length();
        String str2 = this.f7726b;
        StringBuilder sb2 = new StringBuilder(length + 22 + String.valueOf(str2).length() + 10 + string.length() + 1);
        j4.a.s(sb2, "Event{appId='", str, "', name='", str2);
        return d0.d.n(sb2, "', params=", string, "}");
    }

    public r(p1 p1Var, String str, String str2, String str3, long j8, long j9, long j10, u uVar) {
        t7.y.d(str2);
        t7.y.d(str3);
        t7.y.g(uVar);
        this.f7725a = str2;
        this.f7726b = str3;
        this.f7727c = true == TextUtils.isEmpty(str) ? null : str;
        this.f7728d = j8;
        this.f7729e = j9;
        this.f = j10;
        if (j10 != 0 && j10 > j8) {
            v0 v0Var = p1Var.A;
            p1.l(v0Var);
            v0Var.E.c(v0.L(str2), v0.L(str3), "Event created with reverse previous/current timestamps. appId, name");
        }
        this.f7730g = uVar;
    }
}
