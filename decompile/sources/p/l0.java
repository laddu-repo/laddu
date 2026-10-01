package p;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class l0 implements AdapterView.OnItemClickListener {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f10282x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f10283y;

    public /* synthetic */ l0(Object obj, int i6) {
        this.f10282x = i6;
        this.f10283y = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i6, long j) {
        Object item;
        CharSequence convertSelectionToString;
        switch (this.f10282x) {
            case 0:
                n0 n0Var = (n0) this.f10283y;
                q0 q0Var = n0Var.f10319e0;
                q0Var.setSelection(i6);
                if (q0Var.getOnItemClickListener() != null) {
                    q0Var.performItemClick(view, i6, n0Var.f10316b0.getItemId(i6));
                }
                n0Var.dismiss();
                return;
            case 1:
                ((SearchView) this.f10283y).n(i6);
                return;
            default:
                za.r rVar = (za.r) this.f10283y;
                f2 f2Var = rVar.B;
                if (i6 < 0) {
                    if (!f2Var.W.isShowing()) {
                        item = null;
                    } else {
                        item = f2Var.f10240z.getSelectedItem();
                    }
                } else {
                    item = rVar.getAdapter().getItem(i6);
                }
                convertSelectionToString = rVar.convertSelectionToString(item);
                rVar.setText(convertSelectionToString, false);
                AdapterView.OnItemClickListener onItemClickListener = rVar.getOnItemClickListener();
                if (onItemClickListener != null) {
                    if (view == null || i6 < 0) {
                        if (!f2Var.W.isShowing()) {
                            view = null;
                        } else {
                            view = f2Var.f10240z.getSelectedView();
                        }
                        if (!f2Var.W.isShowing()) {
                            i6 = -1;
                        } else {
                            i6 = f2Var.f10240z.getSelectedItemPosition();
                        }
                        if (!f2Var.W.isShowing()) {
                            j = Long.MIN_VALUE;
                        } else {
                            j = f2Var.f10240z.getSelectedItemId();
                        }
                    }
                    onItemClickListener.onItemClick(f2Var.f10240z, view, i6, j);
                }
                f2Var.dismiss();
                return;
        }
    }
}
