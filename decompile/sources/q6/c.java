package q6;

import kotlin.jvm.internal.w;
import v6.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c extends ne.c {
    public Object A;
    public w B;
    public w C;
    public w D;
    public w E;
    public /* synthetic */ Object F;
    public final /* synthetic */ h G;
    public int H;

    /* renamed from: x, reason: collision with root package name */
    public h f11105x;

    /* renamed from: y, reason: collision with root package name */
    public k f11106y;

    /* renamed from: z, reason: collision with root package name */
    public Object f11107z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(h hVar, ne.c cVar) {
        super(cVar);
        this.G = hVar;
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return h.b(this.G, null, null, null, null, this);
    }
}
