package androidx.fragment.app;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class p0 implements o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0 f1060b;

    public p0(q0 q0Var, int i) {
        this.f1060b = q0Var;
        this.f1059a = i;
    }

    @Override // androidx.fragment.app.o0
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        q0 q0Var = this.f1060b;
        y yVar = q0Var.f1088w;
        int i = this.f1059a;
        if (yVar == null || i >= 0 || !yVar.i().R(-1, 0)) {
            return q0Var.S(arrayList, arrayList2, i, 1);
        }
        return false;
    }
}
