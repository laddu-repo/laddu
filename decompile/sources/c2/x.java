package c2;

import android.media.AudioTrack;
import android.os.Build;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.math.RoundingMode;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class x {
    public long A;
    public long B;
    public long C;
    public boolean D;
    public long E;
    public long F;
    public boolean G;
    public long H;
    public u1.v I;

    /* renamed from: a, reason: collision with root package name */
    public final u5.r f1935a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f1936b;

    /* renamed from: c, reason: collision with root package name */
    public AudioTrack f1937c;

    /* renamed from: d, reason: collision with root package name */
    public int f1938d;

    /* renamed from: e, reason: collision with root package name */
    public v f1939e;

    /* renamed from: f, reason: collision with root package name */
    public int f1940f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1941g;

    /* renamed from: h, reason: collision with root package name */
    public long f1942h;

    /* renamed from: i, reason: collision with root package name */
    public float f1943i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public long f1944k;

    /* renamed from: l, reason: collision with root package name */
    public int f1945l;

    /* renamed from: m, reason: collision with root package name */
    public long f1946m;

    /* renamed from: n, reason: collision with root package name */
    public long f1947n;

    /* renamed from: o, reason: collision with root package name */
    public Method f1948o;

    /* renamed from: p, reason: collision with root package name */
    public long f1949p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1950q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f1951r;
    public long s;

    /* renamed from: t, reason: collision with root package name */
    public long f1952t;

    /* renamed from: u, reason: collision with root package name */
    public long f1953u;

    /* renamed from: v, reason: collision with root package name */
    public long f1954v;

    /* renamed from: w, reason: collision with root package name */
    public long f1955w;

    /* renamed from: x, reason: collision with root package name */
    public int f1956x;

    /* renamed from: y, reason: collision with root package name */
    public int f1957y;

    /* renamed from: z, reason: collision with root package name */
    public long f1958z;

    public x(u5.r rVar) {
        this.f1935a = rVar;
        try {
            this.f1948o = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f1936b = new long[10];
        this.F = -9223372036854775807L;
        this.E = -9223372036854775807L;
        this.I = u1.v.f12817a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a() {
        /*
            Method dump skipped, instructions count: 917
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.x.a():long");
    }

    public final long b() {
        if (this.f1958z != -9223372036854775807L) {
            return Math.min(this.C, d());
        }
        this.I.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.f1952t >= 5) {
            AudioTrack audioTrack = this.f1937c;
            audioTrack.getClass();
            int playState = audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
                if (this.f1941g) {
                    if (playState == 2 && playbackHeadPosition == 0) {
                        this.f1955w = this.f1953u;
                    }
                    playbackHeadPosition += this.f1955w;
                }
                if (Build.VERSION.SDK_INT <= 29) {
                    if (playbackHeadPosition == 0 && this.f1953u > 0 && playState == 3) {
                        if (this.A == -9223372036854775807L) {
                            this.A = elapsedRealtime;
                        }
                    } else {
                        this.A = -9223372036854775807L;
                    }
                }
                long j = this.f1953u;
                if (j > playbackHeadPosition) {
                    if (this.G) {
                        this.H += j;
                        this.G = false;
                    } else {
                        this.f1954v++;
                    }
                }
                this.f1953u = playbackHeadPosition;
            }
            this.f1952t = elapsedRealtime;
        }
        return this.f1953u + this.H + (this.f1954v << 32);
    }

    public final long c(long j) {
        long z10;
        if (this.f1957y == 0) {
            if (this.f1958z != -9223372036854775807L) {
                z10 = u1.a0.W(this.f1940f, d());
            } else {
                z10 = u1.a0.W(this.f1940f, b());
            }
        } else {
            z10 = u1.a0.z(j + this.f1946m, this.f1943i);
        }
        long max = Math.max(0L, z10 - this.f1949p);
        if (this.f1958z != -9223372036854775807L) {
            return Math.min(u1.a0.W(this.f1940f, this.C), max);
        }
        return max;
    }

    public final long d() {
        AudioTrack audioTrack = this.f1937c;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 2) {
            return this.B;
        }
        this.I.getClass();
        return this.B + u1.a0.Y(u1.a0.z(u1.a0.Q(SystemClock.elapsedRealtime()) - this.f1958z, this.f1943i), this.f1940f, 1000000L, RoundingMode.UP);
    }

    public final boolean e(long j) {
        long a10 = a();
        int i6 = this.f1940f;
        String str = u1.a0.f12750a;
        if (j <= u1.a0.Y(a10, i6, 1000000L, RoundingMode.UP)) {
            if (this.f1941g) {
                AudioTrack audioTrack = this.f1937c;
                audioTrack.getClass();
                if (audioTrack.getPlayState() != 2 || b() != 0) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final void f(long j) {
        if (this.D) {
            long j10 = this.f1944k;
            if (j10 != -9223372036854775807L && j >= j10) {
                long D = u1.a0.D(j - j10, this.f1943i);
                this.I.getClass();
                long currentTimeMillis = System.currentTimeMillis() - u1.a0.e0(D);
                this.f1944k = -9223372036854775807L;
                q qVar = ((i0) this.f1935a.f12916y).f1849t;
                if (qVar != null) {
                    qVar.f(currentTimeMillis);
                }
            }
        }
    }

    public final void g() {
        this.f1946m = 0L;
        this.f1957y = 0;
        this.f1956x = 0;
        this.f1947n = 0L;
        this.E = -9223372036854775807L;
        this.F = -9223372036854775807L;
        this.j = false;
    }
}
