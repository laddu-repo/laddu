package b7;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: c, reason: collision with root package name */
    public HashMap f1544c;

    /* renamed from: d, reason: collision with root package name */
    public HashMap f1545d;

    /* renamed from: e, reason: collision with root package name */
    public float f1546e;

    /* renamed from: f, reason: collision with root package name */
    public HashMap f1547f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f1548g;

    /* renamed from: h, reason: collision with root package name */
    public v.m f1549h;

    /* renamed from: i, reason: collision with root package name */
    public v.i f1550i;
    public ArrayList j;

    /* renamed from: k, reason: collision with root package name */
    public Rect f1551k;

    /* renamed from: l, reason: collision with root package name */
    public float f1552l;

    /* renamed from: m, reason: collision with root package name */
    public float f1553m;

    /* renamed from: n, reason: collision with root package name */
    public float f1554n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1555o;

    /* renamed from: a, reason: collision with root package name */
    public final g0 f1542a = new g0();

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f1543b = new HashSet();

    /* renamed from: p, reason: collision with root package name */
    public int f1556p = 0;

    public final void a(String str) {
        n7.c.b(str);
        this.f1543b.add(str);
    }

    public final float b() {
        return ((this.f1553m - this.f1552l) / this.f1554n) * 1000.0f;
    }

    public final Map c() {
        float c10 = n7.i.c();
        if (c10 != this.f1546e) {
            for (Map.Entry entry : this.f1545d.entrySet()) {
                HashMap hashMap = this.f1545d;
                String str = (String) entry.getKey();
                a0 a0Var = (a0) entry.getValue();
                float f3 = this.f1546e / c10;
                int i6 = (int) (a0Var.f1484a * f3);
                int i10 = (int) (a0Var.f1485b * f3);
                a0 a0Var2 = new a0(i6, i10, a0Var.f1486c, a0Var.f1487d, a0Var.f1488e);
                Bitmap bitmap = a0Var.f1489f;
                if (bitmap != null) {
                    a0Var2.f1489f = Bitmap.createScaledBitmap(bitmap, i6, i10, true);
                }
                hashMap.put(str, a0Var2);
            }
        }
        this.f1546e = c10;
        return this.f1545d;
    }

    public final g7.h d(String str) {
        int size = this.f1548g.size();
        for (int i6 = 0; i6 < size; i6++) {
            g7.h hVar = (g7.h) this.f1548g.get(i6);
            String str2 = hVar.f5510a;
            if (str2.equalsIgnoreCase(str) || (str2.endsWith("\r") && str2.substring(0, str2.length() - 1).equalsIgnoreCase(str))) {
                return hVar;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LottieComposition:\n");
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            sb2.append(((j7.d) obj).a("\t"));
        }
        return sb2.toString();
    }
}
