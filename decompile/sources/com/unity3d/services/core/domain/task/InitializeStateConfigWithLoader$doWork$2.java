package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader;
import gf.c0;
import he.y;
import le.c;
import ne.e;
import ne.j;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2", f = "InitializeStateConfigWithLoader.kt", l = {58, 101, 109}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class InitializeStateConfigWithLoader$doWork$2 extends j implements p {
    final /* synthetic */ InitializeStateConfigWithLoader.Params $params;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ InitializeStateConfigWithLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateConfigWithLoader$doWork$2(InitializeStateConfigWithLoader initializeStateConfigWithLoader, InitializeStateConfigWithLoader.Params params, c cVar) {
        super(2, cVar);
        this.this$0 = initializeStateConfigWithLoader;
        this.$params = params;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        InitializeStateConfigWithLoader$doWork$2 initializeStateConfigWithLoader$doWork$2 = new InitializeStateConfigWithLoader$doWork$2(this.this$0, this.$params, cVar);
        initializeStateConfigWithLoader$doWork$2.L$0 = obj;
        return initializeStateConfigWithLoader$doWork$2;
    }

    @Override // ve.p
    public final Object invoke(c0 c0Var, c cVar) {
        return ((InitializeStateConfigWithLoader$doWork$2) create(c0Var, cVar)).invokeSuspend(y.f6101a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0198 A[Catch: all -> 0x0022, CancellationException -> 0x0025, TryCatch #6 {CancellationException -> 0x0025, all -> 0x0022, blocks: (B:8:0x001d, B:9:0x01c3, B:10:0x01f4, B:26:0x0194, B:28:0x0198, B:32:0x01cd, B:33:0x01df, B:36:0x018f, B:42:0x0152, B:44:0x0156, B:46:0x01e0, B:47:0x01ed, B:55:0x01ee, B:58:0x014d, B:60:0x0082), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01cd A[Catch: all -> 0x0022, CancellationException -> 0x0025, TryCatch #6 {CancellationException -> 0x0025, all -> 0x0022, blocks: (B:8:0x001d, B:9:0x01c3, B:10:0x01f4, B:26:0x0194, B:28:0x0198, B:32:0x01cd, B:33:0x01df, B:36:0x018f, B:42:0x0152, B:44:0x0156, B:46:0x01e0, B:47:0x01ed, B:55:0x01ee, B:58:0x014d, B:60:0x0082), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0156 A[Catch: all -> 0x0022, CancellationException -> 0x0025, TRY_LEAVE, TryCatch #6 {CancellationException -> 0x0025, all -> 0x0022, blocks: (B:8:0x001d, B:9:0x01c3, B:10:0x01f4, B:26:0x0194, B:28:0x0198, B:32:0x01cd, B:33:0x01df, B:36:0x018f, B:42:0x0152, B:44:0x0156, B:46:0x01e0, B:47:0x01ed, B:55:0x01ee, B:58:0x014d, B:60:0x0082), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01ee A[Catch: all -> 0x0022, CancellationException -> 0x0025, TryCatch #6 {CancellationException -> 0x0025, all -> 0x0022, blocks: (B:8:0x001d, B:9:0x01c3, B:10:0x01f4, B:26:0x0194, B:28:0x0198, B:32:0x01cd, B:33:0x01df, B:36:0x018f, B:42:0x0152, B:44:0x0156, B:46:0x01e0, B:47:0x01ed, B:55:0x01ee, B:58:0x014d, B:60:0x0082), top: B:2:0x000d }] */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.jvm.internal.w] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, kotlin.jvm.internal.w] */
    @Override // ne.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 533
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
