package s2;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c4.d f11478g = new c4.d(16);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c4.d f11479h = new c4.d(17);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11483d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f11484e;
    public int f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r[] f11481b = new r[5];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f11480a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11482c = -1;

    public final void a(int i, float f) {
        r rVar;
        int i10 = this.f11482c;
        ArrayList arrayList = this.f11480a;
        if (i10 != 1) {
            Collections.sort(arrayList, f11478g);
            this.f11482c = 1;
        }
        int i11 = this.f;
        r[] rVarArr = this.f11481b;
        if (i11 > 0) {
            int i12 = i11 - 1;
            this.f = i12;
            rVar = rVarArr[i12];
        } else {
            rVar = new r();
        }
        int i13 = this.f11483d;
        this.f11483d = i13 + 1;
        rVar.f11475a = i13;
        rVar.f11476b = i;
        rVar.f11477c = f;
        arrayList.add(rVar);
        this.f11484e += i;
        while (true) {
            int i14 = this.f11484e;
            if (i14 <= 2000) {
                return;
            }
            int i15 = i14 - 2000;
            r rVar2 = (r) arrayList.get(0);
            int i16 = rVar2.f11476b;
            if (i16 <= i15) {
                this.f11484e -= i16;
                arrayList.remove(0);
                int i17 = this.f;
                if (i17 < 5) {
                    this.f = i17 + 1;
                    rVarArr[i17] = rVar2;
                }
            } else {
                rVar2.f11476b = i16 - i15;
                this.f11484e -= i15;
            }
        }
    }

    public final float b() {
        int i = this.f11482c;
        ArrayList arrayList = this.f11480a;
        if (i != 0) {
            Collections.sort(arrayList, f11479h);
            this.f11482c = 0;
        }
        float f = 0.5f * this.f11484e;
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            r rVar = (r) arrayList.get(i11);
            i10 += rVar.f11476b;
            if (i10 >= f) {
                return rVar.f11477c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((r) arrayList.get(arrayList.size() - 1)).f11477c;
    }
}
