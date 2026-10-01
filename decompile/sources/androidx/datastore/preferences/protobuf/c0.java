package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b0 f750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b0 f751b;

    static {
        r0 r0Var = r0.f848c;
        b0 b0Var = null;
        try {
            b0Var = (b0) Class.forName("androidx.datastore.preferences.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f750a = b0Var;
        f751b = new b0();
    }
}
