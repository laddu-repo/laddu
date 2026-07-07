package vf;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public interface e extends t, ReadableByteChannel {
    c F();

    String M(long j8);

    void a0(long j8);

    int d0(k kVar);

    String i0(Charset charset);

    InputStream k0();

    f q(long j8);

    byte readByte();

    int readInt();

    short readShort();

    void skip(long j8);

    boolean u(long j8);
}
