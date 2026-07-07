package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i0 extends y implements n0 {

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReference f2252e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2253f;

    public i0() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
        this.f2252e = new AtomicReference();
    }

    /* JADX WARN: Code restructure failed: missing block: B:2:0x0002, code lost:
    
        r3 = r3.get(com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object J(android.os.Bundle r3, java.lang.Class r4) {
        /*
            if (r3 == 0) goto L38
            java.lang.String r0 = "r"
            java.lang.Object r3 = r3.get(r0)
            if (r3 == 0) goto L38
            java.lang.Object r3 = r4.cast(r3)     // Catch: java.lang.ClassCastException -> Lf
            return r3
        Lf:
            r0 = move-exception
            java.lang.String r4 = r4.getCanonicalName()
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getCanonicalName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unexpected object type. Expected, Received: "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = ", "
            r1.append(r4)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            java.lang.String r4 = "AM"
            android.util.Log.w(r4, r3, r0)
            throw r0
        L38:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.i0.J(android.os.Bundle, java.lang.Class):java.lang.Object");
    }

    @Override // com.google.android.gms.internal.measurement.y
    public final boolean a(int i6, Parcel parcel, Parcel parcel2) {
        if (i6 == 1) {
            Bundle bundle = (Bundle) z.a(parcel, Bundle.CREATOR);
            z.d(parcel);
            w(bundle);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }

    public final Bundle d(long j) {
        Bundle bundle;
        AtomicReference atomicReference = this.f2252e;
        synchronized (atomicReference) {
            if (!this.f2253f) {
                try {
                    atomicReference.wait(j);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.f2252e.get();
        }
        return bundle;
    }

    @Override // com.google.android.gms.internal.measurement.n0
    public final void w(Bundle bundle) {
        AtomicReference atomicReference = this.f2252e;
        synchronized (atomicReference) {
            try {
                try {
                    atomicReference.set(bundle);
                    this.f2253f = true;
                } finally {
                    this.f2252e.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
