package o4;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class c1 extends m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f9690a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f9691b;

    public c1(x xVar) {
        this.f9691b = xVar;
    }

    @Override // o4.m0
    public final void a(int i) {
        if (i == 0 && this.f9690a) {
            this.f9690a = false;
            this.f9691b.f();
        }
    }

    @Override // o4.m0
    public final void b(RecyclerView recyclerView, int i, int i10) {
        if (i == 0 && i10 == 0) {
            return;
        }
        this.f9690a = true;
    }
}
