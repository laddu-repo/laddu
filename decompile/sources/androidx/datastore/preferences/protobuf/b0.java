package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class b0 {
    public static w a(long j8, Object obj) {
        w wVar = (w) h1.f780c.h(j8, obj);
        if (((b) wVar).f742v) {
            return wVar;
        }
        s0 s0Var = (s0) wVar;
        int i = s0Var.f855x;
        s0 s0VarC = s0Var.c(i == 0 ? 10 : i * 2);
        h1.o(obj, j8, s0VarC);
        return s0VarC;
    }
}
