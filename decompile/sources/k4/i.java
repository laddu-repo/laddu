package k4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.playfy.tv.R;
import w4.i1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i extends w4.k0 {
    public final String[] A;
    public final float[] B;
    public int C;
    public final /* synthetic */ q D;

    public i(q qVar, String[] strArr, float[] fArr) {
        this.D = qVar;
        this.A = strArr;
        this.B = fArr;
    }

    @Override // w4.k0
    public final int a() {
        return this.A.length;
    }

    @Override // w4.k0
    public final void d(i1 i1Var, int i6) {
        m mVar = (m) i1Var;
        View view = mVar.f7655v;
        View view2 = mVar.f13897a;
        String[] strArr = this.A;
        if (i6 < strArr.length) {
            mVar.f7654u.setText(strArr[i6]);
        }
        if (i6 == this.C) {
            view2.setSelected(true);
            view.setVisibility(0);
        } else {
            view2.setSelected(false);
            view.setVisibility(4);
        }
        view2.setOnClickListener(new jd.i(i6, 1, this));
    }

    @Override // w4.k0
    public final i1 f(ViewGroup viewGroup, int i6) {
        return new m(LayoutInflater.from(this.D.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
    }
}
