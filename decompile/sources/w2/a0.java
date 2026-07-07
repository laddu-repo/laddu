package w2;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.view.Display;
import android.view.Surface;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final f f13581a;

    /* renamed from: b, reason: collision with root package name */
    public final y f13582b;

    /* renamed from: c, reason: collision with root package name */
    public final z f13583c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f13584d;

    /* renamed from: e, reason: collision with root package name */
    public Surface f13585e;

    /* renamed from: f, reason: collision with root package name */
    public float f13586f;

    /* renamed from: g, reason: collision with root package name */
    public float f13587g;

    /* renamed from: h, reason: collision with root package name */
    public float f13588h;

    /* renamed from: i, reason: collision with root package name */
    public float f13589i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public long f13590k;

    /* renamed from: l, reason: collision with root package name */
    public long f13591l;

    /* renamed from: m, reason: collision with root package name */
    public long f13592m;

    /* renamed from: n, reason: collision with root package name */
    public long f13593n;

    /* renamed from: o, reason: collision with root package name */
    public long f13594o;

    /* renamed from: p, reason: collision with root package name */
    public long f13595p;

    /* renamed from: q, reason: collision with root package name */
    public long f13596q;

    /* JADX WARN: Type inference failed for: r0v0, types: [w2.f, java.lang.Object] */
    public a0(Context context) {
        DisplayManager displayManager;
        y yVar;
        ?? obj = new Object();
        obj.f13631a = new e();
        obj.f13632b = new e();
        obj.f13634d = -9223372036854775807L;
        this.f13581a = obj;
        if (context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null) {
            yVar = null;
        } else {
            yVar = new y(this, displayManager);
        }
        this.f13582b = yVar;
        this.f13583c = yVar != null ? z.B : null;
        this.f13590k = -9223372036854775807L;
        this.f13591l = -9223372036854775807L;
        this.f13586f = -1.0f;
        this.f13589i = 1.0f;
        this.j = 0;
    }

    public static void a(a0 a0Var, Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            a0Var.f13590k = refreshRate;
            a0Var.f13591l = (refreshRate * 80) / 100;
        } else {
            u1.a.p("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            a0Var.f13590k = -9223372036854775807L;
            a0Var.f13591l = -9223372036854775807L;
        }
    }

    public final void b() {
        Surface surface;
        if (Build.VERSION.SDK_INT >= 30 && (surface = this.f13585e) != null && this.j != Integer.MIN_VALUE && this.f13588h != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.f13588h = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            try {
                surface.setFrameRate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
            } catch (IllegalStateException e10) {
                u1.a.h("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e10);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c() {
        /*
            r9 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L8e
            android.view.Surface r0 = r9.f13585e
            if (r0 != 0) goto Lc
            goto L8e
        Lc:
            w2.f r0 = r9.f13581a
            w2.e r2 = r0.f13631a
            boolean r2 = r2.a()
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r2 == 0) goto L3a
            w2.e r2 = r0.f13631a
            boolean r2 = r2.a()
            if (r2 == 0) goto L37
            w2.e r2 = r0.f13631a
            long r4 = r2.f13627e
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L2b
            goto L2e
        L2b:
            long r6 = r2.f13628f
            long r6 = r6 / r4
        L2e:
            double r4 = (double) r6
            r6 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
            double r6 = r6 / r4
            float r2 = (float) r6
            goto L3c
        L37:
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L3c
        L3a:
            float r2 = r9.f13586f
        L3c:
            float r4 = r9.f13587g
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 != 0) goto L43
            goto L8e
        L43:
            int r5 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r5 == 0) goto L81
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 == 0) goto L81
            w2.e r1 = r0.f13631a
            boolean r1 = r1.a()
            if (r1 == 0) goto L72
            w2.e r1 = r0.f13631a
            boolean r1 = r1.a()
            if (r1 == 0) goto L60
            w2.e r0 = r0.f13631a
            long r0 = r0.f13628f
            goto L65
        L60:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L65:
            r3 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 < 0) goto L72
            r0 = 1017370378(0x3ca3d70a, float:0.02)
            goto L74
        L72:
            r0 = 1065353216(0x3f800000, float:1.0)
        L74:
            float r1 = r9.f13587g
            float r1 = r2 - r1
            float r1 = java.lang.Math.abs(r1)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L8e
            goto L88
        L81:
            if (r5 == 0) goto L84
            goto L88
        L84:
            int r0 = r0.f13635e
            if (r0 < r1) goto L8e
        L88:
            r9.f13587g = r2
            r0 = 0
            r9.d(r0)
        L8e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.a0.c():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(boolean r5) {
        /*
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L42
            android.view.Surface r0 = r4.f13585e
            if (r0 == 0) goto L42
            int r1 = r4.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r2) goto L11
            goto L42
        L11:
            boolean r1 = r4.f13584d
            r2 = 0
            if (r1 == 0) goto L23
            float r1 = r4.f13587g
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 == 0) goto L23
            float r3 = r4.f13589i
            float r1 = r1 * r3
            goto L24
        L23:
            r1 = 0
        L24:
            if (r5 != 0) goto L2d
            float r5 = r4.f13588h
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L2d
            goto L42
        L2d:
            r4.f13588h = r1
            int r5 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r5 != 0) goto L35
            r5 = 0
            goto L36
        L35:
            r5 = 1
        L36:
            t0.h1.h(r0, r1, r5)     // Catch: java.lang.IllegalStateException -> L3a
            return
        L3a:
            r5 = move-exception
            java.lang.String r0 = "VideoFrameReleaseHelper"
            java.lang.String r1 = "Failed to call Surface.setFrameRate"
            u1.a.h(r0, r1, r5)
        L42:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.a0.d(boolean):void");
    }
}
