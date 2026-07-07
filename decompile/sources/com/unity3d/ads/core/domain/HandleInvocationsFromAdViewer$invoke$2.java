package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.adplayer.Invocation;
import he.y;
import java.util.Map;
import le.c;
import ne.e;
import ne.j;
import ve.l;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$2", f = "HandleInvocationsFromAdViewer.kt", l = {188}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class HandleInvocationsFromAdViewer$invoke$2 extends j implements p {
    final /* synthetic */ Map<String, ve.a> $definition;
    /* synthetic */ Object L$0;
    int label;

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    @e(c = "com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$2$1", f = "HandleInvocationsFromAdViewer.kt", l = {188}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends j implements l {
        final /* synthetic */ ExposedFunction $exposedFunction;
        final /* synthetic */ Invocation $it;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ExposedFunction exposedFunction, Invocation invocation, c cVar) {
            super(1, cVar);
            this.$exposedFunction = exposedFunction;
            this.$it = invocation;
        }

        @Override // ne.a
        public final c create(c cVar) {
            return new AnonymousClass1(this.$exposedFunction, this.$it, cVar);
        }

        @Override // ne.a
        public final Object invokeSuspend(Object obj) {
            int i6 = this.label;
            if (i6 != 0) {
                if (i6 == 1) {
                    he.a.f(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            he.a.f(obj);
            ExposedFunction exposedFunction = this.$exposedFunction;
            Object[] parameters = this.$it.getParameters();
            this.label = 1;
            Object invoke = exposedFunction.invoke(parameters, this);
            me.a aVar = me.a.f8833x;
            if (invoke == aVar) {
                return aVar;
            }
            return invoke;
        }

        @Override // ve.l
        public final Object invoke(c cVar) {
            return ((AnonymousClass1) create(cVar)).invokeSuspend(y.f6101a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HandleInvocationsFromAdViewer$invoke$2(Map<String, ? extends ve.a> map, c cVar) {
        super(2, cVar);
        this.$definition = map;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        HandleInvocationsFromAdViewer$invoke$2 handleInvocationsFromAdViewer$invoke$2 = new HandleInvocationsFromAdViewer$invoke$2(this.$definition, cVar);
        handleInvocationsFromAdViewer$invoke$2.L$0 = obj;
        return handleInvocationsFromAdViewer$invoke$2;
    }

    @Override // ve.p
    public final Object invoke(Invocation invocation, c cVar) {
        return ((HandleInvocationsFromAdViewer$invoke$2) create(invocation, cVar)).invokeSuspend(y.f6101a);
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        ExposedFunction exposedFunction;
        int i6 = this.label;
        y yVar = y.f6101a;
        if (i6 != 0) {
            if (i6 == 1) {
                he.a.f(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            he.a.f(obj);
            Invocation invocation = (Invocation) this.L$0;
            ve.a aVar = this.$definition.get(invocation.getLocation());
            if (aVar != null && (exposedFunction = (ExposedFunction) aVar.invoke()) != null) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(exposedFunction, invocation, null);
                this.label = 1;
                Object handle = invocation.handle(anonymousClass1, this);
                me.a aVar2 = me.a.f8833x;
                if (handle == aVar2) {
                    return aVar2;
                }
            }
        }
        return yVar;
    }
}
