package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c1 extends i1 {
    public final /* synthetic */ int B;
    public final /* synthetic */ String C;
    public final /* synthetic */ l1 D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c1(l1 l1Var, String str, int i6) {
        super(l1Var, true);
        this.B = i6;
        this.C = str;
        this.D = l1Var;
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final void a() {
        switch (this.B) {
            case 0:
                l0 l0Var = this.D.f2333e;
                w8.x.g(l0Var);
                l0Var.beginAdUnitExposure(this.C, this.f2255y);
                return;
            default:
                l0 l0Var2 = this.D.f2333e;
                w8.x.g(l0Var2);
                l0Var2.endAdUnitExposure(this.C, this.f2255y);
                return;
        }
    }
}
