package da;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class n {
    public static /* synthetic */ boolean a(Unsafe unsafe, k kVar, long j8, h hVar, h hVar2) {
        while (!unsafe.compareAndSwapObject(kVar, j8, hVar, hVar2)) {
            if (unsafe.getObject(kVar, j8) != hVar) {
                return false;
            }
        }
        return true;
    }
}
