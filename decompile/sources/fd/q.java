package fd;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import androidx.appcompat.widget.SearchView;
import com.playfy.tv.activities.MainActivity;
import p.v2;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class q implements TextWatcher {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f5206x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f5207y;

    public /* synthetic */ q(KeyEvent.Callback callback, int i6) {
        this.f5206x = i6;
        this.f5207y = callback;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.f5206x) {
            case 0:
                if (editable != null) {
                    MainActivity mainActivity = (MainActivity) this.f5207y;
                    String obj = editable.toString();
                    bf.o[] oVarArr = MainActivity.J;
                    mainActivity.Y(obj);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
        int i12 = this.f5206x;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
        switch (this.f5206x) {
            case 0:
                return;
            default:
                SearchView searchView = (SearchView) this.f5207y;
                Editable text = searchView.M.getText();
                searchView.f791x0 = text;
                boolean isEmpty = TextUtils.isEmpty(text);
                searchView.v(!isEmpty);
                int i12 = 8;
                if (searchView.f789v0 && !searchView.o0 && isEmpty) {
                    searchView.R.setVisibility(8);
                    i12 = 0;
                }
                searchView.T.setVisibility(i12);
                searchView.r();
                searchView.u();
                if (searchView.f779k0 != null && !TextUtils.equals(charSequence, searchView.f790w0)) {
                    v2 v2Var = searchView.f779k0;
                    String charSequence2 = charSequence.toString();
                    k7.d dVar = (k7.d) v2Var;
                    if (charSequence2 == null) {
                        dVar.getClass();
                    } else {
                        MainActivity mainActivity = (MainActivity) dVar.f7747y;
                        bf.o[] oVarArr = MainActivity.J;
                        mainActivity.Y(charSequence2);
                    }
                }
                searchView.f790w0 = charSequence.toString();
                return;
        }
    }

    private final void a(Editable editable) {
    }

    private final void b(int i6, int i10, int i11, CharSequence charSequence) {
    }

    private final void c(int i6, int i10, int i11, CharSequence charSequence) {
    }

    private final void d(int i6, int i10, int i11, CharSequence charSequence) {
    }
}
