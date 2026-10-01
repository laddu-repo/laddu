package com.unity3d.ads.core.data.datasource;

import com.google.protobuf.ByteString;
import com.unity3d.ads.datastore.UniversalRequestStoreOuterClass;
import he.a;
import he.y;
import kotlin.jvm.internal.k;
import le.c;
import ne.e;
import ne.j;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.core.data.datasource.UniversalRequestDataSource$set$2", f = "UniversalRequestDataSource.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class UniversalRequestDataSource$set$2 extends j implements p {
    final /* synthetic */ ByteString $data;
    final /* synthetic */ String $key;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UniversalRequestDataSource$set$2(String str, ByteString byteString, c cVar) {
        super(2, cVar);
        this.$key = str;
        this.$data = byteString;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        UniversalRequestDataSource$set$2 universalRequestDataSource$set$2 = new UniversalRequestDataSource$set$2(this.$key, this.$data, cVar);
        universalRequestDataSource$set$2.L$0 = obj;
        return universalRequestDataSource$set$2;
    }

    @Override // ve.p
    public final Object invoke(UniversalRequestStoreOuterClass.UniversalRequestStore universalRequestStore, c cVar) {
        return ((UniversalRequestDataSource$set$2) create(universalRequestStore, cVar)).invokeSuspend(y.f6101a);
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            a.f(obj);
            UniversalRequestStoreOuterClass.UniversalRequestStore.Builder builder = ((UniversalRequestStoreOuterClass.UniversalRequestStore) this.L$0).toBuilder();
            builder.putUniversalRequestMap(this.$key, this.$data);
            UniversalRequestStoreOuterClass.UniversalRequestStore build = builder.build();
            k.d(build, "dataBuilder.build()");
            return build;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
