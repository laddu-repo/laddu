package h;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class o0 extends m.a implements n.j {
    public WeakReference A;
    public final /* synthetic */ p0 B;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Context f5958x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final n.l f5959y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public sc.b f5960z;

    public o0(p0 p0Var, Context context, sc.b bVar) {
        this.B = p0Var;
        this.f5958x = context;
        this.f5960z = bVar;
        n.l lVar = new n.l(context);
        lVar.f8903l = 1;
        this.f5959y = lVar;
        lVar.f8898e = this;
    }

    @Override // m.a
    public final void a() {
        p0 p0Var = this.B;
        if (p0Var.f5969m != this) {
            return;
        }
        if (p0Var.f5976t) {
            p0Var.f5970n = this;
            p0Var.f5971o = this.f5960z;
        } else {
            this.f5960z.a0(this);
        }
        this.f5960z = null;
        p0Var.W(false);
        ActionBarContextView actionBarContextView = p0Var.f5966j;
        if (actionBarContextView.F == null) {
            actionBarContextView.e();
        }
        p0Var.f5964g.setHideOnContentScrollEnabled(p0Var.f5981y);
        p0Var.f5969m = null;
    }

    @Override // m.a
    public final View b() {
        WeakReference weakReference = this.A;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // m.a
    public final n.l c() {
        return this.f5959y;
    }

    @Override // m.a
    public final MenuInflater d() {
        return new m.h(this.f5958x);
    }

    @Override // m.a
    public final CharSequence e() {
        return this.B.f5966j.getSubtitle();
    }

    @Override // m.a
    public final CharSequence f() {
        return this.B.f5966j.getTitle();
    }

    @Override // m.a
    public final void g() {
        if (this.B.f5969m != this) {
            return;
        }
        n.l lVar = this.f5959y;
        lVar.w();
        try {
            this.f5960z.b0(this, lVar);
        } finally {
            lVar.v();
        }
    }

    @Override // m.a
    public final boolean h() {
        return this.B.f5966j.N;
    }

    @Override // m.a
    public final void i(View view) {
        this.B.f5966j.setCustomView(view);
        this.A = new WeakReference(view);
    }

    @Override // m.a
    public final void j(int i) {
        k(this.B.f5963e.getResources().getString(i));
    }

    @Override // m.a
    public final void k(CharSequence charSequence) {
        this.B.f5966j.setSubtitle(charSequence);
    }

    @Override // m.a
    public final void l(int i) {
        m(this.B.f5963e.getResources().getString(i));
    }

    @Override // m.a
    public final void m(CharSequence charSequence) {
        this.B.f5966j.setTitle(charSequence);
    }

    @Override // m.a
    public final void n(boolean z2) {
        this.f8365w = z2;
        this.B.f5966j.setTitleOptional(z2);
    }

    @Override // n.j
    public final boolean q(n.l lVar, MenuItem menuItem) {
        sc.b bVar = this.f5960z;
        if (bVar != null) {
            return ((sb.p) bVar.f11786w).z(this, menuItem);
        }
        return false;
    }

    @Override // n.j
    public final void r(n.l lVar) {
        if (this.f5960z == null) {
            return;
        }
        g();
        o.j jVar = this.B.f5966j.f590y;
        if (jVar != null) {
            jVar.l();
        }
    }
}
