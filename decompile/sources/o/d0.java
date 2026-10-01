package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d0 extends l implements SubMenu {
    public final n A;

    /* renamed from: z, reason: collision with root package name */
    public final l f9761z;

    public d0(Context context, l lVar, n nVar) {
        super(context);
        this.f9761z = lVar;
        this.A = nVar;
    }

    @Override // o.l
    public final boolean d(n nVar) {
        return this.f9761z.d(nVar);
    }

    @Override // o.l
    public final boolean e(l lVar, MenuItem menuItem) {
        if (!super.e(lVar, menuItem) && !this.f9761z.e(lVar, menuItem)) {
            return false;
        }
        return true;
    }

    @Override // o.l
    public final boolean f(n nVar) {
        return this.f9761z.f(nVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.A;
    }

    @Override // o.l
    public final String j() {
        int i6;
        n nVar = this.A;
        if (nVar != null) {
            i6 = nVar.f9801a;
        } else {
            i6 = 0;
        }
        if (i6 == 0) {
            return null;
        }
        return h8.c.i(i6, "android:menu:actionviewstates:");
    }

    @Override // o.l
    public final l k() {
        return this.f9761z.k();
    }

    @Override // o.l
    public final boolean m() {
        return this.f9761z.m();
    }

    @Override // o.l
    public final boolean n() {
        return this.f9761z.n();
    }

    @Override // o.l
    public final boolean o() {
        return this.f9761z.o();
    }

    @Override // o.l, android.view.Menu
    public final void setGroupDividerEnabled(boolean z10) {
        this.f9761z.setGroupDividerEnabled(z10);
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

    @Override // o.l, android.view.Menu
    public final void setQwertyMode(boolean z10) {
        this.f9761z.setQwertyMode(z10);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i6) {
        u(0, null, i6, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i6) {
        u(i6, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i6) {
        this.A.setIcon(i6);
        return this;
    }
}
