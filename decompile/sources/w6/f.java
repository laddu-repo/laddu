package w6;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f implements i {

    /* renamed from: a, reason: collision with root package name */
    public final View f14130a;

    public f(ImageView imageView) {
        this.f14130a = imageView;
    }

    @Override // w6.i
    public final Object a(l6.h hVar) {
        h c10 = h8.c.c(this);
        if (c10 != null) {
            return c10;
        }
        gf.k kVar = new gf.k(1, a8.c.i(hVar));
        kVar.s();
        ViewTreeObserver viewTreeObserver = this.f14130a.getViewTreeObserver();
        k kVar2 = new k(this, viewTreeObserver, kVar);
        viewTreeObserver.addOnPreDrawListener(kVar2);
        kVar.u(new j(this, viewTreeObserver, kVar2));
        return kVar.r();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            if (kotlin.jvm.internal.k.a(this.f14130a, ((f) obj).f14130a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f14130a.hashCode() * 31) + 1231;
    }
}
