package v6;

import android.os.Looper;
import android.view.View;
import androidx.lifecycle.e0;
import androidx.lifecycle.y;
import gf.a2;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class v implements View.OnAttachStateChangeListener {
    public u A;
    public boolean B;

    /* renamed from: x, reason: collision with root package name */
    public final View f13436x;

    /* renamed from: y, reason: collision with root package name */
    public lc.c f13437y;

    /* renamed from: z, reason: collision with root package name */
    public a2 f13438z;

    public v(View view) {
        this.f13436x = view;
    }

    public final synchronized lc.c a() {
        lc.c cVar = this.f13437y;
        if (cVar != null && kotlin.jvm.internal.k.a(Looper.myLooper(), Looper.getMainLooper()) && this.B) {
            this.B = false;
            return cVar;
        }
        a2 a2Var = this.f13438z;
        if (a2Var != null) {
            a2Var.d(null);
        }
        this.f13438z = null;
        lc.c cVar2 = new lc.c(this.f13436x);
        this.f13437y = cVar2;
        return cVar2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        u uVar = this.A;
        if (uVar == null) {
            return;
        }
        this.B = true;
        uVar.f13433x.b(uVar.f13434y);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        u uVar = this.A;
        if (uVar != null) {
            y yVar = uVar.A;
            uVar.B.d(null);
            x6.a aVar = uVar.f13435z;
            if (aVar instanceof e0) {
                yVar.c(aVar);
            }
            yVar.c(uVar);
        }
    }
}
