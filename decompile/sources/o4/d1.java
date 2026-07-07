package o4;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f9699c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f9700d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f9701e;
    public int[] f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f9702g;

    public d1(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f9702g = staggeredGridLayoutManager;
        a();
    }

    public final void a() {
        this.f9697a = -1;
        this.f9698b = Integer.MIN_VALUE;
        this.f9699c = false;
        this.f9700d = false;
        this.f9701e = false;
        int[] iArr = this.f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
