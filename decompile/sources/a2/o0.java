package a2;

import android.os.Looper;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.playfy.tv.ui.fragments.PlaylistFragment;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class o0 implements Runnable {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f355x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f356y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f357z;

    public /* synthetic */ o0(int i6, int i10, Object obj) {
        this.f355x = i10;
        this.f357z = obj;
        this.f356y = i6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.f355x;
        boolean z10 = false;
        int i10 = this.f356y;
        Object obj = this.f357z;
        switch (i6) {
            case 0:
                w0 w0Var = (w0) obj;
                b2.f fVar = w0Var.T;
                int i11 = ((g) w0Var.f480x[i10].f516e).f245y;
                fVar.W(fVar.V(), 1033, new t(13));
                return;
            case 1:
                c2.m mVar = (c2.m) ((j4.b0) obj).f7159y;
                String str = u1.a0.f12750a;
                o4.j jVar = ((k0) mVar).f295x.f328c0;
                a0 a0Var = new a0(i10, 2);
                jVar.getClass();
                if (Looper.myLooper() == ((u1.x) jVar.f9926c).f12820a.getLooper()) {
                    z10 = true;
                }
                u1.c.g(z10);
                jVar.f9924a++;
                jVar.t(new m8.c(8, jVar, a0Var));
                jVar.z(Integer.valueOf(i10));
                return;
            case 2:
                ((k0.b) obj).h(i10);
                return;
            case 3:
                int i12 = PlaylistFragment.F0;
                RecyclerView recyclerView = ((PlaylistFragment) obj).N().f3303e;
                if (!recyclerView.U) {
                    w4.s0 s0Var = recyclerView.K;
                    if (s0Var == null) {
                        Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                        return;
                    } else {
                        s0Var.z0(recyclerView, i10);
                        return;
                    }
                }
                return;
            case 4:
                ((s1.a) obj).f11965b.onAudioFocusChange(i10);
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                View view = (View) sideSheetBehavior.f2734p.get();
                if (view != null) {
                    sideSheetBehavior.u(view, i10, false);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ o0(w0 w0Var, int i6, boolean z10) {
        this.f355x = 0;
        this.f357z = w0Var;
        this.f356y = i6;
    }
}
