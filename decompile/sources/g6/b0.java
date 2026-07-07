package g6;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.media3.decoder.DecoderInputBuffer;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class b0 implements t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b0 f5651b = new b0(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5652a;

    public /* synthetic */ b0(int i) {
        this.f5652a = i;
    }

    @Override // g6.t
    public final s a(y yVar) {
        switch (this.f5652a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                return c0.f5654b;
            case 1:
                return new d(0, new c(0));
            case 2:
                return new d(0, new c(1));
            case 3:
                return new c0(1);
            case g1.g.LONG_FIELD_NUMBER /* 4 */:
                return new a0(yVar.b(Uri.class, AssetFileDescriptor.class), 0);
            case g1.g.STRING_FIELD_NUMBER /* 5 */:
                return new a0(yVar.b(Uri.class, ParcelFileDescriptor.class), 0);
            case g1.g.STRING_SET_FIELD_NUMBER /* 6 */:
                return new a0(yVar.b(Uri.class, InputStream.class), 0);
            default:
                return new f0(yVar.b(i.class, InputStream.class));
        }
    }
}
