package l9;

import android.os.Bundle;
import android.os.SystemClock;
import com.unity3d.services.core.di.ServiceProvider;
import f6.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import n9.b0;
import n9.f2;
import n9.g4;
import n9.j4;
import n9.l1;
import n9.m2;
import n9.n1;
import n9.u0;
import n9.u2;
import n9.x2;
import w8.l;
import w8.x;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: a, reason: collision with root package name */
    public final n1 f8316a;

    /* renamed from: b, reason: collision with root package name */
    public final m2 f8317b;

    public a(n1 n1Var) {
        x.g(n1Var);
        this.f8316a = n1Var;
        m2 m2Var = n1Var.J;
        n1.f(m2Var);
        this.f8317b = m2Var;
    }

    @Override // n9.n2
    public final void c(String str, String str2, Bundle bundle) {
        m2 m2Var = this.f8317b;
        ((n1) m2Var.f4301y).H.getClass();
        m2Var.i1(str, str2, bundle, true, true, System.currentTimeMillis());
    }

    @Override // n9.n2
    public final String d() {
        x2 x2Var = ((n1) this.f8317b.f4301y).I;
        n1.f(x2Var);
        u2 u2Var = x2Var.A;
        if (u2Var != null) {
            return u2Var.f9494a;
        }
        return null;
    }

    @Override // n9.n2
    public final String e() {
        x2 x2Var = ((n1) this.f8317b.f4301y).I;
        n1.f(x2Var);
        u2 u2Var = x2Var.A;
        if (u2Var != null) {
            return u2Var.f9495b;
        }
        return null;
    }

    @Override // n9.n2
    public final void f(Bundle bundle) {
        m2 m2Var = this.f8317b;
        ((n1) m2Var.f4301y).H.getClass();
        m2Var.q1(bundle, System.currentTimeMillis());
    }

    @Override // n9.n2
    public final void g(String str) {
        n1 n1Var = this.f8316a;
        b0 b0Var = n1Var.K;
        n1.d(b0Var);
        n1Var.H.getClass();
        b0Var.f1(str, SystemClock.elapsedRealtime());
    }

    @Override // n9.n2
    public final void h(String str) {
        n1 n1Var = this.f8316a;
        b0 b0Var = n1Var.K;
        n1.d(b0Var);
        n1Var.H.getClass();
        b0Var.e1(str, SystemClock.elapsedRealtime());
    }

    @Override // n9.n2
    public final long i() {
        j4 j4Var = this.f8316a.F;
        n1.e(j4Var);
        return j4Var.a2();
    }

    @Override // n9.n2
    public final void j(String str, String str2, Bundle bundle) {
        m2 m2Var = this.f8316a.J;
        n1.f(m2Var);
        m2Var.r1(str, str2, bundle);
    }

    @Override // n9.n2
    public final List k(String str, String str2) {
        m2 m2Var = this.f8317b;
        n1 n1Var = (n1) m2Var.f4301y;
        l1 l1Var = n1Var.D;
        u0 u0Var = n1Var.C;
        n1.g(l1Var);
        if (l1Var.j1()) {
            n1.g(u0Var);
            u0Var.D.a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        if (l.w()) {
            n1.g(u0Var);
            u0Var.D.a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        l1 l1Var2 = n1Var.D;
        n1.g(l1Var2);
        l1Var2.n1(atomicReference, ServiceProvider.SCAR_VERSION_FETCH_TIMEOUT, "get conditional user properties", new p(m2Var, atomicReference, str, str2));
        List list = (List) atomicReference.get();
        if (list == null) {
            n1.g(u0Var);
            u0Var.D.b(null, "Timed out waiting for get conditional user properties");
            return new ArrayList();
        }
        return j4.T1(list);
    }

    @Override // n9.n2
    public final int l(String str) {
        m2 m2Var = this.f8317b;
        m2Var.getClass();
        x.d(str);
        ((n1) m2Var.f4301y).getClass();
        return 25;
    }

    @Override // n9.n2
    public final String m() {
        return (String) this.f8317b.E.get();
    }

    @Override // n9.n2
    public final String n() {
        return (String) this.f8317b.E.get();
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [v.l, java.util.Map] */
    @Override // n9.n2
    public final Map o(String str, String str2, boolean z10) {
        m2 m2Var = this.f8317b;
        n1 n1Var = (n1) m2Var.f4301y;
        l1 l1Var = n1Var.D;
        u0 u0Var = n1Var.C;
        n1.g(l1Var);
        if (l1Var.j1()) {
            n1.g(u0Var);
            u0Var.D.a("Cannot get user properties from analytics worker thread");
            return Collections.EMPTY_MAP;
        }
        if (l.w()) {
            n1.g(u0Var);
            u0Var.D.a("Cannot get user properties from main thread");
            return Collections.EMPTY_MAP;
        }
        AtomicReference atomicReference = new AtomicReference();
        l1 l1Var2 = n1Var.D;
        n1.g(l1Var2);
        l1Var2.n1(atomicReference, ServiceProvider.SCAR_VERSION_FETCH_TIMEOUT, "get user properties", new f2(m2Var, atomicReference, str, str2, z10));
        List<g4> list = (List) atomicReference.get();
        if (list == null) {
            n1.g(u0Var);
            u0Var.D.b(Boolean.valueOf(z10), "Timed out waiting for handle get user properties, includeInternal");
            return Collections.EMPTY_MAP;
        }
        ?? lVar = new v.l(list.size());
        for (g4 g4Var : list) {
            Object a10 = g4Var.a();
            if (a10 != null) {
                lVar.put(g4Var.f9332y, a10);
            }
        }
        return lVar;
    }
}
