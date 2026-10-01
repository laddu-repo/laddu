package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.AdObjectState;
import gf.c0;
import he.y;
import kf.f1;
import le.c;
import ne.e;
import ne.j;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires$invoke$job$1", f = "CleanUpWhenOpportunityExpires.kt", l = {33, 34, 39}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class CleanUpWhenOpportunityExpires$invoke$job$1 extends j implements p {
    final /* synthetic */ AdObject $adObject;
    int label;

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    @e(c = "com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires$invoke$job$1$1", f = "CleanUpWhenOpportunityExpires.kt", l = {41}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires$invoke$job$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends j implements p {
        final /* synthetic */ AdObject $adObject;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AdObject adObject, c cVar) {
            super(2, cVar);
            this.$adObject = adObject;
        }

        @Override // ne.a
        public final c create(Object obj, c cVar) {
            return new AnonymousClass1(this.$adObject, cVar);
        }

        @Override // ve.p
        public final Object invoke(c0 c0Var, c cVar) {
            return ((AnonymousClass1) create(c0Var, cVar)).invokeSuspend(y.f6101a);
        }

        @Override // ne.a
        public final Object invokeSuspend(Object obj) {
            int i6 = this.label;
            if (i6 != 0) {
                if (i6 == 1) {
                    he.a.f(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                he.a.f(obj);
                ((f1) this.$adObject.getState()).g(AdObjectState.EXPIRED);
                AdPlayer adPlayer = this.$adObject.getAdPlayer();
                this.label = 1;
                Object destroy = adPlayer.destroy(this);
                me.a aVar = me.a.f8833x;
                if (destroy == aVar) {
                    return aVar;
                }
            }
            return y.f6101a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CleanUpWhenOpportunityExpires$invoke$job$1(AdObject adObject, c cVar) {
        super(2, cVar);
        this.$adObject = adObject;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        return new CleanUpWhenOpportunityExpires$invoke$job$1(this.$adObject, cVar);
    }

    @Override // ve.p
    public final Object invoke(c0 c0Var, c cVar) {
        return ((CleanUpWhenOpportunityExpires$invoke$job$1) create(c0Var, cVar)).invokeSuspend(y.f6101a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0063, code lost:
    
        if (r9 != r5) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004e, code lost:
    
        if (r9 == r5) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    @Override // ne.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.label
            he.y r1 = he.y.f6101a
            r2 = 3
            r3 = 2
            r4 = 1
            me.a r5 = me.a.f8833x
            if (r0 == 0) goto L25
            if (r0 == r4) goto L21
            if (r0 == r3) goto L1d
            if (r0 != r2) goto L15
            he.a.f(r9)
            return r1
        L15:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1d:
            he.a.f(r9)
            goto L66
        L21:
            he.a.f(r9)
            goto L51
        L25:
            he.a.f(r9)
            com.unity3d.ads.core.data.model.AdObject r9 = r8.$adObject
            kf.r0 r9 = r9.getTtl()
            kf.f1 r9 = (kf.f1) r9
            java.lang.Object r9 = r9.getValue()
            ef.a r9 = (ef.a) r9
            if (r9 == 0) goto L3b
            long r6 = r9.f4568x
            goto L55
        L3b:
            com.unity3d.ads.core.data.model.AdObject r9 = r8.$adObject
            kf.r0 r9 = r9.getTtl()
            k7.d r0 = new k7.d
            r6 = 15
            r0.<init>(r9, r6)
            r8.label = r4
            java.lang.Object r9 = kf.y0.l(r0, r8)
            if (r9 != r5) goto L51
            goto L88
        L51:
            ef.a r9 = (ef.a) r9
            long r6 = r9.f4568x
        L55:
            r8.label = r3
            long r3 = gf.f0.G(r6)
            java.lang.Object r9 = gf.f0.k(r3, r8)
            if (r9 != r5) goto L62
            goto L63
        L62:
            r9 = r1
        L63:
            if (r9 != r5) goto L66
            goto L88
        L66:
            com.unity3d.ads.core.data.model.AdObject r9 = r8.$adObject
            kf.r0 r9 = r9.getState()
            kf.f1 r9 = (kf.f1) r9
            java.lang.Object r9 = r9.getValue()
            com.unity3d.ads.core.data.model.AdObjectState r0 = com.unity3d.ads.core.data.model.AdObjectState.SHOWING
            if (r9 == r0) goto L89
            gf.w1 r9 = gf.w1.f5722x
            com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires$invoke$job$1$1 r0 = new com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires$invoke$job$1$1
            com.unity3d.ads.core.data.model.AdObject r3 = r8.$adObject
            r4 = 0
            r0.<init>(r3, r4)
            r8.label = r2
            java.lang.Object r9 = gf.f0.J(r9, r0, r8)
            if (r9 != r5) goto L89
        L88:
            return r5
        L89:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires$invoke$job$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
