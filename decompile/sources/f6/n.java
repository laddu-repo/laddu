package f6;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.n0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import n9.e4;
import n9.h0;
import n9.h3;
import n9.j0;
import n9.j4;
import n9.l4;
import n9.n1;
import n9.t1;
import n9.u0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class n implements Runnable {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f5053x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f5054y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f5055z;

    public /* synthetic */ n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i6) {
        this.f5053x = i6;
        this.C = obj;
        this.f5054y = obj2;
        this.f5055z = obj3;
        this.A = obj4;
        this.B = obj5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        h3 h3Var;
        h0 h0Var;
        j4 j4Var;
        h0 h0Var2;
        switch (this.f5053x) {
            case 0:
                try {
                    if (!(((g6.j) this.f5054y).f5476x instanceof g6.a)) {
                        String uuid = ((UUID) this.f5055z).toString();
                        int e10 = ((o) this.C).f5058c.e(uuid);
                        if (e10 != 0 && !h8.c.e(e10)) {
                            ((w5.c) ((o) this.C).f5057b).g(uuid, (v5.h) this.A);
                            ((Context) this.B).startService(d6.c.b((Context) this.B, uuid, (v5.h) this.A));
                        } else {
                            throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                        }
                    }
                    ((g6.j) this.f5054y).i(null);
                    return;
                } catch (Throwable th) {
                    ((g6.j) this.f5054y).j(th);
                    return;
                }
            case 1:
                t1 t1Var = (t1) this.f5054y;
                l4 l4Var = (l4) this.f5055z;
                Bundle bundle = (Bundle) this.A;
                j0 j0Var = (j0) this.B;
                String str = (String) this.C;
                e4 e4Var = t1Var.f9483e;
                e4Var.w();
                try {
                    j0Var.E(e4Var.Z(bundle, l4Var));
                    return;
                } catch (RemoteException e11) {
                    e4Var.r().D.c(str, e11, "Failed to return trigger URIs for app");
                    return;
                }
            case 2:
                AtomicReference atomicReference2 = (AtomicReference) this.f5054y;
                synchronized (atomicReference2) {
                    try {
                        try {
                            h3Var = (h3) this.C;
                            h0Var = h3Var.B;
                        } catch (RemoteException e12) {
                            u0 u0Var = ((n1) ((h3) this.C).f4301y).C;
                            n1.g(u0Var);
                            u0Var.D.d("(legacy) Failed to get conditional properties; remote exception", null, (String) this.f5055z, e12);
                            ((AtomicReference) this.f5054y).set(Collections.EMPTY_LIST);
                            atomicReference = (AtomicReference) this.f5054y;
                        }
                        if (h0Var == null) {
                            u0 u0Var2 = ((n1) h3Var.f4301y).C;
                            n1.g(u0Var2);
                            u0Var2.D.d("(legacy) Failed to get conditional properties; not connected to service", null, (String) this.f5055z, (String) this.A);
                            atomicReference2.set(Collections.EMPTY_LIST);
                            atomicReference2.notify();
                            return;
                        }
                        if (TextUtils.isEmpty(null)) {
                            atomicReference2.set(h0Var.H((String) this.f5055z, (String) this.A, (l4) this.B));
                        } else {
                            atomicReference2.set(h0Var.p(null, (String) this.f5055z, (String) this.A));
                        }
                        h3Var.q1();
                        atomicReference = (AtomicReference) this.f5054y;
                        atomicReference.notify();
                        return;
                    } catch (Throwable th2) {
                        ((AtomicReference) this.f5054y).notify();
                        throw th2;
                    }
                }
            default:
                n0 n0Var = (n0) this.B;
                String str2 = (String) this.f5055z;
                String str3 = (String) this.f5054y;
                h3 h3Var2 = (h3) this.C;
                ArrayList arrayList = new ArrayList();
                try {
                    try {
                        h0Var2 = h3Var2.B;
                    } catch (RemoteException e13) {
                        u0 u0Var3 = ((n1) h3Var2.f4301y).C;
                        n1.g(u0Var3);
                        u0Var3.D.d("Failed to get conditional properties; remote exception", str3, str2, e13);
                    }
                    if (h0Var2 == null) {
                        n1 n1Var = (n1) h3Var2.f4301y;
                        u0 u0Var4 = n1Var.C;
                        n1.g(u0Var4);
                        u0Var4.D.c(str3, str2, "Failed to get conditional properties; not connected to service");
                        j4Var = n1Var.F;
                        n1.e(j4Var);
                        j4Var.S1(n0Var, arrayList);
                        return;
                    }
                    arrayList = j4.T1(h0Var2.H(str3, str2, (l4) this.A));
                    h3Var2.q1();
                    j4Var = ((n1) h3Var2.f4301y).F;
                    n1.e(j4Var);
                    j4Var.S1(n0Var, arrayList);
                    return;
                } catch (Throwable th3) {
                    j4 j4Var2 = ((n1) h3Var2.f4301y).F;
                    n1.e(j4Var2);
                    j4Var2.S1(n0Var, arrayList);
                    throw th3;
                }
        }
    }

    public /* synthetic */ n(t1 t1Var, l4 l4Var, Bundle bundle, j0 j0Var, String str) {
        this.f5053x = 1;
        this.f5054y = t1Var;
        this.f5055z = l4Var;
        this.A = bundle;
        this.B = j0Var;
        this.C = str;
    }
}
