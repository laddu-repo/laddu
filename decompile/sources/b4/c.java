package b4;

import android.text.SpannableStringBuilder;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f1423a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1424b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1425c;

    /* renamed from: d, reason: collision with root package name */
    public final long f1426d;

    /* renamed from: e, reason: collision with root package name */
    public final long f1427e;

    /* renamed from: f, reason: collision with root package name */
    public final g f1428f;

    /* renamed from: g, reason: collision with root package name */
    public final String[] f1429g;

    /* renamed from: h, reason: collision with root package name */
    public final String f1430h;

    /* renamed from: i, reason: collision with root package name */
    public final String f1431i;
    public final c j;

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f1432k;

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f1433l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f1434m;

    public c(String str, String str2, long j, long j10, g gVar, String[] strArr, String str3, String str4, c cVar) {
        boolean z10;
        this.f1423a = str;
        this.f1424b = str2;
        this.f1431i = str4;
        this.f1428f = gVar;
        this.f1429g = strArr;
        if (str2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f1425c = z10;
        this.f1426d = j;
        this.f1427e = j10;
        str3.getClass();
        this.f1430h = str3;
        this.j = cVar;
        this.f1432k = new HashMap();
        this.f1433l = new HashMap();
    }

    public static c a(String str) {
        return new c(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, HttpUrl.FRAGMENT_ENCODE_SET, null, null);
    }

    public static SpannableStringBuilder e(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            t1.a aVar = new t1.a();
            aVar.f12434a = new SpannableStringBuilder();
            aVar.f12435b = null;
            treeMap.put(str, aVar);
        }
        CharSequence charSequence = ((t1.a) treeMap.get(str)).f12434a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final c b(int i6) {
        ArrayList arrayList = this.f1434m;
        if (arrayList != null) {
            return (c) arrayList.get(i6);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int c() {
        ArrayList arrayList = this.f1434m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final void d(TreeSet treeSet, boolean z10) {
        boolean z11;
        String str = this.f1423a;
        boolean equals = "p".equals(str);
        boolean equals2 = "div".equals(str);
        if (z10 || equals || (equals2 && this.f1431i != null)) {
            long j = this.f1426d;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j10 = this.f1427e;
            if (j10 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j10));
            }
        }
        if (this.f1434m != null) {
            for (int i6 = 0; i6 < this.f1434m.size(); i6++) {
                c cVar = (c) this.f1434m.get(i6);
                if (!z10 && !equals) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                cVar.d(treeSet, z11);
            }
        }
    }

    public final boolean f(long j) {
        long j10 = this.f1427e;
        long j11 = this.f1426d;
        if (j11 != -9223372036854775807L || j10 != -9223372036854775807L) {
            if (j11 > j || j10 != -9223372036854775807L) {
                if (j11 != -9223372036854775807L || j >= j10) {
                    if (j11 <= j && j < j10) {
                        return true;
                    }
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final void g(long j, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.f1430h;
        if (!HttpUrl.FRAGMENT_ENCODE_SET.equals(str3)) {
            str = str3;
        }
        if (f(j) && "div".equals(this.f1423a) && (str2 = this.f1431i) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i6 = 0; i6 < c(); i6++) {
            b(i6).g(j, str, arrayList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02d0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(long r20, java.util.Map r22, java.util.HashMap r23, java.lang.String r24, java.util.TreeMap r25) {
        /*
            Method dump skipped, instructions count: 752
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.c.h(long, java.util.Map, java.util.HashMap, java.lang.String, java.util.TreeMap):void");
    }

    public final void i(long j, boolean z10, String str, TreeMap treeMap) {
        String str2;
        boolean z11;
        HashMap hashMap = this.f1432k;
        hashMap.clear();
        HashMap hashMap2 = this.f1433l;
        hashMap2.clear();
        String str3 = this.f1423a;
        if (!"metadata".equals(str3)) {
            String str4 = this.f1430h;
            if (HttpUrl.FRAGMENT_ENCODE_SET.equals(str4)) {
                str2 = str;
            } else {
                str2 = str4;
            }
            if (this.f1425c && z10) {
                SpannableStringBuilder e10 = e(str2, treeMap);
                String str5 = this.f1424b;
                str5.getClass();
                e10.append((CharSequence) str5);
                return;
            }
            if ("br".equals(str3) && z10) {
                e(str2, treeMap).append('\n');
                return;
            }
            if (f(j)) {
                for (Map.Entry entry : treeMap.entrySet()) {
                    String str6 = (String) entry.getKey();
                    CharSequence charSequence = ((t1.a) entry.getValue()).f12434a;
                    charSequence.getClass();
                    hashMap.put(str6, Integer.valueOf(charSequence.length()));
                }
                boolean equals = "p".equals(str3);
                for (int i6 = 0; i6 < c(); i6++) {
                    c b10 = b(i6);
                    if (!z10 && !equals) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    b10.i(j, z11, str2, treeMap);
                }
                if (equals) {
                    SpannableStringBuilder e11 = e(str2, treeMap);
                    int length = e11.length() - 1;
                    while (length >= 0 && e11.charAt(length) == ' ') {
                        length--;
                    }
                    if (length >= 0 && e11.charAt(length) != '\n') {
                        e11.append('\n');
                    }
                }
                for (Map.Entry entry2 : treeMap.entrySet()) {
                    String str7 = (String) entry2.getKey();
                    CharSequence charSequence2 = ((t1.a) entry2.getValue()).f12434a;
                    charSequence2.getClass();
                    hashMap2.put(str7, Integer.valueOf(charSequence2.length()));
                }
            }
        }
    }
}
