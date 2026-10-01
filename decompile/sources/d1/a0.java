package d1;

import androidx.media3.decoder.DecoderInputBuffer;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends ud.h implements ce.l {
    public int A;
    public final /* synthetic */ e0 B;
    public Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Serializable E;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f3849z = 1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a0(e0 e0Var, sd.h hVar, ce.p pVar, sd.c cVar) {
        super(1, cVar);
        this.B = e0Var;
        this.D = hVar;
        this.E = (ud.h) pVar;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [ce.p, ud.h] */
    @Override // ce.l
    public final Object a(Object obj) {
        sd.c cVar = (sd.c) obj;
        switch (this.f3849z) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                return new a0((de.p) this.D, this.B, (de.o) this.E, cVar).o(od.l.f10126a);
            default:
                return new a0(this.B, (sd.h) this.D, (ce.p) this.E, cVar).o(od.l.f10126a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007b  */
    /* JADX WARN: Type inference failed for: r7v3, types: [ce.p, ud.h] */
    @Override // ud.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object o(java.lang.Object r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.a0.o(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(de.p pVar, e0 e0Var, de.o oVar, sd.c cVar) {
        super(1, cVar);
        this.D = pVar;
        this.B = e0Var;
        this.E = oVar;
    }
}
