package j2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public interface n {
    void a();

    void b(Bundle bundle);

    void c(int i6, y1.d dVar, long j, int i10);

    void d(int i6, int i10, long j, int i11);

    boolean e(lc.c cVar);

    void f(int i6);

    void flush();

    MediaFormat g();

    void j();

    void k(int i6, long j);

    int o();

    void p(w2.j jVar, Handler handler);

    int s(MediaCodec.BufferInfo bufferInfo);

    void u(int i6);

    ByteBuffer x(int i6);

    void y(Surface surface);

    ByteBuffer z(int i6);
}
