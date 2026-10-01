package m2;

import android.os.Handler;
import db.h1;
import java.io.Closeable;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class m implements Runnable, Closeable {
    public final /* synthetic */ n A;

    /* renamed from: x, reason: collision with root package name */
    public final Handler f8521x = u1.a0.n(null);

    /* renamed from: y, reason: collision with root package name */
    public final long f8522y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f8523z;

    public m(n nVar, long j) {
        this.A = nVar;
        this.f8522y = j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f8523z = false;
        this.f8521x.removeCallbacks(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        n nVar = this.A;
        b2.k kVar = nVar.D;
        kVar.A(kVar.l(4, nVar.H, h1.D, nVar.E));
        this.f8521x.postDelayed(this, this.f8522y);
    }
}
