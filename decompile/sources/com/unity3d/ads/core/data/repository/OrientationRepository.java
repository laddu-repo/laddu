package com.unity3d.ads.core.data.repository;

import bf.n;
import com.unity3d.ads.core.domain.AndroidGetLifecycleFlow;
import com.unity3d.ads.core.domain.LifecycleEvent;
import gf.y;
import j1.f0;
import kf.d1;
import kf.f1;
import kf.h;
import kf.i;
import kf.r0;
import kf.y0;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.q;
import me.a;
import ne.c;
import ne.e;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class OrientationRepository {
    private final r0 _resumedActivityOrientation;
    private final y defaultDispatcher;
    private final AndroidGetLifecycleFlow getLifecycleFlow;
    private final r0 isRunning;
    private final d1 resumedActivityOrientation;

    public OrientationRepository(AndroidGetLifecycleFlow getLifecycleFlow, y defaultDispatcher) {
        k.e(getLifecycleFlow, "getLifecycleFlow");
        k.e(defaultDispatcher, "defaultDispatcher");
        this.getLifecycleFlow = getLifecycleFlow;
        this.defaultDispatcher = defaultDispatcher;
        this.isRunning = y0.c(Boolean.FALSE);
        f1 c10 = y0.c(-1);
        this._resumedActivityOrientation = c10;
        this.resumedActivityOrientation = c10;
    }

    public final d1 getResumedActivityOrientation() {
        return this.resumedActivityOrientation;
    }

    public final void invoke() {
        f1 f1Var;
        Object value;
        Boolean bool;
        r0 r0Var = this.isRunning;
        do {
            f1Var = (f1) r0Var;
            value = f1Var.getValue();
            bool = (Boolean) value;
            bool.getClass();
        } while (!f1Var.f(value, Boolean.TRUE));
        if (bool.booleanValue()) {
            return;
        }
        final h invoke = this.getLifecycleFlow.invoke();
        final h hVar = new h() { // from class: com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$filterIsInstance$1

            /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
            /* renamed from: com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$filterIsInstance$1$2, reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements i {
                final /* synthetic */ i $this_unsafeFlow;

                /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
                @e(c = "com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$filterIsInstance$1$2", f = "OrientationRepository.kt", l = {224}, m = "emit")
                /* renamed from: com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends c {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(le.c cVar) {
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
                        boolean r0 = r6 instanceof com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$filterIsInstance$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$filterIsInstance$1$2$1 r0 = (com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$filterIsInstance$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$filterIsInstance$1$2$1 r0 = new com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$filterIsInstance$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        int r1 = r0.label
                        r2 = 1
                        if (r1 == 0) goto L2d
                        if (r1 != r2) goto L25
                        he.a.f(r6)
                        goto L41
                    L25:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L2d:
                        he.a.f(r6)
                        kf.i r6 = r4.$this_unsafeFlow
                        boolean r1 = r5 instanceof com.unity3d.ads.core.domain.LifecycleEvent.Resumed
                        if (r1 == 0) goto L41
                        r0.label = r2
                        java.lang.Object r5 = r6.emit(r5, r0)
                        me.a r6 = me.a.f8833x
                        if (r5 != r6) goto L41
                        return r6
                    L41:
                        he.y r5 = he.y.f6101a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$filterIsInstance$1.AnonymousClass2.emit(java.lang.Object, le.c):java.lang.Object");
                }
            }

            @Override // kf.h
            public Object collect(i iVar, le.c cVar) {
                Object collect = h.this.collect(new AnonymousClass2(iVar), cVar);
                if (collect == a.f8833x) {
                    return collect;
                }
                return he.y.f6101a;
            }
        };
        final OrientationRepository$invoke$3 orientationRepository$invoke$3 = new q() { // from class: com.unity3d.ads.core.data.repository.OrientationRepository$invoke$3
            @Override // kotlin.jvm.internal.q, bf.n
            public Object get(Object obj) {
                return ((LifecycleEvent) obj).getActivity();
            }
        };
        y0.p(new f0(6, new h() { // from class: com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$map$1

            /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
            /* renamed from: com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$map$1$2, reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements i {
                final /* synthetic */ i $this_unsafeFlow;
                final /* synthetic */ n receiver$inlined;

                /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
                @e(c = "com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$map$1$2", f = "OrientationRepository.kt", l = {223}, m = "emit")
                /* renamed from: com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$map$1$2$1, reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends c {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(le.c cVar) {
                        super(cVar);
                    }

                    @Override // ne.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(i iVar, n nVar) {
                    this.$this_unsafeFlow = iVar;
                    this.receiver$inlined = nVar;
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
                        boolean r0 = r6 instanceof com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$map$1$2$1 r0 = (com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$map$1$2$1 r0 = new com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        int r1 = r0.label
                        r2 = 1
                        if (r1 == 0) goto L2d
                        if (r1 != r2) goto L25
                        he.a.f(r6)
                        goto L45
                    L25:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L2d:
                        he.a.f(r6)
                        kf.i r6 = r4.$this_unsafeFlow
                        com.unity3d.ads.core.domain.LifecycleEvent r5 = (com.unity3d.ads.core.domain.LifecycleEvent) r5
                        bf.n r1 = r4.receiver$inlined
                        java.lang.Object r5 = r1.get(r5)
                        r0.label = r2
                        java.lang.Object r5 = r6.emit(r5, r0)
                        me.a r6 = me.a.f8833x
                        if (r5 != r6) goto L45
                        return r6
                    L45:
                        he.y r5 = he.y.f6101a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, le.c):java.lang.Object");
                }
            }

            @Override // kf.h
            public Object collect(i iVar, le.c cVar) {
                Object collect = h.this.collect(new AnonymousClass2(iVar, orientationRepository$invoke$3), cVar);
                if (collect == a.f8833x) {
                    return collect;
                }
                return he.y.f6101a;
            }
        }, new OrientationRepository$invoke$4(this, null)), gf.f0.b(this.defaultDispatcher));
    }
}
