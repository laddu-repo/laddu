package y9;

import androidx.media3.decoder.DecoderInputBuffer;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class x0 extends y0 implements Serializable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final x0 f14630w = new x0(0);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final x0 f14631x = new x0(1);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f14632v;

    public /* synthetic */ x0(int i) {
        this.f14632v = i;
    }

    @Override // y9.y0
    public final y0 a() {
        switch (this.f14632v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                return f14631x;
            default:
                return f14630w;
        }
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f14632v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                comparable.getClass();
                comparable2.getClass();
                return comparable.compareTo(comparable2);
            default:
                Comparable comparable3 = (Comparable) obj;
                Comparable comparable4 = (Comparable) obj2;
                comparable3.getClass();
                if (comparable3 == comparable4) {
                    return 0;
                }
                return comparable4.compareTo(comparable3);
        }
    }

    public final String toString() {
        switch (this.f14632v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                return "Ordering.natural()";
            default:
                return "Ordering.natural().reverse()";
        }
    }
}
