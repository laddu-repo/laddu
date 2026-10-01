package lf;

import gf.c0;
import kf.f0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class p extends ne.j implements ve.p {
    public int A;
    public int B;
    public /* synthetic */ Object C;
    public final /* synthetic */ kf.h[] D;
    public final /* synthetic */ f0 E;
    public final /* synthetic */ kf.i F;

    /* renamed from: x, reason: collision with root package name */
    public jf.l f8386x;

    /* renamed from: y, reason: collision with root package name */
    public byte[] f8387y;

    /* renamed from: z, reason: collision with root package name */
    public int f8388z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(kf.h[] hVarArr, f0 f0Var, kf.i iVar, le.c cVar) {
        super(2, cVar);
        this.D = hVarArr;
        this.E = f0Var;
        this.F = iVar;
    }

    @Override // ne.a
    public final le.c create(Object obj, le.c cVar) {
        p pVar = new p(this.D, this.E, this.F, cVar);
        pVar.C = obj;
        return pVar;
    }

    @Override // ve.p
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((c0) obj, (le.c) obj2)).invokeSuspend(he.y.f6101a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x008c, code lost:
    
        if (r11 == r7) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0097, code lost:
    
        if (r11 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009c, code lost:
    
        r12 = r11.f6849a;
        r13 = r10[r12];
        r10[r12] = r11.f6850b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a4, code lost:
    
        if (r13 != r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a6, code lost:
    
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00aa, code lost:
    
        if (r8[r12] == r2) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ac, code lost:
    
        r8[r12] = (byte) r2;
        r11 = r9.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b5, code lost:
    
        if ((r11 instanceof jf.n) != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b8, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b9, code lost:
    
        r11 = (ie.u) r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00bb, code lost:
    
        if (r11 != null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00bd, code lost:
    
        if (r3 != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00bf, code lost:
    
        r17.C = r10;
        r17.f8386x = r9;
        r17.f8387y = r8;
        r17.f8388z = r3;
        r17.A = r2;
        r17.B = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d3, code lost:
    
        if (r17.E.invoke(r17.F, r10, r17) != r7) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007a, code lost:
    
        if (r3 != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d5, code lost:
    
        return r7;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00d3 -> B:10:0x007a). Please report as a decompilation issue!!! */
    @Override // ne.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lf.p.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
