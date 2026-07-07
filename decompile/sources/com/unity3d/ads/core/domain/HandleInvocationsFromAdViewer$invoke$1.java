package com.unity3d.ads.core.domain;

import he.y;
import kf.i;
import le.c;
import ne.e;
import ne.j;
import ve.l;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$1", f = "HandleInvocationsFromAdViewer.kt", l = {184}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class HandleInvocationsFromAdViewer$invoke$1 extends j implements p {
    final /* synthetic */ l $onSubscription;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandleInvocationsFromAdViewer$invoke$1(l lVar, c cVar) {
        super(2, cVar);
        this.$onSubscription = lVar;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        return new HandleInvocationsFromAdViewer$invoke$1(this.$onSubscription, cVar);
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        int i6 = this.label;
        if (i6 != 0) {
            if (i6 == 1) {
                he.a.f(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            he.a.f(obj);
            l lVar = this.$onSubscription;
            this.label = 1;
            Object invoke = lVar.invoke(this);
            me.a aVar = me.a.f8833x;
            if (invoke == aVar) {
                return aVar;
            }
        }
        return y.f6101a;
    }

    @Override // ve.p
    public final Object invoke(i iVar, c cVar) {
        return ((HandleInvocationsFromAdViewer$invoke$1) create(iVar, cVar)).invokeSuspend(y.f6101a);
    }
}
