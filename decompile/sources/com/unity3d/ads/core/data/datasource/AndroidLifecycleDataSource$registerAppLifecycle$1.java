package com.unity3d.ads.core.data.datasource;

import androidx.lifecycle.v0;
import gf.c0;
import he.a;
import he.y;
import le.c;
import ne.e;
import ne.j;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.core.data.datasource.AndroidLifecycleDataSource$registerAppLifecycle$1", f = "AndroidLifecycleDataSource.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidLifecycleDataSource$registerAppLifecycle$1 extends j implements p {
    int label;
    final /* synthetic */ AndroidLifecycleDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidLifecycleDataSource$registerAppLifecycle$1(AndroidLifecycleDataSource androidLifecycleDataSource, c cVar) {
        super(2, cVar);
        this.this$0 = androidLifecycleDataSource;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        return new AndroidLifecycleDataSource$registerAppLifecycle$1(this.this$0, cVar);
    }

    @Override // ve.p
    public final Object invoke(c0 c0Var, c cVar) {
        return ((AndroidLifecycleDataSource$registerAppLifecycle$1) create(c0Var, cVar)).invokeSuspend(y.f6101a);
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            a.f(obj);
            v0 v0Var = v0.F;
            v0.F.C.a(this.this$0);
            return y.f6101a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
