package j1;

import android.os.Handler;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.p1;
import androidx.lifecycle.q1;
import com.google.android.gms.internal.measurement.k4;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a0 extends k4 implements q1, androidx.lifecycle.f0, e5.g, s0 {
    public final i.j A;
    public final i.j B;
    public final Handler C;
    public final p0 D;
    public final /* synthetic */ i.j E;

    public a0(i.j jVar) {
        this.E = jVar;
        Handler handler = new Handler();
        this.A = jVar;
        this.B = jVar;
        this.C = handler;
        this.D = new p0();
    }

    @Override // androidx.lifecycle.f0
    public final androidx.lifecycle.y getLifecycle() {
        return this.E.f6218y;
    }

    @Override // e5.g
    public final e5.e getSavedStateRegistry() {
        return this.E.getSavedStateRegistry();
    }

    @Override // androidx.lifecycle.q1
    public final p1 getViewModelStore() {
        return this.E.getViewModelStore();
    }

    @Override // com.google.android.gms.internal.measurement.k4
    public final View m(int i6) {
        return this.E.findViewById(i6);
    }

    @Override // com.google.android.gms.internal.measurement.k4
    public final boolean n() {
        Window window = this.E.getWindow();
        if (window != null && window.peekDecorView() != null) {
            return true;
        }
        return false;
    }

    @Override // j1.s0
    public final void a(p0 p0Var, y yVar) {
    }
}
