package n6;

import df.k;
import java.io.Closeable;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b implements Closeable {

    /* renamed from: x, reason: collision with root package name */
    public final a f9071x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f9072y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ e f9073z;

    public b(e eVar, a aVar) {
        this.f9073z = eVar;
        this.f9071x = aVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.f9072y) {
            this.f9072y = true;
            e eVar = this.f9073z;
            synchronized (eVar) {
                a aVar = this.f9071x;
                int i6 = aVar.f9069h - 1;
                aVar.f9069h = i6;
                if (i6 == 0 && aVar.f9067f) {
                    k kVar = e.N;
                    eVar.b0(aVar);
                }
            }
        }
    }
}
