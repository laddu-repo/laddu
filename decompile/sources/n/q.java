package n;

import android.view.MenuItem;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class q implements MenuItem.OnActionExpandListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MenuItem.OnActionExpandListener f8946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f8947b;

    public q(s sVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f8947b = sVar;
        this.f8946a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f8946a.onMenuItemActionCollapse(this.f8947b.g(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f8946a.onMenuItemActionExpand(this.f8947b.g(menuItem));
    }
}
