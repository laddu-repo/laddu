package pd;

import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class c extends d implements RandomAccess {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final d f10541v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f10542w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f10543x;

    public c(d dVar, int i, int i10) {
        this.f10541v = dVar;
        this.f10542w = i;
        com.bumptech.glide.e.c(i, i10, dVar.a());
        this.f10543x = i10 - i;
    }

    @Override // pd.a
    public final int a() {
        return this.f10543x;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i10 = this.f10543x;
        if (i < 0 || i >= i10) {
            throw new IndexOutOfBoundsException(j4.a.k(i, i10, "index: ", ", size: "));
        }
        return this.f10541v.get(this.f10542w + i);
    }

    @Override // pd.d, java.util.List
    public final List subList(int i, int i10) {
        com.bumptech.glide.e.c(i, i10, this.f10543x);
        int i11 = this.f10542w;
        return new c(this.f10541v, i + i11, i11 + i10);
    }
}
