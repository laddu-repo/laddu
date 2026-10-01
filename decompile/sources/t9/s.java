package t9;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class s extends ArrayAdapter {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ColorStateList f12499v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ColorStateList f12500w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ t f12501x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, Context context, int i, String[] strArr) {
        super(context, i, strArr);
        this.f12501x = tVar;
        a();
    }

    public final void a() {
        ColorStateList colorStateList;
        t tVar = this.f12501x;
        ColorStateList colorStateList2 = tVar.G;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.f12500w = colorStateList;
        if (tVar.F != 0 && tVar.G != null) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{l0.b.b(tVar.G.getColorForState(iArr3, 0), tVar.F), l0.b.b(tVar.G.getColorForState(iArr2, 0), tVar.F), tVar.F});
        }
        this.f12499v = colorStateList3;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            t tVar = this.f12501x;
            Drawable rippleDrawable = null;
            if (tVar.getText().toString().contentEquals(textView.getText()) && tVar.F != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(tVar.F);
                if (this.f12500w != null) {
                    colorDrawable.setTintList(this.f12499v);
                    rippleDrawable = new RippleDrawable(this.f12500w, colorDrawable, null);
                } else {
                    rippleDrawable = colorDrawable;
                }
            }
            textView.setBackground(rippleDrawable);
        }
        return view2;
    }
}
