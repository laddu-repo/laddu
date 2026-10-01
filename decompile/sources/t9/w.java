package t9;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class w implements TextWatcher {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f12510v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ EditText f12511w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f12512x;

    public w(TextInputLayout textInputLayout, EditText editText) {
        this.f12512x = textInputLayout;
        this.f12511w = editText;
        this.f12510v = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.f12512x;
        textInputLayout.w(!textInputLayout.W0, false);
        if (textInputLayout.G) {
            textInputLayout.p(editable);
        }
        if (textInputLayout.O) {
            textInputLayout.x(editable);
        }
        EditText editText = this.f12511w;
        int lineCount = editText.getLineCount();
        int i = this.f12510v;
        if (lineCount != i) {
            if (lineCount < i) {
                int minimumHeight = editText.getMinimumHeight();
                int i10 = textInputLayout.P0;
                if (minimumHeight != i10) {
                    editText.setMinimumHeight(i10);
                }
            }
            this.f12510v = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i10, int i11) {
    }
}
