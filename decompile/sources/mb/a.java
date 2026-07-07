package mb;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.c1;
import com.google.android.gms.internal.measurement.e1;
import com.google.android.gms.internal.measurement.i0;
import com.google.android.gms.internal.measurement.l1;
import com.google.android.gms.internal.measurement.y0;
import com.google.android.gms.internal.measurement.z0;
import java.util.List;
import java.util.Map;
import java.util.Random;
import n9.n2;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a implements n2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l1 f8798a;

    public a(l1 l1Var) {
        this.f8798a = l1Var;
    }

    @Override // n9.n2
    public final void c(String str, String str2, Bundle bundle) {
        l1 l1Var = this.f8798a;
        l1Var.c(new z0(l1Var, str, str2, bundle, 1));
    }

    @Override // n9.n2
    public final String d() {
        i0 i0Var = new i0();
        l1 l1Var = this.f8798a;
        l1Var.c(new e1(l1Var, i0Var, 3));
        return (String) i0.J(i0Var.d(500L), String.class);
    }

    @Override // n9.n2
    public final String e() {
        i0 i0Var = new i0();
        l1 l1Var = this.f8798a;
        l1Var.c(new e1(l1Var, i0Var, 4));
        return (String) i0.J(i0Var.d(500L), String.class);
    }

    @Override // n9.n2
    public final void f(Bundle bundle) {
        l1 l1Var = this.f8798a;
        l1Var.c(new y0(l1Var, bundle));
    }

    @Override // n9.n2
    public final void g(String str) {
        l1 l1Var = this.f8798a;
        l1Var.c(new c1(l1Var, str, 1));
    }

    @Override // n9.n2
    public final void h(String str) {
        l1 l1Var = this.f8798a;
        l1Var.c(new c1(l1Var, str, 0));
    }

    @Override // n9.n2
    public final long i() {
        i0 i0Var = new i0();
        l1 l1Var = this.f8798a;
        l1Var.c(new e1(l1Var, i0Var, 2));
        Long l10 = (Long) i0.J(i0Var.d(500L), Long.class);
        if (l10 == null) {
            long nextLong = new Random(System.nanoTime() ^ System.currentTimeMillis()).nextLong();
            int i6 = l1Var.f2331c + 1;
            l1Var.f2331c = i6;
            return nextLong + i6;
        }
        return l10.longValue();
    }

    @Override // n9.n2
    public final void j(String str, String str2, Bundle bundle) {
        l1 l1Var = this.f8798a;
        l1Var.c(new z0(l1Var, str, str2, bundle, 0));
    }

    @Override // n9.n2
    public final List k(String str, String str2) {
        return this.f8798a.f(str, str2);
    }

    @Override // n9.n2
    public final int l(String str) {
        return this.f8798a.b(str);
    }

    @Override // n9.n2
    public final String m() {
        i0 i0Var = new i0();
        l1 l1Var = this.f8798a;
        l1Var.c(new e1(l1Var, i0Var, 1));
        return (String) i0.J(i0Var.d(50L), String.class);
    }

    @Override // n9.n2
    public final String n() {
        i0 i0Var = new i0();
        l1 l1Var = this.f8798a;
        l1Var.c(new e1(l1Var, i0Var, 0));
        return (String) i0.J(i0Var.d(500L), String.class);
    }

    @Override // n9.n2
    public final Map o(String str, String str2, boolean z10) {
        return this.f8798a.a(str, str2, z10);
    }
}
