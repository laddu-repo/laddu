package bg;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public interface m extends l0, ReadableByteChannel {
    String H(Charset charset);

    boolean I(long j, n nVar);

    n N();

    void O(k kVar, long j);

    boolean P(long j);

    String R();

    void Y(long j);

    k a();

    long c0();

    InputStream e0();

    n g(long j);

    byte[] p();

    f0 peek();

    boolean r();

    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    long readLong();

    short readShort();

    long s(e0 e0Var);

    void skip(long j);

    long u();

    int w(b0 b0Var);

    String x(long j);
}
