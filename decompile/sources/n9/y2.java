package n9;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class y2 implements Runnable {
    public final /* synthetic */ l4 A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ h3 C;
    public final /* synthetic */ Object D;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f9537x = 0;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f9538y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ String f9539z;

    public y2(h3 h3Var, String str, String str2, l4 l4Var, boolean z10, com.google.android.gms.internal.measurement.n0 n0Var) {
        this.f9538y = str;
        this.f9539z = str2;
        this.A = l4Var;
        this.B = z10;
        this.D = n0Var;
        this.C = h3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j4 j4Var;
        h0 h0Var;
        n1 n1Var;
        AtomicReference atomicReference;
        h3 h3Var;
        h0 h0Var2;
        switch (this.f9537x) {
            case 0:
                String str = this.f9539z;
                String str2 = this.f9538y;
                com.google.android.gms.internal.measurement.n0 n0Var = (com.google.android.gms.internal.measurement.n0) this.D;
                h3 h3Var2 = this.C;
                Bundle bundle = new Bundle();
                try {
                    try {
                        h0Var = h3Var2.B;
                        n1Var = (n1) h3Var2.f4301y;
                    } catch (RemoteException e10) {
                        e = e10;
                    }
                    if (h0Var == null) {
                        u0 u0Var = n1Var.C;
                        n1.g(u0Var);
                        u0Var.D.c(str2, str, "Failed to get user properties; not connected to service");
                        j4Var = n1Var.F;
                        n1.e(j4Var);
                        j4Var.R1(n0Var, bundle);
                        return;
                    }
                    List<g4> C = h0Var.C(str2, str, this.B, this.A);
                    Bundle bundle2 = new Bundle();
                    if (C != null) {
                        for (g4 g4Var : C) {
                            String str3 = g4Var.B;
                            String str4 = g4Var.f9332y;
                            if (str3 != null) {
                                bundle2.putString(str4, str3);
                            } else {
                                Long l10 = g4Var.A;
                                if (l10 != null) {
                                    bundle2.putLong(str4, l10.longValue());
                                } else {
                                    Double d10 = g4Var.D;
                                    if (d10 != null) {
                                        bundle2.putDouble(str4, d10.doubleValue());
                                    }
                                }
                            }
                        }
                    }
                    try {
                        h3Var2.q1();
                        j4 j4Var2 = n1Var.F;
                        n1.e(j4Var2);
                        j4Var2.R1(n0Var, bundle2);
                        return;
                    } catch (RemoteException e11) {
                        e = e11;
                        bundle = bundle2;
                        u0 u0Var2 = ((n1) h3Var2.f4301y).C;
                        n1.g(u0Var2);
                        u0Var2.D.c(str2, e, "Failed to get user properties; remote exception");
                        j4Var = ((n1) h3Var2.f4301y).F;
                        n1.e(j4Var);
                        j4Var.R1(n0Var, bundle);
                        return;
                    } catch (Throwable th) {
                        th = th;
                        bundle = bundle2;
                        j4 j4Var3 = ((n1) h3Var2.f4301y).F;
                        n1.e(j4Var3);
                        j4Var3.R1(n0Var, bundle);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            default:
                AtomicReference atomicReference2 = (AtomicReference) this.D;
                synchronized (atomicReference2) {
                    try {
                        try {
                            h3Var = this.C;
                            h0Var2 = h3Var.B;
                        } catch (RemoteException e12) {
                            u0 u0Var3 = ((n1) this.C.f4301y).C;
                            n1.g(u0Var3);
                            u0Var3.D.d("(legacy) Failed to get user properties; remote exception", null, this.f9538y, e12);
                            ((AtomicReference) this.D).set(Collections.EMPTY_LIST);
                            atomicReference = (AtomicReference) this.D;
                        }
                        if (h0Var2 == null) {
                            u0 u0Var4 = ((n1) h3Var.f4301y).C;
                            n1.g(u0Var4);
                            u0Var4.D.d("(legacy) Failed to get user properties; not connected to service", null, this.f9538y, this.f9539z);
                            atomicReference2.set(Collections.EMPTY_LIST);
                            atomicReference2.notify();
                            return;
                        }
                        if (TextUtils.isEmpty(null)) {
                            atomicReference2.set(h0Var2.C(this.f9538y, this.f9539z, this.B, this.A));
                        } else {
                            atomicReference2.set(h0Var2.h(null, this.f9538y, this.f9539z, this.B));
                        }
                        h3Var.q1();
                        atomicReference = (AtomicReference) this.D;
                        atomicReference.notify();
                        return;
                    } catch (Throwable th3) {
                        ((AtomicReference) this.D).notify();
                        throw th3;
                    }
                }
        }
    }

    public y2(h3 h3Var, AtomicReference atomicReference, String str, String str2, l4 l4Var, boolean z10) {
        this.D = atomicReference;
        this.f9538y = str;
        this.f9539z = str2;
        this.A = l4Var;
        this.B = z10;
        this.C = h3Var;
    }
}
