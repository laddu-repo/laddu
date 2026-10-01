package androidx.emoji2.text;

import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray f946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b0 f947b;

    public y(int i) {
        this.f946a = new SparseArray(i);
    }

    public final void a(b0 b0Var, int i, int i10) {
        int iA = b0Var.a(i);
        SparseArray sparseArray = this.f946a;
        y yVar = sparseArray == null ? null : (y) sparseArray.get(iA);
        if (yVar == null) {
            yVar = new y(1);
            sparseArray.put(b0Var.a(i), yVar);
        }
        if (i10 > i) {
            yVar.a(b0Var, i + 1, i10);
        } else {
            yVar.f947b = b0Var;
        }
    }
}
