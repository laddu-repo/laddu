package r4;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ce.a f11217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ReentrantLock f11218c = new ReentrantLock();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11219d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f11220e;
    public final h[] f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ue.h f11221g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final pd.h f11222h;

    public s(int i, ce.a aVar) {
        this.f11216a = i;
        this.f11217b = aVar;
        this.f = new h[i];
        int i10 = ue.i.f12990a;
        this.f11221g = new ue.h(i);
        this.f11222h = new pd.h(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
    
        r1.e(r4, r3.f12989w);
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(ud.c r7) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r4.s.a(ud.c):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:11|46|12|25|48|29|(1:(1:39)(2:35|(1:37)))(1:31)|38|19|44|20|21|(1:23)(11:24|25|48|29|(0)(0)|38|19|44|20|21|(0)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0061, code lost:
    
        r10 = r10;
        r9 = r9;
        r1 = r0;
        r0 = r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0054 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006a A[Catch: all -> 0x006e, TryCatch #2 {all -> 0x006e, blocks: (B:29:0x0066, B:31:0x006a, B:35:0x0072, B:39:0x0079), top: B:48:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0055 -> B:25:0x0057). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(long r7, r4.d r9, ud.c r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof r4.r
            if (r0 == 0) goto L13
            r0 = r10
            r4.r r0 = (r4.r) r0
            int r1 = r0.D
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.D = r1
            goto L18
        L13:
            r4.r r0 = new r4.r
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.B
            int r1 = r0.D
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            long r7 = r0.f11214y
            de.p r9 = r0.A
            ce.a r1 = r0.f11215z
            fa.b.z(r10)     // Catch: java.lang.Throwable -> L2c
            goto L57
        L2c:
            r10 = move-exception
            goto L61
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            fa.b.z(r10)
        L39:
            de.p r10 = new de.p
            r10.<init>()
            cb.e r1 = new cb.e     // Catch: java.lang.Throwable -> L5c
            r4 = 7
            r1.<init>(r10, r6, r3, r4)     // Catch: java.lang.Throwable -> L5c
            r0.f11215z = r9     // Catch: java.lang.Throwable -> L5c
            r0.A = r10     // Catch: java.lang.Throwable -> L5c
            r0.f11214y = r7     // Catch: java.lang.Throwable -> L5c
            r0.D = r2     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r1 = me.x.t(r7, r1, r0)     // Catch: java.lang.Throwable -> L5c
            td.a r4 = td.a.f12544v
            if (r1 != r4) goto L55
            return r4
        L55:
            r1 = r9
            r9 = r10
        L57:
            r10 = r9
            r9 = r1
            r1 = r0
            r0 = r3
            goto L66
        L5c:
            r1 = move-exception
            r5 = r1
            r1 = r9
            r9 = r10
            r10 = r5
        L61:
            r5 = r10
            r10 = r9
            r9 = r1
            r1 = r0
            r0 = r5
        L66:
            boolean r4 = r0 instanceof me.l1     // Catch: java.lang.Throwable -> L6e
            if (r4 == 0) goto L70
            r9.b()     // Catch: java.lang.Throwable -> L6e
            goto L77
        L6e:
            r7 = move-exception
            goto L7a
        L70:
            if (r0 != 0) goto L79
            java.lang.Object r10 = r10.f4522v     // Catch: java.lang.Throwable -> L6e
            if (r10 == 0) goto L77
            return r10
        L77:
            r0 = r1
            goto L39
        L79:
            throw r0     // Catch: java.lang.Throwable -> L6e
        L7a:
            java.lang.Object r8 = r10.f4522v
            r4.h r8 = (r4.h) r8
            if (r8 == 0) goto L83
            r6.e(r8)
        L83:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: r4.s.b(long, r4.d, ud.c):java.lang.Object");
    }

    public final void c() {
        ReentrantLock reentrantLock = this.f11218c;
        reentrantLock.lock();
        try {
            this.f11220e = true;
            for (h hVar : this.f) {
                if (hVar != null) {
                    hVar.close();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void d(StringBuilder sb2) {
        pd.h hVar = this.f11222h;
        ReentrantLock reentrantLock = this.f11218c;
        reentrantLock.lock();
        try {
            qd.c cVarJ = fa.b.j();
            int i = hVar.f10549x;
            for (int i10 = 0; i10 < i; i10++) {
                cVarJ.add(hVar.get(i10));
            }
            qd.c cVarB = fa.b.b(cVarJ);
            sb2.append('\t' + toString() + " (");
            sb2.append("capacity=" + this.f11216a + ", ");
            StringBuilder sb3 = new StringBuilder();
            sb3.append("permits=");
            ue.h hVar2 = this.f11221g;
            hVar2.getClass();
            sb3.append(Math.max(ue.g.B.get(hVar2), 0));
            sb3.append(", ");
            sb2.append(sb3.toString());
            sb2.append("queue=(size=" + cVarB.a() + ")[" + pd.j.I(cVarB, null, null, null, null, 63) + ']');
            sb2.append(")");
            sb2.append('\n');
            h[] hVarArr = this.f;
            int length = hVarArr.length;
            int i11 = 0;
            for (int i12 = 0; i12 < length; i12++) {
                h hVar3 = hVarArr[i12];
                i11++;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("\t\t[");
                sb4.append(i11);
                sb4.append("] - ");
                sb4.append(hVar3 != null ? hVar3.f11189v.toString() : null);
                sb2.append(sb4.toString());
                sb2.append('\n');
                if (hVar3 != null) {
                    hVar3.l(sb2);
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void e(h hVar) {
        de.i.e(hVar, "connection");
        ReentrantLock reentrantLock = this.f11218c;
        reentrantLock.lock();
        try {
            this.f11222h.addLast(hVar);
            reentrantLock.unlock();
            this.f11221g.c();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
