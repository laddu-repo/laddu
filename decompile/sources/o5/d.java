package o5;

import android.view.ViewGroup;
import com.google.android.gms.internal.measurement.k4;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d extends s {

    /* renamed from: a, reason: collision with root package name */
    public boolean f9940a = false;

    /* renamed from: b, reason: collision with root package name */
    public final ViewGroup f9941b;

    public d(ViewGroup viewGroup) {
        this.f9941b = viewGroup;
    }

    @Override // o5.s, o5.o
    public final void a(r rVar) {
        k4.q(this.f9941b, false);
        this.f9940a = true;
    }

    @Override // o5.s, o5.o
    public final void c() {
        k4.q(this.f9941b, false);
    }

    @Override // o5.s, o5.o
    public final void f() {
        k4.q(this.f9941b, true);
    }

    @Override // o5.s, o5.o
    public final void g(r rVar) {
        if (!this.f9940a) {
            k4.q(this.f9941b, false);
        }
        rVar.y(this);
    }
}
