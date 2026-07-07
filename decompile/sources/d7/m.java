package d7;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class m implements n, k {

    /* renamed from: a, reason: collision with root package name */
    public final Path f3908a = new Path();

    /* renamed from: b, reason: collision with root package name */
    public final Path f3909b = new Path();

    /* renamed from: c, reason: collision with root package name */
    public final Path f3910c = new Path();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f3911d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final i7.g f3912e;

    public m(i7.g gVar) {
        this.f3912e = gVar;
    }

    public final void a(Path.Op op) {
        Path path = this.f3909b;
        path.reset();
        Path path2 = this.f3908a;
        path2.reset();
        ArrayList arrayList = this.f3911d;
        for (int size = arrayList.size() - 1; size >= 1; size--) {
            n nVar = (n) arrayList.get(size);
            if (nVar instanceof e) {
                e eVar = (e) nVar;
                ArrayList arrayList2 = (ArrayList) eVar.f();
                for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                    Path g10 = ((n) arrayList2.get(size2)).g();
                    Matrix matrix = eVar.f3854d;
                    e7.r rVar = eVar.f3861l;
                    if (rVar != null) {
                        matrix = rVar.e();
                    } else {
                        matrix.reset();
                    }
                    g10.transform(matrix);
                    path.addPath(g10);
                }
            } else {
                path.addPath(nVar.g());
            }
        }
        int i6 = 0;
        n nVar2 = (n) arrayList.get(0);
        if (nVar2 instanceof e) {
            e eVar2 = (e) nVar2;
            List f3 = eVar2.f();
            while (true) {
                ArrayList arrayList3 = (ArrayList) f3;
                if (i6 >= arrayList3.size()) {
                    break;
                }
                Path g11 = ((n) arrayList3.get(i6)).g();
                Matrix matrix2 = eVar2.f3854d;
                e7.r rVar2 = eVar2.f3861l;
                if (rVar2 != null) {
                    matrix2 = rVar2.e();
                } else {
                    matrix2.reset();
                }
                g11.transform(matrix2);
                path2.addPath(g11);
                i6++;
            }
        } else {
            path2.set(nVar2.g());
        }
        this.f3910c.op(path2, path, op);
    }

    @Override // d7.d
    public final void b(List list, List list2) {
        int i6 = 0;
        while (true) {
            ArrayList arrayList = this.f3911d;
            if (i6 < arrayList.size()) {
                ((n) arrayList.get(i6)).b(list, list2);
                i6++;
            } else {
                return;
            }
        }
    }

    @Override // d7.k
    public final void f(ListIterator listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            d dVar = (d) listIterator.previous();
            if (dVar instanceof n) {
                this.f3911d.add((n) dVar);
                listIterator.remove();
            }
        }
    }

    @Override // d7.n
    public final Path g() {
        Path path = this.f3910c;
        path.reset();
        i7.g gVar = this.f3912e;
        if (!gVar.f6657b) {
            int c10 = y.e.c(gVar.f6656a);
            if (c10 != 0) {
                if (c10 != 1) {
                    if (c10 != 2) {
                        if (c10 != 3) {
                            if (c10 == 4) {
                                a(Path.Op.XOR);
                                return path;
                            }
                        } else {
                            a(Path.Op.INTERSECT);
                            return path;
                        }
                    } else {
                        a(Path.Op.REVERSE_DIFFERENCE);
                        return path;
                    }
                } else {
                    a(Path.Op.UNION);
                    return path;
                }
            } else {
                int i6 = 0;
                while (true) {
                    ArrayList arrayList = this.f3911d;
                    if (i6 >= arrayList.size()) {
                        break;
                    }
                    path.addPath(((n) arrayList.get(i6)).g());
                    i6++;
                }
            }
        }
        return path;
    }
}
