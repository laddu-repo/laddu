package o;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a implements n0.a {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f9741a;

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f9742b;

    /* renamed from: c, reason: collision with root package name */
    public Intent f9743c;

    /* renamed from: d, reason: collision with root package name */
    public char f9744d;

    /* renamed from: e, reason: collision with root package name */
    public int f9745e;

    /* renamed from: f, reason: collision with root package name */
    public char f9746f;

    /* renamed from: g, reason: collision with root package name */
    public int f9747g;

    /* renamed from: h, reason: collision with root package name */
    public Drawable f9748h;

    /* renamed from: i, reason: collision with root package name */
    public Context f9749i;
    public CharSequence j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f9750k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f9751l;

    /* renamed from: m, reason: collision with root package name */
    public PorterDuff.Mode f9752m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f9753n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f9754o;

    /* renamed from: p, reason: collision with root package name */
    public int f9755p;

    @Override // n0.a
    public final o a() {
        return null;
    }

    @Override // n0.a
    public final n0.a b(o oVar) {
        throw new UnsupportedOperationException();
    }

    public final void c() {
        Drawable drawable = this.f9748h;
        if (drawable != null) {
            if (this.f9753n || this.f9754o) {
                Drawable A = s1.c.A(drawable);
                this.f9748h = A;
                Drawable mutate = A.mutate();
                this.f9748h = mutate;
                if (this.f9753n) {
                    mutate.setTintList(this.f9751l);
                }
                if (this.f9754o) {
                    this.f9748h.setTintMode(this.f9752m);
                }
            }
        }
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // n0.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f9747g;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f9746f;
    }

    @Override // n0.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.j;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f9748h;
    }

    @Override // n0.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f9751l;
    }

    @Override // n0.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f9752m;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f9743c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // n0.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f9745e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f9744d;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f9741a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f9742b;
        if (charSequence != null) {
            return charSequence;
        }
        return this.f9741a;
    }

    @Override // n0.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f9750k;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        if ((this.f9755p & 1) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        if ((this.f9755p & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        if ((this.f9755p & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        if ((this.f9755p & 8) == 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10) {
        this.f9746f = Character.toLowerCase(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z10) {
        this.f9755p = (z10 ? 1 : 0) | (this.f9755p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z10) {
        int i6;
        int i10 = this.f9755p & (-3);
        if (z10) {
            i6 = 2;
        } else {
            i6 = 0;
        }
        this.f9755p = i6 | i10;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z10) {
        int i6;
        int i10 = this.f9755p & (-17);
        if (z10) {
            i6 = 16;
        } else {
            i6 = 0;
        }
        this.f9755p = i6 | i10;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f9748h = drawable;
        c();
        return this;
    }

    @Override // n0.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f9751l = colorStateList;
        this.f9753n = true;
        c();
        return this;
    }

    @Override // n0.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f9752m = mode;
        this.f9754o = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f9743c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10) {
        this.f9744d = c10;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11) {
        this.f9744d = c10;
        this.f9746f = Character.toLowerCase(c11);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f9741a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f9742b = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f9750k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z10) {
        int i6 = 8;
        int i10 = this.f9755p & 8;
        if (z10) {
            i6 = 0;
        }
        this.f9755p = i10 | i6;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i6) {
        throw new UnsupportedOperationException();
    }

    @Override // n0.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10, int i6) {
        this.f9746f = Character.toLowerCase(c10);
        this.f9747g = KeyEvent.normalizeMetaState(i6);
        return this;
    }

    @Override // n0.a, android.view.MenuItem
    public final n0.a setContentDescription(CharSequence charSequence) {
        this.j = charSequence;
        return this;
    }

    @Override // n0.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10, int i6) {
        this.f9744d = c10;
        this.f9745e = KeyEvent.normalizeMetaState(i6);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i6) {
        this.f9741a = this.f9749i.getResources().getString(i6);
        return this;
    }

    @Override // n0.a, android.view.MenuItem
    public final n0.a setTooltipText(CharSequence charSequence) {
        this.f9750k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i6) {
        this.f9748h = this.f9749i.getDrawable(i6);
        c();
        return this;
    }

    @Override // n0.a, android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11, int i6, int i10) {
        this.f9744d = c10;
        this.f9745e = KeyEvent.normalizeMetaState(i6);
        this.f9746f = Character.toLowerCase(c11);
        this.f9747g = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i6) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i6) {
        return this;
    }
}
