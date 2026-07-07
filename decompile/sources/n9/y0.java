package n9;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.f5;
import com.google.android.gms.internal.measurement.j5;
import com.google.android.gms.internal.measurement.k6;
import com.google.android.gms.internal.measurement.l5;
import com.google.android.gms.internal.measurement.r5;
import com.google.android.gms.internal.measurement.s5;
import com.google.android.gms.internal.measurement.t8;
import com.google.android.gms.internal.measurement.y5;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.UnityAdsConstants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.zip.GZIPOutputStream;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class y0 extends z3 {
    public final /* synthetic */ int B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0(e4 e4Var, int i6) {
        super(e4Var);
        this.B = i6;
    }

    public static boolean J1(String str) {
        if (str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310) {
            return true;
        }
        return false;
    }

    public static boolean K1(r5 r5Var, int i6) {
        if (i6 < ((y5) r5Var).f2531z * 64) {
            if (((1 << (i6 % 64)) & ((Long) ((y5) r5Var).get(i6 / 64)).longValue()) != 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static ArrayList L1(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i6 = 0; i6 < length; i6++) {
            long j = 0;
            for (int i10 = 0; i10 < 64; i10++) {
                int i11 = (i6 * 64) + i10;
                if (i11 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i11)) {
                    j |= 1 << i10;
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    public static l5 Q1(l5 l5Var, byte[] bArr) {
        f5 f5Var;
        f5 f5Var2 = f5.f2207a;
        if (f5Var2 == null) {
            synchronized (f5.class) {
                try {
                    f5Var = f5.f2207a;
                    if (f5Var == null) {
                        k6 k6Var = k6.f2322c;
                        f5Var = j5.w();
                        f5.f2207a = f5Var;
                    }
                } finally {
                }
            }
            f5Var2 = f5Var;
        }
        if (f5Var2 != null) {
            l5Var.getClass();
            l5Var.g(bArr, bArr.length, f5Var2);
            return l5Var;
        }
        l5Var.getClass();
        int length = bArr.length;
        f5 f5Var3 = f5.f2207a;
        k6 k6Var2 = k6.f2322c;
        l5Var.g(bArr, length, f5.f2208b);
        return l5Var;
    }

    public static int R1(com.google.android.gms.internal.measurement.j3 j3Var, String str) {
        for (int i6 = 0; i6 < ((com.google.android.gms.internal.measurement.k3) j3Var.f2337y).V1(); i6++) {
            if (str.equals(((com.google.android.gms.internal.measurement.k3) j3Var.f2337y).W1(i6).r())) {
                return i6;
            }
        }
        return -1;
    }

    public static Bundle[] S1(s5 s5Var) {
        ArrayList arrayList = new ArrayList();
        Iterator it = s5Var.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.f3 f3Var = (com.google.android.gms.internal.measurement.f3) it.next();
            if (f3Var != null) {
                Bundle bundle = new Bundle();
                for (com.google.android.gms.internal.measurement.f3 f3Var2 : f3Var.z()) {
                    if (f3Var2.r()) {
                        bundle.putString(f3Var2.q(), f3Var2.s());
                    } else if (f3Var2.t()) {
                        bundle.putLong(f3Var2.q(), f3Var2.u());
                    } else if (f3Var2.x()) {
                        bundle.putDouble(f3Var2.q(), f3Var2.y());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        r5 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if (r4 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        r3 = (android.os.Parcelable[]) r3;
        r4 = r3.length;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        if (r7 >= r4) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        r8 = r3[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if ((r8 instanceof android.os.Bundle) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        r5.add(T1((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0080, code lost:
    
        r0.put(r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0054, code lost:
    
        if ((r3 instanceof java.util.ArrayList) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0056, code lost:
    
        r3 = (java.util.ArrayList) r3;
        r4 = r3.size();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005d, code lost:
    
        if (r7 >= r4) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005f, code lost:
    
        r8 = r3.get(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0065, code lost:
    
        if ((r8 instanceof android.os.Bundle) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0067, code lost:
    
        r5.add(T1((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0070, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0075, code lost:
    
        if ((r3 instanceof android.os.Bundle) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0077, code lost:
    
        r5.add(T1((android.os.Bundle) r3, false));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.HashMap T1(android.os.Bundle r10, boolean r11) {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Set r1 = r10.keySet()
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L84
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r10.get(r2)
            boolean r4 = r3 instanceof android.os.Parcelable[]
            if (r4 != 0) goto L30
            boolean r5 = r3 instanceof java.util.ArrayList
            if (r5 != 0) goto L30
            boolean r5 = r3 instanceof android.os.Bundle
            if (r5 == 0) goto L2a
            goto L30
        L2a:
            if (r3 == 0) goto Ld
            r0.put(r2, r3)
            goto Ld
        L30:
            if (r11 == 0) goto Ld
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r6 = 0
            if (r4 == 0) goto L52
            android.os.Parcelable[] r3 = (android.os.Parcelable[]) r3
            int r4 = r3.length
            r7 = 0
        L3e:
            if (r7 >= r4) goto L80
            r8 = r3[r7]
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L4f
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.HashMap r8 = T1(r8, r6)
            r5.add(r8)
        L4f:
            int r7 = r7 + 1
            goto L3e
        L52:
            boolean r4 = r3 instanceof java.util.ArrayList
            if (r4 == 0) goto L73
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r4 = r3.size()
            r7 = 0
        L5d:
            if (r7 >= r4) goto L80
            java.lang.Object r8 = r3.get(r7)
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L70
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.HashMap r8 = T1(r8, r6)
            r5.add(r8)
        L70:
            int r7 = r7 + 1
            goto L5d
        L73:
            boolean r4 = r3 instanceof android.os.Bundle
            if (r4 == 0) goto L80
            android.os.Bundle r3 = (android.os.Bundle) r3
            java.util.HashMap r3 = T1(r3, r6)
            r5.add(r3)
        L80:
            r0.put(r2, r5)
            goto Ld
        L84:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.y0.T1(android.os.Bundle, boolean):java.util.HashMap");
    }

    public static v h1(com.google.android.gms.internal.measurement.b bVar) {
        String str;
        Object obj;
        Bundle i12 = i1(bVar.f2153c, true);
        if (i12.containsKey("_o") && (obj = i12.get("_o")) != null) {
            str = obj.toString();
        } else {
            str = "app";
        }
        String str2 = str;
        String g10 = a2.g(bVar.f2151a, a2.f9157a, a2.f9159c);
        if (g10 == null) {
            g10 = bVar.f2151a;
        }
        return new v(g10, new u(i12), str2, bVar.f2152b);
    }

    public static Bundle i1(Map map, boolean z10) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (obj instanceof ArrayList) {
                if (z10) {
                    ArrayList arrayList = (ArrayList) obj;
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    for (int i6 = 0; i6 < size; i6++) {
                        arrayList2.add(i1((Map) arrayList.get(i6), false));
                    }
                    bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
                }
            } else {
                bundle.putString(str, obj.toString());
            }
        }
        return bundle;
    }

    public static final void j1(com.google.android.gms.internal.measurement.b3 b3Var, String str, Long l10) {
        List h4 = b3Var.h();
        int i6 = 0;
        while (true) {
            if (i6 < h4.size()) {
                if (str.equals(((com.google.android.gms.internal.measurement.f3) h4.get(i6)).q())) {
                    break;
                } else {
                    i6++;
                }
            } else {
                i6 = -1;
                break;
            }
        }
        com.google.android.gms.internal.measurement.e3 B = com.google.android.gms.internal.measurement.f3.B();
        B.h(str);
        B.j(l10.longValue());
        if (i6 >= 0) {
            b3Var.b();
            ((com.google.android.gms.internal.measurement.c3) b3Var.f2337y).A(i6, (com.google.android.gms.internal.measurement.f3) B.e());
        } else {
            b3Var.k(B);
        }
    }

    public static final Bundle k1(List list) {
        Bundle bundle = new Bundle();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.f3 f3Var = (com.google.android.gms.internal.measurement.f3) it.next();
            String q9 = f3Var.q();
            if (f3Var.x()) {
                bundle.putDouble(q9, f3Var.y());
            } else if (f3Var.v()) {
                bundle.putFloat(q9, f3Var.w());
            } else if (f3Var.r()) {
                bundle.putString(q9, f3Var.s());
            } else if (f3Var.t()) {
                bundle.putLong(q9, f3Var.u());
            }
        }
        return bundle;
    }

    public static final com.google.android.gms.internal.measurement.f3 l1(com.google.android.gms.internal.measurement.c3 c3Var, String str) {
        for (com.google.android.gms.internal.measurement.f3 f3Var : c3Var.p()) {
            if (f3Var.q().equals(str)) {
                return f3Var;
            }
        }
        return null;
    }

    public static final Serializable m1(com.google.android.gms.internal.measurement.c3 c3Var, String str) {
        com.google.android.gms.internal.measurement.f3 l12 = l1(c3Var, str);
        if (l12 == null) {
            return null;
        }
        return s1(l12);
    }

    public static final void p1(StringBuilder sb2, int i6) {
        for (int i10 = 0; i10 < i6; i10++) {
            sb2.append("  ");
        }
    }

    public static final void q1(Uri.Builder builder, String str, String str2, Set set) {
        if (!set.contains(str) && !TextUtils.isEmpty(str2)) {
            builder.appendQueryParameter(str, str2);
        }
    }

    public static final String r1(boolean z10, boolean z11, boolean z12) {
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            sb2.append("Dynamic ");
        }
        if (z11) {
            sb2.append("Sequence ");
        }
        if (z12) {
            sb2.append("Session-Scoped ");
        }
        return sb2.toString();
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [android.os.Bundle[], java.io.Serializable] */
    public static final Serializable s1(com.google.android.gms.internal.measurement.f3 f3Var) {
        if (f3Var.r()) {
            return f3Var.s();
        }
        if (f3Var.t()) {
            return Long.valueOf(f3Var.u());
        }
        if (f3Var.x()) {
            return Double.valueOf(f3Var.y());
        }
        if (f3Var.A() > 0) {
            return S1((s5) f3Var.z());
        }
        return null;
    }

    public static final void t1(Uri.Builder builder, String[] strArr, Bundle bundle, Set set) {
        for (String str : strArr) {
            String[] split = str.split(",");
            String str2 = split[0];
            String str3 = split[split.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                q1(builder, str3, string, set);
            }
        }
    }

    public static final void u1(StringBuilder sb2, String str, com.google.android.gms.internal.measurement.n3 n3Var) {
        Integer num;
        Integer num2;
        Long l10;
        if (n3Var == null) {
            return;
        }
        p1(sb2, 3);
        sb2.append(str);
        sb2.append(" {\n");
        if (n3Var.s() != 0) {
            p1(sb2, 4);
            sb2.append("results: ");
            int i6 = 0;
            for (Long l11 : n3Var.r()) {
                int i10 = i6 + 1;
                if (i6 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l11);
                i6 = i10;
            }
            sb2.append('\n');
        }
        if (n3Var.q() != 0) {
            p1(sb2, 4);
            sb2.append("status: ");
            int i11 = 0;
            for (Long l12 : n3Var.p()) {
                int i12 = i11 + 1;
                if (i11 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l12);
                i11 = i12;
            }
            sb2.append('\n');
        }
        if (n3Var.u() != 0) {
            p1(sb2, 4);
            sb2.append("dynamic_filter_timestamps: {");
            int i13 = 0;
            for (com.google.android.gms.internal.measurement.a3 a3Var : n3Var.t()) {
                int i14 = i13 + 1;
                if (i13 != 0) {
                    sb2.append(", ");
                }
                if (a3Var.p()) {
                    num2 = Integer.valueOf(a3Var.q());
                } else {
                    num2 = null;
                }
                sb2.append(num2);
                sb2.append(":");
                if (a3Var.r()) {
                    l10 = Long.valueOf(a3Var.s());
                } else {
                    l10 = null;
                }
                sb2.append(l10);
                i13 = i14;
            }
            sb2.append("}\n");
        }
        if (n3Var.w() != 0) {
            p1(sb2, 4);
            sb2.append("sequence_filter_timestamps: {");
            int i15 = 0;
            for (com.google.android.gms.internal.measurement.p3 p3Var : n3Var.v()) {
                int i16 = i15 + 1;
                if (i15 != 0) {
                    sb2.append(", ");
                }
                if (p3Var.p()) {
                    num = Integer.valueOf(p3Var.q());
                } else {
                    num = null;
                }
                sb2.append(num);
                sb2.append(": [");
                Iterator it = p3Var.r().iterator();
                int i17 = 0;
                while (it.hasNext()) {
                    long longValue = ((Long) it.next()).longValue();
                    int i18 = i17 + 1;
                    if (i17 != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(longValue);
                    i17 = i18;
                }
                sb2.append("]");
                i15 = i16;
            }
            sb2.append("}\n");
        }
        p1(sb2, 3);
        sb2.append("}\n");
    }

    public static final void v1(StringBuilder sb2, int i6, String str, Object obj) {
        if (obj == null) {
            return;
        }
        p1(sb2, i6 + 1);
        sb2.append(str);
        sb2.append(": ");
        sb2.append(obj);
        sb2.append('\n');
    }

    public static final void w1(StringBuilder sb2, int i6, String str, com.google.android.gms.internal.measurement.u1 u1Var) {
        String str2;
        if (u1Var == null) {
            return;
        }
        p1(sb2, i6);
        sb2.append(str);
        sb2.append(" {\n");
        if (u1Var.p()) {
            int z10 = u1Var.z();
            if (z10 != 1) {
                if (z10 != 2) {
                    if (z10 != 3) {
                        if (z10 != 4) {
                            str2 = "BETWEEN";
                        } else {
                            str2 = "EQUAL";
                        }
                    } else {
                        str2 = "GREATER_THAN";
                    }
                } else {
                    str2 = "LESS_THAN";
                }
            } else {
                str2 = "UNKNOWN_COMPARISON_TYPE";
            }
            v1(sb2, i6, "comparison_type", str2);
        }
        if (u1Var.q()) {
            v1(sb2, i6, "match_as_float", Boolean.valueOf(u1Var.r()));
        }
        if (u1Var.s()) {
            v1(sb2, i6, "comparison_value", u1Var.t());
        }
        if (u1Var.u()) {
            v1(sb2, i6, "min_comparison_value", u1Var.v());
        }
        if (u1Var.w()) {
            v1(sb2, i6, "max_comparison_value", u1Var.x());
        }
        p1(sb2, i6);
        sb2.append("}\n");
    }

    public void B1(com.google.android.gms.internal.measurement.s3 s3Var, Object obj) {
        w8.x.g(obj);
        s3Var.b();
        ((com.google.android.gms.internal.measurement.t3) s3Var.f2337y).E();
        s3Var.b();
        ((com.google.android.gms.internal.measurement.t3) s3Var.f2337y).G();
        s3Var.b();
        ((com.google.android.gms.internal.measurement.t3) s3Var.f2337y).I();
        if (obj instanceof String) {
            s3Var.b();
            ((com.google.android.gms.internal.measurement.t3) s3Var.f2337y).D((String) obj);
        } else if (obj instanceof Long) {
            long longValue = ((Long) obj).longValue();
            s3Var.b();
            ((com.google.android.gms.internal.measurement.t3) s3Var.f2337y).F(longValue);
        } else if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            s3Var.b();
            ((com.google.android.gms.internal.measurement.t3) s3Var.f2337y).H(doubleValue);
        } else {
            u0 u0Var = ((n1) this.f4301y).C;
            n1.g(u0Var);
            u0Var.D.b(obj, "Ignoring invalid (type) user attribute value");
        }
    }

    public void C1(String str, a4 a4Var, com.google.android.gms.internal.measurement.i3 i3Var, w0 w0Var) {
        String str2;
        String str3 = a4Var.f9169a;
        n1 n1Var = (n1) this.f4301y;
        d1();
        e1();
        try {
            URL url = new URI(str3).toURL();
            this.f9511z.g0();
            byte[] a10 = i3Var.a();
            l1 l1Var = n1Var.D;
            n1.g(l1Var);
            Map map = a4Var.f9170b;
            if (map == null) {
                map = Collections.EMPTY_MAP;
            }
            str2 = str;
            try {
                l1Var.p1(new x0(this, str2, url, a10, map, w0Var));
            } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
                u0 u0Var = n1Var.C;
                n1.g(u0Var);
                u0Var.D.c(u0.l1(str2), str3, "Failed to parse URL. Not uploading MeasurementBatch. appId");
            }
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused2) {
            str2 = str;
        }
    }

    public void D1(com.google.android.gms.internal.measurement.e3 e3Var, Object obj) {
        e3Var.b();
        ((com.google.android.gms.internal.measurement.f3) e3Var.f2337y).E();
        e3Var.b();
        ((com.google.android.gms.internal.measurement.f3) e3Var.f2337y).G();
        e3Var.b();
        ((com.google.android.gms.internal.measurement.f3) e3Var.f2337y).I();
        e3Var.b();
        ((com.google.android.gms.internal.measurement.f3) e3Var.f2337y).L();
        if (obj instanceof String) {
            e3Var.i((String) obj);
            return;
        }
        if (obj instanceof Long) {
            e3Var.j(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            e3Var.b();
            ((com.google.android.gms.internal.measurement.f3) e3Var.f2337y).H(doubleValue);
            return;
        }
        if (obj instanceof Bundle[]) {
            ArrayList arrayList = new ArrayList();
            for (Bundle bundle : (Bundle[]) obj) {
                if (bundle != null) {
                    com.google.android.gms.internal.measurement.e3 B = com.google.android.gms.internal.measurement.f3.B();
                    for (String str : bundle.keySet()) {
                        com.google.android.gms.internal.measurement.e3 B2 = com.google.android.gms.internal.measurement.f3.B();
                        B2.h(str);
                        Object obj2 = bundle.get(str);
                        if (obj2 instanceof Long) {
                            B2.j(((Long) obj2).longValue());
                        } else if (obj2 instanceof String) {
                            B2.i((String) obj2);
                        } else if (obj2 instanceof Double) {
                            double doubleValue2 = ((Double) obj2).doubleValue();
                            B2.b();
                            ((com.google.android.gms.internal.measurement.f3) B2.f2337y).H(doubleValue2);
                        }
                        B.b();
                        ((com.google.android.gms.internal.measurement.f3) B.f2337y).J((com.google.android.gms.internal.measurement.f3) B2.e());
                    }
                    if (((com.google.android.gms.internal.measurement.f3) B.f2337y).A() > 0) {
                        arrayList.add((com.google.android.gms.internal.measurement.f3) B.e());
                    }
                }
            }
            e3Var.b();
            ((com.google.android.gms.internal.measurement.f3) e3Var.f2337y).K(arrayList);
            return;
        }
        u0 u0Var = ((n1) this.f4301y).C;
        n1.g(u0Var);
        u0Var.D.b(obj, "Ignoring invalid (type) event param value");
    }

    public t3 E1(String str, com.google.android.gms.internal.measurement.j3 j3Var, com.google.android.gms.internal.measurement.b3 b3Var, String str2) {
        int indexOf;
        t8.a();
        n1 n1Var = (n1) this.f4301y;
        g gVar = n1Var.A;
        if (gVar.n1(str, e0.Q0)) {
            n1Var.H.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            String[] split = gVar.j1(str, e0.f9276v0).split(",");
            HashSet hashSet = new HashSet(split.length);
            for (String str3 : split) {
                Objects.requireNonNull(str3);
                if (!hashSet.add(str3)) {
                    throw new IllegalArgumentException("duplicate element: " + ((Object) str3));
                }
            }
            Set unmodifiableSet = Collections.unmodifiableSet(hashSet);
            e4 e4Var = this.f9511z;
            b4 b4Var = e4Var.G;
            h1 h1Var = e4Var.f9301x;
            h1 h1Var2 = b4Var.f9511z.f9301x;
            e4.P(h1Var2);
            String q12 = h1Var2.q1(str);
            Uri.Builder builder = new Uri.Builder();
            g gVar2 = ((n1) b4Var.f4301y).A;
            builder.scheme(gVar2.j1(str, e0.o0));
            if (!TextUtils.isEmpty(q12)) {
                String j12 = gVar2.j1(str, e0.f9265p0);
                StringBuilder sb2 = new StringBuilder(String.valueOf(q12).length() + 1 + String.valueOf(j12).length());
                sb2.append(q12);
                sb2.append(".");
                sb2.append(j12);
                builder.authority(sb2.toString());
            } else {
                builder.authority(gVar2.j1(str, e0.f9265p0));
            }
            builder.path(gVar2.j1(str, e0.f9267q0));
            q1(builder, "gmp_app_id", ((com.google.android.gms.internal.measurement.k3) j3Var.f2337y).E(), unmodifiableSet);
            gVar.i1();
            q1(builder, "gmp_version", String.valueOf(130000L), unmodifiableSet);
            String y9 = ((com.google.android.gms.internal.measurement.k3) j3Var.f2337y).y();
            d0 d0Var = e0.T0;
            if (gVar.n1(str, d0Var)) {
                e4.P(h1Var);
                if (h1Var.w1(str)) {
                    y9 = HttpUrl.FRAGMENT_ENCODE_SET;
                }
            }
            q1(builder, "app_instance_id", y9, unmodifiableSet);
            q1(builder, "rdid", ((com.google.android.gms.internal.measurement.k3) j3Var.f2337y).v(), unmodifiableSet);
            q1(builder, "bundle_id", j3Var.o(), unmodifiableSet);
            String l10 = b3Var.l();
            String g10 = a2.g(l10, a2.f9159c, a2.f9157a);
            if (true != TextUtils.isEmpty(g10)) {
                l10 = g10;
            }
            q1(builder, "app_event_name", l10, unmodifiableSet);
            q1(builder, "app_version", String.valueOf(((com.google.android.gms.internal.measurement.k3) j3Var.f2337y).K()), unmodifiableSet);
            String i22 = ((com.google.android.gms.internal.measurement.k3) j3Var.f2337y).i2();
            if (gVar.n1(str, d0Var)) {
                e4.P(h1Var);
                if (h1Var.v1(str) && !TextUtils.isEmpty(i22) && (indexOf = i22.indexOf(".")) != -1) {
                    i22 = i22.substring(0, indexOf);
                }
            }
            q1(builder, "os_version", i22, unmodifiableSet);
            q1(builder, "timestamp", String.valueOf(b3Var.m()), unmodifiableSet);
            boolean x10 = ((com.google.android.gms.internal.measurement.k3) j3Var.f2337y).x();
            String str4 = UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION;
            if (x10) {
                q1(builder, "lat", UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION, unmodifiableSet);
            }
            q1(builder, "privacy_sandbox_version", String.valueOf(((com.google.android.gms.internal.measurement.k3) j3Var.f2337y).G0()), unmodifiableSet);
            q1(builder, "trigger_uri_source", UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION, unmodifiableSet);
            q1(builder, "trigger_uri_timestamp", String.valueOf(currentTimeMillis), unmodifiableSet);
            q1(builder, "request_uuid", str2, unmodifiableSet);
            List<com.google.android.gms.internal.measurement.f3> h4 = b3Var.h();
            Bundle bundle = new Bundle();
            for (com.google.android.gms.internal.measurement.f3 f3Var : h4) {
                String q9 = f3Var.q();
                if (f3Var.x()) {
                    bundle.putString(q9, String.valueOf(f3Var.y()));
                } else if (f3Var.v()) {
                    bundle.putString(q9, String.valueOf(f3Var.w()));
                } else if (f3Var.r()) {
                    bundle.putString(q9, f3Var.s());
                } else if (f3Var.t()) {
                    bundle.putString(q9, String.valueOf(f3Var.u()));
                }
            }
            t1(builder, gVar.j1(str, e0.f9274u0).split("\\|"), bundle, unmodifiableSet);
            List<com.google.android.gms.internal.measurement.t3> unmodifiableList = Collections.unmodifiableList(((com.google.android.gms.internal.measurement.k3) j3Var.f2337y).U1());
            Bundle bundle2 = new Bundle();
            for (com.google.android.gms.internal.measurement.t3 t3Var : unmodifiableList) {
                String r10 = t3Var.r();
                if (t3Var.y()) {
                    bundle2.putString(r10, String.valueOf(t3Var.z()));
                } else if (t3Var.w()) {
                    bundle2.putString(r10, String.valueOf(t3Var.x()));
                } else if (t3Var.s()) {
                    bundle2.putString(r10, t3Var.t());
                } else if (t3Var.u()) {
                    bundle2.putString(r10, String.valueOf(t3Var.v()));
                }
            }
            t1(builder, gVar.j1(str, e0.f9272t0).split("\\|"), bundle2, unmodifiableSet);
            if (true != ((com.google.android.gms.internal.measurement.k3) j3Var.f2337y).D0()) {
                str4 = "0";
            }
            q1(builder, "dma", str4, unmodifiableSet);
            if (!((com.google.android.gms.internal.measurement.k3) j3Var.f2337y).F0().isEmpty()) {
                q1(builder, "dma_cps", ((com.google.android.gms.internal.measurement.k3) j3Var.f2337y).F0(), unmodifiableSet);
            }
            if (((com.google.android.gms.internal.measurement.k3) j3Var.f2337y).L0()) {
                com.google.android.gms.internal.measurement.p2 M0 = ((com.google.android.gms.internal.measurement.k3) j3Var.f2337y).M0();
                if (!M0.z().isEmpty()) {
                    q1(builder, "dl_gclid", M0.z(), unmodifiableSet);
                }
                if (!M0.B().isEmpty()) {
                    q1(builder, "dl_gbraid", M0.B(), unmodifiableSet);
                }
                if (!M0.D().isEmpty()) {
                    q1(builder, "dl_gs", M0.D(), unmodifiableSet);
                }
                if (M0.F() > 0) {
                    q1(builder, "dl_ss_ts", String.valueOf(M0.F()), unmodifiableSet);
                }
                if (!M0.H().isEmpty()) {
                    q1(builder, "mr_gclid", M0.H(), unmodifiableSet);
                }
                if (!M0.J().isEmpty()) {
                    q1(builder, "mr_gbraid", M0.J(), unmodifiableSet);
                }
                if (!M0.L().isEmpty()) {
                    q1(builder, "mr_gs", M0.L(), unmodifiableSet);
                }
                if (M0.N() > 0) {
                    q1(builder, "mr_click_ts", String.valueOf(M0.N()), unmodifiableSet);
                }
            }
            return new t3(1, builder.build().toString(), currentTimeMillis);
        }
        return null;
    }

    public com.google.android.gms.internal.measurement.c3 F1(d2.j jVar) {
        com.google.android.gms.internal.measurement.b3 z10 = com.google.android.gms.internal.measurement.c3.z();
        long j = jVar.f3736c;
        z10.b();
        ((com.google.android.gms.internal.measurement.c3) z10.f2337y).H(j);
        u uVar = (u) jVar.f3740g;
        Objects.requireNonNull(uVar);
        Bundle bundle = uVar.f9492x;
        for (String str : bundle.keySet()) {
            com.google.android.gms.internal.measurement.e3 B = com.google.android.gms.internal.measurement.f3.B();
            B.h(str);
            Object obj = bundle.get(str);
            w8.x.g(obj);
            D1(B, obj);
            z10.k(B);
        }
        String str2 = (String) jVar.f3739f;
        if (!TextUtils.isEmpty(str2) && bundle.get("_o") == null) {
            com.google.android.gms.internal.measurement.e3 B2 = com.google.android.gms.internal.measurement.f3.B();
            B2.h("_o");
            B2.i(str2);
            z10.j((com.google.android.gms.internal.measurement.f3) B2.e());
        }
        return (com.google.android.gms.internal.measurement.c3) z10.e();
    }

    public String G1(com.google.android.gms.internal.measurement.i3 i3Var) {
        Long l10;
        Long l11;
        String str;
        String str2;
        String str3;
        String str4;
        com.google.android.gms.internal.measurement.s2 I0;
        StringBuilder b10 = y.e.b("\nbatch {\n");
        if (i3Var.u()) {
            v1(b10, 0, "upload_subdomain", i3Var.v());
        }
        if (i3Var.s()) {
            v1(b10, 0, "sgtm_join_id", i3Var.t());
        }
        for (com.google.android.gms.internal.measurement.k3 k3Var : i3Var.p()) {
            if (k3Var != null) {
                p1(b10, 1);
                b10.append("bundle {\n");
                if (k3Var.P()) {
                    v1(b10, 1, "protocol_version", Integer.valueOf(k3Var.P0()));
                }
                n1 n1Var = (n1) this.f4301y;
                g gVar = n1Var.A;
                p0 p0Var = n1Var.G;
                if (gVar.n1(k3Var.p(), e0.N0) && k3Var.v0()) {
                    v1(b10, 1, "session_stitching_token", k3Var.w0());
                }
                v1(b10, 1, "platform", k3Var.h2());
                if (k3Var.r()) {
                    v1(b10, 1, "gmp_version", Long.valueOf(k3Var.s()));
                }
                if (k3Var.t()) {
                    v1(b10, 1, "uploading_gmp_version", Long.valueOf(k3Var.u()));
                }
                if (k3Var.r0()) {
                    v1(b10, 1, "dynamite_version", Long.valueOf(k3Var.s0()));
                }
                if (k3Var.L()) {
                    v1(b10, 1, "config_version", Long.valueOf(k3Var.M()));
                }
                v1(b10, 1, "gmp_app_id", k3Var.E());
                v1(b10, 1, "app_id", k3Var.p());
                v1(b10, 1, "app_version", k3Var.q());
                if (k3Var.J()) {
                    v1(b10, 1, "app_version_major", Integer.valueOf(k3Var.K()));
                }
                v1(b10, 1, "firebase_instance_id", k3Var.I());
                if (k3Var.z()) {
                    v1(b10, 1, "dev_cert_hash", Long.valueOf(k3Var.A()));
                }
                v1(b10, 1, "app_store", k3Var.n2());
                if (k3Var.X1()) {
                    v1(b10, 1, "upload_timestamp_millis", Long.valueOf(k3Var.Y1()));
                }
                if (k3Var.Z1()) {
                    v1(b10, 1, "start_timestamp_millis", Long.valueOf(k3Var.a2()));
                }
                if (k3Var.b2()) {
                    v1(b10, 1, "end_timestamp_millis", Long.valueOf(k3Var.c2()));
                }
                if (k3Var.d2()) {
                    v1(b10, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(k3Var.e2()));
                }
                if (k3Var.f2()) {
                    v1(b10, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(k3Var.g2()));
                }
                v1(b10, 1, "app_instance_id", k3Var.y());
                v1(b10, 1, "resettable_device_id", k3Var.v());
                v1(b10, 1, "ds_id", k3Var.O());
                if (k3Var.w()) {
                    v1(b10, 1, "limited_ad_tracking", Boolean.valueOf(k3Var.x()));
                }
                v1(b10, 1, "os_version", k3Var.i2());
                v1(b10, 1, "device_model", k3Var.j2());
                v1(b10, 1, "user_default_language", k3Var.k2());
                if (k3Var.l2()) {
                    v1(b10, 1, "time_zone_offset_minutes", Integer.valueOf(k3Var.m2()));
                }
                if (k3Var.B()) {
                    v1(b10, 1, "bundle_sequential_index", Integer.valueOf(k3Var.C()));
                }
                if (k3Var.J0()) {
                    v1(b10, 1, "delivery_index", Integer.valueOf(k3Var.K0()));
                }
                if (k3Var.F()) {
                    v1(b10, 1, "service_upload", Boolean.valueOf(k3Var.G()));
                }
                v1(b10, 1, "health_monitor", k3Var.D());
                if (k3Var.p0()) {
                    v1(b10, 1, "retry_counter", Integer.valueOf(k3Var.q0()));
                }
                if (k3Var.t0()) {
                    v1(b10, 1, "consent_signals", k3Var.u0());
                }
                if (k3Var.C0()) {
                    v1(b10, 1, "is_dma_region", Boolean.valueOf(k3Var.D0()));
                }
                if (k3Var.E0()) {
                    v1(b10, 1, "core_platform_services", k3Var.F0());
                }
                if (k3Var.A0()) {
                    v1(b10, 1, "consent_diagnostics", k3Var.B0());
                }
                if (k3Var.x0()) {
                    v1(b10, 1, "target_os_version", Long.valueOf(k3Var.y0()));
                }
                t8.a();
                if (n1Var.A.n1(k3Var.p(), e0.Q0)) {
                    v1(b10, 1, "ad_services_version", Integer.valueOf(k3Var.G0()));
                    if (k3Var.H0() && (I0 = k3Var.I0()) != null) {
                        p1(b10, 2);
                        b10.append("attribution_eligibility_status {\n");
                        v1(b10, 2, "eligible", Boolean.valueOf(I0.p()));
                        v1(b10, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(I0.q()));
                        v1(b10, 2, "pre_r", Boolean.valueOf(I0.r()));
                        v1(b10, 2, "r_extensions_too_old", Boolean.valueOf(I0.s()));
                        v1(b10, 2, "adservices_extension_too_old", Boolean.valueOf(I0.t()));
                        v1(b10, 2, "ad_storage_not_allowed", Boolean.valueOf(I0.u()));
                        v1(b10, 2, "measurement_manager_disabled", Boolean.valueOf(I0.v()));
                        p1(b10, 2);
                        b10.append("}\n");
                    }
                }
                if (k3Var.L0()) {
                    com.google.android.gms.internal.measurement.p2 M0 = k3Var.M0();
                    p1(b10, 2);
                    b10.append("ad_campaign_info {\n");
                    if (M0.y()) {
                        v1(b10, 2, "deep_link_gclid", M0.z());
                    }
                    if (M0.A()) {
                        v1(b10, 2, "deep_link_gbraid", M0.B());
                    }
                    if (M0.C()) {
                        v1(b10, 2, "deep_link_gad_source", M0.D());
                    }
                    if (M0.E()) {
                        v1(b10, 2, "deep_link_session_millis", Long.valueOf(M0.F()));
                    }
                    if (M0.G()) {
                        v1(b10, 2, "market_referrer_gclid", M0.H());
                    }
                    if (M0.I()) {
                        v1(b10, 2, "market_referrer_gbraid", M0.J());
                    }
                    if (M0.K()) {
                        v1(b10, 2, "market_referrer_gad_source", M0.L());
                    }
                    if (M0.M()) {
                        v1(b10, 2, "market_referrer_click_millis", Long.valueOf(M0.N()));
                    }
                    p1(b10, 2);
                    b10.append("}\n");
                }
                if (k3Var.Q()) {
                    v1(b10, 1, "batching_timestamp_millis", Long.valueOf(k3Var.R()));
                }
                if (k3Var.N0()) {
                    com.google.android.gms.internal.measurement.r3 O0 = k3Var.O0();
                    p1(b10, 2);
                    b10.append("sgtm_diagnostics {\n");
                    int t10 = O0.t();
                    if (t10 != 1) {
                        if (t10 != 2) {
                            if (t10 != 3) {
                                if (t10 != 4) {
                                    str3 = "SDK_SERVICE_UPLOAD";
                                } else {
                                    str3 = "PACKAGE_SERVICE_UPLOAD";
                                }
                            } else {
                                str3 = "SDK_CLIENT_UPLOAD";
                            }
                        } else {
                            str3 = "GA_UPLOAD";
                        }
                    } else {
                        str3 = "UPLOAD_TYPE_UNKNOWN";
                    }
                    v1(b10, 2, "upload_type", str3);
                    v1(b10, 2, "client_upload_eligibility", r4.a.y(O0.p()));
                    int u3 = O0.u();
                    if (u3 != 1) {
                        if (u3 != 2) {
                            if (u3 != 3) {
                                if (u3 != 4) {
                                    if (u3 != 5) {
                                        str4 = "NON_PLAY_MISSING_SGTM_SERVER_URL";
                                    } else {
                                        str4 = "MISSING_SGTM_PROXY_INFO";
                                    }
                                } else {
                                    str4 = "MISSING_SGTM_SETTINGS";
                                }
                            } else {
                                str4 = "NOT_IN_ROLLOUT";
                            }
                        } else {
                            str4 = "SERVICE_UPLOAD_ELIGIBLE";
                        }
                    } else {
                        str4 = "SERVICE_UPLOAD_ELIGIBILITY_UNKNOWN";
                    }
                    v1(b10, 2, "service_upload_eligibility", str4);
                    p1(b10, 2);
                    b10.append("}\n");
                }
                if (k3Var.S()) {
                    com.google.android.gms.internal.measurement.y2 T = k3Var.T();
                    p1(b10, 2);
                    b10.append("consent_info_extra {\n");
                    for (com.google.android.gms.internal.measurement.x2 x2Var : T.p()) {
                        p1(b10, 3);
                        b10.append("limited_data_modes {\n");
                        int q9 = x2Var.q();
                        if (q9 != 1) {
                            if (q9 != 2) {
                                if (q9 != 3) {
                                    if (q9 != 4) {
                                        str = "AD_PERSONALIZATION";
                                    } else {
                                        str = "AD_USER_DATA";
                                    }
                                } else {
                                    str = "ANALYTICS_STORAGE";
                                }
                            } else {
                                str = "AD_STORAGE";
                            }
                        } else {
                            str = "CONSENT_TYPE_UNSPECIFIED";
                        }
                        v1(b10, 3, HandleInvocationsFromAdViewer.KEY_AD_TYPE, str);
                        int r10 = x2Var.r();
                        if (r10 != 1) {
                            if (r10 != 2) {
                                str2 = "NO_DATA_MODE";
                            } else {
                                str2 = "LIMITED_MODE";
                            }
                        } else {
                            str2 = "NOT_LIMITED";
                        }
                        v1(b10, 3, "mode", str2);
                        p1(b10, 3);
                        b10.append("}\n");
                    }
                    p1(b10, 2);
                    b10.append("}\n");
                }
                s5<com.google.android.gms.internal.measurement.t3> U1 = k3Var.U1();
                if (U1 != null) {
                    for (com.google.android.gms.internal.measurement.t3 t3Var : U1) {
                        if (t3Var != null) {
                            p1(b10, 2);
                            b10.append("user_property {\n");
                            Double d10 = null;
                            if (t3Var.p()) {
                                l10 = Long.valueOf(t3Var.q());
                            } else {
                                l10 = null;
                            }
                            v1(b10, 2, "set_timestamp_millis", l10);
                            v1(b10, 2, MediationMetaData.KEY_NAME, p0Var.c(t3Var.r()));
                            v1(b10, 2, "string_value", t3Var.t());
                            if (t3Var.u()) {
                                l11 = Long.valueOf(t3Var.v());
                            } else {
                                l11 = null;
                            }
                            v1(b10, 2, "int_value", l11);
                            if (t3Var.y()) {
                                d10 = Double.valueOf(t3Var.z());
                            }
                            v1(b10, 2, "double_value", d10);
                            p1(b10, 2);
                            b10.append("}\n");
                        }
                    }
                }
                s5<com.google.android.gms.internal.measurement.u2> H = k3Var.H();
                if (H != null) {
                    for (com.google.android.gms.internal.measurement.u2 u2Var : H) {
                        if (u2Var != null) {
                            p1(b10, 2);
                            b10.append("audience_membership {\n");
                            if (u2Var.p()) {
                                v1(b10, 2, "audience_id", Integer.valueOf(u2Var.q()));
                            }
                            if (u2Var.u()) {
                                v1(b10, 2, "new_audience", Boolean.valueOf(u2Var.v()));
                            }
                            u1(b10, "current_data", u2Var.r());
                            if (u2Var.s()) {
                                u1(b10, "previous_data", u2Var.t());
                            }
                            p1(b10, 2);
                            b10.append("}\n");
                        }
                    }
                }
                List<com.google.android.gms.internal.measurement.c3> P1 = k3Var.P1();
                if (P1 != null) {
                    for (com.google.android.gms.internal.measurement.c3 c3Var : P1) {
                        if (c3Var != null) {
                            p1(b10, 2);
                            b10.append("event {\n");
                            v1(b10, 2, MediationMetaData.KEY_NAME, p0Var.a(c3Var.s()));
                            if (c3Var.t()) {
                                v1(b10, 2, "timestamp_millis", Long.valueOf(c3Var.u()));
                            }
                            if (c3Var.v()) {
                                v1(b10, 2, "previous_timestamp_millis", Long.valueOf(c3Var.w()));
                            }
                            if (c3Var.x()) {
                                v1(b10, 2, "count", Integer.valueOf(c3Var.y()));
                            }
                            if (c3Var.q() != 0) {
                                n1(b10, 2, (s5) c3Var.p());
                            }
                            p1(b10, 2);
                            b10.append("}\n");
                        }
                    }
                }
                p1(b10, 1);
                b10.append("}\n");
            }
        }
        b10.append("} // End-of-batch\n");
        return b10.toString();
    }

    public String H1(com.google.android.gms.internal.measurement.w1 w1Var) {
        StringBuilder b10 = y.e.b("\nproperty_filter {\n");
        if (w1Var.p()) {
            v1(b10, 0, "filter_id", Integer.valueOf(w1Var.q()));
        }
        v1(b10, 0, "property_name", ((n1) this.f4301y).G.c(w1Var.r()));
        String r12 = r1(w1Var.t(), w1Var.u(), w1Var.w());
        if (!r12.isEmpty()) {
            v1(b10, 0, "filter_type", r12);
        }
        o1(b10, 1, w1Var.s());
        b10.append("}\n");
        return b10.toString();
    }

    public Parcelable I1(byte[] bArr, Parcelable.Creator creator) {
        Parcelable parcelable = null;
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            try {
                obtain.unmarshall(bArr, 0, bArr.length);
                obtain.setDataPosition(0);
                parcelable = (Parcelable) creator.createFromParcel(obtain);
            } catch (x8.b unused) {
                u0 u0Var = ((n1) this.f4301y).C;
                n1.g(u0Var);
                u0Var.D.a("Failed to load parcelable from buffer");
            }
            return parcelable;
        } finally {
            obtain.recycle();
        }
    }

    public List M1(r5 r5Var, List list) {
        int i6;
        n1 n1Var = (n1) this.f4301y;
        ArrayList arrayList = new ArrayList(r5Var);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                u0 u0Var = n1Var.C;
                n1.g(u0Var);
                u0Var.G.b(num, "Ignoring negative bit index to be cleared");
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    u0 u0Var2 = n1Var.C;
                    n1.g(u0Var2);
                    u0Var2.G.c(num, Integer.valueOf(arrayList.size()), "Ignoring bit index greater than bitSet size");
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i10 = size2;
            i6 = size;
            size = i10;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i6);
    }

    public boolean N1(long j, long j10) {
        if (j != 0 && j10 > 0) {
            ((n1) this.f4301y).H.getClass();
            if (Math.abs(System.currentTimeMillis() - j) <= j10) {
                return false;
            }
            return true;
        }
        return true;
    }

    public long O1(byte[] bArr) {
        w8.x.g(bArr);
        n1 n1Var = (n1) this.f4301y;
        j4 j4Var = n1Var.F;
        n1.e(j4Var);
        j4Var.d1();
        MessageDigest u12 = j4.u1();
        if (u12 == null) {
            u0 u0Var = n1Var.C;
            n1.g(u0Var);
            u0Var.D.a("Failed to get MD5");
            return 0L;
        }
        return j4.v1(u12.digest(bArr));
    }

    public byte[] P1(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            u0 u0Var = ((n1) this.f4301y).C;
            n1.g(u0Var);
            u0Var.D.b(e10, "Failed to gzip content");
            throw e10;
        }
    }

    @Override // n9.z3
    public final void g1() {
        int i6 = this.B;
    }

    public void n1(StringBuilder sb2, int i6, s5 s5Var) {
        String str;
        String str2;
        Long l10;
        if (s5Var != null) {
            int i10 = i6 + 1;
            Iterator it = s5Var.iterator();
            while (it.hasNext()) {
                com.google.android.gms.internal.measurement.f3 f3Var = (com.google.android.gms.internal.measurement.f3) it.next();
                if (f3Var != null) {
                    p1(sb2, i10);
                    sb2.append("param {\n");
                    Double d10 = null;
                    if (f3Var.p()) {
                        str = ((n1) this.f4301y).G.b(f3Var.q());
                    } else {
                        str = null;
                    }
                    v1(sb2, i10, MediationMetaData.KEY_NAME, str);
                    if (f3Var.r()) {
                        str2 = f3Var.s();
                    } else {
                        str2 = null;
                    }
                    v1(sb2, i10, "string_value", str2);
                    if (f3Var.t()) {
                        l10 = Long.valueOf(f3Var.u());
                    } else {
                        l10 = null;
                    }
                    v1(sb2, i10, "int_value", l10);
                    if (f3Var.x()) {
                        d10 = Double.valueOf(f3Var.y());
                    }
                    v1(sb2, i10, "double_value", d10);
                    if (f3Var.A() > 0) {
                        n1(sb2, i10, (s5) f3Var.z());
                    }
                    p1(sb2, i10);
                    sb2.append("}\n");
                }
            }
        }
    }

    public void o1(StringBuilder sb2, int i6, com.google.android.gms.internal.measurement.r1 r1Var) {
        String str;
        if (r1Var == null) {
            return;
        }
        p1(sb2, i6);
        sb2.append("filter {\n");
        if (r1Var.t()) {
            v1(sb2, i6, "complement", Boolean.valueOf(r1Var.u()));
        }
        if (r1Var.v()) {
            v1(sb2, i6, "param_name", ((n1) this.f4301y).G.b(r1Var.w()));
        }
        if (r1Var.p()) {
            int i10 = i6 + 1;
            com.google.android.gms.internal.measurement.x1 q9 = r1Var.q();
            if (q9 != null) {
                p1(sb2, i10);
                sb2.append("string_filter {\n");
                if (q9.p()) {
                    switch (q9.x()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    v1(sb2, i10, "match_type", str);
                }
                if (q9.q()) {
                    v1(sb2, i10, "expression", q9.r());
                }
                if (q9.s()) {
                    v1(sb2, i10, "case_sensitive", Boolean.valueOf(q9.t()));
                }
                if (q9.v() > 0) {
                    p1(sb2, i6 + 2);
                    sb2.append("expression_list {\n");
                    for (String str2 : q9.u()) {
                        p1(sb2, i6 + 3);
                        sb2.append(str2);
                        sb2.append("\n");
                    }
                    sb2.append("}\n");
                }
                p1(sb2, i10);
                sb2.append("}\n");
            }
        }
        if (r1Var.r()) {
            w1(sb2, i6 + 1, "number_filter", r1Var.s());
        }
        p1(sb2, i6);
        sb2.append("}\n");
    }

    public boolean x1() {
        e1();
        ConnectivityManager connectivityManager = (ConnectivityManager) ((n1) this.f4301y).f9413x.getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        if (networkInfo != null && networkInfo.isConnected()) {
            return true;
        }
        return false;
    }

    private final void A1() {
    }

    private final void y1() {
    }

    private final void z1() {
    }
}
