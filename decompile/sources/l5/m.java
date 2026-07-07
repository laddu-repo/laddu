package l5;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class m implements n, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f8236a = new Path();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f8237b = new Path();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Path f8238c = new Path();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f8239d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q5.g f8240e;

    public m(q5.g gVar) {
        this.f8240e = gVar;
    }

    public final void b(Path.Op op) {
        Path path = this.f8237b;
        path.reset();
        Path path2 = this.f8236a;
        path2.reset();
        ArrayList arrayList = this.f8239d;
        for (int size = arrayList.size() - 1; size >= 1; size--) {
            n nVar = (n) arrayList.get(size);
            if (nVar instanceof e) {
                e eVar = (e) nVar;
                ArrayList arrayList2 = (ArrayList) eVar.d();
                for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                    Path pathF = ((n) arrayList2.get(size2)).f();
                    Matrix matrixE = eVar.f8184d;
                    m5.r rVar = eVar.f8190l;
                    if (rVar != null) {
                        matrixE = rVar.e();
                    } else {
                        matrixE.reset();
                    }
                    pathF.transform(matrixE);
                    path.addPath(pathF);
                }
            } else {
                path.addPath(nVar.f());
            }
        }
        int i = 0;
        n nVar2 = (n) arrayList.get(0);
        if (nVar2 instanceof e) {
            e eVar2 = (e) nVar2;
            List listD = eVar2.d();
            while (true) {
                ArrayList arrayList3 = (ArrayList) listD;
                if (i >= arrayList3.size()) {
                    break;
                }
                Path pathF2 = ((n) arrayList3.get(i)).f();
                Matrix matrixE2 = eVar2.f8184d;
                m5.r rVar2 = eVar2.f8190l;
                if (rVar2 != null) {
                    matrixE2 = rVar2.e();
                } else {
                    matrixE2.reset();
                }
                pathF2.transform(matrixE2);
                path2.addPath(pathF2);
                i++;
            }
        } else {
            path2.set(nVar2.f());
        }
        this.f8238c.op(path2, path, op);
    }

    @Override // l5.d
    public final void c(List list, List list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f8239d;
            if (i >= arrayList.size()) {
                return;
            }
            ((n) arrayList.get(i)).c(list, list2);
            i++;
        }
    }

    @Override // l5.k
    public final void d(ListIterator listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            d dVar = (d) listIterator.previous();
            if (dVar instanceof n) {
                this.f8239d.add((n) dVar);
                listIterator.remove();
            }
        }
    }

    @Override // l5.n
    public final Path f() {
        Path path = this.f8238c;
        path.reset();
        q5.g gVar = this.f8240e;
        if (!gVar.f10837b) {
            int iC = y.e.c(gVar.f10836a);
            if (iC == 0) {
                int i = 0;
                while (true) {
                    ArrayList arrayList = this.f8239d;
                    if (i >= arrayList.size()) {
                        break;
                    }
                    path.addPath(((n) arrayList.get(i)).f());
                    i++;
                }
            } else {
                if (iC == 1) {
                    b(Path.Op.UNION);
                    return path;
                }
                if (iC == 2) {
                    b(Path.Op.REVERSE_DIFFERENCE);
                    return path;
                }
                if (iC == 3) {
                    b(Path.Op.INTERSECT);
                    return path;
                }
                if (iC == 4) {
                    b(Path.Op.XOR);
                    return path;
                }
            }
        }
        return path;
    }
}
