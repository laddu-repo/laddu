package da;

import java.util.Set;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class z extends j {
    public static final u1.c E;
    public static final u0 F = new u0(z.class);
    public volatile Set C;
    public volatile int D;

    static {
        Throwable th;
        u1.c yVar;
        try {
            yVar = new x();
            th = null;
        } catch (Throwable th2) {
            th = th2;
            yVar = new y();
        }
        E = yVar;
        if (th != null) {
            F.a().log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
    }
}
