package androidx.fragment.app;

import android.os.Handler;
import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends z7.b implements androidx.lifecycle.u0, androidx.lifecycle.s, u4.d, u0 {
    public final q0 A;
    public final /* synthetic */ h.j B;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final h.j f987x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final h.j f988y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Handler f989z;

    public c0(h.j jVar) {
        this.B = jVar;
        Handler handler = new Handler();
        this.A = new q0();
        this.f987x = jVar;
        this.f988y = jVar;
        this.f989z = handler;
    }

    @Override // z7.b
    public final View H(int i) {
        return this.B.findViewById(i);
    }

    @Override // z7.b
    public final boolean I() {
        Window window = this.B.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // u4.d
    public final o.r a() {
        return (o.r) this.B.f1654y.f2439y;
    }

    @Override // androidx.lifecycle.u0
    public final androidx.lifecycle.t0 e() {
        return this.B.e();
    }

    @Override // androidx.lifecycle.s
    public final androidx.lifecycle.u f() {
        return this.B.R;
    }

    @Override // androidx.fragment.app.u0
    public final void b() {
    }
}
