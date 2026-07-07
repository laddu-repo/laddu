package ef;

import android.util.StateSet;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f5030c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Serializable f5031d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Serializable f5032e;
    public Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f5033g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f5034h;
    public Object i;

    public r(o9.m mVar) {
        this.f5028a = 1;
        d();
        a(StateSet.WILD_CARD, mVar);
    }

    public static ArrayList f(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int I = ke.h.I(str, '&', i, 4);
            if (I == -1) {
                I = str.length();
            }
            int I2 = ke.h.I(str, '=', i, 4);
            if (I2 == -1 || I2 > I) {
                String strSubstring = str.substring(i, I);
                de.i.d(strSubstring, "substring(...)");
                arrayList.add(strSubstring);
                arrayList.add(null);
            } else {
                String strSubstring2 = str.substring(i, I2);
                de.i.d(strSubstring2, "substring(...)");
                arrayList.add(strSubstring2);
                String strSubstring3 = str.substring(I2 + 1, I);
                de.i.d(strSubstring3, "substring(...)");
                arrayList.add(strSubstring3);
            }
            i = I + 1;
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.Serializable, java.lang.Object, o9.m[]] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int[][], java.io.Serializable, java.lang.Object] */
    public void a(int[] iArr, o9.m mVar) {
        int i = this.f5029b;
        if (i == 0 || iArr.length == 0) {
            this.f5030c = mVar;
        }
        int[][] iArr2 = (int[][]) this.f5031d;
        if (i >= iArr2.length) {
            int i10 = i + 10;
            ?? r32 = new int[i10][];
            System.arraycopy(iArr2, 0, r32, 0, i);
            this.f5031d = r32;
            ?? r12 = new o9.m[i10];
            System.arraycopy((o9.m[]) this.f5032e, 0, r12, 0, i);
            this.f5032e = r12;
        }
        int[][] iArr3 = (int[][]) this.f5031d;
        int i11 = this.f5029b;
        iArr3[i11] = iArr;
        ((o9.m[]) this.f5032e)[i11] = mVar;
        this.f5029b = i11 + 1;
    }

    public s b() {
        ArrayList arrayList;
        String str = (String) this.f5030c;
        if (str == null) {
            throw new IllegalStateException("scheme == null");
        }
        String strD = uf.a.d((String) this.f5031d, 0, 0, 7);
        String strD2 = uf.a.d((String) this.f5032e, 0, 0, 7);
        String str2 = (String) this.f;
        if (str2 == null) {
            throw new IllegalStateException("host == null");
        }
        int iC = c();
        ArrayList arrayList2 = (ArrayList) this.f5034h;
        ArrayList arrayList3 = new ArrayList(pd.l.C(arrayList2, 10));
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            arrayList3.add(uf.a.d((String) obj, 0, 0, 7));
        }
        ArrayList arrayList4 = (ArrayList) this.i;
        if (arrayList4 != null) {
            ArrayList arrayList5 = new ArrayList(pd.l.C(arrayList4, 10));
            int size2 = arrayList4.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList4.get(i10);
                i10++;
                String str3 = (String) obj2;
                arrayList5.add(str3 != null ? uf.a.d(str3, 0, 0, 3) : null);
            }
            arrayList = arrayList5;
        } else {
            arrayList = null;
        }
        String str4 = (String) this.f5033g;
        return new s(str, strD, strD2, str2, iC, arrayList, str4 != null ? uf.a.d(str4, 0, 0, 7) : null, toString());
    }

    public int c() {
        int i = this.f5029b;
        if (i != -1) {
            return i;
        }
        String str = (String) this.f5030c;
        de.i.b(str);
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Serializable, o9.m[]] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int[][], java.io.Serializable] */
    public void d() {
        this.f5030c = new o9.m();
        this.f5031d = new int[10][];
        this.f5032e = new o9.m[10];
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(ef.s r18, java.lang.String r19) {
        /*
            Method dump skipped, instruction units count: 927
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ef.r.e(ef.s, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ef.r.toString():java.lang.String");
    }

    public r(int i) {
        this.f5028a = i;
        switch (i) {
            case 1:
                break;
            default:
                this.f5031d = "";
                this.f5032e = "";
                this.f5029b = -1;
                this.f5034h = new ArrayList(new pd.g(new String[]{""}, true));
                break;
        }
    }
}
