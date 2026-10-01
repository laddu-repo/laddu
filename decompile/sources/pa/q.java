package pa;

import android.graphics.Matrix;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f10705a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f10706b;

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f10707c;

    public q() {
        this.f10705a = new float[2];
        this.f10706b = r0;
        float[] fArr = {1.0f};
        this.f10707c = new Matrix();
    }

    public final void a(float f3) {
        float[] fArr = this.f10706b;
        float atan2 = (float) (Math.atan2(fArr[1], fArr[0]) + 1.5707963267948966d);
        float[] fArr2 = this.f10705a;
        double d10 = f3;
        double d11 = atan2;
        fArr2[0] = (float) ((Math.cos(d11) * d10) + fArr2[0]);
        fArr2[1] = (float) ((Math.sin(d11) * d10) + fArr2[1]);
    }

    public final void b() {
        Arrays.fill(this.f10705a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        float[] fArr = this.f10706b;
        Arrays.fill(fArr, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        fArr[0] = 1.0f;
        this.f10707c.reset();
    }

    public final void c(float f3) {
        Matrix matrix = this.f10707c;
        matrix.reset();
        matrix.setRotate(f3);
        matrix.mapPoints(this.f10705a);
        matrix.mapPoints(this.f10706b);
    }

    public final void d(float f3) {
        float[] fArr = this.f10705a;
        fArr[0] = fArr[0] * 1.0f;
        fArr[1] = fArr[1] * f3;
        float[] fArr2 = this.f10706b;
        fArr2[0] = fArr2[0] * 1.0f;
        fArr2[1] = fArr2[1] * f3;
    }

    public final void e(float f3) {
        float[] fArr = this.f10705a;
        fArr[0] = fArr[0] + f3;
        fArr[1] = fArr[1] + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public q(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[2];
        this.f10705a = fArr3;
        float[] fArr4 = new float[2];
        this.f10706b = fArr4;
        System.arraycopy(fArr, 0, fArr3, 0, 2);
        System.arraycopy(fArr2, 0, fArr4, 0, 2);
        this.f10707c = new Matrix();
    }
}
