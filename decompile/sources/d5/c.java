package d5;

import he.y;
import ne.j;
import ve.l;
import ve.p;
import x4.f0;
import x4.g0;
import x4.w;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c extends j implements p {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ w C;
    public final /* synthetic */ l D;

    /* renamed from: x, reason: collision with root package name */
    public f0 f3795x;

    /* renamed from: y, reason: collision with root package name */
    public int f3796y;

    /* renamed from: z, reason: collision with root package name */
    public /* synthetic */ Object f3797z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(le.c cVar, l lVar, w wVar, boolean z10, boolean z11) {
        super(2, cVar);
        this.A = z10;
        this.B = z11;
        this.C = wVar;
        this.D = lVar;
    }

    @Override // ne.a
    public final le.c create(Object obj, le.c cVar) {
        c cVar2 = new c(cVar, this.D, this.C, this.A, this.B);
        cVar2.f3797z = obj;
        return cVar2;
    }

    @Override // ve.p
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((g0) obj, (le.c) obj2)).invokeSuspend(y.f6101a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b2, code lost:
    
        if (r12 != r8) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00cd  */
    @Override // ne.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d5.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
