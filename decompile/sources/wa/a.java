package wa;

import android.os.Handler;
import android.os.Message;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i6 = message.what;
        if (i6 != 0) {
            if (i6 != 1) {
                return false;
            }
            message.obj.getClass();
            throw new ClassCastException();
        }
        message.obj.getClass();
        throw new ClassCastException();
    }
}
