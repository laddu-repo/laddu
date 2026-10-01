package g1;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import e1.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i implements TextWatcher {

    /* renamed from: x, reason: collision with root package name */
    public final EditText f5297x;

    /* renamed from: y, reason: collision with root package name */
    public h f5298y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f5299z = true;

    public i(EditText editText) {
        this.f5297x = editText;
    }

    public static void a(EditText editText, int i6) {
        int length;
        if (i6 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            k a10 = k.a();
            if (editableText == null) {
                length = 0;
            } else {
                a10.getClass();
                length = editableText.length();
            }
            a10.e(editableText, 0, length);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
        EditText editText = this.f5297x;
        if (!editText.isInEditMode() && this.f5299z && k.f4160k != null && i10 <= i11 && (charSequence instanceof Spannable)) {
            int b10 = k.a().b();
            if (b10 != 0) {
                if (b10 != 1) {
                    if (b10 != 3) {
                        return;
                    }
                } else {
                    k.a().e((Spannable) charSequence, i6, i11 + i6);
                    return;
                }
            }
            k a10 = k.a();
            if (this.f5298y == null) {
                this.f5298y = new h(editText);
            }
            a10.f(this.f5298y);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
    }
}
