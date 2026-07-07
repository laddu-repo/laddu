package pa;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.provider.Settings;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class m extends o {
    public static final aa.a V = new aa.a(1);
    public final r K;
    public final d1.f L;
    public final d1.e M;
    public final p N;
    public float O;
    public boolean P;
    public final ValueAnimator Q;
    public ValueAnimator R;
    public TimeInterpolator S;
    public TimeInterpolator T;
    public TimeInterpolator U;

    public m(Context context, e eVar, r rVar) {
        super(context, eVar);
        this.P = false;
        this.K = rVar;
        p pVar = new p();
        this.N = pVar;
        pVar.f10704h = true;
        d1.f fVar = new d1.f();
        this.L = fVar;
        fVar.a(1.0f);
        fVar.b(50.0f);
        d1.e eVar2 = new d1.e(this, V);
        this.M = eVar2;
        eVar2.f3682m = fVar;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.Q = valueAnimator;
        valueAnimator.setDuration(1000L);
        valueAnimator.setFloatValues(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        valueAnimator.setRepeatCount(-1);
        valueAnimator.addUpdateListener(new l(0, this, eVar));
        if (eVar.b(true) && eVar.f10644m != 0) {
            valueAnimator.start();
        }
        if (this.F != 1.0f) {
            this.F = 1.0f;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z10;
        boolean z11;
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(this.I)) {
            canvas.save();
            Rect bounds = getBounds();
            float b10 = b();
            ObjectAnimator objectAnimator = this.A;
            if (objectAnimator != null && objectAnimator.isRunning()) {
                z10 = true;
            } else {
                z10 = false;
            }
            ObjectAnimator objectAnimator2 = this.B;
            if (objectAnimator2 != null && objectAnimator2.isRunning()) {
                z11 = true;
            } else {
                z11 = false;
            }
            r rVar = this.K;
            rVar.f10708a.d();
            rVar.a(canvas, bounds, b10, z10, z11);
            float c10 = c();
            p pVar = this.N;
            pVar.f10702f = c10;
            Paint.Style style = Paint.Style.FILL;
            Paint paint = this.G;
            paint.setStyle(style);
            paint.setAntiAlias(true);
            e eVar = this.f10695y;
            pVar.f10699c = eVar.f10637e[0];
            int i6 = eVar.f10641i;
            if (i6 > 0) {
                if (!(this.K instanceof t)) {
                    i6 = (int) ((c9.a.a(pVar.f10698b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.01f) * i6) / 0.01f);
                }
                this.K.d(canvas, paint, pVar.f10698b, 1.0f, eVar.f10638f, this.H, i6);
            } else {
                this.K.d(canvas, paint, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, eVar.f10638f, this.H, 0);
            }
            this.K.c(canvas, paint, pVar, this.H);
            this.K.b(canvas, paint, eVar.f10637e[0], this.H);
            canvas.restore();
        }
    }

    @Override // pa.o
    public final boolean e(boolean z10, boolean z11, boolean z12) {
        boolean e10 = super.e(z10, z11, z12);
        a aVar = this.f10696z;
        ContentResolver contentResolver = this.f10694x.getContentResolver();
        aVar.getClass();
        float f3 = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (f3 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.P = true;
            return e10;
        }
        this.P = false;
        this.L.b(50.0f / f3);
        return e10;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.K.e();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.K.f();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.M.d();
        this.N.f10698b = getLevel() / 10000.0f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i6) {
        float f3;
        float f10 = i6;
        if (f10 >= 1000.0f && f10 <= 9000.0f) {
            f3 = 1.0f;
        } else {
            f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        boolean z10 = this.P;
        p pVar = this.N;
        d1.e eVar = this.M;
        if (z10) {
            eVar.d();
            pVar.f10698b = f10 / 10000.0f;
            invalidateSelf();
            pVar.f10701e = f3;
            invalidateSelf();
        } else {
            eVar.f3672b = pVar.f10698b * 10000.0f;
            eVar.f3673c = true;
            eVar.a(f10);
        }
        return true;
    }
}
