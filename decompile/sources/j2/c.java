package j2;

import android.os.HandlerThread;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements cb.l {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f7053x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f7054y;

    public /* synthetic */ c(int i6, int i10) {
        this.f7053x = i10;
        this.f7054y = i6;
    }

    @Override // cb.l
    public final Object get() {
        switch (this.f7053x) {
            case 0:
                return new HandlerThread(d.i(this.f7054y, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(d.i(this.f7054y, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
