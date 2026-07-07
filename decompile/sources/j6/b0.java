package j6;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.media3.decoder.DecoderInputBuffer;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class b0 implements a6.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6928a;

    public /* synthetic */ b0(int i) {
        this.f6928a = i;
    }

    @Override // a6.k
    public final /* bridge */ /* synthetic */ boolean a(Object obj, a6.i iVar) {
        switch (this.f6928a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                break;
            case 1:
                break;
            default:
                break;
        }
        return true;
    }

    @Override // a6.k
    public final c6.b0 b(Object obj, int i, int i10, a6.i iVar) {
        switch (this.f6928a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                return new a0(0, (Bitmap) obj);
            case 1:
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    return new l6.b(drawable, 0);
                }
                return null;
            default:
                return new a0((File) obj);
        }
    }
}
