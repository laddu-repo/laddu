package k8;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class t3 implements Runnable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f7773v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ long f7774w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ x3 f7775x;

    public t3(x3 x3Var, long j8, int i) {
        this.f7773v = i;
        switch (i) {
            case 1:
                this.f7774w = j8;
                Objects.requireNonNull(x3Var);
                this.f7775x = x3Var;
                break;
            default:
                this.f7774w = j8;
                Objects.requireNonNull(x3Var);
                this.f7775x = x3Var;
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00b1  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.t3.run():void");
    }
}
