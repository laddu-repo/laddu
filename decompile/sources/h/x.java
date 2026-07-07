package h;

import android.window.OnBackInvokedCallback;
import androidx.media3.decoder.DecoderInputBuffer;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x implements OnBackInvokedCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5994b;

    public /* synthetic */ x(int i, Object obj) {
        this.f5993a = i;
        this.f5994b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f5993a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                ((d0) this.f5994b).F();
                break;
            case 1:
                ((h4.h) this.f5994b).a();
                break;
            default:
                ((Runnable) this.f5994b).run();
                break;
        }
    }
}
