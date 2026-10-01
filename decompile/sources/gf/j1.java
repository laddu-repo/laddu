package gf;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public interface j1 extends le.f {
    n Q(t1 t1Var);

    q0 b0(boolean z10, boolean z11, n1 n1Var);

    void d(CancellationException cancellationException);

    j1 getParent();

    boolean isActive();

    boolean isCancelled();

    Object l(lf.i iVar);

    CancellationException m();

    boolean start();

    q0 y(ve.l lVar);
}
