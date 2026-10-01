package yf;

import j2.y;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class q extends ne.c {
    public String A;
    public int B;
    public /* synthetic */ Object C;
    public final /* synthetic */ y D;
    public int E;

    /* renamed from: x, reason: collision with root package name */
    public he.b f15081x;

    /* renamed from: y, reason: collision with root package name */
    public y f15082y;

    /* renamed from: z, reason: collision with root package name */
    public LinkedHashMap f15083z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(y yVar, ne.a aVar) {
        super(aVar);
        this.D = yVar;
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return y.d(this.D, null, this);
    }
}
