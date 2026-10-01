package a2;

import android.util.Base64;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class s implements cb.l {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f388x;

    @Override // cb.l
    public final Object get() {
        Object zVar;
        switch (this.f388x) {
            case 0:
                return new l();
            case 1:
                byte[] bArr = new byte[12];
                b2.h.f1372i.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
            case 2:
                throw new IllegalStateException();
            case 3:
                ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
                if (newSingleThreadExecutor instanceof hb.y) {
                    return (hb.y) newSingleThreadExecutor;
                }
                if (newSingleThreadExecutor instanceof ScheduledExecutorService) {
                    zVar = new hb.c0((ScheduledExecutorService) newSingleThreadExecutor);
                } else {
                    zVar = new hb.z(newSingleThreadExecutor);
                }
                return zVar;
            default:
                try {
                    return Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                } catch (Exception e10) {
                    throw new IllegalStateException(e10);
                }
        }
    }
}
