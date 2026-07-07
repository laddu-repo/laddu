package w2;

import a2.b2;
import a2.q0;
import a2.y1;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.UnityAdsConstants;
import db.c1;
import db.i0;
import db.k0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;
import q2.z0;
import r1.a1;
import r1.d1;
import r1.o1;
import r1.p1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class k extends j2.t {
    public static final int[] U1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public static boolean V1;
    public static boolean W1;
    public long A1;
    public int B1;
    public int C1;
    public int D1;
    public b2 E1;
    public boolean F1;
    public long G1;
    public int H1;
    public long I1;
    public p1 J1;
    public p1 K1;
    public int L1;
    public boolean M1;
    public int N1;
    public j O1;
    public v P1;
    public long Q1;
    public long R1;
    public boolean S1;
    public int T1;

    /* renamed from: e1, reason: collision with root package name */
    public final Context f13650e1;

    /* renamed from: f1, reason: collision with root package name */
    public final boolean f13651f1;

    /* renamed from: g1, reason: collision with root package name */
    public final s8.l f13652g1;

    /* renamed from: h1, reason: collision with root package name */
    public final int f13653h1;

    /* renamed from: i1, reason: collision with root package name */
    public final boolean f13654i1;

    /* renamed from: j1, reason: collision with root package name */
    public final w f13655j1;

    /* renamed from: k1, reason: collision with root package name */
    public final cg.d f13656k1;

    /* renamed from: l1, reason: collision with root package name */
    public final long f13657l1;

    /* renamed from: m1, reason: collision with root package name */
    public final PriorityQueue f13658m1;

    /* renamed from: n1, reason: collision with root package name */
    public a3.c f13659n1;

    /* renamed from: o1, reason: collision with root package name */
    public boolean f13660o1;

    /* renamed from: p1, reason: collision with root package name */
    public boolean f13661p1;

    /* renamed from: q1, reason: collision with root package name */
    public h0 f13662q1;

    /* renamed from: r1, reason: collision with root package name */
    public boolean f13663r1;

    /* renamed from: s1, reason: collision with root package name */
    public int f13664s1;

    /* renamed from: t1, reason: collision with root package name */
    public List f13665t1;

    /* renamed from: u1, reason: collision with root package name */
    public Surface f13666u1;

    /* renamed from: v1, reason: collision with root package name */
    public m f13667v1;

    /* renamed from: w1, reason: collision with root package name */
    public u1.u f13668w1;

    /* renamed from: x1, reason: collision with root package name */
    public boolean f13669x1;

    /* renamed from: y1, reason: collision with root package name */
    public int f13670y1;

    /* renamed from: z1, reason: collision with root package name */
    public int f13671z1;

    public k(i iVar) {
        super(2, iVar.f13643c, 30.0f);
        boolean z10;
        Context applicationContext = iVar.f13641a.getApplicationContext();
        this.f13650e1 = applicationContext;
        this.f13653h1 = iVar.f13647g;
        this.f13662q1 = null;
        this.f13652g1 = new s8.l(iVar.f13645e, iVar.f13646f);
        if (this.f13662q1 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f13651f1 = z10;
        this.f13655j1 = new w(applicationContext, this, iVar.f13644d);
        this.f13656k1 = new cg.d();
        this.f13654i1 = "NVIDIA".equals(Build.MANUFACTURER);
        this.f13668w1 = u1.u.f12814c;
        this.f13670y1 = 1;
        this.f13671z1 = 0;
        this.J1 = p1.f11626d;
        this.N1 = 0;
        this.K1 = null;
        this.L1 = -1000;
        this.Q1 = -9223372036854775807L;
        this.R1 = -9223372036854775807L;
        this.f13658m1 = new PriorityQueue();
        this.f13657l1 = -9223372036854775807L;
        this.E1 = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0084, code lost:
    
        if (r3.equals(com.unity3d.services.core.device.MimeTypes.VIDEO_AV1) == false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A0(j2.q r11, r1.q r12) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.k.A0(j2.q, r1.q):int");
    }

    public static List B0(Context context, j2.l lVar, r1.q qVar, boolean z10, boolean z11) {
        List b10;
        String str = qVar.f11670n;
        if (str == null) {
            return c1.B;
        }
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !dg.b.e(context)) {
            String b11 = j2.a0.b(qVar);
            if (b11 == null) {
                b10 = c1.B;
            } else {
                b10 = lVar.b(b11, z10, z11);
            }
            if (!b10.isEmpty()) {
                return b10;
            }
        }
        return j2.a0.f(lVar, qVar, z10, z11);
    }

    public static int C0(j2.q qVar, r1.q qVar2) {
        int i6 = qVar2.f11671o;
        List list = qVar2.f11673q;
        if (i6 != -1) {
            int size = list.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                i10 += ((byte[]) list.get(i11)).length;
            }
            return qVar2.f11671o + i10;
        }
        return A0(qVar, qVar2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x0737, code lost:
    
        if (r0.equals("ELUGA_Ray_X") == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x08bb, code lost:
    
        if (r13.equals("JSN-L21") == false) goto L664;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008b A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean z0(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 3210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.k.z0(java.lang.String):boolean");
    }

    @Override // j2.t
    public final a2.i D(j2.q qVar, r1.q qVar2, r1.q qVar3) {
        int i6;
        a2.i b10 = qVar.b(qVar2, qVar3);
        int i10 = b10.f269e;
        a3.c cVar = this.f13659n1;
        cVar.getClass();
        if (qVar3.f11676u > cVar.f521a || qVar3.f11677v > cVar.f522b) {
            i10 |= 256;
        }
        if (C0(qVar, qVar3) > cVar.f523c) {
            i10 |= 64;
        }
        int i11 = i10;
        String str = qVar.f7091a;
        if (i11 != 0) {
            i6 = 0;
        } else {
            i6 = b10.f268d;
        }
        return new a2.i(str, qVar2, qVar3, i6, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0059  */
    /* JADX WARN: Type inference failed for: r0v10, types: [android.os.HandlerThread, java.lang.Thread, android.os.Handler$Callback, java.lang.Object, w2.l] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.Surface D0(j2.q r6) {
        /*
            r5 = this;
            w2.h0 r0 = r5.f13662q1
            if (r0 == 0) goto L9
            android.view.Surface r6 = r0.d()
            return r6
        L9:
            android.view.Surface r0 = r5.f13666u1
            if (r0 == 0) goto Le
            return r0
        Le:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 35
            r2 = 0
            if (r0 < r1) goto L1a
            boolean r0 = r6.f7098h
            if (r0 == 0) goto L1a
            return r2
        L1a:
            boolean r0 = r5.L0(r6)
            u1.c.g(r0)
            w2.m r0 = r5.f13667v1
            if (r0 == 0) goto L32
            boolean r1 = r0.f13675x
            boolean r3 = r6.f7096f
            if (r1 == r3) goto L32
            if (r0 == 0) goto L32
            r0.release()
            r5.f13667v1 = r2
        L32:
            w2.m r0 = r5.f13667v1
            if (r0 != 0) goto Lab
            android.content.Context r0 = r5.f13650e1
            boolean r6 = r6.f7096f
            r1 = 1
            r2 = 0
            if (r6 == 0) goto L47
            boolean r0 = w2.m.b(r0)
            if (r0 == 0) goto L45
            goto L49
        L45:
            r0 = 0
            goto L4a
        L47:
            int r0 = w2.m.A
        L49:
            r0 = 1
        L4a:
            u1.c.g(r0)
            w2.l r0 = new w2.l
            java.lang.String r3 = "ExoPlayer:PlaceholderSurface"
            r0.<init>(r3)
            if (r6 == 0) goto L59
            int r6 = w2.m.A
            goto L5a
        L59:
            r6 = 0
        L5a:
            r0.start()
            android.os.Handler r3 = new android.os.Handler
            android.os.Looper r4 = r0.getLooper()
            r3.<init>(r4, r0)
            r0.f13673y = r3
            u1.i r4 = new u1.i
            r4.<init>(r3)
            r0.f13672x = r4
            monitor-enter(r0)
            android.os.Handler r3 = r0.f13673y     // Catch: java.lang.Throwable -> L89
            android.os.Message r6 = r3.obtainMessage(r1, r6, r2)     // Catch: java.lang.Throwable -> L89
            r6.sendToTarget()     // Catch: java.lang.Throwable -> L89
        L79:
            w2.m r6 = r0.B     // Catch: java.lang.Throwable -> L89
            if (r6 != 0) goto L8d
            java.lang.RuntimeException r6 = r0.A     // Catch: java.lang.Throwable -> L89
            if (r6 != 0) goto L8d
            java.lang.Error r6 = r0.f13674z     // Catch: java.lang.Throwable -> L89
            if (r6 != 0) goto L8d
            r0.wait()     // Catch: java.lang.Throwable -> L89 java.lang.InterruptedException -> L8b
            goto L79
        L89:
            r6 = move-exception
            goto La9
        L8b:
            r2 = 1
            goto L79
        L8d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L89
            if (r2 == 0) goto L97
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            r6.interrupt()
        L97:
            java.lang.RuntimeException r6 = r0.A
            if (r6 != 0) goto La8
            java.lang.Error r6 = r0.f13674z
            if (r6 != 0) goto La7
            w2.m r6 = r0.B
            r6.getClass()
            r5.f13667v1 = r6
            goto Lab
        La7:
            throw r6
        La8:
            throw r6
        La9:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L89
            throw r6
        Lab:
            w2.m r6 = r5.f13667v1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.k.D0(j2.q):android.view.Surface");
    }

    @Override // j2.t
    public final j2.p E(IllegalStateException illegalStateException, j2.q qVar) {
        Surface surface = this.f13666u1;
        j2.p pVar = new j2.p(illegalStateException, qVar);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return pVar;
    }

    public final boolean E0(j2.q qVar) {
        if (this.f13662q1 == null) {
            Surface surface = this.f13666u1;
            if (surface == null || !surface.isValid()) {
                if ((Build.VERSION.SDK_INT < 35 || !qVar.f7098h) && !L0(qVar)) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final boolean F0(y1.h hVar) {
        if (k() || hVar.isLastSample()) {
            return true;
        }
        long j = this.R1;
        if (j == -9223372036854775807L || j - (hVar.B - this.W0.f7108c) <= 100000) {
            return true;
        }
        return false;
    }

    public final void G0() {
        if (this.B1 > 0) {
            this.D.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = elapsedRealtime - this.A1;
            int i6 = this.B1;
            s8.l lVar = this.f13652g1;
            Handler handler = (Handler) lVar.f12251y;
            if (handler != null) {
                handler.post(new c0(lVar, i6, j));
            }
            this.B1 = 0;
            this.A1 = elapsedRealtime;
        }
    }

    public final void H0() {
        int i6;
        j2.n nVar;
        if (this.M1 && (i6 = Build.VERSION.SDK_INT) >= 23 && (nVar = this.f7121i0) != null) {
            this.O1 = new j(this, nVar);
            if (i6 >= 33) {
                Bundle bundle = new Bundle();
                bundle.putInt("tunnel-peek", 1);
                nVar.b(bundle);
            }
        }
    }

    public final void I0(j2.n nVar, int i6, long j) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        nVar.k(i6, j);
        Trace.endSection();
        this.V0.f254e++;
        boolean z10 = false;
        this.C1 = 0;
        if (this.f13662q1 == null) {
            p1 p1Var = this.J1;
            boolean equals = p1Var.equals(p1.f11626d);
            s8.l lVar = this.f13652g1;
            if (!equals && !p1Var.equals(this.K1)) {
                this.K1 = p1Var;
                lVar.A(p1Var);
            }
            w wVar = this.f13655j1;
            if (wVar.f13709e != 3) {
                z10 = true;
            }
            wVar.f13709e = 3;
            wVar.f13715l.getClass();
            wVar.f13711g = u1.a0.Q(SystemClock.elapsedRealtime());
            if (z10 && (surface = this.f13666u1) != null) {
                lVar.w(surface);
                this.f13669x1 = true;
            }
        }
    }

    public final void J0(Object obj) {
        Surface surface;
        if (obj instanceof Surface) {
            surface = (Surface) obj;
        } else {
            surface = null;
        }
        Surface surface2 = this.f13666u1;
        s8.l lVar = this.f13652g1;
        if (surface2 != surface) {
            this.f13666u1 = surface;
            h0 h0Var = this.f13662q1;
            w wVar = this.f13655j1;
            if (h0Var == null) {
                wVar.h(surface);
            }
            this.f13669x1 = false;
            int i6 = this.E;
            j2.n nVar = this.f7121i0;
            if (nVar != null && this.f13662q1 == null) {
                j2.q qVar = this.f7127p0;
                qVar.getClass();
                boolean E0 = E0(qVar);
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 23 && E0 && !this.f13660o1) {
                    Surface D0 = D0(qVar);
                    if (i10 >= 23 && D0 != null) {
                        nVar.y(D0);
                    } else if (i10 >= 35) {
                        nVar.j();
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    j0();
                    U();
                }
            }
            if (surface != null) {
                p1 p1Var = this.K1;
                if (p1Var != null) {
                    lVar.A(p1Var);
                }
            } else {
                this.K1 = null;
                h0 h0Var2 = this.f13662q1;
                if (h0Var2 != null) {
                    h0Var2.m();
                }
            }
            if (i6 == 2) {
                h0 h0Var3 = this.f13662q1;
                if (h0Var3 != null) {
                    h0Var3.r(true);
                } else {
                    wVar.c(true);
                }
            }
            H0();
            return;
        }
        if (surface != null) {
            p1 p1Var2 = this.K1;
            if (p1Var2 != null) {
                lVar.A(p1Var2);
            }
            Surface surface3 = this.f13666u1;
            if (surface3 != null && this.f13669x1) {
                lVar.w(surface3);
            }
        }
    }

    public final boolean K0(long j, long j10, boolean z10, boolean z11) {
        if (this.f13662q1 != null && this.f13651f1) {
            j10 -= -this.Q1;
        }
        if (j < -500000 && !z10) {
            z0 z0Var = this.F;
            z0Var.getClass();
            int j11 = z0Var.j(j10 - this.H);
            if (j11 != 0) {
                PriorityQueue priorityQueue = this.f13658m1;
                if (z11) {
                    a2.h hVar = this.V0;
                    int i6 = hVar.f253d + j11;
                    hVar.f253d = i6;
                    hVar.f255f += this.D1;
                    hVar.f253d = priorityQueue.size() + i6;
                } else {
                    this.V0.j++;
                    N0(priorityQueue.size() + j11, this.D1);
                }
                if (J()) {
                    U();
                }
                h0 h0Var = this.f13662q1;
                if (h0Var != null) {
                    h0Var.o(false);
                }
                return true;
            }
        }
        return false;
    }

    @Override // j2.t
    public final int L(y1.h hVar) {
        if (Build.VERSION.SDK_INT >= 34) {
            if ((this.E1 != null || this.M1) && hVar.B < this.I && !F0(hVar)) {
                return 32;
            }
            return 0;
        }
        return 0;
    }

    public final boolean L0(j2.q qVar) {
        if (Build.VERSION.SDK_INT >= 23 && !this.M1 && !z0(qVar.f7091a)) {
            if (!qVar.f7096f || m.b(this.f13650e1)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // j2.t
    public final boolean M() {
        if (this.M1 && Build.VERSION.SDK_INT < 23) {
            return true;
        }
        return false;
    }

    public final void M0(j2.n nVar, int i6) {
        Trace.beginSection("skipVideoBuffer");
        nVar.f(i6);
        Trace.endSection();
        this.V0.f255f++;
    }

    @Override // j2.t
    public final float N(float f3, r1.q qVar, r1.q[] qVarArr) {
        float f10;
        j2.q qVar2;
        float f11 = -1.0f;
        for (r1.q qVar3 : qVarArr) {
            float f12 = qVar3.f11680y;
            if (f12 != -1.0f) {
                f11 = Math.max(f11, f12);
            }
        }
        if (f11 == -1.0f) {
            f10 = -1.0f;
        } else {
            f10 = f11 * f3;
        }
        if (this.E1 != null && (qVar2 = this.f7127p0) != null) {
            int i6 = qVar.f11676u;
            int i10 = qVar.f11677v;
            float f13 = -3.4028235E38f;
            if (qVar2.f7099i) {
                float f14 = qVar2.f7101l;
                if (f14 != -3.4028235E38f && qVar2.j == i6 && qVar2.f7100k == i10) {
                    f13 = f14;
                } else {
                    float f15 = 1024.0f;
                    if (qVar2.g(i6, i10, 1024.0f)) {
                        f13 = 1024.0f;
                    } else {
                        f13 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        while (true) {
                            float f16 = f15 - f13;
                            if (Math.abs(f16) <= 5.0f) {
                                break;
                            }
                            float f17 = (f16 / 2.0f) + f13;
                            if (qVar2.g(i6, i10, f17)) {
                                f13 = f17;
                            } else {
                                f15 = f17;
                            }
                        }
                    }
                    qVar2.f7101l = f13;
                    qVar2.j = i6;
                    qVar2.f7100k = i10;
                }
            }
            if (f10 != -1.0f) {
                return Math.max(f10, f13);
            }
            return f13;
        }
        return f10;
    }

    public final void N0(int i6, int i10) {
        a2.h hVar = this.V0;
        hVar.f257h += i6;
        int i11 = i6 + i10;
        hVar.f256g += i11;
        this.B1 += i11;
        int i12 = this.C1 + i11;
        this.C1 = i12;
        hVar.f258i = Math.max(i12, hVar.f258i);
        int i13 = this.f13653h1;
        if (i13 > 0 && this.B1 >= i13) {
            G0();
        }
    }

    @Override // j2.t
    public final ArrayList O(j2.l lVar, r1.q qVar, boolean z10) {
        List B0 = B0(this.f13650e1, lVar, qVar, z10, this.M1);
        HashMap hashMap = j2.a0.f7050a;
        ArrayList arrayList = new ArrayList(B0);
        Collections.sort(arrayList, new aa.e(new j2.u(qVar, 0), 1));
        return arrayList;
    }

    public final void O0(long j) {
        a2.h hVar = this.V0;
        hVar.f259k += j;
        hVar.f260l++;
        this.G1 += j;
        this.H1++;
    }

    @Override // j2.t
    public final androidx.lifecycle.d Q(j2.q qVar, r1.q qVar2, MediaCrypto mediaCrypto, float f3) {
        r1.h hVar;
        int i6;
        a3.c cVar;
        boolean z10;
        int i10;
        int i11;
        Point point;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int i12;
        int i13;
        boolean z11;
        int i14;
        boolean z12;
        int A0;
        String str = qVar.f7093c;
        r1.q[] qVarArr = this.G;
        qVarArr.getClass();
        int i15 = qVar2.f11676u;
        float f10 = qVar2.f11680y;
        r1.h hVar2 = qVar2.D;
        int i16 = qVar2.f11677v;
        int C0 = C0(qVar, qVar2);
        if (qVarArr.length == 1) {
            if (C0 != -1 && (A0 = A0(qVar, qVar2)) != -1) {
                C0 = Math.min((int) (C0 * 1.5f), A0);
            }
            cVar = new a3.c(i15, i16, C0);
            hVar = hVar2;
            i6 = i16;
        } else {
            int length = qVarArr.length;
            int i17 = i15;
            int i18 = i16;
            int i19 = 0;
            boolean z13 = false;
            while (i19 < length) {
                r1.q qVar3 = qVarArr[i19];
                r1.q[] qVarArr2 = qVarArr;
                if (hVar2 != null && qVar3.D == null) {
                    r1.p a10 = qVar3.a();
                    a10.C = hVar2;
                    qVar3 = new r1.q(a10);
                }
                a2.i b10 = qVar.b(qVar2, qVar3);
                int i20 = length;
                int i21 = qVar3.f11677v;
                if (b10.f268d != 0) {
                    int i22 = qVar3.f11676u;
                    i13 = i19;
                    if (i22 != -1 && i21 != -1) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    z13 |= z11;
                    i17 = Math.max(i17, i22);
                    i18 = Math.max(i18, i21);
                    C0 = Math.max(C0, C0(qVar, qVar3));
                } else {
                    i13 = i19;
                }
                i19 = i13 + 1;
                qVarArr = qVarArr2;
                length = i20;
            }
            if (z13) {
                u1.a.p("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i17 + "x" + i18);
                if (i16 > i15) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    i10 = i16;
                } else {
                    i10 = i15;
                }
                boolean z14 = z10;
                if (z10) {
                    i11 = i15;
                } else {
                    i11 = i16;
                }
                float f11 = i11 / i10;
                int i23 = 0;
                while (true) {
                    hVar = hVar2;
                    if (i23 >= 9) {
                        break;
                    }
                    int i24 = U1[i23];
                    int i25 = i23;
                    int i26 = (int) (i24 * f11);
                    if (i24 <= i10 || i26 <= i11) {
                        break;
                    }
                    if (!z14) {
                        i26 = i24;
                    }
                    if (!z14) {
                        i24 = i26;
                    }
                    int i27 = i11;
                    MediaCodecInfo.CodecCapabilities codecCapabilities = qVar.f7094d;
                    if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                        i12 = i10;
                        point = null;
                    } else {
                        int widthAlignment = videoCapabilities.getWidthAlignment();
                        i12 = i10;
                        int heightAlignment = videoCapabilities.getHeightAlignment();
                        point = new Point(u1.a0.f(i26, widthAlignment) * widthAlignment, u1.a0.f(i24, heightAlignment) * heightAlignment);
                    }
                    if (point != null) {
                        i6 = i16;
                        if (qVar.g(point.x, point.y, f10)) {
                            break;
                        }
                    } else {
                        i6 = i16;
                    }
                    i23 = i25 + 1;
                    i16 = i6;
                    hVar2 = hVar;
                    i11 = i27;
                    i10 = i12;
                }
                i6 = i16;
                point = null;
                if (point != null) {
                    i17 = Math.max(i17, point.x);
                    i18 = Math.max(i18, point.y);
                    r1.p a11 = qVar2.a();
                    a11.f11617t = i17;
                    a11.f11618u = i18;
                    C0 = Math.max(C0, A0(qVar, new r1.q(a11)));
                    u1.a.p("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i17 + "x" + i18);
                }
            } else {
                hVar = hVar2;
                i6 = i16;
            }
            cVar = new a3.c(i17, i18, C0);
        }
        this.f13659n1 = cVar;
        if (this.M1) {
            i14 = this.N1;
        } else {
            i14 = 0;
        }
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i15);
        mediaFormat.setInteger("height", i6);
        u1.c.o(mediaFormat, qVar2.f11673q);
        if (f10 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f10);
        }
        u1.c.n(mediaFormat, "rotation-degrees", qVar2.f11681z);
        if (hVar != null) {
            r1.h hVar3 = hVar;
            u1.c.n(mediaFormat, "color-transfer", hVar3.f11439c);
            u1.c.n(mediaFormat, "color-standard", hVar3.f11437a);
            u1.c.n(mediaFormat, "color-range", hVar3.f11438b);
            byte[] bArr = hVar3.f11440d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(qVar2.f11670n)) {
            HashMap hashMap = j2.a0.f7050a;
            Pair c10 = u1.d.c(qVar2);
            if (c10 != null) {
                u1.c.n(mediaFormat, "profile", ((Integer) c10.first).intValue());
            }
        }
        mediaFormat.setInteger("max-width", cVar.f521a);
        mediaFormat.setInteger("max-height", cVar.f522b);
        u1.c.n(mediaFormat, "max-input-size", cVar.f523c);
        int i28 = Build.VERSION.SDK_INT;
        if (i28 >= 23) {
            mediaFormat.setInteger(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 0);
            if (f3 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f3);
            }
        }
        if (this.f13654i1) {
            z12 = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z12 = true;
        }
        if (i14 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z12);
            mediaFormat.setInteger("audio-session-id", i14);
        }
        if (i28 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.L1));
        }
        Surface D0 = D0(qVar);
        if (this.f13662q1 != null && !u1.a0.M(this.f13650e1)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return new androidx.lifecycle.d(qVar, mediaFormat, qVar2, D0, mediaCrypto, null);
    }

    @Override // j2.t
    public final void R(y1.h hVar) {
        if (this.f13661p1) {
            ByteBuffer byteBuffer = hVar.C;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b10 = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s7 = byteBuffer.getShort();
                byte b11 = byteBuffer.get();
                byte b12 = byteBuffer.get();
                byteBuffer.position(0);
                if (b10 == -75 && s == 60 && s7 == 1 && b11 == 4) {
                    if (b12 == 0 || b12 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        j2.n nVar = this.f7121i0;
                        nVar.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        nVar.b(bundle);
                    }
                }
            }
        }
    }

    @Override // j2.t
    public final boolean W(r1.q qVar) {
        h0 h0Var = this.f13662q1;
        if (h0Var != null && !h0Var.isInitialized()) {
            try {
                return this.f13662q1.l(qVar);
            } catch (g0 e10) {
                throw a(e10, qVar, false, 7000);
            }
        }
        return true;
    }

    @Override // j2.t
    public final void X(Exception exc) {
        u1.a.h("MediaCodecVideoRenderer", "Video codec error", exc);
        s8.l lVar = this.f13652g1;
        Handler handler = (Handler) lVar.f12251y;
        if (handler != null) {
            handler.post(new c0(lVar, exc, 1));
        }
    }

    @Override // j2.t
    public final void Y(String str, long j, long j10) {
        String str2;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        s8.l lVar = this.f13652g1;
        Handler handler = (Handler) lVar.f12251y;
        if (handler != null) {
            str2 = str;
            handler.post(new c0(lVar, str2, j, j10));
        } else {
            str2 = str;
        }
        this.f13660o1 = z0(str2);
        j2.q qVar = this.f7127p0;
        qVar.getClass();
        boolean z10 = false;
        if (Build.VERSION.SDK_INT >= 29 && "video/x-vnd.on2.vp9".equals(qVar.f7092b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = qVar.f7094d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            int length = codecProfileLevelArr.length;
            int i6 = 0;
            while (true) {
                if (i6 >= length) {
                    break;
                }
                if (codecProfileLevelArr[i6].profile == 16384) {
                    z10 = true;
                    break;
                }
                i6++;
            }
        }
        this.f13661p1 = z10;
        H0();
    }

    @Override // j2.t
    public final void Z(String str) {
        s8.l lVar = this.f13652g1;
        Handler handler = (Handler) lVar.f12251y;
        if (handler != null) {
            handler.post(new c0(lVar, str, 2));
        }
    }

    @Override // j2.t
    public final a2.i a0(j4.b0 b0Var) {
        a2.i a02 = super.a0(b0Var);
        r1.q qVar = (r1.q) b0Var.f7159y;
        qVar.getClass();
        s8.l lVar = this.f13652g1;
        Handler handler = (Handler) lVar.f12251y;
        if (handler != null) {
            handler.post(new c0(lVar, qVar, a02));
        }
        return a02;
    }

    @Override // a2.g
    public final void b() {
        h0 h0Var = this.f13662q1;
        if (h0Var != null) {
            int i6 = this.f13664s1;
            if (i6 != 0 && i6 != 1) {
                h0Var.w();
                return;
            } else {
                this.f13664s1 = 0;
                return;
            }
        }
        w wVar = this.f13655j1;
        if (wVar.f13709e == 0) {
            wVar.f13709e = 1;
        }
    }

    @Override // j2.t
    public final void b0(r1.q qVar, MediaFormat mediaFormat) {
        boolean z10;
        int integer;
        int integer2;
        int i6;
        int i10;
        j2.n nVar = this.f7121i0;
        if (nVar != null) {
            nVar.u(this.f13670y1);
        }
        if (this.M1) {
            i10 = qVar.f11676u;
            i6 = qVar.f11677v;
        } else {
            mediaFormat.getClass();
            if (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
            } else {
                integer = mediaFormat.getInteger("width");
            }
            if (z10) {
                integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
            } else {
                integer2 = mediaFormat.getInteger("height");
            }
            int i11 = integer;
            i6 = integer2;
            i10 = i11;
        }
        float f3 = qVar.A;
        int i12 = qVar.f11681z;
        if (i12 == 90 || i12 == 270) {
            f3 = 1.0f / f3;
            int i13 = i6;
            i6 = i10;
            i10 = i13;
        }
        this.J1 = new p1(f3, i10, i6);
        h0 h0Var = this.f13662q1;
        if (h0Var != null && this.S1) {
            r1.p a10 = qVar.a();
            a10.f11617t = i10;
            a10.f11618u = i6;
            a10.f11623z = f3;
            r1.q qVar2 = new r1.q(a10);
            int i14 = this.f13664s1;
            List list = this.f13665t1;
            if (list == null) {
                i0 i0Var = k0.f4008y;
                list = c1.B;
            }
            h0Var.n(qVar2, this.W0.f7107b, i14, list);
            this.f13664s1 = 2;
        } else {
            this.f13655j1.g(qVar.f11680y);
        }
        this.S1 = false;
    }

    @Override // j2.t
    public final void d0(long j) {
        super.d0(j);
        if (!this.M1) {
            this.D1--;
        }
    }

    @Override // j2.t
    public final void e0() {
        h0 h0Var = this.f13662q1;
        if (h0Var != null) {
            h0Var.j();
            if (this.Q1 == -9223372036854775807L) {
                this.Q1 = this.W0.f7107b;
            }
            this.f13662q1.i(-this.Q1);
        } else {
            this.f13655j1.f(2);
        }
        this.S1 = true;
        H0();
    }

    @Override // j2.t
    public final void f0(y1.h hVar) {
        Surface surface;
        boolean z10 = false;
        this.T1 = 0;
        int L = L(hVar);
        int i6 = Build.VERSION.SDK_INT;
        if ((i6 < 34 || (L & 32) == 0) && !this.M1) {
            this.D1++;
        }
        if (i6 < 23 && this.M1) {
            long j = hVar.B;
            y0(j);
            p1 p1Var = this.J1;
            boolean equals = p1Var.equals(p1.f11626d);
            s8.l lVar = this.f13652g1;
            if (!equals && !p1Var.equals(this.K1)) {
                this.K1 = p1Var;
                lVar.A(p1Var);
            }
            this.V0.f254e++;
            w wVar = this.f13655j1;
            if (wVar.f13709e != 3) {
                z10 = true;
            }
            wVar.f13709e = 3;
            wVar.f13715l.getClass();
            wVar.f13711g = u1.a0.Q(SystemClock.elapsedRealtime());
            if (z10 && (surface = this.f13666u1) != null) {
                lVar.w(surface);
                this.f13669x1 = true;
            }
            d0(j);
        }
    }

    @Override // a2.g, a2.u1
    public final void h(int i6, Object obj) {
        boolean z10;
        boolean z11 = true;
        if (i6 != 1) {
            if (i6 != 7) {
                if (i6 != 10) {
                    if (i6 != 4) {
                        if (i6 != 5) {
                            if (i6 != 13) {
                                if (i6 != 14) {
                                    switch (i6) {
                                        case 16:
                                            obj.getClass();
                                            this.L1 = ((Integer) obj).intValue();
                                            j2.n nVar = this.f7121i0;
                                            if (nVar != null && Build.VERSION.SDK_INT >= 35) {
                                                Bundle bundle = new Bundle();
                                                bundle.putInt("importance", Math.max(0, -this.L1));
                                                nVar.b(bundle);
                                                return;
                                            }
                                            return;
                                        case 17:
                                            Surface surface = this.f13666u1;
                                            J0(null);
                                            obj.getClass();
                                            ((k) obj).h(1, surface);
                                            return;
                                        case 18:
                                            if (this.E1 != null) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            b2 b2Var = (b2) obj;
                                            this.E1 = b2Var;
                                            if (b2Var == null) {
                                                z11 = false;
                                            }
                                            if (z10 != z11) {
                                                w0(this.f7122j0);
                                                return;
                                            }
                                            return;
                                        default:
                                            if (i6 == 11) {
                                                q0 q0Var = (q0) obj;
                                                q0Var.getClass();
                                                this.f7116d0 = q0Var;
                                                return;
                                            }
                                            return;
                                    }
                                }
                                obj.getClass();
                                u1.u uVar = (u1.u) obj;
                                if (uVar.f12815a != 0 && uVar.f12816b != 0) {
                                    this.f13668w1 = uVar;
                                    h0 h0Var = this.f13662q1;
                                    if (h0Var != null) {
                                        Surface surface2 = this.f13666u1;
                                        u1.c.h(surface2);
                                        h0Var.v(surface2, uVar);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            obj.getClass();
                            List list = (List) obj;
                            if (list.equals(o1.f11599a)) {
                                h0 h0Var2 = this.f13662q1;
                                if (h0Var2 != null && h0Var2.isInitialized()) {
                                    this.f13662q1.t();
                                    return;
                                }
                                return;
                            }
                            this.f13665t1 = list;
                            h0 h0Var3 = this.f13662q1;
                            if (h0Var3 != null) {
                                h0Var3.p(list);
                                return;
                            }
                            return;
                        }
                        obj.getClass();
                        int intValue = ((Integer) obj).intValue();
                        this.f13671z1 = intValue;
                        h0 h0Var4 = this.f13662q1;
                        if (h0Var4 != null) {
                            h0Var4.k(intValue);
                            return;
                        }
                        a0 a0Var = this.f13655j1.f13706b;
                        if (a0Var.j != intValue) {
                            a0Var.j = intValue;
                            a0Var.d(true);
                            return;
                        }
                        return;
                    }
                    obj.getClass();
                    int intValue2 = ((Integer) obj).intValue();
                    this.f13670y1 = intValue2;
                    j2.n nVar2 = this.f7121i0;
                    if (nVar2 != null) {
                        nVar2.u(intValue2);
                        return;
                    }
                    return;
                }
                obj.getClass();
                int intValue3 = ((Integer) obj).intValue();
                if (this.N1 != intValue3) {
                    this.N1 = intValue3;
                    if (this.M1) {
                        j0();
                        return;
                    }
                    return;
                }
                return;
            }
            obj.getClass();
            v vVar = (v) obj;
            this.P1 = vVar;
            h0 h0Var5 = this.f13662q1;
            if (h0Var5 != null) {
                h0Var5.e(vVar);
                return;
            }
            return;
        }
        J0(obj);
    }

    @Override // j2.t
    public final boolean h0(long j, long j10, j2.n nVar, ByteBuffer byteBuffer, int i6, int i10, int i11, long j11, boolean z10, boolean z11, r1.q qVar) {
        int i12;
        nVar.getClass();
        long j12 = j11 - this.W0.f7108c;
        int i13 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.f13658m1;
            Long l10 = (Long) priorityQueue.peek();
            if (l10 == null || l10.longValue() >= j11) {
                break;
            }
            i13++;
            priorityQueue.poll();
        }
        N0(i13, 0);
        h0 h0Var = this.f13662q1;
        if (h0Var != null) {
            if (z10 && !z11) {
                M0(nVar, i6);
                return true;
            }
            return h0Var.u(j11, new h(this, nVar, i6, j12));
        }
        int a10 = this.f13655j1.a(j11, j, j10, this.W0.f7107b, z10, z11, this.f13656k1);
        cg.d dVar = this.f13656k1;
        if (a10 != 0) {
            if (a10 != 1) {
                if (a10 != 2) {
                    if (a10 != 3) {
                        if (a10 == 4 || a10 == 5) {
                            return false;
                        }
                        throw new IllegalStateException(String.valueOf(a10));
                    }
                    M0(nVar, i6);
                    O0(dVar.f2095a);
                    return true;
                }
                Trace.beginSection("dropVideoBuffer");
                nVar.f(i6);
                Trace.endSection();
                N0(0, 1);
                O0(dVar.f2095a);
                return true;
            }
            long j13 = dVar.f2096b;
            long j14 = dVar.f2095a;
            if (j13 == this.I1) {
                M0(nVar, i6);
            } else {
                v vVar = this.P1;
                if (vVar != null) {
                    i12 = i6;
                    vVar.c(j12, j13, qVar, this.f7123k0);
                } else {
                    i12 = i6;
                }
                I0(nVar, i12, j13);
            }
            O0(j14);
            this.I1 = j13;
            return true;
        }
        this.D.getClass();
        long nanoTime = System.nanoTime();
        v vVar2 = this.P1;
        if (vVar2 != null) {
            vVar2.c(j12, nanoTime, qVar, this.f7123k0);
        }
        I0(nVar, i6, nanoTime);
        O0(dVar.f2095a);
        return true;
    }

    @Override // a2.g
    public final String j() {
        return "MediaCodecVideoRenderer";
    }

    @Override // j2.t
    public final void k0() {
        h0 h0Var = this.f13662q1;
        if (h0Var != null) {
            h0Var.j();
        }
    }

    @Override // a2.g
    public final boolean l() {
        if (this.R0) {
            h0 h0Var = this.f13662q1;
            if (h0Var == null || h0Var.c()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // j2.t, a2.g
    public final boolean m() {
        boolean m9 = super.m();
        h0 h0Var = this.f13662q1;
        if (h0Var != null) {
            return h0Var.s(m9);
        }
        if (m9 && (this.f7121i0 == null || this.M1)) {
            return true;
        }
        return this.f13655j1.b(m9);
    }

    @Override // j2.t
    public final void m0() {
        super.m0();
        this.f13658m1.clear();
        this.D1 = 0;
        this.T1 = 0;
        this.F1 = false;
    }

    @Override // j2.t, a2.g
    public final void o() {
        s8.l lVar = this.f13652g1;
        this.K1 = null;
        this.R1 = -9223372036854775807L;
        H0();
        this.f13669x1 = false;
        this.O1 = null;
        this.F1 = true;
        try {
            super.o();
        } finally {
            lVar.g(this.V0);
            lVar.A(p1.f11626d);
        }
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [a2.h, java.lang.Object] */
    @Override // a2.g
    public final void p(boolean z10, boolean z11) {
        boolean z12;
        h0 h0Var;
        this.V0 = new Object();
        y1 y1Var = this.A;
        y1Var.getClass();
        boolean z13 = y1Var.f505b;
        if (z13 && this.N1 == 0) {
            z12 = false;
        } else {
            z12 = true;
        }
        u1.c.g(z12);
        if (this.M1 != z13) {
            this.M1 = z13;
            j0();
        }
        a2.h hVar = this.V0;
        s8.l lVar = this.f13652g1;
        Handler handler = (Handler) lVar.f12251y;
        if (handler != null) {
            handler.post(new c0(lVar, hVar, 5));
        }
        boolean z14 = this.f13663r1;
        w wVar = this.f13655j1;
        if (!z14) {
            if (this.f13665t1 != null && this.f13662q1 == null) {
                a2.m mVar = new a2.m(this.f13650e1, wVar);
                mVar.f314x = true;
                u1.v vVar = this.D;
                vVar.getClass();
                mVar.C = vVar;
                u1.c.g(!mVar.f315y);
                if (((p) mVar.B) == null) {
                    mVar.B = new p();
                }
                r rVar = new r(mVar);
                mVar.f315y = true;
                rVar.f13699o = 1;
                SparseArray sparseArray = rVar.f13688c;
                if (u1.a0.k(sparseArray, 0)) {
                    h0Var = (h0) sparseArray.get(0);
                } else {
                    n nVar = new n(rVar, rVar.f13686a);
                    rVar.f13692g.add(nVar);
                    sparseArray.put(0, nVar);
                    h0Var = nVar;
                }
                this.f13662q1 = h0Var;
            }
            this.f13663r1 = true;
        }
        h0 h0Var2 = this.f13662q1;
        if (h0Var2 != null) {
            h0Var2.f(new u5.r(this, 28));
            v vVar2 = this.P1;
            if (vVar2 != null) {
                this.f13662q1.e(vVar2);
            }
            if (this.f13666u1 != null && !this.f13668w1.equals(u1.u.f12814c)) {
                this.f13662q1.v(this.f13666u1, this.f13668w1);
            }
            this.f13662q1.k(this.f13671z1);
            this.f13662q1.b(this.f7119g0);
            List list = this.f13665t1;
            if (list != null) {
                this.f13662q1.p(list);
            }
            this.f13664s1 = !z11 ? 1 : 0;
            this.Z0 = true;
            return;
        }
        u1.v vVar3 = this.D;
        vVar3.getClass();
        wVar.f13715l = vVar3;
        wVar.f(!z11 ? 1 : 0);
    }

    @Override // j2.t, a2.g
    public final void q(boolean z10, long j) {
        h0 h0Var = this.f13662q1;
        if (h0Var != null && !z10) {
            h0Var.o(true);
        }
        super.q(z10, j);
        h0 h0Var2 = this.f13662q1;
        w wVar = this.f13655j1;
        if (h0Var2 == null) {
            a0 a0Var = wVar.f13706b;
            a0Var.f13592m = 0L;
            a0Var.f13595p = -1L;
            a0Var.f13593n = -1L;
            wVar.f13712h = -9223372036854775807L;
            wVar.f13710f = -9223372036854775807L;
            wVar.f13709e = Math.min(wVar.f13709e, 1);
            wVar.f13713i = -9223372036854775807L;
        }
        if (z10) {
            h0 h0Var3 = this.f13662q1;
            if (h0Var3 != null) {
                h0Var3.r(false);
            } else {
                wVar.c(false);
            }
        }
        H0();
        this.C1 = 0;
    }

    @Override // j2.t
    public final boolean q0(y1.h hVar) {
        boolean z10;
        boolean z11 = false;
        if (!F0(hVar)) {
            if (hVar.B < this.I) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && !hVar.hasSupplementalData()) {
                if (hVar.notDependedOn()) {
                    hVar.clear();
                    z11 = true;
                }
                if (z11) {
                    if (z10) {
                        this.V0.f253d++;
                    } else {
                        this.f13658m1.add(Long.valueOf(hVar.B));
                        this.T1++;
                    }
                }
                return z11;
            }
        }
        return false;
    }

    @Override // a2.g
    public final void r() {
        h0 h0Var = this.f13662q1;
        if (h0Var != null && this.f13651f1) {
            h0Var.a();
        }
    }

    @Override // j2.t
    public final boolean r0() {
        r1.q qVar = this.f7122j0;
        if (this.E1 != null && !this.F1 && !this.M1) {
            if ((qVar == null || qVar.f11672p <= 0) && !this.f7112a1 && this.P0 == -9223372036854775807L) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // a2.g
    public final void s() {
        try {
            try {
                this.E0 = false;
                l0();
                j0();
            } finally {
                r4.a.z(this.f7115c0, null);
                this.f7115c0 = null;
            }
        } finally {
            this.f13663r1 = false;
            this.Q1 = -9223372036854775807L;
            m mVar = this.f13667v1;
            if (mVar != null) {
                mVar.release();
                this.f13667v1 = null;
            }
        }
    }

    @Override // j2.t
    public final boolean s0(j2.q qVar) {
        return E0(qVar);
    }

    @Override // a2.g
    public final void t() {
        this.B1 = 0;
        this.D.getClass();
        this.A1 = SystemClock.elapsedRealtime();
        this.G1 = 0L;
        this.H1 = 0;
        h0 h0Var = this.f13662q1;
        if (h0Var != null) {
            h0Var.h();
        } else {
            this.f13655j1.d();
        }
    }

    @Override // j2.t
    public final boolean t0() {
        j2.q qVar = this.f7127p0;
        if (this.f13662q1 != null && qVar != null) {
            String str = qVar.f7091a;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder")) {
                return true;
            }
        }
        return super.t0();
    }

    @Override // a2.g
    public final void u() {
        G0();
        int i6 = this.H1;
        if (i6 != 0) {
            long j = this.G1;
            s8.l lVar = this.f13652g1;
            Handler handler = (Handler) lVar.f12251y;
            if (handler != null) {
                handler.post(new c0(lVar, j, i6));
            }
            this.G1 = 0L;
            this.H1 = 0;
        }
        h0 h0Var = this.f13662q1;
        if (h0Var != null) {
            h0Var.g();
        } else {
            this.f13655j1.e();
        }
    }

    @Override // j2.t, a2.g
    public final void v(r1.q[] qVarArr, long j, long j10, q2.c0 c0Var) {
        super.v(qVarArr, j, j10, c0Var);
        d1 d1Var = this.M;
        if (d1Var.p()) {
            this.R1 = -9223372036854775807L;
        } else {
            c0Var.getClass();
            this.R1 = d1Var.g(c0Var.f10834a, new a1()).f11298d;
        }
    }

    @Override // j2.t
    public final int v0(j2.l lVar, r1.q qVar) {
        boolean z10;
        boolean z11;
        int i6;
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        if (!r1.k0.o(qVar.f11670n)) {
            return r4.a.d(0, 0, 0, 0);
        }
        int i14 = 1;
        if (qVar.f11674r != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        Context context = this.f13650e1;
        List B0 = B0(context, lVar, qVar, z10, false);
        if (z10 && B0.isEmpty()) {
            B0 = B0(context, lVar, qVar, false, false);
        }
        if (B0.isEmpty()) {
            return r4.a.d(1, 0, 0, 0);
        }
        int i15 = qVar.O;
        if (i15 != 0 && i15 != 2) {
            return r4.a.d(2, 0, 0, 0);
        }
        j2.q qVar2 = (j2.q) B0.get(0);
        boolean e10 = qVar2.e(qVar);
        if (!e10) {
            for (int i16 = 1; i16 < B0.size(); i16++) {
                j2.q qVar3 = (j2.q) B0.get(i16);
                if (qVar3.e(qVar)) {
                    qVar2 = qVar3;
                    z11 = false;
                    e10 = true;
                    break;
                }
            }
        }
        z11 = true;
        if (e10) {
            i6 = 4;
        } else {
            i6 = 3;
        }
        if (qVar2.f(qVar)) {
            i10 = 16;
        } else {
            i10 = 8;
        }
        if (qVar2.f7097g) {
            i11 = 64;
        } else {
            i11 = 0;
        }
        if (z11) {
            i12 = 128;
        } else {
            i12 = 0;
        }
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(qVar.f11670n) && !dg.b.e(context)) {
            i12 = 256;
        }
        if (e10) {
            List B02 = B0(context, lVar, qVar, z10, true);
            if (!B02.isEmpty()) {
                HashMap hashMap = j2.a0.f7050a;
                ArrayList arrayList = new ArrayList(B02);
                Collections.sort(arrayList, new aa.e(new j2.u(qVar, i13), i14));
                j2.q qVar4 = (j2.q) arrayList.get(0);
                if (qVar4.e(qVar) && qVar4.f(qVar)) {
                    i13 = 32;
                }
            }
        }
        return i6 | i10 | i13 | i11 | i12;
    }

    @Override // j2.t, a2.g
    public final void x(long j, long j10) {
        h0 h0Var = this.f13662q1;
        if (h0Var != null) {
            try {
                h0Var.q(j, j10);
            } catch (g0 e10) {
                throw a(e10, e10.f13637x, false, 7001);
            }
        }
        super.x(j, j10);
    }

    @Override // j2.t, a2.g
    public final void z(float f3, float f10) {
        super.z(f3, f10);
        h0 h0Var = this.f13662q1;
        if (h0Var != null) {
            h0Var.b(f3);
        } else {
            this.f13655j1.i(f3);
        }
    }
}
