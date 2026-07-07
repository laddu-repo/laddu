package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class z0 extends i1 {
    public final /* synthetic */ int B;
    public final /* synthetic */ String C;
    public final /* synthetic */ String D;
    public final /* synthetic */ Bundle E;
    public final /* synthetic */ l1 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(l1 l1Var, String str, String str2, Bundle bundle, int i6) {
        super(l1Var, true);
        this.B = i6;
        switch (i6) {
            case 1:
                this.C = str;
                this.D = str2;
                this.E = bundle;
                Objects.requireNonNull(l1Var);
                this.F = l1Var;
                super(l1Var, true);
                return;
            default:
                this.C = str;
                this.D = str2;
                this.E = bundle;
                Objects.requireNonNull(l1Var);
                this.F = l1Var;
                return;
        }
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final void a() {
        switch (this.B) {
            case 0:
                l0 l0Var = this.F.f2333e;
                w8.x.g(l0Var);
                l0Var.clearConditionalUserProperty(this.C, this.D, this.E);
                return;
            default:
                long j = this.f2254x;
                l0 l0Var2 = this.F.f2333e;
                w8.x.g(l0Var2);
                l0Var2.logEvent(this.C, this.D, this.E, true, true, j);
                return;
        }
    }
}
