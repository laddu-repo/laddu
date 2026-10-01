package me;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class m1 extends re.q implements Runnable {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final long f8711z;

    /* JADX WARN: Illegal instructions before constructor call */
    public m1(long j8, r4.r rVar) {
        sd.h hVar = rVar.f12977w;
        de.i.b(hVar);
        super(rVar, hVar);
        this.f8711z = j8;
    }

    @Override // me.d1
    public final String P() {
        return super.P() + "(timeMillis=" + this.f8711z + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        x.f(this.f8675x);
        p(new l1("Timed out waiting for " + this.f8711z + " ms", this));
    }
}
