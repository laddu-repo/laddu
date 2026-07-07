package t9;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f12459a;

    public m(n nVar) {
        this.f12459a = nVar;
    }

    public final void a(TextInputLayout textInputLayout) {
        n nVar = this.f12459a;
        l lVar = nVar.Q;
        if (nVar.N == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = nVar.N;
        if (editText != null) {
            editText.removeTextChangedListener(lVar);
            if (nVar.N.getOnFocusChangeListener() == nVar.b().e()) {
                nVar.N.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        nVar.N = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(lVar);
        }
        nVar.b().l(nVar.N);
        nVar.j(nVar.b());
    }
}
