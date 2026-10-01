package hb;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class j {
    public static /* synthetic */ boolean a(Unsafe unsafe, o oVar, long j, c cVar, c cVar2) {
        while (!unsafe.compareAndSwapObject(oVar, j, cVar, cVar2)) {
            if (unsafe.getObject(oVar, j) != cVar) {
                return false;
            }
        }
        return true;
    }
}
