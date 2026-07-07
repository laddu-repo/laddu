package d1;

import androidx.media3.decoder.DecoderInputBuffer;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class p extends ud.h implements ce.p {
    public /* synthetic */ Object A;
    public final /* synthetic */ Object B;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f3925z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public p(ce.p pVar, sd.c cVar) {
        super(2, cVar);
        this.f3925z = 4;
        this.B = (ud.h) pVar;
    }

    @Override // ce.p
    public final Object i(Object obj, Object obj2) throws Throwable {
        switch (this.f3925z) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                return ((p) l((i1) obj, (sd.c) obj2)).o(od.l.f10126a);
            case 1:
                return ((p) l((h1.b) obj, (sd.c) obj2)).o(od.l.f10126a);
            case 2:
                ((p) l((me.v) obj, (sd.c) obj2)).o(od.l.f10126a);
                throw null;
            case 3:
                p pVar = (p) l((me.v) obj, (sd.c) obj2);
                od.l lVar = od.l.f10126a;
                pVar.o(lVar);
                return lVar;
            default:
                return ((p) l((me.v) obj, (sd.c) obj2)).o(od.l.f10126a);
        }
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [ce.p, ud.h] */
    @Override // ud.a
    public final sd.c l(Object obj, sd.c cVar) {
        switch (this.f3925z) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                p pVar = new p((i1) this.B, cVar, 0);
                pVar.A = obj;
                return pVar;
            case 1:
                p pVar2 = new p((Set) this.B, cVar, 1);
                pVar2.A = obj;
                return pVar2;
            case 2:
                p pVar3 = new p((l4.e) this.B, cVar, 2);
                pVar3.A = obj;
                return pVar3;
            case 3:
                p pVar4 = new p((ac.g0) this.B, cVar, 3);
                pVar4.A = obj;
                return pVar4;
            default:
                p pVar5 = new p((ud.h) this.B, cVar);
                pVar5.A = obj;
                return pVar5;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0099, code lost:
    
        r4.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a1, code lost:
    
        return od.l.f10126a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a4, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a5, code lost:
    
        r0.m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a8, code lost:
    
        throw r9;
     */
    /* JADX WARN: Type inference failed for: r4v4, types: [ce.p, ud.h] */
    @Override // ud.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object o(java.lang.Object r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.p.o(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(Object obj, sd.c cVar, int i) {
        super(2, cVar);
        this.f3925z = i;
        this.B = obj;
    }
}
