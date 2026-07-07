package sa;

import androidx.media3.decoder.DecoderInputBuffer;
import c2.g0;
import c2.j0;
import u2.d0;
import w1.b0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f11651v = 1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ long f11652w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f11653x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f11654y;

    public /* synthetic */ p(p2.c cVar, Object obj, long j8) {
        this.f11653x = cVar;
        this.f11654y = obj;
        this.f11652w = j8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f11651v;
        long j8 = this.f11652w;
        Object obj = this.f11654y;
        Object obj2 = this.f11653x;
        switch (i) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                String str = (String) obj;
                l lVar = ((q) obj2).f11660g;
                s sVar = lVar.f11640n;
                if (sVar == null || !sVar.f11678e.get()) {
                    ((ua.c) lVar.i.f12910w).k(str, j8);
                }
                break;
            default:
                d0 d0Var = (d0) ((p2.c) obj2).f10197x;
                int i10 = b0.f13686a;
                j0 j0Var = ((g0) d0Var).f1743v;
                d2.f fVar = j0Var.O;
                d2.a aVarR = fVar.R();
                fVar.S(aVarR, 26, new d2.d(aVarR, obj, j8));
                if (j0Var.f1792n0 == obj) {
                    j0Var.I.e(26, new a7.u(7));
                }
                break;
        }
    }

    public /* synthetic */ p(q qVar, long j8, String str) {
        this.f11653x = qVar;
        this.f11652w = j8;
        this.f11654y = str;
    }
}
