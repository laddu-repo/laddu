package jf;

import gf.f0;
import gf.l2;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b implements l2 {

    /* renamed from: x, reason: collision with root package name */
    public Object f7439x = j.f7468p;

    /* renamed from: y, reason: collision with root package name */
    public gf.k f7440y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ h f7441z;

    public b(h hVar) {
        this.f7441z = hVar;
    }

    public final Object a(kf.k kVar) {
        p pVar;
        p pVar2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h.D;
        h hVar = this.f7441z;
        p pVar3 = (p) atomicReferenceFieldUpdater.get(hVar);
        while (!hVar.w()) {
            long andIncrement = h.f7451z.getAndIncrement(hVar);
            long j = j.f7455b;
            long j10 = andIncrement / j;
            int i6 = (int) (andIncrement % j);
            if (pVar3.f8877z != j10) {
                pVar = hVar.p(j10, pVar3);
                if (pVar == null) {
                    continue;
                }
            } else {
                pVar = pVar3;
            }
            Object H = hVar.H(pVar, i6, andIncrement, null);
            h5.a aVar = j.f7465m;
            if (H != aVar) {
                h5.a aVar2 = j.f7467o;
                if (H == aVar2) {
                    if (andIncrement < hVar.t()) {
                        pVar.b();
                    }
                    pVar3 = pVar;
                } else {
                    if (H == j.f7466n) {
                        gf.k r10 = f0.r(a8.c.i(kVar));
                        try {
                            this.f7440y = r10;
                        } catch (Throwable th) {
                            th = th;
                        }
                        try {
                            Object H2 = hVar.H(pVar, i6, andIncrement, this);
                            if (H2 == aVar) {
                                b(pVar, i6);
                            } else {
                                if (H2 == aVar2) {
                                    if (andIncrement < hVar.t()) {
                                        pVar.b();
                                    }
                                    p pVar4 = (p) h.D.get(hVar);
                                    while (true) {
                                        if (hVar.w()) {
                                            gf.k kVar2 = this.f7440y;
                                            kotlin.jvm.internal.k.b(kVar2);
                                            this.f7440y = null;
                                            this.f7439x = j.f7464l;
                                            Throwable q9 = hVar.q();
                                            if (q9 == null) {
                                                kVar2.resumeWith(Boolean.FALSE);
                                            } else {
                                                kVar2.resumeWith(he.a.b(q9));
                                            }
                                        } else {
                                            long andIncrement2 = h.f7451z.getAndIncrement(hVar);
                                            long j11 = j.f7455b;
                                            long j12 = andIncrement2 / j11;
                                            int i10 = (int) (andIncrement2 % j11);
                                            if (pVar4.f8877z != j12) {
                                                pVar2 = hVar.p(j12, pVar4);
                                                if (pVar2 == null) {
                                                }
                                            } else {
                                                pVar2 = pVar4;
                                            }
                                            Object H3 = hVar.H(pVar2, i10, andIncrement2, this);
                                            if (H3 == j.f7465m) {
                                                b(pVar2, i10);
                                                break;
                                            }
                                            if (H3 == j.f7467o) {
                                                if (andIncrement2 < hVar.t()) {
                                                    pVar2.b();
                                                }
                                                pVar4 = pVar2;
                                            } else if (H3 != j.f7466n) {
                                                pVar2.b();
                                                this.f7439x = H3;
                                                this.f7440y = null;
                                            } else {
                                                throw new IllegalStateException("unexpected");
                                            }
                                        }
                                    }
                                } else {
                                    pVar.b();
                                    this.f7439x = H2;
                                    this.f7440y = null;
                                }
                                r10.e(null, Boolean.TRUE);
                            }
                            return r10.r();
                        } catch (Throwable th2) {
                            th = th2;
                            r10.z();
                            throw th;
                        }
                    }
                    pVar.b();
                    this.f7439x = H;
                    return Boolean.TRUE;
                }
            } else {
                throw new IllegalStateException("unreachable");
            }
        }
        this.f7439x = j.f7464l;
        Throwable q10 = hVar.q();
        if (q10 == null) {
            return Boolean.FALSE;
        }
        int i11 = mf.v.f8878a;
        throw q10;
    }

    @Override // gf.l2
    public final void b(mf.u uVar, int i6) {
        gf.k kVar = this.f7440y;
        if (kVar != null) {
            kVar.b(uVar, i6);
        }
    }
}
