package re;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import me.d0;
import me.j1;
import me.o0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class f extends d0 implements ud.d, sd.c {
    public static final /* synthetic */ AtomicReferenceFieldUpdater C = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_reusableCancellableContinuation$volatile");
    public Object A;
    public final Object B;
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final me.s f11379y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ud.c f11380z;

    public f(me.s sVar, ud.c cVar) {
        super(-1);
        this.f11379y = sVar;
        this.f11380z = cVar;
        this.A = a.f11369b;
        this.B = a.k(cVar.f());
    }

    @Override // ud.d
    public final ud.d c() {
        return this.f11380z;
    }

    @Override // sd.c
    public final sd.h f() {
        return this.f11380z.f();
    }

    @Override // sd.c
    public final void g(Object obj) {
        Throwable thA = od.h.a(obj);
        Object pVar = thA == null ? obj : new me.p(thA, false);
        ud.c cVar = this.f11380z;
        sd.h hVarF = cVar.f();
        me.s sVar = this.f11379y;
        if (sVar.p0(hVarF)) {
            this.A = pVar;
            this.f8686x = 0;
            sVar.o0(cVar.f(), this);
            return;
        }
        o0 o0VarA = j1.a();
        if (o0VarA.f8718x >= 4294967296L) {
            this.A = pVar;
            this.f8686x = 0;
            pd.h hVar = o0VarA.f8720z;
            if (hVar == null) {
                hVar = new pd.h();
                o0VarA.f8720z = hVar;
            }
            hVar.addLast(this);
            return;
        }
        o0VarA.t0(true);
        try {
            sd.h hVarF2 = cVar.f();
            Object objL = a.l(hVarF2, this.B);
            try {
                cVar.g(obj);
                while (o0VarA.v0()) {
                }
            } finally {
                a.g(hVarF2, objL);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // me.d0
    public final Object l() {
        Object obj = this.A;
        this.A = a.f11369b;
        return obj;
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f11379y + ", " + me.x.p(this.f11380z) + ']';
    }

    @Override // me.d0
    public final sd.c d() {
        return this;
    }
}
