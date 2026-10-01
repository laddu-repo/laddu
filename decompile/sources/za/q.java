package za;

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

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class q extends ArrayAdapter {

    /* renamed from: x, reason: collision with root package name */
    public ColorStateList f15302x;

    /* renamed from: y, reason: collision with root package name */
    public ColorStateList f15303y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ r f15304z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, Context context, int i6, String[] strArr) {
        super(context, i6, strArr);
        this.f15304z = rVar;
        a();
    }

    public final void a() {
        ColorStateList colorStateList;
        r rVar = this.f15304z;
        ColorStateList colorStateList2 = rVar.I;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.f15303y = colorStateList;
        if (rVar.H != 0 && rVar.I != null) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{l0.b.b(rVar.I.getColorForState(iArr3, 0), rVar.H), l0.b.b(rVar.I.getColorForState(iArr2, 0), rVar.H), rVar.H});
        }
        this.f15302x = colorStateList3;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i6, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i6, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            r rVar = this.f15304z;
            Drawable drawable = null;
            if (rVar.getText().toString().contentEquals(textView.getText()) && rVar.H != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(rVar.H);
                if (this.f15303y != null) {
                    colorDrawable.setTintList(this.f15302x);
                    drawable = new RippleDrawable(this.f15303y, colorDrawable, null);
                } else {
                    drawable = colorDrawable;
                }
            }
            textView.setBackground(drawable);
        }
        return view2;
    }
}
