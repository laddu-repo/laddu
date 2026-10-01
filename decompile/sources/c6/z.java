package c6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s0.c f2251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f2252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2253c;

    public z(Class cls, Class cls2, Class cls3, List list, s0.c cVar) {
        this.f2251a = cVar;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.f2252b = list;
        this.f2253c = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final b0 a(int i, int i10, a6.i iVar, i iVar2, com.bumptech.glide.load.data.f fVar) {
        s0.c cVar = this.f2251a;
        List list = (List) cVar.k();
        v6.f.c(list, "Argument must not be null");
        try {
            List list2 = this.f2252b;
            int size = list2.size();
            b0 b0VarA = null;
            for (int i11 = 0; i11 < size; i11++) {
                try {
                    b0VarA = ((k) list2.get(i11)).a(i, i10, iVar, iVar2, fVar);
                } catch (w e7) {
                    list.add(e7);
                }
                if (b0VarA != null) {
                    break;
                }
            }
            if (b0VarA != null) {
                return b0VarA;
            }
            throw new w(this.f2253c, new ArrayList(list));
        } finally {
            cVar.e(list);
        }
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f2252b.toArray()) + '}';
    }
}
