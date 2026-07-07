package d1;

import androidx.media3.decoder.DecoderInputBuffer;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class y extends ud.h implements ce.p {
    public int A;
    public /* synthetic */ boolean B;
    public final /* synthetic */ e0 C;
    public final /* synthetic */ int D;
    public Object E;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f3963z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(e0 e0Var, int i, sd.c cVar, int i10) {
        super(2, cVar);
        this.f3963z = i10;
        this.C = e0Var;
        this.D = i;
    }

    @Override // ce.p
    public final Object i(Object obj, Object obj2) {
        int i = this.f3963z;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        sd.c cVar = (sd.c) obj2;
        switch (i) {
        }
        return ((y) l(bool, cVar)).o(od.l.f10126a);
    }

    @Override // ud.a
    public final sd.c l(Object obj, sd.c cVar) {
        switch (this.f3963z) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                y yVar = new y(this.C, this.D, cVar, 0);
                yVar.B = ((Boolean) obj).booleanValue();
                return yVar;
            default:
                y yVar2 = new y(this.C, this.D, cVar, 1);
                yVar2.B = ((Boolean) obj).booleanValue();
                return yVar2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    @Override // ud.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object o(java.lang.Object r7) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.y.o(java.lang.Object):java.lang.Object");
    }
}
