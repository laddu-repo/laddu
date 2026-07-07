package ma;

import android.content.Context;
import android.text.TextPaint;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: c, reason: collision with root package name */
    public float f8787c;

    /* renamed from: d, reason: collision with root package name */
    public float f8788d;

    /* renamed from: f, reason: collision with root package name */
    public final WeakReference f8790f;

    /* renamed from: g, reason: collision with root package name */
    public ra.d f8791g;

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f8785a = new TextPaint(1);

    /* renamed from: b, reason: collision with root package name */
    public final ea.b f8786b = new ea.b(this, 1);

    /* renamed from: e, reason: collision with root package name */
    public boolean f8789e = true;

    public l(k kVar) {
        this.f8790f = new WeakReference(null);
        this.f8790f = new WeakReference(kVar);
    }

    public final void a(String str) {
        float measureText;
        TextPaint textPaint = this.f8785a;
        float f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (str == null) {
            measureText = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        } else {
            measureText = textPaint.measureText((CharSequence) str, 0, str.length());
        }
        this.f8787c = measureText;
        if (str != null) {
            f3 = Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.f8788d = f3;
        this.f8789e = false;
    }

    public final void b(ra.d dVar, Context context) {
        if (this.f8791g != dVar) {
            this.f8791g = dVar;
            if (dVar != null) {
                TextPaint textPaint = this.f8785a;
                ea.b bVar = this.f8786b;
                dVar.e(context, textPaint, bVar);
                k kVar = (k) this.f8790f.get();
                if (kVar != null) {
                    textPaint.drawableState = kVar.getState();
                }
                dVar.d(context, textPaint, bVar);
                this.f8789e = true;
            }
            k kVar2 = (k) this.f8790f.get();
            if (kVar2 != null) {
                kVar2.a();
                kVar2.onStateChange(kVar2.getState());
            }
        }
    }
}
