package l2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import k8.g2;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public interface l {
    void a(int i, a2.d dVar, long j8, int i10);

    void b(Bundle bundle);

    void d(int i, int i10, long j8, int i11);

    int e(MediaCodec.BufferInfo bufferInfo);

    void flush();

    void h(int i);

    void l(int i);

    void m(u2.j jVar, Handler handler);

    MediaFormat o();

    void r();

    void release();

    ByteBuffer s(int i);

    void t(Surface surface);

    ByteBuffer u(int i);

    void w(int i, long j8);

    boolean y(g2 g2Var);

    int z();
}
