package j2;

import android.os.Build;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements z {

    /* renamed from: x, reason: collision with root package name */
    public static final l f7088x = new Object();

    /* renamed from: y, reason: collision with root package name */
    public static final l f7089y = new Object();

    @Override // j2.z
    public int a(Object obj) {
        String str = ((q) obj).f7091a;
        if (!str.startsWith("OMX.google") && !str.startsWith("c2.android")) {
            if (Build.VERSION.SDK_INT < 26 && str.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                return -1;
            }
            return 0;
        }
        return 1;
    }

    public List b(String str, boolean z10, boolean z11) {
        return a0.d(str, z10, z11);
    }
}
