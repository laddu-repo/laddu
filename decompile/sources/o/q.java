package o;

import android.view.MenuItem;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class q implements MenuItem.OnActionExpandListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnActionExpandListener f9828a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f9829b;

    public q(s sVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f9829b = sVar;
        this.f9828a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f9828a.onMenuItemActionCollapse(this.f9829b.h(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f9828a.onMenuItemActionExpand(this.f9829b.h(menuItem));
    }
}
