package d2;

import db.a1;
import db.x;
import db.z;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import k4.b0;
import r1.q;
import u2.s;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Comparator {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f3694x;

    public /* synthetic */ a(int i6) {
        this.f3694x = i6;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        a1 a10;
        switch (this.f3694x) {
            case 0:
                e2.b bVar = (e2.b) obj;
                e2.b bVar2 = (e2.b) obj2;
                int compare = Integer.compare(bVar.f4212c, bVar2.f4212c);
                if (compare == 0) {
                    return bVar.f4211b.compareTo(bVar2.f4211b);
                }
                return compare;
            case 1:
                return Integer.compare(((e4.d) obj).f4327a.f4330b, ((e4.d) obj2).f4327a.f4330b);
            case 2:
                return Long.compare(((e4.c) obj).f4324b, ((e4.c) obj2).f4324b);
            case 3:
                return ((h2.d) obj).f5863a.compareTo(((h2.d) obj2).f5863a);
            case 4:
                b0 b0Var = (b0) obj;
                b0 b0Var2 = (b0) obj2;
                int compare2 = Integer.compare(b0Var2.f7603b, b0Var.f7603b);
                if (compare2 == 0) {
                    int compareTo = b0Var.f7604c.compareTo(b0Var2.f7604c);
                    if (compareTo == 0) {
                        return b0Var.f7605d.compareTo(b0Var2.f7605d);
                    }
                    return compareTo;
                }
                return compare2;
            case 5:
                b0 b0Var3 = (b0) obj;
                b0 b0Var4 = (b0) obj2;
                int compare3 = Integer.compare(b0Var4.f7602a, b0Var3.f7602a);
                if (compare3 == 0) {
                    int compareTo2 = b0Var4.f7604c.compareTo(b0Var3.f7604c);
                    if (compareTo2 == 0) {
                        return b0Var4.f7605d.compareTo(b0Var3.f7605d);
                    }
                    return compareTo2;
                }
                return compare3;
            case 6:
                return m2.k.b(((m2.j) obj).f8510a.f8504c, ((m2.j) obj2).f8510a.f8504c);
            case 7:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i6 = 0; i6 < bArr.length; i6++) {
                    byte b10 = bArr[i6];
                    byte b11 = bArr2[i6];
                    if (b10 != b11) {
                        return b10 - b11;
                    }
                }
                return 0;
            case 8:
                return ((q) obj2).j - ((q) obj).j;
            case 9:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                if (num.intValue() == -1) {
                    if (num2.intValue() != -1) {
                        return -1;
                    }
                    return 0;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            case 10:
                return Integer.compare(((t2.h) ((List) obj).get(0)).C, ((t2.h) ((List) obj2).get(0)).C);
            case 11:
                List list = (List) obj;
                List list2 = (List) obj2;
                int i10 = 15;
                return x.f(t2.p.c((t2.p) Collections.max(list, new a(14)), (t2.p) Collections.max(list2, new a(14)))).a(list.size(), list2.size()).b((t2.p) Collections.max(list, new a(i10)), (t2.p) Collections.max(list2, new a(i10)), new a(i10)).e();
            case 12:
                return ((t2.g) Collections.max((List) obj)).compareTo((t2.g) Collections.max((List) obj2));
            case 13:
                return ((t2.m) ((List) obj).get(0)).compareTo((t2.m) ((List) obj2).get(0));
            case 14:
                return t2.p.c((t2.p) obj, (t2.p) obj2);
            case 15:
                t2.p pVar = (t2.p) obj;
                t2.p pVar2 = (t2.p) obj2;
                boolean z10 = pVar.B;
                int i11 = pVar.G;
                if (z10 && pVar.E) {
                    a10 = t2.q.f12544k;
                } else {
                    a10 = t2.q.f12544k.a();
                }
                boolean z11 = pVar.C.B;
                z zVar = z.f4060a;
                if (z11) {
                    zVar = zVar.b(Integer.valueOf(i11), Integer.valueOf(pVar2.G), t2.q.f12544k.a());
                }
                return zVar.b(Integer.valueOf(pVar.H), Integer.valueOf(pVar2.H), a10).b(Integer.valueOf(i11), Integer.valueOf(pVar2.G), a10).e();
            case 16:
                return ((s) obj).f12874a - ((s) obj2).f12874a;
            case 17:
                return Float.compare(((s) obj).f12876c, ((s) obj2).f12876c);
            default:
                return Integer.compare(((w3.d) obj2).f13757b, ((w3.d) obj).f13757b);
        }
    }
}
