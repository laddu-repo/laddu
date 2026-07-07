package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class y0 extends i1 {
    public final /* synthetic */ int B;
    public final /* synthetic */ l1 C;
    public final /* synthetic */ Object D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0(l1 l1Var, Object obj, int i6) {
        super(l1Var, true);
        this.B = i6;
        this.D = obj;
        this.C = l1Var;
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final void a() {
        switch (this.B) {
            case 0:
                l0 l0Var = this.C.f2333e;
                w8.x.g(l0Var);
                l0Var.setUserProperty("fcm", "_ln", new d9.b(this.D), true, this.f2254x);
                return;
            case 1:
                l0 l0Var2 = this.C.f2333e;
                w8.x.g(l0Var2);
                l0Var2.setConditionalUserProperty((Bundle) this.D, this.f2254x);
                return;
            case 2:
                l0 l0Var3 = this.C.f2333e;
                w8.x.g(l0Var3);
                l0Var3.retrieveAndUploadBatches(new d1(this, (hb.s) this.D));
                return;
            default:
                l0 l0Var4 = this.C.f2333e;
                w8.x.g(l0Var4);
                l0Var4.logHealthData(5, "Error with data collection. Data lost.", new d9.b((Exception) this.D), new d9.b(null), new d9.b(null));
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(l1 l1Var, Bundle bundle) {
        super(l1Var, true);
        this.B = 1;
        this.D = bundle;
        Objects.requireNonNull(l1Var);
        this.C = l1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(l1 l1Var, Exception exc) {
        super(l1Var, false);
        this.B = 3;
        this.D = exc;
        this.C = l1Var;
    }
}
