package fd;

import android.content.SharedPreferences;
import com.playfy.tv.activities.SponsorActivity;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j0 implements ve.a {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f5195x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ SponsorActivity f5196y;

    public /* synthetic */ j0(SponsorActivity sponsorActivity, int i6) {
        this.f5195x = i6;
        this.f5196y = sponsorActivity;
    }

    @Override // ve.a
    public final Object invoke() {
        switch (this.f5195x) {
            case 0:
                return a8.b.f(this.f5196y).a(kotlin.jvm.internal.x.a(id.h.class), null);
            default:
                return a8.b.f(this.f5196y).a(kotlin.jvm.internal.x.a(SharedPreferences.class), null);
        }
    }
}
