package fd;

import android.content.SharedPreferences;
import com.playfy.tv.activities.SplashActivity;
import od.n0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e0 implements ve.a {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f5176x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ SplashActivity f5177y;

    public /* synthetic */ e0(SplashActivity splashActivity, int i6) {
        this.f5176x = i6;
        this.f5177y = splashActivity;
    }

    @Override // ve.a
    public final Object invoke() {
        switch (this.f5176x) {
            case 0:
                return a8.b.f(this.f5177y).a(kotlin.jvm.internal.x.a(SharedPreferences.class), null);
            default:
                SplashActivity splashActivity = this.f5177y;
                return k6.e.n(kotlin.jvm.internal.x.a(n0.class), splashActivity.getViewModelStore(), splashActivity.getDefaultViewModelCreationExtras(), a8.b.f(splashActivity));
        }
    }
}
