package r2;

import c2.r1;
import java.util.Objects;
import t1.z0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r1[] f11129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s[] f11130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z0 f11131d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f11132e;

    public w(r1[] r1VarArr, s[] sVarArr, z0 z0Var, Object obj) {
        w1.a.d(r1VarArr.length == sVarArr.length);
        this.f11129b = r1VarArr;
        this.f11130c = (s[]) sVarArr.clone();
        this.f11131d = z0Var;
        this.f11132e = obj;
        this.f11128a = r1VarArr.length;
    }

    public final boolean a(w wVar, int i) {
        return wVar != null && Objects.equals(this.f11129b[i], wVar.f11129b[i]) && Objects.equals(this.f11130c[i], wVar.f11130c[i]);
    }

    public final boolean b(int i) {
        return this.f11129b[i] != null;
    }
}
