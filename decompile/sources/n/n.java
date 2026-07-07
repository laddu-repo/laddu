package n;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class n implements n0.a {
    public o A;
    public MenuItem.OnActionExpandListener B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f8923e;
    public CharSequence f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Intent f8924g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public char f8925h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public char f8926j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Drawable f8928l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final l f8930n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public d0 f8931o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f8932p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public CharSequence f8933q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public CharSequence f8934r;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f8941y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public View f8942z;
    public int i = 4096;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f8927k = 4096;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f8929m = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ColorStateList f8935s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f8936t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f8937u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f8938v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f8939w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f8940x = 16;
    public boolean C = false;

    public n(l lVar, int i, int i10, int i11, int i12, CharSequence charSequence, int i13) {
        this.f8930n = lVar;
        this.f8919a = i10;
        this.f8920b = i;
        this.f8921c = i11;
        this.f8922d = i12;
        this.f8923e = charSequence;
        this.f8941y = i13;
    }

    public static void c(int i, int i10, String str, StringBuilder sb2) {
        if ((i & i10) == i10) {
            sb2.append(str);
        }
    }

    @Override // n0.a
    public final o a() {
        return this.A;
    }

    @Override // n0.a
    public final n0.a b(o oVar) {
        this.f8942z = null;
        this.A = oVar;
        this.f8930n.p(true);
        o oVar2 = this.A;
        if (oVar2 != null) {
            oVar2.f8943a = new ka.c(this);
            oVar2.f8944b.setVisibilityListener(oVar2);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f8941y & 8) == 0) {
            return false;
        }
        if (this.f8942z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f8930n.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f8939w && (this.f8937u || this.f8938v)) {
            drawable = drawable.mutate();
            if (this.f8937u) {
                drawable.setTintList(this.f8935s);
            }
            if (this.f8938v) {
                drawable.setTintMode(this.f8936t);
            }
            this.f8939w = false;
        }
        return drawable;
    }

    public final boolean e() {
        o oVar;
        if ((this.f8941y & 8) != 0) {
            if (this.f8942z == null && (oVar = this.A) != null) {
                this.f8942z = oVar.f8944b.onCreateActionView(this);
            }
            if (this.f8942z != null) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f8930n.f(this);
        }
        return false;
    }

    public final void f(boolean z2) {
        if (z2) {
            this.f8940x |= 32;
        } else {
            this.f8940x &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f8942z;
        if (view != null) {
            return view;
        }
        o oVar = this.A;
        if (oVar == null) {
            return null;
        }
        View viewOnCreateActionView = oVar.f8944b.onCreateActionView(this);
        this.f8942z = viewOnCreateActionView;
        return viewOnCreateActionView;
    }

    @Override // n0.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f8927k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f8926j;
    }

    @Override // n0.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f8933q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f8920b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f8928l;
        if (drawable != null) {
            return d(drawable);
        }
        int i = this.f8929m;
        if (i == 0) {
            return null;
        }
        Drawable drawableT = com.bumptech.glide.c.t(this.f8930n.f8894a, i);
        this.f8929m = 0;
        this.f8928l = drawableT;
        return d(drawableT);
    }

    @Override // n0.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f8935s;
    }

    @Override // n0.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f8936t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f8924g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f8919a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // n0.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f8925h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f8921c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f8931o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f8923e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f;
        return charSequence != null ? charSequence : this.f8923e;
    }

    @Override // n0.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f8934r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f8931o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f8940x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f8940x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f8940x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        o oVar = this.A;
        return (oVar == null || !oVar.f8944b.overridesItemVisibility()) ? (this.f8940x & 8) == 0 : (this.f8940x & 8) == 0 && this.A.f8944b.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i;
        this.f8942z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i = this.f8919a) > 0) {
            view.setId(i);
        }
        l lVar = this.f8930n;
        lVar.f8902k = true;
        lVar.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10) {
        if (this.f8926j == c10) {
            return this;
        }
        this.f8926j = Character.toLowerCase(c10);
        this.f8930n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z2) {
        int i = this.f8940x;
        int i10 = (z2 ? 1 : 0) | (i & (-2));
        this.f8940x = i10;
        if (i != i10) {
            this.f8930n.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z2) {
        int i = this.f8940x;
        int i10 = i & 4;
        l lVar = this.f8930n;
        if (i10 == 0) {
            int i11 = (i & (-3)) | (z2 ? 2 : 0);
            this.f8940x = i11;
            if (i != i11) {
                lVar.p(false);
            }
            return this;
        }
        ArrayList arrayList = lVar.f;
        int size = arrayList.size();
        lVar.w();
        for (int i12 = 0; i12 < size; i12++) {
            n nVar = (n) arrayList.get(i12);
            if (nVar.f8920b == this.f8920b && (nVar.f8940x & 4) != 0 && nVar.isCheckable()) {
                boolean z10 = nVar == this;
                int i13 = nVar.f8940x;
                int i14 = (z10 ? 2 : 0) | (i13 & (-3));
                nVar.f8940x = i14;
                if (i13 != i14) {
                    nVar.f8930n.p(false);
                }
            }
        }
        lVar.v();
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z2) {
        if (z2) {
            this.f8940x |= 16;
        } else {
            this.f8940x &= -17;
        }
        this.f8930n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f8929m = 0;
        this.f8928l = drawable;
        this.f8939w = true;
        this.f8930n.p(false);
        return this;
    }

    @Override // n0.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f8935s = colorStateList;
        this.f8937u = true;
        this.f8939w = true;
        this.f8930n.p(false);
        return this;
    }

    @Override // n0.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f8936t = mode;
        this.f8938v = true;
        this.f8939w = true;
        this.f8930n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f8924g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10) {
        if (this.f8925h == c10) {
            return this;
        }
        this.f8925h = c10;
        this.f8930n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f8932p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11) {
        this.f8925h = c10;
        this.f8926j = Character.toLowerCase(c11);
        this.f8930n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i10 = i & 3;
        if (i10 != 0 && i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f8941y = i;
        l lVar = this.f8930n;
        lVar.f8902k = true;
        lVar.p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f8923e = charSequence;
        this.f8930n.p(false);
        d0 d0Var = this.f8931o;
        if (d0Var != null) {
            d0Var.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f = charSequence;
        this.f8930n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z2) {
        int i = this.f8940x;
        int i10 = (z2 ? 0 : 8) | (i & (-9));
        this.f8940x = i10;
        if (i != i10) {
            l lVar = this.f8930n;
            lVar.f8900h = true;
            lVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f8923e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // n0.a, android.view.MenuItem
    public final n0.a setContentDescription(CharSequence charSequence) {
        this.f8933q = charSequence;
        this.f8930n.p(false);
        return this;
    }

    @Override // n0.a, android.view.MenuItem
    public final n0.a setTooltipText(CharSequence charSequence) {
        this.f8934r = charSequence;
        this.f8930n.p(false);
        return this;
    }

    @Override // n0.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10, int i) {
        if (this.f8926j == c10 && this.f8927k == i) {
            return this;
        }
        this.f8926j = Character.toLowerCase(c10);
        this.f8927k = KeyEvent.normalizeMetaState(i);
        this.f8930n.p(false);
        return this;
    }

    @Override // n0.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10, int i) {
        if (this.f8925h == c10 && this.i == i) {
            return this;
        }
        this.f8925h = c10;
        this.i = KeyEvent.normalizeMetaState(i);
        this.f8930n.p(false);
        return this;
    }

    @Override // n0.a, android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11, int i, int i10) {
        this.f8925h = c10;
        this.i = KeyEvent.normalizeMetaState(i);
        this.f8926j = Character.toLowerCase(c11);
        this.f8927k = KeyEvent.normalizeMetaState(i10);
        this.f8930n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f8928l = null;
        this.f8929m = i;
        this.f8939w = true;
        this.f8930n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.f8930n.f8894a.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        int i10;
        l lVar = this.f8930n;
        Context context = lVar.f8894a;
        View viewInflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.f8942z = viewInflate;
        this.A = null;
        if (viewInflate != null && viewInflate.getId() == -1 && (i10 = this.f8919a) > 0) {
            viewInflate.setId(i10);
        }
        lVar.f8902k = true;
        lVar.p(true);
        return this;
    }
}
