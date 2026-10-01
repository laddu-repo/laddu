package com.unity3d.services.core.extensions;

import gf.c0;
import he.a;
import he.y;
import le.c;
import ne.e;
import ne.j;
import ve.l;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.services.core.extensions.CoroutineExtensionsKt$memoize$2$deferred$1$1$1", f = "CoroutineExtensions.kt", l = {41}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class CoroutineExtensionsKt$memoize$2$deferred$1$1$1 extends j implements p {
    final /* synthetic */ l $action;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineExtensionsKt$memoize$2$deferred$1$1$1(l lVar, c cVar) {
        super(2, cVar);
        this.$action = lVar;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        return new CoroutineExtensionsKt$memoize$2$deferred$1$1$1(this.$action, cVar);
    }

    @Override // ve.p
    public final Object invoke(c0 c0Var, c cVar) {
        return ((CoroutineExtensionsKt$memoize$2$deferred$1$1$1) create(c0Var, cVar)).invokeSuspend(y.f6101a);
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        int i6 = this.label;
        if (i6 != 0) {
            if (i6 == 1) {
                a.f(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        a.f(obj);
        l lVar = this.$action;
        this.label = 1;
        Object invoke = lVar.invoke(this);
        me.a aVar = me.a.f8833x;
        if (invoke == aVar) {
            return aVar;
        }
        return invoke;
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        return this.$action.invoke(this);
    }
}
