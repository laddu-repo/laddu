package ac;

import android.net.Uri;
import androidx.media3.decoder.DecoderInputBuffer;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class o extends ud.h implements ce.p {
    public int A;
    public Object B;
    public final /* synthetic */ Object C;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f433z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o(ce.p pVar, d1.d dVar, sd.c cVar) {
        super(2, cVar);
        this.f433z = 5;
        this.B = (ud.h) pVar;
        this.C = dVar;
    }

    @Override // ce.p
    public final Object i(Object obj, Object obj2) {
        switch (this.f433z) {
        }
        return ((o) l((me.v) obj, (sd.c) obj2)).o(od.l.f10126a);
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [ce.p, ud.h] */
    /* JADX WARN: Type inference failed for: r0v30, types: [ce.p, ud.h] */
    @Override // ud.a
    public final sd.c l(Object obj, sd.c cVar) {
        switch (this.f433z) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                return new o((p) this.B, (z0) this.C, cVar, 0);
            case 1:
                return new o((g1) this.B, (m0) this.C, cVar, 1);
            case 2:
                return new o((cb.f) this.B, (ce.l) this.C, cVar, 2);
            case 3:
                return new o((cb.f) this.B, (h1.e) this.C, cVar, 3);
            case g1.g.LONG_FIELD_NUMBER /* 4 */:
                o oVar = new o((List) this.C, cVar, 4);
                oVar.B = obj;
                return oVar;
            case g1.g.STRING_FIELD_NUMBER /* 5 */:
                return new o((ce.p) this.B, (d1.d) this.C, cVar);
            case g1.g.STRING_SET_FIELD_NUMBER /* 6 */:
                o oVar2 = new o((d1.e0) this.C, cVar, 6);
                oVar2.B = obj;
                return oVar2;
            case g1.g.DOUBLE_FIELD_NUMBER /* 7 */:
                return new o((sb.p) this.C, cVar, 7);
            case g1.g.BYTES_FIELD_NUMBER /* 8 */:
                o oVar3 = new o((dc.c) this.C, cVar, 8);
                oVar3.B = obj;
                return oVar3;
            case 9:
                return new o((k4.a) this.B, (Uri) this.C, cVar, 9);
            case 10:
                o oVar4 = new o((oe.s) this.C, cVar, 10);
                oVar4.B = obj;
                return oVar4;
            case 11:
                o oVar5 = new o((ce.l) this.C, cVar, 11);
                oVar5.B = obj;
                return oVar5;
            case 12:
                return new o((p4.l0) this.B, (ce.a) this.C, cVar, 12);
            case 13:
                o oVar6 = new o((pe.b) this.C, cVar, 13);
                oVar6.B = obj;
                return oVar6;
            case 14:
                o oVar7 = new o((pe.b) this.C, cVar, 14);
                oVar7.B = obj;
                return oVar7;
            case 15:
                o oVar8 = new o((pe.d) this.C, cVar, 15);
                oVar8.B = obj;
                return oVar8;
            case 16:
                return new o((ce.p) this.B, (r4.z) this.C, cVar, 16);
            case 17:
                return new o((ce.p) this.B, (de.p) this.C, cVar, 17);
            default:
                return new o((ce.p) this.B, (r4.n) this.C, cVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:272:0x0443, code lost:
    
        if (r2.i(r0, r22) != r8) goto L274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x05d5, code lost:
    
        if (r0.a(r4, r22) == r8) goto L378;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x0621, code lost:
    
        if (ac.g1.a(r3, r0, ac.d1.f343w, r22) == r8) goto L378;
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x0686, code lost:
    
        if (r3.b(r22) == r8) goto L405;
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:?, code lost:
    
        return r8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0104  */
    /* JADX WARN: Type inference failed for: r0v201, types: [ce.p, ud.h] */
    /* JADX WARN: Type inference failed for: r0v56, types: [ce.p, ud.h] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, oe.c] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, oe.c] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object, oe.c] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r23v1 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v32, types: [oe.c] */
    /* JADX WARN: Type inference failed for: r3v47 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v5, types: [int] */
    /* JADX WARN: Type inference failed for: r9v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:272:0x0443 -> B:274:0x0447). Please report as a decompilation issue!!! */
    @Override // ud.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object o(java.lang.Object r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1792
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ac.o.o(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o(ce.p pVar, r4.n nVar, sd.c cVar) {
        super(2, cVar);
        this.f433z = 18;
        this.B = (ud.h) pVar;
        this.C = nVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(Object obj, Object obj2, sd.c cVar, int i) {
        super(2, cVar);
        this.f433z = i;
        this.B = obj;
        this.C = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(Object obj, sd.c cVar, int i) {
        super(2, cVar);
        this.f433z = i;
        this.C = obj;
    }
}
