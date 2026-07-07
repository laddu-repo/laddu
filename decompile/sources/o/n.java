package o;

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
import com.google.protobuf.CodedOutputStream;
import java.util.ArrayList;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class n implements n0.a {
    public o A;
    public MenuItem.OnActionExpandListener B;

    /* renamed from: a, reason: collision with root package name */
    public final int f9801a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9802b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9803c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9804d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f9805e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f9806f;

    /* renamed from: g, reason: collision with root package name */
    public Intent f9807g;

    /* renamed from: h, reason: collision with root package name */
    public char f9808h;
    public char j;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f9811l;

    /* renamed from: n, reason: collision with root package name */
    public final l f9813n;

    /* renamed from: o, reason: collision with root package name */
    public d0 f9814o;

    /* renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f9815p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f9816q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f9817r;

    /* renamed from: y, reason: collision with root package name */
    public int f9823y;

    /* renamed from: z, reason: collision with root package name */
    public View f9824z;

    /* renamed from: i, reason: collision with root package name */
    public int f9809i = CodedOutputStream.DEFAULT_BUFFER_SIZE;

    /* renamed from: k, reason: collision with root package name */
    public int f9810k = CodedOutputStream.DEFAULT_BUFFER_SIZE;

    /* renamed from: m, reason: collision with root package name */
    public int f9812m = 0;
    public ColorStateList s = null;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f9818t = null;

    /* renamed from: u, reason: collision with root package name */
    public boolean f9819u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f9820v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f9821w = false;

    /* renamed from: x, reason: collision with root package name */
    public int f9822x = 16;
    public boolean C = false;

    public n(l lVar, int i6, int i10, int i11, int i12, CharSequence charSequence, int i13) {
        this.f9813n = lVar;
        this.f9801a = i10;
        this.f9802b = i6;
        this.f9803c = i11;
        this.f9804d = i12;
        this.f9805e = charSequence;
        this.f9823y = i13;
    }

    public static void c(int i6, int i10, String str, StringBuilder sb2) {
        if ((i6 & i10) == i10) {
            sb2.append(str);
        }
    }

    @Override // n0.a
    public final o a() {
        return this.A;
    }

    @Override // n0.a
    public final n0.a b(o oVar) {
        this.f9824z = null;
        this.A = oVar;
        this.f9813n.p(true);
        o oVar2 = this.A;
        if (oVar2 != null) {
            oVar2.f9825a = new k7.d(this, 20);
            oVar2.f9826b.setVisibilityListener(oVar2);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f9823y & 8) == 0) {
            return false;
        }
        if (this.f9824z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionCollapse(this)) {
            return false;
        }
        return this.f9813n.d(this);
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f9821w && (this.f9819u || this.f9820v)) {
            drawable = s1.c.A(drawable).mutate();
            if (this.f9819u) {
                drawable.setTintList(this.s);
            }
            if (this.f9820v) {
                drawable.setTintMode(this.f9818t);
            }
            this.f9821w = false;
        }
        return drawable;
    }

    public final boolean e() {
        o oVar;
        if ((this.f9823y & 8) != 0) {
            if (this.f9824z == null && (oVar = this.A) != null) {
                this.f9824z = oVar.f9826b.onCreateActionView(this);
            }
            if (this.f9824z != null) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (e()) {
            MenuItem.OnActionExpandListener onActionExpandListener = this.B;
            if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionExpand(this)) {
                return false;
            }
            return this.f9813n.f(this);
        }
        return false;
    }

    public final void f(boolean z10) {
        if (z10) {
            this.f9822x |= 32;
        } else {
            this.f9822x &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f9824z;
        if (view != null) {
            return view;
        }
        o oVar = this.A;
        if (oVar != null) {
            View onCreateActionView = oVar.f9826b.onCreateActionView(this);
            this.f9824z = onCreateActionView;
            return onCreateActionView;
        }
        return null;
    }

    @Override // n0.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f9810k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.j;
    }

    @Override // n0.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f9816q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f9802b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f9811l;
        if (drawable != null) {
            return d(drawable);
        }
        int i6 = this.f9812m;
        if (i6 != 0) {
            Drawable f3 = c9.a.f(this.f9813n.f9776a, i6);
            this.f9812m = 0;
            this.f9811l = f3;
            return d(f3);
        }
        return null;
    }

    @Override // n0.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.s;
    }

    @Override // n0.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f9818t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f9807g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f9801a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // n0.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f9809i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f9808h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f9803c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f9814o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f9805e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f9806f;
        if (charSequence != null) {
            return charSequence;
        }
        return this.f9805e;
    }

    @Override // n0.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f9817r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        if (this.f9814o != null) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        if ((this.f9822x & 1) == 1) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        if ((this.f9822x & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        if ((this.f9822x & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        o oVar = this.A;
        if (oVar != null && oVar.f9826b.overridesItemVisibility()) {
            if ((this.f9822x & 8) != 0 || !this.A.f9826b.isVisible()) {
                return false;
            }
            return true;
        }
        if ((this.f9822x & 8) != 0) {
            return false;
        }
        return true;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i6;
        this.f9824z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i6 = this.f9801a) > 0) {
            view.setId(i6);
        }
        l lVar = this.f9813n;
        lVar.f9785k = true;
        lVar.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10) {
        if (this.j == c10) {
            return this;
        }
        this.j = Character.toLowerCase(c10);
        this.f9813n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z10) {
        int i6 = this.f9822x;
        int i10 = (z10 ? 1 : 0) | (i6 & (-2));
        this.f9822x = i10;
        if (i6 != i10) {
            this.f9813n.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z10) {
        boolean z11;
        int i6;
        int i10 = this.f9822x;
        int i11 = i10 & 4;
        int i12 = 2;
        l lVar = this.f9813n;
        if (i11 != 0) {
            ArrayList arrayList = lVar.f9781f;
            int size = arrayList.size();
            lVar.w();
            for (int i13 = 0; i13 < size; i13++) {
                n nVar = (n) arrayList.get(i13);
                if (nVar.f9802b == this.f9802b && (nVar.f9822x & 4) != 0 && nVar.isCheckable()) {
                    if (nVar == this) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    int i14 = nVar.f9822x;
                    int i15 = i14 & (-3);
                    if (z11) {
                        i6 = 2;
                    } else {
                        i6 = 0;
                    }
                    int i16 = i6 | i15;
                    nVar.f9822x = i16;
                    if (i14 != i16) {
                        nVar.f9813n.p(false);
                    }
                }
            }
            lVar.v();
            return this;
        }
        int i17 = i10 & (-3);
        if (!z10) {
            i12 = 0;
        }
        int i18 = i17 | i12;
        this.f9822x = i18;
        if (i10 != i18) {
            lVar.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z10) {
        if (z10) {
            this.f9822x |= 16;
        } else {
            this.f9822x &= -17;
        }
        this.f9813n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f9812m = 0;
        this.f9811l = drawable;
        this.f9821w = true;
        this.f9813n.p(false);
        return this;
    }

    @Override // n0.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.s = colorStateList;
        this.f9819u = true;
        this.f9821w = true;
        this.f9813n.p(false);
        return this;
    }

    @Override // n0.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f9818t = mode;
        this.f9820v = true;
        this.f9821w = true;
        this.f9813n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f9807g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10) {
        if (this.f9808h == c10) {
            return this;
        }
        this.f9808h = c10;
        this.f9813n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f9815p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11) {
        this.f9808h = c10;
        this.j = Character.toLowerCase(c11);
        this.f9813n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i6) {
        int i10 = i6 & 3;
        if (i10 != 0 && i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f9823y = i6;
        l lVar = this.f9813n;
        lVar.f9785k = true;
        lVar.p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i6) {
        setShowAsAction(i6);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f9805e = charSequence;
        this.f9813n.p(false);
        d0 d0Var = this.f9814o;
        if (d0Var != null) {
            d0Var.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f9806f = charSequence;
        this.f9813n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z10) {
        int i6;
        int i10 = this.f9822x;
        int i11 = i10 & (-9);
        if (z10) {
            i6 = 0;
        } else {
            i6 = 8;
        }
        int i12 = i6 | i11;
        this.f9822x = i12;
        if (i10 != i12) {
            l lVar = this.f9813n;
            lVar.f9783h = true;
            lVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f9805e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // n0.a, android.view.MenuItem
    public final n0.a setContentDescription(CharSequence charSequence) {
        this.f9816q = charSequence;
        this.f9813n.p(false);
        return this;
    }

    @Override // n0.a, android.view.MenuItem
    public final n0.a setTooltipText(CharSequence charSequence) {
        this.f9817r = charSequence;
        this.f9813n.p(false);
        return this;
    }

    @Override // n0.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10, int i6) {
        if (this.j == c10 && this.f9810k == i6) {
            return this;
        }
        this.j = Character.toLowerCase(c10);
        this.f9810k = KeyEvent.normalizeMetaState(i6);
        this.f9813n.p(false);
        return this;
    }

    @Override // n0.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10, int i6) {
        if (this.f9808h == c10 && this.f9809i == i6) {
            return this;
        }
        this.f9808h = c10;
        this.f9809i = KeyEvent.normalizeMetaState(i6);
        this.f9813n.p(false);
        return this;
    }

    @Override // n0.a, android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11, int i6, int i10) {
        this.f9808h = c10;
        this.f9809i = KeyEvent.normalizeMetaState(i6);
        this.j = Character.toLowerCase(c11);
        this.f9810k = KeyEvent.normalizeMetaState(i10);
        this.f9813n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i6) {
        this.f9811l = null;
        this.f9812m = i6;
        this.f9821w = true;
        this.f9813n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i6) {
        setTitle(this.f9813n.f9776a.getString(i6));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i6) {
        int i10;
        l lVar = this.f9813n;
        Context context = lVar.f9776a;
        View inflate = LayoutInflater.from(context).inflate(i6, (ViewGroup) new LinearLayout(context), false);
        this.f9824z = inflate;
        this.A = null;
        if (inflate != null && inflate.getId() == -1 && (i10 = this.f9801a) > 0) {
            inflate.setId(i10);
        }
        lVar.f9785k = true;
        lVar.p(true);
        return this;
    }
}
