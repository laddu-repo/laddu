package me;

import kotlin.jvm.internal.z;
import ne.h;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b extends h {

    /* renamed from: x, reason: collision with root package name */
    public int f8836x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ p f8837y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ le.c f8838z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(le.c cVar, le.c cVar2, p pVar) {
        super(cVar);
        this.f8837y = pVar;
        this.f8838z = cVar2;
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        int i6 = this.f8836x;
        if (i6 != 0) {
            if (i6 == 1) {
                this.f8836x = 2;
                he.a.f(obj);
                return obj;
            }
            throw new IllegalStateException("This coroutine had already completed");
        }
        this.f8836x = 1;
        he.a.f(obj);
        p pVar = this.f8837y;
        z.c(2, pVar);
        return pVar.invoke(this.f8838z, this);
    }
}
