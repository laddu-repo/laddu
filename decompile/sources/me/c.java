package me;

import kotlin.jvm.internal.z;
import le.h;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c extends ne.c {

    /* renamed from: x, reason: collision with root package name */
    public int f8839x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ p f8840y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ le.c f8841z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(le.c cVar, h hVar, p pVar, le.c cVar2) {
        super(cVar, hVar);
        this.f8840y = pVar;
        this.f8841z = cVar2;
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        int i6 = this.f8839x;
        if (i6 != 0) {
            if (i6 == 1) {
                this.f8839x = 2;
                he.a.f(obj);
                return obj;
            }
            throw new IllegalStateException("This coroutine had already completed");
        }
        this.f8839x = 1;
        he.a.f(obj);
        p pVar = this.f8840y;
        z.c(2, pVar);
        return pVar.invoke(this.f8841z, this);
    }
}
