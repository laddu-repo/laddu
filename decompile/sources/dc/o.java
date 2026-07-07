package dc;

import ac.k1;
import java.util.concurrent.atomic.AtomicReference;
import me.x;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k1 f4495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d1.h f4496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f4497c;

    public o(sd.h hVar, k1 k1Var, d1.h hVar2) {
        de.i.e(hVar, "backgroundDispatcher");
        de.i.e(k1Var, "timeProvider");
        de.i.e(hVar2, "sessionConfigsDataStore");
        this.f4495a = k1Var;
        this.f4496b = hVar2;
        this.f4497c = new AtomicReference();
        x.k(x.b(hVar), null, new m(this, null, 0), 3);
    }

    public final h a() throws Throwable {
        AtomicReference atomicReference = this.f4497c;
        if (atomicReference.get() == null) {
            Object objO = x.o(sd.i.f11797v, new m(this, null, 1));
            while (!atomicReference.compareAndSet(null, objO) && atomicReference.get() == null) {
            }
        }
        Object obj = atomicReference.get();
        de.i.d(obj, "get(...)");
        return (h) obj;
    }

    public final boolean b() {
        Long l10 = a().f4484e;
        Integer num = a().f4483d;
        return l10 == null || num == null || this.f4495a.a().f415c - l10.longValue() >= ((long) num.intValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(dc.h r5, ud.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof dc.n
            if (r0 == 0) goto L13
            r0 = r6
            dc.n r0 = (dc.n) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            dc.n r0 = new dc.n
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f4493y
            int r1 = r0.A
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            fa.b.z(r6)     // Catch: java.io.IOException -> L25
            goto L58
        L25:
            r5 = move-exception
            goto L45
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            fa.b.z(r6)
            d1.h r6 = r4.f4496b     // Catch: java.io.IOException -> L25
            d1.o r1 = new d1.o     // Catch: java.io.IOException -> L25
            r3 = 0
            r1.<init>(r5, r3)     // Catch: java.io.IOException -> L25
            r0.A = r2     // Catch: java.io.IOException -> L25
            java.lang.Object r5 = r6.a(r1, r0)     // Catch: java.io.IOException -> L25
            td.a r6 = td.a.f12544v
            if (r5 != r6) goto L58
            return r6
        L45:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "Failed to update config values: "
            r6.<init>(r0)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.String r6 = "FirebaseSessions"
            android.util.Log.w(r6, r5)
        L58:
            od.l r5 = od.l.f10126a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: dc.o.c(dc.h, ud.c):java.lang.Object");
    }
}
