package fa;

import t7.y;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class i extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String str) {
        super(str);
        y.e(str, "Detail message must not be empty");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String str, Throwable th) {
        super(str, th);
        y.e(str, "Detail message must not be empty");
    }
}
