package w7;

import cf.m;
import gf.i0;
import gf.i1;
import gf.j0;
import gf.n;
import gf.n1;
import gf.q0;
import gf.t1;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.k;
import le.f;
import le.g;
import le.h;
import lf.i;
import ve.l;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b implements i0 {

    /* renamed from: x, reason: collision with root package name */
    public final j0 f14146x;

    public b(j0 j0Var) {
        this.f14146x = j0Var;
    }

    @Override // gf.j1
    public final n Q(t1 t1Var) {
        return this.f14146x.Q(t1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // gf.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a0(ne.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof w7.a
            if (r0 == 0) goto L13
            r0 = r6
            w7.a r0 = (w7.a) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            w7.a r0 = new w7.a
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f14144y
            int r1 = r0.A
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            java.lang.String r0 = r0.f14143x
            he.a.f(r6)     // Catch: java.lang.Exception -> L27
            return r6
        L27:
            r6 = move-exception
            goto L83
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            he.a.f(r6)
            java.lang.Throwable r6 = new java.lang.Throwable
            r6.<init>()
            java.lang.StackTraceElement[] r6 = r6.getStackTrace()
            java.lang.String r1 = "Throwable().stackTrace"
            kotlin.jvm.internal.k.d(r6, r1)
            java.lang.Object r6 = ie.i.m0(r2, r6)
            java.lang.StackTraceElement r6 = (java.lang.StackTraceElement) r6
            if (r6 == 0) goto L6e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = " ...("
            r1.<init>(r3)
            java.lang.String r3 = r6.getFileName()
            r1.append(r3)
            r3 = 58
            r1.append(r3)
            int r6 = r6.getLineNumber()
            r1.append(r6)
            r6 = 41
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            goto L6f
        L6e:
            r6 = 0
        L6f:
            gf.j0 r1 = r5.f14146x     // Catch: java.lang.Exception -> L7f
            r0.f14143x = r6     // Catch: java.lang.Exception -> L7f
            r0.A = r2     // Catch: java.lang.Exception -> L7f
            java.lang.Object r6 = r1.p(r0)     // Catch: java.lang.Exception -> L7f
            me.a r0 = me.a.f8833x
            if (r6 != r0) goto L7e
            return r0
        L7e:
            return r6
        L7f:
            r0 = move-exception
            r4 = r0
            r0 = r6
            r6 = r4
        L83:
            if (r0 == 0) goto L91
            boolean r1 = r6 instanceof com.drake.net.exception.NetException
            if (r1 != 0) goto L8a
            goto L91
        L8a:
            r1 = r6
            com.drake.net.exception.NetException r1 = (com.drake.net.exception.NetException) r1
            r1.setOccurred(r0)
            goto L9d
        L91:
            if (r0 == 0) goto L9d
            boolean r1 = r6 instanceof com.drake.net.exception.URLParseException
            if (r1 == 0) goto L9d
            r1 = r6
            com.drake.net.exception.URLParseException r1 = (com.drake.net.exception.URLParseException) r1
            r1.setOccurred(r0)
        L9d:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.b.a0(ne.c):java.lang.Object");
    }

    @Override // gf.j1
    public final q0 b0(boolean z10, boolean z11, n1 n1Var) {
        return this.f14146x.b0(z10, z11, n1Var);
    }

    @Override // gf.j1
    public final void d(CancellationException cancellationException) {
        this.f14146x.d(cancellationException);
    }

    @Override // gf.i0
    public final Object f() {
        return this.f14146x.z();
    }

    @Override // le.h
    public final Object fold(Object obj, p pVar) {
        return pVar.invoke(obj, this.f14146x);
    }

    @Override // le.h
    public final f get(g key) {
        k.e(key, "key");
        return m.o(this.f14146x, key);
    }

    @Override // le.f
    public final g getKey() {
        return i1.f5682x;
    }

    @Override // gf.j1
    public final boolean isActive() {
        return this.f14146x.isActive();
    }

    @Override // gf.j1
    public final boolean isCancelled() {
        return this.f14146x.isCancelled();
    }

    @Override // gf.j1
    public final Object l(i iVar) {
        return this.f14146x.l(iVar);
    }

    @Override // gf.j1
    public final CancellationException m() {
        return this.f14146x.m();
    }

    @Override // le.h
    public final h minusKey(g key) {
        k.e(key, "key");
        return m.x(this.f14146x, key);
    }

    @Override // le.h
    public final h plus(h context) {
        k.e(context, "context");
        return m.A(this.f14146x, context);
    }

    @Override // gf.j1
    public final boolean start() {
        return this.f14146x.start();
    }

    @Override // gf.j1
    public final q0 y(l lVar) {
        return this.f14146x.y(lVar);
    }
}
