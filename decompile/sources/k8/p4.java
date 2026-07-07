package k8;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.ca;
import com.google.android.gms.internal.measurement.e9;
import com.google.android.gms.internal.measurement.ea;
import com.google.android.gms.internal.measurement.ga;
import com.google.android.gms.internal.measurement.h8;
import com.google.android.gms.internal.measurement.h9;
import com.google.android.gms.internal.measurement.ha;
import com.google.android.gms.internal.measurement.ia;
import com.google.android.gms.internal.measurement.j8;
import com.google.android.gms.internal.measurement.j9;
import com.google.android.gms.internal.measurement.l8;
import com.google.android.gms.internal.measurement.m8;
import com.google.android.gms.internal.measurement.m9;
import com.google.android.gms.internal.measurement.n9;
import com.google.android.gms.internal.measurement.p9;
import com.google.android.gms.internal.measurement.q9;
import com.google.android.gms.internal.measurement.r9;
import com.google.android.gms.internal.measurement.t9;
import com.google.android.gms.internal.measurement.u9;
import com.google.android.gms.internal.measurement.x9;
import com.google.android.gms.internal.measurement.y9;
import com.google.android.gms.internal.measurement.z9;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.security.MessageDigest;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class p4 extends h4 {
    public long A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f7702z;

    public static v H(com.google.android.gms.internal.measurement.b bVar) {
        Object obj;
        Bundle bundleI = I(bVar.f2496c, true);
        String string = (!bundleI.containsKey("_o") || (obj = bundleI.get("_o")) == null) ? "app" : obj.toString();
        String strG = e2.g(bVar.f2494a, e2.f7460a, e2.f);
        if (strG == null) {
            strG = bVar.f2494a;
        }
        return new v(strG, new u(bundleI), string, bVar.f2495b, 0L);
    }

    public static Bundle I(Map map, boolean z2) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z2) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    arrayList2.add(I((Map) arrayList.get(i), false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    public static final void L(q9 q9Var, String str, Long l10) {
        List listH = q9Var.h();
        int i = 0;
        while (true) {
            if (i >= listH.size()) {
                i = -1;
                break;
            } else if (str.equals(((u9) listH.get(i)).v())) {
                break;
            } else {
                i++;
            }
        }
        t9 t9VarG = u9.G();
        t9VarG.h(str);
        t9VarG.j(l10.longValue());
        if (i < 0) {
            q9Var.l(t9VarG);
        } else {
            q9Var.b();
            ((r9) q9Var.f2653w).L(i, (u9) t9VarG.e());
        }
    }

    public static final Bundle M(List list) {
        Bundle bundle = new Bundle();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            u9 u9Var = (u9) it.next();
            String strV = u9Var.v();
            if (u9Var.C()) {
                bundle.putDouble(strV, u9Var.D());
            } else if (u9Var.A()) {
                bundle.putFloat(strV, u9Var.B());
            } else if (u9Var.w()) {
                bundle.putString(strV, u9Var.x());
            } else if (u9Var.y()) {
                bundle.putLong(strV, u9Var.z());
            }
        }
        return bundle;
    }

    public static final u9 N(r9 r9Var, String str) {
        for (u9 u9Var : r9Var.w()) {
            if (u9Var.v().equals(str)) {
                return u9Var;
            }
        }
        return null;
    }

    public static final String O(String str, Map map) {
        if (map == null) {
            return null;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (str.equalsIgnoreCase((String) entry.getKey())) {
                if (entry.getValue() == null || ((List) entry.getValue()).isEmpty()) {
                    return null;
                }
                return (String) ((List) entry.getValue()).get(0);
            }
        }
        return null;
    }

    public static final Serializable P(r9 r9Var, String str) {
        u9 u9VarN = N(r9Var, str);
        if (u9VarN == null) {
            return null;
        }
        return V(u9VarN);
    }

    public static final void S(int i, StringBuilder sb2) {
        for (int i10 = 0; i10 < i; i10++) {
            sb2.append("  ");
        }
    }

    public static final void T(Uri.Builder builder, String str, String str2, HashSet hashSet) {
        if (hashSet.contains(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    public static final String U(boolean z2, boolean z10, boolean z11) {
        StringBuilder sb2 = new StringBuilder();
        if (z2) {
            sb2.append("Dynamic ");
        }
        if (z10) {
            sb2.append("Sequence ");
        }
        if (z11) {
            sb2.append("Session-Scoped ");
        }
        return sb2.toString();
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [android.os.Bundle[], java.io.Serializable] */
    public static final Serializable V(u9 u9Var) {
        if (u9Var.w()) {
            return u9Var.x();
        }
        if (u9Var.y()) {
            return Long.valueOf(u9Var.z());
        }
        if (u9Var.C()) {
            return Double.valueOf(u9Var.D());
        }
        if (u9Var.F() > 0) {
            return q0(u9Var.E());
        }
        return null;
    }

    public static final void W(Uri.Builder builder, String[] strArr, Bundle bundle, HashSet hashSet) {
        for (String str : strArr) {
            String[] strArrSplit = str.split(",");
            String str2 = strArrSplit[0];
            String str3 = strArrSplit[strArrSplit.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                T(builder, str3, string, hashSet);
            }
        }
    }

    public static final void X(StringBuilder sb2, String str, ca caVar) {
        if (caVar == null) {
            return;
        }
        S(3, sb2);
        sb2.append(str);
        sb2.append(" {\n");
        if (caVar.x() != 0) {
            S(4, sb2);
            sb2.append("results: ");
            int i = 0;
            for (Long l10 : caVar.w()) {
                int i10 = i + 1;
                if (i != 0) {
                    sb2.append(", ");
                }
                sb2.append(l10);
                i = i10;
            }
            sb2.append('\n');
        }
        if (caVar.v() != 0) {
            S(4, sb2);
            sb2.append("status: ");
            int i11 = 0;
            for (Long l11 : caVar.u()) {
                int i12 = i11 + 1;
                if (i11 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l11);
                i11 = i12;
            }
            sb2.append('\n');
        }
        if (caVar.z() != 0) {
            S(4, sb2);
            sb2.append("dynamic_filter_timestamps: {");
            int i13 = 0;
            for (p9 p9Var : caVar.y()) {
                int i14 = i13 + 1;
                if (i13 != 0) {
                    sb2.append(", ");
                }
                sb2.append(p9Var.u() ? Integer.valueOf(p9Var.v()) : null);
                sb2.append(":");
                sb2.append(p9Var.w() ? Long.valueOf(p9Var.x()) : null);
                i13 = i14;
            }
            sb2.append("}\n");
        }
        if (caVar.B() != 0) {
            S(4, sb2);
            sb2.append("sequence_filter_timestamps: {");
            int i15 = 0;
            for (ea eaVar : caVar.A()) {
                int i16 = i15 + 1;
                if (i15 != 0) {
                    sb2.append(", ");
                }
                sb2.append(eaVar.u() ? Integer.valueOf(eaVar.v()) : null);
                sb2.append(": [");
                Iterator it = eaVar.w().iterator();
                int i17 = 0;
                while (it.hasNext()) {
                    long jLongValue = ((Long) it.next()).longValue();
                    int i18 = i17 + 1;
                    if (i17 != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(jLongValue);
                    i17 = i18;
                }
                sb2.append("]");
                i15 = i16;
            }
            sb2.append("}\n");
        }
        S(3, sb2);
        sb2.append("}\n");
    }

    public static final void Y(StringBuilder sb2, int i, String str, Object obj) {
        if (obj == null) {
            return;
        }
        S(i + 1, sb2);
        sb2.append(str);
        sb2.append(": ");
        sb2.append(obj);
        sb2.append('\n');
    }

    public static final void Z(StringBuilder sb2, int i, String str, j8 j8Var) {
        if (j8Var == null) {
            return;
        }
        S(i, sb2);
        sb2.append(str);
        sb2.append(" {\n");
        if (j8Var.u()) {
            int iE = j8Var.E();
            Y(sb2, i, "comparison_type", iE != 1 ? iE != 2 ? iE != 3 ? iE != 4 ? "BETWEEN" : "EQUAL" : "GREATER_THAN" : "LESS_THAN" : "UNKNOWN_COMPARISON_TYPE");
        }
        if (j8Var.v()) {
            Y(sb2, i, "match_as_float", Boolean.valueOf(j8Var.w()));
        }
        if (j8Var.x()) {
            Y(sb2, i, "comparison_value", j8Var.y());
        }
        if (j8Var.z()) {
            Y(sb2, i, "min_comparison_value", j8Var.A());
        }
        if (j8Var.B()) {
            Y(sb2, i, "max_comparison_value", j8Var.C());
        }
        S(i, sb2);
        sb2.append("}\n");
    }

    public static boolean h0(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    public static boolean i0(com.google.android.gms.internal.measurement.r1 r1Var, int i) {
        if (i < ((com.google.android.gms.internal.measurement.x1) r1Var).f3220x * 64) {
            return ((1 << (i % 64)) & ((Long) ((com.google.android.gms.internal.measurement.x1) r1Var).get(i / 64)).longValue()) != 0;
        }
        return false;
    }

    public static ArrayList j0(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j8 = 0;
            for (int i10 = 0; i10 < 64; i10++) {
                int i11 = (i * 64) + i10;
                if (i11 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i11)) {
                    j8 |= 1 << i10;
                }
            }
            arrayList.add(Long.valueOf(j8));
        }
        return arrayList;
    }

    public static com.google.android.gms.internal.measurement.g1 o0(com.google.android.gms.internal.measurement.g1 g1Var, byte[] bArr) throws com.google.android.gms.internal.measurement.u1 {
        com.google.android.gms.internal.measurement.a1 a1VarA = com.google.android.gms.internal.measurement.a1.a();
        if (a1VarA != null) {
            g1Var.getClass();
            g1Var.g(bArr, bArr.length, a1VarA);
            return g1Var;
        }
        g1Var.getClass();
        int length = bArr.length;
        int i = com.google.android.gms.internal.measurement.o0.f2941a;
        g1Var.g(bArr, length, com.google.android.gms.internal.measurement.a1.f2468b);
        return g1Var;
    }

    public static int p0(y9 y9Var, String str) {
        for (int i = 0; i < ((z9) y9Var.f2653w).b2(); i++) {
            if (str.equals(((z9) y9Var.f2653w).c2(i).w())) {
                return i;
            }
        }
        return -1;
    }

    public static Bundle[] q0(com.google.android.gms.internal.measurement.s1 s1Var) {
        ArrayList arrayList = new ArrayList();
        Iterator it = s1Var.iterator();
        while (it.hasNext()) {
            u9 u9Var = (u9) it.next();
            if (u9Var != null) {
                Bundle bundle = new Bundle();
                for (u9 u9Var2 : u9Var.E()) {
                    if (u9Var2.w()) {
                        bundle.putString(u9Var2.v(), u9Var2.x());
                    } else if (u9Var2.y()) {
                        bundle.putLong(u9Var2.v(), u9Var2.z());
                    } else if (u9Var2.C()) {
                        bundle.putDouble(u9Var2.v(), u9Var2.D());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public static HashMap r0(Bundle bundle, boolean z2) {
        HashMap map = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            boolean z10 = obj instanceof Parcelable[];
            if (z10 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z2) {
                    ArrayList arrayList = new ArrayList();
                    if (z10) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(r0((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        for (int i = 0; i < size; i++) {
                            Object obj2 = arrayList2.get(i);
                            if (obj2 instanceof Bundle) {
                                arrayList.add(r0((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(r0((Bundle) obj, false));
                    }
                    map.put(str, arrayList);
                }
            } else if (obj != null) {
                map.put(str, obj);
            }
        }
        return map;
    }

    public final void J(Map map) {
        long epochMilli;
        p1 p1Var = (p1) this.f2053w;
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            String strO = O("Date", map);
            if (TextUtils.isEmpty(strO)) {
                return;
            }
            if (i >= 26) {
                try {
                    epochMilli = ZonedDateTime.parse(strO, DateTimeFormatter.RFC_1123_DATE_TIME).toInstant().toEpochMilli();
                } catch (DateTimeParseException unused) {
                    v0 v0Var = p1Var.A;
                    p1.l(v0Var);
                    v0Var.E.b(strO, "Unable to parse header time, time");
                    epochMilli = 0;
                }
            } else {
                epochMilli = 0;
            }
            if (epochMilli > 0) {
                p1Var.F.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                D();
                if (this.A == 0) {
                    this.f7702z = jElapsedRealtime;
                    this.A = epochMilli;
                }
            }
        }
    }

    public final long K(long j8) {
        D();
        long j9 = this.A;
        if (j9 == 0 || j8 == 0) {
            return 0L;
        }
        return (j9 - this.f7702z) + j8;
    }

    public final void Q(StringBuilder sb2, int i, com.google.android.gms.internal.measurement.s1 s1Var) {
        if (s1Var == null) {
            return;
        }
        int i10 = i + 1;
        Iterator it = s1Var.iterator();
        while (it.hasNext()) {
            u9 u9Var = (u9) it.next();
            if (u9Var != null) {
                S(i10, sb2);
                sb2.append("param {\n");
                Y(sb2, i10, "name", u9Var.u() ? ((p1) this.f2053w).E.b(u9Var.v()) : null);
                Y(sb2, i10, "string_value", u9Var.w() ? u9Var.x() : null);
                Y(sb2, i10, "int_value", u9Var.y() ? Long.valueOf(u9Var.z()) : null);
                Y(sb2, i10, "double_value", u9Var.C() ? Double.valueOf(u9Var.D()) : null);
                if (u9Var.F() > 0) {
                    Q(sb2, i10, u9Var.E());
                }
                S(i10, sb2);
                sb2.append("}\n");
            }
        }
    }

    public final void R(StringBuilder sb2, int i, h8 h8Var) {
        String str;
        if (h8Var == null) {
            return;
        }
        S(i, sb2);
        sb2.append("filter {\n");
        if (h8Var.y()) {
            Y(sb2, i, "complement", Boolean.valueOf(h8Var.z()));
        }
        if (h8Var.A()) {
            Y(sb2, i, "param_name", ((p1) this.f2053w).E.b(h8Var.B()));
        }
        if (h8Var.u()) {
            int i10 = i + 1;
            m8 m8VarV = h8Var.v();
            if (m8VarV != null) {
                S(i10, sb2);
                sb2.append("string_filter {\n");
                if (m8VarV.u()) {
                    switch (m8VarV.C()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case g1.g.LONG_FIELD_NUMBER /* 4 */:
                            str = "ENDS_WITH";
                            break;
                        case g1.g.STRING_FIELD_NUMBER /* 5 */:
                            str = "PARTIAL";
                            break;
                        case g1.g.STRING_SET_FIELD_NUMBER /* 6 */:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    Y(sb2, i10, "match_type", str);
                }
                if (m8VarV.v()) {
                    Y(sb2, i10, "expression", m8VarV.w());
                }
                if (m8VarV.x()) {
                    Y(sb2, i10, "case_sensitive", Boolean.valueOf(m8VarV.y()));
                }
                if (m8VarV.A() > 0) {
                    S(i + 2, sb2);
                    sb2.append("expression_list {\n");
                    for (String str2 : m8VarV.z()) {
                        S(i + 3, sb2);
                        sb2.append(str2);
                        sb2.append("\n");
                    }
                    sb2.append("}\n");
                }
                S(i10, sb2);
                sb2.append("}\n");
            }
        }
        if (h8Var.w()) {
            Z(sb2, i + 1, "number_filter", h8Var.x());
        }
        S(i, sb2);
        sb2.append("}\n");
    }

    public final void a0(ha haVar, Object obj) {
        t7.y.g(obj);
        haVar.b();
        ((ia) haVar.f2653w).J();
        haVar.b();
        ((ia) haVar.f2653w).L();
        haVar.b();
        ((ia) haVar.f2653w).N();
        if (obj instanceof String) {
            haVar.b();
            ((ia) haVar.f2653w).I((String) obj);
        } else if (obj instanceof Long) {
            long jLongValue = ((Long) obj).longValue();
            haVar.b();
            ((ia) haVar.f2653w).K(jLongValue);
        } else if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            haVar.b();
            ((ia) haVar.f2653w).M(dDoubleValue);
        } else {
            v0 v0Var = ((p1) this.f2053w).A;
            p1.l(v0Var);
            v0Var.B.b(obj, "Ignoring invalid (type) user attribute value");
        }
    }

    public final void b0(t9 t9Var, Object obj) {
        t9Var.b();
        ((u9) t9Var.f2653w).J();
        t9Var.b();
        ((u9) t9Var.f2653w).L();
        t9Var.b();
        ((u9) t9Var.f2653w).N();
        t9Var.b();
        ((u9) t9Var.f2653w).Q();
        if (obj instanceof String) {
            t9Var.i((String) obj);
            return;
        }
        if (obj instanceof Long) {
            t9Var.j(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            t9Var.b();
            ((u9) t9Var.f2653w).M(dDoubleValue);
            return;
        }
        if (!(obj instanceof Bundle[])) {
            v0 v0Var = ((p1) this.f2053w).A;
            p1.l(v0Var);
            v0Var.B.b(obj, "Ignoring invalid (type) event param value");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                t9 t9VarG = u9.G();
                for (String str : bundle.keySet()) {
                    t9 t9VarG2 = u9.G();
                    t9VarG2.h(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        t9VarG2.j(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        t9VarG2.i((String) obj2);
                    } else if (obj2 instanceof Double) {
                        double dDoubleValue2 = ((Double) obj2).doubleValue();
                        t9VarG2.b();
                        ((u9) t9VarG2.f2653w).M(dDoubleValue2);
                    }
                    t9VarG.b();
                    ((u9) t9VarG.f2653w).O((u9) t9VarG2.e());
                }
                if (((u9) t9VarG.f2653w).F() > 0) {
                    arrayList.add((u9) t9VarG.e());
                }
            }
        }
        t9Var.b();
        ((u9) t9Var.f2653w).P(arrayList);
    }

    public final b4 c0(String str, y9 y9Var, q9 q9Var, String str2) {
        int iIndexOf;
        com.google.android.gms.internal.measurement.t4.a();
        p1 p1Var = (p1) this.f2053w;
        g gVar = p1Var.f7695y;
        if (!gVar.O(str, f0.P0)) {
            return null;
        }
        p1Var.F.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        HashSet hashSet = new HashSet(Arrays.asList(gVar.K(str, f0.f7526u0).split(",")));
        n4 n4Var = this.f7447x;
        j4 j4Var = n4Var.E;
        j1 j1Var = n4Var.f7656v;
        j1 j1Var2 = j4Var.f7447x.f7656v;
        n4.T(j1Var2);
        String strQ = j1Var2.Q(str);
        Uri.Builder builder = new Uri.Builder();
        g gVar2 = ((p1) j4Var.f2053w).f7695y;
        builder.scheme(gVar2.K(str, f0.f7513n0));
        if (TextUtils.isEmpty(strQ)) {
            builder.authority(gVar2.K(str, f0.o0));
        } else {
            String strK = gVar2.K(str, f0.o0);
            StringBuilder sb2 = new StringBuilder(String.valueOf(strQ).length() + 1 + String.valueOf(strK).length());
            sb2.append(strQ);
            sb2.append(".");
            sb2.append(strK);
            builder.authority(sb2.toString());
        }
        builder.path(gVar2.K(str, f0.f7516p0));
        T(builder, "gmp_app_id", ((z9) y9Var.f2653w).J(), hashSet);
        gVar.J();
        T(builder, "gmp_version", String.valueOf(161000L), hashSet);
        String strD = ((z9) y9Var.f2653w).D();
        e0 e0Var = f0.S0;
        if (gVar.O(str, e0Var)) {
            n4.T(j1Var);
            if (j1Var.X(str)) {
                strD = "";
            }
        }
        T(builder, "app_instance_id", strD, hashSet);
        T(builder, "rdid", ((z9) y9Var.f2653w).A(), hashSet);
        T(builder, "bundle_id", y9Var.o(), hashSet);
        String strN = q9Var.n();
        String strG = e2.g(strN, e2.f, e2.f7460a);
        if (true != TextUtils.isEmpty(strG)) {
            strN = strG;
        }
        T(builder, "app_event_name", strN, hashSet);
        T(builder, "app_version", String.valueOf(((z9) y9Var.f2653w).P()), hashSet);
        String strO2 = ((z9) y9Var.f2653w).o2();
        if (gVar.O(str, e0Var)) {
            n4.T(j1Var);
            if (j1Var.W(str) && !TextUtils.isEmpty(strO2) && (iIndexOf = strO2.indexOf(".")) != -1) {
                strO2 = strO2.substring(0, iIndexOf);
            }
        }
        T(builder, "os_version", strO2, hashSet);
        T(builder, "timestamp", String.valueOf(q9Var.p()), hashSet);
        if (((z9) y9Var.f2653w).C()) {
            T(builder, "lat", "1", hashSet);
        }
        T(builder, "privacy_sandbox_version", String.valueOf(((z9) y9Var.f2653w).L0()), hashSet);
        T(builder, "trigger_uri_source", "1", hashSet);
        T(builder, "trigger_uri_timestamp", String.valueOf(jCurrentTimeMillis), hashSet);
        T(builder, "request_uuid", str2, hashSet);
        List<u9> listH = q9Var.h();
        Bundle bundle = new Bundle();
        for (u9 u9Var : listH) {
            String strV = u9Var.v();
            if (u9Var.C()) {
                bundle.putString(strV, String.valueOf(u9Var.D()));
            } else if (u9Var.A()) {
                bundle.putString(strV, String.valueOf(u9Var.B()));
            } else if (u9Var.w()) {
                bundle.putString(strV, u9Var.x());
            } else if (u9Var.y()) {
                bundle.putString(strV, String.valueOf(u9Var.z()));
            }
        }
        W(builder, gVar.K(str, f0.f7524t0).split("\\|"), bundle, hashSet);
        List<ia> listUnmodifiableList = Collections.unmodifiableList(((z9) y9Var.f2653w).a2());
        Bundle bundle2 = new Bundle();
        for (ia iaVar : listUnmodifiableList) {
            String strW = iaVar.w();
            if (iaVar.D()) {
                bundle2.putString(strW, String.valueOf(iaVar.E()));
            } else if (iaVar.B()) {
                bundle2.putString(strW, String.valueOf(iaVar.C()));
            } else if (iaVar.x()) {
                bundle2.putString(strW, iaVar.y());
            } else if (iaVar.z()) {
                bundle2.putString(strW, String.valueOf(iaVar.A()));
            }
        }
        W(builder, gVar.K(str, f0.f7522s0).split("\\|"), bundle2, hashSet);
        T(builder, "dma", true != ((z9) y9Var.f2653w).I0() ? "0" : "1", hashSet);
        if (!((z9) y9Var.f2653w).K0().isEmpty()) {
            T(builder, "dma_cps", ((z9) y9Var.f2653w).K0(), hashSet);
        }
        if (((z9) y9Var.f2653w).Q0()) {
            e9 e9VarR0 = ((z9) y9Var.f2653w).R0();
            if (!e9VarR0.I().isEmpty()) {
                T(builder, "dl_gclid", e9VarR0.I(), hashSet);
            }
            if (!e9VarR0.K().isEmpty()) {
                T(builder, "dl_gbraid", e9VarR0.K(), hashSet);
            }
            if (!e9VarR0.M().isEmpty()) {
                T(builder, "dl_gs", e9VarR0.M(), hashSet);
            }
            if (e9VarR0.O() > 0) {
                T(builder, "dl_ss_ts", String.valueOf(e9VarR0.O()), hashSet);
            }
            if (!e9VarR0.Q().isEmpty()) {
                T(builder, "mr_gclid", e9VarR0.Q(), hashSet);
            }
            if (!e9VarR0.S().isEmpty()) {
                T(builder, "mr_gbraid", e9VarR0.S(), hashSet);
            }
            if (!e9VarR0.U().isEmpty()) {
                T(builder, "mr_gs", e9VarR0.U(), hashSet);
            }
            if (e9VarR0.W() > 0) {
                T(builder, "mr_click_ts", String.valueOf(e9VarR0.W()), hashSet);
            }
        }
        return new b4(1, jCurrentTimeMillis, builder.build().toString());
    }

    public final r9 d0(r rVar) {
        q9 q9VarK = r9.K();
        long j8 = rVar.f;
        q9VarK.b();
        ((r9) q9VarK.f2653w).S(j8);
        long j9 = rVar.f7729e;
        q9VarK.b();
        ((r9) q9VarK.f2653w).u(j9);
        u uVar = rVar.f7730g;
        Objects.requireNonNull(uVar);
        Bundle bundle = uVar.f7778v;
        for (String str : bundle.keySet()) {
            t9 t9VarG = u9.G();
            t9VarG.h(str);
            Object obj = bundle.get(str);
            t7.y.g(obj);
            b0(t9VarG, obj);
            q9VarK.l(t9VarG);
        }
        String str2 = rVar.f7727c;
        if (!TextUtils.isEmpty(str2) && bundle.get("_o") == null) {
            t9 t9VarG2 = u9.G();
            t9VarG2.h("_o");
            t9VarG2.i(str2);
            q9VarK.k((u9) t9VarG2.e());
        }
        return (r9) q9VarK.e();
    }

    public final String e0(x9 x9Var) {
        h9 h9VarN0;
        StringBuilder sbB = y.e.b("\nbatch {\n");
        if (x9Var.z()) {
            Y(sbB, 0, "upload_subdomain", x9Var.A());
        }
        if (x9Var.x()) {
            Y(sbB, 0, "sgtm_join_id", x9Var.y());
        }
        for (z9 z9Var : x9Var.u()) {
            if (z9Var != null) {
                S(1, sbB);
                sbB.append("bundle {\n");
                if (z9Var.U()) {
                    Y(sbB, 1, "protocol_version", Integer.valueOf(z9Var.U0()));
                }
                p1 p1Var = (p1) this.f2053w;
                g gVar = p1Var.f7695y;
                q0 q0Var = p1Var.E;
                if (gVar.O(z9Var.u(), f0.N0) && z9Var.A0()) {
                    Y(sbB, 1, "session_stitching_token", z9Var.B0());
                }
                Y(sbB, 1, "platform", z9Var.n2());
                if (z9Var.w()) {
                    Y(sbB, 1, "gmp_version", Long.valueOf(z9Var.x()));
                }
                if (z9Var.y()) {
                    Y(sbB, 1, "uploading_gmp_version", Long.valueOf(z9Var.z()));
                }
                if (z9Var.w0()) {
                    Y(sbB, 1, "dynamite_version", Long.valueOf(z9Var.x0()));
                }
                if (z9Var.Q()) {
                    Y(sbB, 1, "config_version", Long.valueOf(z9Var.R()));
                }
                Y(sbB, 1, "gmp_app_id", z9Var.J());
                Y(sbB, 1, "app_id", z9Var.u());
                Y(sbB, 1, "app_version", z9Var.v());
                if (z9Var.O()) {
                    Y(sbB, 1, "app_version_major", Integer.valueOf(z9Var.P()));
                }
                Y(sbB, 1, "firebase_instance_id", z9Var.N());
                if (z9Var.E()) {
                    Y(sbB, 1, "dev_cert_hash", Long.valueOf(z9Var.F()));
                }
                Y(sbB, 1, "app_store", z9Var.t2());
                if (z9Var.d2()) {
                    Y(sbB, 1, "upload_timestamp_millis", Long.valueOf(z9Var.e2()));
                }
                if (z9Var.f2()) {
                    Y(sbB, 1, "start_timestamp_millis", Long.valueOf(z9Var.g2()));
                }
                if (z9Var.h2()) {
                    Y(sbB, 1, "end_timestamp_millis", Long.valueOf(z9Var.i2()));
                }
                if (z9Var.j2()) {
                    Y(sbB, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(z9Var.k2()));
                }
                if (z9Var.l2()) {
                    Y(sbB, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(z9Var.m2()));
                }
                Y(sbB, 1, "app_instance_id", z9Var.D());
                Y(sbB, 1, "resettable_device_id", z9Var.A());
                Y(sbB, 1, "ds_id", z9Var.T());
                if (z9Var.B()) {
                    Y(sbB, 1, "limited_ad_tracking", Boolean.valueOf(z9Var.C()));
                }
                Y(sbB, 1, "os_version", z9Var.o2());
                Y(sbB, 1, "device_model", z9Var.p2());
                Y(sbB, 1, "user_default_language", z9Var.q2());
                if (z9Var.r2()) {
                    Y(sbB, 1, "time_zone_offset_minutes", Integer.valueOf(z9Var.s2()));
                }
                if (z9Var.G()) {
                    Y(sbB, 1, "bundle_sequential_index", Integer.valueOf(z9Var.H()));
                }
                if (z9Var.O0()) {
                    Y(sbB, 1, "delivery_index", Integer.valueOf(z9Var.P0()));
                }
                if (z9Var.K()) {
                    Y(sbB, 1, "service_upload", Boolean.valueOf(z9Var.L()));
                }
                Y(sbB, 1, "health_monitor", z9Var.I());
                if (z9Var.u0()) {
                    Y(sbB, 1, "retry_counter", Integer.valueOf(z9Var.v0()));
                }
                if (z9Var.y0()) {
                    Y(sbB, 1, "consent_signals", z9Var.z0());
                }
                if (z9Var.H0()) {
                    Y(sbB, 1, "is_dma_region", Boolean.valueOf(z9Var.I0()));
                }
                if (z9Var.J0()) {
                    Y(sbB, 1, "core_platform_services", z9Var.K0());
                }
                if (z9Var.F0()) {
                    Y(sbB, 1, "consent_diagnostics", z9Var.G0());
                }
                if (z9Var.C0()) {
                    Y(sbB, 1, "target_os_version", Long.valueOf(z9Var.D0()));
                }
                com.google.android.gms.internal.measurement.t4.a();
                if (gVar.O(z9Var.u(), f0.P0)) {
                    Y(sbB, 1, "ad_services_version", Integer.valueOf(z9Var.L0()));
                    if (z9Var.M0() && (h9VarN0 = z9Var.N0()) != null) {
                        S(2, sbB);
                        sbB.append("attribution_eligibility_status {\n");
                        Y(sbB, 2, "eligible", Boolean.valueOf(h9VarN0.u()));
                        Y(sbB, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(h9VarN0.v()));
                        Y(sbB, 2, "pre_r", Boolean.valueOf(h9VarN0.w()));
                        Y(sbB, 2, "r_extensions_too_old", Boolean.valueOf(h9VarN0.x()));
                        Y(sbB, 2, "adservices_extension_too_old", Boolean.valueOf(h9VarN0.y()));
                        Y(sbB, 2, "ad_storage_not_allowed", Boolean.valueOf(h9VarN0.z()));
                        Y(sbB, 2, "measurement_manager_disabled", Boolean.valueOf(h9VarN0.A()));
                        S(2, sbB);
                        sbB.append("}\n");
                    }
                }
                if (z9Var.Q0()) {
                    e9 e9VarR0 = z9Var.R0();
                    S(2, sbB);
                    sbB.append("ad_campaign_info {\n");
                    if (e9VarR0.H()) {
                        Y(sbB, 2, "deep_link_gclid", e9VarR0.I());
                    }
                    if (e9VarR0.J()) {
                        Y(sbB, 2, "deep_link_gbraid", e9VarR0.K());
                    }
                    if (e9VarR0.L()) {
                        Y(sbB, 2, "deep_link_gad_source", e9VarR0.M());
                    }
                    if (e9VarR0.X()) {
                        Y(sbB, 2, "deep_link_url", e9VarR0.Y());
                    }
                    if (e9VarR0.N()) {
                        Y(sbB, 2, "deep_link_session_millis", Long.valueOf(e9VarR0.O()));
                    }
                    if (e9VarR0.P()) {
                        Y(sbB, 2, "market_referrer_gclid", e9VarR0.Q());
                    }
                    if (e9VarR0.R()) {
                        Y(sbB, 2, "market_referrer_gbraid", e9VarR0.S());
                    }
                    if (e9VarR0.T()) {
                        Y(sbB, 2, "market_referrer_gad_source", e9VarR0.U());
                    }
                    if (e9VarR0.V()) {
                        Y(sbB, 2, "market_referrer_click_millis", Long.valueOf(e9VarR0.W()));
                    }
                    S(2, sbB);
                    sbB.append("}\n");
                }
                if (z9Var.V()) {
                    Y(sbB, 1, "batching_timestamp_millis", Long.valueOf(z9Var.W()));
                }
                if (z9Var.S0()) {
                    ga gaVarT0 = z9Var.T0();
                    S(2, sbB);
                    sbB.append("sgtm_diagnostics {\n");
                    int iY = gaVarT0.y();
                    Y(sbB, 2, "upload_type", iY != 1 ? iY != 2 ? iY != 3 ? iY != 4 ? "SDK_SERVICE_UPLOAD" : "PACKAGE_SERVICE_UPLOAD" : "SDK_CLIENT_UPLOAD" : "GA_UPLOAD" : "UPLOAD_TYPE_UNKNOWN");
                    Y(sbB, 2, "client_upload_eligibility", j4.a.v(gaVarT0.u()));
                    int iZ = gaVarT0.z();
                    Y(sbB, 2, "service_upload_eligibility", iZ != 1 ? iZ != 2 ? iZ != 3 ? iZ != 4 ? iZ != 5 ? "NON_PLAY_MISSING_SGTM_SERVER_URL" : "MISSING_SGTM_PROXY_INFO" : "MISSING_SGTM_SETTINGS" : "NOT_IN_ROLLOUT" : "SERVICE_UPLOAD_ELIGIBLE" : "SERVICE_UPLOAD_ELIGIBILITY_UNKNOWN");
                    S(2, sbB);
                    sbB.append("}\n");
                }
                if (z9Var.X()) {
                    n9 n9VarY = z9Var.Y();
                    S(2, sbB);
                    sbB.append("consent_info_extra {\n");
                    for (m9 m9Var : n9VarY.u()) {
                        S(3, sbB);
                        sbB.append("limited_data_modes {\n");
                        int iV = m9Var.v();
                        Y(sbB, 3, "type", iV != 1 ? iV != 2 ? iV != 3 ? iV != 4 ? "AD_PERSONALIZATION" : "AD_USER_DATA" : "ANALYTICS_STORAGE" : "AD_STORAGE" : "CONSENT_TYPE_UNSPECIFIED");
                        int iW = m9Var.w();
                        Y(sbB, 3, "mode", iW != 1 ? iW != 2 ? "NO_DATA_MODE" : "LIMITED_MODE" : "NOT_LIMITED");
                        S(3, sbB);
                        sbB.append("}\n");
                    }
                    S(2, sbB);
                    sbB.append("}\n");
                }
                com.google.android.gms.internal.measurement.s1<ia> s1VarA2 = z9Var.a2();
                if (s1VarA2 != null) {
                    for (ia iaVar : s1VarA2) {
                        if (iaVar != null) {
                            S(2, sbB);
                            sbB.append("user_property {\n");
                            Y(sbB, 2, "set_timestamp_millis", iaVar.u() ? Long.valueOf(iaVar.v()) : null);
                            Y(sbB, 2, "name", q0Var.c(iaVar.w()));
                            Y(sbB, 2, "string_value", iaVar.y());
                            Y(sbB, 2, "int_value", iaVar.z() ? Long.valueOf(iaVar.A()) : null);
                            Y(sbB, 2, "double_value", iaVar.D() ? Double.valueOf(iaVar.E()) : null);
                            S(2, sbB);
                            sbB.append("}\n");
                        }
                    }
                }
                com.google.android.gms.internal.measurement.s1<j9> s1VarM = z9Var.M();
                if (s1VarM != null) {
                    for (j9 j9Var : s1VarM) {
                        if (j9Var != null) {
                            S(2, sbB);
                            sbB.append("audience_membership {\n");
                            if (j9Var.u()) {
                                Y(sbB, 2, "audience_id", Integer.valueOf(j9Var.v()));
                            }
                            if (j9Var.z()) {
                                Y(sbB, 2, "new_audience", Boolean.valueOf(j9Var.A()));
                            }
                            X(sbB, "current_data", j9Var.w());
                            if (j9Var.x()) {
                                X(sbB, "previous_data", j9Var.y());
                            }
                            S(2, sbB);
                            sbB.append("}\n");
                        }
                    }
                }
                List<r9> listU1 = z9Var.U1();
                if (listU1 != null) {
                    for (r9 r9Var : listU1) {
                        if (r9Var != null) {
                            S(2, sbB);
                            sbB.append("event {\n");
                            Y(sbB, 2, "name", q0Var.a(r9Var.z()));
                            if (r9Var.A()) {
                                Y(sbB, 2, "timestamp_millis", Long.valueOf(r9Var.B()));
                            }
                            if (gVar.O(null, f0.f7493f1) && r9Var.G()) {
                                Y(sbB, 2, "corrected_timestamp_millis", Long.valueOf(r9Var.H()));
                            }
                            if (r9Var.C()) {
                                Y(sbB, 2, "previous_timestamp_millis", Long.valueOf(r9Var.D()));
                            }
                            if (r9Var.E()) {
                                Y(sbB, 2, "count", Integer.valueOf(r9Var.F()));
                            }
                            if (r9Var.x() != 0) {
                                Q(sbB, 2, (com.google.android.gms.internal.measurement.s1) r9Var.w());
                            }
                            S(2, sbB);
                            sbB.append("}\n");
                        }
                    }
                }
                S(1, sbB);
                sbB.append("}\n");
            }
        }
        sbB.append("} // End-of-batch\n");
        return sbB.toString();
    }

    public final String f0(l8 l8Var) {
        StringBuilder sbB = y.e.b("\nproperty_filter {\n");
        if (l8Var.u()) {
            Y(sbB, 0, "filter_id", Integer.valueOf(l8Var.v()));
        }
        Y(sbB, 0, "property_name", ((p1) this.f2053w).E.c(l8Var.w()));
        String strU = U(l8Var.y(), l8Var.z(), l8Var.B());
        if (!strU.isEmpty()) {
            Y(sbB, 0, "filter_type", strU);
        }
        R(sbB, 1, l8Var.x());
        sbB.append("}\n");
        return sbB.toString();
    }

    public final Parcelable g0(byte[] bArr, Parcelable.Creator creator) {
        Parcelable parcelable = null;
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                parcelObtain.unmarshall(bArr, 0, bArr.length);
                parcelObtain.setDataPosition(0);
                parcelable = (Parcelable) creator.createFromParcel(parcelObtain);
            } catch (u7.b unused) {
                v0 v0Var = ((p1) this.f2053w).A;
                p1.l(v0Var);
                v0Var.B.a("Failed to load parcelable from buffer");
            }
            return parcelable;
        } finally {
            parcelObtain.recycle();
        }
    }

    public final List k0(com.google.android.gms.internal.measurement.r1 r1Var, List list) {
        int i;
        p1 p1Var = (p1) this.f2053w;
        ArrayList arrayList = new ArrayList(r1Var);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                v0 v0Var = p1Var.A;
                p1.l(v0Var);
                v0Var.E.b(num, "Ignoring negative bit index to be cleared");
            } else {
                int iIntValue = num.intValue() / 64;
                if (iIntValue >= arrayList.size()) {
                    v0 v0Var2 = p1Var.A;
                    p1.l(v0Var2);
                    v0Var2.E.c(num, Integer.valueOf(arrayList.size()), "Ignoring bit index greater than bitSet size");
                } else {
                    arrayList.set(iIntValue, Long.valueOf(((Long) arrayList.get(iIntValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i10 = size2;
            i = size;
            size = i10;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i);
    }

    public final boolean l0(long j8, long j9) {
        if (j8 == 0 || j9 <= 0) {
            return true;
        }
        ((p1) this.f2053w).F.getClass();
        return Math.abs(System.currentTimeMillis() - j8) > j9;
    }

    public final long m0(byte[] bArr) {
        t7.y.g(bArr);
        p1 p1Var = (p1) this.f2053w;
        t4 t4Var = p1Var.D;
        p1.j(t4Var);
        t4Var.D();
        MessageDigest messageDigestW = t4.W();
        if (messageDigestW != null) {
            return t4.X(messageDigestW.digest(bArr));
        }
        v0 v0Var = p1Var.A;
        p1.l(v0Var);
        v0Var.B.a("Failed to get MD5");
        return 0L;
    }

    public final byte[] n0(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e7) {
            v0 v0Var = ((p1) this.f2053w).A;
            p1.l(v0Var);
            v0Var.B.b(e7, "Failed to gzip content");
            throw e7;
        }
    }

    @Override // k8.h4
    public final void G() {
    }
}
