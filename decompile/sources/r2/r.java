package r2;

import t1.t0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t0 f11119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f11120b;

    public r(int i, t0 t0Var, int[] iArr) {
        if (iArr.length == 0) {
            w1.a.p("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.f11119a = t0Var;
        this.f11120b = iArr;
    }
}
