package m5;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final RectF f8610a = new RectF();

    /* renamed from: b, reason: collision with root package name */
    public final Paint f8611b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f8612c;

    /* renamed from: d, reason: collision with root package name */
    public final Paint f8613d;

    /* renamed from: e, reason: collision with root package name */
    public float f8614e;

    /* renamed from: f, reason: collision with root package name */
    public float f8615f;

    /* renamed from: g, reason: collision with root package name */
    public float f8616g;

    /* renamed from: h, reason: collision with root package name */
    public float f8617h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f8618i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public float f8619k;

    /* renamed from: l, reason: collision with root package name */
    public float f8620l;

    /* renamed from: m, reason: collision with root package name */
    public float f8621m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f8622n;

    /* renamed from: o, reason: collision with root package name */
    public Path f8623o;

    /* renamed from: p, reason: collision with root package name */
    public float f8624p;

    /* renamed from: q, reason: collision with root package name */
    public float f8625q;

    /* renamed from: r, reason: collision with root package name */
    public int f8626r;
    public int s;

    /* renamed from: t, reason: collision with root package name */
    public int f8627t;

    /* renamed from: u, reason: collision with root package name */
    public int f8628u;

    public d() {
        Paint paint = new Paint();
        this.f8611b = paint;
        Paint paint2 = new Paint();
        this.f8612c = paint2;
        Paint paint3 = new Paint();
        this.f8613d = paint3;
        this.f8614e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f8615f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f8616g = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f8617h = 5.0f;
        this.f8624p = 1.0f;
        this.f8627t = 255;
        paint.setStrokeCap(Paint.Cap.SQUARE);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        paint3.setColor(0);
    }

    public final void a(int i6) {
        this.j = i6;
        this.f8628u = this.f8618i[i6];
    }
}
