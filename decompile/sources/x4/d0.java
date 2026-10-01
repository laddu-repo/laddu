package x4;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final w f14562a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f14563b;

    /* renamed from: c, reason: collision with root package name */
    public final he.m f14564c;

    public d0(w database) {
        kotlin.jvm.internal.k.e(database, "database");
        this.f14562a = database;
        this.f14563b = new AtomicBoolean(false);
        this.f14564c = he.a.d(new androidx.lifecycle.i(this, 25));
    }

    public final i5.j a() {
        w wVar = this.f14562a;
        wVar.a();
        if (this.f14563b.compareAndSet(false, true)) {
            return (i5.j) this.f14564c.getValue();
        }
        String b10 = b();
        wVar.getClass();
        wVar.a();
        wVar.b();
        return wVar.k().G().k(b10);
    }

    public abstract String b();

    public final void c(i5.j statement) {
        kotlin.jvm.internal.k.e(statement, "statement");
        if (statement == ((i5.j) this.f14564c.getValue())) {
            this.f14563b.set(false);
        }
    }
}
