package com.unity3d.services.core.extensions;

import gf.c0;
import gf.f0;
import gf.i0;
import he.y;
import java.util.LinkedHashMap;
import le.c;
import ne.e;
import ne.j;
import qf.a;
import ve.l;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.services.core.extensions.CoroutineExtensionsKt$memoize$2", f = "CoroutineExtensions.kt", l = {53, 45}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class CoroutineExtensionsKt$memoize$2 extends j implements p {
    final /* synthetic */ l $action;
    final /* synthetic */ Object $key;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineExtensionsKt$memoize$2(Object obj, l lVar, c cVar) {
        super(2, cVar);
        this.$key = obj;
        this.$action = lVar;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        CoroutineExtensionsKt$memoize$2 coroutineExtensionsKt$memoize$2 = new CoroutineExtensionsKt$memoize$2(this.$key, this.$action, cVar);
        coroutineExtensionsKt$memoize$2.L$0 = obj;
        return coroutineExtensionsKt$memoize$2;
    }

    @Override // ve.p
    public final Object invoke(c0 c0Var, c cVar) {
        return ((CoroutineExtensionsKt$memoize$2) create(c0Var, cVar)).invokeSuspend(y.f6101a);
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        c0 c0Var;
        a mutex;
        l lVar;
        Object obj2;
        int i6 = this.label;
        me.a aVar = me.a.f8833x;
        try {
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 == 2) {
                        he.a.f(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                lVar = (l) this.L$3;
                obj2 = this.L$2;
                mutex = (a) this.L$1;
                c0Var = (c0) this.L$0;
                he.a.f(obj);
            } else {
                he.a.f(obj);
                c0Var = (c0) this.L$0;
                mutex = CoroutineExtensionsKt.getMutex();
                Object obj3 = this.$key;
                lVar = this.$action;
                this.L$0 = c0Var;
                this.L$1 = mutex;
                this.L$2 = obj3;
                this.L$3 = lVar;
                this.label = 1;
                if (mutex.d(this) != aVar) {
                    obj2 = obj3;
                }
                return aVar;
            }
            LinkedHashMap<Object, i0> deferreds = CoroutineExtensionsKt.getDeferreds();
            i0 i0Var = deferreds.get(obj2);
            if (i0Var == null) {
                i0Var = f0.g(c0Var, null, new CoroutineExtensionsKt$memoize$2$deferred$1$1$1(lVar, null), 3);
                deferreds.put(obj2, i0Var);
            }
            i0 i0Var2 = i0Var;
            mutex.f(null);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 2;
            Object a02 = i0Var2.a0(this);
            if (a02 == aVar) {
                return aVar;
            }
            return a02;
        } catch (Throwable th) {
            mutex.f(null);
            throw th;
        }
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        c0 c0Var = (c0) this.L$0;
        a mutex = CoroutineExtensionsKt.getMutex();
        Object obj2 = this.$key;
        l lVar = this.$action;
        mutex.d(this);
        try {
            LinkedHashMap<Object, i0> deferreds = CoroutineExtensionsKt.getDeferreds();
            i0 i0Var = deferreds.get(obj2);
            if (i0Var == null) {
                i0Var = f0.g(c0Var, null, new CoroutineExtensionsKt$memoize$2$deferred$1$1$1(lVar, null), 3);
                deferreds.put(obj2, i0Var);
            }
            i0 i0Var2 = i0Var;
            mutex.f(null);
            return i0Var2.a0(this);
        } catch (Throwable th) {
            mutex.f(null);
            throw th;
        }
    }
}
