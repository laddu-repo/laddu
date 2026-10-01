package c2;

import android.util.Pair;
import androidx.media3.decoder.DecoderInputBuffer;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d1 implements Runnable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f1705v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h1 f1706w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Pair f1707x;

    public /* synthetic */ d1(h1 h1Var, Pair pair, int i) {
        this.f1705v = i;
        this.f1706w = h1Var;
        this.f1707x = pair;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1705v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                d2.f fVar = (d2.f) this.f1706w.f1759w.i;
                Pair pair = this.f1707x;
                fVar.v(((Integer) pair.first).intValue(), (o2.d0) pair.second);
                break;
            case 1:
                d2.f fVar2 = (d2.f) this.f1706w.f1759w.i;
                Pair pair2 = this.f1707x;
                fVar2.k(((Integer) pair2.first).intValue(), (o2.d0) pair2.second);
                break;
            default:
                d2.f fVar3 = (d2.f) this.f1706w.f1759w.i;
                Pair pair3 = this.f1707x;
                fVar3.M(((Integer) pair3.first).intValue(), (o2.d0) pair3.second);
                break;
        }
    }
}
