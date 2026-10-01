package com.unity3d.ads.core.data.repository;

import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gf.c0;
import he.a;
import he.y;
import java.util.List;
import kf.q0;
import le.c;
import ne.e;
import ne.j;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository$flush$2", f = "AndroidDiagnosticEventRepository.kt", l = {70}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidDiagnosticEventRepository$flush$2 extends j implements p {
    final /* synthetic */ List<DiagnosticEventRequestOuterClass.DiagnosticEvent> $events;
    int label;
    final /* synthetic */ AndroidDiagnosticEventRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidDiagnosticEventRepository$flush$2(AndroidDiagnosticEventRepository androidDiagnosticEventRepository, List<DiagnosticEventRequestOuterClass.DiagnosticEvent> list, c cVar) {
        super(2, cVar);
        this.this$0 = androidDiagnosticEventRepository;
        this.$events = list;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        return new AndroidDiagnosticEventRepository$flush$2(this.this$0, this.$events, cVar);
    }

    @Override // ve.p
    public final Object invoke(c0 c0Var, c cVar) {
        return ((AndroidDiagnosticEventRepository$flush$2) create(c0Var, cVar)).invokeSuspend(y.f6101a);
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        q0 q0Var;
        int i6 = this.label;
        if (i6 != 0) {
            if (i6 == 1) {
                a.f(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            a.f(obj);
            q0Var = this.this$0._diagnosticEvents;
            List<DiagnosticEventRequestOuterClass.DiagnosticEvent> list = this.$events;
            this.label = 1;
            Object emit = q0Var.emit(list, this);
            me.a aVar = me.a.f8833x;
            if (emit == aVar) {
                return aVar;
            }
        }
        return y.f6101a;
    }
}
