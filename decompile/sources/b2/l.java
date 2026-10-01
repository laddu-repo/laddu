package b2;

import a2.c0;
import android.content.Context;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import java.util.HashMap;
import java.util.concurrent.Executor;
import r1.a0;
import r1.a1;
import r1.c1;
import r1.d1;
import r1.n0;
import r1.q;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class l {
    public int A;
    public boolean B;

    /* renamed from: a, reason: collision with root package name */
    public final Context f1385a;

    /* renamed from: c, reason: collision with root package name */
    public final h f1387c;

    /* renamed from: d, reason: collision with root package name */
    public final PlaybackSession f1388d;
    public String j;

    /* renamed from: k, reason: collision with root package name */
    public PlaybackMetrics.Builder f1394k;

    /* renamed from: l, reason: collision with root package name */
    public int f1395l;

    /* renamed from: o, reason: collision with root package name */
    public n0 f1398o;

    /* renamed from: p, reason: collision with root package name */
    public k f1399p;

    /* renamed from: q, reason: collision with root package name */
    public k f1400q;

    /* renamed from: r, reason: collision with root package name */
    public k f1401r;
    public q s;

    /* renamed from: t, reason: collision with root package name */
    public q f1402t;

    /* renamed from: u, reason: collision with root package name */
    public q f1403u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f1404v;

    /* renamed from: w, reason: collision with root package name */
    public int f1405w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f1406x;

    /* renamed from: y, reason: collision with root package name */
    public int f1407y;

    /* renamed from: z, reason: collision with root package name */
    public int f1408z;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f1386b = u1.a.i();

    /* renamed from: f, reason: collision with root package name */
    public final c1 f1390f = new c1();

    /* renamed from: g, reason: collision with root package name */
    public final a1 f1391g = new a1();

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f1393i = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f1392h = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final long f1389e = SystemClock.elapsedRealtime();

    /* renamed from: m, reason: collision with root package name */
    public int f1396m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f1397n = 0;

    public l(Context context, PlaybackSession playbackSession) {
        this.f1385a = context.getApplicationContext();
        this.f1388d = playbackSession;
        h hVar = new h();
        this.f1387c = hVar;
        hVar.f1376d = this;
    }

    public final boolean a(k kVar) {
        String str;
        if (kVar != null) {
            String str2 = (String) kVar.A;
            h hVar = this.f1387c;
            synchronized (hVar) {
                str = hVar.f1378f;
            }
            if (str2.equals(str)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void b() {
        long longValue;
        long longValue2;
        int i6;
        PlaybackMetrics build;
        PlaybackMetrics.Builder builder = this.f1394k;
        if (builder != null && this.B) {
            builder.setAudioUnderrunCount(this.A);
            this.f1394k.setVideoFramesDropped(this.f1407y);
            this.f1394k.setVideoFramesPlayed(this.f1408z);
            Long l10 = (Long) this.f1392h.get(this.j);
            PlaybackMetrics.Builder builder2 = this.f1394k;
            if (l10 == null) {
                longValue = 0;
            } else {
                longValue = l10.longValue();
            }
            builder2.setNetworkTransferDurationMillis(longValue);
            Long l11 = (Long) this.f1393i.get(this.j);
            PlaybackMetrics.Builder builder3 = this.f1394k;
            if (l11 == null) {
                longValue2 = 0;
            } else {
                longValue2 = l11.longValue();
            }
            builder3.setNetworkBytesRead(longValue2);
            PlaybackMetrics.Builder builder4 = this.f1394k;
            if (l11 != null && l11.longValue() > 0) {
                i6 = 1;
            } else {
                i6 = 0;
            }
            builder4.setStreamSource(i6);
            build = this.f1394k.build();
            this.f1386b.execute(new c0(4, this, build));
        }
        this.f1394k = null;
        this.j = null;
        this.A = 0;
        this.f1407y = 0;
        this.f1408z = 0;
        this.s = null;
        this.f1402t = null;
        this.f1403u = null;
        this.B = false;
    }

    public final void c(d1 d1Var, q2.c0 c0Var) {
        int b10;
        PlaybackMetrics.Builder builder = this.f1394k;
        if (c0Var == null || (b10 = d1Var.b(c0Var.f10834a)) == -1) {
            return;
        }
        a1 a1Var = this.f1391g;
        int i6 = 0;
        d1Var.f(b10, a1Var, false);
        int i10 = a1Var.f11297c;
        c1 c1Var = this.f1390f;
        d1Var.n(i10, c1Var);
        a0 a0Var = c1Var.f11329c.f11379b;
        int i11 = 2;
        if (a0Var != null) {
            int I = u1.a0.I(a0Var.f11283a, a0Var.f11284b);
            if (I != 0) {
                if (I != 1) {
                    if (I != 2) {
                        i6 = 1;
                    } else {
                        i6 = 4;
                    }
                } else {
                    i6 = 5;
                }
            } else {
                i6 = 3;
            }
        }
        builder.setStreamType(i6);
        if (c1Var.f11338m != -9223372036854775807L && !c1Var.f11336k && !c1Var.f11335i && !c1Var.a()) {
            builder.setMediaDurationMillis(u1.a0.e0(c1Var.f11338m));
        }
        if (!c1Var.a()) {
            i11 = 1;
        }
        builder.setPlaybackType(i11);
        this.B = true;
    }

    public final void d(a aVar, String str) {
        q2.c0 c0Var = aVar.f1347d;
        if ((c0Var == null || !c0Var.b()) && str.equals(this.j)) {
            b();
        }
        this.f1392h.remove(str);
        this.f1393i.remove(str);
    }

    public final void e(int i6, long j, q qVar, int i10) {
        TrackChangeEvent.Builder timeSinceCreatedMillis;
        TrackChangeEvent build;
        int i11;
        String str;
        timeSinceCreatedMillis = i.l(i6).setTimeSinceCreatedMillis(j - this.f1389e);
        int i12 = 1;
        if (qVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i10 != 1) {
                i11 = 3;
                if (i10 != 2) {
                    if (i10 != 3) {
                        i11 = 1;
                    } else {
                        i11 = 4;
                    }
                }
            } else {
                i11 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i11);
            String str2 = qVar.f11669m;
            if (str2 != null) {
                timeSinceCreatedMillis.setContainerMimeType(str2);
            }
            String str3 = qVar.f11670n;
            if (str3 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str3);
            }
            String str4 = qVar.f11667k;
            if (str4 != null) {
                timeSinceCreatedMillis.setCodecName(str4);
            }
            int i13 = qVar.j;
            if (i13 != -1) {
                timeSinceCreatedMillis.setBitrate(i13);
            }
            int i14 = qVar.f11676u;
            if (i14 != -1) {
                timeSinceCreatedMillis.setWidth(i14);
            }
            int i15 = qVar.f11677v;
            if (i15 != -1) {
                timeSinceCreatedMillis.setHeight(i15);
            }
            int i16 = qVar.F;
            if (i16 != -1) {
                timeSinceCreatedMillis.setChannelCount(i16);
            }
            int i17 = qVar.G;
            if (i17 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i17);
            }
            String str5 = qVar.f11661d;
            if (str5 != null) {
                String str6 = u1.a0.f12750a;
                String[] split = str5.split("-", -1);
                String str7 = split[0];
                if (split.length >= 2) {
                    str = split[1];
                } else {
                    str = null;
                }
                Pair create = Pair.create(str7, str);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                Object obj = create.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f3 = qVar.f11680y;
            if (f3 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f3);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.B = true;
        build = timeSinceCreatedMillis.build();
        this.f1386b.execute(new c0(i12, this, build));
    }
}
