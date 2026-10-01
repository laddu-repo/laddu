package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.domain.task.InitializeStateLoadWeb;
import gf.c0;
import he.a;
import he.k;
import he.y;
import le.c;
import ne.e;
import ne.j;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.services.core.domain.task.InitializeSDK$doWork$2$1$webViewData$1", f = "InitializeSDK.kt", l = {84}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class InitializeSDK$doWork$2$1$webViewData$1 extends j implements p {
    final /* synthetic */ Object $configResult;
    int label;
    final /* synthetic */ InitializeSDK this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeSDK$doWork$2$1$webViewData$1(InitializeSDK initializeSDK, Object obj, c cVar) {
        super(2, cVar);
        this.this$0 = initializeSDK;
        this.$configResult = obj;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        return new InitializeSDK$doWork$2$1$webViewData$1(this.this$0, this.$configResult, cVar);
    }

    @Override // ve.p
    public final Object invoke(c0 c0Var, c cVar) {
        return ((InitializeSDK$doWork$2$1$webViewData$1) create(c0Var, cVar)).invokeSuspend(y.f6101a);
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        InitializeStateLoadWeb initializeStateLoadWeb;
        int i6 = this.label;
        if (i6 != 0) {
            if (i6 == 1) {
                a.f(obj);
                ((k) obj).getClass();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            a.f(obj);
            initializeStateLoadWeb = this.this$0.initializeStateLoadWeb;
            Object obj2 = this.$configResult;
            a.f(obj2);
            InitializeStateLoadWeb.Params params = new InitializeStateLoadWeb.Params((Configuration) obj2);
            this.label = 1;
            Object mo71invokegIAlus = initializeStateLoadWeb.mo71invokegIAlus(params, this);
            me.a aVar = me.a.f8833x;
            if (mo71invokegIAlus == aVar) {
                return aVar;
            }
        }
        return y.f6101a;
    }
}
