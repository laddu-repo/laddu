package j1;

import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i extends z0 {

    /* renamed from: c, reason: collision with root package name */
    public final g f6918c;

    /* renamed from: d, reason: collision with root package name */
    public AnimatorSet f6919d;

    public i(g gVar) {
        this.f6918c = gVar;
    }

    @Override // j1.z0
    public final void a(ViewGroup container) {
        String str;
        kotlin.jvm.internal.k.e(container, "container");
        AnimatorSet animatorSet = this.f6919d;
        g gVar = this.f6918c;
        if (animatorSet == null) {
            ((a1) gVar.f4301y).c(this);
            return;
        }
        a1 a1Var = (a1) gVar.f4301y;
        if (a1Var.f6880g) {
            if (Build.VERSION.SDK_INT >= 26) {
                k.f6924a.a(animatorSet);
            }
        } else {
            animatorSet.end();
        }
        if (p0.L(2)) {
            StringBuilder sb2 = new StringBuilder("Animator from operation ");
            sb2.append(a1Var);
            sb2.append(" has been canceled");
            if (a1Var.f6880g) {
                str = " with seeking.";
            } else {
                str = ".";
            }
            sb2.append(str);
            sb2.append(' ');
            Log.v("FragmentManager", sb2.toString());
        }
    }

    @Override // j1.z0
    public final void b(ViewGroup container) {
        kotlin.jvm.internal.k.e(container, "container");
        a1 a1Var = (a1) this.f6918c.f4301y;
        AnimatorSet animatorSet = this.f6919d;
        if (animatorSet == null) {
            a1Var.c(this);
            return;
        }
        animatorSet.start();
        if (p0.L(2)) {
            Log.v("FragmentManager", "Animator from operation " + a1Var + " has started.");
        }
    }

    @Override // j1.z0
    public final void c(d.c backEvent, ViewGroup container) {
        kotlin.jvm.internal.k.e(backEvent, "backEvent");
        kotlin.jvm.internal.k.e(container, "container");
        a1 a1Var = (a1) this.f6918c.f4301y;
        AnimatorSet animatorSet = this.f6919d;
        if (animatorSet == null) {
            a1Var.c(this);
            return;
        }
        if (Build.VERSION.SDK_INT >= 34 && a1Var.f6876c.K) {
            if (p0.L(2)) {
                Log.v("FragmentManager", "Adding BackProgressCallbacks for Animators to operation " + a1Var);
            }
            long a10 = j.f6922a.a(animatorSet);
            long j = backEvent.f3419c * ((float) a10);
            if (j == 0) {
                j = 1;
            }
            if (j == a10) {
                j = a10 - 1;
            }
            if (p0.L(2)) {
                Log.v("FragmentManager", "Setting currentPlayTime to " + j + " for Animator " + animatorSet + " on operation " + a1Var);
            }
            k.f6924a.b(animatorSet, j);
        }
    }

    @Override // j1.z0
    public final void d(ViewGroup container) {
        AnimatorSet animatorSet;
        boolean z10;
        i iVar;
        kotlin.jvm.internal.k.e(container, "container");
        g gVar = this.f6918c;
        if (!gVar.Z0()) {
            Context context = container.getContext();
            kotlin.jvm.internal.k.d(context, "context");
            j4.b0 e12 = gVar.e1(context);
            if (e12 != null) {
                animatorSet = (AnimatorSet) e12.f7159y;
            } else {
                animatorSet = null;
            }
            this.f6919d = animatorSet;
            a1 a1Var = (a1) gVar.f4301y;
            y yVar = a1Var.f6876c;
            if (a1Var.f6874a == 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            View view = yVar.f7024g0;
            container.startViewTransition(view);
            AnimatorSet animatorSet2 = this.f6919d;
            if (animatorSet2 != null) {
                iVar = this;
                animatorSet2.addListener(new h(container, view, z10, a1Var, iVar));
            } else {
                iVar = this;
            }
            AnimatorSet animatorSet3 = iVar.f6919d;
            if (animatorSet3 != null) {
                animatorSet3.setTarget(view);
            }
        }
    }
}
