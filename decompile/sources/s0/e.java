package s0;

import de.i;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class e extends d {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f11418x;

    public e(int i) {
        super(i);
        this.f11418x = new Object();
    }

    @Override // s0.d, s0.c
    public final boolean e(Object obj) {
        boolean zE;
        i.e(obj, "instance");
        synchronized (this.f11418x) {
            zE = super.e(obj);
        }
        return zE;
    }

    @Override // s0.d, s0.c
    public final Object k() {
        Object objK;
        synchronized (this.f11418x) {
            objK = super.k();
        }
        return objK;
    }
}
