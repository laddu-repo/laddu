package u2;

import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: g, reason: collision with root package name */
    public static final d2.a f12877g = new d2.a(16);

    /* renamed from: h, reason: collision with root package name */
    public static final d2.a f12878h = new d2.a(17);

    /* renamed from: d, reason: collision with root package name */
    public int f12882d;

    /* renamed from: e, reason: collision with root package name */
    public int f12883e;

    /* renamed from: f, reason: collision with root package name */
    public int f12884f;

    /* renamed from: b, reason: collision with root package name */
    public final s[] f12880b = new s[5];

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f12879a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public int f12881c = -1;

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(int i6, float f3) {
        s sVar;
        int i10 = this.f12881c;
        ArrayList arrayList = this.f12879a;
        if (i10 != 1) {
            Collections.sort(arrayList, f12877g);
            this.f12881c = 1;
        }
        int i11 = this.f12884f;
        s[] sVarArr = this.f12880b;
        if (i11 > 0) {
            int i12 = i11 - 1;
            this.f12884f = i12;
            sVar = sVarArr[i12];
        } else {
            sVar = new Object();
        }
        int i13 = this.f12882d;
        this.f12882d = i13 + 1;
        sVar.f12874a = i13;
        sVar.f12875b = i6;
        sVar.f12876c = f3;
        arrayList.add(sVar);
        this.f12883e += i6;
        while (true) {
            int i14 = this.f12883e;
            if (i14 > 2000) {
                int i15 = i14 - 2000;
                s sVar2 = (s) arrayList.get(0);
                int i16 = sVar2.f12875b;
                if (i16 <= i15) {
                    this.f12883e -= i16;
                    arrayList.remove(0);
                    int i17 = this.f12884f;
                    if (i17 < 5) {
                        this.f12884f = i17 + 1;
                        sVarArr[i17] = sVar2;
                    }
                } else {
                    sVar2.f12875b = i16 - i15;
                    this.f12883e -= i15;
                }
            } else {
                return;
            }
        }
    }

    public final float b() {
        int i6 = this.f12881c;
        ArrayList arrayList = this.f12879a;
        if (i6 != 0) {
            Collections.sort(arrayList, f12878h);
            this.f12881c = 0;
        }
        float f3 = 0.5f * this.f12883e;
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            s sVar = (s) arrayList.get(i11);
            i10 += sVar.f12875b;
            if (i10 >= f3) {
                return sVar.f12876c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((s) arrayList.get(arrayList.size() - 1)).f12876c;
    }
}
