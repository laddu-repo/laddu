package ke;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements ce.p {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f7976v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Serializable f7977w;

    public /* synthetic */ q(int i, Serializable serializable) {
        this.f7976v = i;
        this.f7977w = serializable;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // ce.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(java.lang.Object r4, java.lang.Object r5) {
        /*
            r3 = this;
            int r0 = r3.f7976v
            switch(r0) {
                case 0: goto L77;
                default: goto L5;
            }
        L5:
            java.io.Serializable r0 = r3.f7977w
            qe.f r0 = (qe.f) r0
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r1 = r4.intValue()
            sd.f r5 = (sd.f) r5
            sd.g r4 = r5.getKey()
            sd.h r0 = r0.f11019z
            sd.f r0 = r0.A(r4)
            me.t r2 = me.t.f8732w
            if (r4 == r2) goto L27
            if (r5 == r0) goto L24
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L3b
        L24:
            int r1 = r1 + 1
            goto L3b
        L27:
            me.v0 r0 = (me.v0) r0
            me.v0 r5 = (me.v0) r5
        L2b:
            r4 = 0
            if (r5 != 0) goto L30
            r5 = r4
            goto L37
        L30:
            if (r5 != r0) goto L33
            goto L37
        L33:
            boolean r2 = r5 instanceof re.q
            if (r2 != 0) goto L65
        L37:
            if (r5 != r0) goto L40
            if (r0 != 0) goto L24
        L3b:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            return r4
        L40:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r5 = ", expected child of "
            r1.append(r5)
            r1.append(r0)
            java.lang.String r5 = ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L65:
            re.q r5 = (re.q) r5
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = me.d1.f8688w
            java.lang.Object r5 = r2.get(r5)
            me.k r5 = (me.k) r5
            if (r5 == 0) goto L75
            me.v0 r4 = r5.getParent()
        L75:
            r5 = r4
            goto L2b
        L77:
            java.io.Serializable r0 = r3.f7977w
            char[] r0 = (char[]) r0
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            java.lang.String r1 = "$this$DelimitedRangesSequence"
            de.i.e(r4, r1)
            r1 = 0
            int r4 = ke.h.K(r4, r0, r5, r1)
            if (r4 >= 0) goto L91
            r4 = 0
            goto La0
        L91:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            od.f r0 = new od.f
            r0.<init>(r4, r5)
            r4 = r0
        La0:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ke.q.i(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
