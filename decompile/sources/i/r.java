package i;

import android.view.ViewGroup;
import com.google.protobuf.CodedOutputStream;
import com.unity3d.services.UnityAdsConstants;
import t0.q0;
import t0.u0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class r implements Runnable {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f6258x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ b0 f6259y;

    public /* synthetic */ r(b0 b0Var, int i6) {
        this.f6258x = i6;
        this.f6259y = b0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f6258x) {
            case 0:
                b0 b0Var = this.f6259y;
                if ((b0Var.f6152x0 & 1) != 0) {
                    b0Var.t(0);
                }
                if ((b0Var.f6152x0 & CodedOutputStream.DEFAULT_BUFFER_SIZE) != 0) {
                    b0Var.t(108);
                }
                b0Var.f6151w0 = false;
                b0Var.f6152x0 = 0;
                return;
            default:
                b0 b0Var2 = this.f6259y;
                b0Var2.T.showAtLocation(b0Var2.S, 55, 0, 0);
                u0 u0Var = b0Var2.V;
                if (u0Var != null) {
                    u0Var.b();
                }
                if (b0Var2.X && (viewGroup = b0Var2.Y) != null && viewGroup.isLaidOut()) {
                    b0Var2.S.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    u0 a10 = q0.a(b0Var2.S);
                    a10.a(1.0f);
                    b0Var2.V = a10;
                    a10.d(new s(this, 0));
                    return;
                }
                b0Var2.S.setAlpha(1.0f);
                b0Var2.S.setVisibility(0);
                return;
        }
    }
}
