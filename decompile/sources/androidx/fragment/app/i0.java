package androidx.fragment.app;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f1027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f1029c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1030d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1031e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(h.j jVar, int i) {
        this(true);
        this.f1030d = i;
        this.f1031e = jVar;
    }

    public final void a(boolean z2) {
        h4.e eVar;
        this.f1028b = z2;
        ArrayList arrayList = this.f1027a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            c.x xVar = (c.x) obj;
            boolean z10 = xVar.f1676e && z2;
            if (xVar.f1673b != z10) {
                xVar.f1673b = z10;
                sb.p pVar = xVar.f1674c;
                if (pVar != null && (eVar = (h4.e) pVar.f11743x) != null) {
                    eVar.b();
                }
            }
        }
    }

    public i0(boolean z2) {
        this.f1027a = new ArrayList();
        this.f1028b = z2;
        this.f1029c = new CopyOnWriteArrayList();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i0(q0 q0Var) {
        this(false);
        this.f1030d = 0;
        this.f1031e = q0Var;
    }
}
