package g6;

import android.net.Uri;
import androidx.media3.decoder.DecoderInputBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class e0 implements s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f5663b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "content", "android.resource")));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f5664a;

    public e0(d0 d0Var) {
        this.f5664a = d0Var;
    }

    @Override // g6.s
    public final boolean a(Object obj) {
        return f5663b.contains(((Uri) obj).getScheme());
    }

    @Override // g6.s
    public final r b(Object obj, int i, int i10, a6.i iVar) {
        com.bumptech.glide.load.data.d aVar;
        Uri uri = (Uri) obj;
        u6.b bVar = new u6.b(uri);
        d0 d0Var = (d0) this.f5664a;
        switch (d0Var.f5658a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                aVar = new com.bumptech.glide.load.data.a(d0Var.f5659b, uri, d0Var.f5660c, 0);
                break;
            case 1:
                aVar = new com.bumptech.glide.load.data.a(d0Var.f5659b, uri, d0Var.f5660c, 1);
                break;
            default:
                aVar = new com.bumptech.glide.load.data.n(d0Var.f5659b, uri, d0Var.f5660c);
                break;
        }
        return new r(bVar, aVar);
    }
}
