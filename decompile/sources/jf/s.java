package jf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class s extends h {
    public final a H;

    public s(int i6, a aVar) {
        super(i6);
        this.H = aVar;
        if (aVar != a.f7436x) {
            if (i6 >= 1) {
            } else {
                throw new IllegalArgumentException(h8.c.j(i6, "Buffered channel capacity must be at least 1, but ", " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + kotlin.jvm.internal.x.a(h.class).c() + " instead").toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b8, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object K(java.lang.Object r17, boolean r18) {
        /*
            r16 = this;
            r0 = r16
            jf.a r1 = r0.H
            jf.a r2 = jf.a.f7438z
            he.y r8 = he.y.f6101a
            if (r1 != r2) goto L19
            java.lang.Object r1 = super.h(r17)
            boolean r2 = r1 instanceof jf.n
            if (r2 == 0) goto L18
            boolean r2 = r1 instanceof jf.m
            if (r2 == 0) goto L17
            goto L18
        L17:
            return r8
        L18:
            return r1
        L19:
            h5.a r6 = jf.j.f7457d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = jf.h.C
            java.lang.Object r1 = r1.get(r0)
            jf.p r1 = (jf.p) r1
        L23:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = jf.h.f7450y
            long r2 = r2.getAndIncrement(r0)
            r4 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r4 = r4 & r2
            r7 = 0
            boolean r7 = r0.v(r7, r2)
            int r9 = jf.j.f7455b
            long r10 = (long) r9
            long r2 = r4 / r10
            long r12 = r4 % r10
            int r13 = (int) r12
            long r14 = r1.f8877z
            int r12 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r12 == 0) goto L55
            jf.p r2 = jf.h.a(r0, r2, r1)
            if (r2 != 0) goto L54
            if (r7 == 0) goto L23
            java.lang.Throwable r1 = r0.s()
            jf.m r2 = new jf.m
            r2.<init>(r1)
            return r2
        L54:
            r1 = r2
        L55:
            r3 = r17
            r2 = r13
            int r12 = jf.h.f(r0, r1, r2, r3, r4, r6, r7)
            if (r12 == 0) goto Lb9
            r3 = 1
            if (r12 == r3) goto Lb8
            r3 = 2
            if (r12 == r3) goto L91
            r2 = 3
            if (r12 == r2) goto L89
            r2 = 4
            if (r12 == r2) goto L72
            r2 = 5
            if (r12 == r2) goto L6e
            goto L23
        L6e:
            r1.b()
            goto L23
        L72:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = jf.h.f7451z
            long r2 = r2.get(r0)
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 >= 0) goto L7f
            r1.b()
        L7f:
            java.lang.Throwable r1 = r0.s()
            jf.m r2 = new jf.m
            r2.<init>(r1)
            return r2
        L89:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "unexpected"
            r1.<init>(r2)
            throw r1
        L91:
            if (r7 == 0) goto La0
            r1.i()
            java.lang.Throwable r1 = r0.s()
            jf.m r2 = new jf.m
            r2.<init>(r1)
            return r2
        La0:
            boolean r3 = r6 instanceof gf.l2
            if (r3 == 0) goto La7
            gf.l2 r6 = (gf.l2) r6
            goto La8
        La7:
            r6 = 0
        La8:
            if (r6 == 0) goto Laf
            int r13 = r2 + r9
            r6.b(r1, r13)
        Laf:
            long r3 = r1.f8877z
            long r3 = r3 * r10
            long r1 = (long) r2
            long r3 = r3 + r1
            r0.n(r3)
        Lb8:
            return r8
        Lb9:
            r1.b()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: jf.s.K(java.lang.Object, boolean):java.lang.Object");
    }

    @Override // jf.h, jf.y
    public final Object h(Object obj) {
        return K(obj, false);
    }

    @Override // jf.h, jf.y
    public final Object i(Object obj, le.c cVar) {
        if (!(K(obj, true) instanceof m)) {
            return he.y.f6101a;
        }
        throw s();
    }

    @Override // jf.h
    public final boolean y() {
        if (this.H == a.f7437y) {
            return true;
        }
        return false;
    }
}
