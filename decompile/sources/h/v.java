package h;

import android.media.MediaCodec;
import android.os.Build;
import android.os.LocaleList;
import android.view.PointerIcon;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.concurrent.ForkJoinPool;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class v {
    public static /* synthetic */ MediaCodec.CryptoInfo.Pattern d(int i, int i10) {
        return new MediaCodec.CryptoInfo.Pattern(i, i10);
    }

    public static /* bridge */ /* synthetic */ LocaleList g(Object obj) {
        return (LocaleList) obj;
    }

    public static /* bridge */ /* synthetic */ PointerIcon k(Object obj) {
        return (PointerIcon) obj;
    }

    public static /* synthetic */ PriorityQueue r(Comparator comparator) {
        return new PriorityQueue(comparator);
    }

    public static /* synthetic */ void s() {
    }

    public static void v(na.e eVar) {
        if ((Build.VERSION.SDK_INT <= 23 || eVar != ForkJoinPool.commonPool()) && !eVar.f9057v.isTerminated()) {
            eVar.shutdown();
            throw null;
        }
    }
}
