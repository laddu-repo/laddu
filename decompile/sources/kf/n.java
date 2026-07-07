package kf;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class n extends ne.j implements ve.p {
    public Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f7986x;

    /* renamed from: y, reason: collision with root package name */
    public int f7987y;

    /* renamed from: z, reason: collision with root package name */
    public /* synthetic */ Object f7988z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(Object obj, Object obj2, Object obj3, le.c cVar, int i6) {
        super(2, cVar);
        this.f7986x = i6;
        this.B = obj;
        this.f7988z = obj2;
        this.C = obj3;
    }

    /* JADX WARN: Type inference failed for: r12v4, types: [kf.q0, lf.b] */
    /* JADX WARN: Type inference failed for: r1v3, types: [kf.q0, lf.b] */
    @Override // ne.a
    public final le.c create(Object obj, le.c cVar) {
        switch (this.f7986x) {
            case 0:
                n nVar = new n((i) this.C, (kotlin.jvm.internal.w) this.B, cVar);
                nVar.f7988z = obj;
                return nVar;
            case 1:
                n nVar2 = new n((h) this.A, (q0) this.B, this.C, cVar);
                nVar2.f7988z = obj;
                return nVar2;
            case 2:
                return new n((j) this.A, (h) this.B, (q0) this.C, this.f7988z, cVar);
            case 3:
                return new n((String) this.B, (List) this.f7988z, (od.j) this.C, cVar, 3);
            case 4:
                return new n((InputStream) this.B, (od.i0) this.f7988z, (Map) this.C, cVar, 4);
            default:
                n nVar3 = new n((x4.p0) this.A, (int[]) this.B, (String[]) this.C, cVar);
                nVar3.f7988z = obj;
                return nVar3;
        }
    }

    @Override // ve.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7986x) {
            case 0:
                return ((n) create(new jf.o(((jf.o) obj).f7476a), (le.c) obj2)).invokeSuspend(he.y.f6101a);
            case 1:
                return ((n) create((a1) obj, (le.c) obj2)).invokeSuspend(he.y.f6101a);
            case 2:
                return ((n) create((gf.c0) obj, (le.c) obj2)).invokeSuspend(he.y.f6101a);
            case 3:
                return ((n) create((gf.c0) obj, (le.c) obj2)).invokeSuspend(he.y.f6101a);
            case 4:
                return ((n) create((gf.c0) obj, (le.c) obj2)).invokeSuspend(he.y.f6101a);
            default:
                ((n) create((i) obj, (le.c) obj2)).invokeSuspend(he.y.f6101a);
                return me.a.f8833x;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x01b6, code lost:
    
        if (kf.y0.m(r0, r5, r19) == r9) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0076, code lost:
    
        if (gf.f0.J((le.h) r5, r8, r19) == r9) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0063, code lost:
    
        if (r5 == r9) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [kf.q0, kf.i, lf.b] */
    /* JADX WARN: Type inference failed for: r4v20, types: [java.lang.Object, kotlin.jvm.internal.w] */
    /* JADX WARN: Type inference failed for: r5v2, types: [ne.j, ve.p] */
    /* JADX WARN: Type inference failed for: r7v2, types: [kf.q0, kf.i, lf.b] */
    @Override // ne.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 702
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n(h hVar, q0 q0Var, Object obj, le.c cVar) {
        super(2, cVar);
        this.f7986x = 1;
        this.A = hVar;
        this.B = (lf.b) q0Var;
        this.C = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(i iVar, kotlin.jvm.internal.w wVar, le.c cVar) {
        super(2, cVar);
        this.f7986x = 0;
        this.B = wVar;
        this.C = iVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n(j jVar, h hVar, q0 q0Var, Object obj, le.c cVar) {
        super(2, cVar);
        this.f7986x = 2;
        this.A = jVar;
        this.B = hVar;
        this.C = (lf.b) q0Var;
        this.f7988z = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(x4.p0 p0Var, int[] iArr, String[] strArr, le.c cVar) {
        super(2, cVar);
        this.f7986x = 5;
        this.A = p0Var;
        this.B = iArr;
        this.C = strArr;
    }
}
