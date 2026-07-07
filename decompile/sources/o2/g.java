package o2;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class g extends IOException {
    public g(int i) {
        this(i, -9223372036854775807L, -9223372036854775807L);
    }

    public g(int i, long j8, long j9) {
        String str;
        StringBuilder sb2 = new StringBuilder("Illegal clipping: ");
        if (i != 0) {
            if (i == 1) {
                str = "not seekable to start";
            } else if (i != 2) {
                str = "unknown";
            } else {
                w1.a.j((j8 == -9223372036854775807L || j9 == -9223372036854775807L) ? false : true);
                str = "start exceeds end. Start time: " + j8 + ", End time: " + j9;
            }
        } else {
            str = "invalid period count";
        }
        sb2.append(str);
        super(sb2.toString());
    }
}
