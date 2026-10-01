package a2;

import android.os.Looper;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class v1 {

    /* renamed from: a, reason: collision with root package name */
    public final u1 f449a;

    /* renamed from: b, reason: collision with root package name */
    public final t1 f450b;

    /* renamed from: c, reason: collision with root package name */
    public int f451c;

    /* renamed from: d, reason: collision with root package name */
    public Object f452d;

    /* renamed from: e, reason: collision with root package name */
    public final Looper f453e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f454f;

    public v1(t1 t1Var, u1 u1Var, r1.d1 d1Var, int i6, Looper looper) {
        this.f450b = t1Var;
        this.f449a = u1Var;
        this.f453e = looper;
    }

    public final synchronized void a(boolean z10) {
        notifyAll();
    }

    public final void b() {
        u1.c.g(!this.f454f);
        this.f454f = true;
        w0 w0Var = (w0) this.f450b;
        if (!w0Var.f462e0 && w0Var.G.getThread().isAlive()) {
            w0Var.E.a(14, this).b();
        } else {
            u1.a.p("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            a(false);
        }
    }
}
