package jf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class c extends kotlin.jvm.internal.j implements ve.q {

    /* renamed from: x, reason: collision with root package name */
    public static final c f7442x = new kotlin.jvm.internal.j(3, h.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0075, code lost:
    
        return he.y.f6101a;
     */
    @Override // ve.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object r9, java.lang.Object r10, java.lang.Object r11) {
        /*
            r8 = this;
            r0 = r9
            jf.h r0 = (jf.h) r0
            r5 = r10
            pf.f r5 = (pf.f) r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r9 = jf.h.f7450y
            r0.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r9 = jf.h.D
            java.lang.Object r9 = r9.get(r0)
            jf.p r9 = (jf.p) r9
        L13:
            boolean r10 = r0.w()
            if (r10 == 0) goto L20
            h5.a r9 = jf.j.f7464l
            pf.e r5 = (pf.e) r5
            r5.B = r9
            goto L73
        L20:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r10 = jf.h.f7451z
            long r3 = r10.getAndIncrement(r0)
            int r10 = jf.j.f7455b
            long r10 = (long) r10
            long r1 = r3 / r10
            long r10 = r3 % r10
            int r11 = (int) r10
            long r6 = r9.f8877z
            int r10 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r10 == 0) goto L3e
            jf.p r10 = r0.p(r1, r9)
            if (r10 != 0) goto L3b
            goto L13
        L3b:
            r1 = r10
        L3c:
            r2 = r11
            goto L40
        L3e:
            r1 = r9
            goto L3c
        L40:
            java.lang.Object r9 = r0.H(r1, r2, r3, r5)
            r10 = r1
            h5.a r11 = jf.j.f7465m
            if (r9 != r11) goto L57
            boolean r9 = r5 instanceof gf.l2
            if (r9 == 0) goto L50
            gf.l2 r5 = (gf.l2) r5
            goto L51
        L50:
            r5 = 0
        L51:
            if (r5 == 0) goto L73
            r5.b(r10, r2)
            goto L73
        L57:
            h5.a r11 = jf.j.f7467o
            if (r9 != r11) goto L68
            long r1 = r0.t()
            int r9 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r9 >= 0) goto L66
            r10.b()
        L66:
            r9 = r10
            goto L13
        L68:
            h5.a r11 = jf.j.f7466n
            if (r9 == r11) goto L76
            r10.b()
            pf.e r5 = (pf.e) r5
            r5.B = r9
        L73:
            he.y r9 = he.y.f6101a
            return r9
        L76:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "unexpected"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: jf.c.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
