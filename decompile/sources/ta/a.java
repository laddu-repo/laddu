package ta;

import android.graphics.Paint;
import android.graphics.Path;
import com.unity3d.services.UnityAdsConstants;
import l0.b;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f12697i = new int[3];
    public static final float[] j = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.5f, 1.0f};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f12698k = new int[4];

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f12699l = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.5f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final Paint f12700a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f12701b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f12702c;

    /* renamed from: d, reason: collision with root package name */
    public int f12703d;

    /* renamed from: e, reason: collision with root package name */
    public int f12704e;

    /* renamed from: f, reason: collision with root package name */
    public int f12705f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f12706g = new Path();

    /* renamed from: h, reason: collision with root package name */
    public final Paint f12707h;

    public a() {
        Paint paint = new Paint();
        this.f12707h = paint;
        this.f12700a = new Paint();
        a(-16777216);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f12701b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f12702c = new Paint(paint2);
    }

    public final void a(int i6) {
        this.f12703d = b.d(i6, 68);
        this.f12704e = b.d(i6, 20);
        this.f12705f = b.d(i6, 0);
        this.f12700a.setColor(this.f12703d);
    }
}
