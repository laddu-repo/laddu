package l7;

import android.view.animation.Interpolator;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.unity3d.services.UnityAdsConstants;
import j1.f0;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final f0 f8261a = f0.V("a", "p", "s", "rz", AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, "o", "so", "eo", "sk", "sa", "rx", "ry");

    /* renamed from: b, reason: collision with root package name */
    public static final f0 f8262b = f0.V("k");

    public static void a(h7.b bVar, b7.j jVar) {
        Float valueOf = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        List list = (List) bVar.f4301y;
        if (list.isEmpty()) {
            list.add(new o7.a(jVar, valueOf, valueOf, (Interpolator) null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.valueOf(jVar.f1553m)));
        } else if (((o7.a) list.get(0)).f10013b == null) {
            list.set(0, new o7.a(jVar, valueOf, valueOf, (Interpolator) null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.valueOf(jVar.f1553m)));
        }
    }

    public static boolean b(h7.b bVar) {
        if (bVar != null) {
            if (!bVar.T0() || ((Float) ((o7.a) ((List) bVar.f4301y).get(0)).f10013b).floatValue() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                return false;
            }
            return true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x011b, code lost:
    
        if (r1.f10035b == 1.0f) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0174  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static h7.d c(m7.b r27, b7.j r28) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l7.c.c(m7.b, b7.j):h7.d");
    }
}
