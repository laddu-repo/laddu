package l5;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class u implements d, m5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f8288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f8289b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8290c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m5.i f8291d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m5.i f8292e;
    public final m5.i f;

    public u(r5.a aVar, q5.p pVar) {
        this.f8288a = pVar.f10880e;
        this.f8290c = pVar.f10876a;
        m5.i iVarF = pVar.f10877b.f();
        this.f8291d = iVarF;
        m5.i iVarF2 = pVar.f10878c.f();
        this.f8292e = iVarF2;
        m5.i iVarF3 = pVar.f10879d.f();
        this.f = iVarF3;
        aVar.d(iVarF);
        aVar.d(iVarF2);
        aVar.d(iVarF3);
        iVarF.a(this);
        iVarF2.a(this);
        iVarF3.a(this);
    }

    @Override // m5.a
    public final void b() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f8289b;
            if (i >= arrayList.size()) {
                return;
            }
            ((m5.a) arrayList.get(i)).b();
            i++;
        }
    }

    public final void d(m5.a aVar) {
        this.f8289b.add(aVar);
    }

    @Override // l5.d
    public final void c(List list, List list2) {
    }
}
