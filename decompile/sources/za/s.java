package za;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.playfy.tv.R;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class s extends m {

    /* renamed from: e, reason: collision with root package name */
    public final int f15305e;

    /* renamed from: f, reason: collision with root package name */
    public EditText f15306f;

    /* renamed from: g, reason: collision with root package name */
    public final com.google.android.material.datepicker.n f15307g;

    public s(l lVar, int i6) {
        super(lVar);
        this.f15305e = R.drawable.design_password_eye;
        this.f15307g = new com.google.android.material.datepicker.n(this, 13);
        if (i6 != 0) {
            this.f15305e = i6;
        }
    }

    @Override // za.m
    public final void b() {
        p();
    }

    @Override // za.m
    public final int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // za.m
    public final int d() {
        return this.f15305e;
    }

    @Override // za.m
    public final View.OnClickListener f() {
        return this.f15307g;
    }

    @Override // za.m
    public final boolean j() {
        return true;
    }

    @Override // za.m
    public final boolean k() {
        boolean z10;
        EditText editText = this.f15306f;
        if (editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod)) {
            z10 = true;
        } else {
            z10 = false;
        }
        return !z10;
    }

    @Override // za.m
    public final void l(EditText editText) {
        this.f15306f = editText;
        p();
    }

    @Override // za.m
    public final void q() {
        EditText editText = this.f15306f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f15306f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // za.m
    public final void r() {
        EditText editText = this.f15306f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
