package com.unity3d.services.core.domain.task;

import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import he.a;
import he.y;
import kotlin.jvm.internal.k;
import le.c;
import ne.e;
import ne.j;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.services.core.domain.task.InitializeStateComplete$doWork$2$1$1", f = "InitializeStateComplete.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class InitializeStateComplete$doWork$2$1$1 extends j implements p {
    /* synthetic */ Object L$0;
    int label;

    public InitializeStateComplete$doWork$2$1$1(c cVar) {
        super(2, cVar);
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        InitializeStateComplete$doWork$2$1$1 initializeStateComplete$doWork$2$1$1 = new InitializeStateComplete$doWork$2$1$1(cVar);
        initializeStateComplete$doWork$2$1$1.L$0 = obj;
        return initializeStateComplete$doWork$2$1$1;
    }

    @Override // ve.p
    public final Object invoke(ByteStringStoreOuterClass.ByteStringStore byteStringStore, c cVar) {
        return ((InitializeStateComplete$doWork$2$1$1) create(byteStringStore, cVar)).invokeSuspend(y.f6101a);
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            a.f(obj);
            ByteStringStoreOuterClass.ByteStringStore build = ((ByteStringStoreOuterClass.ByteStringStore) this.L$0).toBuilder().clear().build();
            k.d(build, "it.toBuilder().clear().build()");
            return build;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
