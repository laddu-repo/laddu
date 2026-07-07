package mc;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;
import androidx.media3.decoder.DecoderInputBuffer;
import o.c2;
import o.r1;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class o implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f8607v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f8608w;

    public /* synthetic */ o(int i, Object obj) {
        this.f8607v = i;
        this.f8608w = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j8) {
        r1 r1Var;
        switch (this.f8607v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                p pVar = (p) this.f8608w;
                pVar.f8611y0 = i;
                pVar.f8609w0.f7035o.setVisibility(i == pVar.f8610x0 ? 0 : 8);
                break;
            case 1:
                if (i != -1 && (r1Var = ((c2) this.f8608w).f9129x) != null) {
                    r1Var.setListSelectionHidden(false);
                    break;
                }
                break;
            default:
                ((SearchView) this.f8608w).o(i);
                break;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        int i = this.f8607v;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }

    private final void c(AdapterView adapterView) {
    }
}
