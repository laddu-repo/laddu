package g6;

import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.decoder.DecoderInputBuffer;
import java.io.File;
import java.net.URL;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class a0 implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f5647b;

    public /* synthetic */ a0(s sVar, int i) {
        this.f5646a = i;
        this.f5647b = sVar;
    }

    @Override // g6.s
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        switch (this.f5646a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                break;
            default:
                break;
        }
        return true;
    }

    @Override // g6.s
    public final r b(Object obj, int i, int i10, a6.i iVar) {
        Uri uriFromFile;
        switch (this.f5646a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                String str = (String) obj;
                if (TextUtils.isEmpty(str)) {
                    uriFromFile = null;
                } else if (str.charAt(0) == '/') {
                    uriFromFile = Uri.fromFile(new File(str));
                } else {
                    Uri uri = Uri.parse(str);
                    uriFromFile = uri.getScheme() == null ? Uri.fromFile(new File(str)) : uri;
                }
                if (uriFromFile == null) {
                    return null;
                }
                s sVar = this.f5647b;
                if (sVar.a(uriFromFile)) {
                    return sVar.b(uriFromFile, i, i10, iVar);
                }
                return null;
            default:
                return this.f5647b.b(new i((URL) obj), i, i10, iVar);
        }
    }
}
