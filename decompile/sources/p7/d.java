package p7;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.media3.decoder.DecoderInputBuffer;
import java.io.IOException;
import o8.o;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements o8.a, o8.g {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ d f10406w = new d(0);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ d f10407x = new d(1);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ d f10408y = new d(2);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f10409v;

    public /* synthetic */ d(int i) {
        this.f10409v = i;
    }

    @Override // o8.g
    public o C(Object obj) {
        Bundle bundle = (Bundle) obj;
        int i = b.f10397h;
        return (bundle == null || !bundle.containsKey("google.messenger")) ? b8.h.o(bundle) : b8.h.o(null);
    }

    @Override // o8.a
    public Object d(o oVar) throws IOException {
        switch (this.f10409v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                if (oVar.j()) {
                    return (Bundle) oVar.h();
                }
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Error making request: ".concat(String.valueOf(oVar.g())));
                }
                throw new IOException("SERVICE_NOT_AVAILABLE", oVar.g());
            default:
                Intent intent = (Intent) ((Bundle) oVar.h()).getParcelable("notification_data");
                if (intent != null) {
                    return new a(intent);
                }
                return null;
        }
    }
}
