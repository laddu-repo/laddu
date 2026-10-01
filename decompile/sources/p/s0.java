package p;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class s0 extends k0.b {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f10379h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f10380i;
    public final /* synthetic */ WeakReference j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ x0 f10381k;

    public s0(x0 x0Var, int i6, int i10, WeakReference weakReference) {
        this.f10381k = x0Var;
        this.f10379h = i6;
        this.f10380i = i10;
        this.j = weakReference;
    }

    @Override // k0.b
    public final void i(Typeface typeface) {
        int i6;
        boolean z10;
        if (Build.VERSION.SDK_INT >= 28 && (i6 = this.f10379h) != -1) {
            if ((this.f10380i & 2) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            typeface = w0.a(typeface, i6, z10);
        }
        x0 x0Var = this.f10381k;
        if (x0Var.f10419m) {
            x0Var.f10418l = typeface;
            TextView textView = (TextView) this.j.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new d6.e(textView, typeface, x0Var.j, 2));
                } else {
                    textView.setTypeface(typeface, x0Var.j);
                }
            }
        }
    }

    @Override // k0.b
    public final void h(int i6) {
    }
}
