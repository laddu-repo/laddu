package com.unity3d.ads.core.domain;

import ne.c;
import ne.e;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.core.domain.CommonCacheFile", f = "CommonCacheFile.kt", l = {26}, m = "invoke")
/* loaded from: classes.dex */
public final class CommonCacheFile$invoke$1 extends c {
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CommonCacheFile this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonCacheFile$invoke$1(CommonCacheFile commonCacheFile, le.c cVar) {
        super(cVar);
        this.this$0 = commonCacheFile;
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(null, null, null, 0, this);
    }
}
