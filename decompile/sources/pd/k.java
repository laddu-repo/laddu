package pd;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class k extends fa.b {
    public static int A(List list) {
        de.i.e(list, "<this>");
        return list.size() - 1;
    }

    public static void B() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
