package b1;

import java.io.Serializable;
import java.util.Iterator;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class x extends ne.c {
    public Object A;
    public z B;
    public Iterator C;
    public /* synthetic */ Object D;
    public final /* synthetic */ g0 E;
    public int F;

    /* renamed from: x, reason: collision with root package name */
    public g0 f1334x;

    /* renamed from: y, reason: collision with root package name */
    public Object f1335y;

    /* renamed from: z, reason: collision with root package name */
    public Serializable f1336z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(g0 g0Var, ne.c cVar) {
        super(cVar);
        this.E = g0Var;
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return this.E.c(this);
    }
}
