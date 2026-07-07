package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.CacheRepository;
import gf.c0;
import he.y;
import le.c;
import ne.e;
import ne.j;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.core.domain.GetCachedAsset$getCachedAsset$result$1", f = "GetCachedAsset.kt", l = {55}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class GetCachedAsset$getCachedAsset$result$1 extends j implements p {
    final /* synthetic */ String $fileName;
    int label;
    final /* synthetic */ GetCachedAsset this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCachedAsset$getCachedAsset$result$1(GetCachedAsset getCachedAsset, String str, c cVar) {
        super(2, cVar);
        this.this$0 = getCachedAsset;
        this.$fileName = str;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        return new GetCachedAsset$getCachedAsset$result$1(this.this$0, this.$fileName, cVar);
    }

    @Override // ve.p
    public final Object invoke(c0 c0Var, c cVar) {
        return ((GetCachedAsset$getCachedAsset$result$1) create(c0Var, cVar)).invokeSuspend(y.f6101a);
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        CacheRepository cacheRepository;
        int i6 = this.label;
        if (i6 != 0) {
            if (i6 == 1) {
                he.a.f(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        he.a.f(obj);
        cacheRepository = this.this$0.cacheRepository;
        String str = this.$fileName;
        this.label = 1;
        Object retrieveFile = cacheRepository.retrieveFile(str, this);
        me.a aVar = me.a.f8833x;
        if (retrieveFile == aVar) {
            return aVar;
        }
        return retrieveFile;
    }
}
