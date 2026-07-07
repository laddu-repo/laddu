package g6;

import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class p extends e2.a0 {
    @Override // e2.a0
    public final void c(Object obj, Object obj2) {
        q qVar = (q) obj;
        qVar.getClass();
        ArrayDeque arrayDeque = q.f5692b;
        synchronized (arrayDeque) {
            arrayDeque.offer(qVar);
        }
    }
}
