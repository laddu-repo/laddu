package k8;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.media3.decoder.DecoderInputBuffer;
import com.google.android.gms.internal.measurement.z6;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class g3 implements Runnable {
    public final /* synthetic */ p3 A;
    public final /* synthetic */ Object B;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f7547v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f7548w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f7549x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ v4 f7550y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ boolean f7551z;

    public g3(p3 p3Var, String str, String str2, v4 v4Var, boolean z2, z6 z6Var) {
        this.f7548w = str;
        this.f7549x = str2;
        this.f7550y = v4Var;
        this.f7551z = z2;
        this.B = z6Var;
        this.A = p3Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        t4 t4Var;
        i0 i0Var;
        p1 p1Var;
        AtomicReference atomicReference;
        p3 p3Var;
        i0 i0Var2;
        switch (this.f7547v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                String str = this.f7549x;
                String str2 = this.f7548w;
                z6 z6Var = (z6) this.B;
                p3 p3Var2 = this.A;
                Bundle bundle = new Bundle();
                try {
                    try {
                        i0Var = p3Var2.f7701z;
                        p1Var = (p1) p3Var2.f2053w;
                    } catch (RemoteException e7) {
                        e = e7;
                    }
                    if (i0Var == null) {
                        v0 v0Var = p1Var.A;
                        p1.l(v0Var);
                        v0Var.B.c(str2, str, "Failed to get user properties; not connected to service");
                        t4Var = p1Var.D;
                        p1.j(t4Var);
                        t4Var.w0(z6Var, bundle);
                        return;
                    }
                    List<q4> listK = i0Var.k(str2, str, this.f7551z, this.f7550y);
                    Bundle bundle2 = new Bundle();
                    if (listK != null) {
                        for (q4 q4Var : listK) {
                            String str3 = q4Var.f7724z;
                            String str4 = q4Var.f7721w;
                            if (str3 != null) {
                                bundle2.putString(str4, str3);
                            } else {
                                Long l10 = q4Var.f7723y;
                                if (l10 != null) {
                                    bundle2.putLong(str4, l10.longValue());
                                } else {
                                    Double d10 = q4Var.B;
                                    if (d10 != null) {
                                        bundle2.putDouble(str4, d10.doubleValue());
                                    }
                                }
                            }
                        }
                    }
                    try {
                        p3Var2.Q();
                        t4 t4Var2 = p1Var.D;
                        p1.j(t4Var2);
                        t4Var2.w0(z6Var, bundle2);
                        return;
                    } catch (RemoteException e10) {
                        e = e10;
                        bundle = bundle2;
                        v0 v0Var2 = ((p1) p3Var2.f2053w).A;
                        p1.l(v0Var2);
                        v0Var2.B.c(str2, e, "Failed to get user properties; remote exception");
                        t4Var = ((p1) p3Var2.f2053w).D;
                        p1.j(t4Var);
                        t4Var.w0(z6Var, bundle);
                        return;
                    } catch (Throwable th) {
                        th = th;
                        bundle = bundle2;
                        t4 t4Var3 = ((p1) p3Var2.f2053w).D;
                        p1.j(t4Var3);
                        t4Var3.w0(z6Var, bundle);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
                break;
            default:
                AtomicReference atomicReference2 = (AtomicReference) this.B;
                synchronized (atomicReference2) {
                    try {
                        try {
                            p3Var = this.A;
                            i0Var2 = p3Var.f7701z;
                        } catch (RemoteException e11) {
                            v0 v0Var3 = ((p1) this.A.f2053w).A;
                            p1.l(v0Var3);
                            v0Var3.B.d("(legacy) Failed to get user properties; remote exception", null, this.f7548w, e11);
                            ((AtomicReference) this.B).set(Collections.EMPTY_LIST);
                            atomicReference = (AtomicReference) this.B;
                        }
                        if (i0Var2 == null) {
                            v0 v0Var4 = ((p1) p3Var.f2053w).A;
                            p1.l(v0Var4);
                            v0Var4.B.d("(legacy) Failed to get user properties; not connected to service", null, this.f7548w, this.f7549x);
                            atomicReference2.set(Collections.EMPTY_LIST);
                            atomicReference2.notify();
                            return;
                        }
                        if (TextUtils.isEmpty(null)) {
                            atomicReference2.set(i0Var2.k(this.f7548w, this.f7549x, this.f7551z, this.f7550y));
                        } else {
                            atomicReference2.set(i0Var2.l(null, this.f7548w, this.f7549x, this.f7551z));
                        }
                        p3Var.Q();
                        atomicReference = (AtomicReference) this.B;
                        atomicReference.notify();
                        return;
                    } catch (Throwable th3) {
                        ((AtomicReference) this.B).notify();
                        throw th3;
                    }
                }
        }
    }

    public g3(p3 p3Var, AtomicReference atomicReference, String str, String str2, v4 v4Var, boolean z2) {
        this.B = atomicReference;
        this.f7548w = str;
        this.f7549x = str2;
        this.f7550y = v4Var;
        this.f7551z = z2;
        this.A = p3Var;
    }
}
