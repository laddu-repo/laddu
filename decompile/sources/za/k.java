package za;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f15264a;

    public k(l lVar) {
        this.f15264a = lVar;
    }

    public final void a(TextInputLayout textInputLayout) {
        l lVar = this.f15264a;
        j jVar = lVar.S;
        if (lVar.P == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = lVar.P;
        if (editText != null) {
            editText.removeTextChangedListener(jVar);
            if (lVar.P.getOnFocusChangeListener() == lVar.b().e()) {
                lVar.P.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        lVar.P = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(jVar);
        }
        lVar.b().l(lVar.P);
        lVar.j(lVar.b());
    }
}
