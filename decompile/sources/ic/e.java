package ic;

import android.content.res.Resources;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicInteger f6744a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    public static boolean a(Resources resources, int i6) {
        if (Build.VERSION.SDK_INT == 26) {
            try {
                if (bg.y.y(resources.getDrawable(i6, null))) {
                    Log.e("FirebaseMessaging", "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i6);
                    return false;
                }
                return true;
            } catch (Resources.NotFoundException unused) {
                Log.e("FirebaseMessaging", "Couldn't find resource " + i6 + ", treating it as an invalid icon");
                return false;
            }
        }
        return true;
    }
}
