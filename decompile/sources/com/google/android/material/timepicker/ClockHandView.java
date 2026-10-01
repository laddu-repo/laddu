package com.google.android.material.timepicker;

import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.gms.internal.measurement.j5;
import com.playfy.tv.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import ma.n;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class ClockHandView extends View {
    public static final /* synthetic */ int K = 0;
    public final int A;
    public final float B;
    public final Paint C;
    public final RectF D;
    public final int E;
    public float F;
    public boolean G;
    public double H;
    public int I;
    public int J;

    /* renamed from: x, reason: collision with root package name */
    public final ValueAnimator f2808x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f2809y;

    /* renamed from: z, reason: collision with root package name */
    public final ArrayList f2810z;

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f2808x = valueAnimator;
        this.f2810z = new ArrayList();
        Paint paint = new Paint();
        this.C = paint;
        this.D = new RectF();
        this.J = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t9.a.f12682k, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        j5.t(context, R.attr.motionDurationLong2, 200);
        j5.u(context, R.attr.motionEasingEmphasizedInterpolator, u9.a.f12954b);
        this.I = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.A = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.E = getResources().getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.B = r5.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ViewConfiguration.get(context).getScaledTouchSlop();
        setImportantForAccessibility(2);
        obtainStyledAttributes.recycle();
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.d
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i6 = ClockHandView.K;
                ClockHandView.this.c(((Float) valueAnimator2.getAnimatedValue()).floatValue());
            }
        });
        valueAnimator.addListener(new AnimatorListenerAdapter());
    }

    public final int a(int i6) {
        if (i6 == 2) {
            return Math.round(this.I * 0.66f);
        }
        return this.I;
    }

    public final void b(float f3) {
        this.f2808x.cancel();
        c(f3);
    }

    public final void c(float f3) {
        float f10 = f3 % 360.0f;
        this.F = f10;
        this.H = Math.toRadians(f10 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float a10 = a(this.J);
        float cos = (((float) Math.cos(this.H)) * a10) + width;
        float sin = (a10 * ((float) Math.sin(this.H))) + height;
        float f11 = this.A;
        this.D.set(cos - f11, sin - f11, cos + f11, sin + f11);
        ArrayList arrayList = this.f2810z;
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            ClockFaceView clockFaceView = (ClockFaceView) ((f) obj);
            if (Math.abs(clockFaceView.f2806g0 - f10) > 0.001f) {
                clockFaceView.f2806g0 = f10;
                clockFaceView.n();
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f3 = width;
        float a10 = a(this.J);
        float cos = (((float) Math.cos(this.H)) * a10) + f3;
        float f10 = height;
        float sin = (a10 * ((float) Math.sin(this.H))) + f10;
        Paint paint = this.C;
        paint.setStrokeWidth(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        canvas.drawCircle(cos, sin, this.A, paint);
        double sin2 = Math.sin(this.H);
        paint.setStrokeWidth(this.E);
        canvas.drawLine(f3, f10, width + ((int) (Math.cos(this.H) * r2)), height + ((int) (r2 * sin2)), paint);
        canvas.drawCircle(f3, f10, this.B, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i6, int i10, int i11, int i12) {
        super.onLayout(z10, i6, i10, i11, i12);
        if (!this.f2808x.isRunning()) {
            b(this.F);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i6;
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        float y9 = motionEvent.getY();
        boolean z13 = false;
        if (actionMasked != 0) {
            if (actionMasked != 1 && actionMasked != 2) {
                z10 = false;
            } else {
                z10 = this.G;
                if (this.f2809y) {
                    if (((float) Math.hypot(x10 - (getWidth() / 2), y9 - (getHeight() / 2))) <= a(2) + n.d(getContext(), 12)) {
                        i6 = 2;
                    } else {
                        i6 = 1;
                    }
                    this.J = i6;
                }
            }
            z11 = false;
        } else {
            this.G = false;
            z10 = false;
            z11 = true;
        }
        boolean z14 = this.G;
        int degrees = (int) Math.toDegrees(Math.atan2(y9 - (getHeight() / 2), x10 - (getWidth() / 2)));
        int i10 = degrees + 90;
        if (i10 < 0) {
            i10 = degrees + 450;
        }
        float f3 = i10;
        if (this.F != f3) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z11 || !z12) {
            if (z12 || z10) {
                b(f3);
            }
            this.G = z14 | z13;
            return true;
        }
        z13 = true;
        this.G = z14 | z13;
        return true;
    }
}
