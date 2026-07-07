package k8;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.media3.decoder.DecoderInputBuffer;
import com.google.android.gms.internal.measurement.z6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v1 implements Runnable {
    public final /* synthetic */ Object A;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f7798v = 2;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f7799w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ v4 f7800x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f7801y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f7802z;

    public /* synthetic */ v1(x1 x1Var, v4 v4Var, Bundle bundle, k0 k0Var, String str) {
        this.f7801y = x1Var;
        this.f7800x = v4Var;
        this.f7802z = bundle;
        this.A = k0Var;
        this.f7799w = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        p3 p3Var;
        i0 i0Var;
        t4 t4Var;
        i0 i0Var2;
        switch (this.f7798v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                x1 x1Var = (x1) this.f7801y;
                v4 v4Var = this.f7800x;
                Bundle bundle = (Bundle) this.f7802z;
                k0 k0Var = (k0) this.A;
                String str = this.f7799w;
                n4 n4Var = x1Var.f7834d;
                n4Var.V();
                try {
                    k0Var.B(n4Var.d0(bundle, v4Var));
                    return;
                } catch (RemoteException e7) {
                    n4Var.c().B.c(str, e7, "Failed to return trigger URIs for app");
                    return;
                }
            case 1:
                AtomicReference atomicReference2 = (AtomicReference) this.f7801y;
                synchronized (atomicReference2) {
                    try {
                        try {
                            p3Var = (p3) this.A;
                            i0Var = p3Var.f7701z;
                        } catch (Throwable th) {
                            ((AtomicReference) this.f7801y).notify();
                            throw th;
                        }
                    } catch (RemoteException e10) {
                        v0 v0Var = ((p1) ((p3) this.A).f2053w).A;
                        p1.l(v0Var);
                        v0Var.B.d("(legacy) Failed to get conditional properties; remote exception", null, this.f7799w, e10);
                        ((AtomicReference) this.f7801y).set(Collections.EMPTY_LIST);
                        atomicReference = (AtomicReference) this.f7801y;
                    }
                    if (i0Var == null) {
                        v0 v0Var2 = ((p1) p3Var.f2053w).A;
                        p1.l(v0Var2);
                        v0Var2.B.d("(legacy) Failed to get conditional properties; not connected to service", null, this.f7799w, (String) this.f7802z);
                        atomicReference2.set(Collections.EMPTY_LIST);
                        atomicReference2.notify();
                        return;
                    }
                    if (TextUtils.isEmpty(null)) {
                        atomicReference2.set(i0Var.D(this.f7799w, (String) this.f7802z, this.f7800x));
                    } else {
                        atomicReference2.set(i0Var.x(null, this.f7799w, (String) this.f7802z));
                    }
                    p3Var.Q();
                    atomicReference = (AtomicReference) this.f7801y;
                    atomicReference.notify();
                    return;
                }
            default:
                z6 z6Var = (z6) this.f7802z;
                String str2 = (String) this.f7801y;
                String str3 = this.f7799w;
                p3 p3Var2 = (p3) this.A;
                ArrayList arrayList = new ArrayList();
                try {
                    try {
                        i0Var2 = p3Var2.f7701z;
                    } catch (RemoteException e11) {
                        v0 v0Var3 = ((p1) p3Var2.f2053w).A;
                        p1.l(v0Var3);
                        v0Var3.B.d("Failed to get conditional properties; remote exception", str3, str2, e11);
                    }
                    if (i0Var2 != null) {
                        arrayList = t4.y0(i0Var2.D(str3, str2, this.f7800x));
                        p3Var2.Q();
                        t4Var = ((p1) p3Var2.f2053w).D;
                        p1.j(t4Var);
                        t4Var.x0(z6Var, arrayList);
                        return;
                    }
                    p1 p1Var = (p1) p3Var2.f2053w;
                    v0 v0Var4 = p1Var.A;
                    p1.l(v0Var4);
                    v0Var4.B.c(str3, str2, "Failed to get conditional properties; not connected to service");
                    t4Var = p1Var.D;
                    p1.j(t4Var);
                    t4Var.x0(z6Var, arrayList);
                    return;
                } catch (Throwable th2) {
                    t4 t4Var2 = ((p1) p3Var2.f2053w).D;
                    p1.j(t4Var2);
                    t4Var2.x0(z6Var, arrayList);
                    throw th2;
                }
        }
    }

    public v1(p3 p3Var, String str, String str2, v4 v4Var, z6 z6Var) {
        this.f7799w = str;
        this.f7801y = str2;
        this.f7800x = v4Var;
        this.f7802z = z6Var;
        this.A = p3Var;
    }

    public v1(p3 p3Var, AtomicReference atomicReference, String str, String str2, v4 v4Var) {
        this.f7801y = atomicReference;
        this.f7799w = str;
        this.f7802z = str2;
        this.f7800x = v4Var;
        this.A = p3Var;
    }
}
