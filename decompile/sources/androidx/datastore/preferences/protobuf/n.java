package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile n f821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f822b;

    static {
        n nVar = new n();
        Map map = Collections.EMPTY_MAP;
        f822b = nVar;
    }

    public static n a() {
        n nVar;
        r0 r0Var = r0.f848c;
        n nVar2 = f821a;
        if (nVar2 != null) {
            return nVar2;
        }
        synchronized (n.class) {
            try {
                nVar = f821a;
                if (nVar == null) {
                    Class cls = m.f807a;
                    n nVar3 = null;
                    if (cls != null) {
                        try {
                            nVar3 = (n) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    nVar = nVar3 != null ? nVar3 : f822b;
                    f821a = nVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return nVar;
    }
}
