package t7;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Boolean f12407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f12408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f12409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f12410d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bundle f12411e;
    public final /* synthetic */ e f;

    public t(e eVar, int i, Bundle bundle) {
        this.f = eVar;
        Boolean bool = Boolean.TRUE;
        this.f12409c = eVar;
        this.f12407a = bool;
        this.f12408b = false;
        this.f12410d = i;
        this.f12411e = bundle;
    }

    public abstract boolean a();

    public abstract void b(q7.b bVar);

    public final void c() {
        d();
        e eVar = this.f12409c;
        synchronized (eVar.f12323l) {
            eVar.f12323l.remove(this);
        }
    }

    public final void d() {
        synchronized (this) {
            this.f12407a = null;
        }
    }
}
