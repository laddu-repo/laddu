package ef;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f5038d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f5039e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f5040g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f5041h;

    public s(String str, String str2, String str3, String str4, int i, ArrayList arrayList, String str5, String str6) {
        this.f5035a = str;
        this.f5036b = str2;
        this.f5037c = str3;
        this.f5038d = str4;
        this.f5039e = i;
        this.f = arrayList;
        this.f5040g = str5;
        this.f5041h = str6;
    }

    public final String a() {
        if (this.f5037c.length() == 0) {
            return "";
        }
        int length = this.f5035a.length() + 3;
        String str = this.f5041h;
        String strSubstring = str.substring(ke.h.I(str, ':', length, 4) + 1, ke.h.I(str, '@', 0, 6));
        de.i.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final String b() {
        int length = this.f5035a.length() + 3;
        String str = this.f5041h;
        int I = ke.h.I(str, '/', length, 4);
        String strSubstring = str.substring(I, ff.d.c(I, str.length(), str, "?#"));
        de.i.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final ArrayList c() {
        int length = this.f5035a.length() + 3;
        String str = this.f5041h;
        int I = ke.h.I(str, '/', length, 4);
        int iC = ff.d.c(I, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (I < iC) {
            int i = I + 1;
            int iD = ff.d.d(str, '/', i, iC);
            String strSubstring = str.substring(i, iD);
            de.i.d(strSubstring, "substring(...)");
            arrayList.add(strSubstring);
            I = iD;
        }
        return arrayList;
    }

    public final String d() {
        if (this.f == null) {
            return null;
        }
        String str = this.f5041h;
        int I = ke.h.I(str, '?', 0, 6) + 1;
        String strSubstring = str.substring(I, ff.d.d(str, '#', I, str.length()));
        de.i.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final String e() {
        if (this.f5036b.length() == 0) {
            return "";
        }
        int length = this.f5035a.length() + 3;
        String str = this.f5041h;
        String strSubstring = str.substring(length, ff.d.c(length, str.length(), str, ":@"));
        de.i.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof s) && de.i.a(((s) obj).f5041h, this.f5041h);
    }

    public final String f() {
        r rVar;
        try {
            rVar = new r(0);
            rVar.e(this, "/...");
        } catch (IllegalArgumentException unused) {
            rVar = null;
        }
        de.i.b(rVar);
        rVar.f5031d = uf.a.a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", 123);
        rVar.f5032e = uf.a.a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", 123);
        return rVar.b().f5041h;
    }

    public final URI g() {
        String strSubstring;
        String strReplaceAll;
        r rVar = new r(0);
        ArrayList arrayList = (ArrayList) rVar.f5034h;
        String str = this.f5035a;
        rVar.f5030c = str;
        rVar.f5031d = e();
        rVar.f5032e = a();
        rVar.f = this.f5038d;
        de.i.e(str, "scheme");
        int i = str.equals("http") ? 80 : str.equals("https") ? 443 : -1;
        int i10 = this.f5039e;
        rVar.f5029b = i10 != i ? i10 : -1;
        arrayList.clear();
        arrayList.addAll(c());
        String strD = d();
        rVar.i = strD != null ? r.f(uf.a.a(strD, 0, 0, " \"'<>#", 83)) : null;
        if (this.f5040g == null) {
            strSubstring = null;
        } else {
            String str2 = this.f5041h;
            strSubstring = str2.substring(ke.h.I(str2, '#', 0, 6) + 1);
            de.i.d(strSubstring, "substring(...)");
        }
        rVar.f5033g = strSubstring;
        String str3 = (String) rVar.f;
        if (str3 != null) {
            Pattern patternCompile = Pattern.compile("[\"<>^`{|}]");
            de.i.d(patternCompile, "compile(...)");
            strReplaceAll = patternCompile.matcher(str3).replaceAll("");
            de.i.d(strReplaceAll, "replaceAll(...)");
        } else {
            strReplaceAll = null;
        }
        rVar.f = strReplaceAll;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.set(i11, uf.a.a((String) arrayList.get(i11), 0, 0, "[]", 99));
        }
        ArrayList arrayList2 = (ArrayList) rVar.i;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                String str4 = (String) arrayList2.get(i12);
                arrayList2.set(i12, str4 != null ? uf.a.a(str4, 0, 0, "\\^`{|}", 67) : null);
            }
        }
        String str5 = (String) rVar.f5033g;
        rVar.f5033g = str5 != null ? uf.a.a(str5, 0, 0, " \"#<>\\^`{|}", 35) : null;
        String string = rVar.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e7) {
            try {
                Pattern patternCompile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                de.i.d(patternCompile2, "compile(...)");
                de.i.e(string, "input");
                String strReplaceAll2 = patternCompile2.matcher(string).replaceAll("");
                de.i.d(strReplaceAll2, "replaceAll(...)");
                URI uriCreate = URI.create(strReplaceAll2);
                de.i.b(uriCreate);
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e7);
            }
        }
    }

    public final int hashCode() {
        return this.f5041h.hashCode();
    }

    public final String toString() {
        return this.f5041h;
    }
}
