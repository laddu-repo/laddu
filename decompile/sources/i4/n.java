package i4;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class n extends Binder implements j {
    /* JADX WARN: Type inference failed for: r0v2, types: [i4.i, i4.j, java.lang.Object] */
    public static j a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaController");
        if (queryLocalInterface != null && (queryLocalInterface instanceof j)) {
            return (j) queryLocalInterface;
        }
        ?? obj = new Object();
        obj.f6397e = iBinder;
        return obj;
    }
}
