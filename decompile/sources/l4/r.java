package l4;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: q, reason: collision with root package name */
    public static final df.k f8169q = new df.k("^[a-zA-Z]+[+\\w\\-.]*:");

    /* renamed from: r, reason: collision with root package name */
    public static final df.k f8170r = new df.k("\\{(.+?)\\}");
    public static final df.k s = new df.k("http[s]?://");

    /* renamed from: t, reason: collision with root package name */
    public static final df.k f8171t = new df.k(".*");

    /* renamed from: u, reason: collision with root package name */
    public static final df.k f8172u = new df.k("([^/]*?|)");

    /* renamed from: v, reason: collision with root package name */
    public static final df.k f8173v = new df.k("^[^?#]+\\?([^#]*).*");

    /* renamed from: a, reason: collision with root package name */
    public final String f8174a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8175b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8176c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f8177d;

    /* renamed from: e, reason: collision with root package name */
    public final String f8178e;

    /* renamed from: f, reason: collision with root package name */
    public final he.m f8179f;

    /* renamed from: g, reason: collision with root package name */
    public final he.m f8180g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f8181h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f8182i;
    public final Object j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f8183k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f8184l;

    /* renamed from: m, reason: collision with root package name */
    public final he.m f8185m;

    /* renamed from: n, reason: collision with root package name */
    public final String f8186n;

    /* renamed from: o, reason: collision with root package name */
    public final he.m f8187o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f8188p;

    public r(String str, String str2, String str3) {
        List list;
        List list2;
        boolean z10;
        this.f8174a = str;
        this.f8175b = str2;
        this.f8176c = str3;
        ArrayList arrayList = new ArrayList();
        this.f8177d = arrayList;
        final int i6 = 0;
        this.f8179f = he.a.d(new ve.a(this) { // from class: l4.o

            /* renamed from: y, reason: collision with root package name */
            public final /* synthetic */ r f8164y;

            {
                this.f8164y = this;
            }

            /* JADX WARN: Type inference failed for: r1v20, types: [he.f, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v27, types: [he.f, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v34, types: [he.f, java.lang.Object] */
            @Override // ve.a
            public final Object invoke() {
                boolean z11;
                List list3;
                switch (i6) {
                    case 0:
                        String str4 = this.f8164y.f8178e;
                        if (str4 != null) {
                            return new df.k(str4, 0);
                        }
                        return null;
                    case 1:
                        String str5 = this.f8164y.f8174a;
                        if (str5 != null && r.f8173v.c(str5)) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        return Boolean.valueOf(z11);
                    case 2:
                        r rVar = this.f8164y;
                        String str6 = rVar.f8174a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) rVar.f8180g.getValue()).booleanValue()) {
                            kotlin.jvm.internal.k.b(str6);
                            Uri parse = Uri.parse(str6);
                            kotlin.jvm.internal.k.d(parse, "parse(...)");
                            for (String str7 : parse.getQueryParameterNames()) {
                                StringBuilder sb2 = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str7);
                                int i10 = 1;
                                if (queryParameters.size() <= 1) {
                                    String str8 = (String) ie.j.H(queryParameters);
                                    if (str8 == null) {
                                        rVar.f8182i = true;
                                        str8 = str7;
                                    }
                                    c6.h a10 = df.k.a(r.f8170r, str8);
                                    q qVar = new q();
                                    int i11 = 0;
                                    while (a10 != null) {
                                        df.h b10 = ((df.j) a10.f1983z).b(i10);
                                        kotlin.jvm.internal.k.b(b10);
                                        qVar.f8168b.add(b10.f4134a);
                                        if (a10.q().f709x > i11) {
                                            String substring = str8.substring(i11, a10.q().f709x);
                                            kotlin.jvm.internal.k.d(substring, "substring(...)");
                                            String quote = Pattern.quote(substring);
                                            kotlin.jvm.internal.k.d(quote, "quote(...)");
                                            sb2.append(quote);
                                        }
                                        sb2.append("([\\s\\S]+?)?");
                                        i11 = a10.q().f710y + 1;
                                        a10 = a10.t();
                                        i10 = 1;
                                    }
                                    if (i11 < str8.length()) {
                                        String substring2 = str8.substring(i11);
                                        kotlin.jvm.internal.k.d(substring2, "substring(...)");
                                        String quote2 = Pattern.quote(substring2);
                                        kotlin.jvm.internal.k.d(quote2, "quote(...)");
                                        sb2.append(quote2);
                                    }
                                    sb2.append("$");
                                    String sb3 = sb2.toString();
                                    kotlin.jvm.internal.k.d(sb3, "toString(...)");
                                    qVar.f8167a = r.f(sb3);
                                    linkedHashMap.put(str7, qVar);
                                } else {
                                    throw new IllegalArgumentException(("Query parameter " + str7 + " must only be present once in " + str6 + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str9 = this.f8164y.f8174a;
                        if (str9 != null) {
                            Uri parse2 = Uri.parse(str9);
                            kotlin.jvm.internal.k.d(parse2, "parse(...)");
                            if (parse2.getFragment() != null) {
                                ArrayList arrayList2 = new ArrayList();
                                Uri parse3 = Uri.parse(str9);
                                kotlin.jvm.internal.k.d(parse3, "parse(...)");
                                String fragment = parse3.getFragment();
                                StringBuilder sb4 = new StringBuilder();
                                kotlin.jvm.internal.k.b(fragment);
                                r.a(fragment, arrayList2, sb4);
                                return new he.i(arrayList2, sb4.toString());
                            }
                        }
                        return null;
                    case 4:
                        he.i iVar = (he.i) this.f8164y.j.getValue();
                        if (iVar == null || (list3 = (List) iVar.f6076x) == null) {
                            return new ArrayList();
                        }
                        return list3;
                    case 5:
                        he.i iVar2 = (he.i) this.f8164y.j.getValue();
                        if (iVar2 != null) {
                            return (String) iVar2.f6077y;
                        }
                        return null;
                    case 6:
                        String str10 = (String) this.f8164y.f8184l.getValue();
                        if (str10 != null) {
                            return new df.k(str10, 0);
                        }
                        return null;
                    default:
                        String str11 = this.f8164y.f8186n;
                        if (str11 != null) {
                            return new df.k(str11);
                        }
                        return null;
                }
            }
        });
        final int i10 = 1;
        this.f8180g = he.a.d(new ve.a(this) { // from class: l4.o

            /* renamed from: y, reason: collision with root package name */
            public final /* synthetic */ r f8164y;

            {
                this.f8164y = this;
            }

            /* JADX WARN: Type inference failed for: r1v20, types: [he.f, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v27, types: [he.f, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v34, types: [he.f, java.lang.Object] */
            @Override // ve.a
            public final Object invoke() {
                boolean z11;
                List list3;
                switch (i10) {
                    case 0:
                        String str4 = this.f8164y.f8178e;
                        if (str4 != null) {
                            return new df.k(str4, 0);
                        }
                        return null;
                    case 1:
                        String str5 = this.f8164y.f8174a;
                        if (str5 != null && r.f8173v.c(str5)) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        return Boolean.valueOf(z11);
                    case 2:
                        r rVar = this.f8164y;
                        String str6 = rVar.f8174a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) rVar.f8180g.getValue()).booleanValue()) {
                            kotlin.jvm.internal.k.b(str6);
                            Uri parse = Uri.parse(str6);
                            kotlin.jvm.internal.k.d(parse, "parse(...)");
                            for (String str7 : parse.getQueryParameterNames()) {
                                StringBuilder sb2 = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str7);
                                int i102 = 1;
                                if (queryParameters.size() <= 1) {
                                    String str8 = (String) ie.j.H(queryParameters);
                                    if (str8 == null) {
                                        rVar.f8182i = true;
                                        str8 = str7;
                                    }
                                    c6.h a10 = df.k.a(r.f8170r, str8);
                                    q qVar = new q();
                                    int i11 = 0;
                                    while (a10 != null) {
                                        df.h b10 = ((df.j) a10.f1983z).b(i102);
                                        kotlin.jvm.internal.k.b(b10);
                                        qVar.f8168b.add(b10.f4134a);
                                        if (a10.q().f709x > i11) {
                                            String substring = str8.substring(i11, a10.q().f709x);
                                            kotlin.jvm.internal.k.d(substring, "substring(...)");
                                            String quote = Pattern.quote(substring);
                                            kotlin.jvm.internal.k.d(quote, "quote(...)");
                                            sb2.append(quote);
                                        }
                                        sb2.append("([\\s\\S]+?)?");
                                        i11 = a10.q().f710y + 1;
                                        a10 = a10.t();
                                        i102 = 1;
                                    }
                                    if (i11 < str8.length()) {
                                        String substring2 = str8.substring(i11);
                                        kotlin.jvm.internal.k.d(substring2, "substring(...)");
                                        String quote2 = Pattern.quote(substring2);
                                        kotlin.jvm.internal.k.d(quote2, "quote(...)");
                                        sb2.append(quote2);
                                    }
                                    sb2.append("$");
                                    String sb3 = sb2.toString();
                                    kotlin.jvm.internal.k.d(sb3, "toString(...)");
                                    qVar.f8167a = r.f(sb3);
                                    linkedHashMap.put(str7, qVar);
                                } else {
                                    throw new IllegalArgumentException(("Query parameter " + str7 + " must only be present once in " + str6 + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str9 = this.f8164y.f8174a;
                        if (str9 != null) {
                            Uri parse2 = Uri.parse(str9);
                            kotlin.jvm.internal.k.d(parse2, "parse(...)");
                            if (parse2.getFragment() != null) {
                                ArrayList arrayList2 = new ArrayList();
                                Uri parse3 = Uri.parse(str9);
                                kotlin.jvm.internal.k.d(parse3, "parse(...)");
                                String fragment = parse3.getFragment();
                                StringBuilder sb4 = new StringBuilder();
                                kotlin.jvm.internal.k.b(fragment);
                                r.a(fragment, arrayList2, sb4);
                                return new he.i(arrayList2, sb4.toString());
                            }
                        }
                        return null;
                    case 4:
                        he.i iVar = (he.i) this.f8164y.j.getValue();
                        if (iVar == null || (list3 = (List) iVar.f6076x) == null) {
                            return new ArrayList();
                        }
                        return list3;
                    case 5:
                        he.i iVar2 = (he.i) this.f8164y.j.getValue();
                        if (iVar2 != null) {
                            return (String) iVar2.f6077y;
                        }
                        return null;
                    case 6:
                        String str10 = (String) this.f8164y.f8184l.getValue();
                        if (str10 != null) {
                            return new df.k(str10, 0);
                        }
                        return null;
                    default:
                        String str11 = this.f8164y.f8186n;
                        if (str11 != null) {
                            return new df.k(str11);
                        }
                        return null;
                }
            }
        });
        final int i11 = 2;
        ve.a aVar = new ve.a(this) { // from class: l4.o

            /* renamed from: y, reason: collision with root package name */
            public final /* synthetic */ r f8164y;

            {
                this.f8164y = this;
            }

            /* JADX WARN: Type inference failed for: r1v20, types: [he.f, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v27, types: [he.f, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v34, types: [he.f, java.lang.Object] */
            @Override // ve.a
            public final Object invoke() {
                boolean z11;
                List list3;
                switch (i11) {
                    case 0:
                        String str4 = this.f8164y.f8178e;
                        if (str4 != null) {
                            return new df.k(str4, 0);
                        }
                        return null;
                    case 1:
                        String str5 = this.f8164y.f8174a;
                        if (str5 != null && r.f8173v.c(str5)) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        return Boolean.valueOf(z11);
                    case 2:
                        r rVar = this.f8164y;
                        String str6 = rVar.f8174a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) rVar.f8180g.getValue()).booleanValue()) {
                            kotlin.jvm.internal.k.b(str6);
                            Uri parse = Uri.parse(str6);
                            kotlin.jvm.internal.k.d(parse, "parse(...)");
                            for (String str7 : parse.getQueryParameterNames()) {
                                StringBuilder sb2 = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str7);
                                int i102 = 1;
                                if (queryParameters.size() <= 1) {
                                    String str8 = (String) ie.j.H(queryParameters);
                                    if (str8 == null) {
                                        rVar.f8182i = true;
                                        str8 = str7;
                                    }
                                    c6.h a10 = df.k.a(r.f8170r, str8);
                                    q qVar = new q();
                                    int i112 = 0;
                                    while (a10 != null) {
                                        df.h b10 = ((df.j) a10.f1983z).b(i102);
                                        kotlin.jvm.internal.k.b(b10);
                                        qVar.f8168b.add(b10.f4134a);
                                        if (a10.q().f709x > i112) {
                                            String substring = str8.substring(i112, a10.q().f709x);
                                            kotlin.jvm.internal.k.d(substring, "substring(...)");
                                            String quote = Pattern.quote(substring);
                                            kotlin.jvm.internal.k.d(quote, "quote(...)");
                                            sb2.append(quote);
                                        }
                                        sb2.append("([\\s\\S]+?)?");
                                        i112 = a10.q().f710y + 1;
                                        a10 = a10.t();
                                        i102 = 1;
                                    }
                                    if (i112 < str8.length()) {
                                        String substring2 = str8.substring(i112);
                                        kotlin.jvm.internal.k.d(substring2, "substring(...)");
                                        String quote2 = Pattern.quote(substring2);
                                        kotlin.jvm.internal.k.d(quote2, "quote(...)");
                                        sb2.append(quote2);
                                    }
                                    sb2.append("$");
                                    String sb3 = sb2.toString();
                                    kotlin.jvm.internal.k.d(sb3, "toString(...)");
                                    qVar.f8167a = r.f(sb3);
                                    linkedHashMap.put(str7, qVar);
                                } else {
                                    throw new IllegalArgumentException(("Query parameter " + str7 + " must only be present once in " + str6 + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str9 = this.f8164y.f8174a;
                        if (str9 != null) {
                            Uri parse2 = Uri.parse(str9);
                            kotlin.jvm.internal.k.d(parse2, "parse(...)");
                            if (parse2.getFragment() != null) {
                                ArrayList arrayList2 = new ArrayList();
                                Uri parse3 = Uri.parse(str9);
                                kotlin.jvm.internal.k.d(parse3, "parse(...)");
                                String fragment = parse3.getFragment();
                                StringBuilder sb4 = new StringBuilder();
                                kotlin.jvm.internal.k.b(fragment);
                                r.a(fragment, arrayList2, sb4);
                                return new he.i(arrayList2, sb4.toString());
                            }
                        }
                        return null;
                    case 4:
                        he.i iVar = (he.i) this.f8164y.j.getValue();
                        if (iVar == null || (list3 = (List) iVar.f6076x) == null) {
                            return new ArrayList();
                        }
                        return list3;
                    case 5:
                        he.i iVar2 = (he.i) this.f8164y.j.getValue();
                        if (iVar2 != null) {
                            return (String) iVar2.f6077y;
                        }
                        return null;
                    case 6:
                        String str10 = (String) this.f8164y.f8184l.getValue();
                        if (str10 != null) {
                            return new df.k(str10, 0);
                        }
                        return null;
                    default:
                        String str11 = this.f8164y.f8186n;
                        if (str11 != null) {
                            return new df.k(str11);
                        }
                        return null;
                }
            }
        };
        he.g gVar = he.g.f6075z;
        this.f8181h = he.a.c(gVar, aVar);
        final int i12 = 3;
        this.j = he.a.c(gVar, new ve.a(this) { // from class: l4.o

            /* renamed from: y, reason: collision with root package name */
            public final /* synthetic */ r f8164y;

            {
                this.f8164y = this;
            }

            /* JADX WARN: Type inference failed for: r1v20, types: [he.f, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v27, types: [he.f, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v34, types: [he.f, java.lang.Object] */
            @Override // ve.a
            public final Object invoke() {
                boolean z11;
                List list3;
                switch (i12) {
                    case 0:
                        String str4 = this.f8164y.f8178e;
                        if (str4 != null) {
                            return new df.k(str4, 0);
                        }
                        return null;
                    case 1:
                        String str5 = this.f8164y.f8174a;
                        if (str5 != null && r.f8173v.c(str5)) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        return Boolean.valueOf(z11);
                    case 2:
                        r rVar = this.f8164y;
                        String str6 = rVar.f8174a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) rVar.f8180g.getValue()).booleanValue()) {
                            kotlin.jvm.internal.k.b(str6);
                            Uri parse = Uri.parse(str6);
                            kotlin.jvm.internal.k.d(parse, "parse(...)");
                            for (String str7 : parse.getQueryParameterNames()) {
                                StringBuilder sb2 = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str7);
                                int i102 = 1;
                                if (queryParameters.size() <= 1) {
                                    String str8 = (String) ie.j.H(queryParameters);
                                    if (str8 == null) {
                                        rVar.f8182i = true;
                                        str8 = str7;
                                    }
                                    c6.h a10 = df.k.a(r.f8170r, str8);
                                    q qVar = new q();
                                    int i112 = 0;
                                    while (a10 != null) {
                                        df.h b10 = ((df.j) a10.f1983z).b(i102);
                                        kotlin.jvm.internal.k.b(b10);
                                        qVar.f8168b.add(b10.f4134a);
                                        if (a10.q().f709x > i112) {
                                            String substring = str8.substring(i112, a10.q().f709x);
                                            kotlin.jvm.internal.k.d(substring, "substring(...)");
                                            String quote = Pattern.quote(substring);
                                            kotlin.jvm.internal.k.d(quote, "quote(...)");
                                            sb2.append(quote);
                                        }
                                        sb2.append("([\\s\\S]+?)?");
                                        i112 = a10.q().f710y + 1;
                                        a10 = a10.t();
                                        i102 = 1;
                                    }
                                    if (i112 < str8.length()) {
                                        String substring2 = str8.substring(i112);
                                        kotlin.jvm.internal.k.d(substring2, "substring(...)");
                                        String quote2 = Pattern.quote(substring2);
                                        kotlin.jvm.internal.k.d(quote2, "quote(...)");
                                        sb2.append(quote2);
                                    }
                                    sb2.append("$");
                                    String sb3 = sb2.toString();
                                    kotlin.jvm.internal.k.d(sb3, "toString(...)");
                                    qVar.f8167a = r.f(sb3);
                                    linkedHashMap.put(str7, qVar);
                                } else {
                                    throw new IllegalArgumentException(("Query parameter " + str7 + " must only be present once in " + str6 + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str9 = this.f8164y.f8174a;
                        if (str9 != null) {
                            Uri parse2 = Uri.parse(str9);
                            kotlin.jvm.internal.k.d(parse2, "parse(...)");
                            if (parse2.getFragment() != null) {
                                ArrayList arrayList2 = new ArrayList();
                                Uri parse3 = Uri.parse(str9);
                                kotlin.jvm.internal.k.d(parse3, "parse(...)");
                                String fragment = parse3.getFragment();
                                StringBuilder sb4 = new StringBuilder();
                                kotlin.jvm.internal.k.b(fragment);
                                r.a(fragment, arrayList2, sb4);
                                return new he.i(arrayList2, sb4.toString());
                            }
                        }
                        return null;
                    case 4:
                        he.i iVar = (he.i) this.f8164y.j.getValue();
                        if (iVar == null || (list3 = (List) iVar.f6076x) == null) {
                            return new ArrayList();
                        }
                        return list3;
                    case 5:
                        he.i iVar2 = (he.i) this.f8164y.j.getValue();
                        if (iVar2 != null) {
                            return (String) iVar2.f6077y;
                        }
                        return null;
                    case 6:
                        String str10 = (String) this.f8164y.f8184l.getValue();
                        if (str10 != null) {
                            return new df.k(str10, 0);
                        }
                        return null;
                    default:
                        String str11 = this.f8164y.f8186n;
                        if (str11 != null) {
                            return new df.k(str11);
                        }
                        return null;
                }
            }
        });
        final int i13 = 4;
        this.f8183k = he.a.c(gVar, new ve.a(this) { // from class: l4.o

            /* renamed from: y, reason: collision with root package name */
            public final /* synthetic */ r f8164y;

            {
                this.f8164y = this;
            }

            /* JADX WARN: Type inference failed for: r1v20, types: [he.f, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v27, types: [he.f, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v34, types: [he.f, java.lang.Object] */
            @Override // ve.a
            public final Object invoke() {
                boolean z11;
                List list3;
                switch (i13) {
                    case 0:
                        String str4 = this.f8164y.f8178e;
                        if (str4 != null) {
                            return new df.k(str4, 0);
                        }
                        return null;
                    case 1:
                        String str5 = this.f8164y.f8174a;
                        if (str5 != null && r.f8173v.c(str5)) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        return Boolean.valueOf(z11);
                    case 2:
                        r rVar = this.f8164y;
                        String str6 = rVar.f8174a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) rVar.f8180g.getValue()).booleanValue()) {
                            kotlin.jvm.internal.k.b(str6);
                            Uri parse = Uri.parse(str6);
                            kotlin.jvm.internal.k.d(parse, "parse(...)");
                            for (String str7 : parse.getQueryParameterNames()) {
                                StringBuilder sb2 = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str7);
                                int i102 = 1;
                                if (queryParameters.size() <= 1) {
                                    String str8 = (String) ie.j.H(queryParameters);
                                    if (str8 == null) {
                                        rVar.f8182i = true;
                                        str8 = str7;
                                    }
                                    c6.h a10 = df.k.a(r.f8170r, str8);
                                    q qVar = new q();
                                    int i112 = 0;
                                    while (a10 != null) {
                                        df.h b10 = ((df.j) a10.f1983z).b(i102);
                                        kotlin.jvm.internal.k.b(b10);
                                        qVar.f8168b.add(b10.f4134a);
                                        if (a10.q().f709x > i112) {
                                            String substring = str8.substring(i112, a10.q().f709x);
                                            kotlin.jvm.internal.k.d(substring, "substring(...)");
                                            String quote = Pattern.quote(substring);
                                            kotlin.jvm.internal.k.d(quote, "quote(...)");
                                            sb2.append(quote);
                                        }
                                        sb2.append("([\\s\\S]+?)?");
                                        i112 = a10.q().f710y + 1;
                                        a10 = a10.t();
                                        i102 = 1;
                                    }
                                    if (i112 < str8.length()) {
                                        String substring2 = str8.substring(i112);
                                        kotlin.jvm.internal.k.d(substring2, "substring(...)");
                                        String quote2 = Pattern.quote(substring2);
                                        kotlin.jvm.internal.k.d(quote2, "quote(...)");
                                        sb2.append(quote2);
                                    }
                                    sb2.append("$");
                                    String sb3 = sb2.toString();
                                    kotlin.jvm.internal.k.d(sb3, "toString(...)");
                                    qVar.f8167a = r.f(sb3);
                                    linkedHashMap.put(str7, qVar);
                                } else {
                                    throw new IllegalArgumentException(("Query parameter " + str7 + " must only be present once in " + str6 + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str9 = this.f8164y.f8174a;
                        if (str9 != null) {
                            Uri parse2 = Uri.parse(str9);
                            kotlin.jvm.internal.k.d(parse2, "parse(...)");
                            if (parse2.getFragment() != null) {
                                ArrayList arrayList2 = new ArrayList();
                                Uri parse3 = Uri.parse(str9);
                                kotlin.jvm.internal.k.d(parse3, "parse(...)");
                                String fragment = parse3.getFragment();
                                StringBuilder sb4 = new StringBuilder();
                                kotlin.jvm.internal.k.b(fragment);
                                r.a(fragment, arrayList2, sb4);
                                return new he.i(arrayList2, sb4.toString());
                            }
                        }
                        return null;
                    case 4:
                        he.i iVar = (he.i) this.f8164y.j.getValue();
                        if (iVar == null || (list3 = (List) iVar.f6076x) == null) {
                            return new ArrayList();
                        }
                        return list3;
                    case 5:
                        he.i iVar2 = (he.i) this.f8164y.j.getValue();
                        if (iVar2 != null) {
                            return (String) iVar2.f6077y;
                        }
                        return null;
                    case 6:
                        String str10 = (String) this.f8164y.f8184l.getValue();
                        if (str10 != null) {
                            return new df.k(str10, 0);
                        }
                        return null;
                    default:
                        String str11 = this.f8164y.f8186n;
                        if (str11 != null) {
                            return new df.k(str11);
                        }
                        return null;
                }
            }
        });
        final int i14 = 5;
        this.f8184l = he.a.c(gVar, new ve.a(this) { // from class: l4.o

            /* renamed from: y, reason: collision with root package name */
            public final /* synthetic */ r f8164y;

            {
                this.f8164y = this;
            }

            /* JADX WARN: Type inference failed for: r1v20, types: [he.f, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v27, types: [he.f, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v34, types: [he.f, java.lang.Object] */
            @Override // ve.a
            public final Object invoke() {
                boolean z11;
                List list3;
                switch (i14) {
                    case 0:
                        String str4 = this.f8164y.f8178e;
                        if (str4 != null) {
                            return new df.k(str4, 0);
                        }
                        return null;
                    case 1:
                        String str5 = this.f8164y.f8174a;
                        if (str5 != null && r.f8173v.c(str5)) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        return Boolean.valueOf(z11);
                    case 2:
                        r rVar = this.f8164y;
                        String str6 = rVar.f8174a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) rVar.f8180g.getValue()).booleanValue()) {
                            kotlin.jvm.internal.k.b(str6);
                            Uri parse = Uri.parse(str6);
                            kotlin.jvm.internal.k.d(parse, "parse(...)");
                            for (String str7 : parse.getQueryParameterNames()) {
                                StringBuilder sb2 = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str7);
                                int i102 = 1;
                                if (queryParameters.size() <= 1) {
                                    String str8 = (String) ie.j.H(queryParameters);
                                    if (str8 == null) {
                                        rVar.f8182i = true;
                                        str8 = str7;
                                    }
                                    c6.h a10 = df.k.a(r.f8170r, str8);
                                    q qVar = new q();
                                    int i112 = 0;
                                    while (a10 != null) {
                                        df.h b10 = ((df.j) a10.f1983z).b(i102);
                                        kotlin.jvm.internal.k.b(b10);
                                        qVar.f8168b.add(b10.f4134a);
                                        if (a10.q().f709x > i112) {
                                            String substring = str8.substring(i112, a10.q().f709x);
                                            kotlin.jvm.internal.k.d(substring, "substring(...)");
                                            String quote = Pattern.quote(substring);
                                            kotlin.jvm.internal.k.d(quote, "quote(...)");
                                            sb2.append(quote);
                                        }
                                        sb2.append("([\\s\\S]+?)?");
                                        i112 = a10.q().f710y + 1;
                                        a10 = a10.t();
                                        i102 = 1;
                                    }
                                    if (i112 < str8.length()) {
                                        String substring2 = str8.substring(i112);
                                        kotlin.jvm.internal.k.d(substring2, "substring(...)");
                                        String quote2 = Pattern.quote(substring2);
                                        kotlin.jvm.internal.k.d(quote2, "quote(...)");
                                        sb2.append(quote2);
                                    }
                                    sb2.append("$");
                                    String sb3 = sb2.toString();
                                    kotlin.jvm.internal.k.d(sb3, "toString(...)");
                                    qVar.f8167a = r.f(sb3);
                                    linkedHashMap.put(str7, qVar);
                                } else {
                                    throw new IllegalArgumentException(("Query parameter " + str7 + " must only be present once in " + str6 + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str9 = this.f8164y.f8174a;
                        if (str9 != null) {
                            Uri parse2 = Uri.parse(str9);
                            kotlin.jvm.internal.k.d(parse2, "parse(...)");
                            if (parse2.getFragment() != null) {
                                ArrayList arrayList2 = new ArrayList();
                                Uri parse3 = Uri.parse(str9);
                                kotlin.jvm.internal.k.d(parse3, "parse(...)");
                                String fragment = parse3.getFragment();
                                StringBuilder sb4 = new StringBuilder();
                                kotlin.jvm.internal.k.b(fragment);
                                r.a(fragment, arrayList2, sb4);
                                return new he.i(arrayList2, sb4.toString());
                            }
                        }
                        return null;
                    case 4:
                        he.i iVar = (he.i) this.f8164y.j.getValue();
                        if (iVar == null || (list3 = (List) iVar.f6076x) == null) {
                            return new ArrayList();
                        }
                        return list3;
                    case 5:
                        he.i iVar2 = (he.i) this.f8164y.j.getValue();
                        if (iVar2 != null) {
                            return (String) iVar2.f6077y;
                        }
                        return null;
                    case 6:
                        String str10 = (String) this.f8164y.f8184l.getValue();
                        if (str10 != null) {
                            return new df.k(str10, 0);
                        }
                        return null;
                    default:
                        String str11 = this.f8164y.f8186n;
                        if (str11 != null) {
                            return new df.k(str11);
                        }
                        return null;
                }
            }
        });
        final int i15 = 6;
        this.f8185m = he.a.d(new ve.a(this) { // from class: l4.o

            /* renamed from: y, reason: collision with root package name */
            public final /* synthetic */ r f8164y;

            {
                this.f8164y = this;
            }

            /* JADX WARN: Type inference failed for: r1v20, types: [he.f, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v27, types: [he.f, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v34, types: [he.f, java.lang.Object] */
            @Override // ve.a
            public final Object invoke() {
                boolean z11;
                List list3;
                switch (i15) {
                    case 0:
                        String str4 = this.f8164y.f8178e;
                        if (str4 != null) {
                            return new df.k(str4, 0);
                        }
                        return null;
                    case 1:
                        String str5 = this.f8164y.f8174a;
                        if (str5 != null && r.f8173v.c(str5)) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        return Boolean.valueOf(z11);
                    case 2:
                        r rVar = this.f8164y;
                        String str6 = rVar.f8174a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) rVar.f8180g.getValue()).booleanValue()) {
                            kotlin.jvm.internal.k.b(str6);
                            Uri parse = Uri.parse(str6);
                            kotlin.jvm.internal.k.d(parse, "parse(...)");
                            for (String str7 : parse.getQueryParameterNames()) {
                                StringBuilder sb2 = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str7);
                                int i102 = 1;
                                if (queryParameters.size() <= 1) {
                                    String str8 = (String) ie.j.H(queryParameters);
                                    if (str8 == null) {
                                        rVar.f8182i = true;
                                        str8 = str7;
                                    }
                                    c6.h a10 = df.k.a(r.f8170r, str8);
                                    q qVar = new q();
                                    int i112 = 0;
                                    while (a10 != null) {
                                        df.h b10 = ((df.j) a10.f1983z).b(i102);
                                        kotlin.jvm.internal.k.b(b10);
                                        qVar.f8168b.add(b10.f4134a);
                                        if (a10.q().f709x > i112) {
                                            String substring = str8.substring(i112, a10.q().f709x);
                                            kotlin.jvm.internal.k.d(substring, "substring(...)");
                                            String quote = Pattern.quote(substring);
                                            kotlin.jvm.internal.k.d(quote, "quote(...)");
                                            sb2.append(quote);
                                        }
                                        sb2.append("([\\s\\S]+?)?");
                                        i112 = a10.q().f710y + 1;
                                        a10 = a10.t();
                                        i102 = 1;
                                    }
                                    if (i112 < str8.length()) {
                                        String substring2 = str8.substring(i112);
                                        kotlin.jvm.internal.k.d(substring2, "substring(...)");
                                        String quote2 = Pattern.quote(substring2);
                                        kotlin.jvm.internal.k.d(quote2, "quote(...)");
                                        sb2.append(quote2);
                                    }
                                    sb2.append("$");
                                    String sb3 = sb2.toString();
                                    kotlin.jvm.internal.k.d(sb3, "toString(...)");
                                    qVar.f8167a = r.f(sb3);
                                    linkedHashMap.put(str7, qVar);
                                } else {
                                    throw new IllegalArgumentException(("Query parameter " + str7 + " must only be present once in " + str6 + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str9 = this.f8164y.f8174a;
                        if (str9 != null) {
                            Uri parse2 = Uri.parse(str9);
                            kotlin.jvm.internal.k.d(parse2, "parse(...)");
                            if (parse2.getFragment() != null) {
                                ArrayList arrayList2 = new ArrayList();
                                Uri parse3 = Uri.parse(str9);
                                kotlin.jvm.internal.k.d(parse3, "parse(...)");
                                String fragment = parse3.getFragment();
                                StringBuilder sb4 = new StringBuilder();
                                kotlin.jvm.internal.k.b(fragment);
                                r.a(fragment, arrayList2, sb4);
                                return new he.i(arrayList2, sb4.toString());
                            }
                        }
                        return null;
                    case 4:
                        he.i iVar = (he.i) this.f8164y.j.getValue();
                        if (iVar == null || (list3 = (List) iVar.f6076x) == null) {
                            return new ArrayList();
                        }
                        return list3;
                    case 5:
                        he.i iVar2 = (he.i) this.f8164y.j.getValue();
                        if (iVar2 != null) {
                            return (String) iVar2.f6077y;
                        }
                        return null;
                    case 6:
                        String str10 = (String) this.f8164y.f8184l.getValue();
                        if (str10 != null) {
                            return new df.k(str10, 0);
                        }
                        return null;
                    default:
                        String str11 = this.f8164y.f8186n;
                        if (str11 != null) {
                            return new df.k(str11);
                        }
                        return null;
                }
            }
        });
        final int i16 = 7;
        this.f8187o = he.a.d(new ve.a(this) { // from class: l4.o

            /* renamed from: y, reason: collision with root package name */
            public final /* synthetic */ r f8164y;

            {
                this.f8164y = this;
            }

            /* JADX WARN: Type inference failed for: r1v20, types: [he.f, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v27, types: [he.f, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v34, types: [he.f, java.lang.Object] */
            @Override // ve.a
            public final Object invoke() {
                boolean z11;
                List list3;
                switch (i16) {
                    case 0:
                        String str4 = this.f8164y.f8178e;
                        if (str4 != null) {
                            return new df.k(str4, 0);
                        }
                        return null;
                    case 1:
                        String str5 = this.f8164y.f8174a;
                        if (str5 != null && r.f8173v.c(str5)) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        return Boolean.valueOf(z11);
                    case 2:
                        r rVar = this.f8164y;
                        String str6 = rVar.f8174a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) rVar.f8180g.getValue()).booleanValue()) {
                            kotlin.jvm.internal.k.b(str6);
                            Uri parse = Uri.parse(str6);
                            kotlin.jvm.internal.k.d(parse, "parse(...)");
                            for (String str7 : parse.getQueryParameterNames()) {
                                StringBuilder sb2 = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str7);
                                int i102 = 1;
                                if (queryParameters.size() <= 1) {
                                    String str8 = (String) ie.j.H(queryParameters);
                                    if (str8 == null) {
                                        rVar.f8182i = true;
                                        str8 = str7;
                                    }
                                    c6.h a10 = df.k.a(r.f8170r, str8);
                                    q qVar = new q();
                                    int i112 = 0;
                                    while (a10 != null) {
                                        df.h b10 = ((df.j) a10.f1983z).b(i102);
                                        kotlin.jvm.internal.k.b(b10);
                                        qVar.f8168b.add(b10.f4134a);
                                        if (a10.q().f709x > i112) {
                                            String substring = str8.substring(i112, a10.q().f709x);
                                            kotlin.jvm.internal.k.d(substring, "substring(...)");
                                            String quote = Pattern.quote(substring);
                                            kotlin.jvm.internal.k.d(quote, "quote(...)");
                                            sb2.append(quote);
                                        }
                                        sb2.append("([\\s\\S]+?)?");
                                        i112 = a10.q().f710y + 1;
                                        a10 = a10.t();
                                        i102 = 1;
                                    }
                                    if (i112 < str8.length()) {
                                        String substring2 = str8.substring(i112);
                                        kotlin.jvm.internal.k.d(substring2, "substring(...)");
                                        String quote2 = Pattern.quote(substring2);
                                        kotlin.jvm.internal.k.d(quote2, "quote(...)");
                                        sb2.append(quote2);
                                    }
                                    sb2.append("$");
                                    String sb3 = sb2.toString();
                                    kotlin.jvm.internal.k.d(sb3, "toString(...)");
                                    qVar.f8167a = r.f(sb3);
                                    linkedHashMap.put(str7, qVar);
                                } else {
                                    throw new IllegalArgumentException(("Query parameter " + str7 + " must only be present once in " + str6 + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str9 = this.f8164y.f8174a;
                        if (str9 != null) {
                            Uri parse2 = Uri.parse(str9);
                            kotlin.jvm.internal.k.d(parse2, "parse(...)");
                            if (parse2.getFragment() != null) {
                                ArrayList arrayList2 = new ArrayList();
                                Uri parse3 = Uri.parse(str9);
                                kotlin.jvm.internal.k.d(parse3, "parse(...)");
                                String fragment = parse3.getFragment();
                                StringBuilder sb4 = new StringBuilder();
                                kotlin.jvm.internal.k.b(fragment);
                                r.a(fragment, arrayList2, sb4);
                                return new he.i(arrayList2, sb4.toString());
                            }
                        }
                        return null;
                    case 4:
                        he.i iVar = (he.i) this.f8164y.j.getValue();
                        if (iVar == null || (list3 = (List) iVar.f6076x) == null) {
                            return new ArrayList();
                        }
                        return list3;
                    case 5:
                        he.i iVar2 = (he.i) this.f8164y.j.getValue();
                        if (iVar2 != null) {
                            return (String) iVar2.f6077y;
                        }
                        return null;
                    case 6:
                        String str10 = (String) this.f8164y.f8184l.getValue();
                        if (str10 != null) {
                            return new df.k(str10, 0);
                        }
                        return null;
                    default:
                        String str11 = this.f8164y.f8186n;
                        if (str11 != null) {
                            return new df.k(str11);
                        }
                        return null;
                }
            }
        });
        if (str != null) {
            StringBuilder sb2 = new StringBuilder("^");
            df.k kVar = f8169q;
            kVar.getClass();
            if (!kVar.f4139x.matcher(str).find()) {
                String pattern = s.f4139x.pattern();
                kotlin.jvm.internal.k.d(pattern, "pattern(...)");
                sb2.append(pattern);
            }
            c6.h a10 = df.k.a(new df.k("(\\?|#|$)"), str);
            if (a10 != null) {
                String substring = str.substring(0, a10.q().f709x);
                kotlin.jvm.internal.k.d(substring, "substring(...)");
                a(substring, arrayList, sb2);
                df.k kVar2 = f8171t;
                kVar2.getClass();
                if (!kVar2.f4139x.matcher(sb2).find()) {
                    df.k kVar3 = f8172u;
                    kVar3.getClass();
                    if (!kVar3.f4139x.matcher(sb2).find()) {
                        z10 = true;
                        this.f8188p = z10;
                        sb2.append("($|(\\?(.)*)|(#(.)*))");
                    }
                }
                z10 = false;
                this.f8188p = z10;
                sb2.append("($|(\\?(.)*)|(#(.)*))");
            }
            String sb3 = sb2.toString();
            kotlin.jvm.internal.k.d(sb3, "toString(...)");
            this.f8178e = f(sb3);
        }
        if (str3 == null) {
            return;
        }
        Pattern compile = Pattern.compile("^[\\s\\S]+/[\\s\\S]+$");
        kotlin.jvm.internal.k.d(compile, "compile(...)");
        if (compile.matcher(str3).matches()) {
            Pattern compile2 = Pattern.compile("/");
            kotlin.jvm.internal.k.d(compile2, "compile(...)");
            Matcher matcher = compile2.matcher(str3);
            if (!matcher.find()) {
                list = a8.g.m(str3.toString());
            } else {
                ArrayList arrayList2 = new ArrayList(10);
                int i17 = 0;
                do {
                    arrayList2.add(str3.subSequence(i17, matcher.start()).toString());
                    i17 = matcher.end();
                } while (matcher.find());
                arrayList2.add(str3.subSequence(i17, str3.length()).toString());
                list = arrayList2;
            }
            if (!list.isEmpty()) {
                ListIterator listIterator = list.listIterator(list.size());
                while (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        list2 = ie.j.U(listIterator.nextIndex() + 1, list);
                        break;
                    }
                }
            }
            list2 = ie.r.f6846x;
            this.f8186n = df.u.F("^(" + ((String) list2.get(0)) + "|[*]+)/(" + ((String) list2.get(1)) + "|[*]+)$", "*|[*]", "[\\s\\S]");
            return;
        }
        throw new IllegalArgumentException(h8.c.m("The given mimeType ", str3, " does not match to required \"type/subtype\" format").toString());
    }

    public static void a(String str, ArrayList arrayList, StringBuilder sb2) {
        int i6 = 0;
        for (c6.h a10 = df.k.a(f8170r, str); a10 != null; a10 = a10.t()) {
            df.h b10 = ((df.j) a10.f1983z).b(1);
            kotlin.jvm.internal.k.b(b10);
            arrayList.add(b10.f4134a);
            if (a10.q().f709x > i6) {
                String substring = str.substring(i6, a10.q().f709x);
                kotlin.jvm.internal.k.d(substring, "substring(...)");
                String quote = Pattern.quote(substring);
                kotlin.jvm.internal.k.d(quote, "quote(...)");
                sb2.append(quote);
            }
            String pattern = f8172u.f4139x.pattern();
            kotlin.jvm.internal.k.d(pattern, "pattern(...)");
            sb2.append(pattern);
            i6 = a10.q().f710y + 1;
        }
        if (i6 < str.length()) {
            String substring2 = str.substring(i6);
            kotlin.jvm.internal.k.d(substring2, "substring(...)");
            String quote2 = Pattern.quote(substring2);
            kotlin.jvm.internal.k.d(quote2, "quote(...)");
            sb2.append(quote2);
        }
    }

    public static void e(Bundle bundle, String key, String str, g gVar) {
        if (gVar != null) {
            g0 g0Var = gVar.f8120a;
            kotlin.jvm.internal.k.e(key, "key");
            g0Var.e(bundle, key, g0Var.d(str));
            return;
        }
        c9.a.n(key, str, bundle);
    }

    public static String f(String str) {
        if (df.m.I(str, "\\Q", false) && df.m.I(str, "\\E", false)) {
            return df.u.F(str, ".*", "\\E.*\\Q");
        }
        if (df.m.I(str, "\\.\\*", false)) {
            return df.u.F(str, "\\.\\*", ".*");
        }
        return str;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [he.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [he.f, java.lang.Object] */
    public final ArrayList b() {
        Collection values = ((Map) this.f8181h.getValue()).values();
        ArrayList arrayList = new ArrayList();
        Iterator it = values.iterator();
        while (it.hasNext()) {
            ie.p.z(((q) it.next()).f8168b, arrayList);
        }
        return ie.j.P((List) this.f8183k.getValue(), ie.j.P(arrayList, this.f8177d));
    }

    public final boolean c(c6.h hVar, Bundle bundle, Map map) {
        ArrayList arrayList = this.f8177d;
        ArrayList arrayList2 = new ArrayList(ie.l.x(arrayList, 10));
        int size = arrayList.size();
        int i6 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            int i11 = i6 + 1;
            String str = null;
            if (i6 >= 0) {
                String str2 = (String) obj;
                df.h b10 = ((df.j) hVar.f1983z).b(i11);
                if (b10 != null) {
                    str = Uri.decode(b10.f4134a);
                    kotlin.jvm.internal.k.d(str, "decode(...)");
                }
                if (str == null) {
                    str = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                try {
                    e(bundle, str2, str, (g) map.get(str2));
                    arrayList2.add(he.y.f6101a);
                    i6 = i11;
                } catch (IllegalArgumentException unused) {
                    return false;
                }
            } else {
                ie.k.w();
                throw null;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00df A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v0, types: [he.f, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(android.net.Uri r20, android.os.Bundle r21, java.util.Map r22) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.r.d(android.net.Uri, android.os.Bundle, java.util.Map):boolean");
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof r)) {
            r rVar = (r) obj;
            if (kotlin.jvm.internal.k.a(this.f8174a, rVar.f8174a) && kotlin.jvm.internal.k.a(this.f8175b, rVar.f8175b) && kotlin.jvm.internal.k.a(this.f8176c, rVar.f8176c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i6;
        int i10;
        int i11 = 0;
        String str = this.f8174a;
        if (str != null) {
            i6 = str.hashCode();
        } else {
            i6 = 0;
        }
        int i12 = i6 * 31;
        String str2 = this.f8175b;
        if (str2 != null) {
            i10 = str2.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (i12 + i10) * 31;
        String str3 = this.f8176c;
        if (str3 != null) {
            i11 = str3.hashCode();
        }
        return i13 + i11;
    }
}
