package f2;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.NotProvisionedException;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.internal.measurement.j5;
import j4.b0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import o5.e0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d implements i {

    /* renamed from: a, reason: collision with root package name */
    public final List f4641a;

    /* renamed from: b, reason: collision with root package name */
    public final t f4642b;

    /* renamed from: c, reason: collision with root package name */
    public final b0 f4643c;

    /* renamed from: d, reason: collision with root package name */
    public final lc.c f4644d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f4645e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f4646f;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f4647g;

    /* renamed from: h, reason: collision with root package name */
    public final u1.h f4648h;

    /* renamed from: i, reason: collision with root package name */
    public final e0 f4649i;
    public final b2.m j;

    /* renamed from: k, reason: collision with root package name */
    public final y f4650k;

    /* renamed from: l, reason: collision with root package name */
    public final UUID f4651l;

    /* renamed from: m, reason: collision with root package name */
    public final Looper f4652m;

    /* renamed from: n, reason: collision with root package name */
    public final c f4653n;

    /* renamed from: o, reason: collision with root package name */
    public int f4654o;

    /* renamed from: p, reason: collision with root package name */
    public int f4655p;

    /* renamed from: q, reason: collision with root package name */
    public HandlerThread f4656q;

    /* renamed from: r, reason: collision with root package name */
    public a f4657r;
    public y1.b s;

    /* renamed from: t, reason: collision with root package name */
    public h f4658t;

    /* renamed from: u, reason: collision with root package name */
    public byte[] f4659u;

    /* renamed from: v, reason: collision with root package name */
    public byte[] f4660v;

    /* renamed from: w, reason: collision with root package name */
    public r f4661w;

    /* renamed from: x, reason: collision with root package name */
    public s f4662x;

    public d(UUID uuid, t tVar, b0 b0Var, lc.c cVar, List list, boolean z10, boolean z11, byte[] bArr, HashMap hashMap, y yVar, Looper looper, e0 e0Var, b2.m mVar) {
        this.f4651l = uuid;
        this.f4643c = b0Var;
        this.f4644d = cVar;
        this.f4642b = tVar;
        this.f4645e = z10;
        this.f4646f = z11;
        if (bArr != null) {
            this.f4660v = bArr;
            this.f4641a = null;
        } else {
            list.getClass();
            this.f4641a = Collections.unmodifiableList(list);
        }
        this.f4647g = hashMap;
        this.f4650k = yVar;
        this.f4648h = new u1.h();
        this.f4649i = e0Var;
        this.j = mVar;
        this.f4654o = 2;
        this.f4652m = looper;
        this.f4653n = new c(this, looper, 0);
    }

    @Override // f2.i
    public final UUID a() {
        n();
        return this.f4651l;
    }

    @Override // f2.i
    public final boolean b() {
        n();
        return this.f4645e;
    }

    @Override // f2.i
    public final void c(l lVar) {
        int i6;
        n();
        boolean z10 = false;
        if (this.f4655p < 0) {
            u1.a.g("DefaultDrmSession", "Session reference count less than zero: " + this.f4655p);
            this.f4655p = 0;
        }
        if (lVar != null) {
            u1.h hVar = this.f4648h;
            synchronized (hVar.f12773x) {
                try {
                    ArrayList arrayList = new ArrayList(hVar.A);
                    arrayList.add(lVar);
                    hVar.A = Collections.unmodifiableList(arrayList);
                    Integer num = (Integer) hVar.f12774y.get(lVar);
                    if (num == null) {
                        HashSet hashSet = new HashSet(hVar.f12775z);
                        hashSet.add(lVar);
                        hVar.f12775z = Collections.unmodifiableSet(hashSet);
                    }
                    HashMap hashMap = hVar.f12774y;
                    if (num != null) {
                        i6 = num.intValue() + 1;
                    } else {
                        i6 = 1;
                    }
                    hashMap.put(lVar, Integer.valueOf(i6));
                } finally {
                }
            }
        }
        int i10 = this.f4655p + 1;
        this.f4655p = i10;
        if (i10 == 1) {
            if (this.f4654o == 2) {
                z10 = true;
            }
            u1.c.g(z10);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f4656q = handlerThread;
            handlerThread.start();
            this.f4657r = new a(this, this.f4656q.getLooper());
            if (l()) {
                h(true);
            }
        } else if (lVar != null && i() && this.f4648h.a(lVar) == 1) {
            lVar.c(this.f4654o);
        }
        g gVar = (g) this.f4644d.f8328x;
        if (gVar.H != -9223372036854775807L) {
            gVar.K.remove(this);
            Handler handler = gVar.Q;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override // f2.i
    public final void d(l lVar) {
        n();
        int i6 = this.f4655p;
        if (i6 <= 0) {
            u1.a.g("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i10 = i6 - 1;
        this.f4655p = i10;
        if (i10 == 0) {
            this.f4654o = 0;
            c cVar = this.f4653n;
            String str = u1.a0.f12750a;
            cVar.removeCallbacksAndMessages(null);
            a aVar = this.f4657r;
            synchronized (aVar) {
                aVar.removeCallbacksAndMessages(null);
                aVar.f4633a = true;
            }
            this.f4657r = null;
            this.f4656q.quit();
            this.f4656q = null;
            this.s = null;
            this.f4658t = null;
            this.f4661w = null;
            this.f4662x = null;
            byte[] bArr = this.f4659u;
            if (bArr != null) {
                this.f4642b.l(bArr);
                this.f4659u = null;
            }
        }
        if (lVar != null) {
            this.f4648h.b(lVar);
            if (this.f4648h.a(lVar) == 0) {
                lVar.e();
            }
        }
        lc.c cVar2 = this.f4644d;
        int i11 = this.f4655p;
        g gVar = (g) cVar2.f8328x;
        if (i11 == 1 && gVar.L > 0 && gVar.H != -9223372036854775807L) {
            gVar.K.add(this);
            Handler handler = gVar.Q;
            handler.getClass();
            handler.postAtTime(new a2.a(this, 21), this, SystemClock.uptimeMillis() + gVar.H);
        } else if (i11 == 0) {
            gVar.I.remove(this);
            if (gVar.N == this) {
                gVar.N = null;
            }
            if (gVar.O == this) {
                gVar.O = null;
            }
            b0 b0Var = gVar.E;
            HashSet hashSet = (HashSet) b0Var.f7158x;
            hashSet.remove(this);
            if (((d) b0Var.f7159y) == this) {
                b0Var.f7159y = null;
                if (!hashSet.isEmpty()) {
                    d dVar = (d) hashSet.iterator().next();
                    b0Var.f7159y = dVar;
                    s g10 = dVar.f4642b.g();
                    dVar.f4662x = g10;
                    a aVar2 = dVar.f4657r;
                    String str2 = u1.a0.f12750a;
                    g10.getClass();
                    aVar2.getClass();
                    aVar2.obtainMessage(1, new b(q2.u.f10969b.getAndIncrement(), true, SystemClock.elapsedRealtime(), g10)).sendToTarget();
                }
            }
            if (gVar.H != -9223372036854775807L) {
                Handler handler2 = gVar.Q;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                gVar.K.remove(this);
            }
        }
        gVar.i();
    }

    @Override // f2.i
    public final boolean e(String str) {
        n();
        byte[] bArr = this.f4659u;
        u1.c.h(bArr);
        return this.f4642b.r(str, bArr);
    }

    @Override // f2.i
    public final y1.b f() {
        n();
        return this.s;
    }

    public final void g(com.unity3d.ads.adplayer.b bVar) {
        Set set;
        u1.h hVar = this.f4648h;
        synchronized (hVar.f12773x) {
            set = hVar.f12775z;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((l) it.next()).a();
        }
    }

    @Override // f2.i
    public final h getError() {
        n();
        if (this.f4654o == 1) {
            return this.f4658t;
        }
        return null;
    }

    @Override // f2.i
    public final int getState() {
        n();
        return this.f4654o;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:40|41|42|(6:44|45|46|47|(1:49)|51)|54|45|46|47|(0)|51) */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0073 A[Catch: NumberFormatException -> 0x0077, TRY_LEAVE, TryCatch #2 {NumberFormatException -> 0x0077, blocks: (B:47:0x006b, B:49:0x0073), top: B:46:0x006b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(boolean r10) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.d.h(boolean):void");
    }

    public final boolean i() {
        int i6 = this.f4654o;
        if (i6 != 3 && i6 != 4) {
            return false;
        }
        return true;
    }

    public final void j(Throwable th, int i6) {
        int i10;
        Set set;
        if (th instanceof MediaDrm.MediaDrmStateException) {
            i10 = u1.a0.x(u1.a0.y(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
        } else {
            if (Build.VERSION.SDK_INT < 23 || !android.support.v4.media.c.y(th)) {
                if (!(th instanceof NotProvisionedException) && !j5.n(th)) {
                    if (th instanceof DeniedByServerException) {
                        i10 = 6007;
                    } else if (th instanceof a0) {
                        i10 = 6001;
                    } else if (th instanceof e) {
                        i10 = 6003;
                    } else if (th instanceof x) {
                        i10 = 6008;
                    } else if (i6 != 1) {
                        if (i6 == 2) {
                            i10 = 6004;
                        } else if (i6 != 3) {
                            throw new IllegalArgumentException();
                        }
                    }
                }
                i10 = 6002;
            }
            i10 = 6006;
        }
        this.f4658t = new h(th, i10);
        u1.a.h("DefaultDrmSession", "DRM session error", th);
        if (th instanceof Exception) {
            u1.h hVar = this.f4648h;
            synchronized (hVar.f12773x) {
                set = hVar.f12775z;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((l) it.next()).d((Exception) th);
            }
        } else if (th instanceof Error) {
            if (!j5.o(th) && !j5.n(th)) {
                throw ((Error) th);
            }
        } else {
            throw new IllegalStateException("Unexpected Throwable subclass", th);
        }
        if (this.f4654o != 4) {
            this.f4654o = 1;
        }
    }

    public final void k(Throwable th, boolean z10) {
        int i6;
        if (!(th instanceof NotProvisionedException) && !j5.n(th)) {
            if (z10) {
                i6 = 1;
            } else {
                i6 = 2;
            }
            j(th, i6);
            return;
        }
        this.f4643c.z(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean l() {
        /*
            r4 = this;
            boolean r0 = r4.i()
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            f2.t r0 = r4.f4642b     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            byte[] r0 = r0.j()     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            r4.f4659u = r0     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            f2.t r2 = r4.f4642b     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            b2.m r3 = r4.j     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            r2.q(r0, r3)     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            f2.t r0 = r4.f4642b     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            byte[] r2 = r4.f4659u     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            y1.b r0 = r0.h(r2)     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            r4.s = r0     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            r0 = 3
            r4.f4654o = r0     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            u1.h r2 = r4.f4648h     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            java.lang.Object r3 = r2.f12773x     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            monitor-enter(r3)     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            java.util.Set r2 = r2.f12775z     // Catch: java.lang.Throwable -> L4a
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L4a
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
        L30:
            boolean r3 = r2.hasNext()     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            if (r3 == 0) goto L40
            java.lang.Object r3 = r2.next()     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            f2.l r3 = (f2.l) r3     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            r3.c(r0)     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            goto L30
        L40:
            byte[] r0 = r4.f4659u     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            r0.getClass()     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            return r1
        L46:
            r0 = move-exception
            goto L4d
        L48:
            r0 = move-exception
            goto L4d
        L4a:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L4a
            throw r0     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
        L4d:
            boolean r2 = com.google.android.gms.internal.measurement.j5.n(r0)
            if (r2 == 0) goto L59
            j4.b0 r0 = r4.f4643c
            r0.z(r4)
            goto L62
        L59:
            r4.j(r0, r1)
            goto L62
        L5d:
            j4.b0 r0 = r4.f4643c
            r0.z(r4)
        L62:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.d.l():boolean");
    }

    public final void m(int i6, boolean z10, byte[] bArr) {
        try {
            r o10 = this.f4642b.o(bArr, this.f4641a, i6, this.f4647g);
            this.f4661w = o10;
            a aVar = this.f4657r;
            String str = u1.a0.f12750a;
            o10.getClass();
            aVar.getClass();
            aVar.obtainMessage(2, new b(q2.u.f10969b.getAndIncrement(), z10, SystemClock.elapsedRealtime(), o10)).sendToTarget();
        } catch (Exception | NoSuchMethodError e10) {
            k(e10, true);
        }
    }

    public final void n() {
        Thread currentThread = Thread.currentThread();
        Looper looper = this.f4652m;
        if (currentThread != looper.getThread()) {
            u1.a.q("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }
}
