package ac;

import androidx.media3.decoder.DecoderInputBuffer;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class e1 extends ud.h implements ce.p {
    public /* synthetic */ Object A;
    public final /* synthetic */ g1 B;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f351z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e1(g1 g1Var, sd.c cVar, int i) {
        super(2, cVar);
        this.f351z = i;
        this.B = g1Var;
    }

    @Override // ce.p
    public final Object i(Object obj, Object obj2) {
        m0 m0Var = (m0) obj;
        sd.c cVar = (sd.c) obj2;
        switch (this.f351z) {
        }
        return ((e1) l(m0Var, cVar)).o(od.l.f10126a);
    }

    @Override // ud.a
    public final sd.c l(Object obj, sd.c cVar) {
        switch (this.f351z) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                e1 e1Var = new e1(this.B, cVar, 0);
                e1Var.A = obj;
                return e1Var;
            default:
                e1 e1Var2 = new e1(this.B, cVar, 1);
                e1Var2.A = obj;
                return e1Var2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a2  */
    @Override // ud.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object o(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ac.e1.o(java.lang.Object):java.lang.Object");
    }
}
