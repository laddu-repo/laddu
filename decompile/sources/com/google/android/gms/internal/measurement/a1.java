package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a1 extends i1 {
    public final /* synthetic */ int B = 1;
    public final /* synthetic */ String C;
    public final /* synthetic */ String D;
    public final /* synthetic */ l1 E;
    public final /* synthetic */ Object F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(l1 l1Var, x0 x0Var, String str, String str2) {
        super(l1Var, true);
        this.F = x0Var;
        this.C = str;
        this.D = str2;
        Objects.requireNonNull(l1Var);
        this.E = l1Var;
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final void a() {
        switch (this.B) {
            case 0:
                l0 l0Var = this.E.f2333e;
                w8.x.g(l0Var);
                l0Var.getConditionalUserProperties(this.C, this.D, (i0) this.F);
                return;
            default:
                l0 l0Var2 = this.E.f2333e;
                w8.x.g(l0Var2);
                l0Var2.setCurrentScreenByScionActivityInfo((x0) this.F, this.C, this.D, this.f2254x);
                return;
        }
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public void b() {
        switch (this.B) {
            case 0:
                ((i0) this.F).w(null);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(l1 l1Var, String str, String str2, i0 i0Var) {
        super(l1Var, true);
        this.C = str;
        this.D = str2;
        this.F = i0Var;
        Objects.requireNonNull(l1Var);
        this.E = l1Var;
    }
}
