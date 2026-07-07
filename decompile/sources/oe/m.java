package oe;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class m extends c {
    public final a F;

    public m(int i, a aVar) {
        super(i);
        this.F = aVar;
        if (aVar != a.f10127v) {
            if (i < 1) {
                throw new IllegalArgumentException(d0.d.i(i, "Buffered channel capacity must be at least 1, but ", " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + de.q.a(c.class).c() + " instead").toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b6, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object D(java.lang.Object r16, boolean r17) {
        /*
            r15 = this;
            oe.a r1 = r15.F
            oe.a r2 = oe.a.f10129x
            od.l r8 = od.l.f10126a
            if (r1 != r2) goto L17
            java.lang.Object r1 = super.h(r16)
            boolean r2 = r1 instanceof oe.i
            if (r2 == 0) goto L16
            boolean r2 = r1 instanceof oe.h
            if (r2 == 0) goto L15
            goto L16
        L15:
            return r8
        L16:
            return r1
        L17:
            re.t r6 = oe.e.f10142d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = oe.c.A
            java.lang.Object r1 = r1.get(r15)
            oe.k r1 = (oe.k) r1
        L21:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = oe.c.f10134w
            long r2 = r2.getAndIncrement(r15)
            r4 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r4 = r4 & r2
            r7 = 0
            boolean r7 = r15.s(r7, r2)
            int r9 = oe.e.f10140b
            long r10 = (long) r9
            long r2 = r4 / r10
            long r12 = r4 % r10
            int r12 = (int) r12
            long r13 = r1.f11400c
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 == 0) goto L53
            oe.k r2 = oe.c.a(r15, r2, r1)
            if (r2 != 0) goto L52
            if (r7 == 0) goto L21
            java.lang.Throwable r1 = r15.p()
            oe.h r2 = new oe.h
            r2.<init>(r1)
            return r2
        L52:
            r1 = r2
        L53:
            r0 = r15
            r3 = r16
            r2 = r12
            int r12 = oe.c.c(r0, r1, r2, r3, r4, r6, r7)
            if (r12 == 0) goto Lb7
            r3 = 1
            if (r12 == r3) goto Lb6
            r3 = 2
            if (r12 == r3) goto L90
            r2 = 3
            if (r12 == r2) goto L88
            r2 = 4
            if (r12 == r2) goto L71
            r2 = 5
            if (r12 == r2) goto L6d
            goto L21
        L6d:
            r1.a()
            goto L21
        L71:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = oe.c.f10135x
            long r2 = r2.get(r15)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L7e
            r1.a()
        L7e:
            java.lang.Throwable r1 = r15.p()
            oe.h r2 = new oe.h
            r2.<init>(r1)
            return r2
        L88:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "unexpected"
            r1.<init>(r2)
            throw r1
        L90:
            if (r7 == 0) goto L9f
            r1.h()
            java.lang.Throwable r1 = r15.p()
            oe.h r2 = new oe.h
            r2.<init>(r1)
            return r2
        L9f:
            boolean r3 = r6 instanceof me.q1
            if (r3 == 0) goto La6
            me.q1 r6 = (me.q1) r6
            goto La7
        La6:
            r6 = 0
        La7:
            if (r6 == 0) goto Lae
            int r12 = r2 + r9
            r6.a(r1, r12)
        Lae:
            long r3 = r1.f11400c
            long r3 = r3 * r10
            long r1 = (long) r2
            long r3 = r3 + r1
            r15.k(r3)
        Lb6:
            return r8
        Lb7:
            r1.a()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: oe.m.D(java.lang.Object, boolean):java.lang.Object");
    }

    @Override // oe.c, oe.s
    public final Object d(Object obj, sd.c cVar) throws Throwable {
        if (D(obj, true) instanceof h) {
            throw p();
        }
        return od.l.f10126a;
    }

    @Override // oe.c, oe.s
    public final Object h(Object obj) {
        return D(obj, false);
    }

    @Override // oe.c
    public final boolean t() {
        return this.F == a.f10128w;
    }
}
