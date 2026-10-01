package w4;

import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f13814a;

    public a1(RecyclerView recyclerView) {
        this.f13814a = recyclerView;
    }

    public final void a() {
        boolean z10 = RecyclerView.Z0;
        RecyclerView recyclerView = this.f13814a;
        if (z10 && recyclerView.Q && recyclerView.P) {
            j0 j0Var = recyclerView.F;
            WeakHashMap weakHashMap = t0.q0.f12397a;
            recyclerView.postOnAnimation(j0Var);
        } else {
            recyclerView.f1122a0 = true;
            recyclerView.requestLayout();
        }
    }
}
