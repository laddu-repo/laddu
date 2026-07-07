package g1;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import e1.k;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c extends e1.i {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f5285a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f5286b;

    public c(TextView textView, d dVar) {
        this.f5285a = new WeakReference(textView);
        this.f5286b = new WeakReference(dVar);
    }

    @Override // e1.i
    public final void b() {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.f5285a.get();
        InputFilter inputFilter = (InputFilter) this.f5286b.get();
        if (inputFilter != null && textView != null && (filters = textView.getFilters()) != null) {
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    if (textView.isAttachedToWindow()) {
                        CharSequence text = textView.getText();
                        k a10 = k.a();
                        if (text == null) {
                            length = 0;
                        } else {
                            a10.getClass();
                            length = text.length();
                        }
                        CharSequence e10 = a10.e(text, 0, length);
                        if (text != e10) {
                            int selectionStart = Selection.getSelectionStart(e10);
                            int selectionEnd = Selection.getSelectionEnd(e10);
                            textView.setText(e10);
                            if (e10 instanceof Spannable) {
                                Spannable spannable = (Spannable) e10;
                                if (selectionStart >= 0 && selectionEnd >= 0) {
                                    Selection.setSelection(spannable, selectionStart, selectionEnd);
                                    return;
                                } else if (selectionStart >= 0) {
                                    Selection.setSelection(spannable, selectionStart);
                                    return;
                                } else {
                                    if (selectionEnd >= 0) {
                                        Selection.setSelection(spannable, selectionEnd);
                                        return;
                                    }
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
        }
    }
}
