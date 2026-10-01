package m;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import sb.p;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class d extends a implements n.j {
    public WeakReference A;
    public boolean B;
    public n.l C;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Context f8371x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ActionBarContextView f8372y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public sc.b f8373z;

    @Override // m.a
    public final void a() {
        if (this.B) {
            return;
        }
        this.B = true;
        this.f8373z.a0(this);
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
        return this.C;
    }

    @Override // m.a
    public final MenuInflater d() {
        return new h(this.f8372y.getContext());
    }

    @Override // m.a
    public final CharSequence e() {
        return this.f8372y.getSubtitle();
    }

    @Override // m.a
    public final CharSequence f() {
        return this.f8372y.getTitle();
    }

    @Override // m.a
    public final void g() {
        this.f8373z.b0(this, this.C);
    }

    @Override // m.a
    public final boolean h() {
        return this.f8372y.N;
    }

    @Override // m.a
    public final void i(View view) {
        this.f8372y.setCustomView(view);
        this.A = view != null ? new WeakReference(view) : null;
    }

    @Override // m.a
    public final void j(int i) {
        k(this.f8371x.getString(i));
    }

    @Override // m.a
    public final void k(CharSequence charSequence) {
        this.f8372y.setSubtitle(charSequence);
    }

    @Override // m.a
    public final void l(int i) {
        m(this.f8371x.getString(i));
    }

    @Override // m.a
    public final void m(CharSequence charSequence) {
        this.f8372y.setTitle(charSequence);
    }

    @Override // m.a
    public final void n(boolean z2) {
        this.f8365w = z2;
        this.f8372y.setTitleOptional(z2);
    }

    @Override // n.j
    public final boolean q(n.l lVar, MenuItem menuItem) {
        return ((p) this.f8373z.f11786w).z(this, menuItem);
    }

    @Override // n.j
    public final void r(n.l lVar) {
        g();
        o.j jVar = this.f8372y.f590y;
        if (jVar != null) {
            jVar.l();
        }
    }
}
