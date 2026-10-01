package i4;

import a2.a2;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.measurement.j5;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import n9.e4;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class m0 implements hb.r, r {
    public long A;
    public final /* synthetic */ Object B;

    /* renamed from: x, reason: collision with root package name */
    public Object f6459x;

    /* renamed from: y, reason: collision with root package name */
    public Serializable f6460y;

    /* renamed from: z, reason: collision with root package name */
    public Object f6461z;

    public /* synthetic */ m0(n9.c1 c1Var, long j) {
        this.B = c1Var;
        w8.x.d("health_monitor");
        w8.x.b(j > 0);
        this.f6460y = "health_monitor:start";
        this.f6459x = "health_monitor:count";
        this.f6461z = "health_monitor:value";
        this.A = j;
    }

    @Override // i4.r
    public void c(int i6, r1 r1Var, boolean z10, boolean z11, int i10) {
        o0 o0Var = (o0) this.B;
        o0Var.N(o0Var.f6473g.f6318t);
    }

    @Override // i4.r
    public void d(int i6, r1.q0 q0Var) {
        int i10;
        o0 o0Var = (o0) this.B;
        l1 l1Var = o0Var.f6473g.f6318t;
        if (l1Var.n0(20)) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        if (o0Var.f6482q != i10) {
            o0Var.f6482q = i10;
            ((j4.u) o0Var.f6476k.f7158x).f7208a.setFlags(i10 | 3);
        }
        o0Var.N(l1Var);
    }

    @Override // i4.r
    public void f(int i6, o1 o1Var) {
        Bundle bundle = Bundle.EMPTY;
        j4.b0 b0Var = ((o0) this.B).f6476k;
        String str = o1Var.f6493b;
        b0Var.getClass();
        if (!TextUtils.isEmpty(str)) {
            j4.u uVar = (j4.u) b0Var.f7158x;
            if (Build.VERSION.SDK_INT < 23) {
                synchronized (uVar.f7211d) {
                    for (int beginBroadcast = uVar.f7213f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                        try {
                            ((j4.f) uVar.f7213f.getBroadcastItem(beginBroadcast)).B(str);
                        } catch (RemoteException | SecurityException e10) {
                            Log.e("MediaSessionCompat", "Dead object in sendSessionEvent.", e10);
                        }
                    }
                    uVar.f7213f.finishBroadcast();
                }
            }
            uVar.f7208a.sendSessionEvent(str, bundle);
            return;
        }
        throw new IllegalArgumentException("event cannot be null or empty");
    }

    public void h(r1.d dVar) {
        o0 o0Var = (o0) this.B;
        o0Var.f6473g.f6318t.getDeviceInfo().getClass();
        int e10 = l.e(dVar);
        j4.u uVar = (j4.u) o0Var.f6476k.f7158x;
        uVar.getClass();
        AudioAttributes.Builder builder = new AudioAttributes.Builder();
        builder.setLegacyStreamType(e10);
        uVar.f7208a.setPlaybackToLocal(builder.build());
    }

    public void i() {
        r1.d dVar;
        o0 o0Var = (o0) this.B;
        l1 l1Var = o0Var.f6473g.f6318t;
        l1Var.getDeviceInfo().getClass();
        if (l1Var.n0(21)) {
            dVar = l1Var.C();
        } else {
            dVar = r1.d.f11342h;
        }
        int e10 = l.e(dVar);
        j4.u uVar = (j4.u) o0Var.f6476k.f7158x;
        uVar.getClass();
        AudioAttributes.Builder builder = new AudioAttributes.Builder();
        builder.setLegacyStreamType(e10);
        uVar.f7208a.setPlaybackToLocal(builder.build());
    }

    public void j(r1.e0 e0Var) {
        o0 o0Var = (o0) this.B;
        j4.b0 b0Var = o0Var.f6476k;
        p();
        if (e0Var == null) {
            ((j4.u) b0Var.f7158x).e(0);
        } else {
            ((j4.u) b0Var.f7158x).e(l.f(e0Var.f11381d.f11471i));
        }
        o0Var.N(o0Var.f6473g.f6318t);
    }

    public void k(int i6, l1 l1Var) {
        r1.h0 h0Var;
        int i10;
        o0 o0Var = (o0) this.B;
        o(l1Var.h1());
        if (l1Var.n0(18)) {
            h0Var = l1Var.h0();
        } else {
            h0Var = r1.h0.K;
        }
        l(h0Var);
        l1Var.i1();
        p();
        n(l1Var.F0());
        m(l1Var.x0());
        l1Var.getDeviceInfo();
        i();
        if (l1Var.n0(20)) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        if (o0Var.f6482q != i10) {
            o0Var.f6482q = i10;
            ((j4.u) o0Var.f6476k.f7158x).f7208a.setFlags(i10 | 3);
        }
        j(l1Var.g1());
    }

    public void l(r1.h0 h0Var) {
        o0 o0Var = (o0) this.B;
        j4.b0 b0Var = o0Var.f6476k;
        CharSequence queueTitle = ((j4.l) ((a2) b0Var.f7159y).f162y).f7186a.getQueueTitle();
        CharSequence charSequence = h0Var.f11463a;
        if (!TextUtils.equals(queueTitle, charSequence)) {
            l1 l1Var = o0Var.f6473g.f6318t;
            if (!o0Var.f6486v.a(17) || !l1Var.l().a(17)) {
                charSequence = null;
            }
            ((j4.u) b0Var.f7158x).f7208a.setQueueTitle(charSequence);
        }
    }

    public void m(int i6) {
        j4.b0 b0Var = ((o0) this.B).f6476k;
        int i10 = l.f6450a;
        int i11 = 0;
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 != 2) {
                    u1.a.p("LegacyConversions", "Unrecognized RepeatMode: " + i6 + " was converted to `PlaybackStateCompat.REPEAT_MODE_NONE`");
                } else {
                    i11 = 2;
                }
            } else {
                i11 = 1;
            }
        }
        j4.u uVar = (j4.u) b0Var.f7158x;
        if (uVar.f7217k != i11) {
            uVar.f7217k = i11;
            synchronized (uVar.f7211d) {
                for (int beginBroadcast = uVar.f7213f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        ((j4.f) uVar.f7213f.getBroadcastItem(beginBroadcast)).c(i11);
                    } catch (RemoteException | SecurityException e10) {
                        Log.e("MediaSessionCompat", "Dead object in setRepeatMode.", e10);
                    }
                }
                uVar.f7213f.finishBroadcast();
            }
        }
    }

    public void n(boolean z10) {
        j4.b0 b0Var = ((o0) this.B).f6476k;
        int i6 = l.f6450a;
        j4.u uVar = (j4.u) b0Var.f7158x;
        if (uVar.f7218l != z10) {
            uVar.f7218l = z10 ? 1 : 0;
            synchronized (uVar.f7211d) {
                for (int beginBroadcast = uVar.f7213f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        ((j4.f) uVar.f7213f.getBroadcastItem(beginBroadcast)).z(z10 ? 1 : 0);
                    } catch (RemoteException | SecurityException e10) {
                        Log.e("MediaSessionCompat", "Dead object in setShuffleMode.", e10);
                    }
                }
                uVar.f7213f.finishBroadcast();
            }
        }
    }

    public void o(r1.d1 d1Var) {
        q(d1Var);
        p();
    }

    @Override // hb.r
    public void onSuccess(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        o0 o0Var = (o0) ((m0) this.B).B;
        if (this != o0Var.f6481p) {
            return;
        }
        o0.E(o0Var.f6476k, l.b((r1.h0) this.f6459x, (String) this.f6460y, (Uri) this.f6461z, this.A, bitmap));
        b0 b0Var = o0Var.f6473g;
        u1.a0.U(b0Var.f6314o, new v(b0Var, 1));
    }

    public void p() {
        String str;
        Uri uri;
        hb.x xVar;
        Uri uri2;
        long j;
        Uri uri3;
        r1.h0 h0Var;
        Uri uri4;
        o0 o0Var = (o0) this.B;
        b0 b0Var = o0Var.f6473g;
        l1 l1Var = b0Var.f6318t;
        r1.e0 g12 = l1Var.g1();
        r1.h0 i12 = l1Var.i1();
        long j10 = -9223372036854775807L;
        if ((!l1Var.n0(16) || !l1Var.S0()) && l1Var.n0(16)) {
            j10 = l1Var.getDuration();
        }
        if (g12 != null) {
            str = g12.f11378a;
        } else {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String str2 = str;
        Bitmap bitmap = null;
        if (g12 != null && (uri4 = g12.f11383f.f11311a) != null) {
            uri = uri4;
        } else {
            uri = null;
        }
        if (Objects.equals((r1.h0) this.f6459x, i12) && Objects.equals((String) this.f6460y, str2) && Objects.equals((Uri) this.f6461z, uri) && this.A == j10) {
            return;
        }
        this.f6460y = str2;
        this.f6461z = uri;
        this.f6459x = i12;
        this.A = j10;
        j4.b0 b0Var2 = b0Var.f6312m;
        b0Var2.getClass();
        byte[] bArr = i12.f11472k;
        if (bArr != null) {
            xVar = b0Var2.j(bArr);
        } else {
            Uri uri5 = i12.f11474m;
            if (uri5 != null) {
                androidx.lifecycle.j1 j1Var = (androidx.lifecycle.j1) b0Var2.f7159y;
                if (j1Var != null && (uri2 = (Uri) j1Var.f950z) != null && uri2.equals(uri5)) {
                    xVar = (hb.x) ((androidx.lifecycle.j1) b0Var2.f7159y).A;
                    u1.c.h(xVar);
                } else {
                    w1.i iVar = (w1.i) b0Var2.f7158x;
                    hb.x d10 = ((hb.z) iVar.f13534a).d(new b7.d(6, iVar, uri5));
                    b0Var2.f7159y = new androidx.lifecycle.j1(uri5, d10);
                    xVar = d10;
                }
            } else {
                xVar = null;
            }
        }
        if (xVar != null) {
            o0Var.f6481p = null;
            if (xVar.isDone()) {
                try {
                    bitmap = (Bitmap) j5.j(xVar);
                } catch (CancellationException | ExecutionException e10) {
                    u1.a.p("MediaSessionLegacyStub", "Failed to load bitmap: " + e10.getMessage());
                }
            } else {
                j = j10;
                uri3 = uri;
                h0Var = i12;
                m0 m0Var = new m0(this, h0Var, str2, uri3, j);
                str2 = str2;
                o0Var.f6481p = m0Var;
                Handler handler = b0Var.f6311l;
                Objects.requireNonNull(handler);
                xVar.a(new hb.s(0, xVar, m0Var), new c2.g0(handler, 0));
                o0.E(o0Var.f6476k, l.b(h0Var, str2, uri3, j, bitmap));
            }
        }
        j = j10;
        uri3 = uri;
        h0Var = i12;
        o0.E(o0Var.f6476k, l.b(h0Var, str2, uri3, j, bitmap));
    }

    public void q(r1.d1 d1Var) {
        o0 o0Var = (o0) this.B;
        b0 b0Var = o0Var.f6473g;
        l1 l1Var = b0Var.f6318t;
        if (o0Var.f6486v.a(17) && l1Var.l().a(17) && !d1Var.p()) {
            int i6 = l.f6450a;
            ArrayList arrayList = new ArrayList();
            r1.c1 c1Var = new r1.c1();
            for (int i10 = 0; i10 < d1Var.o(); i10++) {
                arrayList.add(d1Var.m(i10, c1Var, 0L).f11329c);
            }
            ArrayList arrayList2 = new ArrayList();
            c2.a0 a0Var = new c2.a0(this, new AtomicInteger(0), arrayList, arrayList2, 2);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                byte[] bArr = ((r1.e0) arrayList.get(i11)).f11381d.f11472k;
                if (bArr == null) {
                    arrayList2.add(null);
                    a0Var.run();
                } else {
                    hb.x j = b0Var.f6312m.j(bArr);
                    arrayList2.add(j);
                    Handler handler = b0Var.f6311l;
                    Objects.requireNonNull(handler);
                    j.a(a0Var, new c2.g0(handler, 0));
                }
            }
            return;
        }
        o0.D(o0Var.f6476k, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007e, code lost:
    
        if (r2 < java.lang.Math.max(0, ((java.lang.Integer) n9.e0.j.a(null)).intValue())) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0097, code lost:
    
        if (r2 >= java.lang.Math.max(0, ((java.lang.Integer) n9.e0.j.a(null)).intValue())) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean r(long r11, com.google.android.gms.internal.measurement.c3 r13) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.f6461z
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 != 0) goto Ld
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.f6461z = r0
        Ld:
            java.io.Serializable r0 = r10.f6460y
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 != 0) goto L1a
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.f6460y = r0
        L1a:
            java.lang.Object r0 = r10.f6461z
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 != 0) goto L45
            java.lang.Object r0 = r10.f6461z
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.internal.measurement.c3 r0 = (com.google.android.gms.internal.measurement.c3) r0
            long r2 = r0.u()
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r4
            r6 = 60
            long r2 = r2 / r6
            long r2 = r2 / r6
            long r8 = r13.u()
            long r8 = r8 / r4
            long r8 = r8 / r6
            long r8 = r8 / r6
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 != 0) goto Lcc
        L45:
            long r2 = r10.A
            int r0 = r13.k()
            long r4 = (long) r0
            long r2 = r2 + r4
            java.lang.Object r0 = r10.B
            n9.e4 r0 = (n9.e4) r0
            n9.g r4 = r0.b0()
            n9.d0 r5 = n9.e0.f9242f1
            r6 = 0
            boolean r4 = r4.n1(r6, r5)
            if (r4 == 0) goto L81
            java.lang.Object r4 = r10.f6461z
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L9a
            r0.b0()
            n9.d0 r4 = n9.e0.j
            java.lang.Object r4 = r4.a(r6)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            int r4 = java.lang.Math.max(r1, r4)
            long r4 = (long) r4
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 >= 0) goto Lcc
            goto L9a
        L81:
            r0.b0()
            n9.d0 r4 = n9.e0.j
            java.lang.Object r4 = r4.a(r6)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            int r4 = java.lang.Math.max(r1, r4)
            long r4 = (long) r4
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 < 0) goto L9a
            goto Lcc
        L9a:
            r10.A = r2
            java.lang.Object r2 = r10.f6461z
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            r2.add(r13)
            java.io.Serializable r13 = r10.f6460y
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r13.add(r11)
            java.lang.Object r11 = r10.f6461z
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            int r11 = r11.size()
            r0.b0()
            n9.d0 r12 = n9.e0.f9254k
            java.lang.Object r12 = r12.a(r6)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r13 = 1
            int r12 = java.lang.Math.max(r13, r12)
            if (r11 < r12) goto Lcd
        Lcc:
            return r1
        Lcd:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.m0.r(long, com.google.android.gms.internal.measurement.c3):boolean");
    }

    public void s() {
        n9.c1 c1Var = (n9.c1) this.B;
        c1Var.d1();
        ((n9.n1) c1Var.f4301y).H.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor edit = c1Var.h1().edit();
        edit.remove((String) this.f6459x);
        edit.remove((String) this.f6461z);
        edit.putLong((String) this.f6460y, currentTimeMillis);
        edit.apply();
    }

    @Override // hb.r
    public void w(Throwable th) {
        if (this != ((o0) ((m0) this.B).B).f6481p) {
            return;
        }
        u1.a.p("MediaSessionLegacyStub", "Failed to load bitmap: " + th.getMessage());
    }

    public /* synthetic */ m0(e4 e4Var) {
        this.B = e4Var;
    }

    public m0(o0 o0Var) {
        this.B = o0Var;
        this.f6459x = r1.h0.K;
        this.f6460y = HttpUrl.FRAGMENT_ENCODE_SET;
        this.A = -9223372036854775807L;
    }

    public m0(m0 m0Var, r1.h0 h0Var, String str, Uri uri, long j) {
        this.B = m0Var;
        this.f6459x = h0Var;
        this.f6460y = str;
        this.f6461z = uri;
        this.A = j;
    }

    @Override // i4.r
    public void onDisconnected() {
    }

    @Override // i4.r
    public /* synthetic */ void b(int i6) {
    }

    @Override // i4.r
    public /* synthetic */ void a(int i6, s1 s1Var) {
    }

    @Override // i4.r
    public /* synthetic */ void e(int i6, m mVar) {
    }

    @Override // i4.r
    public /* synthetic */ void g(int i6, j1 j1Var, r1.q0 q0Var, boolean z10, boolean z11) {
    }
}
