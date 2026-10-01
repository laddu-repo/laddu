package q2;

import java.io.IOException;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class g0 implements u1.g {
    public final /* synthetic */ IOException A;
    public final /* synthetic */ boolean B;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ b2.k f10881x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ u f10882y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ n2.g f10883z;

    public /* synthetic */ g0(b2.k kVar, u uVar, n2.g gVar, IOException iOException, boolean z10) {
        this.f10881x = kVar;
        this.f10882y = uVar;
        this.f10883z = gVar;
        this.A = iOException;
        this.B = z10;
    }

    @Override // u1.g
    public final void accept(Object obj) {
        i0 i0Var = (i0) obj;
        b2.k kVar = this.f10881x;
        i0Var.j(kVar.f1383y, (c0) kVar.f1384z, this.f10882y, this.f10883z, this.A, this.B);
    }
}
