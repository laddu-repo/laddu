package k1;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.m;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class d implements InputFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f7263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f7264b;

    public d(TextView textView) {
        this.f7263a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i10, Spanned spanned, int i11, int i12) {
        TextView textView = this.f7263a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int iB = m.a().b();
        if (iB != 0) {
            if (iB == 1) {
                if ((i12 == 0 && i11 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i != 0 || i10 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i, i10);
                }
                return m.a().e(charSequence, 0, charSequence.length());
            }
            if (iB != 3) {
                return charSequence;
            }
        }
        m mVarA = m.a();
        if (this.f7264b == null) {
            this.f7264b = new c(textView, this);
        }
        mVarA.f(this.f7264b);
        return charSequence;
    }
}
