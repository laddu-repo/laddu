package androidx.activity;

import androidx.lifecycle.m;
import androidx.lifecycle.q;
import androidx.lifecycle.s;
import androidx.lifecycle.u;
import c.a0;
import c.x;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class OnBackPressedDispatcher$addCallback$lifecycleObserver$1 implements q, AutoCloseable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ x f571v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u f572w;

    public OnBackPressedDispatcher$addCallback$lifecycleObserver$1(x xVar, a0 a0Var, u uVar) {
        this.f571v = xVar;
        this.f572w = uVar;
    }

    @Override // androidx.lifecycle.q
    public final void a(s sVar, m mVar) {
        m mVar2 = m.ON_START;
        x xVar = this.f571v;
        if (mVar == mVar2) {
            xVar.b(true);
        } else if (mVar == m.ON_STOP) {
            xVar.b(false);
        }
        if (mVar == m.ON_DESTROY) {
            xVar.a();
            this.f572w.f(this);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f572w.f(this);
    }
}
