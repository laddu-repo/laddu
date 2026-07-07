package i4;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.Surface;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h1 extends Binder implements k {

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f6392e;

    /* renamed from: f, reason: collision with root package name */
    public final ic.s f6393f;

    /* renamed from: g, reason: collision with root package name */
    public final Set f6394g;

    /* renamed from: h, reason: collision with root package name */
    public db.b1 f6395h;

    /* renamed from: i, reason: collision with root package name */
    public int f6396i;

    public h1(b0 b0Var) {
        attachInterface(this, "androidx.media3.session.IMediaSession");
        this.f6392e = new WeakReference(b0Var);
        this.f6393f = new ic.s(b0Var);
        this.f6394g = Collections.synchronizedSet(new HashSet());
        this.f6395h = db.b1.F;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [hb.x, java.lang.Object] */
    public static hb.x K(b0 b0Var, s sVar, int i6, g1 g1Var, u1.g gVar) {
        if (b0Var.j()) {
            return hb.u.f6034y;
        }
        hb.x xVar = (hb.x) g1Var.c(b0Var, sVar, i6);
        ?? obj = new Object();
        xVar.a(new c2.a0(b0Var, obj, gVar, xVar, 4), hb.q.f6029x);
        return obj;
    }

    public static void Q(b0 b0Var, s sVar, int i6, s1 s1Var) {
        try {
            r rVar = sVar.f6542d;
            u1.c.h(rVar);
            rVar.a(i6, s1Var);
            b0Var.f6303c.a(true, true);
        } catch (RemoteException e10) {
            u1.a.q("MediaSessionStub", "Failed to send result to controller " + sVar, e10);
        }
    }

    public static a2.e0 R(u1.g gVar) {
        return new a2.e0(new a2.e0(gVar, 26), 25);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [b2.k, db.c0] */
    public final j1 J(j1 j1Var) {
        db.k0 k0Var = j1Var.D.f11582a;
        db.h0 j = db.k0.j();
        ?? kVar = new b2.k(4);
        for (int i6 = 0; i6 < k0Var.size(); i6++) {
            r1.k1 k1Var = (r1.k1) k0Var.get(i6);
            r1.e1 e1Var = k1Var.f11571b;
            String str = (String) this.f6395h.get(e1Var);
            if (str == null) {
                StringBuilder sb2 = new StringBuilder();
                int i10 = this.f6396i;
                this.f6396i = i10 + 1;
                String str2 = u1.a0.f12750a;
                sb2.append(Integer.toString(i10, 36));
                sb2.append("-");
                sb2.append(e1Var.f11387b);
                str = sb2.toString();
            }
            kVar.E(e1Var, str);
            j.a(new r1.k1(new r1.e1(str, k1Var.f11571b.f11389d), k1Var.f11572c, k1Var.f11573d, k1Var.f11574e));
        }
        this.f6395h = kVar.c();
        j1 a10 = j1Var.a(new r1.l1(j.g()));
        r1.j1 j1Var2 = a10.E;
        if (j1Var2.D.isEmpty()) {
            return a10;
        }
        r1.i1 c10 = j1Var2.a().c();
        db.q1 it = j1Var2.D.values().iterator();
        while (it.hasNext()) {
            r1.f1 f1Var = (r1.f1) it.next();
            r1.e1 e1Var2 = f1Var.f11397a;
            String str3 = (String) this.f6395h.get(e1Var2);
            if (str3 != null) {
                c10.a(new r1.f1(new r1.e1(str3, e1Var2.f11389d), f1Var.f11398b));
            } else {
                c10.a(f1Var);
            }
        }
        return a10.d(c10.b());
    }

    public final void L(j jVar, int i6) {
        if (jVar == null) {
            return;
        }
        O(jVar, i6, 26, R(new com.unity3d.ads.adplayer.b(18)));
    }

    public final int M(s sVar, l1 l1Var, int i6) {
        if (l1Var.n0(17)) {
            ic.s sVar2 = this.f6393f;
            if (!sVar2.t(sVar, 17) && sVar2.t(sVar, 16)) {
                return l1Var.m0() + i6;
            }
        }
        return i6;
    }

    public final void N(j jVar, int i6, Bundle bundle) {
        n1 n1Var;
        f fVar;
        if (jVar != null && bundle != null) {
            try {
                s1 a10 = s1.a(bundle);
                long clearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    ic.s sVar = this.f6393f;
                    IBinder iBinder = ((i) jVar).f6397e;
                    synchronized (sVar.f6781x) {
                        try {
                            s j = sVar.j(iBinder);
                            n1Var = null;
                            if (j != null) {
                                fVar = (f) ((v.e) sVar.f6783z).get(j);
                            } else {
                                fVar = null;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (fVar != null) {
                        n1Var = fVar.f6344b;
                    }
                    if (n1Var == null) {
                        return;
                    }
                    n1Var.e(i6, a10);
                } finally {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                }
            } catch (RuntimeException e10) {
                u1.a.q("MediaSessionStub", "Ignoring malformed Bundle for SessionResult", e10);
            }
        }
    }

    public final void O(j jVar, int i6, int i10, g1 g1Var) {
        s j = this.f6393f.j(((i) jVar).f6397e);
        if (j != null) {
            P(j, i6, i10, g1Var);
        }
    }

    public final void P(final s sVar, final int i6, final int i10, final g1 g1Var) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            final b0 b0Var = (b0) this.f6392e.get();
            if (b0Var != null && !b0Var.j()) {
                u1.a0.U(b0Var.f6311l, new Runnable() { // from class: i4.z0
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r3v4, types: [i4.e, java.lang.Object] */
                    @Override // java.lang.Runnable
                    public final void run() {
                        ic.s sVar2 = h1.this.f6393f;
                        final s sVar3 = sVar;
                        int i11 = i10;
                        boolean t10 = sVar2.t(sVar3, i11);
                        final b0 b0Var2 = b0Var;
                        final int i12 = i6;
                        if (!t10) {
                            h1.Q(b0Var2, sVar3, i12, new s1(-4));
                            return;
                        }
                        zb.d dVar = b0Var2.f6305e;
                        b0Var2.s(sVar3);
                        dVar.getClass();
                        final g1 g1Var2 = g1Var;
                        if (i11 == 27) {
                            g1Var2.c(b0Var2, sVar3, i12);
                            sVar2.b(sVar3, i11, new Object());
                        } else {
                            sVar2.b(sVar3, i11, new e() { // from class: i4.c1
                                @Override // i4.e
                                public final hb.x run() {
                                    return (hb.x) g1.this.c(b0Var2, sVar3, i12);
                                }
                            });
                        }
                    }
                });
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    public final void S(j jVar, int i6, boolean z10) {
        if (jVar == null) {
            return;
        }
        O(jVar, i6, 26, R(new a2.d0(3, z10)));
    }

    public final void T(j jVar, int i6, int i10) {
        if (jVar != null && i10 >= 0) {
            O(jVar, i6, 25, R(new a2.a0(i10, 7)));
        }
    }

    public final void U(j jVar, int i6, Bundle bundle, boolean z10) {
        if (jVar != null && bundle != null) {
            try {
                O(jVar, i6, 31, new a1(new b2.b(6, new s0(r1.e0.a(bundle), z10, 0), new u0(8)), 1));
            } catch (RuntimeException e10) {
                u1.a.q("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e10);
            }
        }
    }

    public final void V(j jVar, int i6, Bundle bundle, long j) {
        if (jVar != null && bundle != null) {
            try {
                O(jVar, i6, 31, new a1(new b2.b(6, new w0(r1.e0.a(bundle), j), new u0(8)), 1));
            } catch (RuntimeException e10) {
                u1.a.q("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e10);
            }
        }
    }

    public final void W(j jVar, int i6, IBinder iBinder, boolean z10) {
        if (jVar != null && iBinder != null) {
            try {
                db.k0 a10 = r1.f.a(iBinder);
                db.h0 j = db.k0.j();
                for (int i10 = 0; i10 < a10.size(); i10++) {
                    Bundle bundle = (Bundle) a10.get(i10);
                    bundle.getClass();
                    j.a(r1.e0.a(bundle));
                }
                O(jVar, i6, 20, new a1(new b2.b(6, new s0(j.g(), z10, 2), new u0(8)), 1));
            } catch (RuntimeException e10) {
                u1.a.q("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e10);
            }
        }
    }

    public final void X(j jVar, int i6, IBinder iBinder, int i10, long j) {
        if (jVar != null && iBinder != null) {
            if (i10 == -1 || i10 >= 0) {
                try {
                    db.k0 a10 = r1.f.a(iBinder);
                    db.h0 j10 = db.k0.j();
                    for (int i11 = 0; i11 < a10.size(); i11++) {
                        Bundle bundle = (Bundle) a10.get(i11);
                        bundle.getClass();
                        j10.a(r1.e0.a(bundle));
                    }
                    O(jVar, i6, 20, new a1(new b2.b(6, new b2.e(j, j10.g(), i10), new u0(8)), 1));
                } catch (RuntimeException e10) {
                    u1.a.q("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e10);
                }
            }
        }
    }

    public final void Y(j jVar, int i6, float f3) {
        if (jVar != null && f3 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f3 <= 1.0f) {
            O(jVar, i6, 24, R(new a2.f0(2, f3)));
        }
    }

    public final void a(j jVar, int i6) {
        if (jVar == null) {
            return;
        }
        O(jVar, i6, 26, R(new com.unity3d.ads.adplayer.b(28)));
    }

    public final void d(j jVar, final int i6, final o1 o1Var, final int i10, final g1 g1Var) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            final b0 b0Var = (b0) this.f6392e.get();
            if (b0Var != null && !b0Var.j()) {
                final s j = this.f6393f.j(((i) jVar).f6397e);
                if (j == null) {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                } else {
                    u1.a0.U(b0Var.f6311l, new Runnable() { // from class: i4.y0
                        @Override // java.lang.Runnable
                        public final void run() {
                            ic.s sVar = h1.this.f6393f;
                            s sVar2 = j;
                            if (!sVar.s(sVar2)) {
                                return;
                            }
                            o1 o1Var2 = o1Var;
                            b0 b0Var2 = b0Var;
                            int i11 = i6;
                            if (o1Var2 != null) {
                                if (!sVar.v(sVar2, o1Var2)) {
                                    h1.Q(b0Var2, sVar2, i11, new s1(-4));
                                    return;
                                }
                            } else if (!sVar.u(sVar2, i10)) {
                                h1.Q(b0Var2, sVar2, i11, new s1(-4));
                                return;
                            }
                            g1Var.c(b0Var2, sVar2, i11);
                        }
                    });
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                }
            }
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x002e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x0034. Please report as an issue. */
    @Override // android.os.Binder
    public final boolean onTransact(int i6, Parcel parcel, Parcel parcel2, int i10) {
        o1 o1Var;
        h1 h1Var;
        if (i6 >= 1 && i6 <= 16777215) {
            parcel.enforceInterface("androidx.media3.session.IMediaSession");
        }
        if (i6 == 1598968902) {
            parcel2.writeString("androidx.media3.session.IMediaSession");
            return true;
        }
        switch (i6) {
            case 3002:
                Y(n.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readFloat());
                return true;
            case 3003:
                T(n.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                return true;
            case 3004:
                L(n.a(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3005:
                a(n.a(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3006:
                S(n.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0);
                return true;
            case 3007:
                U(n.a(parcel.readStrongBinder()), parcel.readInt(), (Bundle) k6.e.a(parcel, Bundle.CREATOR), true);
                return true;
            case 3008:
                V(n.a(parcel.readStrongBinder()), parcel.readInt(), (Bundle) k6.e.a(parcel, Bundle.CREATOR), parcel.readLong());
                return true;
            case 3009:
                U(n.a(parcel.readStrongBinder()), parcel.readInt(), (Bundle) k6.e.a(parcel, Bundle.CREATOR), parcel.readInt() != 0);
                return true;
            case 3010:
                W(n.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), true);
                return true;
            case 3011:
                W(n.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), parcel.readInt() != 0);
                return true;
            case 3012:
                X(n.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), parcel.readInt(), parcel.readLong());
                return true;
            case 3013:
                j a10 = n.a(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                boolean z10 = parcel.readInt() != 0;
                if (a10 != null) {
                    O(a10, readInt, 1, R(new a2.d0(2, z10)));
                    return true;
                }
                return true;
            case 3014:
                N(n.a(parcel.readStrongBinder()), parcel.readInt(), (Bundle) k6.e.a(parcel, Bundle.CREATOR));
                return true;
            case 3015:
                j a11 = n.a(parcel.readStrongBinder());
                parcel.readInt();
                Bundle bundle = (Bundle) k6.e.a(parcel, Bundle.CREATOR);
                WeakReference weakReference = this.f6392e;
                if (a11 != null && bundle != null) {
                    try {
                        g a12 = g.a(bundle);
                        int callingUid = Binder.getCallingUid();
                        int callingPid = Binder.getCallingPid();
                        long clearCallingIdentity = Binder.clearCallingIdentity();
                        if (callingPid == 0) {
                            callingPid = a12.f6361d;
                        }
                        try {
                            j4.d0 d0Var = new j4.d0(a12.f6360c, callingPid, callingUid);
                            b0 b0Var = (b0) weakReference.get();
                            boolean z11 = b0Var != null && j4.g0.a(b0Var.f6306f).b(d0Var);
                            int i11 = a12.f6358a;
                            int i12 = a12.f6359b;
                            s sVar = new s(d0Var, i11, i12, z11, new d1(a11, i12), a12.f6362e);
                            b0 b0Var2 = (b0) weakReference.get();
                            if (b0Var2 != null && !b0Var2.j()) {
                                this.f6394g.add(sVar);
                                try {
                                    try {
                                        u1.a0.U(b0Var2.f6311l, new c2.a0(this, sVar, b0Var2, a11, 3));
                                    } catch (Throwable th) {
                                        th = th;
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                            cf.m.g(a11);
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } catch (RuntimeException e10) {
                        u1.a.q("MediaSessionStub", "Ignoring malformed Bundle for ConnectionRequest", e10);
                    }
                }
                return true;
            case 3016:
                j a13 = n.a(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                Parcelable.Creator creator = Bundle.CREATOR;
                Bundle bundle2 = (Bundle) k6.e.a(parcel, creator);
                Bundle bundle3 = (Bundle) k6.e.a(parcel, creator);
                if (a13 != null && bundle2 != null && bundle3 != null) {
                    try {
                        int i13 = bundle2.getInt(o1.f6489f, 0);
                        if (i13 != 0) {
                            o1Var = new o1(i13);
                        } else {
                            String string = bundle2.getString(o1.f6490g);
                            string.getClass();
                            Bundle bundle4 = bundle2.getBundle(o1.f6491h);
                            if (bundle4 == null) {
                                bundle4 = Bundle.EMPTY;
                            }
                            o1Var = new o1(string, bundle4);
                        }
                        h1Var = this;
                        h1Var.d(a13, readInt2, o1Var, 0, new a1(new com.unity3d.ads.adplayer.b(20, o1Var, bundle3), 1));
                    } catch (RuntimeException e11) {
                        u1.a.q("MediaSessionStub", "Ignoring malformed Bundle for SessionCommand", e11);
                    }
                    return true;
                }
                return true;
            case 3017:
                j a14 = n.a(parcel.readStrongBinder());
                int readInt3 = parcel.readInt();
                int readInt4 = parcel.readInt();
                if (a14 != null && (readInt4 == 2 || readInt4 == 0 || readInt4 == 1)) {
                    O(a14, readInt3, 15, R(new a2.a0(readInt4, 6)));
                    return true;
                }
                return true;
            case 3018:
                j a15 = n.a(parcel.readStrongBinder());
                int readInt5 = parcel.readInt();
                boolean z12 = parcel.readInt() != 0;
                if (a15 != null) {
                    O(a15, readInt5, 14, R(new a2.d0(4, z12)));
                    return true;
                }
                return true;
            case 3019:
                j a16 = n.a(parcel.readStrongBinder());
                int readInt6 = parcel.readInt();
                int readInt7 = parcel.readInt();
                if (a16 != null && readInt7 >= 0) {
                    O(a16, readInt6, 20, new a2.e0(new q0(this, readInt7, 4), 25));
                    return true;
                }
                return true;
            case 3020:
                j a17 = n.a(parcel.readStrongBinder());
                int readInt8 = parcel.readInt();
                int readInt9 = parcel.readInt();
                int readInt10 = parcel.readInt();
                if (a17 != null && readInt9 >= 0 && readInt10 >= readInt9) {
                    O(a17, readInt8, 20, new a2.e0(new p0(this, readInt9, readInt10), 25));
                    return true;
                }
                return true;
            case 3021:
                j a18 = n.a(parcel.readStrongBinder());
                int readInt11 = parcel.readInt();
                if (a18 != null) {
                    O(a18, readInt11, 20, R(new u0(6)));
                    return true;
                }
                return true;
            case 3022:
                j a19 = n.a(parcel.readStrongBinder());
                int readInt12 = parcel.readInt();
                int readInt13 = parcel.readInt();
                int readInt14 = parcel.readInt();
                if (a19 != null && readInt13 >= 0 && readInt14 >= 0) {
                    O(a19, readInt12, 20, R(new a2.z(readInt13, readInt14, 2)));
                    return true;
                }
                return true;
            case 3023:
                j a20 = n.a(parcel.readStrongBinder());
                int readInt15 = parcel.readInt();
                final int readInt16 = parcel.readInt();
                final int readInt17 = parcel.readInt();
                final int readInt18 = parcel.readInt();
                if (a20 != null && readInt16 >= 0 && readInt17 >= readInt16 && readInt18 >= 0) {
                    O(a20, readInt15, 20, R(new u1.g() { // from class: i4.t0
                        @Override // u1.g
                        public final void accept(Object obj) {
                            ((l1) obj).t0(readInt16, readInt17, readInt18);
                        }
                    }));
                    return true;
                }
                return true;
            case 3024:
                j a21 = n.a(parcel.readStrongBinder());
                int readInt19 = parcel.readInt();
                if (a21 != null) {
                    s j = this.f6393f.j(((i) a21).f6397e);
                    if (j != null) {
                        P(j, readInt19, 1, R(new b2.b(5, this, j)));
                        return true;
                    }
                }
                return true;
            case 3025:
                j a22 = n.a(parcel.readStrongBinder());
                int readInt20 = parcel.readInt();
                if (a22 != null) {
                    s j10 = this.f6393f.j(((i) a22).f6397e);
                    if (j10 != null) {
                        P(j10, readInt20, 1, R(new com.unity3d.ads.adplayer.b(16)));
                        return true;
                    }
                }
                return true;
            case 3026:
                j a23 = n.a(parcel.readStrongBinder());
                int readInt21 = parcel.readInt();
                if (a23 != null) {
                    O(a23, readInt21, 2, R(new u0(3)));
                    return true;
                }
                return true;
            case 3027:
                j a24 = n.a(parcel.readStrongBinder());
                int readInt22 = parcel.readInt();
                Bundle bundle5 = (Bundle) k6.e.a(parcel, Bundle.CREATOR);
                if (a24 != null && bundle5 != null) {
                    try {
                        O(a24, readInt22, 13, R(new a2.e0(new r1.o0(bundle5.getFloat(r1.o0.f11594e, 1.0f), bundle5.getFloat(r1.o0.f11595f, 1.0f)), 23)));
                    } catch (RuntimeException e12) {
                        u1.a.q("MediaSessionStub", "Ignoring malformed Bundle for PlaybackParameters", e12);
                    }
                }
                return true;
            case 3028:
                j a25 = n.a(parcel.readStrongBinder());
                int readInt23 = parcel.readInt();
                float readFloat = parcel.readFloat();
                if (a25 != null && readFloat > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    O(a25, readInt23, 13, R(new a2.f0(1, readFloat)));
                    return true;
                }
                return true;
            case 3029:
                j a26 = n.a(parcel.readStrongBinder());
                int readInt24 = parcel.readInt();
                Bundle bundle6 = (Bundle) k6.e.a(parcel, Bundle.CREATOR);
                if (a26 != null && bundle6 != null) {
                    try {
                        final r1.e0 a27 = r1.e0.a(bundle6);
                        final int i14 = 2;
                        O(a26, readInt24, 20, new a1(new b2.b(7, new g1() { // from class: i4.r0
                            @Override // i4.g1
                            public final Object c(b0 b0Var3, s sVar2, int i15) {
                                switch (i14) {
                                    case 0:
                                        return b0Var3.l(sVar2, db.k0.o(a27));
                                    case 1:
                                        return b0Var3.l(sVar2, db.k0.o(a27));
                                    default:
                                        return b0Var3.l(sVar2, db.k0.o(a27));
                                }
                            }
                        }, new com.unity3d.ads.adplayer.b(29)), 1));
                    } catch (RuntimeException e13) {
                        u1.a.q("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e13);
                    }
                }
                return true;
            case 3030:
                j a28 = n.a(parcel.readStrongBinder());
                int readInt25 = parcel.readInt();
                int readInt26 = parcel.readInt();
                Bundle bundle7 = (Bundle) k6.e.a(parcel, Bundle.CREATOR);
                if (a28 != null && bundle7 != null && readInt26 >= 0) {
                    try {
                        final r1.e0 a29 = r1.e0.a(bundle7);
                        final int i15 = 0;
                        O(a28, readInt25, 20, new a1(new b2.b(7, new g1() { // from class: i4.r0
                            @Override // i4.g1
                            public final Object c(b0 b0Var3, s sVar2, int i152) {
                                switch (i15) {
                                    case 0:
                                        return b0Var3.l(sVar2, db.k0.o(a29));
                                    case 1:
                                        return b0Var3.l(sVar2, db.k0.o(a29));
                                    default:
                                        return b0Var3.l(sVar2, db.k0.o(a29));
                                }
                            }
                        }, new q0(this, readInt26, 1)), 1));
                    } catch (RuntimeException e14) {
                        u1.a.q("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e14);
                    }
                }
                return true;
            case 3031:
                j a30 = n.a(parcel.readStrongBinder());
                int readInt27 = parcel.readInt();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (a30 != null && readStrongBinder != null) {
                    try {
                        db.k0 a31 = r1.f.a(readStrongBinder);
                        db.h0 j11 = db.k0.j();
                        for (int i16 = 0; i16 < a31.size(); i16++) {
                            Bundle bundle8 = (Bundle) a31.get(i16);
                            bundle8.getClass();
                            j11.a(r1.e0.a(bundle8));
                        }
                        O(a30, readInt27, 20, new a1(new b2.b(7, new a2.i0(3, j11.g()), new com.unity3d.ads.adplayer.b(27)), 1));
                    } catch (RuntimeException e15) {
                        u1.a.q("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e15);
                    }
                }
                return true;
            case 3032:
                j a32 = n.a(parcel.readStrongBinder());
                int readInt28 = parcel.readInt();
                int readInt29 = parcel.readInt();
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (a32 != null && readStrongBinder2 != null && readInt29 >= 0) {
                    try {
                        db.k0 a33 = r1.f.a(readStrongBinder2);
                        db.h0 j12 = db.k0.j();
                        for (int i17 = 0; i17 < a33.size(); i17++) {
                            Bundle bundle9 = (Bundle) a33.get(i17);
                            bundle9.getClass();
                            j12.a(r1.e0.a(bundle9));
                        }
                        O(a32, readInt28, 20, new a1(new b2.b(7, new a2.i0(2, j12.g()), new q0(this, readInt29, 3)), 1));
                    } catch (RuntimeException e16) {
                        u1.a.q("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e16);
                    }
                }
                return true;
            case 3033:
                j a34 = n.a(parcel.readStrongBinder());
                int readInt30 = parcel.readInt();
                Bundle bundle10 = (Bundle) k6.e.a(parcel, Bundle.CREATOR);
                if (a34 != null && bundle10 != null) {
                    try {
                        O(a34, readInt30, 19, R(new a2.x(r1.h0.b(bundle10))));
                    } catch (RuntimeException e17) {
                        u1.a.q("MediaSessionStub", "Ignoring malformed Bundle for MediaMetadata", e17);
                    }
                }
                return true;
            case 3034:
                j a35 = n.a(parcel.readStrongBinder());
                int readInt31 = parcel.readInt();
                if (a35 != null) {
                    s j13 = this.f6393f.j(((i) a35).f6397e);
                    if (j13 != null) {
                        P(j13, readInt31, 3, R(new u0(1)));
                        return true;
                    }
                }
                return true;
            case 3035:
                j a36 = n.a(parcel.readStrongBinder());
                parcel.readInt();
                if (a36 != null) {
                    long clearCallingIdentity2 = Binder.clearCallingIdentity();
                    try {
                        b0 b0Var3 = (b0) this.f6392e.get();
                        if (b0Var3 != null && !b0Var3.j()) {
                            u1.a0.U(b0Var3.f6311l, new a2.c0(23, this, a36));
                            return true;
                        }
                        return true;
                    } finally {
                    }
                }
                return true;
            case 3036:
                j a37 = n.a(parcel.readStrongBinder());
                int readInt32 = parcel.readInt();
                if (a37 != null) {
                    O(a37, readInt32, 4, R(new u0(4)));
                    return true;
                }
                return true;
            case 3037:
                j a38 = n.a(parcel.readStrongBinder());
                int readInt33 = parcel.readInt();
                int readInt34 = parcel.readInt();
                if (a38 != null && readInt34 >= 0) {
                    O(a38, readInt33, 10, new a2.e0(new q0(this, readInt34, 0), 25));
                    return true;
                }
                return true;
            case 3038:
                j a39 = n.a(parcel.readStrongBinder());
                int readInt35 = parcel.readInt();
                final long readLong = parcel.readLong();
                if (a39 != null) {
                    O(a39, readInt35, 5, R(new u1.g() { // from class: i4.x0
                        @Override // u1.g
                        public final void accept(Object obj) {
                            ((l1) obj).M(readLong);
                        }
                    }));
                    return true;
                }
                return true;
            case 3039:
                j a40 = n.a(parcel.readStrongBinder());
                int readInt36 = parcel.readInt();
                int readInt37 = parcel.readInt();
                long readLong2 = parcel.readLong();
                if (a40 != null && readInt37 >= 0) {
                    O(a40, readInt36, 10, new a2.e0(new b2.e(readLong2, this, readInt37), 25));
                    return true;
                }
                return true;
            case 3040:
                j a41 = n.a(parcel.readStrongBinder());
                int readInt38 = parcel.readInt();
                if (a41 != null) {
                    s j14 = this.f6393f.j(((i) a41).f6397e);
                    if (j14 != null) {
                        P(j14, readInt38, 11, R(new com.unity3d.ads.adplayer.b(19)));
                        return true;
                    }
                }
                return true;
            case 3041:
                j a42 = n.a(parcel.readStrongBinder());
                int readInt39 = parcel.readInt();
                if (a42 != null) {
                    s j15 = this.f6393f.j(((i) a42).f6397e);
                    if (j15 != null) {
                        P(j15, readInt39, 12, R(new com.unity3d.ads.adplayer.b(24)));
                        return true;
                    }
                }
                return true;
            case 3042:
                j a43 = n.a(parcel.readStrongBinder());
                int readInt40 = parcel.readInt();
                if (a43 != null) {
                    O(a43, readInt40, 6, R(new com.unity3d.ads.adplayer.b(22)));
                    return true;
                }
                return true;
            case 3043:
                j a44 = n.a(parcel.readStrongBinder());
                int readInt41 = parcel.readInt();
                if (a44 != null) {
                    O(a44, readInt41, 8, R(new com.unity3d.ads.adplayer.b(17)));
                    return true;
                }
                return true;
            case 3044:
                j a45 = n.a(parcel.readStrongBinder());
                int readInt42 = parcel.readInt();
                Surface surface = (Surface) k6.e.a(parcel, Surface.CREATOR);
                if (a45 != null) {
                    O(a45, readInt42, 27, R(new a2.e0(surface, 24)));
                    return true;
                }
                return true;
            case 3045:
                j a46 = n.a(parcel.readStrongBinder());
                if (a46 != null) {
                    long clearCallingIdentity3 = Binder.clearCallingIdentity();
                    try {
                        b0 b0Var4 = (b0) this.f6392e.get();
                        if (b0Var4 != null && !b0Var4.j()) {
                            s j16 = this.f6393f.j(((i) a46).f6397e);
                            if (j16 != null) {
                                u1.a0.U(b0Var4.f6311l, new a2.c0(24, this, j16));
                            }
                            return true;
                        }
                        return true;
                    } finally {
                    }
                }
                return true;
            case 3046:
                j a47 = n.a(parcel.readStrongBinder());
                int readInt43 = parcel.readInt();
                if (a47 != null) {
                    s j17 = this.f6393f.j(((i) a47).f6397e);
                    if (j17 != null) {
                        P(j17, readInt43, 7, R(new com.unity3d.ads.adplayer.b(21)));
                        return true;
                    }
                }
                return true;
            case 3047:
                j a48 = n.a(parcel.readStrongBinder());
                int readInt44 = parcel.readInt();
                if (a48 != null) {
                    s j18 = this.f6393f.j(((i) a48).f6397e);
                    if (j18 != null) {
                        P(j18, readInt44, 9, R(new com.unity3d.ads.adplayer.b(25)));
                        return true;
                    }
                }
                return true;
            case 3048:
                j a49 = n.a(parcel.readStrongBinder());
                int readInt45 = parcel.readInt();
                Bundle bundle11 = (Bundle) k6.e.a(parcel, Bundle.CREATOR);
                if (a49 != null && bundle11 != null) {
                    try {
                        O(a49, readInt45, 29, R(new b2.b(4, this, r1.j1.b(bundle11))));
                    } catch (RuntimeException e18) {
                        u1.a.q("MediaSessionStub", "Ignoring malformed Bundle for TrackSelectionParameters", e18);
                    }
                }
                return true;
            case 3049:
                j a50 = n.a(parcel.readStrongBinder());
                int readInt46 = parcel.readInt();
                String readString = parcel.readString();
                Bundle bundle12 = (Bundle) k6.e.a(parcel, Bundle.CREATOR);
                if (a50 != null && readString != null && bundle12 != null) {
                    if (TextUtils.isEmpty(readString)) {
                        u1.a.p("MediaSessionStub", "setRatingWithMediaId(): Ignoring empty mediaId");
                    } else {
                        try {
                            a1 a1Var = new a1(new com.unity3d.ads.adplayer.b(26, readString, r1.v0.a(bundle12)), 1);
                            h1Var = this;
                            h1Var.d(a50, readInt46, null, 40010, a1Var);
                        } catch (RuntimeException e19) {
                            u1.a.q("MediaSessionStub", "Ignoring malformed Bundle for Rating", e19);
                        }
                        return true;
                    }
                }
                return true;
            case 3050:
                j a51 = n.a(parcel.readStrongBinder());
                int readInt47 = parcel.readInt();
                Bundle bundle13 = (Bundle) k6.e.a(parcel, Bundle.CREATOR);
                if (a51 != null && bundle13 != null) {
                    try {
                        d(a51, readInt47, null, 40010, new a1(new u0(r1.v0.a(bundle13), 9), 1));
                    } catch (RuntimeException e20) {
                        u1.a.q("MediaSessionStub", "Ignoring malformed Bundle for Rating", e20);
                    }
                }
                return true;
            case 3051:
                j a52 = n.a(parcel.readStrongBinder());
                int readInt48 = parcel.readInt();
                int readInt49 = parcel.readInt();
                int readInt50 = parcel.readInt();
                if (a52 != null && readInt49 >= 0) {
                    O(a52, readInt48, 33, R(new a2.z(readInt49, readInt50, 1)));
                    return true;
                }
                return true;
            case 3052:
                j a53 = n.a(parcel.readStrongBinder());
                int readInt51 = parcel.readInt();
                int readInt52 = parcel.readInt();
                if (a53 != null) {
                    O(a53, readInt51, 34, R(new a2.a0(readInt52, 5)));
                    return true;
                }
                return true;
            case 3053:
                j a54 = n.a(parcel.readStrongBinder());
                int readInt53 = parcel.readInt();
                int readInt54 = parcel.readInt();
                if (a54 != null) {
                    O(a54, readInt53, 34, R(new a2.a0(readInt54, 4)));
                    return true;
                }
                return true;
            case 3054:
                j a55 = n.a(parcel.readStrongBinder());
                int readInt55 = parcel.readInt();
                final boolean z13 = parcel.readInt() != 0;
                final int readInt56 = parcel.readInt();
                if (a55 != null) {
                    O(a55, readInt55, 34, R(new u1.g() { // from class: i4.v0
                        @Override // u1.g
                        public final void accept(Object obj) {
                            ((l1) obj).E(readInt56, z13);
                        }
                    }));
                    return true;
                }
                return true;
            case 3055:
                j a56 = n.a(parcel.readStrongBinder());
                int readInt57 = parcel.readInt();
                int readInt58 = parcel.readInt();
                Bundle bundle14 = (Bundle) k6.e.a(parcel, Bundle.CREATOR);
                if (a56 != null && bundle14 != null && readInt58 >= 0) {
                    try {
                        final r1.e0 a57 = r1.e0.a(bundle14);
                        final int i18 = 1;
                        O(a56, readInt57, 20, new a1(new b2.b(7, new g1() { // from class: i4.r0
                            @Override // i4.g1
                            public final Object c(b0 b0Var32, s sVar2, int i152) {
                                switch (i18) {
                                    case 0:
                                        return b0Var32.l(sVar2, db.k0.o(a57));
                                    case 1:
                                        return b0Var32.l(sVar2, db.k0.o(a57));
                                    default:
                                        return b0Var32.l(sVar2, db.k0.o(a57));
                                }
                            }
                        }, new q0(this, readInt58, 2)), 1));
                    } catch (RuntimeException e21) {
                        u1.a.q("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e21);
                    }
                }
                return true;
            case 3056:
                j a58 = n.a(parcel.readStrongBinder());
                int readInt59 = parcel.readInt();
                int readInt60 = parcel.readInt();
                int readInt61 = parcel.readInt();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (a58 != null && readStrongBinder3 != null && readInt60 >= 0 && readInt61 >= readInt60) {
                    try {
                        db.k0 a59 = r1.f.a(readStrongBinder3);
                        db.h0 j19 = db.k0.j();
                        for (int i19 = 0; i19 < a59.size(); i19++) {
                            Bundle bundle15 = (Bundle) a59.get(i19);
                            bundle15.getClass();
                            j19.a(r1.e0.a(bundle15));
                        }
                        O(a58, readInt59, 20, new a1(new b2.b(7, new a2.e0(j19.g(), 22), new p0(this, readInt60, readInt61)), 1));
                    } catch (RuntimeException e22) {
                        u1.a.q("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e22);
                    }
                }
                return true;
            case 3057:
                j a60 = n.a(parcel.readStrongBinder());
                int readInt62 = parcel.readInt();
                Bundle bundle16 = (Bundle) k6.e.a(parcel, Bundle.CREATOR);
                boolean z14 = parcel.readInt() != 0;
                if (a60 != null && bundle16 != null) {
                    try {
                        O(a60, readInt62, 35, R(new s0(r1.d.a(bundle16), z14, 1)));
                    } catch (RuntimeException e23) {
                        u1.a.q("MediaSessionStub", "Ignoring malformed Bundle for AudioAttributes", e23);
                    }
                }
                return true;
            default:
                o oVar = null;
                switch (i6) {
                    case 4001:
                        j a61 = n.a(parcel.readStrongBinder());
                        int readInt63 = parcel.readInt();
                        Bundle bundle17 = (Bundle) k6.e.a(parcel, Bundle.CREATOR);
                        if (a61 != null) {
                            if (bundle17 != null) {
                                try {
                                    oVar = o.a(bundle17);
                                } catch (RuntimeException e24) {
                                    u1.a.q("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e24);
                                }
                            }
                            h1Var = this;
                            h1Var.d(a61, readInt63, null, 50000, new a1(new u0(oVar, 2), 0));
                            return true;
                        }
                        return true;
                    case 4002:
                        j a62 = n.a(parcel.readStrongBinder());
                        int readInt64 = parcel.readInt();
                        String readString2 = parcel.readString();
                        if (a62 != null) {
                            if (TextUtils.isEmpty(readString2)) {
                                u1.a.p("MediaSessionStub", "getItem(): Ignoring empty mediaId");
                                return true;
                            }
                            d(a62, readInt64, null, 50004, new a1(new com.unity3d.ads.adplayer.b(readString2, 23), 0));
                            return true;
                        }
                        return true;
                    case 4003:
                        j a63 = n.a(parcel.readStrongBinder());
                        int readInt65 = parcel.readInt();
                        String readString3 = parcel.readString();
                        int readInt66 = parcel.readInt();
                        int readInt67 = parcel.readInt();
                        Bundle bundle18 = (Bundle) k6.e.a(parcel, Bundle.CREATOR);
                        if (a63 != null) {
                            if (TextUtils.isEmpty(readString3)) {
                                u1.a.p("MediaSessionStub", "getChildren(): Ignoring empty parentId");
                            } else if (readInt66 < 0) {
                                u1.a.p("MediaSessionStub", "getChildren(): Ignoring negative page");
                            } else if (readInt67 < 1) {
                                u1.a.p("MediaSessionStub", "getChildren(): Ignoring pageSize less than 1");
                            } else {
                                if (bundle18 != null) {
                                    try {
                                        oVar = o.a(bundle18);
                                    } catch (RuntimeException e25) {
                                        u1.a.q("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e25);
                                    }
                                }
                                d(a63, readInt65, null, 50003, new a1(new com.unity3d.ads.adplayer.b(readString3, readInt66, readInt67, oVar), 0));
                            }
                        }
                        return true;
                    case 4004:
                        j a64 = n.a(parcel.readStrongBinder());
                        int readInt68 = parcel.readInt();
                        String readString4 = parcel.readString();
                        Bundle bundle19 = (Bundle) k6.e.a(parcel, Bundle.CREATOR);
                        if (a64 != null) {
                            if (TextUtils.isEmpty(readString4)) {
                                u1.a.p("MediaSessionStub", "search(): Ignoring empty query");
                            } else {
                                if (bundle19 != null) {
                                    try {
                                        oVar = o.a(bundle19);
                                    } catch (RuntimeException e26) {
                                        u1.a.q("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e26);
                                    }
                                }
                                d(a64, readInt68, null, 50005, new a1(new u0(readString4, oVar, 7), 0));
                            }
                        }
                        return true;
                    case 4005:
                        j a65 = n.a(parcel.readStrongBinder());
                        int readInt69 = parcel.readInt();
                        String readString5 = parcel.readString();
                        int readInt70 = parcel.readInt();
                        int readInt71 = parcel.readInt();
                        Bundle bundle20 = (Bundle) k6.e.a(parcel, Bundle.CREATOR);
                        if (a65 != null) {
                            if (TextUtils.isEmpty(readString5)) {
                                u1.a.p("MediaSessionStub", "getSearchResult(): Ignoring empty query");
                            } else if (readInt70 < 0) {
                                u1.a.p("MediaSessionStub", "getSearchResult(): Ignoring negative page");
                            } else if (readInt71 < 1) {
                                u1.a.p("MediaSessionStub", "getSearchResult(): Ignoring pageSize less than 1");
                            } else {
                                if (bundle20 != null) {
                                    try {
                                        oVar = o.a(bundle20);
                                    } catch (RuntimeException e27) {
                                        u1.a.q("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e27);
                                    }
                                }
                                d(a65, readInt69, null, 50006, new a1(new u0(readString5, readInt70, readInt71, oVar), 0));
                            }
                        }
                        return true;
                    case 4006:
                        j a66 = n.a(parcel.readStrongBinder());
                        int readInt72 = parcel.readInt();
                        String readString6 = parcel.readString();
                        Bundle bundle21 = (Bundle) k6.e.a(parcel, Bundle.CREATOR);
                        if (a66 != null) {
                            if (TextUtils.isEmpty(readString6)) {
                                u1.a.p("MediaSessionStub", "subscribe(): Ignoring empty parentId");
                            } else {
                                if (bundle21 != null) {
                                    try {
                                        oVar = o.a(bundle21);
                                    } catch (RuntimeException e28) {
                                        u1.a.q("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e28);
                                    }
                                }
                                d(a66, readInt72, null, 50001, new a1(new u0(readString6, oVar, 5), 0));
                            }
                        }
                        return true;
                    case 4007:
                        j a67 = n.a(parcel.readStrongBinder());
                        int readInt73 = parcel.readInt();
                        String readString7 = parcel.readString();
                        if (a67 != null) {
                            if (TextUtils.isEmpty(readString7)) {
                                u1.a.p("MediaSessionStub", "unsubscribe(): Ignoring empty parentId");
                                return true;
                            }
                            d(a67, readInt73, null, 50002, new a1(new com.unity3d.ads.adplayer.b(readString7, 14), 0));
                            return true;
                        }
                        return true;
                    default:
                        return super.onTransact(i6, parcel, parcel2, i10);
                }
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
