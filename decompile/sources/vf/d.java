package vf;

import java.nio.channels.WritableByteChannel;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public interface d extends r, WritableByteChannel {
    d b0(String str);

    @Override // vf.r, java.io.Flushable
    void flush();

    d h0(f fVar);

    d write(byte[] bArr);

    d writeByte(int i);

    d writeInt(int i);

    d writeShort(int i);
}
