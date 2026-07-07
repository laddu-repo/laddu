package g1;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;
import e1.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d implements InputFilter {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f5287a;

    /* renamed from: b, reason: collision with root package name */
    public c f5288b;

    public d(TextView textView) {
        this.f5287a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i6, int i10, Spanned spanned, int i11, int i12) {
        TextView textView = this.f5287a;
        if (!textView.isInEditMode()) {
            int b10 = k.a().b();
            if (b10 != 0) {
                if (b10 != 1) {
                    if (b10 != 3) {
                        return charSequence;
                    }
                } else {
                    if ((i12 != 0 || i11 != 0 || spanned.length() != 0 || charSequence != textView.getText()) && charSequence != null) {
                        if (i6 != 0 || i10 != charSequence.length()) {
                            charSequence = charSequence.subSequence(i6, i10);
                        }
                        return k.a().e(charSequence, 0, charSequence.length());
                    }
                    return charSequence;
                }
            }
            k a10 = k.a();
            if (this.f5288b == null) {
                this.f5288b = new c(textView, this);
            }
            a10.f(this.f5288b);
            return charSequence;
        }
        return charSequence;
    }
}
