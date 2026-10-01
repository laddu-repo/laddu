package y8;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import java.util.Collections;
import java.util.Set;
import w8.f;
import w8.o;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d extends f implements u8.a {

    /* renamed from: y, reason: collision with root package name */
    public final Set f15022y;

    /* renamed from: z, reason: collision with root package name */
    public final o f15023z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public d(android.content.Context r10, android.os.Looper r11, n9.j r12, w8.o r13, v8.j r14, v8.j r15) {
        /*
            r9 = this;
            w8.i0 r3 = w8.i0.a(r10)
            t8.e r4 = t8.e.f12638d
            w8.x.g(r14)
            w8.x.g(r15)
            w4.q0 r6 = new w4.q0
            r6.<init>(r14)
            w5.a r7 = new w5.a
            r7.<init>(r15)
            java.lang.Object r14 = r12.f9356z
            r8 = r14
            java.lang.String r8 = (java.lang.String) r8
            r5 = 270(0x10e, float:3.78E-43)
            r0 = r9
            r1 = r10
            r2 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r10 = r12.f9355y
            java.util.Set r10 = (java.util.Set) r10
            java.util.Iterator r11 = r10.iterator()
        L2b:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L46
            java.lang.Object r12 = r11.next()
            com.google.android.gms.common.api.Scope r12 = (com.google.android.gms.common.api.Scope) r12
            boolean r12 = r10.contains(r12)
            if (r12 == 0) goto L3e
            goto L2b
        L3e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "Expanding scopes is not permitted, use implied scopes instead"
            r10.<init>(r11)
            throw r10
        L46:
            r0.f15022y = r10
            r0.f15023z = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y8.d.<init>(android.content.Context, android.os.Looper, n9.j, w8.o, v8.j, v8.j):void");
    }

    @Override // u8.a
    public final Set c() {
        if (m()) {
            return this.f15022y;
        }
        return Collections.EMPTY_SET;
    }

    @Override // w8.f
    public final int j() {
        return 203400000;
    }

    @Override // w8.f
    public final IInterface p(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        if (queryLocalInterface instanceof a) {
            return (a) queryLocalInterface;
        }
        return new a(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    @Override // w8.f
    public final Account q() {
        return null;
    }

    @Override // w8.f
    public final t8.d[] r() {
        return g9.c.f5563b;
    }

    @Override // w8.f
    public final Bundle s() {
        o oVar = this.f15023z;
        oVar.getClass();
        Bundle bundle = new Bundle();
        String str = oVar.f14217a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    @Override // w8.f
    public final Set t() {
        return this.f15022y;
    }

    @Override // w8.f
    public final String v() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // w8.f
    public final String w() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // w8.f
    public final boolean x() {
        return true;
    }
}
