package c2;

import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n1 f1875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m1 f1876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f1878d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Looper f1879e;
    public boolean f;

    public o1(m1 m1Var, n1 n1Var, t1.s0 s0Var, int i, Looper looper) {
        this.f1876b = m1Var;
        this.f1875a = n1Var;
        this.f1879e = looper;
    }

    public final synchronized void a(boolean z2) {
        notifyAll();
    }

    public final void b() {
        w1.a.j(!this.f);
        this.f = true;
        r0 r0Var = (r0) this.f1876b;
        if (!r0Var.f1905d0 && r0Var.E.getThread().isAlive()) {
            r0Var.C.a(14, this).b();
        } else {
            w1.a.C("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            a(false);
        }
    }
}
