package w8;

import android.os.Bundle;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public Boolean f14223a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f14224b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f14225c;

    /* renamed from: d, reason: collision with root package name */
    public final int f14226d;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f14227e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f14228f;

    public r(f fVar, int i6, Bundle bundle) {
        this.f14228f = fVar;
        Boolean bool = Boolean.TRUE;
        this.f14225c = fVar;
        this.f14223a = bool;
        this.f14224b = false;
        this.f14226d = i6;
        this.f14227e = bundle;
    }

    public abstract void a(t8.b bVar);

    public abstract boolean b();

    public final void c() {
        synchronized (this) {
            this.f14223a = null;
        }
    }

    public final void d() {
        c();
        synchronized (this.f14225c.f14170l) {
            this.f14225c.f14170l.remove(this);
        }
    }
}
