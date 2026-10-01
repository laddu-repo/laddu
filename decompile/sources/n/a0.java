package n;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public class a0 extends androidx.fragment.app.h implements Menu {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f8866c;

    public a0(Context context, l lVar) {
        super(context);
        if (lVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f8866c = lVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return g(this.f8866c.a(0, 0, 0, charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i10, int i11, ComponentName componentName, Intent[] intentArr, Intent intent, int i12, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f8866c.addIntentOptions(i, i10, i11, componentName, intentArr, intent, i12, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i13 = 0; i13 < length; i13++) {
                menuItemArr[i13] = g(menuItemArr2[i13]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.f8866c.addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final void clear() {
        v.i iVar = (v.i) this.f1024b;
        if (iVar != null) {
            iVar.clear();
        }
        this.f8866c.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.f8866c.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        return g(this.f8866c.findItem(i));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return g(this.f8866c.getItem(i));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f8866c.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f8866c.isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i10) {
        return this.f8866c.performIdentifierAction(i, i10);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i10) {
        return this.f8866c.performShortcut(i, keyEvent, i10);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        if (((v.i) this.f1024b) != null) {
            int i10 = 0;
            while (true) {
                v.i iVar = (v.i) this.f1024b;
                if (i10 >= iVar.f13021x) {
                    break;
                }
                if (((n0.a) iVar.f(i10)).getGroupId() == i) {
                    ((v.i) this.f1024b).h(i10);
                    i10--;
                }
                i10++;
            }
        }
        this.f8866c.removeGroup(i);
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        if (((v.i) this.f1024b) != null) {
            int i10 = 0;
            while (true) {
                v.i iVar = (v.i) this.f1024b;
                if (i10 >= iVar.f13021x) {
                    break;
                }
                if (((n0.a) iVar.f(i10)).getItemId() == i) {
                    ((v.i) this.f1024b).h(i10);
                    break;
                }
                i10++;
            }
        }
        this.f8866c.removeItem(i);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z2, boolean z10) {
        this.f8866c.setGroupCheckable(i, z2, z10);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z2) {
        this.f8866c.setGroupEnabled(i, z2);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z2) {
        this.f8866c.setGroupVisible(i, z2);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z2) {
        this.f8866c.setQwertyMode(z2);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f8866c.size();
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return this.f8866c.addSubMenu(i);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return g(this.f8866c.add(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i10, int i11, CharSequence charSequence) {
        return this.f8866c.addSubMenu(i, i10, i11, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i10, int i11, CharSequence charSequence) {
        return g(this.f8866c.a(i, i10, i11, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i10, int i11, int i12) {
        return this.f8866c.addSubMenu(i, i10, i11, i12);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i10, int i11, int i12) {
        return g(this.f8866c.add(i, i10, i11, i12));
    }
}
