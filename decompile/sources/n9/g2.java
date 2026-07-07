package n9;

import android.os.Bundle;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g2 implements Runnable {
    public final /* synthetic */ Bundle A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ m2 E;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f9325x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f9326y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ long f9327z;

    public g2(m2 m2Var, String str, String str2, long j, Bundle bundle, boolean z10, boolean z11, boolean z12) {
        this.f9325x = str;
        this.f9326y = str2;
        this.f9327z = j;
        this.A = bundle;
        this.B = z10;
        this.C = z11;
        this.D = z12;
        this.E = m2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.E.m1(this.f9325x, this.f9326y, this.f9327z, this.A, this.B, this.C, this.D);
    }
}
