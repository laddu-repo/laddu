package o2;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class w extends s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f9556e = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f9557c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f9558d;

    public w(t1.s0 s0Var, Object obj, Object obj2) {
        super(s0Var);
        this.f9557c = obj;
        this.f9558d = obj2;
    }

    @Override // o2.s, t1.s0
    public final int b(Object obj) {
        Object obj2;
        if (f9556e.equals(obj) && (obj2 = this.f9558d) != null) {
            obj = obj2;
        }
        return this.f9522b.b(obj);
    }

    @Override // o2.s, t1.s0
    public final t1.q0 f(int i, t1.q0 q0Var, boolean z2) {
        this.f9522b.f(i, q0Var, z2);
        if (Objects.equals(q0Var.f12087b, this.f9558d) && z2) {
            q0Var.f12087b = f9556e;
        }
        return q0Var;
    }

    @Override // o2.s, t1.s0
    public final Object l(int i) {
        Object objL = this.f9522b.l(i);
        return Objects.equals(objL, this.f9558d) ? f9556e : objL;
    }

    @Override // o2.s, t1.s0
    public final t1.r0 m(int i, t1.r0 r0Var, long j8) {
        this.f9522b.m(i, r0Var, j8);
        if (Objects.equals(r0Var.f12095a, this.f9557c)) {
            r0Var.f12095a = t1.r0.f12093q;
        }
        return r0Var;
    }
}
