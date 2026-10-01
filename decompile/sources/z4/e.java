package z4;

import java.io.Serializable;
import kotlin.jvm.internal.w;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e extends ne.c {
    public w A;
    public le.h B;
    public w C;
    public boolean D;
    public /* synthetic */ Object E;
    public final /* synthetic */ f F;
    public int G;

    /* renamed from: x, reason: collision with root package name */
    public Object f15170x;

    /* renamed from: y, reason: collision with root package name */
    public Serializable f15171y;

    /* renamed from: z, reason: collision with root package name */
    public k f15172z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, ne.c cVar) {
        super(cVar);
        this.F = fVar;
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.V(false, null, this);
    }
}
