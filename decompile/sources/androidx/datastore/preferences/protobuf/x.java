package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f871b;

    static {
        Charset.forName("US-ASCII");
        f870a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f871b = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new h(bArr, 0, 0, false).e(0);
        } catch (z e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int b(long j8) {
        return (int) (j8 ^ (j8 >>> 32));
    }
}
