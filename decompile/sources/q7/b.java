package q7;

import a2.e2;
import b1.v;
import bg.e0;
import bg.l;
import he.m;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.internal.k;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.internal.Util;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b extends RequestBody {

    /* renamed from: a, reason: collision with root package name */
    public final RequestBody f11135a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentLinkedQueue f11136b;

    /* renamed from: c, reason: collision with root package name */
    public final e2 f11137c = new e2(3);

    /* renamed from: d, reason: collision with root package name */
    public final m f11138d = he.a.d(new v(this, 7));

    public b(RequestBody requestBody, ConcurrentLinkedQueue concurrentLinkedQueue) {
        this.f11135a = requestBody;
        this.f11136b = concurrentLinkedQueue;
    }

    @Override // okhttp3.RequestBody
    public final long contentLength() {
        return ((Number) this.f11138d.getValue()).longValue();
    }

    @Override // okhttp3.RequestBody
    public final MediaType contentType() {
        return this.f11135a.contentType();
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(l sink) {
        ConcurrentLinkedQueue concurrentLinkedQueue;
        k.e(sink, "sink");
        boolean z10 = sink instanceof bg.k;
        RequestBody requestBody = this.f11135a;
        if (!z10 && !df.m.I(sink.toString(), "com.android.tools.profiler.support.network.HttpTracker$OutputStreamTracker", false)) {
            e0 c10 = bg.b.c(new a(sink, this));
            requestBody.writeTo(c10);
            Util.closeQuietly(c10);
            if (((Number) this.f11138d.getValue()).longValue() == -1 && (concurrentLinkedQueue = this.f11136b) != null) {
                Iterator it = concurrentLinkedQueue.iterator();
                if (it.hasNext()) {
                    if (it.next() == null) {
                        this.f11137c.f217b = true;
                        throw null;
                    }
                    throw new ClassCastException();
                }
                return;
            }
            return;
        }
        requestBody.writeTo(sink);
    }
}
