package da;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class o {
    public static /* synthetic */ boolean a(Unsafe unsafe, t tVar, long j8, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(tVar, j8, obj, obj2)) {
            if (unsafe.getObject(tVar, j8) != obj) {
                return false;
            }
        }
        return true;
    }
}
