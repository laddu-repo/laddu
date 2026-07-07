package da;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class y0 extends j implements Runnable {
    public final Runnable C;

    public y0(Runnable runnable) {
        runnable.getClass();
        this.C = runnable;
    }

    @Override // da.k
    public final String l() {
        return "task=[" + this.C + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.C.run();
        } catch (Throwable th) {
            n(th);
            throw th;
        }
    }
}
