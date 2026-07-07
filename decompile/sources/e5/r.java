package e5;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class r extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v.e f4829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f4830b;

    public r(s sVar, v.e eVar) {
        this.f4830b = sVar;
        this.f4829a = eVar;
    }

    @Override // e5.n
    public final void g(p pVar) {
        ((ArrayList) this.f4829a.get(this.f4830b.f4832w)).remove(pVar);
        pVar.x(this);
    }
}
