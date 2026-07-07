package androidx.activity;

import ac.j0;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.m;
import androidx.lifecycle.q;
import androidx.lifecycle.s;
import c.u;
import de.i;
import od.j;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class ImmLeaksCleaner implements q {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final j f569w = new j(new j0(2));

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final h.j f570v;

    public ImmLeaksCleaner(h.j jVar) {
        this.f570v = jVar;
    }

    @Override // androidx.lifecycle.q
    public final void a(s sVar, m mVar) {
        if (mVar != m.ON_DESTROY) {
            return;
        }
        Object systemService = this.f570v.getSystemService("input_method");
        i.c(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        u uVar = (u) f569w.getValue();
        Object objB = uVar.b(inputMethodManager);
        if (objB == null) {
            return;
        }
        synchronized (objB) {
            View viewC = uVar.c(inputMethodManager);
            if (viewC == null) {
                return;
            }
            if (viewC.isAttachedToWindow()) {
                return;
            }
            boolean zA = uVar.a(inputMethodManager);
            if (zA) {
                inputMethodManager.isActive();
            }
        }
    }
}
