package c2;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.lifecycle.j1;
import com.unity3d.services.UnityAdsConstants;
import db.c1;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.ws.RealWebSocket;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i0 implements t {
    public static final Object o0 = new Object();

    /* renamed from: p0, reason: collision with root package name */
    public static ScheduledExecutorService f1816p0;

    /* renamed from: q0, reason: collision with root package name */
    public static int f1817q0;
    public j1 A;
    public r1.d B;
    public d0 C;
    public d0 D;
    public r1.o0 E;
    public boolean F;
    public ByteBuffer G;
    public int H;
    public long I;
    public long J;
    public long K;
    public long L;
    public int M;
    public boolean N;
    public boolean O;
    public long P;
    public float Q;
    public ByteBuffer R;
    public int S;
    public ByteBuffer T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public int Z;

    /* renamed from: a, reason: collision with root package name */
    public final Context f1818a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f1819a0;

    /* renamed from: b, reason: collision with root package name */
    public final j1 f1820b;

    /* renamed from: b0, reason: collision with root package name */
    public r1.e f1821b0;

    /* renamed from: c, reason: collision with root package name */
    public final y f1822c;

    /* renamed from: c0, reason: collision with root package name */
    public k7.d f1823c0;

    /* renamed from: d, reason: collision with root package name */
    public final o0 f1824d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f1825d0;

    /* renamed from: e, reason: collision with root package name */
    public final s1.k f1826e;

    /* renamed from: e0, reason: collision with root package name */
    public long f1827e0;

    /* renamed from: f, reason: collision with root package name */
    public final n0 f1828f;

    /* renamed from: f0, reason: collision with root package name */
    public long f1829f0;

    /* renamed from: g, reason: collision with root package name */
    public final c1 f1830g;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f1831g0;

    /* renamed from: h, reason: collision with root package name */
    public final x f1832h;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f1833h0;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayDeque f1834i;

    /* renamed from: i0, reason: collision with root package name */
    public Looper f1835i0;
    public final boolean j;

    /* renamed from: j0, reason: collision with root package name */
    public long f1836j0;

    /* renamed from: k, reason: collision with root package name */
    public int f1837k;

    /* renamed from: k0, reason: collision with root package name */
    public long f1838k0;

    /* renamed from: l, reason: collision with root package name */
    public j1 f1839l;

    /* renamed from: l0, reason: collision with root package name */
    public Handler f1840l0;

    /* renamed from: m, reason: collision with root package name */
    public final f0 f1841m;

    /* renamed from: m0, reason: collision with root package name */
    public Context f1842m0;

    /* renamed from: n, reason: collision with root package name */
    public final f0 f1843n;

    /* renamed from: n0, reason: collision with root package name */
    public final boolean f1844n0;

    /* renamed from: o, reason: collision with root package name */
    public final j0 f1845o;

    /* renamed from: p, reason: collision with root package name */
    public final j4.b0 f1846p;

    /* renamed from: q, reason: collision with root package name */
    public final j0 f1847q;

    /* renamed from: r, reason: collision with root package name */
    public final int f1848r;
    public b2.m s;

    /* renamed from: t, reason: collision with root package name */
    public q f1849t;

    /* renamed from: u, reason: collision with root package name */
    public c0 f1850u;

    /* renamed from: v, reason: collision with root package name */
    public c0 f1851v;

    /* renamed from: w, reason: collision with root package name */
    public s1.d f1852w;

    /* renamed from: x, reason: collision with root package name */
    public AudioTrack f1853x;

    /* renamed from: y, reason: collision with root package name */
    public d f1854y;

    /* renamed from: z, reason: collision with root package name */
    public h f1855z;

    /* JADX WARN: Code restructure failed: missing block: B:6:0x009c, code lost:
    
        r11 = r0.getDeviceId();
     */
    /* JADX WARN: Type inference failed for: r3v3, types: [c2.y, java.lang.Object, s1.h] */
    /* JADX WARN: Type inference failed for: r3v6, types: [r1.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [c2.o0, java.lang.Object, s1.h] */
    /* JADX WARN: Type inference failed for: r5v2, types: [s1.h, s1.k] */
    /* JADX WARN: Type inference failed for: r5v3, types: [c2.n0, s1.h] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public i0(c2.b0 r11) {
        /*
            r10 = this;
            r10.<init>()
            com.playfy.tv.activities.PlayerActivity r0 = r11.f1760a
            android.content.Context r1 = r0.getApplicationContext()
            r10.f1818a = r1
            r1.d r2 = r1.d.f11342h
            r10.B = r2
            if (r1 == 0) goto L13
            r1 = 0
            goto L15
        L13:
            c2.d r1 = r11.f1761b
        L15:
            r10.f1854y = r1
            androidx.lifecycle.j1 r1 = r11.f1762c
            r10.f1820b = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 0
            r10.j = r2
            r10.f1837k = r2
            c2.j0 r3 = r11.f1764e
            r10.f1845o = r3
            j4.b0 r3 = r11.f1766g
            r3.getClass()
            r10.f1846p = r3
            c2.x r3 = new c2.x
            u5.r r4 = new u5.r
            r5 = 2
            r4.<init>(r10, r5)
            r3.<init>(r4)
            r10.f1832h = r3
            c2.y r3 = new c2.y
            r3.<init>()
            r10.f1822c = r3
            c2.o0 r4 = new c2.o0
            r4.<init>()
            byte[] r5 = u1.a0.f12751b
            r4.f1910m = r5
            r10.f1824d = r4
            s1.k r5 = new s1.k
            r5.<init>()
            r10.f1826e = r5
            c2.n0 r5 = new c2.n0
            r5.<init>()
            r10.f1828f = r5
            db.c1 r3 = db.k0.p(r4, r3)
            r10.f1830g = r3
            r3 = 1065353216(0x3f800000, float:1.0)
            r10.Q = r3
            r10.Z = r2
            r1.e r3 = new r1.e
            r3.<init>()
            r10.f1821b0 = r3
            c2.d0 r4 = new c2.d0
            r1.o0 r5 = r1.o0.f11593d
            r6 = 0
            r8 = 0
            r4.<init>(r5, r6, r8)
            r10.D = r4
            r10.E = r5
            r10.F = r2
            java.util.ArrayDeque r2 = new java.util.ArrayDeque
            r2.<init>()
            r10.f1834i = r2
            c2.f0 r2 = new c2.f0
            r2.<init>()
            r10.f1841m = r2
            c2.f0 r2 = new c2.f0
            r2.<init>()
            r10.f1843n = r2
            c2.j0 r11 = r11.f1765f
            r10.f1847q = r11
            r11 = 34
            r2 = -1
            if (r1 < r11) goto La5
            int r11 = c2.z.c(r0)
            if (r11 == 0) goto La5
            if (r11 == r2) goto La5
            r2 = r11
        La5:
            r10.f1848r = r2
            r11 = 1
            r10.f1844n0 = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.i0.<init>(c2.b0):void");
    }

    public static boolean r(AudioTrack audioTrack) {
        boolean isOffloadedPlayback;
        if (Build.VERSION.SDK_INT >= 29) {
            isOffloadedPlayback = audioTrack.isOffloadedPlayback();
            if (isOffloadedPlayback) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void A(int i6) {
        boolean z10 = false;
        if (this.f1819a0) {
            if (this.Z == i6) {
                this.f1819a0 = false;
            } else {
                return;
            }
        }
        if (this.Z != i6) {
            this.Z = i6;
            if (i6 != 0) {
                z10 = true;
            }
            this.Y = z10;
            g();
        }
    }

    public final void B() {
        PlaybackParams allowDefaults;
        PlaybackParams speed;
        PlaybackParams pitch;
        PlaybackParams audioFallbackMode;
        PlaybackParams playbackParams;
        float speed2;
        PlaybackParams playbackParams2;
        float pitch2;
        if (q()) {
            allowDefaults = android.support.v4.media.c.m().allowDefaults();
            speed = allowDefaults.setSpeed(this.E.f11596a);
            pitch = speed.setPitch(this.E.f11597b);
            audioFallbackMode = pitch.setAudioFallbackMode(2);
            try {
                this.f1853x.setPlaybackParams(audioFallbackMode);
            } catch (IllegalArgumentException e10) {
                u1.a.q("DefaultAudioSink", "Failed to set playback params", e10);
            }
            playbackParams = this.f1853x.getPlaybackParams();
            speed2 = playbackParams.getSpeed();
            playbackParams2 = this.f1853x.getPlaybackParams();
            pitch2 = playbackParams2.getPitch();
            r1.o0 o0Var = new r1.o0(speed2, pitch2);
            this.E = o0Var;
            float f3 = o0Var.f11596a;
            x xVar = this.f1832h;
            xVar.f1943i = f3;
            v vVar = xVar.f1939e;
            if (vVar != null) {
                vVar.a(0);
            }
            xVar.g();
        }
    }

    public final void C(r1.e eVar) {
        if (this.f1821b0.equals(eVar)) {
            return;
        }
        eVar.getClass();
        if (this.f1853x != null) {
            this.f1821b0.getClass();
        }
        this.f1821b0 = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01ee A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0057 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void D(java.nio.ByteBuffer r19) {
        /*
            Method dump skipped, instructions count: 513
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.i0.D(java.nio.ByteBuffer):void");
    }

    public final void E(r1.o0 o0Var) {
        this.E = new r1.o0(u1.a0.h(o0Var.f11596a, 0.1f, 8.0f), u1.a0.h(o0Var.f11597b, 0.1f, 8.0f));
        if (G()) {
            B();
            return;
        }
        d0 d0Var = new d0(o0Var, -9223372036854775807L, -9223372036854775807L);
        if (q()) {
            this.C = d0Var;
        } else {
            this.D = d0Var;
        }
    }

    public final boolean F(r1.q qVar) {
        if (k(qVar) != 0) {
            return true;
        }
        return false;
    }

    public final boolean G() {
        c0 c0Var = this.f1851v;
        if (c0Var != null && c0Var.j && Build.VERSION.SDK_INT >= 23) {
            return true;
        }
        return false;
    }

    public final void a(long j) {
        r1.o0 o0Var;
        boolean z10;
        boolean z11;
        boolean G = G();
        boolean z12 = false;
        j1 j1Var = this.f1820b;
        if (!G) {
            if (!this.f1825d0) {
                c0 c0Var = this.f1851v;
                if (c0Var.f1773c == 0) {
                    int i6 = c0Var.f1771a.H;
                    o0Var = this.E;
                    s1.j jVar = (s1.j) j1Var.A;
                    float f3 = o0Var.f11596a;
                    jVar.getClass();
                    if (f3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    u1.c.b(z10);
                    if (jVar.f12016c != f3) {
                        jVar.f12016c = f3;
                        jVar.f12022i = true;
                    }
                    float f10 = o0Var.f11597b;
                    if (f10 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    u1.c.b(z11);
                    if (jVar.f12017d != f10) {
                        jVar.f12017d = f10;
                        jVar.f12022i = true;
                    }
                    this.E = o0Var;
                }
            }
            o0Var = r1.o0.f11593d;
            this.E = o0Var;
        } else {
            o0Var = r1.o0.f11593d;
        }
        r1.o0 o0Var2 = o0Var;
        if (!this.f1825d0) {
            c0 c0Var2 = this.f1851v;
            if (c0Var2.f1773c == 0) {
                int i10 = c0Var2.f1771a.H;
                z12 = this.F;
                ((m0) j1Var.f950z).f1892o = z12;
            }
        }
        this.F = z12;
        long max = Math.max(0L, j);
        c0 c0Var3 = this.f1851v;
        this.f1834i.add(new d0(o0Var2, max, u1.a0.W(c0Var3.f1775e, m())));
        s1.d dVar = this.f1851v.f1779i;
        this.f1852w = dVar;
        dVar.a();
        q qVar = this.f1849t;
        if (qVar != null) {
            qVar.d(this.F);
        }
    }

    public final AudioTrack b(n nVar, r1.d dVar, int i6, r1.q qVar, Context context) {
        try {
            AudioTrack a10 = this.f1847q.a(nVar, dVar, i6, context);
            int state = a10.getState();
            if (state == 1) {
                return a10;
            }
            try {
                a10.release();
            } catch (Exception unused) {
            }
            throw new p(state, nVar.f1900b, nVar.f1901c, nVar.f1899a, nVar.f1904f, qVar, nVar.f1903e, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e10) {
            throw new p(0, nVar.f1900b, nVar.f1901c, nVar.f1899a, nVar.f1904f, qVar, nVar.f1903e, e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.media.AudioTrack c(c2.c0 r9) {
        /*
            r8 = this;
            int r0 = r8.Z     // Catch: c2.p -> L3a
            int r1 = r8.f1848r     // Catch: c2.p -> L3a
            r2 = -1
            if (r1 == r2) goto L26
            android.content.Context r2 = r8.f1818a     // Catch: c2.p -> L1c
            if (r2 == 0) goto L26
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: c2.p -> L1c
            r4 = 34
            if (r3 < r4) goto L26
            android.content.Context r0 = r8.f1842m0     // Catch: c2.p -> L1c
            if (r0 != 0) goto L20
            android.content.Context r0 = c2.z.n(r2, r1)     // Catch: c2.p -> L1c
            r8.f1842m0 = r0     // Catch: c2.p -> L1c
            goto L20
        L1c:
            r0 = move-exception
            r9 = r0
            r2 = r8
            goto L3d
        L20:
            android.content.Context r0 = r8.f1842m0     // Catch: c2.p -> L1c
            r1 = 0
            r7 = r0
            r5 = 0
            goto L29
        L26:
            r1 = 0
            r5 = r0
            r7 = r1
        L29:
            c2.n r3 = r9.a()     // Catch: c2.p -> L3a
            r1.d r4 = r8.B     // Catch: c2.p -> L3a
            r1.q r6 = r9.f1771a     // Catch: c2.p -> L3a
            r2 = r8
            android.media.AudioTrack r9 = r2.b(r3, r4, r5, r6, r7)     // Catch: c2.p -> L37
            return r9
        L37:
            r0 = move-exception
        L38:
            r9 = r0
            goto L3d
        L3a:
            r0 = move-exception
            r2 = r8
            goto L38
        L3d:
            c2.q r0 = r2.f1849t
            if (r0 == 0) goto L44
            r0.w(r9)
        L44:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.i0.c(c2.c0):android.media.AudioTrack");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01a9, code lost:
    
        if (r11 > 0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01ac, code lost:
    
        if (r15 > 0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01af, code lost:
    
        if (r15 < 0) goto L82;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:50:0x018d. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r13v3, types: [db.e0, db.h0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(r1.q r28, int[] r29) {
        /*
            Method dump skipped, instructions count: 702
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.i0.d(r1.q, int[]):void");
    }

    public final void e(long j) {
        int write;
        q qVar;
        boolean z10;
        boolean z11;
        f0 f0Var = this.f1843n;
        if (this.T != null) {
            boolean z12 = false;
            if (f0Var.f1796a != null) {
                synchronized (o0) {
                    if (f1817q0 > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                }
                if (z11 || SystemClock.elapsedRealtime() < f0Var.f1798c) {
                    return;
                }
            }
            int remaining = this.T.remaining();
            if (this.f1825d0) {
                if (j != -9223372036854775807L) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                u1.c.g(z10);
                if (j == Long.MIN_VALUE) {
                    j = this.f1827e0;
                } else {
                    this.f1827e0 = j;
                }
                AudioTrack audioTrack = this.f1853x;
                ByteBuffer byteBuffer = this.T;
                if (Build.VERSION.SDK_INT >= 26) {
                    write = audioTrack.write(byteBuffer, remaining, 1, j * 1000);
                } else {
                    if (this.G == null) {
                        ByteBuffer allocate = ByteBuffer.allocate(16);
                        this.G = allocate;
                        allocate.order(ByteOrder.BIG_ENDIAN);
                        this.G.putInt(1431633921);
                    }
                    if (this.H == 0) {
                        this.G.putInt(4, remaining);
                        this.G.putLong(8, j * 1000);
                        this.G.position(0);
                        this.H = remaining;
                    }
                    int remaining2 = this.G.remaining();
                    if (remaining2 > 0) {
                        int write2 = audioTrack.write(this.G, remaining2, 1);
                        if (write2 < 0) {
                            this.H = 0;
                            write = write2;
                        } else if (write2 < remaining2) {
                            write = 0;
                        }
                    }
                    write = audioTrack.write(byteBuffer, remaining, 1);
                    if (write < 0) {
                        this.H = 0;
                    } else {
                        this.H -= write;
                    }
                }
            } else {
                write = this.f1853x.write(this.T, remaining, 1);
            }
            this.f1829f0 = SystemClock.elapsedRealtime();
            if (write < 0) {
                if ((Build.VERSION.SDK_INT >= 24 && write == -6) || write == -32) {
                    if (m() <= 0) {
                        if (r(this.f1853x)) {
                            if (this.f1851v.f1773c == 1) {
                                this.f1831g0 = true;
                            }
                        }
                    }
                    z12 = true;
                }
                s sVar = new s(write, this.f1851v.f1771a, z12);
                q qVar2 = this.f1849t;
                if (qVar2 != null) {
                    qVar2.w(sVar);
                }
                if (sVar.f1917y && this.f1818a != null) {
                    d dVar = d.f1782c;
                    this.f1854y = dVar;
                    this.f1855z.a(dVar);
                    throw sVar;
                }
                f0Var.a(sVar);
                return;
            }
            f0Var.f1796a = null;
            f0Var.f1797b = -9223372036854775807L;
            f0Var.f1798c = -9223372036854775807L;
            if (r(this.f1853x)) {
                if (this.L > 0) {
                    this.f1833h0 = false;
                }
                if (this.X && (qVar = this.f1849t) != null && write < remaining && !this.f1833h0) {
                    qVar.j();
                }
            }
            int i6 = this.f1851v.f1773c;
            if (i6 == 0) {
                this.K += write;
            }
            if (write == remaining) {
                if (i6 != 0) {
                    if (this.T == this.R) {
                        z12 = true;
                    }
                    u1.c.g(z12);
                    this.L = (this.M * this.S) + this.L;
                }
                this.T = null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0043 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f() {
        /*
            r6 = this;
            s1.d r0 = r6.f1852w
            boolean r0 = r0.d()
            r1 = -9223372036854775808
            r3 = 0
            r4 = 1
            if (r0 != 0) goto L14
            r6.e(r1)
            java.nio.ByteBuffer r0 = r6.T
            if (r0 != 0) goto L44
            goto L43
        L14:
            s1.d r0 = r6.f1852w
            boolean r5 = r0.d()
            if (r5 == 0) goto L2e
            boolean r5 = r0.f11980d
            if (r5 == 0) goto L21
            goto L2e
        L21:
            r0.f11980d = r4
            java.util.ArrayList r0 = r0.f11978b
            java.lang.Object r0 = r0.get(r3)
            s1.g r0 = (s1.g) r0
            r0.g()
        L2e:
            r6.x(r1)
            s1.d r0 = r6.f1852w
            boolean r0 = r0.c()
            if (r0 == 0) goto L44
            java.nio.ByteBuffer r0 = r6.T
            if (r0 == 0) goto L43
            boolean r0 = r0.hasRemaining()
            if (r0 != 0) goto L44
        L43:
            return r4
        L44:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.i0.f():boolean");
    }

    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, java.util.concurrent.ThreadFactory] */
    public final void g() {
        j1 j1Var;
        if (q()) {
            this.I = 0L;
            this.J = 0L;
            this.K = 0L;
            this.L = 0L;
            this.f1833h0 = false;
            this.M = 0;
            this.D = new d0(this.E, 0L, 0L);
            this.P = 0L;
            this.C = null;
            this.f1834i.clear();
            this.R = null;
            this.S = 0;
            this.T = null;
            this.V = false;
            this.U = false;
            this.W = false;
            this.G = null;
            this.H = 0;
            this.f1824d.f1912o = 0L;
            s1.d dVar = this.f1851v.f1779i;
            this.f1852w = dVar;
            dVar.a();
            AudioTrack audioTrack = this.f1832h.f1937c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.f1853x.pause();
            }
            if (r(this.f1853x)) {
                j1 j1Var2 = this.f1839l;
                j1Var2.getClass();
                this.f1853x.unregisterStreamEventCallback((h0) j1Var2.f949y);
                ((Handler) j1Var2.f950z).removeCallbacksAndMessages(null);
            }
            n a10 = this.f1851v.a();
            c0 c0Var = this.f1850u;
            if (c0Var != null) {
                this.f1851v = c0Var;
                this.f1850u = null;
            }
            x xVar = this.f1832h;
            xVar.g();
            xVar.f1937c = null;
            xVar.f1939e = null;
            if (Build.VERSION.SDK_INT >= 24 && (j1Var = this.A) != null) {
                AudioTrack audioTrack2 = (AudioTrack) j1Var.f949y;
                e0 e0Var = (e0) j1Var.A;
                e0Var.getClass();
                audioTrack2.removeOnRoutingChangedListener(e0Var);
                j1Var.A = null;
                this.A = null;
            }
            AudioTrack audioTrack3 = this.f1853x;
            q qVar = this.f1849t;
            Handler handler = new Handler(Looper.myLooper());
            synchronized (o0) {
                try {
                    if (f1816p0 == null) {
                        String str = u1.a0.f12750a;
                        f1816p0 = Executors.newSingleThreadScheduledExecutor(new Object());
                    }
                    f1817q0++;
                    f1816p0.schedule(new a0(audioTrack3, qVar, handler, a10, 0), 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f1853x = null;
        }
        f0 f0Var = this.f1843n;
        f0Var.f1796a = null;
        f0Var.f1797b = -9223372036854775807L;
        f0Var.f1798c = -9223372036854775807L;
        f0 f0Var2 = this.f1841m;
        f0Var2.f1796a = null;
        f0Var2.f1797b = -9223372036854775807L;
        f0Var2.f1798c = -9223372036854775807L;
        this.f1836j0 = 0L;
        this.f1838k0 = 0L;
        Handler handler2 = this.f1840l0;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }

    public final long h() {
        long j;
        int bufferSizeInFrames;
        int bufferSizeInFrames2;
        if (!q()) {
            return -9223372036854775807L;
        }
        boolean z10 = false;
        if (Build.VERSION.SDK_INT >= 23) {
            AudioTrack audioTrack = this.f1853x;
            c0 c0Var = this.f1851v;
            if (c0Var.f1773c == 0) {
                bufferSizeInFrames2 = audioTrack.getBufferSizeInFrames();
                return u1.a0.W(c0Var.f1775e, bufferSizeInFrames2);
            }
            bufferSizeInFrames = audioTrack.getBufferSizeInFrames();
            long j10 = bufferSizeInFrames;
            int l10 = y2.a.l(c0Var.f1777g);
            if (l10 != -2147483647) {
                z10 = true;
            }
            u1.c.g(z10);
            return u1.a0.Y(j10, 1000000L, l10, RoundingMode.DOWN);
        }
        c0 c0Var2 = this.f1851v;
        if (c0Var2.f1773c == 0) {
            j = c0Var2.f1775e * c0Var2.f1774d;
        } else {
            int l11 = y2.a.l(c0Var2.f1777g);
            if (l11 != -2147483647) {
                z10 = true;
            }
            u1.c.g(z10);
            j = l11;
        }
        return u1.a0.Y(this.f1851v.f1778h, 1000000L, j, RoundingMode.DOWN);
    }

    public final long i() {
        ArrayDeque arrayDeque;
        long j;
        if (q() && !this.O) {
            long min = Math.min(this.f1832h.a(), u1.a0.W(this.f1851v.f1775e, m()));
            while (true) {
                arrayDeque = this.f1834i;
                if (arrayDeque.isEmpty() || min < ((d0) arrayDeque.getFirst()).f1789c) {
                    break;
                }
                this.D = (d0) arrayDeque.remove();
            }
            d0 d0Var = this.D;
            long j10 = min - d0Var.f1789c;
            long z10 = u1.a0.z(j10, d0Var.f1787a.f11596a);
            boolean isEmpty = arrayDeque.isEmpty();
            j1 j1Var = this.f1820b;
            if (isEmpty) {
                s1.j jVar = (s1.j) j1Var.A;
                if (jVar.isActive()) {
                    if (jVar.f12027o >= RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) {
                        long j11 = jVar.f12026n;
                        jVar.j.getClass();
                        long j12 = j11 - ((r8.f12003k * r8.f11995b) * 2);
                        int i6 = jVar.f12021h.f11982a;
                        int i10 = jVar.f12020g.f11982a;
                        if (i6 == i10) {
                            j10 = u1.a0.Y(j10, j12, jVar.f12027o, RoundingMode.DOWN);
                        } else {
                            j10 = u1.a0.Y(j10, j12 * i6, jVar.f12027o * i10, RoundingMode.DOWN);
                        }
                    } else {
                        j10 = (long) (jVar.f12016c * j10);
                    }
                }
                d0 d0Var2 = this.D;
                j = d0Var2.f1788b + j10;
                d0Var2.f1790d = j10 - z10;
            } else {
                d0 d0Var3 = this.D;
                j = d0Var3.f1788b + z10 + d0Var3.f1790d;
            }
            long j13 = ((m0) j1Var.f950z).f1894q;
            long W = u1.a0.W(this.f1851v.f1775e, j13) + j;
            long j14 = this.f1836j0;
            if (j13 > j14) {
                long W2 = u1.a0.W(this.f1851v.f1775e, j13 - j14);
                this.f1836j0 = j13;
                this.f1838k0 += W2;
                if (this.f1840l0 == null) {
                    this.f1840l0 = new Handler(Looper.myLooper());
                }
                this.f1840l0.removeCallbacksAndMessages(null);
                this.f1840l0.postDelayed(new a2.a(this, 10), 100L);
            }
            return W;
        }
        return Long.MIN_VALUE;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [c2.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v8, types: [c2.i, java.lang.Object] */
    public final j j(r1.q qVar) {
        boolean booleanValue;
        boolean z10;
        boolean isOffloadedPlaybackSupported;
        int playbackOffloadSupport;
        if (this.f1831g0) {
            return j.f1856d;
        }
        r1.d dVar = this.B;
        j4.b0 b0Var = this.f1846p;
        b0Var.getClass();
        qVar.getClass();
        int i6 = qVar.G;
        dVar.getClass();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29 && i6 != -1) {
            Context context = (Context) b0Var.f7158x;
            Boolean bool = (Boolean) b0Var.f7159y;
            boolean z11 = false;
            if (bool != null) {
                booleanValue = bool.booleanValue();
            } else {
                if (context != null) {
                    String parameters = s1.c.l(context).getParameters("offloadVariableRateSupported");
                    if (parameters != null && parameters.equals("offloadVariableRateSupported=1")) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    b0Var.f7159y = Boolean.valueOf(z10);
                } else {
                    b0Var.f7159y = Boolean.FALSE;
                }
                booleanValue = ((Boolean) b0Var.f7159y).booleanValue();
            }
            String str = qVar.f11670n;
            str.getClass();
            int d10 = r1.k0.d(str, qVar.f11667k);
            if (d10 != 0 && i10 >= u1.a0.p(d10)) {
                int r10 = u1.a0.r(qVar.F);
                if (r10 == 0) {
                    return j.f1856d;
                }
                try {
                    AudioFormat q9 = u1.a0.q(i6, r10, d10);
                    if (i10 >= 31) {
                        playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(q9, (AudioAttributes) dVar.b().f11625a);
                        if (playbackOffloadSupport == 0) {
                            return j.f1856d;
                        }
                        ?? obj = new Object();
                        if (i10 > 32 && playbackOffloadSupport == 2) {
                            z11 = true;
                        }
                        obj.f1813a = true;
                        obj.f1814b = z11;
                        obj.f1815c = booleanValue;
                        return obj.a();
                    }
                    isOffloadedPlaybackSupported = AudioManager.isOffloadedPlaybackSupported(q9, (AudioAttributes) dVar.b().f11625a);
                    if (!isOffloadedPlaybackSupported) {
                        return j.f1856d;
                    }
                    ?? obj2 = new Object();
                    obj2.f1813a = true;
                    obj2.f1815c = booleanValue;
                    return obj2.a();
                } catch (IllegalArgumentException unused) {
                    return j.f1856d;
                }
            }
            return j.f1856d;
        }
        return j.f1856d;
    }

    public final int k(r1.q qVar) {
        s();
        String str = qVar.f11670n;
        int i6 = qVar.H;
        if ("audio/raw".equals(str)) {
            if (!u1.a0.L(i6)) {
                h8.c.p(i6, "Invalid PCM encoding: ", "DefaultAudioSink");
                return 0;
            }
            if (i6 != 2) {
                return 1;
            }
        } else if (this.f1854y.d(qVar, this.B) == null) {
            return 0;
        }
        return 2;
    }

    public final long l() {
        if (this.f1851v.f1773c == 0) {
            return this.I / r0.f1772b;
        }
        return this.J;
    }

    public final long m() {
        c0 c0Var = this.f1851v;
        if (c0Var.f1773c == 0) {
            long j = this.K;
            long j10 = c0Var.f1774d;
            String str = u1.a0.f12750a;
            return ((j + j10) - 1) / j10;
        }
        return this.L;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0113, code lost:
    
        if (r9.b() == 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x03b6, code lost:
    
        if (r13 == 0) goto L223;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:74:0x019d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:228:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:230:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean n(long r27, int r29, java.nio.ByteBuffer r30) {
        /*
            Method dump skipped, instructions count: 1216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.i0.n(long, int, java.nio.ByteBuffer):boolean");
    }

    public final boolean o() {
        boolean isOffloadedPlayback;
        if (q()) {
            if (Build.VERSION.SDK_INT >= 29) {
                isOffloadedPlayback = this.f1853x.isOffloadedPlayback();
                if (isOffloadedPlayback && this.W) {
                    return false;
                }
            }
            if (this.f1832h.e(m())) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean p() {
        /*
            Method dump skipped, instructions count: 423
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.i0.p():boolean");
    }

    public final boolean q() {
        if (this.f1853x != null) {
            return true;
        }
        return false;
    }

    public final void s() {
        boolean z10;
        String name;
        Context context;
        d dVar;
        e eVar;
        Looper myLooper = Looper.myLooper();
        if (this.f1855z != null && this.f1835i0 != myLooper) {
            z10 = false;
        } else {
            z10 = true;
        }
        StringBuilder sb2 = new StringBuilder("DefaultAudioSink accessed on multiple threads: ");
        Looper looper = this.f1835i0;
        String str = "null";
        if (looper == null) {
            name = "null";
        } else {
            name = looper.getThread().getName();
        }
        sb2.append(name);
        sb2.append(" and ");
        if (myLooper != null) {
            str = myLooper.getThread().getName();
        }
        sb2.append(str);
        u1.c.f(sb2.toString(), z10);
        if (this.f1855z == null && (context = this.f1818a) != null) {
            this.f1835i0 = myLooper;
            h hVar = new h(context, new a2.e0(this, 12), this.B, this.f1823c0);
            this.f1855z = hVar;
            if (hVar.j) {
                dVar = hVar.f1809g;
                dVar.getClass();
            } else {
                hVar.j = true;
                f fVar = hVar.f1808f;
                if (fVar != null) {
                    fVar.f1793a.registerContentObserver(fVar.f1794b, false, fVar);
                }
                int i6 = Build.VERSION.SDK_INT;
                Handler handler = hVar.f1805c;
                Context context2 = hVar.f1803a;
                if (i6 >= 23 && (eVar = hVar.f1806d) != null) {
                    s1.c.l(context2).registerAudioDeviceCallback(eVar, handler);
                }
                d b10 = d.b(context2, context2.registerReceiver(hVar.f1807e, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), hVar.f1811i, hVar.f1810h);
                hVar.f1809g = b10;
                dVar = b10;
            }
            this.f1854y = dVar;
        }
        this.f1854y.getClass();
    }

    public final void t() {
        this.X = false;
        if (q()) {
            x xVar = this.f1832h;
            xVar.g();
            if (xVar.f1958z == -9223372036854775807L) {
                v vVar = xVar.f1939e;
                vVar.getClass();
                vVar.a(0);
            }
            xVar.B = xVar.b();
            if (!this.V || r(this.f1853x)) {
                this.f1853x.pause();
            }
        }
    }

    public final void u() {
        this.X = true;
        if (q()) {
            x xVar = this.f1832h;
            if (xVar.f1958z != -9223372036854775807L) {
                xVar.I.getClass();
                xVar.f1958z = u1.a0.Q(SystemClock.elapsedRealtime());
            }
            xVar.f1944k = u1.a0.W(xVar.f1940f, xVar.b());
            v vVar = xVar.f1939e;
            vVar.getClass();
            vVar.a(0);
            if (!this.V || r(this.f1853x)) {
                this.f1853x.play();
            }
        }
    }

    public final void v() {
        if (!this.V) {
            this.V = true;
            long m9 = m();
            x xVar = this.f1832h;
            xVar.B = xVar.b();
            xVar.I.getClass();
            xVar.f1958z = u1.a0.Q(SystemClock.elapsedRealtime());
            xVar.C = m9;
            if (r(this.f1853x)) {
                this.W = false;
            }
            this.f1853x.stop();
            this.H = 0;
        }
    }

    public final void w() {
        if (!this.U && q() && f()) {
            v();
            this.U = true;
        }
    }

    public final void x(long j) {
        ByteBuffer byteBuffer;
        e(j);
        if (this.T == null) {
            if (!this.f1852w.d()) {
                ByteBuffer byteBuffer2 = this.R;
                if (byteBuffer2 != null) {
                    D(byteBuffer2);
                    e(j);
                    return;
                }
                return;
            }
            while (!this.f1852w.c()) {
                do {
                    s1.d dVar = this.f1852w;
                    if (!dVar.d()) {
                        byteBuffer = s1.g.f11986a;
                    } else {
                        ByteBuffer byteBuffer3 = dVar.f11979c[dVar.b()];
                        if (byteBuffer3.hasRemaining()) {
                            byteBuffer = byteBuffer3;
                        } else {
                            dVar.e(s1.g.f11986a);
                            byteBuffer = dVar.f11979c[dVar.b()];
                        }
                    }
                    if (byteBuffer.hasRemaining()) {
                        D(byteBuffer);
                        e(j);
                    } else {
                        ByteBuffer byteBuffer4 = this.R;
                        if (byteBuffer4 != null && byteBuffer4.hasRemaining()) {
                            s1.d dVar2 = this.f1852w;
                            ByteBuffer byteBuffer5 = this.R;
                            if (dVar2.d() && !dVar2.f11980d) {
                                dVar2.e(byteBuffer5);
                            }
                        } else {
                            return;
                        }
                    }
                } while (this.T == null);
                return;
            }
        }
    }

    public final void y() {
        g();
        db.i0 listIterator = this.f1830g.listIterator(0);
        while (listIterator.hasNext()) {
            ((s1.g) listIterator.next()).reset();
        }
        this.f1826e.reset();
        this.f1828f.reset();
        s1.d dVar = this.f1852w;
        if (dVar != null) {
            db.k0 k0Var = dVar.f11977a;
            for (int i6 = 0; i6 < k0Var.size(); i6++) {
                s1.g gVar = (s1.g) k0Var.get(i6);
                gVar.flush();
                gVar.reset();
            }
            dVar.f11979c = new ByteBuffer[0];
            s1.e eVar = s1.e.f11981e;
            dVar.f11980d = false;
        }
        this.X = false;
        this.f1831g0 = false;
    }

    public final void z(r1.d dVar) {
        if (!this.B.equals(dVar)) {
            this.B = dVar;
            if (this.f1825d0) {
                return;
            }
            h hVar = this.f1855z;
            if (hVar != null) {
                hVar.f1811i = dVar;
                hVar.a(d.c(hVar.f1803a, dVar, hVar.f1810h));
            }
            g();
        }
    }
}
