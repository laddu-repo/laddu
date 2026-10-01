package com.unity3d.ads.core.data.repository;

import gf.c0;
import he.y;
import java.io.File;
import kf.r0;
import le.c;
import ne.e;
import ne.j;
import ve.l;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileInternal$2", f = "AndroidCacheRepository.kt", l = {70, 77, 89}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidCacheRepository$getFileInternal$2 extends j implements p {
    final /* synthetic */ File $cacheDirectory;
    final /* synthetic */ int $priority;
    final /* synthetic */ String $url;
    Object L$0;
    int label;
    final /* synthetic */ AndroidCacheRepository this$0;

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    @e(c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileInternal$2$1", f = "AndroidCacheRepository.kt", l = {79, 85}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileInternal$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends j implements l {
        final /* synthetic */ File $cacheDirectory;
        final /* synthetic */ r0 $fileResult;
        final /* synthetic */ String $filename;
        final /* synthetic */ int $priority;
        final /* synthetic */ String $url;
        int label;
        final /* synthetic */ AndroidCacheRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AndroidCacheRepository androidCacheRepository, File file, String str, String str2, int i6, r0 r0Var, c cVar) {
            super(1, cVar);
            this.this$0 = androidCacheRepository;
            this.$cacheDirectory = file;
            this.$filename = str;
            this.$url = str2;
            this.$priority = i6;
            this.$fileResult = r0Var;
        }

        @Override // ne.a
        public final c create(c cVar) {
            return new AnonymousClass1(this.this$0, this.$cacheDirectory, this.$filename, this.$url, this.$priority, this.$fileResult, cVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0072, code lost:
        
            if (r12 == r4) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0074, code lost:
        
            return r4;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x003d, code lost:
        
            if (r12 == r4) goto L21;
         */
        @Override // ne.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                int r0 = r11.label
                he.y r1 = he.y.f6101a
                r2 = 2
                r3 = 1
                me.a r4 = me.a.f8833x
                if (r0 == 0) goto L20
                if (r0 == r3) goto L1b
                if (r0 != r2) goto L13
                he.a.f(r12)
                r10 = r11
                goto L75
            L13:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1b:
                he.a.f(r12)
                r10 = r11
                goto L40
            L20:
                he.a.f(r12)
                com.unity3d.ads.core.data.repository.AndroidCacheRepository r12 = r11.this$0
                com.unity3d.ads.core.data.datasource.CacheDataSource r5 = com.unity3d.ads.core.data.repository.AndroidCacheRepository.access$getLocalCacheDataSource$p(r12)
                java.io.File r6 = r11.$cacheDirectory
                java.lang.String r7 = r11.$filename
                java.lang.String r8 = r11.$url
                int r12 = r11.$priority
                java.lang.Integer r9 = new java.lang.Integer
                r9.<init>(r12)
                r11.label = r3
                r10 = r11
                java.lang.Object r12 = r5.getFile(r6, r7, r8, r9, r10)
                if (r12 != r4) goto L40
                goto L74
            L40:
                com.unity3d.ads.core.data.model.CacheResult r12 = (com.unity3d.ads.core.data.model.CacheResult) r12
                boolean r0 = r12 instanceof com.unity3d.ads.core.data.model.CacheResult.Success
                if (r0 == 0) goto L59
                kf.r0 r0 = r10.$fileResult
            L48:
                r2 = r0
                kf.f1 r2 = (kf.f1) r2
                java.lang.Object r3 = r2.getValue()
                r4 = r3
                com.unity3d.ads.core.data.model.CacheResult r4 = (com.unity3d.ads.core.data.model.CacheResult) r4
                boolean r2 = r2.f(r3, r12)
                if (r2 == 0) goto L48
                return r1
            L59:
                com.unity3d.ads.core.data.repository.AndroidCacheRepository r12 = r10.this$0
                com.unity3d.ads.core.data.datasource.CacheDataSource r5 = com.unity3d.ads.core.data.repository.AndroidCacheRepository.access$getRemoteCacheDataSource$p(r12)
                java.io.File r6 = r10.$cacheDirectory
                java.lang.String r7 = r10.$filename
                java.lang.String r8 = r10.$url
                int r12 = r10.$priority
                java.lang.Integer r9 = new java.lang.Integer
                r9.<init>(r12)
                r10.label = r2
                java.lang.Object r12 = r5.getFile(r6, r7, r8, r9, r10)
                if (r12 != r4) goto L75
            L74:
                return r4
            L75:
                com.unity3d.ads.core.data.model.CacheResult r12 = (com.unity3d.ads.core.data.model.CacheResult) r12
                kf.r0 r0 = r10.$fileResult
            L79:
                r2 = r0
                kf.f1 r2 = (kf.f1) r2
                java.lang.Object r3 = r2.getValue()
                r4 = r3
                com.unity3d.ads.core.data.model.CacheResult r4 = (com.unity3d.ads.core.data.model.CacheResult) r4
                boolean r2 = r2.f(r3, r12)
                if (r2 == 0) goto L79
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileInternal$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // ve.l
        public final Object invoke(c cVar) {
            return ((AnonymousClass1) create(cVar)).invokeSuspend(y.f6101a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidCacheRepository$getFileInternal$2(AndroidCacheRepository androidCacheRepository, String str, File file, int i6, c cVar) {
        super(2, cVar);
        this.this$0 = androidCacheRepository;
        this.$url = str;
        this.$cacheDirectory = file;
        this.$priority = i6;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        return new AndroidCacheRepository$getFileInternal$2(this.this$0, this.$url, this.$cacheDirectory, this.$priority, cVar);
    }

    @Override // ve.p
    public final Object invoke(c0 c0Var, c cVar) {
        return ((AndroidCacheRepository$getFileInternal$2) create(c0Var, cVar)).invokeSuspend(y.f6101a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x009c A[RETURN] */
    @Override // ne.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r5 = r18
            int r0 = r5.label
            r6 = 0
            r7 = 3
            r8 = 2
            r1 = 1
            me.a r9 = me.a.f8833x
            if (r0 == 0) goto L31
            if (r0 == r1) goto L26
            if (r0 == r8) goto L1e
            if (r0 != r7) goto L16
            he.a.f(r19)
            return r19
        L16:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L1e:
            java.lang.Object r0 = r5.L$0
            kf.r0 r0 = (kf.r0) r0
            he.a.f(r19)
            goto L8a
        L26:
            java.lang.Object r0 = r5.L$0
            java.lang.String r0 = (java.lang.String) r0
            he.a.f(r19)
            r13 = r0
            r0 = r19
            goto L5c
        L31:
            he.a.f(r19)
            com.unity3d.ads.core.data.repository.AndroidCacheRepository r0 = r5.this$0
            java.lang.String r2 = r5.$url
            java.lang.String r2 = r0.getFilename(r2)
            com.unity3d.ads.core.data.repository.AndroidCacheRepository r0 = r5.this$0
            com.unity3d.ads.core.data.datasource.CacheDataSource r0 = com.unity3d.ads.core.data.repository.AndroidCacheRepository.access$getLocalCacheDataSource$p(r0)
            java.io.File r3 = r5.$cacheDirectory
            r4 = r3
            java.lang.String r3 = r5.$url
            int r10 = r5.$priority
            r11 = r4
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r10)
            r5.L$0 = r2
            r5.label = r1
            r1 = r11
            java.lang.Object r0 = r0.getFile(r1, r2, r3, r4, r5)
            if (r0 != r9) goto L5b
            goto L9b
        L5b:
            r13 = r2
        L5c:
            com.unity3d.ads.core.data.model.CacheResult r0 = (com.unity3d.ads.core.data.model.CacheResult) r0
            boolean r1 = r0 instanceof com.unity3d.ads.core.data.model.CacheResult.Success
            if (r1 == 0) goto L63
            return r0
        L63:
            kf.f1 r16 = kf.y0.c(r6)
            com.unity3d.ads.core.data.repository.AndroidCacheRepository r0 = r5.this$0
            com.unity3d.ads.core.domain.work.DownloadPriorityQueue r0 = com.unity3d.ads.core.data.repository.AndroidCacheRepository.access$getDownloadPriorityQueue$p(r0)
            int r15 = r5.$priority
            com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileInternal$2$1 r10 = new com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileInternal$2$1
            com.unity3d.ads.core.data.repository.AndroidCacheRepository r11 = r5.this$0
            java.io.File r12 = r5.$cacheDirectory
            java.lang.String r14 = r5.$url
            r17 = 0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            r1 = r16
            r5.L$0 = r1
            r5.label = r8
            java.lang.Object r0 = r0.invoke(r15, r10, r5)
            if (r0 != r9) goto L89
            goto L9b
        L89:
            r0 = r1
        L8a:
            k7.d r1 = new k7.d
            r2 = 15
            r1.<init>(r0, r2)
            r5.L$0 = r6
            r5.label = r7
            java.lang.Object r0 = kf.y0.l(r1, r5)
            if (r0 != r9) goto L9c
        L9b:
            return r9
        L9c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileInternal$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
