package n;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends l implements SubMenu {
    public final n A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final l f8873z;

    public d0(Context context, l lVar, n nVar) {
        super(context);
        this.f8873z = lVar;
        this.A = nVar;
    }

    @Override // n.l
    public final boolean d(n nVar) {
        return this.f8873z.d(nVar);
    }

    @Override // n.l
    public final boolean e(l lVar, MenuItem menuItem) {
        return super.e(lVar, menuItem) || this.f8873z.e(lVar, menuItem);
    }

    @Override // n.l
    public final boolean f(n nVar) {
        return this.f8873z.f(nVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.A;
    }

    @Override // n.l
    public final String j() {
        n nVar = this.A;
        int i = nVar != null ? nVar.f8919a : 0;
        if (i == 0) {
            return null;
        }
        return d0.d.h(i, "android:menu:actionviewstates:");
    }

    @Override // n.l
    public final l k() {
        return this.f8873z.k();
    }

    @Override // n.l
    public final boolean m() {
        return this.f8873z.m();
    }

    @Override // n.l
    public final boolean n() {
        return this.f8873z.n();
    }

    @Override // n.l
    public final boolean o() {
        return this.f8873z.o();
    }

    @Override // n.l, android.view.Menu
    public final void setGroupDividerEnabled(boolean z2) {
        this.f8873z.setGroupDividerEnabled(z2);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        u(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.A.setIcon(drawable);
        return this;
    }

    @Override // n.l, android.view.Menu
    public final void setQwertyMode(boolean z2) {
        this.f8873z.setQwertyMode(z2);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        u(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        u(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.A.setIcon(i);
        return this;
    }
}
