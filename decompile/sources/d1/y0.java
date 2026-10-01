package d1;

import androidx.media3.decoder.DecoderInputBuffer;
import java.io.File;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import me.q1;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class y0 extends de.j implements ce.l {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f3964w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f3965x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f3966y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0(int i, Object obj, Object obj2) {
        super(1);
        this.f3964w = i;
        this.f3965x = obj;
        this.f3966y = obj2;
    }

    @Override // ce.l
    public final Object a(Object obj) throws Throwable {
        Object hVar;
        od.l lVar;
        od.l lVar2;
        switch (this.f3964w) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                boolean zA = de.i.a((String) obj, ((File) this.f3965x).getName());
                od.l lVar3 = od.l.f10126a;
                if (zA) {
                    oe.p pVar = (oe.p) ((oe.q) this.f3966y);
                    Object objH = pVar.h(lVar3);
                    if (objH instanceof oe.i) {
                        Object obj2 = ((oe.j) me.x.o(sd.i.f11797v, new ac.o(pVar, (sd.c) null, 10))).f10161a;
                    }
                }
                return lVar3;
            case 1:
                Throwable th = (Throwable) obj;
                ((b0) this.f3965x).a(th);
                oe.c cVar = (oe.c) ((sb.p) this.f3966y).f11744y;
                cVar.f(th, false);
                do {
                    cVar.getClass();
                    AtomicLongFieldUpdater atomicLongFieldUpdater = oe.c.f10135x;
                    long j8 = atomicLongFieldUpdater.get(cVar);
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = oe.c.f10134w;
                    long j9 = atomicLongFieldUpdater2.get(cVar);
                    if (cVar.s(true, j9)) {
                        hVar = new oe.h(cVar.n());
                    } else {
                        long j10 = j9 & 1152921504606846975L;
                        oe.i iVar = oe.j.f10160b;
                        if (j8 >= j10) {
                            hVar = iVar;
                        } else {
                            Object obj3 = oe.e.f10147k;
                            oe.k kVar = (oe.k) oe.c.B.get(cVar);
                            while (true) {
                                if (cVar.s(true, atomicLongFieldUpdater2.get(cVar))) {
                                    hVar = new oe.h(cVar.n());
                                } else {
                                    long andIncrement = atomicLongFieldUpdater.getAndIncrement(cVar);
                                    long j11 = oe.e.f10140b;
                                    long j12 = andIncrement / j11;
                                    int i = (int) (andIncrement % j11);
                                    if (kVar.f11400c != j12) {
                                        oe.k kVarM = cVar.m(j12, kVar);
                                        if (kVarM == null) {
                                            continue;
                                        } else {
                                            kVar = kVarM;
                                        }
                                    }
                                    Object objA = cVar.A(kVar, i, andIncrement, obj3);
                                    if (objA == oe.e.f10149m) {
                                        q1 q1Var = obj3 instanceof q1 ? (q1) obj3 : null;
                                        if (q1Var != null) {
                                            q1Var.a(kVar, i);
                                        }
                                        cVar.C(andIncrement);
                                        kVar.h();
                                    } else if (objA == oe.e.f10151o) {
                                        if (andIncrement < cVar.q()) {
                                            kVar.a();
                                        }
                                    } else {
                                        if (objA == oe.e.f10150n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        kVar.a();
                                        hVar = objA;
                                    }
                                }
                            }
                        }
                    }
                    lVar = null;
                    if (hVar instanceof oe.i) {
                        hVar = null;
                    }
                    lVar2 = od.l.f10126a;
                    if (hVar != null) {
                        me.n nVar = ((q0) hVar).f3928b;
                        Throwable cancellationException = th == null ? new CancellationException("DataStore scope was cancelled before updateData could complete") : th;
                        nVar.getClass();
                        nVar.N(new me.p(cancellationException, false));
                        lVar = lVar2;
                    }
                } while (lVar != null);
                return lVar2;
            default:
                Throwable th2 = (Throwable) obj;
                x.i iVar2 = (x.i) this.f3965x;
                if (th2 == null) {
                    Object objY = ((me.a0) this.f3966y).y();
                    iVar2.f14064d = true;
                    x.k kVar2 = iVar2.f14062b;
                    if (kVar2 != null && kVar2.f14066w.j(objY)) {
                        iVar2.f14061a = null;
                        iVar2.f14062b = null;
                        iVar2.f14063c = null;
                    }
                } else if (th2 instanceof CancellationException) {
                    iVar2.f14064d = true;
                    x.k kVar3 = iVar2.f14062b;
                    if (kVar3 != null && kVar3.f14066w.cancel(true)) {
                        iVar2.f14061a = null;
                        iVar2.f14062b = null;
                        iVar2.f14063c = null;
                    }
                } else {
                    iVar2.f14064d = true;
                    x.k kVar4 = iVar2.f14062b;
                    if (kVar4 != null && kVar4.f14066w.k(th2)) {
                        iVar2.f14061a = null;
                        iVar2.f14062b = null;
                        iVar2.f14063c = null;
                    }
                }
                return od.l.f10126a;
        }
    }
}
