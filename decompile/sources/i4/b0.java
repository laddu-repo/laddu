package i4;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.view.KeyEvent;
import com.google.android.gms.internal.measurement.j4;
import com.google.android.gms.internal.measurement.j5;
import com.playfy.tv.activities.PlayerActivity;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class b0 {
    public static final s1 B = new s1(1);
    public final Bundle A;

    /* renamed from: a, reason: collision with root package name */
    public final Object f6301a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final Uri f6302b;

    /* renamed from: c, reason: collision with root package name */
    public final y f6303c;

    /* renamed from: d, reason: collision with root package name */
    public final x f6304d;

    /* renamed from: e, reason: collision with root package name */
    public final zb.d f6305e;

    /* renamed from: f, reason: collision with root package name */
    public final PlayerActivity f6306f;

    /* renamed from: g, reason: collision with root package name */
    public final h1 f6307g;

    /* renamed from: h, reason: collision with root package name */
    public final o0 f6308h;

    /* renamed from: i, reason: collision with root package name */
    public final String f6309i;
    public final t1 j;

    /* renamed from: k, reason: collision with root package name */
    public final u f6310k;

    /* renamed from: l, reason: collision with root package name */
    public final Handler f6311l;

    /* renamed from: m, reason: collision with root package name */
    public final j4.b0 f6312m;

    /* renamed from: n, reason: collision with root package name */
    public final v f6313n;

    /* renamed from: o, reason: collision with root package name */
    public final Handler f6314o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f6315p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f6316q;

    /* renamed from: r, reason: collision with root package name */
    public final db.k0 f6317r;
    public j1 s;

    /* renamed from: t, reason: collision with root package name */
    public l1 f6318t;

    /* renamed from: u, reason: collision with root package name */
    public z f6319u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f6320v;

    /* renamed from: w, reason: collision with root package name */
    public final long f6321w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f6322x;

    /* renamed from: y, reason: collision with root package name */
    public final db.k0 f6323y;

    /* renamed from: z, reason: collision with root package name */
    public final db.k0 f6324z;

    /* JADX WARN: Type inference failed for: r2v20, types: [i4.l1, java.lang.Object, e3.e] */
    public b0(u uVar, PlayerActivity playerActivity, String str, fd.a0 a0Var, db.k0 k0Var, db.k0 k0Var2, db.k0 k0Var3, zb.d dVar, Bundle bundle, Bundle bundle2, j4.b0 b0Var) {
        u1.a.k("MediaSessionImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.0] [" + u1.a0.f12750a + "]");
        this.f6310k = uVar;
        this.f6306f = playerActivity;
        this.f6309i = str;
        this.f6323y = k0Var;
        this.f6324z = k0Var2;
        this.f6317r = k0Var3;
        this.f6305e = dVar;
        this.A = bundle2;
        this.f6312m = b0Var;
        this.f6315p = true;
        this.f6316q = true;
        h1 h1Var = new h1(this);
        this.f6307g = h1Var;
        this.f6314o = new Handler(Looper.getMainLooper());
        Looper B0 = ((r1.u0) a0Var.f4301y).B0();
        Handler handler = new Handler(B0);
        this.f6311l = handler;
        this.s = j1.F;
        this.f6303c = new y(this, B0);
        this.f6304d = new x(this, B0);
        Uri build = new Uri.Builder().scheme(b0.class.getName()).appendPath(str).appendPath(String.valueOf(SystemClock.elapsedRealtime())).build();
        this.f6302b = build;
        o0 o0Var = new o0(this, build, handler, bundle, k0Var, k0Var2, q.f6502e, q.f6503f, bundle2);
        this.f6308h = o0Var;
        this.j = new t1(Process.myUid(), playerActivity.getPackageName(), h1Var, bundle, ((j4.u) o0Var.f6476k.f7158x).f7210c.f7156y);
        ?? eVar = new e3.e(a0Var, 6);
        this.f6318t = eVar;
        u1.a0.U(handler, new a2.c0(21, this, (Object) eVar));
        this.f6321w = 3000L;
        this.f6313n = new v(this, 2);
        u1.a0.U(handler, new v(this, 3));
    }

    public static void a(b0 b0Var) {
        synchronized (b0Var.f6301a) {
            try {
                if (b0Var.f6320v) {
                    return;
                }
                final r1 f12 = b0Var.f6318t.f1();
                if (!b0Var.f6303c.hasMessages(1)) {
                    r1 r1Var = b0Var.s.f6419c;
                    r1.t0 t0Var = f12.f6530a;
                    int i6 = t0Var.f11703b;
                    r1.t0 t0Var2 = r1Var.f6530a;
                    if (i6 == t0Var2.f11703b && t0Var.f11706e == t0Var2.f11706e && t0Var.f11709h == t0Var2.f11709h && t0Var.f11710i == t0Var2.f11710i) {
                        ic.s sVar = b0Var.f6307g.f6393f;
                        db.k0 i10 = sVar.i();
                        for (int i11 = 0; i11 < i10.size(); i11++) {
                            final s sVar2 = (s) i10.get(i11);
                            sVar.l(sVar2);
                            final boolean t10 = sVar.t(sVar2, 16);
                            final boolean t11 = sVar.t(sVar2, 17);
                            b0Var.c(sVar2, new a0() { // from class: i4.w
                                @Override // i4.a0
                                public final void d(r rVar, int i12) {
                                    rVar.c(i12, r1.this, t10, t11, sVar2.f6541c);
                                }
                            });
                        }
                        try {
                            b0Var.f6308h.f6475i.c(0, f12, true, true, 0);
                        } catch (RemoteException e10) {
                            u1.a.h("MediaSessionImpl", "Exception in using media1 API", e10);
                        }
                    }
                }
                b0Var.t();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean k(s sVar) {
        if (sVar != null && Objects.equals(sVar.f6539a.f7163a.f7165a, "com.android.systemui")) {
            return true;
        }
        return false;
    }

    public final boolean b(KeyEvent keyEvent, boolean z10, boolean z11) {
        b bVar;
        s e10 = this.f6310k.f6566a.e();
        e10.getClass();
        int keyCode = keyEvent.getKeyCode();
        if ((keyCode == 85 || keyCode == 79) && z10) {
            keyCode = 87;
        }
        if (keyCode != 126) {
            if (keyCode != 127) {
                if (keyCode != 272) {
                    if (keyCode != 273) {
                        switch (keyCode) {
                            case 85:
                                if (this.f6318t.m()) {
                                    bVar = new b(this, e10, 6);
                                    break;
                                } else {
                                    bVar = new b(this, e10, 7);
                                    break;
                                }
                            case 86:
                                bVar = new b(this, e10, 5);
                                break;
                            case 87:
                                break;
                            case 88:
                                break;
                            case 89:
                                bVar = new b(this, e10, 4);
                                break;
                            case 90:
                                bVar = new b(this, e10, 3);
                                break;
                            default:
                                return false;
                        }
                    }
                    bVar = new b(this, e10, 2);
                }
                bVar = new b(this, e10, 1);
            } else {
                bVar = new b(this, e10, 9);
            }
        } else {
            bVar = new b(this, e10, 8);
        }
        u1.a0.U(this.f6311l, new a2.h0(1, this, e10, bVar, z11));
        return true;
    }

    public final void c(s sVar, a0 a0Var) {
        int i6;
        h1 h1Var = this.f6307g;
        try {
            n1 n10 = h1Var.f6393f.n(sVar);
            if (n10 != null) {
                i6 = n10.c();
            } else if (h(sVar)) {
                i6 = 0;
            } else {
                return;
            }
            r rVar = sVar.f6542d;
            if (rVar != null) {
                a0Var.d(rVar, i6);
            }
        } catch (DeadObjectException unused) {
            h1Var.f6393f.y(sVar);
        } catch (RemoteException e10) {
            u1.a.q("MediaSessionImpl", "Exception in " + sVar, e10);
        }
    }

    public final void d(a0 a0Var) {
        db.k0 i6 = this.f6307g.f6393f.i();
        for (int i10 = 0; i10 < i6.size(); i10++) {
            c((s) i6.get(i10), a0Var);
        }
        try {
            a0Var.d(this.f6308h.f6475i, 0);
        } catch (RemoteException e10) {
            u1.a.h("MediaSessionImpl", "Exception in using media1 API", e10);
        }
    }

    public final s e() {
        db.k0 i6 = this.f6307g.f6393f.i();
        for (int i10 = 0; i10 < i6.size(); i10++) {
            s sVar = (s) i6.get(i10);
            if (i(sVar)) {
                return sVar;
            }
        }
        return null;
    }

    public final void f(r1.q0 q0Var) {
        this.f6303c.a(false, false);
        d(new a2.e0(q0Var, 21));
        try {
            m0 m0Var = this.f6308h.f6475i;
            r1.j jVar = this.s.f6432q;
            m0Var.i();
        } catch (RemoteException e10) {
            u1.a.h("MediaSessionImpl", "Exception in using media1 API", e10);
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, hb.o] */
    public final void g(s sVar, boolean z10) {
        boolean z11;
        boolean z12;
        if (o()) {
            if (this.f6318t.n0(16) && this.f6318t.p() != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!this.f6318t.n0(31) && !this.f6318t.n0(20)) {
                z12 = false;
            } else {
                z12 = true;
            }
            s s = s(sVar);
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            u1.c.g(!false);
            sparseBooleanArray.append(1, true);
            u1.c.g(!false);
            r1.q0 q0Var = new r1.q0(new r1.o(sparseBooleanArray));
            if (!z11 && z12) {
                this.f6305e.getClass();
                UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                ?? obj = new Object();
                obj.l(unsupportedOperationException);
                obj.a(new hb.s(0, (Object) obj, new j4(this, s, z10, q0Var)), new c2.g0(this, 1));
                return;
            }
            if (!z11) {
                u1.a.p("MediaSessionImpl", "Play requested without current MediaItem, but playback resumption prevented by missing available commands");
            }
            u1.a0.H(this.f6318t);
            if (z10) {
                p(s);
            }
        }
    }

    public final boolean h(s sVar) {
        if (!this.f6307g.f6393f.s(sVar) && !this.f6308h.f6472f.s(sVar)) {
            return false;
        }
        return true;
    }

    public final boolean i(s sVar) {
        if (!Objects.equals(sVar.f6539a.f7163a.f7165a, this.f6306f.getPackageName()) || sVar.f6540b == 0 || !new Bundle(sVar.f6543e).getBoolean("androidx.media3.session.MediaNotificationManager", false)) {
            return false;
        }
        return true;
    }

    public final boolean j() {
        boolean z10;
        synchronized (this.f6301a) {
            z10 = this.f6320v;
        }
        return z10;
    }

    public final hb.x l(s sVar, List list) {
        s(sVar);
        this.f6305e.getClass();
        return zb.d.y(list);
    }

    public final q m(s sVar) {
        db.k0 k8;
        boolean z10 = this.f6322x;
        db.k0 k0Var = null;
        o0 o0Var = this.f6308h;
        if (z10 && k(sVar)) {
            o0Var.getClass();
            p1 p1Var = q.f6502e;
            p1 p1Var2 = o0Var.f6485u;
            p1Var2.getClass();
            r1.q0 q0Var = o0Var.f6486v;
            q0Var.getClass();
            db.k0 k0Var2 = o0Var.s;
            if (k0Var2 == null) {
                k8 = null;
            } else {
                k8 = db.k0.k(k0Var2);
            }
            db.k0 k0Var3 = o0Var.f6484t;
            if (k0Var3 != null) {
                k0Var = db.k0.k(k0Var3);
            }
            return new q(p1Var2, q0Var, k8, k0Var);
        }
        this.f6305e.getClass();
        r1.q0 q0Var2 = q.f6503f;
        p1 p1Var3 = q.f6502e;
        q qVar = new q(p1Var3, q0Var2, null, null);
        if (i(sVar)) {
            boolean z11 = true;
            this.f6322x = true;
            u uVar = this.f6310k;
            db.k0 k0Var4 = uVar.f6566a.f6324z;
            int i6 = 0;
            if (k0Var4.isEmpty()) {
                o0Var.s = uVar.f6566a.f6323y;
            } else {
                o0Var.f6484t = k0Var4;
                Bundle bundle = o0Var.f6483r;
                boolean z12 = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false);
                boolean z13 = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
                o0Var.M();
                if (bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false) != z12 || bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false) != z13) {
                    ((j4.u) o0Var.f6476k.f7158x).f7208a.setExtras(bundle);
                }
            }
            b0 b0Var = o0Var.f6473g;
            Bundle bundle2 = o0Var.f6483r;
            if (o0Var.f6486v.a(17) == q0Var2.a(17)) {
                z11 = false;
            }
            o0Var.f6485u = p1Var3;
            o0Var.f6486v = q0Var2;
            if (!o0Var.f6484t.isEmpty()) {
                boolean z14 = bundle2.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false);
                boolean z15 = bundle2.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
                o0Var.M();
                if (bundle2.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false) != z14 || bundle2.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false) != z15) {
                    ((j4.u) o0Var.f6476k.f7158x).f7208a.setExtras(bundle2);
                }
            }
            if (z11) {
                u1.a0.U(b0Var.f6311l, new f0(o0Var, b0Var.f6318t, i6));
                return qVar;
            }
            o0Var.N(b0Var.f6318t);
        }
        return qVar;
    }

    public final hb.u n(s sVar) {
        s(sVar);
        this.f6305e.getClass();
        return j5.l(new s1(-6));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, hb.o] */
    public final boolean o() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            ?? obj = new Object();
            this.f6314o.post(new a2.c0(20, this, (Object) obj));
            try {
                return ((Boolean) obj.get()).booleanValue();
            } catch (InterruptedException | ExecutionException e10) {
                throw new IllegalStateException(e10);
            }
        }
        return true;
    }

    public final void p(s sVar) {
        s(sVar);
        this.f6305e.getClass();
    }

    public final hb.d0 q(s sVar, List list, final int i6, final long j) {
        s(sVar);
        this.f6305e.getClass();
        return u1.a0.d0(zb.d.y(list), new hb.p() { // from class: i4.p
            @Override // hb.p, n8.e
            public final hb.x apply(Object obj) {
                return j5.l(new t((List) obj, i6, j));
            }
        });
    }

    public final void r() {
        u1.a.k("MediaSessionImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.0] [" + u1.a0.f12750a + "] [" + r1.f0.b() + "]");
        synchronized (this.f6301a) {
            try {
                if (this.f6320v) {
                    return;
                }
                this.f6320v = true;
                x xVar = this.f6304d;
                a2.e1 e1Var = xVar.f6591a;
                if (e1Var != null) {
                    xVar.removeCallbacks(e1Var);
                    xVar.f6591a = null;
                }
                this.f6311l.removeCallbacksAndMessages(null);
                try {
                    u1.a0.U(this.f6311l, new v(this, 0));
                } catch (Exception e10) {
                    u1.a.q("MediaSessionImpl", "Exception thrown while closing", e10);
                }
                o0 o0Var = this.f6308h;
                ComponentName componentName = o0Var.f6478m;
                b0 b0Var = o0Var.f6473g;
                j4.b0 b0Var2 = o0Var.f6476k;
                int i6 = Build.VERSION.SDK_INT;
                int i10 = 0;
                if (i6 < 31) {
                    if (componentName == null) {
                        ((j4.u) b0Var2.f7158x).f7208a.setMediaButtonReceiver(null);
                    } else {
                        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON", b0Var.f6302b);
                        intent.setComponent(componentName);
                        ((j4.u) b0Var2.f7158x).f7208a.setMediaButtonReceiver(PendingIntent.getBroadcast(b0Var.f6306f, 0, intent, o0.f6471w));
                    }
                }
                c2.g gVar = o0Var.f6477l;
                if (gVar != null) {
                    b0Var.f6306f.unregisterReceiver(gVar);
                }
                j4.u uVar = (j4.u) b0Var2.f7158x;
                MediaSession mediaSession = uVar.f7208a;
                uVar.f7213f.kill();
                if (i6 == 27) {
                    try {
                        Field declaredField = mediaSession.getClass().getDeclaredField("mCallback");
                        declaredField.setAccessible(true);
                        Handler handler = (Handler) declaredField.get(mediaSession);
                        if (handler != null) {
                            handler.removeCallbacksAndMessages(null);
                        }
                    } catch (Exception e11) {
                        Log.w("MediaSessionCompat", "Exception happened while accessing MediaSession.mCallback.", e11);
                    }
                }
                mediaSession.setCallback(null);
                uVar.f7209b.f7207e.clear();
                mediaSession.release();
                h1 h1Var = this.f6307g;
                Set set = h1Var.f6394g;
                ic.s sVar = h1Var.f6393f;
                db.k0 i11 = sVar.i();
                int size = i11.size();
                while (i10 < size) {
                    Object obj = i11.get(i10);
                    i10++;
                    s sVar2 = (s) obj;
                    sVar.y(sVar2);
                    r rVar = sVar2.f6542d;
                    if (rVar != null) {
                        rVar.onDisconnected();
                    }
                }
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    r rVar2 = ((s) it.next()).f6542d;
                    if (rVar2 != null) {
                        rVar2.onDisconnected();
                    }
                }
                set.clear();
                h1Var.f6392e.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final s s(s sVar) {
        if (this.f6322x && k(sVar)) {
            s e10 = e();
            e10.getClass();
            return e10;
        }
        return sVar;
    }

    public final void t() {
        Handler handler = this.f6311l;
        v vVar = this.f6313n;
        handler.removeCallbacks(vVar);
        if (this.f6316q) {
            long j = this.f6321w;
            if (j > 0) {
                if (this.f6318t.isPlaying() || this.f6318t.a()) {
                    handler.postDelayed(vVar, j);
                }
            }
        }
    }

    public final void u() {
        if (Looper.myLooper() == this.f6311l.getLooper()) {
        } else {
            throw new IllegalStateException("Player callback method is called from a wrong thread. See javadoc of MediaSession for details.");
        }
    }
}
