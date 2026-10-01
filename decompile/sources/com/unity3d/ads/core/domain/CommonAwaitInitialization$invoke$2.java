package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.SessionRepository;
import gf.c0;
import he.y;
import kf.h;
import kf.i;
import kf.y0;
import le.c;
import ne.e;
import ne.j;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.core.domain.CommonAwaitInitialization$invoke$2", f = "CommonAwaitInitialization.kt", l = {15}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class CommonAwaitInitialization$invoke$2 extends j implements p {
    int label;
    final /* synthetic */ CommonAwaitInitialization this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonAwaitInitialization$invoke$2(CommonAwaitInitialization commonAwaitInitialization, c cVar) {
        super(2, cVar);
        this.this$0 = commonAwaitInitialization;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        return new CommonAwaitInitialization$invoke$2(this.this$0, cVar);
    }

    @Override // ve.p
    public final Object invoke(c0 c0Var, c cVar) {
        return ((CommonAwaitInitialization$invoke$2) create(c0Var, cVar)).invokeSuspend(y.f6101a);
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        SessionRepository sessionRepository;
        int i6 = this.label;
        if (i6 != 0) {
            if (i6 == 1) {
                he.a.f(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        he.a.f(obj);
        sessionRepository = this.this$0.sessionRepository;
        final h observeInitializationState = sessionRepository.getObserveInitializationState();
        h hVar = new h() { // from class: com.unity3d.ads.core.domain.CommonAwaitInitialization$invoke$2$invokeSuspend$$inlined$filter$1

            /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
            /* renamed from: com.unity3d.ads.core.domain.CommonAwaitInitialization$invoke$2$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements i {
                final /* synthetic */ i $this_unsafeFlow;

                /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
                @e(c = "com.unity3d.ads.core.domain.CommonAwaitInitialization$invoke$2$invokeSuspend$$inlined$filter$1$2", f = "CommonAwaitInitialization.kt", l = {223}, m = "emit")
                /* renamed from: com.unity3d.ads.core.domain.CommonAwaitInitialization$invoke$2$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends ne.c {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(c cVar) {
                        super(cVar);
                    }

                    @Override // ne.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(i iVar) {
                    this.$this_unsafeFlow = iVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                @Override // kf.i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r5, le.c r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.unity3d.ads.core.domain.CommonAwaitInitialization$invoke$2$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.unity3d.ads.core.domain.CommonAwaitInitialization$invoke$2$invokeSuspend$$inlined$filter$1$2$1 r0 = (com.unity3d.ads.core.domain.CommonAwaitInitialization$invoke$2$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.core.domain.CommonAwaitInitialization$invoke$2$invokeSuspend$$inlined$filter$1$2$1 r0 = new com.unity3d.ads.core.domain.CommonAwaitInitialization$invoke$2$invokeSuspend$$inlined$filter$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        int r1 = r0.label
                        r2 = 1
                        if (r1 == 0) goto L2d
                        if (r1 != r2) goto L25
                        he.a.f(r6)
                        goto L48
                    L25:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L2d:
                        he.a.f(r6)
                        kf.i r6 = r4.$this_unsafeFlow
                        r1 = r5
                        com.unity3d.ads.core.data.model.InitializationState r1 = (com.unity3d.ads.core.data.model.InitializationState) r1
                        com.unity3d.ads.core.data.model.InitializationState r3 = com.unity3d.ads.core.data.model.InitializationState.INITIALIZED
                        if (r1 == r3) goto L3d
                        com.unity3d.ads.core.data.model.InitializationState r3 = com.unity3d.ads.core.data.model.InitializationState.FAILED
                        if (r1 != r3) goto L48
                    L3d:
                        r0.label = r2
                        java.lang.Object r5 = r6.emit(r5, r0)
                        me.a r6 = me.a.f8833x
                        if (r5 != r6) goto L48
                        return r6
                    L48:
                        he.y r5 = he.y.f6101a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.CommonAwaitInitialization$invoke$2$invokeSuspend$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, le.c):java.lang.Object");
                }
            }

            @Override // kf.h
            public Object collect(i iVar, c cVar) {
                Object collect = h.this.collect(new AnonymousClass2(iVar), cVar);
                if (collect == me.a.f8833x) {
                    return collect;
                }
                return y.f6101a;
            }
        };
        this.label = 1;
        Object l10 = y0.l(hVar, this);
        me.a aVar = me.a.f8833x;
        if (l10 == aVar) {
            return aVar;
        }
        return l10;
    }
}
