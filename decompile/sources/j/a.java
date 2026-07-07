package j;

import android.graphics.drawable.Animatable;
import androidx.media3.decoder.DecoderInputBuffer;
import f5.f;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class a extends fa.b {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f6610x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Animatable f6611y;

    public /* synthetic */ a(Animatable animatable, int i) {
        this.f6610x = i;
        this.f6611y = animatable;
    }

    @Override // fa.b
    public final void w() {
        switch (this.f6610x) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                this.f6611y.start();
                break;
            default:
                ((f) this.f6611y).start();
                break;
        }
    }

    @Override // fa.b
    public final void x() {
        switch (this.f6610x) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                this.f6611y.stop();
                break;
            default:
                ((f) this.f6611y).stop();
                break;
        }
    }
}
