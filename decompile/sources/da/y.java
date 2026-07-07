package da;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class y extends u1.c {
    @Override // u1.c
    public final void j(e0 e0Var, Set set) {
        synchronized (e0Var) {
            try {
                if (e0Var.C == null) {
                    e0Var.C = set;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // u1.c
    public final int q(e0 e0Var) {
        int i;
        synchronized (e0Var) {
            i = e0Var.D - 1;
            e0Var.D = i;
        }
        return i;
    }
}
