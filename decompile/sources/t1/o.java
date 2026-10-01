package t1;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class o {
    public final float A;
    public final byte[] B;
    public final int C;
    public final f D;
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

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y9.f0 f12052c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f12053d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f12054e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f12055g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f12056h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f12057j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f12058k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e0 f12059l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f12060m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f12061n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f12062o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f12063p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List f12064q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final k f12065r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f12066s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f12067t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f12068u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f12069v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f12070w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f12071x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final float f12072y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f12073z;

    static {
        new n().a();
        w1.b0.H(0);
        w1.b0.H(1);
        w1.b0.H(2);
        w1.b0.H(3);
        w1.b0.H(4);
        d0.d.p(5, 6, 7, 8, 9);
        d0.d.p(10, 11, 12, 13, 14);
        d0.d.p(15, 16, 17, 18, 19);
        d0.d.p(20, 21, 22, 23, 24);
        d0.d.p(25, 26, 27, 28, 29);
        d0.d.p(30, 31, 32, 33, 34);
        w1.b0.H(35);
        w1.b0.H(36);
    }

    public o(n nVar) {
        boolean z2;
        String str;
        this.f12050a = nVar.f12026a;
        String strN = w1.b0.N(nVar.f12029d);
        this.f12053d = strN;
        if (nVar.f12028c.isEmpty() && nVar.f12027b != null) {
            this.f12052c = y9.f0.q(new p(strN, nVar.f12027b));
            this.f12051b = nVar.f12027b;
        } else if (!nVar.f12028c.isEmpty() && nVar.f12027b == null) {
            y9.f0 f0Var = nVar.f12028c;
            this.f12052c = f0Var;
            int size = f0Var.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    str = ((p) f0Var.get(0)).f12078b;
                    break;
                }
                Object obj = f0Var.get(i);
                i++;
                p pVar = (p) obj;
                if (TextUtils.equals(pVar.f12077a, strN)) {
                    str = pVar.f12078b;
                    break;
                }
            }
            this.f12051b = str;
        } else if (nVar.f12028c.isEmpty() && nVar.f12027b == null) {
            z2 = true;
            w1.a.j(z2);
            this.f12052c = nVar.f12028c;
            this.f12051b = nVar.f12027b;
        } else {
            for (int i10 = 0; i10 < nVar.f12028c.size(); i10++) {
                if (((p) nVar.f12028c.get(i10)).f12078b.equals(nVar.f12027b)) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
            w1.a.j(z2);
            this.f12052c = nVar.f12028c;
            this.f12051b = nVar.f12027b;
        }
        this.f12054e = nVar.f12030e;
        w1.a.i("Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set", nVar.f12031g == 0 || (nVar.f & 32768) != 0);
        this.f = nVar.f;
        this.f12055g = nVar.f12031g;
        int i11 = nVar.f12032h;
        this.f12056h = i11;
        int i12 = nVar.i;
        this.i = i12;
        this.f12057j = i12 != -1 ? i12 : i11;
        this.f12058k = nVar.f12033j;
        this.f12059l = nVar.f12034k;
        this.f12060m = nVar.f12035l;
        this.f12061n = nVar.f12036m;
        this.f12062o = nVar.f12037n;
        this.f12063p = nVar.f12038o;
        List list = nVar.f12039p;
        this.f12064q = list == null ? Collections.EMPTY_LIST : list;
        k kVar = nVar.f12040q;
        this.f12065r = kVar;
        this.f12066s = nVar.f12041r;
        this.f12067t = nVar.f12042s;
        this.f12068u = nVar.f12043t;
        this.f12069v = nVar.f12044u;
        this.f12070w = nVar.f12045v;
        this.f12071x = nVar.f12046w;
        this.f12072y = nVar.f12047x;
        int i13 = nVar.f12048y;
        this.f12073z = i13 == -1 ? 0 : i13;
        float f = nVar.f12049z;
        this.A = f == -1.0f ? 1.0f : f;
        this.B = nVar.A;
        this.C = nVar.B;
        this.D = nVar.C;
        this.E = nVar.D;
        this.F = nVar.E;
        this.G = nVar.F;
        this.H = nVar.G;
        int i14 = nVar.H;
        this.I = i14 == -1 ? 0 : i14;
        int i15 = nVar.I;
        this.J = i15 != -1 ? i15 : 0;
        this.K = nVar.J;
        this.L = nVar.K;
        this.M = nVar.L;
        this.N = nVar.M;
        int i16 = nVar.N;
        if (i16 != 0 || kVar == null) {
            this.O = i16;
        } else {
            this.O = 1;
        }
    }

    public static String c(o oVar) {
        char c10;
        int i;
        String str;
        String str2;
        String str3;
        k kVar;
        if (oVar == null) {
            return "null";
        }
        int i10 = oVar.f12054e;
        y9.f0 f0Var = oVar.f12052c;
        String str4 = oVar.f12053d;
        int i11 = oVar.G;
        int i12 = oVar.F;
        int i13 = oVar.E;
        float f = oVar.f12072y;
        f fVar = oVar.D;
        float f4 = oVar.A;
        int i14 = oVar.f12071x;
        int i15 = oVar.f12070w;
        int i16 = oVar.f12069v;
        int i17 = oVar.f12068u;
        k kVar2 = oVar.f12065r;
        String str5 = oVar.f12058k;
        int i18 = oVar.f12057j;
        String str6 = oVar.f12060m;
        int i19 = oVar.f;
        re.t tVar = new re.t(String.valueOf(','));
        StringBuilder sbB = y.e.b("id=");
        sbB.append(oVar.f12050a);
        sbB.append(", mimeType=");
        sbB.append(oVar.f12061n);
        if (str6 != null) {
            sbB.append(", container=");
            sbB.append(str6);
        }
        if (i18 != -1) {
            sbB.append(", bitrate=");
            sbB.append(i18);
        }
        if (str5 != null) {
            sbB.append(", codecs=");
            sbB.append(str5);
        }
        if (kVar2 != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i20 = 0;
            c10 = 0;
            while (i20 < kVar2.f12016y) {
                UUID uuid = kVar2.f12013v[i20].f12008w;
                if (uuid.equals(e.f11980b)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(e.f11981c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(e.f11983e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(e.f11982d)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(e.f11979a)) {
                    linkedHashSet.add("universal");
                } else {
                    kVar = kVar2;
                    linkedHashSet.add("unknown (" + uuid + ")");
                    i20++;
                    kVar2 = kVar;
                }
                kVar = kVar2;
                i20++;
                kVar2 = kVar;
            }
            sbB.append(", drm=[");
            tVar.a(sbB, linkedHashSet.iterator());
            sbB.append(']');
        } else {
            c10 = 0;
        }
        if (i17 != -1 && i16 != -1) {
            sbB.append(", res=");
            sbB.append(i17);
            sbB.append("x");
            sbB.append(i16);
        }
        if (i15 != -1 && i14 != -1) {
            sbB.append(", decRes=");
            sbB.append(i15);
            sbB.append("x");
            sbB.append(i14);
        }
        double d10 = f4;
        int i21 = ba.c.f1597a;
        if (Math.copySign(d10 - 1.0d, 1.0d) > 0.001d && d10 != 1.0d && (!Double.isNaN(d10) || !Double.isNaN(1.0d))) {
            sbB.append(", par=");
            Object[] objArr = new Object[1];
            objArr[c10] = Float.valueOf(f4);
            int i22 = w1.b0.f13686a;
            sbB.append(String.format(Locale.US, "%.3f", objArr));
        }
        if (fVar != null) {
            int i23 = fVar.f;
            int i24 = fVar.f11991e;
            if ((i24 != -1 && i23 != -1) || fVar.d()) {
                sbB.append(", color=");
                if (fVar.d()) {
                    String strB = f.b(fVar.f11987a);
                    String strA = f.a(fVar.f11988b);
                    String strC = f.c(fVar.f11989c);
                    Locale locale = Locale.US;
                    str2 = strB + "/" + strA + "/" + strC;
                } else {
                    str2 = "NA/NA/NA";
                }
                if (i24 == -1 || i23 == -1) {
                    str3 = "NA/NA";
                } else {
                    str3 = i24 + "/" + i23;
                }
                sbB.append(str2 + "/" + str3);
            }
        }
        if (f != -1.0f) {
            sbB.append(", fps=");
            sbB.append(f);
        }
        if (i13 != -1) {
            sbB.append(", maxSubLayers=");
            sbB.append(i13);
        }
        if (i12 != -1) {
            sbB.append(", channels=");
            sbB.append(i12);
        }
        if (i11 != -1) {
            sbB.append(", sample_rate=");
            sbB.append(i11);
        }
        if (str4 != null) {
            sbB.append(", language=");
            sbB.append(str4);
        }
        if (!f0Var.isEmpty()) {
            sbB.append(", labels=[");
            tVar.a(sbB, y9.p.y(f0Var, new c2.q(9)).iterator());
            sbB.append("]");
        }
        if (i10 != 0) {
            sbB.append(", selectionFlags=[");
            int i25 = w1.b0.f13686a;
            ArrayList arrayList = new ArrayList();
            if ((i10 & 4) != 0) {
                arrayList.add("auto");
            }
            if ((i10 & 1) != 0) {
                arrayList.add("default");
            }
            if ((i10 & 2) != 0) {
                arrayList.add("forced");
            }
            tVar.a(sbB, arrayList.iterator());
            sbB.append("]");
        }
        if (i19 != 0) {
            sbB.append(", roleFlags=[");
            int i26 = w1.b0.f13686a;
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
            i = i19;
            if ((i & 128) != 0) {
                arrayList2.add("subtitle");
            }
            if ((i & 256) != 0) {
                arrayList2.add("sign");
            }
            if ((i & 512) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i & 1024) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i & 2048) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i & 4096) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i & 8192) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i & 16384) != 0) {
                arrayList2.add("trick-play");
            }
            if ((i & 32768) != 0) {
                arrayList2.add("auxiliary");
            }
            tVar.a(sbB, arrayList2.iterator());
            sbB.append("]");
        } else {
            i = i19;
        }
        if ((i & 32768) != 0) {
            sbB.append(", auxiliaryTrackType=");
            int i27 = oVar.f12055g;
            int i28 = w1.b0.f13686a;
            if (i27 == 0) {
                str = "undefined";
            } else if (i27 == 1) {
                str = "original";
            } else if (i27 == 2) {
                str = "depth-linear";
            } else if (i27 == 3) {
                str = "depth-inverse";
            } else {
                if (i27 != 4) {
                    throw new IllegalStateException("Unsupported auxiliary track type");
                }
                str = "depth metadata";
            }
            sbB.append(str);
        }
        return sbB.toString();
    }

    public final n a() {
        n nVar = new n();
        nVar.f12026a = this.f12050a;
        nVar.f12027b = this.f12051b;
        nVar.f12028c = this.f12052c;
        nVar.f12029d = this.f12053d;
        nVar.f12030e = this.f12054e;
        nVar.f = this.f;
        nVar.f12032h = this.f12056h;
        nVar.i = this.i;
        nVar.f12033j = this.f12058k;
        nVar.f12034k = this.f12059l;
        nVar.f12035l = this.f12060m;
        nVar.f12036m = this.f12061n;
        nVar.f12037n = this.f12062o;
        nVar.f12038o = this.f12063p;
        nVar.f12039p = this.f12064q;
        nVar.f12040q = this.f12065r;
        nVar.f12041r = this.f12066s;
        nVar.f12042s = this.f12067t;
        nVar.f12043t = this.f12068u;
        nVar.f12044u = this.f12069v;
        nVar.f12045v = this.f12070w;
        nVar.f12046w = this.f12071x;
        nVar.f12047x = this.f12072y;
        nVar.f12048y = this.f12073z;
        nVar.f12049z = this.A;
        nVar.A = this.B;
        nVar.B = this.C;
        nVar.C = this.D;
        nVar.D = this.E;
        nVar.E = this.F;
        nVar.F = this.G;
        nVar.G = this.H;
        nVar.H = this.I;
        nVar.I = this.J;
        nVar.J = this.K;
        nVar.K = this.L;
        nVar.L = this.M;
        nVar.M = this.N;
        nVar.N = this.O;
        return nVar;
    }

    public final boolean b(o oVar) {
        List list = this.f12064q;
        if (list.size() != oVar.f12064q.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) oVar.f12064q.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final o d(o oVar) {
        String str;
        String str2;
        int i;
        int i10;
        if (this == oVar) {
            return this;
        }
        int i11 = f0.i(this.f12061n);
        String str3 = oVar.f12050a;
        e0 e0VarB = oVar.f12059l;
        y9.f0 f0Var = oVar.f12052c;
        int i12 = oVar.M;
        int i13 = oVar.N;
        String str4 = oVar.f12051b;
        if (str4 == null) {
            str4 = this.f12051b;
        }
        if (f0Var.isEmpty()) {
            f0Var = this.f12052c;
        }
        if ((i11 != 3 && i11 != 1) || (str = oVar.f12053d) == null) {
            str = this.f12053d;
        }
        int i14 = this.f12056h;
        if (i14 == -1) {
            i14 = oVar.f12056h;
        }
        int i15 = this.i;
        if (i15 == -1) {
            i15 = oVar.i;
        }
        String str5 = this.f12058k;
        if (str5 == null) {
            String strS = w1.b0.s(i11, oVar.f12058k);
            if (w1.b0.X(strS).length == 1) {
                str5 = strS;
            }
        }
        e0 e0Var = this.f12059l;
        if (e0Var != null) {
            e0VarB = e0Var.b(e0VarB);
        }
        float f = this.f12072y;
        if (f == -1.0f && i11 == 2) {
            f = oVar.f12072y;
        }
        int i16 = this.f12054e | oVar.f12054e;
        int i17 = this.f | oVar.f;
        k kVar = oVar.f12065r;
        ArrayList arrayList = new ArrayList();
        y9.f0 f0Var2 = f0Var;
        if (kVar != null) {
            String str6 = kVar.f12015x;
            j[] jVarArr = kVar.f12013v;
            int length = jVarArr.length;
            int i18 = 0;
            while (i18 < length) {
                int i19 = i18;
                j jVar = jVarArr[i19];
                int i20 = length;
                if (jVar.f12011z != null) {
                    arrayList.add(jVar);
                }
                i18 = i19 + 1;
                length = i20;
            }
            str2 = str6;
        } else {
            str2 = null;
        }
        k kVar2 = this.f12065r;
        if (kVar2 != null) {
            if (str2 == null) {
                str2 = kVar2.f12015x;
            }
            int size = arrayList.size();
            j[] jVarArr2 = kVar2.f12013v;
            String str7 = str2;
            int length2 = jVarArr2.length;
            int i21 = 0;
            while (i21 < length2) {
                int i22 = i21;
                j jVar2 = jVarArr2[i22];
                int i23 = length2;
                if (jVar2.f12011z != null) {
                    UUID uuid = jVar2.f12008w;
                    i10 = i13;
                    int i24 = 0;
                    while (true) {
                        if (i24 >= size) {
                            i = size;
                            arrayList.add(jVar2);
                            break;
                        }
                        i = size;
                        if (((j) arrayList.get(i24)).f12008w.equals(uuid)) {
                            break;
                        }
                        i24++;
                        size = i;
                    }
                } else {
                    i = size;
                    i10 = i13;
                }
                i21 = i22 + 1;
                length2 = i23;
                i13 = i10;
                size = i;
            }
            str2 = str7;
        }
        int i25 = i13;
        k kVar3 = arrayList.isEmpty() ? null : new k(str2, arrayList);
        n nVarA = a();
        nVarA.f12026a = str3;
        nVarA.f12027b = str4;
        nVarA.f12028c = y9.f0.m(f0Var2);
        nVarA.f12029d = str;
        nVarA.f12030e = i16;
        nVarA.f = i17;
        nVarA.f12032h = i14;
        nVarA.i = i15;
        nVarA.f12033j = str5;
        nVarA.f12034k = e0VarB;
        nVarA.f12040q = kVar3;
        nVarA.f12047x = f;
        nVarA.L = i12;
        nVarA.M = i25;
        return new o(nVarA);
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        int i10 = this.P;
        return (i10 == 0 || (i = oVar.P) == 0 || i10 == i) && this.f12054e == oVar.f12054e && this.f == oVar.f && this.f12055g == oVar.f12055g && this.f12056h == oVar.f12056h && this.i == oVar.i && this.f12062o == oVar.f12062o && this.f12066s == oVar.f12066s && this.f12068u == oVar.f12068u && this.f12069v == oVar.f12069v && this.f12070w == oVar.f12070w && this.f12071x == oVar.f12071x && this.f12073z == oVar.f12073z && this.C == oVar.C && this.E == oVar.E && this.F == oVar.F && this.G == oVar.G && this.H == oVar.H && this.I == oVar.I && this.J == oVar.J && this.K == oVar.K && this.M == oVar.M && this.N == oVar.N && this.O == oVar.O && Float.compare(this.f12072y, oVar.f12072y) == 0 && Float.compare(this.A, oVar.A) == 0 && Objects.equals(this.f12050a, oVar.f12050a) && Objects.equals(this.f12051b, oVar.f12051b) && this.f12052c.equals(oVar.f12052c) && Objects.equals(this.f12058k, oVar.f12058k) && Objects.equals(this.f12060m, oVar.f12060m) && Objects.equals(this.f12061n, oVar.f12061n) && Objects.equals(this.f12053d, oVar.f12053d) && Arrays.equals(this.B, oVar.B) && Objects.equals(this.f12059l, oVar.f12059l) && Objects.equals(this.D, oVar.D) && Objects.equals(this.f12065r, oVar.f12065r) && b(oVar);
    }

    public final int hashCode() {
        if (this.P == 0) {
            String str = this.f12050a;
            int iHashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f12051b;
            int iHashCode2 = (this.f12052c.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            String str3 = this.f12053d;
            int iHashCode3 = (((((((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f12054e) * 31) + this.f) * 31) + this.f12055g) * 31) + this.f12056h) * 31) + this.i) * 31;
            String str4 = this.f12058k;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            e0 e0Var = this.f12059l;
            int iHashCode5 = (iHashCode4 + (e0Var == null ? 0 : e0Var.hashCode())) * 961;
            String str5 = this.f12060m;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f12061n;
            this.P = ((((((((((((((((((((((Float.floatToIntBits(this.A) + ((((Float.floatToIntBits(this.f12072y) + ((((((((((((((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.f12062o) * 31) + ((int) this.f12066s)) * 31) + this.f12068u) * 31) + this.f12069v) * 31) + this.f12070w) * 31) + this.f12071x) * 31)) * 31) + this.f12073z) * 31)) * 31) + this.C) * 31) + this.E) * 31) + this.F) * 31) + this.G) * 31) + this.H) * 31) + this.I) * 31) + this.J) * 31) + this.K) * 31) + this.M) * 31) + this.N) * 31) + this.O;
        }
        return this.P;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Format(");
        sb2.append(this.f12050a);
        sb2.append(", ");
        sb2.append(this.f12051b);
        sb2.append(", ");
        sb2.append(this.f12060m);
        sb2.append(", ");
        sb2.append(this.f12061n);
        sb2.append(", ");
        sb2.append(this.f12058k);
        sb2.append(", ");
        sb2.append(this.f12057j);
        sb2.append(", ");
        sb2.append(this.f12053d);
        sb2.append(", [");
        sb2.append(this.f12068u);
        sb2.append(", ");
        sb2.append(this.f12069v);
        sb2.append(", ");
        sb2.append(this.f12072y);
        sb2.append(", ");
        sb2.append(this.D);
        sb2.append("], [");
        sb2.append(this.F);
        sb2.append(", ");
        return j4.a.l(this.G, "])", sb2);
    }
}
