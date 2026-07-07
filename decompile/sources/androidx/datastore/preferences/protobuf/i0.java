package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class i0 {
    public static h0 a(Object obj, Object obj2) {
        h0 h0VarB = (h0) obj;
        h0 h0Var = (h0) obj2;
        if (!h0Var.isEmpty()) {
            if (!h0VarB.f777v) {
                h0VarB = h0VarB.b();
            }
            h0VarB.a();
            if (!h0Var.isEmpty()) {
                h0VarB.putAll(h0Var);
            }
        }
        return h0VarB;
    }
}
