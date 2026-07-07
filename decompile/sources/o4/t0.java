package o4;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9865c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9866d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Interpolator f9867e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f9868g;

    public final void a(RecyclerView recyclerView) {
        int i = this.f9866d;
        if (i >= 0) {
            this.f9866d = -1;
            recyclerView.Q(i);
            this.f = false;
            return;
        }
        if (!this.f) {
            this.f9868g = 0;
            return;
        }
        Interpolator interpolator = this.f9867e;
        if (interpolator != null && this.f9865c < 1) {
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        }
        int i10 = this.f9865c;
        if (i10 < 1) {
            throw new IllegalStateException("Scroll duration must be a positive number");
        }
        recyclerView.f1399y0.c(this.f9863a, this.f9864b, i10, interpolator);
        int i11 = this.f9868g + 1;
        this.f9868g = i11;
        if (i11 > 10) {
            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
        }
        this.f = false;
    }
}
