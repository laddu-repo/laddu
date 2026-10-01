package i;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class l0 extends n.a implements o.j {
    public final o.l A;
    public j4.b0 B;
    public WeakReference C;
    public final /* synthetic */ m0 D;

    /* renamed from: z, reason: collision with root package name */
    public final Context f6226z;

    public l0(m0 m0Var, Context context, j4.b0 b0Var) {
        this.D = m0Var;
        this.f6226z = context;
        this.B = b0Var;
        o.l lVar = new o.l(context);
        lVar.f9786l = 1;
        this.A = lVar;
        lVar.f9780e = this;
    }

    @Override // o.j
    public final void G(o.l lVar) {
        if (this.B != null) {
            g();
            p.j jVar = this.D.f6233g.A;
            if (jVar != null) {
                jVar.l();
            }
        }
    }

    @Override // n.a
    public final void a() {
        m0 m0Var = this.D;
        if (m0Var.j != this) {
            return;
        }
        if (m0Var.f6242q) {
            m0Var.f6236k = this;
            m0Var.f6237l = this.B;
        } else {
            this.B.v(this);
        }
        this.B = null;
        m0Var.t(false);
        ActionBarContextView actionBarContextView = m0Var.f6233g;
        if (actionBarContextView.H == null) {
            actionBarContextView.e();
        }
        m0Var.f6230d.setHideOnContentScrollEnabled(m0Var.f6246v);
        m0Var.j = null;
    }

    @Override // n.a
    public final View b() {
        WeakReference weakReference = this.C;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // n.a
    public final o.l c() {
        return this.A;
    }

    @Override // n.a
    public final MenuInflater d() {
        return new n.h(this.f6226z);
    }

    @Override // n.a
    public final CharSequence e() {
        return this.D.f6233g.getSubtitle();
    }

    @Override // n.a
    public final CharSequence f() {
        return this.D.f6233g.getTitle();
    }

    @Override // n.a
    public final void g() {
        if (this.D.j != this) {
            return;
        }
        o.l lVar = this.A;
        lVar.w();
        try {
            this.B.w(this, lVar);
        } finally {
            lVar.v();
        }
    }

    @Override // n.a
    public final boolean h() {
        return this.D.f6233g.P;
    }

    @Override // n.a
    public final void i(View view) {
        this.D.f6233g.setCustomView(view);
        this.C = new WeakReference(view);
    }

    @Override // n.a
    public final void j(int i6) {
        k(this.D.f6228b.getResources().getString(i6));
    }

    @Override // n.a
    public final void k(CharSequence charSequence) {
        this.D.f6233g.setSubtitle(charSequence);
    }

    @Override // n.a
    public final void l(int i6) {
        m(this.D.f6228b.getResources().getString(i6));
    }

    @Override // n.a
    public final void m(CharSequence charSequence) {
        this.D.f6233g.setTitle(charSequence);
    }

    @Override // o.j
    public final boolean n(o.l lVar, MenuItem menuItem) {
        j4.b0 b0Var = this.B;
        if (b0Var != null) {
            return ((ic.s) b0Var.f7158x).w(this, menuItem);
        }
        return false;
    }

    @Override // n.a
    public final void o(boolean z10) {
        this.f8891y = z10;
        this.D.f6233g.setTitleOptional(z10);
    }
}
