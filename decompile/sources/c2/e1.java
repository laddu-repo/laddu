package c2;

import android.util.Pair;
import androidx.media3.decoder.DecoderInputBuffer;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e1 implements Runnable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f1717v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h1 f1718w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Pair f1719x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ o2.u f1720y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ o2.z f1721z;

    public /* synthetic */ e1(h1 h1Var, Pair pair, o2.u uVar, o2.z zVar, int i) {
        this.f1717v = i;
        this.f1718w = h1Var;
        this.f1719x = pair;
        this.f1720y = uVar;
        this.f1721z = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1717v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                d2.f fVar = (d2.f) this.f1718w.f1759w.i;
                Pair pair = this.f1719x;
                fVar.d(((Integer) pair.first).intValue(), (o2.d0) pair.second, this.f1720y, this.f1721z);
                break;
            default:
                d2.f fVar2 = (d2.f) this.f1718w.f1759w.i;
                Pair pair2 = this.f1719x;
                fVar2.F(((Integer) pair2.first).intValue(), (o2.d0) pair2.second, this.f1720y, this.f1721z);
                break;
        }
    }
}
