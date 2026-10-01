package na;

import androidx.media3.decoder.DecoderInputBuffer;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import k8.k4;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements f {
    public final /* synthetic */ TimeUnit A;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f9048v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f9049w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Runnable f9050x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ long f9051y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ long f9052z;

    public /* synthetic */ c(e eVar, Runnable runnable, long j8, long j9, TimeUnit timeUnit, int i) {
        this.f9048v = i;
        this.f9049w = eVar;
        this.f9050x = runnable;
        this.f9051y = j8;
        this.f9052z = j9;
        this.A = timeUnit;
    }

    @Override // na.f
    public final ScheduledFuture a(k4 k4Var) {
        switch (this.f9048v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                e eVar = this.f9049w;
                return eVar.f9058w.scheduleAtFixedRate(new d(eVar, this.f9050x, k4Var, 0), this.f9051y, this.f9052z, this.A);
            default:
                e eVar2 = this.f9049w;
                return eVar2.f9058w.scheduleWithFixedDelay(new d(eVar2, this.f9050x, k4Var, 2), this.f9051y, this.f9052z, this.A);
        }
    }
}
