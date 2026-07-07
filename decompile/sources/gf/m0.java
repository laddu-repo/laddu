package gf;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class m0 extends of.i {

    /* renamed from: z, reason: collision with root package name */
    public int f5687z;

    public m0(int i6) {
        super(0L, of.k.f10188g);
        this.f5687z = i6;
    }

    public abstract void c(Object obj, CancellationException cancellationException);

    public abstract le.c d();

    public Throwable f(Object obj) {
        t tVar;
        if (obj instanceof t) {
            tVar = (t) obj;
        } else {
            tVar = null;
        }
        if (tVar == null) {
            return null;
        }
        return tVar.f5710a;
    }

    public final void h(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            he.a.a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        kotlin.jvm.internal.k.b(th);
        f0.s(d().getContext(), new Error("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object i();

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        r7 = (gf.j1) r7.get(gf.i1.f5682x);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r13 = this;
            he.y r0 = he.y.f6101a
            v5.o r1 = r13.f10180y
            le.c r2 = r13.d()     // Catch: java.lang.Throwable -> L25
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>"
            kotlin.jvm.internal.k.c(r2, r3)     // Catch: java.lang.Throwable -> L25
            mf.h r2 = (mf.h) r2     // Catch: java.lang.Throwable -> L25
            ne.c r3 = r2.B     // Catch: java.lang.Throwable -> L25
            java.lang.Object r2 = r2.D     // Catch: java.lang.Throwable -> L25
            le.h r4 = r3.getContext()     // Catch: java.lang.Throwable -> L25
            java.lang.Object r2 = mf.a.m(r4, r2)     // Catch: java.lang.Throwable -> L25
            h5.a r5 = mf.a.f8847f     // Catch: java.lang.Throwable -> L25
            r6 = 0
            if (r2 == r5) goto L28
            gf.j2 r5 = gf.f0.I(r3, r4, r2)     // Catch: java.lang.Throwable -> L25
            goto L29
        L25:
            r2 = move-exception
            goto L9f
        L28:
            r5 = r6
        L29:
            le.h r7 = r3.getContext()     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r8 = r13.i()     // Catch: java.lang.Throwable -> L4c
            java.lang.Throwable r9 = r13.f(r8)     // Catch: java.lang.Throwable -> L4c
            if (r9 != 0) goto L4e
            int r10 = r13.f5687z     // Catch: java.lang.Throwable -> L4c
            r11 = 1
            if (r10 == r11) goto L41
            r12 = 2
            if (r10 != r12) goto L40
            goto L41
        L40:
            r11 = 0
        L41:
            if (r11 == 0) goto L4e
            gf.i1 r10 = gf.i1.f5682x     // Catch: java.lang.Throwable -> L4c
            le.f r7 = r7.get(r10)     // Catch: java.lang.Throwable -> L4c
            gf.j1 r7 = (gf.j1) r7     // Catch: java.lang.Throwable -> L4c
            goto L4f
        L4c:
            r3 = move-exception
            goto L93
        L4e:
            r7 = r6
        L4f:
            if (r7 == 0) goto L66
            boolean r10 = r7.isActive()     // Catch: java.lang.Throwable -> L4c
            if (r10 != 0) goto L66
            java.util.concurrent.CancellationException r7 = r7.m()     // Catch: java.lang.Throwable -> L4c
            r13.c(r8, r7)     // Catch: java.lang.Throwable -> L4c
            he.j r7 = he.a.b(r7)     // Catch: java.lang.Throwable -> L4c
            r3.resumeWith(r7)     // Catch: java.lang.Throwable -> L4c
            goto L77
        L66:
            if (r9 == 0) goto L70
            he.j r7 = he.a.b(r9)     // Catch: java.lang.Throwable -> L4c
            r3.resumeWith(r7)     // Catch: java.lang.Throwable -> L4c
            goto L77
        L70:
            java.lang.Object r7 = r13.g(r8)     // Catch: java.lang.Throwable -> L4c
            r3.resumeWith(r7)     // Catch: java.lang.Throwable -> L4c
        L77:
            if (r5 == 0) goto L7f
            boolean r3 = r5.Z()     // Catch: java.lang.Throwable -> L25
            if (r3 == 0) goto L82
        L7f:
            mf.a.g(r4, r2)     // Catch: java.lang.Throwable -> L25
        L82:
            r1.getClass()     // Catch: java.lang.Throwable -> L86
            goto L8b
        L86:
            r0 = move-exception
            he.j r0 = he.a.b(r0)
        L8b:
            java.lang.Throwable r0 = he.k.a(r0)
            r13.h(r6, r0)
            goto Laf
        L93:
            if (r5 == 0) goto L9b
            boolean r5 = r5.Z()     // Catch: java.lang.Throwable -> L25
            if (r5 == 0) goto L9e
        L9b:
            mf.a.g(r4, r2)     // Catch: java.lang.Throwable -> L25
        L9e:
            throw r3     // Catch: java.lang.Throwable -> L25
        L9f:
            r1.getClass()     // Catch: java.lang.Throwable -> La3
            goto La8
        La3:
            r0 = move-exception
            he.j r0 = he.a.b(r0)
        La8:
            java.lang.Throwable r0 = he.k.a(r0)
            r13.h(r2, r0)
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gf.m0.run():void");
    }

    public Object g(Object obj) {
        return obj;
    }
}
