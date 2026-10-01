package com.google.android.gms.internal.measurement;

import android.app.Activity;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j1 extends i1 {
    public final /* synthetic */ int B;
    public final /* synthetic */ Activity C;
    public final /* synthetic */ k1 D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(k1 k1Var, Activity activity, int i6) {
        super(k1Var.f2316x, true);
        this.B = i6;
        switch (i6) {
            case 1:
                this.C = activity;
                this.D = k1Var;
                super(k1Var.f2316x, true);
                return;
            case 2:
                this.C = activity;
                this.D = k1Var;
                super(k1Var.f2316x, true);
                return;
            case 3:
                this.C = activity;
                this.D = k1Var;
                super(k1Var.f2316x, true);
                return;
            case 4:
                this.C = activity;
                this.D = k1Var;
                super(k1Var.f2316x, true);
                return;
            default:
                this.C = activity;
                this.D = k1Var;
                return;
        }
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final void a() {
        switch (this.B) {
            case 0:
                l0 l0Var = this.D.f2316x.f2333e;
                w8.x.g(l0Var);
                l0Var.onActivityStartedByScionActivityInfo(x0.a(this.C), this.f2255y);
                return;
            case 1:
                l0 l0Var2 = this.D.f2316x.f2333e;
                w8.x.g(l0Var2);
                l0Var2.onActivityResumedByScionActivityInfo(x0.a(this.C), this.f2255y);
                return;
            case 2:
                l0 l0Var3 = this.D.f2316x.f2333e;
                w8.x.g(l0Var3);
                l0Var3.onActivityPausedByScionActivityInfo(x0.a(this.C), this.f2255y);
                return;
            case 3:
                l0 l0Var4 = this.D.f2316x.f2333e;
                w8.x.g(l0Var4);
                l0Var4.onActivityStoppedByScionActivityInfo(x0.a(this.C), this.f2255y);
                return;
            default:
                l0 l0Var5 = this.D.f2316x.f2333e;
                w8.x.g(l0Var5);
                l0Var5.onActivityDestroyedByScionActivityInfo(x0.a(this.C), this.f2255y);
                return;
        }
    }
}
