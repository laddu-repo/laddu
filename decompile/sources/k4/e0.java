package k4;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e0 {
    public int A;
    public int B;
    public int C;
    public int D;
    public StaticLayout E;
    public StaticLayout F;
    public int G;
    public int H;
    public int I;
    public Rect J;

    /* renamed from: a, reason: collision with root package name */
    public final float f7619a;

    /* renamed from: b, reason: collision with root package name */
    public final float f7620b;

    /* renamed from: c, reason: collision with root package name */
    public final float f7621c;

    /* renamed from: d, reason: collision with root package name */
    public final float f7622d;

    /* renamed from: e, reason: collision with root package name */
    public final float f7623e;

    /* renamed from: f, reason: collision with root package name */
    public final TextPaint f7624f;

    /* renamed from: g, reason: collision with root package name */
    public final Paint f7625g;

    /* renamed from: h, reason: collision with root package name */
    public final Paint f7626h;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f7627i;
    public Layout.Alignment j;

    /* renamed from: k, reason: collision with root package name */
    public Bitmap f7628k;

    /* renamed from: l, reason: collision with root package name */
    public float f7629l;

    /* renamed from: m, reason: collision with root package name */
    public int f7630m;

    /* renamed from: n, reason: collision with root package name */
    public int f7631n;

    /* renamed from: o, reason: collision with root package name */
    public float f7632o;

    /* renamed from: p, reason: collision with root package name */
    public int f7633p;

    /* renamed from: q, reason: collision with root package name */
    public float f7634q;

    /* renamed from: r, reason: collision with root package name */
    public float f7635r;
    public int s;

    /* renamed from: t, reason: collision with root package name */
    public int f7636t;

    /* renamed from: u, reason: collision with root package name */
    public int f7637u;

    /* renamed from: v, reason: collision with root package name */
    public int f7638v;

    /* renamed from: w, reason: collision with root package name */
    public int f7639w;

    /* renamed from: x, reason: collision with root package name */
    public float f7640x;

    /* renamed from: y, reason: collision with root package name */
    public float f7641y;

    /* renamed from: z, reason: collision with root package name */
    public float f7642z;

    public e0(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.f7623e = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f7622d = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        float round = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f7619a = round;
        this.f7620b = round;
        this.f7621c = round;
        TextPaint textPaint = new TextPaint();
        this.f7624f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f7625g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f7626h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    public final void a(Canvas canvas, boolean z10) {
        Canvas canvas2;
        int i6;
        if (z10) {
            StaticLayout staticLayout = this.E;
            StaticLayout staticLayout2 = this.F;
            if (staticLayout != null && staticLayout2 != null) {
                int save = canvas.save();
                canvas.translate(this.G, this.H);
                if (Color.alpha(this.f7637u) > 0) {
                    int i10 = this.f7637u;
                    Paint paint = this.f7625g;
                    paint.setColor(i10);
                    canvas2 = canvas;
                    canvas2.drawRect(-this.I, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, staticLayout.getWidth() + this.I, staticLayout.getHeight(), paint);
                } else {
                    canvas2 = canvas;
                }
                int i11 = this.f7639w;
                boolean z11 = true;
                TextPaint textPaint = this.f7624f;
                if (i11 == 1) {
                    textPaint.setStrokeJoin(Paint.Join.ROUND);
                    textPaint.setStrokeWidth(this.f7619a);
                    textPaint.setColor(this.f7638v);
                    textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
                    staticLayout2.draw(canvas2);
                } else {
                    float f3 = this.f7620b;
                    if (i11 == 2) {
                        float f10 = this.f7621c;
                        textPaint.setShadowLayer(f3, f10, f10, this.f7638v);
                    } else if (i11 == 3 || i11 == 4) {
                        if (i11 != 3) {
                            z11 = false;
                        }
                        int i12 = -1;
                        if (z11) {
                            i6 = -1;
                        } else {
                            i6 = this.f7638v;
                        }
                        if (z11) {
                            i12 = this.f7638v;
                        }
                        float f11 = f3 / 2.0f;
                        textPaint.setColor(this.s);
                        textPaint.setStyle(Paint.Style.FILL);
                        float f12 = -f11;
                        textPaint.setShadowLayer(f3, f12, f12, i6);
                        staticLayout2.draw(canvas2);
                        textPaint.setShadowLayer(f3, f11, f11, i12);
                    }
                }
                textPaint.setColor(this.s);
                textPaint.setStyle(Paint.Style.FILL);
                staticLayout.draw(canvas2);
                textPaint.setShadowLayer(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
                canvas2.restoreToCount(save);
                return;
            }
            return;
        }
        this.J.getClass();
        this.f7628k.getClass();
        canvas.drawBitmap(this.f7628k, (Rect) null, this.J, this.f7626h);
    }
}
