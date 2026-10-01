package za;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class u implements TextWatcher {

    /* renamed from: x, reason: collision with root package name */
    public int f15311x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ EditText f15312y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f15313z;

    public u(TextInputLayout textInputLayout, EditText editText) {
        this.f15313z = textInputLayout;
        this.f15312y = editText;
        this.f15311x = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.f15313z;
        textInputLayout.w(!textInputLayout.Y0, false);
        if (textInputLayout.I) {
            textInputLayout.p(editable);
        }
        if (textInputLayout.Q) {
            textInputLayout.x(editable);
        }
        EditText editText = this.f15312y;
        int lineCount = editText.getLineCount();
        int i6 = this.f15311x;
        if (lineCount != i6) {
            if (lineCount < i6) {
                int minimumHeight = editText.getMinimumHeight();
                int i10 = textInputLayout.R0;
                if (minimumHeight != i10) {
                    editText.setMinimumHeight(i10);
                }
            }
            this.f15311x = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
    }
}
