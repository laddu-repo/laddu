package gc;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.y;
import androidx.media3.decoder.DecoderInputBuffer;
import com.livxow.tv.activities.MainActivity;
import com.livxow.tv.activities.TvActivity;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class s implements TextWatcher {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f5828v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f5829w;

    public /* synthetic */ s(int i, Object obj) {
        this.f5828v = i;
        this.f5829w = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i = this.f5828v;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i10, int i11) {
        int i12 = this.f5828v;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i10, int i11) {
        int i12 = this.f5828v;
        Object obj = this.f5829w;
        switch (i12) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                TvActivity tvActivity = (TvActivity) obj;
                String string = charSequence.toString();
                if (string != null) {
                    int i13 = TvActivity.f3678g0;
                    tvActivity.f3679a0 = string.isEmpty() ? 0 : 2;
                    y yVar = tvActivity.f3681c0.f9107g;
                    if (yVar instanceof mc.a) {
                        ((mc.a) yVar).U(string);
                    }
                } else {
                    tvActivity.f3679a0 = 0;
                }
                break;
            case 1:
                ((kc.g) obj).getFilter().filter(charSequence);
                break;
            default:
                SearchView searchView = (SearchView) obj;
                Editable text = searchView.K.getText();
                searchView.f637v0 = text;
                boolean zIsEmpty = TextUtils.isEmpty(text);
                searchView.v(!zIsEmpty);
                if (searchView.f635t0 && !searchView.f629m0 && zIsEmpty) {
                    searchView.P.setVisibility(8);
                } else {
                    i = 8;
                }
                searchView.R.setVisibility(i);
                searchView.r();
                searchView.u();
                if (searchView.f625i0 != null && !TextUtils.equals(charSequence, searchView.f636u0)) {
                    MainActivity.v((MainActivity) ((s5.c) searchView.f625i0).f11492w, charSequence.toString());
                }
                searchView.f636u0 = charSequence.toString();
                break;
        }
    }

    private final void a(Editable editable) {
    }

    private final void b(Editable editable) {
    }

    private final void c(Editable editable) {
    }

    private final void d(int i, int i10, int i11, CharSequence charSequence) {
    }

    private final void e(int i, int i10, int i11, CharSequence charSequence) {
    }

    private final void f(int i, int i10, int i11, CharSequence charSequence) {
    }
}
