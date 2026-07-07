package o;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;
import androidx.media3.decoder.DecoderInputBuffer;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class i0 implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f9169v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f9170w;

    public /* synthetic */ i0(int i, Object obj) {
        this.f9169v = i;
        this.f9170w = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j8) {
        switch (this.f9169v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                k0 k0Var = (k0) this.f9170w;
                n0 n0Var = k0Var.f9190c0;
                n0Var.setSelection(i);
                if (n0Var.getOnItemClickListener() != null) {
                    n0Var.performItemClick(view, i, k0Var.Z.getItemId(i));
                }
                k0Var.dismiss();
                break;
            case 1:
                ((SearchView) this.f9170w).n(i);
                break;
            default:
                t9.t tVar = (t9.t) this.f9170w;
                c2 c2Var = tVar.f12502z;
                tVar.setText(tVar.convertSelectionToString(i < 0 ? !c2Var.U.isShowing() ? null : c2Var.f9129x.getSelectedItem() : tVar.getAdapter().getItem(i)), false);
                AdapterView.OnItemClickListener onItemClickListener = tVar.getOnItemClickListener();
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        view = !c2Var.U.isShowing() ? null : c2Var.f9129x.getSelectedView();
                        i = !c2Var.U.isShowing() ? -1 : c2Var.f9129x.getSelectedItemPosition();
                        j8 = !c2Var.U.isShowing() ? Long.MIN_VALUE : c2Var.f9129x.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(c2Var.f9129x, view, i, j8);
                }
                c2Var.dismiss();
                break;
        }
    }
}
