package nd;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.material.textfield.TextInputLayout;
import com.playfy.tv.databinding.CatChoseDialogBinding;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class x implements TextWatcher {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ r f9722x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ CatChoseDialogBinding f9723y;

    public x(r rVar, CatChoseDialogBinding catChoseDialogBinding) {
        this.f9722x = rVar;
        this.f9723y = catChoseDialogBinding;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        new q(this.f9722x).filter(editable);
        TextInputLayout textInputLayout = this.f9723y.f3198g;
        if (editable != null && editable.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        textInputLayout.setEndIconVisible(!z10);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
    }
}
