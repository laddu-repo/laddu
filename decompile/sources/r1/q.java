package r1;

import android.text.TextUtils;
import com.google.protobuf.CodedOutputStream;
import com.unity3d.ads.BuildConfig;
import com.unity3d.ads.core.data.model.exception.GatewayException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import okhttp3.internal.http2.Http2;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class q {
    public static final String A0;
    public static final q Q = new q(new p());
    public static final String R = Integer.toString(0, 36);
    public static final String S = Integer.toString(1, 36);
    public static final String T = Integer.toString(2, 36);
    public static final String U = Integer.toString(3, 36);
    public static final String V = Integer.toString(4, 36);
    public static final String W = Integer.toString(5, 36);
    public static final String X = Integer.toString(6, 36);
    public static final String Y = Integer.toString(7, 36);
    public static final String Z;

    /* renamed from: a0, reason: collision with root package name */
    public static final String f11633a0;

    /* renamed from: b0, reason: collision with root package name */
    public static final String f11634b0;

    /* renamed from: c0, reason: collision with root package name */
    public static final String f11635c0;

    /* renamed from: d0, reason: collision with root package name */
    public static final String f11636d0;

    /* renamed from: e0, reason: collision with root package name */
    public static final String f11637e0;

    /* renamed from: f0, reason: collision with root package name */
    public static final String f11638f0;

    /* renamed from: g0, reason: collision with root package name */
    public static final String f11639g0;

    /* renamed from: h0, reason: collision with root package name */
    public static final String f11640h0;

    /* renamed from: i0, reason: collision with root package name */
    public static final String f11641i0;

    /* renamed from: j0, reason: collision with root package name */
    public static final String f11642j0;

    /* renamed from: k0, reason: collision with root package name */
    public static final String f11643k0;

    /* renamed from: l0, reason: collision with root package name */
    public static final String f11644l0;

    /* renamed from: m0, reason: collision with root package name */
    public static final String f11645m0;

    /* renamed from: n0, reason: collision with root package name */
    public static final String f11646n0;
    public static final String o0;

    /* renamed from: p0, reason: collision with root package name */
    public static final String f11647p0;

    /* renamed from: q0, reason: collision with root package name */
    public static final String f11648q0;

    /* renamed from: r0, reason: collision with root package name */
    public static final String f11649r0;

    /* renamed from: s0, reason: collision with root package name */
    public static final String f11650s0;

    /* renamed from: t0, reason: collision with root package name */
    public static final String f11651t0;

    /* renamed from: u0, reason: collision with root package name */
    public static final String f11652u0;

    /* renamed from: v0, reason: collision with root package name */
    public static final String f11653v0;

    /* renamed from: w0, reason: collision with root package name */
    public static final String f11654w0;

    /* renamed from: x0, reason: collision with root package name */
    public static final String f11655x0;

    /* renamed from: y0, reason: collision with root package name */
    public static final String f11656y0;

    /* renamed from: z0, reason: collision with root package name */
    public static final String f11657z0;
    public final float A;
    public final byte[] B;
    public final int C;
    public final h D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final int N;
    public final int O;
    public int P;

    /* renamed from: a, reason: collision with root package name */
    public final String f11658a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11659b;

    /* renamed from: c, reason: collision with root package name */
    public final db.k0 f11660c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11661d;

    /* renamed from: e, reason: collision with root package name */
    public final int f11662e;

    /* renamed from: f, reason: collision with root package name */
    public final int f11663f;

    /* renamed from: g, reason: collision with root package name */
    public final int f11664g;

    /* renamed from: h, reason: collision with root package name */
    public final int f11665h;

    /* renamed from: i, reason: collision with root package name */
    public final int f11666i;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public final String f11667k;

    /* renamed from: l, reason: collision with root package name */
    public final j0 f11668l;

    /* renamed from: m, reason: collision with root package name */
    public final String f11669m;

    /* renamed from: n, reason: collision with root package name */
    public final String f11670n;

    /* renamed from: o, reason: collision with root package name */
    public final int f11671o;

    /* renamed from: p, reason: collision with root package name */
    public final int f11672p;

    /* renamed from: q, reason: collision with root package name */
    public final List f11673q;

    /* renamed from: r, reason: collision with root package name */
    public final m f11674r;
    public final long s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f11675t;

    /* renamed from: u, reason: collision with root package name */
    public final int f11676u;

    /* renamed from: v, reason: collision with root package name */
    public final int f11677v;

    /* renamed from: w, reason: collision with root package name */
    public final int f11678w;

    /* renamed from: x, reason: collision with root package name */
    public final int f11679x;

    /* renamed from: y, reason: collision with root package name */
    public final float f11680y;

    /* renamed from: z, reason: collision with root package name */
    public final int f11681z;

    static {
        u1.a0.K(8);
        Z = Integer.toString(9, 36);
        f11633a0 = Integer.toString(10, 36);
        f11634b0 = Integer.toString(11, 36);
        f11635c0 = Integer.toString(12, 36);
        f11636d0 = Integer.toString(13, 36);
        f11637e0 = Integer.toString(14, 36);
        f11638f0 = Integer.toString(15, 36);
        f11639g0 = Integer.toString(16, 36);
        f11640h0 = Integer.toString(17, 36);
        f11641i0 = Integer.toString(18, 36);
        f11642j0 = Integer.toString(19, 36);
        f11643k0 = Integer.toString(20, 36);
        f11644l0 = Integer.toString(21, 36);
        f11645m0 = Integer.toString(22, 36);
        f11646n0 = Integer.toString(23, 36);
        o0 = Integer.toString(24, 36);
        f11647p0 = Integer.toString(25, 36);
        f11648q0 = Integer.toString(26, 36);
        f11649r0 = Integer.toString(27, 36);
        f11650s0 = Integer.toString(28, 36);
        f11651t0 = Integer.toString(29, 36);
        f11652u0 = Integer.toString(30, 36);
        f11653v0 = Integer.toString(31, 36);
        f11654w0 = Integer.toString(32, 36);
        f11655x0 = Integer.toString(33, 36);
        f11656y0 = Integer.toString(34, 36);
        f11657z0 = Integer.toString(35, 36);
        A0 = Integer.toString(36, 36);
    }

    public q(p pVar) {
        boolean z10;
        String str;
        boolean z11;
        this.f11658a = pVar.f11600a;
        String R2 = u1.a0.R(pVar.f11603d);
        this.f11661d = R2;
        if (pVar.f11602c.isEmpty() && pVar.f11601b != null) {
            this.f11660c = db.k0.o(new t(R2, pVar.f11601b));
            this.f11659b = pVar.f11601b;
        } else if (!pVar.f11602c.isEmpty() && pVar.f11601b == null) {
            db.k0 k0Var = pVar.f11602c;
            this.f11660c = k0Var;
            int size = k0Var.size();
            int i6 = 0;
            while (true) {
                if (i6 < size) {
                    Object obj = k0Var.get(i6);
                    i6++;
                    t tVar = (t) obj;
                    if (TextUtils.equals(tVar.f11694a, R2)) {
                        str = tVar.f11695b;
                        break;
                    }
                } else {
                    str = ((t) k0Var.get(0)).f11695b;
                    break;
                }
            }
            this.f11659b = str;
        } else {
            if (!pVar.f11602c.isEmpty() || pVar.f11601b != null) {
                for (int i10 = 0; i10 < pVar.f11602c.size(); i10++) {
                    if (!((t) pVar.f11602c.get(i10)).f11695b.equals(pVar.f11601b)) {
                    }
                }
                z10 = false;
                u1.c.g(z10);
                this.f11660c = pVar.f11602c;
                this.f11659b = pVar.f11601b;
            }
            z10 = true;
            u1.c.g(z10);
            this.f11660c = pVar.f11602c;
            this.f11659b = pVar.f11601b;
        }
        this.f11662e = pVar.f11604e;
        if (pVar.f11606g != 0 && (pVar.f11605f & 32768) == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        u1.c.f("Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set", z11);
        this.f11663f = pVar.f11605f;
        this.f11664g = pVar.f11606g;
        int i11 = pVar.f11607h;
        this.f11665h = i11;
        int i12 = pVar.f11608i;
        this.f11666i = i12;
        this.j = i12 != -1 ? i12 : i11;
        this.f11667k = pVar.j;
        this.f11668l = pVar.f11609k;
        this.f11669m = pVar.f11610l;
        this.f11670n = pVar.f11611m;
        this.f11671o = pVar.f11612n;
        this.f11672p = pVar.f11613o;
        List list = pVar.f11614p;
        this.f11673q = list == null ? Collections.EMPTY_LIST : list;
        m mVar = pVar.f11615q;
        this.f11674r = mVar;
        this.s = pVar.f11616r;
        this.f11675t = pVar.s;
        this.f11676u = pVar.f11617t;
        this.f11677v = pVar.f11618u;
        this.f11678w = pVar.f11619v;
        this.f11679x = pVar.f11620w;
        this.f11680y = pVar.f11621x;
        int i13 = pVar.f11622y;
        this.f11681z = i13 == -1 ? 0 : i13;
        float f3 = pVar.f11623z;
        this.A = f3 == -1.0f ? 1.0f : f3;
        this.B = pVar.A;
        this.C = pVar.B;
        this.D = pVar.C;
        this.E = pVar.D;
        this.F = pVar.E;
        this.G = pVar.F;
        this.H = pVar.G;
        int i14 = pVar.H;
        this.I = i14 == -1 ? 0 : i14;
        int i15 = pVar.I;
        this.J = i15 != -1 ? i15 : 0;
        this.K = pVar.J;
        this.L = pVar.K;
        this.M = pVar.L;
        this.N = pVar.M;
        int i16 = pVar.N;
        if (i16 == 0 && mVar != null) {
            this.O = 1;
        } else {
            this.O = i16;
        }
    }

    public static String c(q qVar) {
        char c10;
        int i6;
        String str;
        String str2;
        String str3;
        m mVar;
        if (qVar == null) {
            return "null";
        }
        int i10 = qVar.f11662e;
        db.k0 k0Var = qVar.f11660c;
        String str4 = qVar.f11661d;
        int i11 = qVar.G;
        int i12 = qVar.F;
        int i13 = qVar.E;
        float f3 = qVar.f11680y;
        h hVar = qVar.D;
        float f10 = qVar.A;
        int i14 = qVar.f11679x;
        int i15 = qVar.f11678w;
        int i16 = qVar.f11677v;
        int i17 = qVar.f11676u;
        m mVar2 = qVar.f11674r;
        String str5 = qVar.f11667k;
        int i18 = qVar.j;
        String str6 = qVar.f11669m;
        int i19 = qVar.f11663f;
        cb.f fVar = new cb.f(String.valueOf(','));
        StringBuilder b10 = y.e.b("id=");
        b10.append(qVar.f11658a);
        b10.append(", mimeType=");
        b10.append(qVar.f11670n);
        if (str6 != null) {
            b10.append(", container=");
            b10.append(str6);
        }
        if (i18 != -1) {
            b10.append(", bitrate=");
            b10.append(i18);
        }
        if (str5 != null) {
            b10.append(", codecs=");
            b10.append(str5);
        }
        if (mVar2 != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i20 = 0;
            c10 = 0;
            while (i20 < mVar2.A) {
                UUID uuid = mVar2.f11583x[i20].f11576y;
                if (uuid.equals(g.f11400b)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(g.f11401c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(g.f11403e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(g.f11402d)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(g.f11399a)) {
                    linkedHashSet.add(GatewayException.GATEWAY_RESPONSE_DEPTH_UNIVERSAL);
                } else {
                    mVar = mVar2;
                    linkedHashSet.add("unknown (" + uuid + ")");
                    i20++;
                    mVar2 = mVar;
                }
                mVar = mVar2;
                i20++;
                mVar2 = mVar;
            }
            b10.append(", drm=[");
            fVar.a(b10, linkedHashSet.iterator());
            b10.append(']');
        } else {
            c10 = 0;
        }
        if (i17 != -1 && i16 != -1) {
            b10.append(", res=");
            b10.append(i17);
            b10.append("x");
            b10.append(i16);
        }
        if (i15 != -1 && i14 != -1) {
            b10.append(", decRes=");
            b10.append(i15);
            b10.append("x");
            b10.append(i14);
        }
        double d10 = f10;
        int i21 = fb.c.f5155a;
        if (Math.copySign(d10 - 1.0d, 1.0d) > 0.001d && d10 != 1.0d && (!Double.isNaN(d10) || !Double.isNaN(1.0d))) {
            b10.append(", par=");
            Object[] objArr = new Object[1];
            objArr[c10] = Float.valueOf(f10);
            String str7 = u1.a0.f12750a;
            b10.append(String.format(Locale.US, "%.3f", objArr));
        }
        if (hVar != null) {
            int i22 = hVar.f11442f;
            int i23 = hVar.f11441e;
            if ((i23 != -1 && i22 != -1) || hVar.d()) {
                b10.append(", color=");
                if (hVar.d()) {
                    String b11 = h.b(hVar.f11437a);
                    String a10 = h.a(hVar.f11438b);
                    String c11 = h.c(hVar.f11439c);
                    String str8 = u1.a0.f12750a;
                    Locale locale = Locale.US;
                    str2 = b11 + "/" + a10 + "/" + c11;
                } else {
                    str2 = "NA/NA/NA";
                }
                if (i23 != -1 && i22 != -1) {
                    str3 = i23 + "/" + i22;
                } else {
                    str3 = "NA/NA";
                }
                b10.append(str2 + "/" + str3);
            }
        }
        if (f3 != -1.0f) {
            b10.append(", fps=");
            b10.append(f3);
        }
        if (i13 != -1) {
            b10.append(", maxSubLayers=");
            b10.append(i13);
        }
        if (i12 != -1) {
            b10.append(", channels=");
            b10.append(i12);
        }
        if (i11 != -1) {
            b10.append(", sample_rate=");
            b10.append(i11);
        }
        if (str4 != null) {
            b10.append(", language=");
            b10.append(str4);
        }
        if (!k0Var.isEmpty()) {
            b10.append(", labels=[");
            fVar.a(b10, db.r.w(k0Var, new o5.p(8)).iterator());
            b10.append("]");
        }
        if (i10 != 0) {
            b10.append(", selectionFlags=[");
            String str9 = u1.a0.f12750a;
            ArrayList arrayList = new ArrayList();
            if ((i10 & 4) != 0) {
                arrayList.add("auto");
            }
            if ((i10 & 1) != 0) {
                arrayList.add(BuildConfig.FLAVOR);
            }
            if ((i10 & 2) != 0) {
                arrayList.add("forced");
            }
            fVar.a(b10, arrayList.iterator());
            b10.append("]");
        }
        if (i19 != 0) {
            b10.append(", roleFlags=[");
            String str10 = u1.a0.f12750a;
            ArrayList arrayList2 = new ArrayList();
            if ((i19 & 1) != 0) {
                arrayList2.add("main");
            }
            if ((i19 & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((i19 & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((i19 & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((i19 & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((i19 & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((i19 & 64) != 0) {
                arrayList2.add("caption");
            }
            i6 = i19;
            if ((i6 & 128) != 0) {
                arrayList2.add("subtitle");
            }
            if ((i6 & 256) != 0) {
                arrayList2.add("sign");
            }
            if ((i6 & 512) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i6 & 1024) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i6 & 2048) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i6 & CodedOutputStream.DEFAULT_BUFFER_SIZE) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i6 & 8192) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i6 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                arrayList2.add("trick-play");
            }
            if ((i6 & 32768) != 0) {
                arrayList2.add("auxiliary");
            }
            fVar.a(b10, arrayList2.iterator());
            b10.append("]");
        } else {
            i6 = i19;
        }
        if ((i6 & 32768) != 0) {
            b10.append(", auxiliaryTrackType=");
            int i24 = qVar.f11664g;
            String str11 = u1.a0.f12750a;
            if (i24 != 0) {
                if (i24 != 1) {
                    if (i24 != 2) {
                        if (i24 != 3) {
                            if (i24 == 4) {
                                str = "depth metadata";
                            } else {
                                throw new IllegalStateException("Unsupported auxiliary track type");
                            }
                        } else {
                            str = "depth-inverse";
                        }
                    } else {
                        str = "depth-linear";
                    }
                } else {
                    str = "original";
                }
            } else {
                str = "undefined";
            }
            b10.append(str);
        }
        return b10.toString();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [r1.p, java.lang.Object] */
    public final p a() {
        ?? obj = new Object();
        obj.f11600a = this.f11658a;
        obj.f11601b = this.f11659b;
        obj.f11602c = this.f11660c;
        obj.f11603d = this.f11661d;
        obj.f11604e = this.f11662e;
        obj.f11605f = this.f11663f;
        obj.f11607h = this.f11665h;
        obj.f11608i = this.f11666i;
        obj.j = this.f11667k;
        obj.f11609k = this.f11668l;
        obj.f11610l = this.f11669m;
        obj.f11611m = this.f11670n;
        obj.f11612n = this.f11671o;
        obj.f11613o = this.f11672p;
        obj.f11614p = this.f11673q;
        obj.f11615q = this.f11674r;
        obj.f11616r = this.s;
        obj.s = this.f11675t;
        obj.f11617t = this.f11676u;
        obj.f11618u = this.f11677v;
        obj.f11619v = this.f11678w;
        obj.f11620w = this.f11679x;
        obj.f11621x = this.f11680y;
        obj.f11622y = this.f11681z;
        obj.f11623z = this.A;
        obj.A = this.B;
        obj.B = this.C;
        obj.C = this.D;
        obj.D = this.E;
        obj.E = this.F;
        obj.F = this.G;
        obj.G = this.H;
        obj.H = this.I;
        obj.I = this.J;
        obj.J = this.K;
        obj.K = this.L;
        obj.L = this.M;
        obj.M = this.N;
        obj.N = this.O;
        return obj;
    }

    public final boolean b(q qVar) {
        List list = this.f11673q;
        if (list.size() != qVar.f11673q.size()) {
            return false;
        }
        for (int i6 = 0; i6 < list.size(); i6++) {
            if (!Arrays.equals((byte[]) list.get(i6), (byte[]) qVar.f11673q.get(i6))) {
                return false;
            }
        }
        return true;
    }

    public final q d(q qVar) {
        String str;
        String str2;
        m mVar;
        int i6;
        int i10;
        if (this == qVar) {
            return this;
        }
        int i11 = k0.i(this.f11670n);
        String str3 = qVar.f11658a;
        j0 j0Var = qVar.f11668l;
        db.k0 k0Var = qVar.f11660c;
        int i12 = qVar.M;
        int i13 = qVar.N;
        String str4 = qVar.f11659b;
        if (str4 == null) {
            str4 = this.f11659b;
        }
        if (k0Var.isEmpty()) {
            k0Var = this.f11660c;
        }
        if ((i11 != 3 && i11 != 1) || (str = qVar.f11661d) == null) {
            str = this.f11661d;
        }
        int i14 = this.f11665h;
        if (i14 == -1) {
            i14 = qVar.f11665h;
        }
        int i15 = this.f11666i;
        if (i15 == -1) {
            i15 = qVar.f11666i;
        }
        String str5 = this.f11667k;
        if (str5 == null) {
            String v10 = u1.a0.v(i11, qVar.f11667k);
            if (u1.a0.b0(v10).length == 1) {
                str5 = v10;
            }
        }
        j0 j0Var2 = this.f11668l;
        if (j0Var2 != null) {
            j0Var = j0Var2.b(j0Var);
        }
        float f3 = this.f11680y;
        if (f3 == -1.0f && i11 == 2) {
            f3 = qVar.f11680y;
        }
        int i16 = this.f11662e | qVar.f11662e;
        int i17 = this.f11663f | qVar.f11663f;
        m mVar2 = qVar.f11674r;
        ArrayList arrayList = new ArrayList();
        db.k0 k0Var2 = k0Var;
        if (mVar2 != null) {
            String str6 = mVar2.f11585z;
            l[] lVarArr = mVar2.f11583x;
            int length = lVarArr.length;
            int i18 = 0;
            while (i18 < length) {
                int i19 = i18;
                l lVar = lVarArr[i19];
                int i20 = length;
                if (lVar.B != null) {
                    arrayList.add(lVar);
                }
                i18 = i19 + 1;
                length = i20;
            }
            str2 = str6;
        } else {
            str2 = null;
        }
        m mVar3 = this.f11674r;
        if (mVar3 != null) {
            if (str2 == null) {
                str2 = mVar3.f11585z;
            }
            int size = arrayList.size();
            l[] lVarArr2 = mVar3.f11583x;
            String str7 = str2;
            int length2 = lVarArr2.length;
            int i21 = 0;
            while (i21 < length2) {
                int i22 = i21;
                l lVar2 = lVarArr2[i22];
                int i23 = length2;
                if (lVar2.B != null) {
                    UUID uuid = lVar2.f11576y;
                    i10 = i13;
                    int i24 = 0;
                    while (true) {
                        if (i24 < size) {
                            i6 = size;
                            if (((l) arrayList.get(i24)).f11576y.equals(uuid)) {
                                break;
                            }
                            i24++;
                            size = i6;
                        } else {
                            i6 = size;
                            arrayList.add(lVar2);
                            break;
                        }
                    }
                } else {
                    i6 = size;
                    i10 = i13;
                }
                i21 = i22 + 1;
                length2 = i23;
                i13 = i10;
                size = i6;
            }
            str2 = str7;
        }
        int i25 = i13;
        if (arrayList.isEmpty()) {
            mVar = null;
        } else {
            mVar = new m(str2, arrayList);
        }
        p a10 = a();
        a10.f11600a = str3;
        a10.f11601b = str4;
        a10.f11602c = db.k0.k(k0Var2);
        a10.f11603d = str;
        a10.f11604e = i16;
        a10.f11605f = i17;
        a10.f11607h = i14;
        a10.f11608i = i15;
        a10.j = str5;
        a10.f11609k = j0Var;
        a10.f11615q = mVar;
        a10.f11621x = f3;
        a10.L = i12;
        a10.M = i25;
        return new q(a10);
    }

    public final boolean equals(Object obj) {
        int i6;
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            int i10 = this.P;
            if ((i10 == 0 || (i6 = qVar.P) == 0 || i10 == i6) && this.f11662e == qVar.f11662e && this.f11663f == qVar.f11663f && this.f11664g == qVar.f11664g && this.f11665h == qVar.f11665h && this.f11666i == qVar.f11666i && this.f11671o == qVar.f11671o && this.s == qVar.s && this.f11676u == qVar.f11676u && this.f11677v == qVar.f11677v && this.f11678w == qVar.f11678w && this.f11679x == qVar.f11679x && this.f11681z == qVar.f11681z && this.C == qVar.C && this.E == qVar.E && this.F == qVar.F && this.G == qVar.G && this.H == qVar.H && this.I == qVar.I && this.J == qVar.J && this.K == qVar.K && this.M == qVar.M && this.N == qVar.N && this.O == qVar.O && Float.compare(this.f11680y, qVar.f11680y) == 0 && Float.compare(this.A, qVar.A) == 0 && Objects.equals(this.f11658a, qVar.f11658a) && Objects.equals(this.f11659b, qVar.f11659b) && this.f11660c.equals(qVar.f11660c) && Objects.equals(this.f11667k, qVar.f11667k) && Objects.equals(this.f11669m, qVar.f11669m) && Objects.equals(this.f11670n, qVar.f11670n) && Objects.equals(this.f11661d, qVar.f11661d) && Arrays.equals(this.B, qVar.B) && Objects.equals(this.f11668l, qVar.f11668l) && Objects.equals(this.D, qVar.D) && Objects.equals(this.f11674r, qVar.f11674r) && b(qVar)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        if (this.P == 0) {
            int i6 = 0;
            String str = this.f11658a;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i10 = (527 + hashCode) * 31;
            String str2 = this.f11659b;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int hashCode7 = (this.f11660c.hashCode() + ((i10 + hashCode2) * 31)) * 31;
            String str3 = this.f11661d;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int i11 = (((((((((((hashCode7 + hashCode3) * 31) + this.f11662e) * 31) + this.f11663f) * 31) + this.f11664g) * 31) + this.f11665h) * 31) + this.f11666i) * 31;
            String str4 = this.f11667k;
            if (str4 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str4.hashCode();
            }
            int i12 = (i11 + hashCode4) * 31;
            j0 j0Var = this.f11668l;
            if (j0Var == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = j0Var.hashCode();
            }
            int i13 = (i12 + hashCode5) * 961;
            String str5 = this.f11669m;
            if (str5 == null) {
                hashCode6 = 0;
            } else {
                hashCode6 = str5.hashCode();
            }
            int i14 = (i13 + hashCode6) * 31;
            String str6 = this.f11670n;
            if (str6 != null) {
                i6 = str6.hashCode();
            }
            this.P = ((((((((((((((((((((((Float.floatToIntBits(this.A) + ((((Float.floatToIntBits(this.f11680y) + ((((((((((((((i14 + i6) * 31) + this.f11671o) * 31) + ((int) this.s)) * 31) + this.f11676u) * 31) + this.f11677v) * 31) + this.f11678w) * 31) + this.f11679x) * 31)) * 31) + this.f11681z) * 31)) * 31) + this.C) * 31) + this.E) * 31) + this.F) * 31) + this.G) * 31) + this.H) * 31) + this.I) * 31) + this.J) * 31) + this.K) * 31) + this.M) * 31) + this.N) * 31) + this.O;
        }
        return this.P;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Format(");
        sb2.append(this.f11658a);
        sb2.append(", ");
        sb2.append(this.f11659b);
        sb2.append(", ");
        sb2.append(this.f11669m);
        sb2.append(", ");
        sb2.append(this.f11670n);
        sb2.append(", ");
        sb2.append(this.f11667k);
        sb2.append(", ");
        sb2.append(this.j);
        sb2.append(", ");
        sb2.append(this.f11661d);
        sb2.append(", [");
        sb2.append(this.f11676u);
        sb2.append(", ");
        sb2.append(this.f11677v);
        sb2.append(", ");
        sb2.append(this.f11680y);
        sb2.append(", ");
        sb2.append(this.D);
        sb2.append("], [");
        sb2.append(this.F);
        sb2.append(", ");
        return r4.a.l(sb2, this.G, "])");
    }
}
