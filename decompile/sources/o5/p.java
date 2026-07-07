package o5;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import db.c1;
import gatewayprotocol.v1.HeaderBiddingTokenOuterClass;
import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;
import okhttp3.HttpUrl;
import q2.k1;
import q2.w0;
import r1.e1;
import r1.f1;
import r1.x0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements q, cb.e, u1.g, m3.g, qb.d {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f9981x;

    public /* synthetic */ p(int i6) {
        this.f9981x = i6;
    }

    @Override // o5.q
    public void a(o oVar, r rVar, boolean z10) {
        switch (this.f9981x) {
            case 0:
                oVar.a(rVar);
                return;
            case 1:
                oVar.c();
                return;
            default:
                oVar.f();
                return;
        }
    }

    @Override // u1.g
    public void accept(Object obj) {
        ((w0) obj).f10985b.a();
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [qb.a, java.lang.Object] */
    @Override // cb.e
    public Object apply(Object obj) {
        c1 g10;
        c1 j;
        int i6 = 0;
        switch (this.f9981x) {
            case 3:
                return ((y2.o) obj).d().getClass().getSimpleName();
            case 4:
                return db.k0.k(db.r.w(((q2.a0) obj).q().f10910b, new p(6)));
            case 5:
            case 7:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case HeaderBiddingTokenOuterClass.HeaderBiddingToken.MEDIATION_AD_UNIT_ID_FIELD_NUMBER /* 23 */:
            case 24:
            case 25:
            case 26:
            case 27:
            default:
                k1 k1Var = (k1) obj;
                k1Var.getClass();
                Bundle bundle = new Bundle();
                String str = k1.f10908e;
                c1 c1Var = k1Var.f10910b;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>(c1Var.A);
                db.i0 listIterator = c1Var.listIterator(0);
                while (listIterator.hasNext()) {
                    arrayList.add(((e1) listIterator.next()).c());
                }
                bundle.putParcelableArrayList(str, arrayList);
                return bundle;
            case 6:
                return Integer.valueOf(((e1) obj).f11388c);
            case 8:
                r1.t tVar = (r1.t) obj;
                return tVar.f11694a + ": " + tVar.f11695b;
            case 9:
                x0 x0Var = (x0) obj;
                x0Var.getClass();
                Bundle bundle2 = new Bundle();
                int i10 = x0Var.f11741x;
                if (i10 != 0) {
                    bundle2.putInt(x0.A, i10);
                }
                int i11 = x0Var.f11742y;
                if (i11 != 0) {
                    bundle2.putInt(x0.B, i11);
                }
                int i12 = x0Var.f11743z;
                if (i12 != 0) {
                    bundle2.putInt(x0.C, i12);
                }
                return bundle2;
            case 10:
                r1.d0 d0Var = (r1.d0) obj;
                d0Var.getClass();
                Bundle bundle3 = new Bundle();
                bundle3.putParcelable(r1.d0.f11355h, d0Var.f11361a);
                String str2 = d0Var.f11362b;
                if (str2 != null) {
                    bundle3.putString(r1.d0.f11356i, str2);
                }
                String str3 = d0Var.f11363c;
                if (str3 != null) {
                    bundle3.putString(r1.d0.j, str3);
                }
                int i13 = d0Var.f11364d;
                if (i13 != 0) {
                    bundle3.putInt(r1.d0.f11357k, i13);
                }
                int i14 = d0Var.f11365e;
                if (i14 != 0) {
                    bundle3.putInt(r1.d0.f11358l, i14);
                }
                String str4 = d0Var.f11366f;
                if (str4 != null) {
                    bundle3.putString(r1.d0.f11359m, str4);
                }
                String str5 = d0Var.f11367g;
                if (str5 != null) {
                    bundle3.putString(r1.d0.f11360n, str5);
                }
                return bundle3;
            case 11:
                Bundle bundle4 = (Bundle) obj;
                Uri uri = (Uri) bundle4.getParcelable(r1.d0.f11355h);
                uri.getClass();
                String string = bundle4.getString(r1.d0.f11356i);
                String string2 = bundle4.getString(r1.d0.j);
                int i15 = bundle4.getInt(r1.d0.f11357k, 0);
                int i16 = bundle4.getInt(r1.d0.f11358l, 0);
                String string3 = bundle4.getString(r1.d0.f11359m);
                String string4 = bundle4.getString(r1.d0.f11360n);
                ?? obj2 = new Object();
                obj2.f11149d = uri;
                obj2.f11146a = r1.k0.p(string);
                obj2.f11150e = string2;
                obj2.f11147b = i15;
                obj2.f11148c = i16;
                obj2.f11151f = string3;
                obj2.f11152g = string4;
                return new r1.d0(obj2);
            case 12:
                Bundle bundle5 = (Bundle) obj;
                r1.q qVar = r1.q.Q;
                r1.p pVar = new r1.p();
                if (bundle5 != null) {
                    ClassLoader classLoader = u1.c.class.getClassLoader();
                    String str6 = u1.a0.f12750a;
                    bundle5.setClassLoader(classLoader);
                }
                String string5 = bundle5.getString(r1.q.R);
                String str7 = qVar.f11658a;
                if (string5 == null) {
                    string5 = str7;
                }
                pVar.f11600a = string5;
                String string6 = bundle5.getString(r1.q.S);
                String str8 = qVar.f11659b;
                if (string6 == null) {
                    string6 = str8;
                }
                pVar.f11601b = string6;
                ArrayList parcelableArrayList = bundle5.getParcelableArrayList(r1.q.f11654w0);
                if (parcelableArrayList == null) {
                    g10 = c1.B;
                } else {
                    db.h0 j10 = db.k0.j();
                    for (int i17 = 0; i17 < parcelableArrayList.size(); i17++) {
                        Bundle bundle6 = (Bundle) parcelableArrayList.get(i17);
                        bundle6.getClass();
                        String string7 = bundle6.getString(r1.t.f11692c);
                        String string8 = bundle6.getString(r1.t.f11693d);
                        string8.getClass();
                        j10.a(new r1.t(string7, string8));
                    }
                    g10 = j10.g();
                }
                pVar.f11602c = db.k0.k(g10);
                String string9 = bundle5.getString(r1.q.T);
                String str9 = qVar.f11661d;
                if (string9 == null) {
                    string9 = str9;
                }
                pVar.f11603d = string9;
                pVar.f11604e = bundle5.getInt(r1.q.U, qVar.f11662e);
                pVar.f11605f = bundle5.getInt(r1.q.V, qVar.f11663f);
                pVar.f11606g = bundle5.getInt(r1.q.f11655x0, qVar.f11664g);
                pVar.f11607h = bundle5.getInt(r1.q.W, qVar.f11665h);
                pVar.f11608i = bundle5.getInt(r1.q.X, qVar.f11666i);
                String string10 = bundle5.getString(r1.q.Y);
                String str10 = qVar.f11667k;
                if (string10 == null) {
                    string10 = str10;
                }
                pVar.j = string10;
                String string11 = bundle5.getString(r1.q.Z);
                String str11 = qVar.f11669m;
                if (string11 == null) {
                    string11 = str11;
                }
                pVar.f11610l = r1.k0.p(string11);
                String string12 = bundle5.getString(r1.q.f11633a0);
                String str12 = qVar.f11670n;
                if (string12 == null) {
                    string12 = str12;
                }
                pVar.f11611m = r1.k0.p(string12);
                pVar.f11612n = bundle5.getInt(r1.q.f11634b0, qVar.f11671o);
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    byte[] byteArray = bundle5.getByteArray(r1.q.f11635c0 + "_" + Integer.toString(i6, 36));
                    if (byteArray == null) {
                        pVar.f11614p = arrayList2;
                        pVar.f11615q = (r1.m) bundle5.getParcelable(r1.q.f11636d0);
                        pVar.f11616r = bundle5.getLong(r1.q.f11637e0, qVar.s);
                        pVar.f11617t = bundle5.getInt(r1.q.f11638f0, qVar.f11676u);
                        pVar.f11618u = bundle5.getInt(r1.q.f11639g0, qVar.f11677v);
                        pVar.f11619v = bundle5.getInt(r1.q.f11657z0, qVar.f11678w);
                        pVar.f11620w = bundle5.getInt(r1.q.A0, qVar.f11679x);
                        pVar.f11621x = bundle5.getFloat(r1.q.f11640h0, qVar.f11680y);
                        pVar.f11622y = bundle5.getInt(r1.q.f11641i0, qVar.f11681z);
                        pVar.f11623z = bundle5.getFloat(r1.q.f11642j0, qVar.A);
                        pVar.A = bundle5.getByteArray(r1.q.f11643k0);
                        pVar.B = bundle5.getInt(r1.q.f11644l0, qVar.C);
                        pVar.D = bundle5.getInt(r1.q.f11656y0, qVar.E);
                        Bundle bundle7 = bundle5.getBundle(r1.q.f11645m0);
                        if (bundle7 != null) {
                            pVar.C = new r1.h(bundle7.getInt(r1.h.f11432i, -1), bundle7.getInt(r1.h.j, -1), bundle7.getInt(r1.h.f11433k, -1), bundle7.getByteArray(r1.h.f11434l), bundle7.getInt(r1.h.f11435m, -1), bundle7.getInt(r1.h.f11436n, -1));
                        }
                        pVar.E = bundle5.getInt(r1.q.f11646n0, qVar.F);
                        pVar.F = bundle5.getInt(r1.q.o0, qVar.G);
                        pVar.G = bundle5.getInt(r1.q.f11647p0, qVar.H);
                        pVar.H = bundle5.getInt(r1.q.f11648q0, qVar.I);
                        pVar.I = bundle5.getInt(r1.q.f11649r0, qVar.J);
                        pVar.J = bundle5.getInt(r1.q.f11650s0, qVar.K);
                        pVar.L = bundle5.getInt(r1.q.f11652u0, qVar.M);
                        pVar.M = bundle5.getInt(r1.q.f11653v0, qVar.N);
                        pVar.N = bundle5.getInt(r1.q.f11651t0, qVar.O);
                        return new r1.q(pVar);
                    }
                    arrayList2.add(byteArray);
                    i6++;
                }
            case 13:
                Bundle bundle8 = (Bundle) obj;
                Bundle bundle9 = bundle8.getBundle(f1.f11395c);
                bundle9.getClass();
                ArrayList parcelableArrayList2 = bundle9.getParcelableArrayList(e1.f11384f);
                if (parcelableArrayList2 == null) {
                    db.i0 i0Var = db.k0.f4008y;
                    j = c1.B;
                } else {
                    j = u1.c.j(new p(12), parcelableArrayList2);
                }
                e1 e1Var = new e1(bundle9.getString(e1.f11385g, HttpUrl.FRAGMENT_ENCODE_SET), (r1.q[]) j.toArray(new r1.q[0]));
                int[] intArray = bundle8.getIntArray(f1.f11396d);
                intArray.getClass();
                return new f1(e1Var, a8.f.D(intArray));
            case 14:
                r1.k1 k1Var2 = (r1.k1) obj;
                k1Var2.getClass();
                Bundle bundle10 = new Bundle();
                bundle10.putBundle(r1.k1.f11566f, k1Var2.f11571b.c());
                bundle10.putIntArray(r1.k1.f11567g, k1Var2.f11573d);
                bundle10.putBooleanArray(r1.k1.f11568h, k1Var2.f11574e);
                bundle10.putBoolean(r1.k1.f11569i, k1Var2.f11572c);
                return bundle10;
            case 20:
                return Long.valueOf(((v3.a) obj).f13262b);
            case 21:
                return Long.valueOf(((v3.a) obj).f13263c);
            case HeaderBiddingTokenOuterClass.HeaderBiddingToken.BANNER_SIZE_FIELD_NUMBER /* 22 */:
                return (s3.q) obj;
            case 28:
                return Integer.valueOf(((t1.b) obj).f12474r);
        }
    }

    @Override // qb.d
    public Object d(c6.h hVar) {
        switch (this.f9981x) {
            case 16:
                return (ScheduledExecutorService) ExecutorsRegistrar.f2832a.get();
            case 17:
                return (ScheduledExecutorService) ExecutorsRegistrar.f2834c.get();
            case 18:
                return (ScheduledExecutorService) ExecutorsRegistrar.f2833b.get();
            case 19:
                qb.l lVar = ExecutorsRegistrar.f2832a;
                return rb.k.f11948x;
            case 20:
            case 21:
            case HeaderBiddingTokenOuterClass.HeaderBiddingToken.BANNER_SIZE_FIELD_NUMBER /* 22 */:
            default:
                return TransportRegistrar.a(hVar);
            case HeaderBiddingTokenOuterClass.HeaderBiddingToken.MEDIATION_AD_UNIT_ID_FIELD_NUMBER /* 23 */:
                return TransportRegistrar.c(hVar);
            case 24:
                return TransportRegistrar.b(hVar);
        }
    }

    @Override // m3.g
    public boolean f(int i6, int i10, int i11, int i12, int i13) {
        if (i10 != 67 || i11 != 79 || i12 != 77 || (i13 != 77 && i6 != 2)) {
            if (i10 == 77 && i11 == 76 && i12 == 76) {
                if (i13 == 84 || i6 == 2) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }
}
