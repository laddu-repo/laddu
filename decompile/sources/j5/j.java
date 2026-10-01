package j5;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HashMap f6846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HashMap f6847d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f6848e;
    public HashMap f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f6849g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public v.j f6850h;
    public v.g i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayList f6851j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Rect f6852k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f6853l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f6854m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f6855n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f6856o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f6844a = new e0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f6845b = new HashSet();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f6857p = 0;

    public final void a(String str) {
        v5.c.b(str);
        this.f6845b.add(str);
    }

    public final float b() {
        return (long) (((this.f6854m - this.f6853l) / this.f6855n) * 1000.0f);
    }

    public final Map c() {
        float fC = v5.i.c();
        if (fC != this.f6848e) {
            for (Map.Entry entry : this.f6847d.entrySet()) {
                HashMap map = this.f6847d;
                String str = (String) entry.getKey();
                y yVar = (y) entry.getValue();
                float f = this.f6848e / fC;
                int i = (int) (yVar.f6915a * f);
                int i10 = (int) (yVar.f6916b * f);
                y yVar2 = new y(i, i10, yVar.f6917c, yVar.f6918d, yVar.f6919e);
                Bitmap bitmap = yVar.f;
                if (bitmap != null) {
                    yVar2.f = Bitmap.createScaledBitmap(bitmap, i, i10, true);
                }
                map.put(str, yVar2);
            }
        }
        this.f6848e = fC;
        return this.f6847d;
    }

    public final o5.h d(String str) {
        int size = this.f6849g.size();
        for (int i = 0; i < size; i++) {
            o5.h hVar = (o5.h) this.f6849g.get(i);
            String str2 = hVar.f9955a;
            if (str2.equalsIgnoreCase(str) || (str2.endsWith("\r") && str2.substring(0, str2.length() - 1).equalsIgnoreCase(str))) {
                return hVar;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LottieComposition:\n");
        ArrayList arrayList = this.f6851j;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            sb2.append(((r5.d) obj).a("\t"));
        }
        return sb2.toString();
    }
}
