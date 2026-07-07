package j2;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Handler;
import android.os.Message;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements MediaCodec.OnFrameRenderedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7051a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w2.j f7052b;

    public /* synthetic */ b(n nVar, w2.j jVar, int i6) {
        this.f7051a = i6;
        this.f7052b = jVar;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j10) {
        switch (this.f7051a) {
            case 0:
                w2.j jVar = this.f7052b;
                Handler handler = jVar.f13648x;
                if (Build.VERSION.SDK_INT < 30) {
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j >> 32), (int) j));
                    return;
                } else {
                    jVar.a(j);
                    return;
                }
            default:
                w2.j jVar2 = this.f7052b;
                Handler handler2 = jVar2.f13648x;
                if (Build.VERSION.SDK_INT < 30) {
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j >> 32), (int) j));
                    return;
                } else {
                    jVar2.a(j);
                    return;
                }
        }
    }
}
