package c2;

import android.util.Pair;
import androidx.media3.decoder.DecoderInputBuffer;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c1 implements Runnable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f1695v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h1 f1696w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Pair f1697x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ o2.z f1698y;

    public /* synthetic */ c1(h1 h1Var, Pair pair, o2.z zVar, int i) {
        this.f1695v = i;
        this.f1696w = h1Var;
        this.f1697x = pair;
        this.f1698y = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1695v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                d2.f fVar = (d2.f) this.f1696w.f1759w.i;
                Pair pair = this.f1697x;
                int iIntValue = ((Integer) pair.first).intValue();
                o2.d0 d0Var = (o2.d0) pair.second;
                d0Var.getClass();
                fVar.f(iIntValue, d0Var, this.f1698y);
                break;
            default:
                d2.f fVar2 = (d2.f) this.f1696w.f1759w.i;
                Pair pair2 = this.f1697x;
                fVar2.h(((Integer) pair2.first).intValue(), (o2.d0) pair2.second, this.f1698y);
                break;
        }
    }
}
