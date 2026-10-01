package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e1 extends i1 {
    public final /* synthetic */ int B;
    public final /* synthetic */ i0 C;
    public final /* synthetic */ l1 D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e1(l1 l1Var, i0 i0Var, int i6) {
        super(l1Var, true);
        this.B = i6;
        this.C = i0Var;
        this.D = l1Var;
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final void a() {
        switch (this.B) {
            case 0:
                l0 l0Var = this.D.f2333e;
                w8.x.g(l0Var);
                l0Var.getGmpAppId(this.C);
                return;
            case 1:
                l0 l0Var2 = this.D.f2333e;
                w8.x.g(l0Var2);
                l0Var2.getCachedAppInstanceId(this.C);
                return;
            case 2:
                l0 l0Var3 = this.D.f2333e;
                w8.x.g(l0Var3);
                l0Var3.generateEventId(this.C);
                return;
            case 3:
                l0 l0Var4 = this.D.f2333e;
                w8.x.g(l0Var4);
                l0Var4.getCurrentScreenName(this.C);
                return;
            default:
                l0 l0Var5 = this.D.f2333e;
                w8.x.g(l0Var5);
                l0Var5.getCurrentScreenClass(this.C);
                return;
        }
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final void b() {
        switch (this.B) {
            case 0:
                this.C.w(null);
                return;
            case 1:
                this.C.w(null);
                return;
            case 2:
                this.C.w(null);
                return;
            case 3:
                this.C.w(null);
                return;
            default:
                this.C.w(null);
                return;
        }
    }
}
