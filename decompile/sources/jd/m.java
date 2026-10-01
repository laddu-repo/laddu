package jd;

import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class m implements TextWatcher {
    public final /* synthetic */ Drawable A;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f7390x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ TextInputEditText f7391y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Drawable f7392z;

    public m(TextInputLayout textInputLayout, TextInputEditText textInputEditText, Drawable drawable, Drawable drawable2) {
        this.f7390x = textInputLayout;
        this.f7391y = textInputEditText;
        this.f7392z = drawable;
        this.A = drawable2;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        Drawable drawable;
        Editable text = this.f7391y.getText();
        if (text != null && text.length() != 0) {
            drawable = this.A;
        } else {
            drawable = this.f7392z;
        }
        this.f7390x.setEndIconDrawable(drawable);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
    }
}
