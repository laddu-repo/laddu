package com.google.android.gms.internal.measurement;

import android.os.Build;
import com.google.protobuf.CodedOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
import okhttp3.HttpUrl;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class k3 extends m5 {
    private static final k3 zzat;
    private int zzA;
    private String zzB;
    private String zzC;
    private boolean zzD;
    private s5 zzE;
    private String zzF;
    private int zzG;
    private int zzH;
    private int zzI;
    private String zzJ;
    private long zzK;
    private long zzL;
    private String zzM;
    private String zzN;
    private int zzO;
    private String zzP;
    private l3 zzQ;
    private q5 zzR;
    private long zzS;
    private long zzT;
    private String zzU;
    private String zzV;
    private int zzW;
    private boolean zzX;
    private String zzY;
    private boolean zzZ;
    private g3 zzaa;
    private String zzab;
    private s5 zzac;
    private String zzad;
    private long zzae;
    private boolean zzaf;
    private String zzag;
    private boolean zzah;
    private String zzai;
    private int zzaj;
    private String zzak;
    private s2 zzal;
    private int zzam;
    private p2 zzan;
    private String zzao;
    private r3 zzap;
    private long zzaq;
    private String zzar;
    private y2 zzas;
    private int zzb;
    private int zzd;
    private int zze;
    private s5 zzf;
    private s5 zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private String zzm;
    private String zzn;
    private String zzo;
    private String zzp;
    private int zzq;
    private String zzr;
    private String zzs;
    private String zzt;
    private long zzu;
    private long zzv;
    private String zzw;
    private boolean zzx;
    private String zzy;
    private long zzz;

    static {
        k3 k3Var = new k3();
        zzat = k3Var;
        m5.m(k3.class, k3Var);
    }

    public k3() {
        l6 l6Var = l6.B;
        this.zzf = l6Var;
        this.zzg = l6Var;
        this.zzm = HttpUrl.FRAGMENT_ENCODE_SET;
        this.zzn = HttpUrl.FRAGMENT_ENCODE_SET;
        this.zzo = HttpUrl.FRAGMENT_ENCODE_SET;
        this.zzp = HttpUrl.FRAGMENT_ENCODE_SET;
        this.zzr = HttpUrl.FRAGMENT_ENCODE_SET;
        this.zzs = HttpUrl.FRAGMENT_ENCODE_SET;
        this.zzt = HttpUrl.FRAGMENT_ENCODE_SET;
        this.zzw = HttpUrl.FRAGMENT_ENCODE_SET;
        this.zzy = HttpUrl.FRAGMENT_ENCODE_SET;
        this.zzB = HttpUrl.FRAGMENT_ENCODE_SET;
        this.zzC = HttpUrl.FRAGMENT_ENCODE_SET;
        this.zzE = l6Var;
        this.zzF = HttpUrl.FRAGMENT_ENCODE_SET;
        this.zzJ = HttpUrl.FRAGMENT_ENCODE_SET;
        this.zzM = HttpUrl.FRAGMENT_ENCODE_SET;
        this.zzN = HttpUrl.FRAGMENT_ENCODE_SET;
        this.zzP = HttpUrl.FRAGMENT_ENCODE_SET;
        this.zzR = n5.B;
        this.zzU = HttpUrl.FRAGMENT_ENCODE_SET;
        this.zzV = HttpUrl.FRAGMENT_ENCODE_SET;
        this.zzY = HttpUrl.FRAGMENT_ENCODE_SET;
        this.zzab = HttpUrl.FRAGMENT_ENCODE_SET;
        this.zzac = l6Var;
        this.zzad = HttpUrl.FRAGMENT_ENCODE_SET;
        this.zzag = HttpUrl.FRAGMENT_ENCODE_SET;
        this.zzai = HttpUrl.FRAGMENT_ENCODE_SET;
        this.zzak = HttpUrl.FRAGMENT_ENCODE_SET;
        this.zzao = HttpUrl.FRAGMENT_ENCODE_SET;
        this.zzar = HttpUrl.FRAGMENT_ENCODE_SET;
    }

    public static j3 U() {
        return (j3) zzat.h();
    }

    public static j3 V(k3 k3Var) {
        l5 h4 = zzat.h();
        h4.f(k3Var);
        return (j3) h4;
    }

    public final long A() {
        return this.zzz;
    }

    public final boolean A0() {
        if ((this.zzd & 131072) != 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void A1(boolean z10) {
        this.zzb |= 131072;
        this.zzx = z10;
    }

    public final boolean B() {
        if ((this.zzb & 1048576) != 0) {
            return true;
        }
        return false;
    }

    public final String B0() {
        return this.zzag;
    }

    public final /* synthetic */ void B1() {
        this.zzb &= -131073;
        this.zzx = false;
    }

    public final int C() {
        return this.zzA;
    }

    public final boolean C0() {
        if ((this.zzd & 262144) != 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void C1(String str) {
        this.zzb |= 262144;
        this.zzy = str;
    }

    public final String D() {
        return this.zzB;
    }

    public final boolean D0() {
        return this.zzah;
    }

    public final /* synthetic */ void D1() {
        this.zzb &= -262145;
        this.zzy = zzat.zzy;
    }

    public final String E() {
        return this.zzC;
    }

    public final boolean E0() {
        if ((this.zzd & 524288) != 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void E1(long j) {
        this.zzb |= 524288;
        this.zzz = j;
    }

    public final boolean F() {
        if ((this.zzb & 8388608) != 0) {
            return true;
        }
        return false;
    }

    public final String F0() {
        return this.zzai;
    }

    public final /* synthetic */ void F1(int i6) {
        this.zzb |= 1048576;
        this.zzA = i6;
    }

    public final boolean G() {
        return this.zzD;
    }

    public final int G0() {
        return this.zzaj;
    }

    public final /* synthetic */ void G1(String str) {
        this.zzb |= 2097152;
        this.zzB = str;
    }

    public final s5 H() {
        return this.zzE;
    }

    public final boolean H0() {
        if ((this.zzd & 4194304) != 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void H1() {
        this.zzb &= -2097153;
        this.zzB = zzat.zzB;
    }

    public final String I() {
        return this.zzF;
    }

    public final s2 I0() {
        s2 s2Var = this.zzal;
        if (s2Var == null) {
            return s2.x();
        }
        return s2Var;
    }

    public final /* synthetic */ void I1(String str) {
        str.getClass();
        this.zzb |= 4194304;
        this.zzC = str;
    }

    public final boolean J() {
        if ((this.zzb & 33554432) != 0) {
            return true;
        }
        return false;
    }

    public final boolean J0() {
        if ((this.zzd & 8388608) != 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void J1() {
        this.zzb |= 8388608;
        this.zzD = false;
    }

    public final int K() {
        return this.zzG;
    }

    public final int K0() {
        return this.zzam;
    }

    public final void K1(ArrayList arrayList) {
        s5 s5Var = this.zzE;
        if (!((w4) s5Var).f2508x) {
            int size = s5Var.size();
            this.zzE = s5Var.i(size + size);
        }
        v4.c(arrayList, this.zzE);
    }

    public final boolean L() {
        if ((this.zzb & 536870912) != 0) {
            return true;
        }
        return false;
    }

    public final boolean L0() {
        if ((this.zzd & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0) {
            return true;
        }
        return false;
    }

    public final void L1() {
        this.zzE = l6.B;
    }

    public final long M() {
        return this.zzK;
    }

    public final p2 M0() {
        p2 p2Var = this.zzan;
        if (p2Var == null) {
            return p2.P();
        }
        return p2Var;
    }

    public final /* synthetic */ void M1(String str) {
        this.zzb |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        this.zzF = str;
    }

    public final boolean N() {
        if ((this.zzb & Integer.MIN_VALUE) != 0) {
            return true;
        }
        return false;
    }

    public final boolean N0() {
        if ((this.zzd & 67108864) != 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void N1(int i6) {
        this.zzb |= 33554432;
        this.zzG = i6;
    }

    public final String O() {
        return this.zzM;
    }

    public final r3 O0() {
        r3 r3Var = this.zzap;
        if (r3Var == null) {
            return r3.r();
        }
        return r3Var;
    }

    public final /* synthetic */ void O1() {
        this.zzb &= -268435457;
        this.zzJ = zzat.zzJ;
    }

    public final boolean P() {
        if ((this.zzb & 1) != 0) {
            return true;
        }
        return false;
    }

    public final int P0() {
        return this.zze;
    }

    public final List P1() {
        return this.zzf;
    }

    public final boolean Q() {
        if ((this.zzd & 134217728) != 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void Q0(long j) {
        this.zzb |= 536870912;
        this.zzK = j;
    }

    public final void Q1() {
        s5 s5Var = this.zzf;
        if (!((w4) s5Var).f2508x) {
            int size = s5Var.size();
            this.zzf = s5Var.i(size + size);
        }
    }

    public final long R() {
        return this.zzaq;
    }

    public final /* synthetic */ void R0(String str) {
        str.getClass();
        this.zzb |= Integer.MIN_VALUE;
        this.zzM = str;
    }

    public final void R1() {
        s5 s5Var = this.zzg;
        if (!((w4) s5Var).f2508x) {
            int size = s5Var.size();
            this.zzg = s5Var.i(size + size);
        }
    }

    public final boolean S() {
        if ((this.zzd & 536870912) != 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void S0() {
        this.zzb &= Integer.MAX_VALUE;
        this.zzM = zzat.zzM;
    }

    public final int S1() {
        return this.zzf.size();
    }

    public final y2 T() {
        y2 y2Var = this.zzas;
        if (y2Var == null) {
            return y2.r();
        }
        return y2Var;
    }

    public final /* synthetic */ void T0(int i6) {
        this.zzd |= 2;
        this.zzO = i6;
    }

    public final c3 T1(int i6) {
        return (c3) this.zzf.get(i6);
    }

    public final void U0(ArrayList arrayList) {
        RandomAccess randomAccess = this.zzR;
        if (!((w4) randomAccess).f2508x) {
            n5 n5Var = (n5) randomAccess;
            int i6 = n5Var.f2363z;
            this.zzR = n5Var.i(i6 + i6);
        }
        v4.c(arrayList, this.zzR);
    }

    public final s5 U1() {
        return this.zzg;
    }

    public final /* synthetic */ void V0(long j) {
        this.zzd |= 16;
        this.zzS = j;
    }

    public final int V1() {
        return this.zzg.size();
    }

    public final /* synthetic */ void W() {
        this.zzb |= 1;
        this.zze = 1;
    }

    public final /* synthetic */ void W0(long j) {
        this.zzd |= 32;
        this.zzT = j;
    }

    public final t3 W1(int i6) {
        return (t3) this.zzg.get(i6);
    }

    public final /* synthetic */ void X(int i6, c3 c3Var) {
        Q1();
        this.zzf.set(i6, c3Var);
    }

    public final /* synthetic */ void X0(String str) {
        this.zzd |= 128;
        this.zzV = str;
    }

    public final boolean X1() {
        if ((this.zzb & 2) != 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void Y(c3 c3Var) {
        Q1();
        this.zzf.add(c3Var);
    }

    public final /* synthetic */ void Y0(String str) {
        str.getClass();
        this.zzd |= 8192;
        this.zzab = str;
    }

    public final long Y1() {
        return this.zzh;
    }

    public final /* synthetic */ void Z(Iterable iterable) {
        Q1();
        v4.c(iterable, this.zzf);
    }

    public final /* synthetic */ void Z0() {
        this.zzd &= -8193;
        this.zzab = zzat.zzab;
    }

    public final boolean Z1() {
        if ((this.zzb & 4) != 0) {
            return true;
        }
        return false;
    }

    public final void a0() {
        this.zzf = l6.B;
    }

    public final void a1(Set set) {
        s5 s5Var = this.zzac;
        if (!((w4) s5Var).f2508x) {
            int size = s5Var.size();
            this.zzac = s5Var.i(size + size);
        }
        v4.c(set, this.zzac);
    }

    public final long a2() {
        return this.zzi;
    }

    public final /* synthetic */ void b0(int i6) {
        Q1();
        this.zzf.remove(i6);
    }

    public final /* synthetic */ void b1(String str) {
        str.getClass();
        this.zzd |= Http2.INITIAL_MAX_FRAME_SIZE;
        this.zzad = str;
    }

    public final boolean b2() {
        if ((this.zzb & 8) != 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void c0(int i6, t3 t3Var) {
        R1();
        this.zzg.set(i6, t3Var);
    }

    public final /* synthetic */ void c1(long j) {
        this.zzd |= 32768;
        this.zzae = j;
    }

    public final long c2() {
        return this.zzj;
    }

    public final /* synthetic */ void d0(t3 t3Var) {
        R1();
        this.zzg.add(t3Var);
    }

    public final /* synthetic */ void d1(boolean z10) {
        this.zzd |= 65536;
        this.zzaf = z10;
    }

    public final boolean d2() {
        if ((this.zzb & 16) != 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void e0(int i6) {
        R1();
        this.zzg.remove(i6);
    }

    public final /* synthetic */ void e1(String str) {
        this.zzd |= 131072;
        this.zzag = str;
    }

    public final long e2() {
        return this.zzk;
    }

    public final /* synthetic */ void f0(long j) {
        this.zzb |= 2;
        this.zzh = j;
    }

    public final /* synthetic */ void f1(boolean z10) {
        this.zzd |= 262144;
        this.zzah = z10;
    }

    public final boolean f2() {
        if ((this.zzb & 32) != 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void g0() {
        this.zzb &= -3;
        this.zzh = 0L;
    }

    public final /* synthetic */ void g1(String str) {
        str.getClass();
        this.zzd |= 524288;
        this.zzai = str;
    }

    public final long g2() {
        return this.zzl;
    }

    public final /* synthetic */ void h0(long j) {
        this.zzb |= 4;
        this.zzi = j;
    }

    public final /* synthetic */ void h1(int i6) {
        this.zzd |= 1048576;
        this.zzaj = i6;
    }

    public final String h2() {
        return this.zzm;
    }

    public final /* synthetic */ void i0(long j) {
        this.zzb |= 8;
        this.zzj = j;
    }

    public final /* synthetic */ void i1(s2 s2Var) {
        this.zzal = s2Var;
        this.zzd |= 4194304;
    }

    public final String i2() {
        return this.zzn;
    }

    public final /* synthetic */ void j0(long j) {
        this.zzb |= 16;
        this.zzk = j;
    }

    public final /* synthetic */ void j1(int i6) {
        this.zzd |= 8388608;
        this.zzam = i6;
    }

    public final String j2() {
        return this.zzo;
    }

    public final /* synthetic */ void k0() {
        this.zzb &= -17;
        this.zzk = 0L;
    }

    public final /* synthetic */ void k1(p2 p2Var) {
        this.zzan = p2Var;
        this.zzd |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
    }

    public final String k2() {
        return this.zzp;
    }

    public final /* synthetic */ void l0(long j) {
        this.zzb |= 32;
        this.zzl = j;
    }

    public final /* synthetic */ void l1(r3 r3Var) {
        this.zzap = r3Var;
        this.zzd |= 67108864;
    }

    public final boolean l2() {
        if ((this.zzb & 1024) != 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void m0() {
        this.zzb &= -33;
        this.zzl = 0L;
    }

    public final /* synthetic */ void m1(long j) {
        this.zzd |= 134217728;
        this.zzaq = j;
    }

    public final int m2() {
        return this.zzq;
    }

    public final /* synthetic */ void n0() {
        this.zzb |= 64;
        this.zzm = "android";
    }

    public final /* synthetic */ void n1() {
        this.zzd |= 268435456;
        this.zzar = HttpUrl.FRAGMENT_ENCODE_SET;
    }

    public final String n2() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.measurement.m5
    public final Object o(int i6) {
        int i10 = i6 - 1;
        if (i10 != 0) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 == 5) {
                            return zzat;
                        }
                        throw null;
                    }
                    return new l5(zzat);
                }
                return new k3();
            }
            return new m6(zzat, "\u0004C\u0000\u0002\u0001VC\u0000\u0005\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5᠌(7ဇ)9ဈ*:ဇ+;ဉ,?ဈ-@\u001aAဈ.Cဂ/Dဇ0Gဈ1Hဇ2Iဈ3Jင4Kဈ5Lဉ6Mင7Oဉ8Pဈ9Qဉ:Rဂ;Sဈ<Vဉ=", new Object[]{"zzb", "zzd", "zze", "zzf", c3.class, "zzg", t3.class, "zzh", "zzi", "zzj", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzk", "zzD", "zzE", u2.class, "zzF", "zzG", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzU", "zzV", "zzW", t1.f2432g, "zzX", "zzY", "zzZ", "zzaa", "zzab", "zzac", "zzad", "zzae", "zzaf", "zzag", "zzah", "zzai", "zzaj", "zzak", "zzal", "zzam", "zzan", "zzao", "zzap", "zzaq", "zzar", "zzas"});
        }
        return (byte) 1;
    }

    public final /* synthetic */ void o0(String str) {
        str.getClass();
        this.zzb |= 128;
        this.zzn = str;
    }

    public final /* synthetic */ void o1(y2 y2Var) {
        this.zzas = y2Var;
        this.zzd |= 536870912;
    }

    public final String p() {
        return this.zzs;
    }

    public final boolean p0() {
        if ((this.zzd & 2) != 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void p1() {
        String str = Build.MODEL;
        str.getClass();
        this.zzb |= 256;
        this.zzo = str;
    }

    public final String q() {
        return this.zzt;
    }

    public final int q0() {
        return this.zzO;
    }

    public final /* synthetic */ void q1() {
        this.zzb &= -257;
        this.zzo = zzat.zzo;
    }

    public final boolean r() {
        if ((this.zzb & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
            return true;
        }
        return false;
    }

    public final boolean r0() {
        if ((this.zzd & 16) != 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void r1(String str) {
        str.getClass();
        this.zzb |= 512;
        this.zzp = str;
    }

    public final long s() {
        return this.zzu;
    }

    public final long s0() {
        return this.zzS;
    }

    public final /* synthetic */ void s1(int i6) {
        this.zzb |= 1024;
        this.zzq = i6;
    }

    public final boolean t() {
        if ((this.zzb & 32768) != 0) {
            return true;
        }
        return false;
    }

    public final boolean t0() {
        if ((this.zzd & 128) != 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void t1(String str) {
        str.getClass();
        this.zzb |= 2048;
        this.zzr = str;
    }

    public final long u() {
        return this.zzv;
    }

    public final String u0() {
        return this.zzV;
    }

    public final /* synthetic */ void u1(String str) {
        str.getClass();
        this.zzb |= CodedOutputStream.DEFAULT_BUFFER_SIZE;
        this.zzs = str;
    }

    public final String v() {
        return this.zzw;
    }

    public final boolean v0() {
        if ((this.zzd & 8192) != 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void v1(String str) {
        str.getClass();
        this.zzb |= 8192;
        this.zzt = str;
    }

    public final boolean w() {
        if ((this.zzb & 131072) != 0) {
            return true;
        }
        return false;
    }

    public final String w0() {
        return this.zzab;
    }

    public final /* synthetic */ void w1(long j) {
        this.zzb |= Http2.INITIAL_MAX_FRAME_SIZE;
        this.zzu = j;
    }

    public final boolean x() {
        return this.zzx;
    }

    public final boolean x0() {
        if ((this.zzd & 32768) != 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void x1() {
        this.zzb |= 32768;
        this.zzv = 130000L;
    }

    public final String y() {
        return this.zzy;
    }

    public final long y0() {
        return this.zzae;
    }

    public final /* synthetic */ void y1(String str) {
        str.getClass();
        this.zzb |= 65536;
        this.zzw = str;
    }

    public final boolean z() {
        if ((this.zzb & 524288) != 0) {
            return true;
        }
        return false;
    }

    public final boolean z0() {
        return this.zzaf;
    }

    public final /* synthetic */ void z1() {
        this.zzb &= -65537;
        this.zzw = zzat.zzw;
    }
}
