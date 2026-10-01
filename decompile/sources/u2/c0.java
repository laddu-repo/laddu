package u2;

import androidx.media3.decoder.DecoderInputBuffer;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c0 implements Runnable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f12703v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p2.c f12704w;

    public /* synthetic */ c0(int i, Object obj, p2.c cVar) {
        this.f12703v = i;
        this.f12704w = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f12703v;
        p2.c cVar = this.f12704w;
        switch (i) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                d0 d0Var = (d0) cVar.f10197x;
                int i10 = w1.b0.f13686a;
                d2.f fVar = ((c2.g0) d0Var).f1743v.O;
                fVar.S(fVar.R(), 1016, new a7.u(28));
                break;
            case 1:
                d0 d0Var2 = (d0) cVar.f10197x;
                int i11 = w1.b0.f13686a;
                d2.f fVar2 = ((c2.g0) d0Var2).f1743v.O;
                fVar2.S(fVar2.R(), 1030, new a7.u(10));
                break;
            case 2:
                d0 d0Var3 = (d0) cVar.f10197x;
                int i12 = w1.b0.f13686a;
                d2.f fVar3 = ((c2.g0) d0Var3).f1743v.O;
                fVar3.S(fVar3.R(), 1019, new a7.u(16));
                break;
            case 3:
                d0 d0Var4 = (d0) cVar.f10197x;
                int i13 = w1.b0.f13686a;
                d2.f fVar4 = ((c2.g0) d0Var4).f1743v.O;
                fVar4.S(fVar4.O((o2.d0) fVar4.f3989y.f), 1018, new d2.b(6));
                break;
            case g1.g.LONG_FIELD_NUMBER /* 4 */:
                d0 d0Var5 = (d0) cVar.f10197x;
                int i14 = w1.b0.f13686a;
                d2.f fVar5 = ((c2.g0) d0Var5).f1743v.O;
                fVar5.S(fVar5.O((o2.d0) fVar5.f3989y.f), 1021, new d2.b(7));
                break;
            case g1.g.STRING_FIELD_NUMBER /* 5 */:
                d0 d0Var6 = (d0) cVar.f10197x;
                int i15 = w1.b0.f13686a;
                d2.f fVar6 = ((c2.g0) d0Var6).f1743v.O;
                fVar6.S(fVar6.R(), 1015, new d2.b(17));
                break;
            default:
                d0 d0Var7 = (d0) cVar.f10197x;
                int i16 = w1.b0.f13686a;
                d2.f fVar7 = ((c2.g0) d0Var7).f1743v.O;
                fVar7.S(fVar7.R(), 1017, new d2.b(13));
                break;
        }
    }

    public /* synthetic */ c0(p2.c cVar, int i, long j8) {
        this.f12703v = 3;
        this.f12704w = cVar;
    }

    public /* synthetic */ c0(p2.c cVar, long j8, int i) {
        this.f12703v = 4;
        this.f12704w = cVar;
    }

    public /* synthetic */ c0(p2.c cVar, String str, long j8, long j9) {
        this.f12703v = 0;
        this.f12704w = cVar;
    }

    public /* synthetic */ c0(p2.c cVar, t1.o oVar, c2.h hVar) {
        this.f12703v = 6;
        this.f12704w = cVar;
    }
}
