package j6;

import android.graphics.ImageDecoder;
import androidx.media3.decoder.DecoderInputBuffer;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class g implements a6.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f6944b;

    public g(int i) {
        this.f6943a = i;
        switch (i) {
            case 1:
                this.f6944b = new c();
                break;
            default:
                this.f6944b = new c();
                break;
        }
    }

    @Override // a6.k
    public final /* bridge */ /* synthetic */ boolean a(Object obj, a6.i iVar) {
        switch (this.f6943a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                break;
            default:
                break;
        }
        return true;
    }

    @Override // a6.k
    public final c6.b0 b(Object obj, int i, int i10, a6.i iVar) {
        switch (this.f6943a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                return this.f6944b.c(ImageDecoder.createSource((ByteBuffer) obj), i, i10, iVar);
            default:
                return this.f6944b.c(ImageDecoder.createSource(v6.b.b((InputStream) obj)), i, i10, iVar);
        }
    }
}
