package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g1 extends i1 {
    public final /* synthetic */ String B;
    public final /* synthetic */ String C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ i0 E;
    public final /* synthetic */ l1 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(l1 l1Var, String str, String str2, boolean z10, i0 i0Var) {
        super(l1Var, true);
        this.B = str;
        this.C = str2;
        this.D = z10;
        this.E = i0Var;
        Objects.requireNonNull(l1Var);
        this.F = l1Var;
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final void a() {
        l0 l0Var = this.F.f2333e;
        w8.x.g(l0Var);
        l0Var.getUserProperties(this.B, this.C, this.D, this.E);
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final void b() {
        this.E.w(null);
    }
}
