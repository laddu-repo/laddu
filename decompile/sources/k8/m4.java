package k8;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class m4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n4 f7635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7636b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f7637c = a();

    public m4(n4 n4Var) {
        this.f7635a = n4Var;
    }

    public final long a() {
        n4 n4Var = this.f7635a;
        t7.y.g(n4Var);
        long jLongValue = ((Long) f0.f7527v.a(null)).longValue();
        long jLongValue2 = ((Long) f0.f7529w.a(null)).longValue();
        for (int i = 1; i < this.f7636b; i++) {
            jLongValue += jLongValue;
            if (jLongValue >= jLongValue2) {
                break;
            }
        }
        n4Var.g().getClass();
        return Math.min(jLongValue, jLongValue2) + System.currentTimeMillis();
    }
}
