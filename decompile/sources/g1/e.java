package g1;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.j1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e implements KeyListener {

    /* renamed from: a, reason: collision with root package name */
    public final KeyListener f5289a;

    /* renamed from: b, reason: collision with root package name */
    public final ua.f f5290b;

    public e(KeyListener keyListener) {
        ua.f fVar = new ua.f(13);
        this.f5289a = keyListener;
        this.f5290b = fVar;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i6) {
        this.f5289a.clearMetaKeyState(view, editable, i6);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.f5289a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i6, KeyEvent keyEvent) {
        boolean j;
        boolean z10;
        this.f5290b.getClass();
        if (i6 != 67) {
            if (i6 != 112) {
                j = false;
            } else {
                j = j1.j(editable, keyEvent, true);
            }
        } else {
            j = j1.j(editable, keyEvent, false);
        }
        if (j) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 || this.f5289a.onKeyDown(view, editable, i6, keyEvent)) {
            return true;
        }
        return false;
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f5289a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i6, KeyEvent keyEvent) {
        return this.f5289a.onKeyUp(view, editable, i6, keyEvent);
    }
}
