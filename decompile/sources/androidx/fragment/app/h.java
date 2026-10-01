package androidx.fragment.app;

import android.content.Context;
import android.content.IntentFilter;
import android.util.SparseIntArray;
import android.view.MenuItem;
import android.view.View;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f1023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f1024b;

    public h(Context context) {
        this.f1023a = context;
    }

    public void c() {
        com.bumptech.glide.manager.q qVar = (com.bumptech.glide.manager.q) this.f1023a;
        if (qVar != null) {
            try {
                ((h.d0) this.f1024b).F.unregisterReceiver(qVar);
            } catch (IllegalArgumentException unused) {
            }
            this.f1023a = null;
        }
    }

    public void d() {
        c1 c1Var = (c1) this.f1023a;
        p0.c cVar = (p0.c) this.f1024b;
        LinkedHashSet linkedHashSet = c1Var.f994e;
        if (linkedHashSet.remove(cVar) && linkedHashSet.isEmpty()) {
            c1Var.b();
        }
    }

    public abstract IntentFilter e();

    public abstract int f();

    public MenuItem g(MenuItem menuItem) {
        if (!(menuItem instanceof n0.a)) {
            return menuItem;
        }
        n0.a aVar = (n0.a) menuItem;
        if (((v.i) this.f1024b) == null) {
            this.f1024b = new v.i(0);
        }
        MenuItem menuItem2 = (MenuItem) ((v.i) this.f1024b).get(aVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        n.s sVar = new n.s((Context) this.f1023a, aVar);
        ((v.i) this.f1024b).put(aVar, sVar);
        return sVar;
    }

    public int h(int i, int i10) {
        int iJ = j(i);
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < i; i13++) {
            int iJ2 = j(i13);
            i11 += iJ2;
            if (i11 == i10) {
                i12++;
                i11 = 0;
            } else if (i11 > i10) {
                i12++;
                i11 = iJ2;
            }
        }
        return i11 + iJ > i10 ? i12 + 1 : i12;
    }

    public int i(int i, int i10) {
        int iJ = j(i);
        if (iJ == i10) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < i; i12++) {
            int iJ2 = j(i12);
            i11 += iJ2;
            if (i11 == i10) {
                i11 = 0;
            } else if (i11 > i10) {
                i11 = iJ2;
            }
        }
        if (iJ + i11 <= i10) {
            return i11;
        }
        return 0;
    }

    public abstract int j(int i);

    public void k() {
        ((SparseIntArray) this.f1023a).clear();
    }

    public boolean l() {
        c1 c1Var = (c1) this.f1023a;
        View view = c1Var.f992c.f1135b0;
        de.i.d(view, "operation.fragment.mView");
        int i = 4;
        if (view.getAlpha() != 0.0f || view.getVisibility() != 0) {
            int visibility = view.getVisibility();
            if (visibility == 0) {
                i = 2;
            } else if (visibility != 4) {
                if (visibility != 8) {
                    throw new IllegalArgumentException(d0.d.h(visibility, "Unknown visibility "));
                }
                i = 3;
            }
        }
        int i10 = c1Var.f990a;
        if (i != i10) {
            return (i == 2 || i10 == 2) ? false : true;
        }
        return true;
    }

    public abstract void m();

    public void n() {
        c();
        IntentFilter intentFilterE = e();
        if (intentFilterE.countActions() == 0) {
            return;
        }
        if (((com.bumptech.glide.manager.q) this.f1023a) == null) {
            this.f1023a = new com.bumptech.glide.manager.q(2, this);
        }
        ((h.d0) this.f1024b).F.registerReceiver((com.bumptech.glide.manager.q) this.f1023a, intentFilterE);
    }

    public h(c1 c1Var, p0.c cVar) {
        this.f1023a = c1Var;
        this.f1024b = cVar;
    }

    public h() {
        this.f1023a = new SparseIntArray();
        this.f1024b = new SparseIntArray();
    }

    public h(h.d0 d0Var) {
        this.f1024b = d0Var;
    }
}
