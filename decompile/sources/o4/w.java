package o4;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class w extends u {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ x f9896q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x xVar, Context context) {
        super(context);
        this.f9896q = xVar;
    }

    @Override // o4.u
    public final float d(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // o4.u
    public final int e(int i) {
        return Math.min(100, super.e(i));
    }

    @Override // o4.u
    public final void h(View view, t0 t0Var) {
        x xVar = this.f9896q;
        int[] iArrA = xVar.a(xVar.f9897a.getLayoutManager(), view);
        int i = iArrA[0];
        int i10 = iArrA[1];
        int iCeil = (int) Math.ceil(((double) e(Math.max(Math.abs(i), Math.abs(i10)))) / 0.3356d);
        if (iCeil > 0) {
            t0Var.f9863a = i;
            t0Var.f9864b = i10;
            t0Var.f9865c = iCeil;
            t0Var.f9867e = this.f9876j;
            t0Var.f = true;
        }
    }
}
