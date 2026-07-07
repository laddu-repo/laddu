package com.unity3d.ads.core.extensions;

import gf.c0;
import he.a;
import he.y;
import jf.u;
import jf.v;
import kf.h;
import kf.i;
import le.c;
import ne.e;
import ne.j;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1", f = "FlowExtensions.kt", l = {15, 17}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class FlowExtensionsKt$timeoutAfter$1 extends j implements p {
    final /* synthetic */ boolean $active;
    final /* synthetic */ p $block;
    final /* synthetic */ h $this_timeoutAfter;
    final /* synthetic */ long $timeoutMillis;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    @e(c = "com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1$1", f = "FlowExtensions.kt", l = {10}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends j implements p {
        final /* synthetic */ v $$this$channelFlow;
        final /* synthetic */ h $this_timeoutAfter;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(h hVar, v vVar, c cVar) {
            super(2, cVar);
            this.$this_timeoutAfter = hVar;
            this.$$this$channelFlow = vVar;
        }

        @Override // ne.a
        public final c create(Object obj, c cVar) {
            return new AnonymousClass1(this.$this_timeoutAfter, this.$$this$channelFlow, cVar);
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
                    a.f(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                a.f(obj);
                h hVar = this.$this_timeoutAfter;
                final v vVar = this.$$this$channelFlow;
                i iVar = new i() { // from class: com.unity3d.ads.core.extensions.FlowExtensionsKt.timeoutAfter.1.1.1
                    @Override // kf.i
                    public final Object emit(T t10, c cVar) {
                        Object i10 = ((u) v.this).A.i(t10, cVar);
                        if (i10 == me.a.f8833x) {
                            return i10;
                        }
                        return y.f6101a;
                    }
                };
                this.label = 1;
                Object collect = hVar.collect(iVar, this);
                me.a aVar = me.a.f8833x;
                if (collect == aVar) {
                    return aVar;
                }
            }
            ((u) this.$$this$channelFlow).Z(null);
            return y.f6101a;
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public /* synthetic */ class AnonymousClass2 extends kotlin.jvm.internal.a implements ve.a {
        public AnonymousClass2(Object obj) {
            super(0, obj, v.class, "close", "close(Ljava/lang/Throwable;)Z", 8);
        }

        @Override // ve.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m66invoke();
            return y.f6101a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m66invoke() {
            ((u) ((v) this.receiver)).Z(null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowExtensionsKt$timeoutAfter$1(long j, boolean z10, p pVar, h hVar, c cVar) {
        super(2, cVar);
        this.$timeoutMillis = j;
        this.$active = z10;
        this.$block = pVar;
        this.$this_timeoutAfter = hVar;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        FlowExtensionsKt$timeoutAfter$1 flowExtensionsKt$timeoutAfter$1 = new FlowExtensionsKt$timeoutAfter$1(this.$timeoutMillis, this.$active, this.$block, this.$this_timeoutAfter, cVar);
        flowExtensionsKt$timeoutAfter$1.L$0 = obj;
        return flowExtensionsKt$timeoutAfter$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0054, code lost:
    
        if (r8.invoke(r3, r7) == r4) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        if (gf.f0.k(r5, r7) == r4) goto L17;
     */
    @Override // ne.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.label
            r1 = 0
            r2 = 2
            r3 = 1
            me.a r4 = me.a.f8833x
            if (r0 == 0) goto L21
            if (r0 == r3) goto L19
            if (r0 != r2) goto L11
            he.a.f(r8)
            goto L57
        L11:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L19:
            java.lang.Object r0 = r7.L$0
            jf.v r0 = (jf.v) r0
            he.a.f(r8)
            goto L41
        L21:
            he.a.f(r8)
            java.lang.Object r8 = r7.L$0
            r0 = r8
            jf.v r0 = (jf.v) r0
            com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1$1 r8 = new com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1$1
            kf.h r5 = r7.$this_timeoutAfter
            r8.<init>(r5, r0, r1)
            r5 = 3
            gf.f0.w(r0, r1, r8, r5)
            long r5 = r7.$timeoutMillis
            r7.L$0 = r0
            r7.label = r3
            java.lang.Object r8 = gf.f0.k(r5, r7)
            if (r8 != r4) goto L41
            goto L56
        L41:
            boolean r8 = r7.$active
            if (r8 == 0) goto L57
            ve.p r8 = r7.$block
            com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1$2 r3 = new com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1$2
            r3.<init>(r0)
            r7.L$0 = r1
            r7.label = r2
            java.lang.Object r8 = r8.invoke(r3, r7)
            if (r8 != r4) goto L57
        L56:
            return r4
        L57:
            he.y r8 = he.y.f6101a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // ve.p
    public final Object invoke(v vVar, c cVar) {
        return ((FlowExtensionsKt$timeoutAfter$1) create(vVar, cVar)).invokeSuspend(y.f6101a);
    }
}
