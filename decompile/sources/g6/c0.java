package g6;

import androidx.media3.decoder.DecoderInputBuffer;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class c0 implements s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c0 f5654b = new c0(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5655a;

    public /* synthetic */ c0(int i) {
        this.f5655a = i;
    }

    @Override // g6.s
    public final boolean a(Object obj) {
        switch (this.f5655a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                return true;
            case 1:
                return true;
            default:
                return false;
        }
    }

    @Override // g6.s
    public final r b(Object obj, int i, int i10, a6.i iVar) {
        switch (this.f5655a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                return new r(new u6.b(obj), new e(1, obj));
            case 1:
                File file = (File) obj;
                return new r(new u6.b(file), new e(0, file));
            default:
                return null;
        }
    }
}
