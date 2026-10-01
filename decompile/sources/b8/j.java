package b8;

import android.graphics.Path;
import android.graphics.PathMeasure;
import androidx.media3.decoder.DecoderInputBuffer;
import com.google.android.gms.internal.measurement.eh;
import com.google.android.gms.internal.measurement.f0;
import com.google.android.gms.internal.measurement.jg;
import com.google.android.gms.internal.measurement.xg;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class j extends ThreadLocal {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1593a;

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f1593a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                return 0L;
            case 1:
                f0 f0Var = new f0();
                f0Var.f2626v = 0;
                return f0Var;
            case 2:
                eh.d(Thread.currentThread());
                xg xgVar = new xg();
                xgVar.f3232a = false;
                xgVar.f3233b = null;
                Thread threadCurrentThread = Thread.currentThread();
                WeakHashMap weakHashMap = jg.f2803c;
                synchronized (weakHashMap) {
                    weakHashMap.put(threadCurrentThread, xgVar);
                    break;
                }
                return xgVar;
            case 3:
                return new Random();
            case g1.g.LONG_FIELD_NUMBER /* 4 */:
                return new Random();
            case g1.g.STRING_FIELD_NUMBER /* 5 */:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(ff.f.f5401a);
                return simpleDateFormat;
            case g1.g.STRING_SET_FIELD_NUMBER /* 6 */:
                return new PathMeasure();
            case g1.g.DOUBLE_FIELD_NUMBER /* 7 */:
                return new Path();
            case g1.g.BYTES_FIELD_NUMBER /* 8 */:
                return new Path();
            default:
                return new float[4];
        }
    }
}
