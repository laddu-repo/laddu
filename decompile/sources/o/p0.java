package o;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class p0 extends k0.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f9262h;
    public final /* synthetic */ int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ WeakReference f9263j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ v0 f9264k;

    public p0(v0 v0Var, int i, int i10, WeakReference weakReference) {
        this.f9264k = v0Var;
        this.f9262h = i;
        this.i = i10;
        this.f9263j = weakReference;
    }

    @Override // k0.b
    public final void i(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.f9262h) != -1) {
            typeface = u0.a(typeface, i, (this.i & 2) != 0);
        }
        v0 v0Var = this.f9264k;
        if (v0Var.f9320m) {
            v0Var.f9319l = typeface;
            TextView textView = (TextView) this.f9263j.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new q0(textView, typeface, v0Var.f9317j));
                } else {
                    textView.setTypeface(typeface, v0Var.f9317j);
                }
            }
        }
    }

    @Override // k0.b
    public final void h(int i) {
    }
}
