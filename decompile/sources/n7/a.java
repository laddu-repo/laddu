package n7;

import android.graphics.Color;
import android.graphics.Matrix;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public float f9084a;

    /* renamed from: b, reason: collision with root package name */
    public float f9085b;

    /* renamed from: c, reason: collision with root package name */
    public float f9086c;

    /* renamed from: d, reason: collision with root package name */
    public int f9087d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f9088e = null;

    public a(a aVar) {
        this.f9084a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f9085b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f9086c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f9087d = 0;
        this.f9084a = aVar.f9084a;
        this.f9085b = aVar.f9085b;
        this.f9086c = aVar.f9086c;
        this.f9087d = aVar.f9087d;
    }

    public final void a(int i6, c7.a aVar) {
        int alpha = Color.alpha(this.f9087d);
        int c10 = g.c(i6);
        Matrix matrix = i.f9124a;
        int i10 = (int) ((((alpha / 255.0f) * c10) / 255.0f) * 255.0f);
        if (i10 > 0) {
            aVar.setShadowLayer(Math.max(this.f9084a, Float.MIN_VALUE), this.f9085b, this.f9086c, Color.argb(i10, Color.red(this.f9087d), Color.green(this.f9087d), Color.blue(this.f9087d)));
        } else {
            aVar.clearShadowLayer();
        }
    }

    public final void b(int i6) {
        this.f9087d = Color.argb(Math.round((g.c(i6) * Color.alpha(this.f9087d)) / 255.0f), Color.red(this.f9087d), Color.green(this.f9087d), Color.blue(this.f9087d));
    }

    public final void c(Matrix matrix) {
        if (this.f9088e == null) {
            this.f9088e = new float[2];
        }
        float[] fArr = this.f9088e;
        fArr[0] = this.f9085b;
        fArr[1] = this.f9086c;
        matrix.mapVectors(fArr);
        float[] fArr2 = this.f9088e;
        this.f9085b = fArr2[0];
        this.f9086c = fArr2[1];
        this.f9084a = matrix.mapRadius(this.f9084a);
    }
}
