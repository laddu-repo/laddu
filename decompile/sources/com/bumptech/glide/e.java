package com.bumptech.glide;

import android.content.Context;
import android.content.res.Configuration;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Typeface;
import android.os.Build;
import ce.p;
import de.s;
import java.lang.reflect.Method;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k8.k4;
import me.x;
import re.q;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2347a = 16;

    public static void a(Throwable th, Throwable th2) {
        de.i.e(th, "<this>");
        de.i.e(th2, "exception");
        if (th != th2) {
            Integer num = xd.a.f14318a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = wd.a.f14026a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static void b(StringBuilder sb2, Object obj, ce.l lVar) {
        if (lVar != null) {
            sb2.append((CharSequence) lVar.a(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb2.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb2.append(((Character) obj).charValue());
        } else {
            sb2.append((CharSequence) obj.toString());
        }
    }

    public static void c(int i, int i10, int i11) {
        if (i < 0 || i10 > i11) {
            StringBuilder sbO = j4.a.o(i, i10, "fromIndex: ", ", toIndex: ", ", size: ");
            sbO.append(i11);
            throw new IndexOutOfBoundsException(sbO.toString());
        }
        if (i > i10) {
            throw new IllegalArgumentException(j4.a.k(i, i10, "fromIndex: ", " > toIndex: "));
        }
    }

    public static ma.b d(String str, String str2) {
        ub.a aVar = new ub.a(str, str2);
        ma.a aVarA = ma.b.a(ub.a.class);
        aVarA.f8530e = 1;
        aVarA.f = new d2.d(aVar);
        return aVarA.b();
    }

    public static int e(String str, int i, int i10, boolean z2) {
        while (i < i10) {
            char cCharAt = str.charAt(i);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!z2)) {
                return i;
            }
            i++;
        }
        return i10;
    }

    public static int f(int i, int i10) {
        RoundingMode roundingMode = RoundingMode.CEILING;
        roundingMode.getClass();
        if (i10 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i11 = i / i10;
        int i12 = i - (i10 * i11);
        if (i12 == 0) {
            return i11;
        }
        int i13 = ((i ^ i10) >> 31) | 1;
        switch (ba.d.f1598a[roundingMode.ordinal()]) {
            case 1:
                fa.b.f(i12 == 0);
                return i11;
            case 2:
                return i11;
            case 3:
                if (i13 >= 0) {
                    return i11;
                }
                break;
            case g1.g.LONG_FIELD_NUMBER /* 4 */:
                break;
            case g1.g.STRING_FIELD_NUMBER /* 5 */:
                if (i13 <= 0) {
                    return i11;
                }
                break;
            case g1.g.STRING_SET_FIELD_NUMBER /* 6 */:
            case g1.g.DOUBLE_FIELD_NUMBER /* 7 */:
            case g1.g.BYTES_FIELD_NUMBER /* 8 */:
                int iAbs = Math.abs(i12);
                int iAbs2 = iAbs - (Math.abs(i10) - iAbs);
                if (iAbs2 == 0) {
                    RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                    RoundingMode roundingMode3 = RoundingMode.HALF_EVEN;
                    return i11;
                }
                if (iAbs2 <= 0) {
                    return i11;
                }
                break;
            default:
                throw new AssertionError();
        }
        return i11 + i13;
    }

    public static ma.b g(String str, d2.e eVar) {
        ma.a aVarA = ma.b.a(ub.a.class);
        aVarA.f8530e = 1;
        aVarA.a(ma.j.a(Context.class));
        aVarA.f = new androidx.fragment.app.e(16, str, eVar);
        return aVarA.b();
    }

    public static x4.c h(k4 k4Var, SQLiteDatabase sQLiteDatabase) {
        de.i.e(k4Var, "refHolder");
        x4.c cVar = (x4.c) k4Var.f7607v;
        if (cVar != null && cVar.f14203v.equals(sQLiteDatabase)) {
            return cVar;
        }
        x4.c cVar2 = new x4.c(sQLiteDatabase);
        k4Var.f7607v = cVar2;
        return cVar2;
    }

    public static boolean i(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    public static boolean j(byte b9) {
        return b9 > -65;
    }

    public static int k(int i) {
        RoundingMode roundingMode = RoundingMode.UNNECESSARY;
        if (i <= 0) {
            throw new IllegalArgumentException(d0.d.i(i, "x (", ") must be > 0"));
        }
        switch (ba.d.f1598a[roundingMode.ordinal()]) {
            case 1:
                fa.b.f((i > 0) & (((i + (-1)) & i) == 0));
                break;
            case 2:
            case 3:
                break;
            case g1.g.LONG_FIELD_NUMBER /* 4 */:
            case g1.g.STRING_FIELD_NUMBER /* 5 */:
                return 32 - Integer.numberOfLeadingZeros(i - 1);
            case g1.g.STRING_SET_FIELD_NUMBER /* 6 */:
            case g1.g.DOUBLE_FIELD_NUMBER /* 7 */:
            case g1.g.BYTES_FIELD_NUMBER /* 8 */:
                int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i);
                return (31 - iNumberOfLeadingZeros) + ((~(~(((-1257966797) >>> iNumberOfLeadingZeros) - i))) >>> 31);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i);
    }

    public static Typeface l(Configuration configuration, Typeface typeface) {
        if (Build.VERSION.SDK_INT < 31 || configuration.fontWeightAdjustment == Integer.MAX_VALUE || configuration.fontWeightAdjustment == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, a.a.e(configuration.fontWeightAdjustment + typeface.getWeight(), 1, 1000), typeface.isItalic());
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long m(int r14, java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.e.m(int, java.lang.String):long");
    }

    public static int n(u3.f fVar, int i, int i10, int i11) {
        w1.a.d(Math.max(Math.max(i, i10), i11) <= 31);
        int i12 = (1 << i) - 1;
        int i13 = (1 << i10) - 1;
        long j8 = ((long) i12) + ((long) i13);
        long j9 = (int) j8;
        if (j8 != j9) {
            throw new ArithmeticException();
        }
        if (j9 + ((long) (1 << i11)) != ((int) r5)) {
            throw new ArithmeticException();
        }
        if (fVar.b() < i) {
            return -1;
        }
        int i14 = fVar.i(i);
        if (i14 == i12) {
            if (fVar.b() < i10) {
                return -1;
            }
            int i15 = fVar.i(i10);
            i14 += i15;
            if (i15 == i13) {
                if (fVar.b() < i11) {
                    return -1;
                }
                return fVar.i(i11) + i14;
            }
        }
        return i14;
    }

    public static final List o(v4.c cVar) {
        int iE = d.e(cVar, "id");
        int iE2 = d.e(cVar, "seq");
        int iE3 = d.e(cVar, "from");
        int iE4 = d.e(cVar, "to");
        qd.c cVarJ = fa.b.j();
        while (cVar.Z()) {
            cVarJ.add(new t4.d((int) cVar.getLong(iE), (int) cVar.getLong(iE2), cVar.n(iE3), cVar.n(iE4)));
        }
        return pd.j.L(fa.b.b(cVarJ));
    }

    public static final t4.g p(v4.a aVar, String str, boolean z2) throws Exception {
        v4.c cVarJ0 = aVar.j0("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int iE = d.e(cVarJ0, "seqno");
            int iE2 = d.e(cVarJ0, "cid");
            int iE3 = d.e(cVarJ0, "name");
            int iE4 = d.e(cVarJ0, "desc");
            if (iE != -1 && iE2 != -1 && iE3 != -1 && iE4 != -1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (cVarJ0.Z()) {
                    if (((int) cVarJ0.getLong(iE2)) >= 0) {
                        int i = (int) cVarJ0.getLong(iE);
                        String strN = cVarJ0.n(iE3);
                        String str2 = cVarJ0.getLong(iE4) > 0 ? "DESC" : "ASC";
                        linkedHashMap.put(Integer.valueOf(i), strN);
                        linkedHashMap2.put(Integer.valueOf(i), str2);
                    }
                }
                List listM = pd.j.M(linkedHashMap.entrySet(), new f0.h(5));
                ArrayList arrayList = new ArrayList(pd.l.C(listM, 10));
                Iterator it = listM.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getValue());
                }
                List listO = pd.j.O(arrayList);
                List listM2 = pd.j.M(linkedHashMap2.entrySet(), new f0.h(6));
                ArrayList arrayList2 = new ArrayList(pd.l.C(listM2, 10));
                Iterator it2 = listM2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((String) ((Map.Entry) it2.next()).getValue());
                }
                t4.g gVar = new t4.g(str, z2, listO, pd.j.O(arrayList2));
                b8.h.h(cVarJ0, null);
                return gVar;
            }
            b8.h.h(cVarJ0, null);
            return null;
        } finally {
        }
    }

    public static final Object q(p pVar) {
        Thread.interrupted();
        return x.o(sd.i.f11797v, new d1.p(pVar, null));
    }

    public static void r(u3.f fVar) {
        fVar.t(3);
        fVar.t(8);
        boolean zH = fVar.h();
        boolean zH2 = fVar.h();
        if (zH) {
            fVar.t(5);
        }
        if (zH2) {
            fVar.t(6);
        }
    }

    public static void s(u3.f fVar) {
        int i;
        int i10 = fVar.i(2);
        if (i10 == 0) {
            fVar.t(6);
            return;
        }
        int iN = n(fVar, 5, 8, 16) + 1;
        if (i10 == 1) {
            fVar.t(iN * 7);
            return;
        }
        if (i10 == 2) {
            boolean zH = fVar.h();
            int i11 = zH ? 1 : 5;
            int i12 = zH ? 7 : 5;
            int i13 = zH ? 8 : 6;
            int i14 = 0;
            while (i14 < iN) {
                if (fVar.h()) {
                    fVar.t(7);
                    i = 0;
                } else {
                    if (fVar.i(2) == 3 && fVar.i(i12) * i11 != 0) {
                        fVar.s();
                    }
                    i = fVar.i(i13) * i11;
                    if (i != 0 && i != 180) {
                        fVar.s();
                    }
                    fVar.s();
                }
                if (i != 0 && i != 180 && fVar.h()) {
                    i14++;
                }
                i14++;
            }
        }
    }

    public static final Object t(q qVar, q qVar2, p pVar) throws Throwable {
        Object pVar2;
        Object objO;
        try {
            s.a(2, pVar);
            pVar2 = pVar.i(qVar2, qVar);
        } catch (Throwable th) {
            pVar2 = new me.p(th, false);
        }
        td.a aVar = td.a.f12544v;
        if (pVar2 == aVar || (objO = qVar.O(pVar2)) == x.f8746e) {
            return aVar;
        }
        if (objO instanceof me.p) {
            throw ((me.p) objO).f8723a;
        }
        return x.q(objO);
    }

    public static final void u(ad.e eVar, ad.e eVar2) {
        de.i.e(eVar, "<this>");
        de.i.e(eVar2, "downloadInfo");
        eVar2.f483v = eVar.f483v;
        eVar2.h(eVar.f484w);
        eVar2.j(eVar.f485x);
        eVar2.g(eVar.f486y);
        eVar2.f487z = eVar.f487z;
        zc.h hVar = eVar.A;
        de.i.e(hVar, "<set-?>");
        eVar2.A = hVar;
        eVar2.B = pd.s.T(eVar.B);
        eVar2.C = eVar.C;
        eVar2.D = eVar.D;
        zc.l lVar = eVar.E;
        de.i.e(lVar, "<set-?>");
        eVar2.E = lVar;
        zc.g gVar = eVar.G;
        de.i.e(gVar, "<set-?>");
        eVar2.G = gVar;
        eVar2.e(eVar.F);
        eVar2.H = eVar.H;
        eVar2.I = eVar.I;
        zc.a aVar = eVar.J;
        de.i.e(aVar, "<set-?>");
        eVar2.J = aVar;
        eVar2.K = eVar.K;
        eVar2.L = eVar.L;
        jd.g gVar2 = eVar.M;
        de.i.e(gVar2, "<set-?>");
        eVar2.M = gVar2;
        eVar2.N = eVar.N;
        eVar2.O = eVar.O;
    }

    public int hashCode() {
        switch (this.f2347a) {
            case 16:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    public String toString() {
        switch (this.f2347a) {
            case 16:
                String strC = de.q.a(getClass()).c();
                de.i.b(strC);
                return strC;
            default:
                return super.toString();
        }
    }
}
