package o4;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class a0 implements t0.h {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f9674v;

    public /* synthetic */ a0(RecyclerView recyclerView) {
        this.f9674v = recyclerView;
    }

    @Override // t0.h
    public boolean e(float f) {
        int i;
        int i10;
        RecyclerView recyclerView = this.f9674v;
        if (recyclerView.I.e()) {
            i10 = (int) f;
            i = 0;
        } else if (recyclerView.I.d()) {
            i = (int) f;
            i10 = 0;
        } else {
            i = 0;
            i10 = 0;
        }
        if (i == 0 && i10 == 0) {
            return false;
        }
        recyclerView.o0();
        return recyclerView.I(i, i10, 0, Integer.MAX_VALUE);
    }

    @Override // t0.h
    public float l() {
        float f;
        RecyclerView recyclerView = this.f9674v;
        if (recyclerView.I.e()) {
            f = recyclerView.f1395w0;
        } else {
            if (!recyclerView.I.d()) {
                return 0.0f;
            }
            f = recyclerView.f1393v0;
        }
        return -f;
    }

    @Override // t0.h
    public void u() {
        this.f9674v.o0();
    }
}
