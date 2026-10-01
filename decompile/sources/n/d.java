package n;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import ic.s;
import j4.b0;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d extends a implements o.j {
    public ActionBarContextView A;
    public b0 B;
    public WeakReference C;
    public boolean D;
    public o.l E;

    /* renamed from: z, reason: collision with root package name */
    public Context f8898z;

    @Override // o.j
    public final void G(o.l lVar) {
        g();
        p.j jVar = this.A.A;
        if (jVar != null) {
            jVar.l();
        }
    }

    @Override // n.a
    public final void a() {
        if (this.D) {
            return;
        }
        this.D = true;
        this.B.v(this);
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
        return this.E;
    }

    @Override // n.a
    public final MenuInflater d() {
        return new h(this.A.getContext());
    }

    @Override // n.a
    public final CharSequence e() {
        return this.A.getSubtitle();
    }

    @Override // n.a
    public final CharSequence f() {
        return this.A.getTitle();
    }

    @Override // n.a
    public final void g() {
        this.B.w(this, this.E);
    }

    @Override // n.a
    public final boolean h() {
        return this.A.P;
    }

    @Override // n.a
    public final void i(View view) {
        WeakReference weakReference;
        this.A.setCustomView(view);
        if (view != null) {
            weakReference = new WeakReference(view);
        } else {
            weakReference = null;
        }
        this.C = weakReference;
    }

    @Override // n.a
    public final void j(int i6) {
        k(this.f8898z.getString(i6));
    }

    @Override // n.a
    public final void k(CharSequence charSequence) {
        this.A.setSubtitle(charSequence);
    }

    @Override // n.a
    public final void l(int i6) {
        m(this.f8898z.getString(i6));
    }

    @Override // n.a
    public final void m(CharSequence charSequence) {
        this.A.setTitle(charSequence);
    }

    @Override // o.j
    public final boolean n(o.l lVar, MenuItem menuItem) {
        return ((s) this.B.f7158x).w(this, menuItem);
    }

    @Override // n.a
    public final void o(boolean z10) {
        this.f8891y = z10;
        this.A.setTitleOptional(z10);
    }
}
