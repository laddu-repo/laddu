package w4;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h0 extends c0 {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ i0 f13882q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(i0 i0Var, Context context) {
        super(context);
        this.f13882q = i0Var;
    }

    @Override // w4.c0
    public final float d(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // w4.c0
    public final int e(int i6) {
        return Math.min(100, super.e(i6));
    }

    @Override // w4.c0
    public final void h(View view, c1 c1Var) {
        i0 i0Var = this.f13882q;
        int[] a10 = i0Var.a(i0Var.f13892a.getLayoutManager(), view);
        int i6 = a10[0];
        int i10 = a10[1];
        int ceil = (int) Math.ceil(e(Math.max(Math.abs(i6), Math.abs(i10))) / 0.3356d);
        if (ceil > 0) {
            c1Var.f13838a = i6;
            c1Var.f13839b = i10;
            c1Var.f13840c = ceil;
            c1Var.f13842e = this.j;
            c1Var.f13843f = true;
        }
    }
}
