package jf;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class p extends mf.u {
    public final h B;
    public final /* synthetic */ AtomicReferenceArray C;

    public p(long j, p pVar, h hVar, int i6) {
        super(j, pVar, i6);
        this.B = hVar;
        this.C = new AtomicReferenceArray(j.f7455b * 2);
    }

    @Override // mf.u
    public final int g() {
        return j.f7455b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0059, code lost:
    
        n(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x005c, code lost:
    
        if (r0 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x005e, code lost:
    
        kotlin.jvm.internal.k.b(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0061, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
    
        return;
     */
    @Override // mf.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(int r5, le.h r6) {
        /*
            r4 = this;
            int r6 = jf.j.f7455b
            if (r5 < r6) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto La
            int r5 = r5 - r6
        La:
            int r6 = r5 * 2
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r4.C
            r1.get(r6)
        L11:
            java.lang.Object r6 = r4.l(r5)
            boolean r1 = r6 instanceof gf.l2
            jf.h r2 = r4.B
            r3 = 0
            if (r1 != 0) goto L62
            boolean r1 = r6 instanceof jf.z
            if (r1 == 0) goto L21
            goto L62
        L21:
            h5.a r1 = jf.j.j
            if (r6 == r1) goto L59
            h5.a r1 = jf.j.f7463k
            if (r6 != r1) goto L2a
            goto L59
        L2a:
            h5.a r1 = jf.j.f7460g
            if (r6 == r1) goto L11
            h5.a r1 = jf.j.f7459f
            if (r6 != r1) goto L33
            goto L11
        L33:
            h5.a r5 = jf.j.f7462i
            if (r6 == r5) goto L7c
            h5.a r5 = jf.j.f7457d
            if (r6 != r5) goto L3c
            goto L7c
        L3c:
            h5.a r5 = jf.j.f7464l
            if (r6 != r5) goto L41
            goto L7c
        L41:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "unexpected state: "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L59:
            r4.n(r5, r3)
            if (r0 == 0) goto L7c
            kotlin.jvm.internal.k.b(r2)
            return
        L62:
            if (r0 == 0) goto L67
            h5.a r1 = jf.j.j
            goto L69
        L67:
            h5.a r1 = jf.j.f7463k
        L69:
            boolean r6 = r4.k(r5, r6, r1)
            if (r6 == 0) goto L11
            r4.n(r5, r3)
            r6 = r0 ^ 1
            r4.m(r5, r6)
            if (r0 == 0) goto L7c
            kotlin.jvm.internal.k.b(r2)
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jf.p.h(int, le.h):void");
    }

    public final boolean k(int i6, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i10 = (i6 * 2) + 1;
        do {
            atomicReferenceArray = this.C;
            if (atomicReferenceArray.compareAndSet(i10, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i10) == obj);
        return false;
    }

    public final Object l(int i6) {
        return this.C.get((i6 * 2) + 1);
    }

    public final void m(int i6, boolean z10) {
        if (z10) {
            h hVar = this.B;
            kotlin.jvm.internal.k.b(hVar);
            hVar.J((this.f8877z * j.f7455b) + i6);
        }
        i();
    }

    public final void n(int i6, Object obj) {
        this.C.set(i6 * 2, obj);
    }

    public final void o(int i6, Object obj) {
        this.C.set((i6 * 2) + 1, obj);
    }
}
