package vf;

import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class k extends pd.d implements RandomAccess {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final f[] f13620v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int[] f13621w;

    public k(f[] fVarArr, int[] iArr) {
        this.f13620v = fVarArr;
        this.f13621w = iArr;
    }

    @Override // pd.a
    public final int a() {
        return this.f13620v.length;
    }

    @Override // pd.a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof f) {
            return super.contains((f) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.f13620v[i];
    }

    @Override // pd.d, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof f) {
            return super.indexOf((f) obj);
        }
        return -1;
    }

    @Override // pd.d, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof f) {
            return super.lastIndexOf((f) obj);
        }
        return -1;
    }
}
