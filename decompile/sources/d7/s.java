package d7;

import android.graphics.Path;
import b7.c0;
import b7.y;
import j1.f0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class s implements n, e7.a, l {

    /* renamed from: b, reason: collision with root package name */
    public final String f3953b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3954c;

    /* renamed from: d, reason: collision with root package name */
    public final y f3955d;

    /* renamed from: e, reason: collision with root package name */
    public final e7.n f3956e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3957f;

    /* renamed from: a, reason: collision with root package name */
    public final Path f3952a = new Path();

    /* renamed from: g, reason: collision with root package name */
    public final c f3958g = new c();

    public s(y yVar, j7.a aVar, i7.n nVar) {
        this.f3953b = nVar.f6687a;
        this.f3954c = nVar.f6690d;
        this.f3955d = yVar;
        e7.n nVar2 = new e7.n((List) nVar.f6689c.f4301y);
        this.f3956e = nVar2;
        aVar.f(nVar2);
        nVar2.a(this);
    }

    @Override // e7.a
    public final void a() {
        this.f3957f = false;
        this.f3955d.invalidateSelf();
    }

    @Override // d7.d
    public final void b(List list, List list2) {
        ArrayList arrayList = null;
        int i6 = 0;
        while (true) {
            ArrayList arrayList2 = (ArrayList) list;
            if (i6 < arrayList2.size()) {
                d dVar = (d) arrayList2.get(i6);
                if (dVar instanceof u) {
                    u uVar = (u) dVar;
                    if (uVar.f3965c == 1) {
                        this.f3958g.f3850x.add(uVar);
                        uVar.d(this);
                        i6++;
                    }
                }
                if (dVar instanceof r) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    r rVar = (r) dVar;
                    rVar.f3950b.a(this);
                    arrayList.add(rVar);
                }
                i6++;
            } else {
                this.f3956e.f4431m = arrayList;
                return;
            }
        }
    }

    @Override // g7.f
    public final void d(f0 f0Var, Object obj) {
        if (obj == c0.N) {
            this.f3956e.j(f0Var);
        }
    }

    @Override // d7.n
    public final Path g() {
        boolean z10 = this.f3957f;
        e7.n nVar = this.f3956e;
        Path path = this.f3952a;
        if (z10 && nVar.f4408e == null) {
            return path;
        }
        path.reset();
        if (this.f3954c) {
            this.f3957f = true;
            return path;
        }
        Path path2 = (Path) nVar.e();
        if (path2 == null) {
            return path;
        }
        path.set(path2);
        path.setFillType(Path.FillType.EVEN_ODD);
        this.f3958g.a(path);
        this.f3957f = true;
        return path;
    }

    @Override // d7.d
    public final String getName() {
        return this.f3953b;
    }

    @Override // g7.f
    public final void h(g7.e eVar, int i6, ArrayList arrayList, g7.e eVar2) {
        n7.g.g(eVar, i6, arrayList, eVar2, this);
    }
}
