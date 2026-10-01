package p4;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f10379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f10380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final od.j f10381c;

    public z(u uVar) {
        de.i.e(uVar, "database");
        this.f10379a = uVar;
        this.f10380b = new AtomicBoolean(false);
        this.f10381c = new od.j(new ac.g0(10, this));
    }

    public final x4.j a() {
        this.f10379a.a();
        return this.f10380b.compareAndSet(false, true) ? (x4.j) this.f10381c.getValue() : b();
    }

    public final x4.j b() {
        String strC = c();
        u uVar = this.f10379a;
        uVar.getClass();
        uVar.a();
        uVar.b();
        return uVar.j().e0().x(strC);
    }

    public abstract String c();

    public final void d(x4.j jVar) {
        de.i.e(jVar, "statement");
        if (jVar == ((x4.j) this.f10381c.getValue())) {
            this.f10380b.set(false);
        }
    }
}
