package k8;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class n2 implements Runnable {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ u2 D;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f7643v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f7644w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ long f7645x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ long f7646y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Bundle f7647z;

    public n2(u2 u2Var, String str, String str2, long j8, long j9, Bundle bundle, boolean z2, boolean z10, boolean z11) {
        this.f7643v = str;
        this.f7644w = str2;
        this.f7645x = j8;
        this.f7646y = j9;
        this.f7647z = bundle;
        this.A = z2;
        this.B = z10;
        this.C = z11;
        this.D = u2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.D.M(this.f7643v, this.f7644w, this.f7645x, this.f7646y, this.f7647z, this.A, this.B, this.C);
    }
}
