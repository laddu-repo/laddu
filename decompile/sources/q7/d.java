package q7;

import android.os.SystemClock;
import he.m;
import java.util.concurrent.ConcurrentLinkedQueue;
import okhttp3.MediaType;
import okhttp3.ResponseBody;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d extends ResponseBody {
    public final m A;
    public final m B;

    /* renamed from: x, reason: collision with root package name */
    public final ResponseBody f11141x;

    /* renamed from: y, reason: collision with root package name */
    public final ConcurrentLinkedQueue f11142y;

    /* renamed from: z, reason: collision with root package name */
    public final u7.b f11143z;

    public d(ResponseBody responseBody, ConcurrentLinkedQueue concurrentLinkedQueue, u7.b bVar) {
        this.f11141x = responseBody;
        this.f11142y = concurrentLinkedQueue;
        this.f11143z = bVar;
        SystemClock.elapsedRealtime();
        this.A = he.a.d(new c(this, 0));
        this.B = he.a.d(new c(this, 1));
    }

    @Override // okhttp3.ResponseBody
    public final long contentLength() {
        return ((Number) this.B.getValue()).longValue();
    }

    @Override // okhttp3.ResponseBody
    public final MediaType contentType() {
        return this.f11141x.contentType();
    }

    @Override // okhttp3.ResponseBody
    public final bg.m source() {
        return (bg.m) this.A.getValue();
    }
}
