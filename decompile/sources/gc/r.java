package gc;

import android.app.Dialog;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.d1;
import androidx.media3.decoder.DecoderInputBuffer;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.livxow.tv.activities.SupportActivity;
import com.livxow.tv.activities.TvActivity;
import com.livxow.tv.app.App;
import k8.g2;
import o.o3;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements View.OnClickListener {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f5825v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f5826w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f5827x;

    public /* synthetic */ r(int i, Object obj, Object obj2) {
        this.f5825v = i;
        this.f5826w = obj;
        this.f5827x = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f5825v;
        Object obj = this.f5827x;
        Object obj2 = this.f5826w;
        switch (i) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                TvActivity tvActivity = (TvActivity) obj2;
                LinearLayout linearLayout = (LinearLayout) obj;
                int i10 = TvActivity.f3678g0;
                View view2 = tvActivity.f3680b0;
                if (view2 != null) {
                    view2.setSelected(false);
                }
                tvActivity.f3680b0 = view;
                view.setSelected(true);
                tvActivity.f3683e0.a(linearLayout, false);
                break;
            case 1:
                hc.e eVar = (hc.e) obj2;
                pc.c cVar = (pc.c) obj;
                App app = eVar.f6214e;
                app.D = app.E;
                kc.k.S(eVar.f, cVar.f, cVar.f10489c, cVar.f10487a, cVar.f10490d.equals("custom"), eVar.f6213d);
                break;
            case 2:
                hc.h hVar = (hc.h) obj2;
                pc.e eVar2 = (pc.e) obj;
                App app2 = hVar.f6224e;
                app2.F = eVar2;
                app2.A = app2.B;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(eVar2.f10500d);
                sb2.append(TextUtils.isEmpty(eVar2.f10501e) ? "" : " vs " + eVar2.f10501e);
                kc.k.S(hVar.f, eVar2.f10508n, eVar2.f10503h, sb2.toString(), true, hVar.f6223d);
                break;
            case 3:
                pc.f fVar = (pc.f) obj;
                hc.k kVar = ((hc.j) obj2).D;
                App app3 = kVar.f;
                app3.getClass();
                app3.C = null;
                StringBuilder sb3 = new StringBuilder();
                sb3.append(fVar.f10513d);
                sb3.append(TextUtils.isEmpty(fVar.f10514e) ? "" : " vs " + fVar.f10514e);
                kc.k.S((h.j) kVar.f6239e, fVar.f10517j, fVar.f10516h, sb3.toString(), true, kVar.f6238d);
                break;
            case g1.g.LONG_FIELD_NUMBER /* 4 */:
                g2 g2Var = (g2) obj2;
                d1 d1Var = (d1) obj;
                if (d1Var != null) {
                    g2Var.getClass();
                    SupportActivity supportActivity = (SupportActivity) d1Var.f1006w;
                    int i11 = SupportActivity.f3674d0;
                    supportActivity.y();
                }
                ((Dialog) g2Var.f7546w).dismiss();
                break;
            case g1.g.STRING_FIELD_NUMBER /* 5 */:
                TextInputLayout textInputLayout = (TextInputLayout) obj2;
                TextInputEditText textInputEditText = (TextInputEditText) obj;
                if (!"Clear".contentEquals(((Object) textInputLayout.getEndIconContentDescription()) + "")) {
                    textInputEditText.setText(vc.a.m(textInputLayout.getContext()));
                } else {
                    textInputEditText.setText("");
                }
                break;
            default:
                ((o3) obj2).a((LinearLayout) obj, true);
                break;
        }
    }
}
