package o4;

import android.util.SparseArray;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SparseArray f9826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Set f9828c;

    public final n0 a(int i) {
        SparseArray sparseArray = this.f9826a;
        n0 n0Var = (n0) sparseArray.get(i);
        if (n0Var != null) {
            return n0Var;
        }
        n0 n0Var2 = new n0();
        sparseArray.put(i, n0Var2);
        return n0Var2;
    }
}
