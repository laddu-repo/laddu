package h;

import android.content.Context;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.Window;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;
import o.f3;
import o.k3;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends com.bumptech.glide.f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k3 f5936e;
    public final Window.Callback f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a9.g f5937g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f5938h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f5939j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f5940k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final androidx.fragment.app.m f5941l = new androidx.fragment.app.m(6, this);

    public k0(Toolbar toolbar, CharSequence charSequence, z zVar) {
        s5.c cVar = new s5.c(19, this);
        k3 k3Var = new k3(toolbar, false);
        this.f5936e = k3Var;
        zVar.getClass();
        this.f = zVar;
        k3Var.f9207k = zVar;
        toolbar.setOnMenuItemClickListener(cVar);
        if (!k3Var.f9204g) {
            k3Var.f9205h = charSequence;
            if ((k3Var.f9200b & 8) != 0) {
                toolbar.setTitle(charSequence);
                if (k3Var.f9204g) {
                    t0.m0.o(toolbar.getRootView(), charSequence);
                }
            }
        }
        this.f5937g = new a9.g(19, this);
    }

    @Override // com.bumptech.glide.f
    public final boolean A() {
        k3 k3Var = this.f5936e;
        Toolbar toolbar = k3Var.f9199a;
        androidx.fragment.app.m mVar = this.f5941l;
        toolbar.removeCallbacks(mVar);
        Toolbar toolbar2 = k3Var.f9199a;
        WeakHashMap weakHashMap = t0.m0.f11853a;
        toolbar2.postOnAnimation(mVar);
        return true;
    }

    @Override // com.bumptech.glide.f
    public final void D() {
        this.f5936e.f9199a.removeCallbacks(this.f5941l);
    }

    @Override // com.bumptech.glide.f
    public final boolean E(int i, KeyEvent keyEvent) {
        Menu menuW = W();
        if (menuW == null) {
            return false;
        }
        menuW.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return menuW.performShortcut(i, keyEvent, 0);
    }

    @Override // com.bumptech.glide.f
    public final boolean F(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            G();
        }
        return true;
    }

    @Override // com.bumptech.glide.f
    public final boolean G() {
        return this.f5936e.f9199a.u();
    }

    @Override // com.bumptech.glide.f
    public final void O(boolean z2) {
        int i = z2 ? 4 : 0;
        k3 k3Var = this.f5936e;
        k3Var.a((i & 4) | (k3Var.f9200b & (-5)));
    }

    @Override // com.bumptech.glide.f
    public final void Q(CharSequence charSequence) {
        k3 k3Var = this.f5936e;
        if (k3Var.f9204g) {
            return;
        }
        Toolbar toolbar = k3Var.f9199a;
        k3Var.f9205h = charSequence;
        if ((k3Var.f9200b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (k3Var.f9204g) {
                t0.m0.o(toolbar.getRootView(), charSequence);
            }
        }
    }

    public final Menu W() {
        boolean z2 = this.i;
        k3 k3Var = this.f5936e;
        if (!z2) {
            c6.f0 f0Var = new c6.f0((Object) this, false);
            s5.d dVar = new s5.d(this);
            Toolbar toolbar = k3Var.f9199a;
            toolbar.f675l0 = f0Var;
            toolbar.f676m0 = dVar;
            ActionMenuView actionMenuView = toolbar.f681v;
            if (actionMenuView != null) {
                actionMenuView.P = f0Var;
                actionMenuView.Q = dVar;
            }
            this.i = true;
        }
        return k3Var.f9199a.getMenu();
    }

    @Override // com.bumptech.glide.f
    public final boolean e() {
        o.j jVar;
        ActionMenuView actionMenuView = this.f5936e.f9199a.f681v;
        return (actionMenuView == null || (jVar = actionMenuView.O) == null || !jVar.c()) ? false : true;
    }

    @Override // com.bumptech.glide.f
    public final boolean f() {
        n.n nVar;
        f3 f3Var = this.f5936e.f9199a.f674k0;
        if (f3Var == null || (nVar = f3Var.f9155w) == null) {
            return false;
        }
        if (f3Var == null) {
            nVar = null;
        }
        if (nVar == null) {
            return true;
        }
        nVar.collapseActionView();
        return true;
    }

    @Override // com.bumptech.glide.f
    public final void l(boolean z2) {
        if (z2 == this.f5939j) {
            return;
        }
        this.f5939j = z2;
        ArrayList arrayList = this.f5940k;
        if (arrayList.size() > 0) {
            throw d0.d.f(0, arrayList);
        }
    }

    @Override // com.bumptech.glide.f
    public final int t() {
        return this.f5936e.f9200b;
    }

    @Override // com.bumptech.glide.f
    public final Context z() {
        return this.f5936e.f9199a.getContext();
    }

    @Override // com.bumptech.glide.f
    public final void C() {
    }

    @Override // com.bumptech.glide.f
    public final void N(boolean z2) {
    }

    @Override // com.bumptech.glide.f
    public final void P(boolean z2) {
    }
}
