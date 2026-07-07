package com.unity3d.ads.core.data.datasource;

import gf.c0;
import he.y;
import java.io.File;
import le.c;
import ne.e;
import ne.j;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource$getFile$2", f = "AndroidRemoteCacheDataSource.kt", l = {51, 52}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidRemoteCacheDataSource$getFile$2 extends j implements p {
    final /* synthetic */ File $cachePath;
    final /* synthetic */ String $fileName;
    final /* synthetic */ Integer $priority;
    final /* synthetic */ String $url;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ AndroidRemoteCacheDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidRemoteCacheDataSource$getFile$2(String str, AndroidRemoteCacheDataSource androidRemoteCacheDataSource, File file, String str2, Integer num, c cVar) {
        super(2, cVar);
        this.$url = str;
        this.this$0 = androidRemoteCacheDataSource;
        this.$cachePath = file;
        this.$fileName = str2;
        this.$priority = num;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        AndroidRemoteCacheDataSource$getFile$2 androidRemoteCacheDataSource$getFile$2 = new AndroidRemoteCacheDataSource$getFile$2(this.$url, this.this$0, this.$cachePath, this.$fileName, this.$priority, cVar);
        androidRemoteCacheDataSource$getFile$2.L$0 = obj;
        return androidRemoteCacheDataSource$getFile$2;
    }

    @Override // ve.p
    public final Object invoke(c0 c0Var, c cVar) {
        return ((AndroidRemoteCacheDataSource$getFile$2) create(c0Var, cVar)).invokeSuspend(y.f6101a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x017b  */
    /* JADX WARN: Type inference failed for: r13v24, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r13v32 */
    /* JADX WARN: Type inference failed for: r13v33 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // ne.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r39) {
        /*
            Method dump skipped, instructions count: 866
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource$getFile$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
