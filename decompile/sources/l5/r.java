package l5;

import j5.w;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class r implements m5.a, d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f8274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m5.e f8275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public q5.k f8276c;

    public r(w wVar, r5.a aVar, q5.j jVar) {
        this.f8274a = wVar;
        m5.e eVarF = jVar.f10852a.f();
        this.f8275b = eVarF;
        aVar.d(eVarF);
        eVarF.a(this);
    }

    public static int d(int i, int i10) {
        int i11 = i / i10;
        if ((i ^ i10) < 0 && i11 * i10 != i) {
            i11--;
        }
        return i - (i11 * i10);
    }

    @Override // m5.a
    public final void b() {
        this.f8274a.invalidateSelf();
    }

    @Override // l5.d
    public final void c(List list, List list2) {
    }
}
