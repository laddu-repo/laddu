package j1;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f extends z0 {

    /* renamed from: c, reason: collision with root package name */
    public final g f6905c;

    public f(g gVar) {
        this.f6905c = gVar;
    }

    @Override // j1.z0
    public final void a(ViewGroup container) {
        kotlin.jvm.internal.k.e(container, "container");
        g gVar = this.f6905c;
        a1 a1Var = (a1) gVar.f4301y;
        View view = a1Var.f6876c.f7024g0;
        view.clearAnimation();
        container.endViewTransition(view);
        ((a1) gVar.f4301y).c(this);
        if (p0.L(2)) {
            Log.v("FragmentManager", "Animation from operation " + a1Var + " has been cancelled.");
        }
    }

    @Override // j1.z0
    public final void b(ViewGroup container) {
        kotlin.jvm.internal.k.e(container, "container");
        g gVar = this.f6905c;
        a1 a1Var = (a1) gVar.f4301y;
        if (gVar.Z0()) {
            a1Var.c(this);
            return;
        }
        Context context = container.getContext();
        View view = a1Var.f6876c.f7024g0;
        kotlin.jvm.internal.k.d(context, "context");
        j4.b0 e12 = gVar.e1(context);
        if (e12 != null) {
            Animation animation = (Animation) e12.f7158x;
            if (animation != null) {
                if (a1Var.f6874a != 1) {
                    view.startAnimation(animation);
                    a1Var.c(this);
                    return;
                }
                container.startViewTransition(view);
                b0 b0Var = new b0(animation, container, view);
                b0Var.setAnimationListener(new e(a1Var, container, view, this));
                view.startAnimation(b0Var);
                if (p0.L(2)) {
                    Log.v("FragmentManager", "Animation from operation " + a1Var + " has started.");
                    return;
                }
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }
}
