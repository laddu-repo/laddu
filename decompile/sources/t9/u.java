package t9;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class u extends o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f12503e;
    public EditText f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.google.android.material.datepicker.n f12504g;

    public u(n nVar, int i) {
        super(nVar);
        this.f12503e = p8.e.design_password_eye;
        this.f12504g = new com.google.android.material.datepicker.n(16, this);
        if (i != 0) {
            this.f12503e = i;
        }
    }

    @Override // t9.o
    public final void b() {
        p();
    }

    @Override // t9.o
    public final int c() {
        return p8.j.password_toggle_content_description;
    }

    @Override // t9.o
    public final int d() {
        return this.f12503e;
    }

    @Override // t9.o
    public final View.OnClickListener f() {
        return this.f12504g;
    }

    @Override // t9.o
    public final boolean j() {
        return true;
    }

    @Override // t9.o
    public final boolean k() {
        EditText editText = this.f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // t9.o
    public final void l(EditText editText) {
        this.f = editText;
        p();
    }

    @Override // t9.o
    public final void q() {
        EditText editText = this.f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // t9.o
    public final void r() {
        EditText editText = this.f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
