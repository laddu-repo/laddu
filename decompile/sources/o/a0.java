package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class a0 extends i.y implements Menu {

    /* renamed from: c, reason: collision with root package name */
    public final l f9756c;

    public a0(Context context, l lVar) {
        super(context);
        if (lVar != null) {
            this.f9756c = lVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return h(this.f9756c.a(0, 0, 0, charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i6, int i10, int i11, ComponentName componentName, Intent[] intentArr, Intent intent, int i12, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2;
        if (menuItemArr != null) {
            menuItemArr2 = new MenuItem[menuItemArr.length];
        } else {
            menuItemArr2 = null;
        }
        MenuItem[] menuItemArr3 = menuItemArr2;
        int addIntentOptions = this.f9756c.addIntentOptions(i6, i10, i11, componentName, intentArr, intent, i12, menuItemArr3);
        if (menuItemArr3 != null) {
            int length = menuItemArr3.length;
            for (int i13 = 0; i13 < length; i13++) {
                menuItemArr[i13] = h(menuItemArr3[i13]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.f9756c.addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final void clear() {
        v.l lVar = (v.l) this.f6269b;
        if (lVar != null) {
            lVar.clear();
        }
        this.f9756c.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.f9756c.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i6) {
        return h(this.f9756c.findItem(i6));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i6) {
        return h(this.f9756c.getItem(i6));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f9756c.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i6, KeyEvent keyEvent) {
        return this.f9756c.isShortcutKey(i6, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i6, int i10) {
        return this.f9756c.performIdentifierAction(i6, i10);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i6, KeyEvent keyEvent, int i10) {
        return this.f9756c.performShortcut(i6, keyEvent, i10);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i6) {
        if (((v.l) this.f6269b) != null) {
            int i10 = 0;
            while (true) {
                v.l lVar = (v.l) this.f6269b;
                if (i10 >= lVar.f13174z) {
                    break;
                }
                if (((n0.a) lVar.f(i10)).getGroupId() == i6) {
                    ((v.l) this.f6269b).g(i10);
                    i10--;
                }
                i10++;
            }
        }
        this.f9756c.removeGroup(i6);
    }

    @Override // android.view.Menu
    public final void removeItem(int i6) {
        if (((v.l) this.f6269b) != null) {
            int i10 = 0;
            while (true) {
                v.l lVar = (v.l) this.f6269b;
                if (i10 >= lVar.f13174z) {
                    break;
                }
                if (((n0.a) lVar.f(i10)).getItemId() == i6) {
                    ((v.l) this.f6269b).g(i10);
                    break;
                }
                i10++;
            }
        }
        this.f9756c.removeItem(i6);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i6, boolean z10, boolean z11) {
        this.f9756c.setGroupCheckable(i6, z10, z11);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i6, boolean z10) {
        this.f9756c.setGroupEnabled(i6, z10);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i6, boolean z10) {
        this.f9756c.setGroupVisible(i6, z10);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z10) {
        this.f9756c.setQwertyMode(z10);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f9756c.size();
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i6) {
        return this.f9756c.addSubMenu(i6);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i6) {
        return h(this.f9756c.add(i6));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i6, int i10, int i11, CharSequence charSequence) {
        return this.f9756c.addSubMenu(i6, i10, i11, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i6, int i10, int i11, CharSequence charSequence) {
        return h(this.f9756c.a(i6, i10, i11, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i6, int i10, int i11, int i12) {
        return this.f9756c.addSubMenu(i6, i10, i11, i12);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i6, int i10, int i11, int i12) {
        return h(this.f9756c.add(i6, i10, i11, i12));
    }
}
