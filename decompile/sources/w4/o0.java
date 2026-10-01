package w4;

import a2.a2;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class o0 {

    /* renamed from: a, reason: collision with root package name */
    public c f13970a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f13971b;

    /* renamed from: c, reason: collision with root package name */
    public long f13972c;

    /* renamed from: d, reason: collision with root package name */
    public long f13973d;

    /* renamed from: e, reason: collision with root package name */
    public long f13974e;

    /* renamed from: f, reason: collision with root package name */
    public long f13975f;

    public static void b(i1 i1Var) {
        RecyclerView recyclerView;
        int i6 = i1Var.j;
        if (!i1Var.g() && (i6 & 4) == 0 && (recyclerView = i1Var.f13913r) != null) {
            recyclerView.G(i1Var);
        }
    }

    public abstract boolean a(i1 i1Var, i1 i1Var2, b2.j jVar, b2.j jVar2);

    public final void c(i1 i1Var) {
        c cVar = this.f13970a;
        if (cVar != null) {
            RecyclerView recyclerView = (RecyclerView) cVar.f13822a;
            boolean z10 = true;
            i1Var.o(true);
            View view = i1Var.f13897a;
            if (i1Var.f13904h != null && i1Var.f13905i == null) {
                i1Var.f13904h = null;
            }
            i1Var.f13905i = null;
            if ((i1Var.j & 16) == 0) {
                y0 y0Var = recyclerView.f1148z;
                recyclerView.i0();
                n9.j jVar = recyclerView.C;
                d2.i iVar = (d2.i) jVar.f9356z;
                a2 a2Var = (a2) jVar.f9355y;
                int indexOfChild = ((RecyclerView) a2Var.f162y).indexOfChild(view);
                if (indexOfChild == -1) {
                    jVar.I(view);
                } else if (iVar.I(indexOfChild)) {
                    iVar.K(indexOfChild);
                    jVar.I(view);
                    a2Var.Q(indexOfChild);
                } else {
                    z10 = false;
                }
                if (z10) {
                    i1 J = RecyclerView.J(view);
                    y0Var.m(J);
                    y0Var.j(J);
                }
                recyclerView.j0(!z10);
                if (!z10 && i1Var.k()) {
                    recyclerView.removeDetachedView(view, false);
                }
            }
        }
    }

    public abstract void d(i1 i1Var);

    public abstract void e();

    public abstract boolean f();
}
