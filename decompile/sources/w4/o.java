package w4;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f13963a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f13964b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f13965c;

    /* renamed from: d, reason: collision with root package name */
    public final c f13966d;

    /* renamed from: e, reason: collision with root package name */
    public final int f13967e;

    /* renamed from: f, reason: collision with root package name */
    public final int f13968f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f13969g;

    public o(c cVar, ArrayList arrayList, int[] iArr, int[] iArr2) {
        n nVar;
        int i6;
        n nVar2;
        int i10;
        int i11;
        int i12;
        this.f13963a = arrayList;
        this.f13964b = iArr;
        this.f13965c = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.f13966d = cVar;
        d dVar = (d) cVar.f13822a;
        int size = dVar.f13845x.size();
        this.f13967e = size;
        int size2 = dVar.f13846y.size();
        this.f13968f = size2;
        this.f13969g = true;
        if (arrayList.isEmpty()) {
            nVar = null;
        } else {
            nVar = (n) arrayList.get(0);
        }
        if (nVar == null || nVar.f13959a != 0 || nVar.f13960b != 0) {
            arrayList.add(0, new n(0, 0, 0));
        }
        arrayList.add(new n(size, size2, 0));
        int size3 = arrayList.size();
        int i13 = 0;
        while (i13 < size3) {
            Object obj = arrayList.get(i13);
            i13++;
            n nVar3 = (n) obj;
            for (int i14 = 0; i14 < nVar3.f13961c; i14++) {
                int i15 = nVar3.f13959a + i14;
                int i16 = nVar3.f13960b + i14;
                if (cVar.b(i15, i16)) {
                    i12 = 1;
                } else {
                    i12 = 2;
                }
                iArr[i15] = (i16 << 4) | i12;
                iArr2[i16] = (i15 << 4) | i12;
            }
        }
        if (this.f13969g) {
            int size4 = arrayList.size();
            int i17 = 0;
            int i18 = 0;
            while (i18 < size4) {
                Object obj2 = arrayList.get(i18);
                i18++;
                n nVar4 = (n) obj2;
                while (true) {
                    i6 = nVar4.f13959a;
                    if (i17 < i6) {
                        if (iArr[i17] == 0) {
                            int size5 = arrayList.size();
                            int i19 = 0;
                            int i20 = 0;
                            while (true) {
                                if (i19 < size5) {
                                    nVar2 = (n) arrayList.get(i19);
                                    while (true) {
                                        i10 = nVar2.f13960b;
                                        if (i20 < i10) {
                                            if (iArr2[i20] == 0 && cVar.c(i17, i20)) {
                                                if (cVar.b(i17, i20)) {
                                                    i11 = 8;
                                                } else {
                                                    i11 = 4;
                                                }
                                                iArr[i17] = (i20 << 4) | i11;
                                                iArr2[i20] = i11 | (i17 << 4);
                                            } else {
                                                i20++;
                                            }
                                        }
                                    }
                                }
                                i20 = nVar2.f13961c + i10;
                                i19++;
                            }
                        }
                        i17++;
                    }
                }
                i17 = nVar4.f13961c + i6;
            }
        }
    }

    public static p a(ArrayDeque arrayDeque, int i6, boolean z10) {
        p pVar;
        Iterator it = arrayDeque.iterator();
        while (true) {
            if (it.hasNext()) {
                pVar = (p) it.next();
                if (pVar.f13979a == i6 && pVar.f13981c == z10) {
                    it.remove();
                    break;
                }
            } else {
                pVar = null;
                break;
            }
        }
        while (it.hasNext()) {
            p pVar2 = (p) it.next();
            if (z10) {
                pVar2.f13980b--;
            } else {
                pVar2.f13980b++;
            }
        }
        return pVar;
    }
}
