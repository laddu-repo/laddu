package l5;

import android.graphics.Path;
import j5.a0;
import j5.w;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class s implements n, m5.a, l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f8279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w f8280d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m5.n f8281e;
    public boolean f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f8277a = new Path();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f8282g = new c(0);

    public s(w wVar, r5.a aVar, q5.n nVar) {
        this.f8278b = nVar.f10864a;
        this.f8279c = nVar.f10867d;
        this.f8280d = wVar;
        m5.n nVar2 = new m5.n((List) nVar.f10866c.f2053w);
        this.f8281e = nVar2;
        aVar.d(nVar2);
        nVar2.a(this);
    }

    @Override // m5.a
    public final void b() {
        this.f = false;
        this.f8280d.invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    @Override // l5.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(java.util.List r6, java.util.List r7) {
        /*
            r5 = this;
            r7 = 0
            r0 = 0
        L2:
            r1 = r6
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r2 = r1.size()
            if (r0 >= r2) goto L40
            java.lang.Object r1 = r1.get(r0)
            l5.d r1 = (l5.d) r1
            boolean r2 = r1 instanceof l5.u
            if (r2 == 0) goto L28
            r2 = r1
            l5.u r2 = (l5.u) r2
            int r3 = r2.f8290c
            r4 = 1
            if (r3 != r4) goto L28
            l5.c r1 = r5.f8282g
            java.util.ArrayList r1 = r1.f8180a
            r1.add(r2)
            r2.d(r5)
            goto L3d
        L28:
            boolean r2 = r1 instanceof l5.r
            if (r2 == 0) goto L3d
            if (r7 != 0) goto L33
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L33:
            l5.r r1 = (l5.r) r1
            m5.e r2 = r1.f8275b
            r2.a(r5)
            r7.add(r1)
        L3d:
            int r0 = r0 + 1
            goto L2
        L40:
            m5.n r6 = r5.f8281e
            r6.f8480m = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l5.s.c(java.util.List, java.util.List):void");
    }

    @Override // l5.n
    public final Path f() {
        boolean z2 = this.f;
        m5.n nVar = this.f8281e;
        Path path = this.f8277a;
        if (z2 && nVar.f8459e == null) {
            return path;
        }
        path.reset();
        if (this.f8279c) {
            this.f = true;
            return path;
        }
        Path path2 = (Path) nVar.e();
        if (path2 == null) {
            return path;
        }
        path.set(path2);
        path.setFillType(Path.FillType.EVEN_ODD);
        this.f8282g.a(path);
        this.f = true;
        return path;
    }

    @Override // o5.f
    public final void g(Object obj, p2.c cVar) {
        if (obj == a0.N) {
            this.f8281e.j(cVar);
        }
    }

    @Override // l5.d
    public final String getName() {
        return this.f8278b;
    }

    @Override // o5.f
    public final void h(o5.e eVar, int i, ArrayList arrayList, o5.e eVar2) {
        v5.g.g(eVar, i, arrayList, eVar2, this);
    }
}
