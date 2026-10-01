package c6;

import android.os.Handler;
import android.os.Message;
import androidx.media3.decoder.DecoderInputBuffer;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class e0 implements Handler.Callback {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f2169v;

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f2169v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                if (message.what != 1) {
                    return false;
                }
                ((b0) message.obj).e();
                return true;
            default:
                int i = message.what;
                if (i == 0) {
                    message.obj.getClass();
                    throw new ClassCastException();
                }
                if (i != 1) {
                    return false;
                }
                message.obj.getClass();
                throw new ClassCastException();
        }
    }
}
