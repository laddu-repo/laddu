package c6;

import android.os.SystemClock;
import android.util.Log;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class g0 implements g, f {
    public volatile g6.r A;
    public volatile e B;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final h f2172v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final j f2173w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public volatile int f2174x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public volatile d f2175y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public volatile Object f2176z;

    public g0(h hVar, j jVar) {
        this.f2172v = hVar;
        this.f2173w = jVar;
    }

    @Override // c6.f
    public final void a(a6.f fVar, Exception exc, com.bumptech.glide.load.data.d dVar, int i) {
        this.f2173w.a(fVar, exc, dVar, this.A.f5696c.d());
    }

    @Override // c6.f
    public final void b(a6.f fVar, Object obj, com.bumptech.glide.load.data.d dVar, int i, a6.f fVar2) {
        this.f2173w.b(fVar, obj, dVar, this.A.f5696c.d(), fVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    @Override // c6.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f2176z
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L20
            java.lang.Object r0 = r6.f2176z
            r6.f2176z = r1
            boolean r0 = r6.d(r0)     // Catch: java.io.IOException -> L11
            if (r0 != 0) goto L20
            goto L2c
        L11:
            r0 = move-exception
            r3 = 3
            java.lang.String r4 = "SourceGenerator"
            boolean r3 = android.util.Log.isLoggable(r4, r3)
            if (r3 == 0) goto L20
            java.lang.String r3 = "Failed to properly rewind or write data to cache"
            android.util.Log.d(r4, r3, r0)
        L20:
            c6.d r0 = r6.f2175y
            if (r0 == 0) goto L2d
            c6.d r0 = r6.f2175y
            boolean r0 = r0.c()
            if (r0 == 0) goto L2d
        L2c:
            return r2
        L2d:
            r6.f2175y = r1
            r6.A = r1
            r0 = 0
        L32:
            if (r0 != 0) goto L91
            int r1 = r6.f2174x
            c6.h r3 = r6.f2172v
            java.util.ArrayList r3 = r3.b()
            int r3 = r3.size()
            if (r1 >= r3) goto L91
            c6.h r1 = r6.f2172v
            java.util.ArrayList r1 = r1.b()
            int r3 = r6.f2174x
            int r4 = r3 + 1
            r6.f2174x = r4
            java.lang.Object r1 = r1.get(r3)
            g6.r r1 = (g6.r) r1
            r6.A = r1
            g6.r r1 = r6.A
            if (r1 == 0) goto L32
            c6.h r1 = r6.f2172v
            c6.l r1 = r1.f2190p
            g6.r r3 = r6.A
            com.bumptech.glide.load.data.d r3 = r3.f5696c
            int r3 = r3.d()
            boolean r1 = r1.a(r3)
            if (r1 != 0) goto L7c
            c6.h r1 = r6.f2172v
            g6.r r3 = r6.A
            com.bumptech.glide.load.data.d r3 = r3.f5696c
            java.lang.Class r3 = r3.a()
            c6.z r1 = r1.c(r3)
            if (r1 == 0) goto L32
        L7c:
            g6.r r0 = r6.A
            g6.r r1 = r6.A
            com.bumptech.glide.load.data.d r1 = r1.f5696c
            c6.h r3 = r6.f2172v
            com.bumptech.glide.h r3 = r3.f2189o
            sc.b r4 = new sc.b
            r5 = 7
            r4.<init>(r5, r6, r0)
            r1.e(r3, r4)
            r0 = r2
            goto L32
        L91:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c6.g0.c():boolean");
    }

    @Override // c6.g
    public final void cancel() {
        g6.r rVar = this.A;
        if (rVar != null) {
            rVar.f5696c.cancel();
        }
    }

    public final boolean d(Object obj) throws Throwable {
        Throwable th;
        int i = v6.h.f13224b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        boolean z2 = false;
        try {
            com.bumptech.glide.load.data.f fVarH = this.f2172v.f2179c.b().h(obj);
            Object objN = fVarH.n();
            a6.b bVarD = this.f2172v.d(objN);
            a7.j jVar = new a7.j(bVarD, objN, this.f2172v.i, 9);
            a6.f fVar = this.A.f5694a;
            h hVar = this.f2172v;
            e eVar = new e(fVar, hVar.f2188n);
            e6.a aVarA = hVar.f2183h.a();
            aVarA.b(eVar, jVar);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + eVar + ", data: " + obj + ", encoder: " + bVarD + ", duration: " + v6.h.a(jElapsedRealtimeNanos));
            }
            if (aVarA.g(eVar) != null) {
                this.B = eVar;
                this.f2175y = new d(Collections.singletonList(this.A.f5694a), this.f2172v, this);
                this.A.f5696c.b();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Log.d("SourceGenerator", "Attempt to write: " + this.B + ", data: " + obj + " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...");
            }
            try {
                this.f2173w.b(this.A.f5694a, fVarH.n(), this.A.f5696c, this.A.f5696c.d(), this.A.f5694a);
                return false;
            } catch (Throwable th2) {
                th = th2;
                z2 = true;
                if (z2) {
                    throw th;
                }
                this.A.f5696c.b();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
