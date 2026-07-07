package g6;

import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ArrayDeque f5692b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f5693a;

    static {
        char[] cArr = v6.m.f13232a;
        f5692b = new ArrayDeque(0);
    }

    public static q a(Object obj) {
        q qVar;
        ArrayDeque arrayDeque = f5692b;
        synchronized (arrayDeque) {
            qVar = (q) arrayDeque.poll();
        }
        if (qVar == null) {
            qVar = new q();
        }
        qVar.f5693a = obj;
        return qVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof q) && this.f5693a.equals(((q) obj).f5693a);
    }

    public final int hashCode() {
        return this.f5693a.hashCode();
    }
}
