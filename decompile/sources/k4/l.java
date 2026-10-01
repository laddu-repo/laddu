package k4;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.playfy.tv.R;
import r1.u0;
import w4.i1;
import w4.t0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class l extends w4.k0 {
    public final String[] A;
    public final String[] B;
    public final Drawable[] C;
    public final /* synthetic */ q D;

    public l(q qVar, String[] strArr, Drawable[] drawableArr) {
        this.D = qVar;
        this.A = strArr;
        this.B = new String[strArr.length];
        this.C = drawableArr;
    }

    @Override // w4.k0
    public final int a() {
        return this.A.length;
    }

    @Override // w4.k0
    public final long b(int i6) {
        return i6;
    }

    @Override // w4.k0
    public final void d(i1 i1Var, int i6) {
        k kVar = (k) i1Var;
        View view = kVar.f13897a;
        if (h(i6)) {
            view.setLayoutParams(new t0(-1, -2));
        } else {
            view.setLayoutParams(new t0(0, 0));
        }
        TextView textView = kVar.f7646u;
        ImageView imageView = kVar.f7648w;
        TextView textView2 = kVar.f7647v;
        textView.setText(this.A[i6]);
        String str = this.B[i6];
        if (str == null) {
            textView2.setVisibility(8);
        } else {
            textView2.setText(str);
        }
        Drawable drawable = this.C[i6];
        if (drawable == null) {
            imageView.setVisibility(8);
        } else {
            imageView.setImageDrawable(drawable);
        }
    }

    @Override // w4.k0
    public final i1 f(ViewGroup viewGroup, int i6) {
        q qVar = this.D;
        return new k(qVar, LayoutInflater.from(qVar.getContext()).inflate(R.layout.exo_styled_settings_list_item, viewGroup, false));
    }

    public final boolean h(int i6) {
        q qVar = this.D;
        u0 u0Var = qVar.M0;
        if (u0Var != null) {
            if (i6 != 0) {
                if (i6 != 1 || (u0Var.n0(30) && qVar.M0.n0(29))) {
                    return true;
                }
                return false;
            }
            return u0Var.n0(13);
        }
        return false;
    }
}
