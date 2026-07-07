package o4;

import he.y;
import kotlin.jvm.internal.s;
import ve.l;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements l {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ ie.h B;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ s f9891x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ s f9892y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ h f9893z;

    public /* synthetic */ e(s sVar, s sVar2, h hVar, boolean z10, ie.h hVar2) {
        this.f9891x = sVar;
        this.f9892y = sVar2;
        this.f9893z = hVar;
        this.A = z10;
        this.B = hVar2;
    }

    @Override // ve.l
    public final Object invoke(Object obj) {
        l4.h entry = (l4.h) obj;
        kotlin.jvm.internal.k.e(entry, "entry");
        this.f9891x.f8051x = true;
        this.f9892y.f8051x = true;
        this.f9893z.n(entry, this.A, this.B);
        return y.f6101a;
    }
}
