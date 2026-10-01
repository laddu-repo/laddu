package s2;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class m extends IOException {
    public m(Throwable th) {
        String str;
        StringBuilder sb2 = new StringBuilder("Unexpected ");
        sb2.append(th.getClass().getSimpleName());
        if (th.getMessage() != null) {
            str = ": " + th.getMessage();
        } else {
            str = "";
        }
        sb2.append(str);
        super(sb2.toString(), th);
    }
}
