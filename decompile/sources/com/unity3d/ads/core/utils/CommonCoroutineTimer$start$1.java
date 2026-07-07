package com.unity3d.ads.core.utils;

import gf.c0;
import he.y;
import le.c;
import ne.e;
import ne.j;
import ve.a;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.core.utils.CommonCoroutineTimer$start$1", f = "CommonCoroutineTimer.kt", l = {21, 24}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class CommonCoroutineTimer$start$1 extends j implements p {
    final /* synthetic */ a $action;
    final /* synthetic */ long $delayStartMillis;
    final /* synthetic */ long $repeatMillis;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonCoroutineTimer$start$1(long j, a aVar, long j10, c cVar) {
        super(2, cVar);
        this.$delayStartMillis = j;
        this.$action = aVar;
        this.$repeatMillis = j10;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        CommonCoroutineTimer$start$1 commonCoroutineTimer$start$1 = new CommonCoroutineTimer$start$1(this.$delayStartMillis, this.$action, this.$repeatMillis, cVar);
        commonCoroutineTimer$start$1.L$0 = obj;
        return commonCoroutineTimer$start$1;
    }

    @Override // ve.p
    public final Object invoke(c0 c0Var, c cVar) {
        return ((CommonCoroutineTimer$start$1) create(c0Var, cVar)).invokeSuspend(y.f6101a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x002f, code lost:
    
        if (gf.f0.k(r4, r6) == r3) goto L17;
     */
    @Override // ne.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.label
            r1 = 2
            r2 = 1
            me.a r3 = me.a.f8833x
            if (r0 == 0) goto L1d
            if (r0 == r2) goto L15
            if (r0 != r1) goto Ld
            goto L15
        Ld:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L15:
            java.lang.Object r0 = r6.L$0
            gf.c0 r0 = (gf.c0) r0
            he.a.f(r7)
            goto L32
        L1d:
            he.a.f(r7)
            java.lang.Object r7 = r6.L$0
            r0 = r7
            gf.c0 r0 = (gf.c0) r0
            long r4 = r6.$delayStartMillis
            r6.L$0 = r0
            r6.label = r2
            java.lang.Object r7 = gf.f0.k(r4, r6)
            if (r7 != r3) goto L32
            goto L49
        L32:
            boolean r7 = gf.f0.u(r0)
            if (r7 == 0) goto L4a
            ve.a r7 = r6.$action
            r7.invoke()
            long r4 = r6.$repeatMillis
            r6.L$0 = r0
            r6.label = r1
            java.lang.Object r7 = gf.f0.k(r4, r6)
            if (r7 != r3) goto L32
        L49:
            return r3
        L4a:
            he.y r7 = he.y.f6101a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.utils.CommonCoroutineTimer$start$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
