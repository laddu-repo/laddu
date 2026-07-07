package c2;

import androidx.media3.decoder.DecoderInputBuffer;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class p1 extends o2.s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1887c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f1888d;

    public p1(t1.s0 s0Var, t1.z zVar) {
        super(s0Var);
        this.f1888d = zVar;
    }

    @Override // o2.s, t1.s0
    public t1.q0 f(int i, t1.q0 q0Var, boolean z2) {
        switch (this.f1887c) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                t1.s0 s0Var = this.f9522b;
                t1.q0 q0VarF = s0Var.f(i, q0Var, z2);
                if (s0Var.m(q0VarF.f12088c, (t1.r0) this.f1888d, 0L).a()) {
                    q0VarF.h(q0Var.f12086a, q0Var.f12087b, q0Var.f12088c, q0Var.f12089d, q0Var.f12090e, t1.b.f11920c, true);
                } else {
                    q0VarF.f = true;
                }
                return q0VarF;
            default:
                return super.f(i, q0Var, z2);
        }
    }

    @Override // o2.s, t1.s0
    public t1.r0 m(int i, t1.r0 r0Var, long j8) {
        switch (this.f1887c) {
            case 1:
                super.m(i, r0Var, j8);
                t1.z zVar = (t1.z) this.f1888d;
                r0Var.f12097c = zVar;
                t1.w wVar = zVar.f12179b;
                r0Var.getClass();
                return r0Var;
            default:
                return super.m(i, r0Var, j8);
        }
    }

    public p1(t1.s0 s0Var) {
        super(s0Var);
        this.f1888d = new t1.r0();
    }
}
