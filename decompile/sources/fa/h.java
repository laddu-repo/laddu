package fa;

import androidx.media3.decoder.DecoderInputBuffer;
import java.util.concurrent.Executor;
import ma.s;
import me.x;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class h implements ma.e {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final h f5344w = new h(0);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final h f5345x = new h(1);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final h f5346y = new h(2);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final h f5347z = new h(3);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f5348v;

    public /* synthetic */ h(int i) {
        this.f5348v = i;
    }

    @Override // ma.e
    public final Object p(ad.c cVar) {
        switch (this.f5348v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                Object objH = cVar.h(new s(la.a.class, Executor.class));
                de.i.d(objH, "get(...)");
                return x.e((Executor) objH);
            case 1:
                Object objH2 = cVar.h(new s(la.c.class, Executor.class));
                de.i.d(objH2, "get(...)");
                return x.e((Executor) objH2);
            case 2:
                Object objH3 = cVar.h(new s(la.b.class, Executor.class));
                de.i.d(objH3, "get(...)");
                return x.e((Executor) objH3);
            default:
                Object objH4 = cVar.h(new s(la.d.class, Executor.class));
                de.i.d(objH4, "get(...)");
                return x.e((Executor) objH4);
        }
    }
}
