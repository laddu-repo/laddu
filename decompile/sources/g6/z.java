package g6;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import androidx.media3.decoder.DecoderInputBuffer;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class z implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources f5714b;

    public /* synthetic */ z(Resources resources, int i) {
        this.f5713a = i;
        this.f5714b = resources;
    }

    @Override // g6.t
    public final s a(y yVar) {
        switch (this.f5713a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                return new b(this.f5714b, yVar.b(Uri.class, AssetFileDescriptor.class));
            case 1:
                return new b(this.f5714b, yVar.b(Uri.class, InputStream.class));
            default:
                return new b(this.f5714b, c0.f5654b);
        }
    }
}
