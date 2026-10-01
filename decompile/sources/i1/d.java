package i1;

import android.view.View;
import androidx.media3.decoder.DecoderInputBuffer;
import o9.w;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class d extends com.bumptech.glide.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6323a;

    public /* synthetic */ d(int i) {
        this.f6323a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.d
    public final void N(w wVar, float f) {
        switch (this.f6323a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                ((View) wVar).setAlpha(f);
                break;
            case 1:
                ((View) wVar).setScaleX(f);
                break;
            case 2:
                ((View) wVar).setScaleY(f);
                break;
            case 3:
                ((View) wVar).setRotation(f);
                break;
            case g1.g.LONG_FIELD_NUMBER /* 4 */:
                ((View) wVar).setRotationX(f);
                break;
            default:
                ((View) wVar).setRotationY(f);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.d
    public final float w(w wVar) {
        switch (this.f6323a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                return ((View) wVar).getAlpha();
            case 1:
                return ((View) wVar).getScaleX();
            case 2:
                return ((View) wVar).getScaleY();
            case 3:
                return ((View) wVar).getRotation();
            case g1.g.LONG_FIELD_NUMBER /* 4 */:
                return ((View) wVar).getRotationX();
            default:
                return ((View) wVar).getRotationY();
        }
    }
}
