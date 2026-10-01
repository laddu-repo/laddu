package ac;

import android.content.Context;
import androidx.media3.decoder.DecoderInputBuffer;
import java.io.File;
import java.io.IOException;
import va.t1;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s implements ce.a {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f444v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Context f445w;

    public /* synthetic */ s(Context context, int i) {
        this.f444v = i;
        this.f445w = context;
    }

    @Override // ce.a
    public final Object b() throws IOException {
        switch (this.f444v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                File fileE = t1.e(this.f445w, "firebaseSessions/sessionConfigsDataStore.data");
                u.c(fileE);
                return fileE;
            default:
                File fileE2 = t1.e(this.f445w, "firebaseSessions/sessionDataStore.data");
                u.c(fileE2);
                return fileE2;
        }
    }
}
