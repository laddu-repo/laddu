package g3;

import d2.i;
import y2.a0;
import y2.t;
import y2.y;
import y2.z;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d extends t {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f5416b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f5417c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(i iVar, z zVar, z zVar2) {
        super(zVar);
        this.f5417c = iVar;
        this.f5416b = zVar2;
    }

    @Override // y2.t, y2.z
    public final y j(long j) {
        y j10 = this.f5416b.j(j);
        a0 a0Var = j10.f14970a;
        long j11 = a0Var.f14850a;
        long j12 = a0Var.f14851b;
        long j13 = this.f5417c.f3732y;
        a0 a0Var2 = new a0(j11, j12 + j13);
        a0 a0Var3 = j10.f14971b;
        return new y(a0Var2, new a0(a0Var3.f14850a, a0Var3.f14851b + j13));
    }
}
