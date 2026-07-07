package com.unity3d.ads.adplayer;

import gf.c0;
import gf.i0;
import he.y;
import le.c;
import ne.e;
import ne.j;
import org.json.JSONArray;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocation$7", f = "CommonWebViewBridge.kt", l = {134, 136, 137, 138, 139, 148}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class CommonWebViewBridge$handleInvocation$7 extends j implements p {
    final /* synthetic */ String $callback;
    final /* synthetic */ String $location;
    final /* synthetic */ String $message;
    final /* synthetic */ JSONArray $parameters;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ CommonWebViewBridge this$0;

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    @e(c = "com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocation$7$1", f = "CommonWebViewBridge.kt", l = {136}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocation$7$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends j implements p {
        final /* synthetic */ Invocation $invocation;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Invocation invocation, c cVar) {
            super(2, cVar);
            this.$invocation = invocation;
        }

        @Override // ne.a
        public final c create(Object obj, c cVar) {
            return new AnonymousClass1(this.$invocation, cVar);
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
                i0 isHandled = this.$invocation.isHandled();
                this.label = 1;
                Object a02 = isHandled.a0(this);
                me.a aVar = me.a.f8833x;
                if (a02 == aVar) {
                    return aVar;
                }
            }
            return y.f6101a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonWebViewBridge$handleInvocation$7(String str, JSONArray jSONArray, CommonWebViewBridge commonWebViewBridge, String str2, String str3, c cVar) {
        super(2, cVar);
        this.$location = str;
        this.$parameters = jSONArray;
        this.this$0 = commonWebViewBridge;
        this.$callback = str2;
        this.$message = str3;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        CommonWebViewBridge$handleInvocation$7 commonWebViewBridge$handleInvocation$7 = new CommonWebViewBridge$handleInvocation$7(this.$location, this.$parameters, this.this$0, this.$callback, this.$message, cVar);
        commonWebViewBridge$handleInvocation$7.L$0 = obj;
        return commonWebViewBridge$handleInvocation$7;
    }

    @Override // ve.p
    public final Object invoke(c0 c0Var, c cVar) {
        return ((CommonWebViewBridge$handleInvocation$7) create(c0Var, cVar)).invokeSuspend(y.f6101a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0072, code lost:
    
        if (r9.emit(r0, r17) == r7) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0101, code lost:
    
        if (r0 != r7) goto L50;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009d A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:17:0x0023, B:20:0x002e, B:22:0x0099, B:24:0x009d, B:28:0x00ad, B:31:0x003d, B:32:0x008b, B:36:0x0076), top: B:2:0x000c, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ad A[Catch: all -> 0x0027, TRY_LEAVE, TryCatch #0 {all -> 0x0027, blocks: (B:17:0x0023, B:20:0x002e, B:22:0x0099, B:24:0x009d, B:28:0x00ad, B:31:0x003d, B:32:0x008b, B:36:0x0076), top: B:2:0x000c, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0098  */
    @Override // ne.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocation$7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
