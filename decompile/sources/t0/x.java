package t0;

import android.os.Build;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final w f12418a;

    /* JADX WARN: Type inference failed for: r3v1, types: [t0.w, java.lang.Object] */
    public x(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f12418a = new v(nestedScrollView);
        } else {
            this.f12418a = new Object();
        }
    }
}
