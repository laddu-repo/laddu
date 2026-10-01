package o4;

import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f9848a;

    public r0(RecyclerView recyclerView) {
        this.f9848a = recyclerView;
    }

    public final void a() {
        RecyclerView recyclerView = this.f9848a;
        if (!recyclerView.O || !recyclerView.N) {
            recyclerView.V = true;
            recyclerView.requestLayout();
        } else {
            y yVar = recyclerView.D;
            WeakHashMap weakHashMap = t0.m0.f11853a;
            recyclerView.postOnAnimation(yVar);
        }
    }
}
