package b0;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: f, reason: collision with root package name */
    public static int f1254f;

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f1255a;

    /* renamed from: b, reason: collision with root package name */
    public int f1256b;

    /* renamed from: c, reason: collision with root package name */
    public int f1257c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f1258d;

    /* renamed from: e, reason: collision with root package name */
    public int f1259e;

    public final void a(ArrayList arrayList) {
        int size = this.f1255a.size();
        if (this.f1259e != -1 && size > 0) {
            for (int i6 = 0; i6 < arrayList.size(); i6++) {
                n nVar = (n) arrayList.get(i6);
                if (this.f1259e == nVar.f1256b) {
                    c(this.f1257c, nVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(y.c cVar, int i6) {
        int n10;
        int n11;
        ArrayList arrayList = this.f1255a;
        if (arrayList.size() == 0) {
            return 0;
        }
        a0.e eVar = (a0.e) ((a0.d) arrayList.get(0)).T;
        cVar.t();
        eVar.b(cVar, false);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((a0.d) arrayList.get(i10)).b(cVar, false);
        }
        if (i6 == 0 && eVar.f78z0 > 0) {
            a0.j.a(eVar, cVar, arrayList, 0);
        }
        if (i6 == 1 && eVar.A0 > 0) {
            a0.j.a(eVar, cVar, arrayList, 1);
        }
        try {
            cVar.p();
        } catch (Exception e10) {
            System.err.println(e10.toString() + "\n" + Arrays.toString(e10.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", HttpUrl.FRAGMENT_ENCODE_SET));
        }
        this.f1258d = new ArrayList();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            a0.d dVar = (a0.d) arrayList.get(i11);
            ua.f fVar = new ua.f(5);
            new WeakReference(dVar);
            y.c.n(dVar.I);
            y.c.n(dVar.J);
            y.c.n(dVar.K);
            y.c.n(dVar.L);
            y.c.n(dVar.M);
            this.f1258d.add(fVar);
        }
        if (i6 == 0) {
            n10 = y.c.n(eVar.I);
            n11 = y.c.n(eVar.K);
            cVar.t();
        } else {
            n10 = y.c.n(eVar.J);
            n11 = y.c.n(eVar.L);
            cVar.t();
        }
        return n11 - n10;
    }

    public final void c(int i6, n nVar) {
        int i10 = nVar.f1256b;
        ArrayList arrayList = this.f1255a;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            a0.d dVar = (a0.d) obj;
            ArrayList arrayList2 = nVar.f1255a;
            if (!arrayList2.contains(dVar)) {
                arrayList2.add(dVar);
            }
            if (i6 == 0) {
                dVar.f56n0 = i10;
            } else {
                dVar.o0 = i10;
            }
        }
        this.f1259e = i10;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        int i6 = this.f1257c;
        if (i6 == 0) {
            str = "Horizontal";
        } else if (i6 == 1) {
            str = "Vertical";
        } else if (i6 == 2) {
            str = "Both";
        } else {
            str = "Unknown";
        }
        sb2.append(str);
        sb2.append(" [");
        String l10 = r4.a.l(sb2, this.f1256b, "] <");
        ArrayList arrayList = this.f1255a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            l10 = l10 + " " + ((a0.d) obj).f45h0;
        }
        return w8.k.c(l10, " >");
    }
}
