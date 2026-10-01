package lf;

import gf.f0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class v extends ne.c implements kf.i {
    public le.h A;
    public le.c B;

    /* renamed from: x, reason: collision with root package name */
    public final kf.i f8394x;

    /* renamed from: y, reason: collision with root package name */
    public final le.h f8395y;

    /* renamed from: z, reason: collision with root package name */
    public final int f8396z;

    public v(kf.i iVar, le.h hVar) {
        super(s.f8391x, le.i.f8353x);
        this.f8394x = iVar;
        this.f8395y = hVar;
        this.f8396z = ((Number) hVar.fold(0, u.f8393x)).intValue();
    }

    public final Object b(le.c cVar, Object obj) {
        le.h context = cVar.getContext();
        f0.l(context);
        le.h hVar = this.A;
        if (hVar != context) {
            if (!(hVar instanceof q)) {
                if (((Number) context.fold(0, new y(this))).intValue() == this.f8396z) {
                    this.A = context;
                } else {
                    throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f8395y + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
                }
            } else {
                throw new IllegalStateException(df.n.s("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((q) hVar).f8389x + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
        }
        this.B = cVar;
        ve.q qVar = x.f8398a;
        kf.i iVar = this.f8394x;
        kotlin.jvm.internal.k.c(iVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Object invoke = qVar.invoke(iVar, obj, this);
        if (!kotlin.jvm.internal.k.a(invoke, me.a.f8833x)) {
            this.B = null;
        }
        return invoke;
    }

    @Override // kf.i
    public final Object emit(Object obj, le.c cVar) {
        try {
            Object b10 = b(cVar, obj);
            if (b10 == me.a.f8833x) {
                return b10;
            }
            return he.y.f6101a;
        } catch (Throwable th) {
            this.A = new q(cVar.getContext(), th);
            throw th;
        }
    }

    @Override // ne.a, ne.d
    public final ne.d getCallerFrame() {
        le.c cVar = this.B;
        if (cVar instanceof ne.d) {
            return (ne.d) cVar;
        }
        return null;
    }

    @Override // ne.c, le.c
    public final le.h getContext() {
        le.h hVar = this.A;
        if (hVar == null) {
            return le.i.f8353x;
        }
        return hVar;
    }

    @Override // ne.a
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        Throwable a10 = he.k.a(obj);
        if (a10 != null) {
            this.A = new q(getContext(), a10);
        }
        le.c cVar = this.B;
        if (cVar != null) {
            cVar.resumeWith(obj);
        }
        return me.a.f8833x;
    }
}
