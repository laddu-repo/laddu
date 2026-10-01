package q6;

import v6.k;
import v6.o;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e extends ne.c {
    public Object A;
    public o B;
    public l6.c C;
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ h F;
    public int G;

    /* renamed from: x, reason: collision with root package name */
    public h f11111x;

    /* renamed from: y, reason: collision with root package name */
    public l6.b f11112y;

    /* renamed from: z, reason: collision with root package name */
    public k f11113z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, ne.c cVar) {
        super(cVar);
        this.F = hVar;
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.c(null, null, null, null, null, this);
    }
}
