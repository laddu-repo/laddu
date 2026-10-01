package bg;

import java.nio.channels.WritableByteChannel;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public interface l extends j0, WritableByteChannel {
    l F(String str);

    l L(long j);

    long T(l0 l0Var);

    l Z(long j);

    k a();

    @Override // bg.j0, java.io.Flushable
    void flush();

    l j();

    l n(n nVar);

    l t();

    l write(byte[] bArr);

    l write(byte[] bArr, int i6, int i10);

    l writeByte(int i6);

    l writeInt(int i6);

    l writeShort(int i6);
}
