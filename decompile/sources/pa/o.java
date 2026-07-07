package pa;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.provider.Settings;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class o extends Drawable implements Animatable {
    public static final o5.b J = new o5.b(Float.class, "growFraction", 12);
    public ObjectAnimator A;
    public ObjectAnimator B;
    public ArrayList D;
    public boolean E;
    public float F;
    public int H;

    /* renamed from: x */
    public final Context f10694x;

    /* renamed from: y */
    public final e f10695y;
    public final float C = -1.0f;
    public final Paint G = new Paint();
    public final Rect I = new Rect();

    /* renamed from: z */
    public a f10696z = new Object();

    /* JADX WARN: Type inference failed for: r2v2, types: [pa.a, java.lang.Object] */
    public o(Context context, e eVar) {
        this.f10694x = context;
        this.f10695y = eVar;
        setAlpha(255);
    }

    public final float b() {
        e eVar = this.f10695y;
        if (eVar.f10639g != 0 || eVar.f10640h != 0) {
            return this.F;
        }
        return 1.0f;
    }

    public final float c() {
        int i6;
        float f3 = this.C;
        if (f3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return f3;
        }
        boolean z10 = this instanceof m;
        e eVar = this.f10695y;
        if (eVar.b(z10) && eVar.f10644m != 0) {
            a aVar = this.f10696z;
            ContentResolver contentResolver = this.f10694x.getContentResolver();
            aVar.getClass();
            float f10 = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
            if (f10 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                if (z10) {
                    i6 = eVar.j;
                } else {
                    i6 = eVar.f10642k;
                }
                int i10 = (int) (((i6 * 1000.0f) / eVar.f10644m) * f10);
                float uptimeMillis = ((float) (SystemClock.uptimeMillis() % i10)) / i10;
                if (uptimeMillis < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    return (uptimeMillis % 1.0f) + 1.0f;
                }
                return uptimeMillis;
            }
        }
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final boolean d(boolean z10, boolean z11, boolean z12) {
        boolean z13;
        a aVar = this.f10696z;
        ContentResolver contentResolver = this.f10694x.getContentResolver();
        aVar.getClass();
        float f3 = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (z12 && f3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            z13 = true;
        } else {
            z13 = false;
        }
        return e(z10, z11, z13);
    }

    public boolean e(boolean z10, boolean z11, boolean z12) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        boolean z13;
        ObjectAnimator objectAnimator3 = this.A;
        o5.b bVar = J;
        if (objectAnimator3 == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, bVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
            this.A = ofFloat;
            ofFloat.setDuration(500L);
            this.A.setInterpolator(u9.a.f12954b);
            ObjectAnimator objectAnimator4 = this.A;
            if (objectAnimator4 != null && objectAnimator4.isRunning()) {
                throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
            }
            this.A = objectAnimator4;
            objectAnimator4.addListener(new n(this, 0));
        }
        if (this.B == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, bVar, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.B = ofFloat2;
            ofFloat2.setDuration(500L);
            this.B.setInterpolator(u9.a.f12954b);
            ObjectAnimator objectAnimator5 = this.B;
            if (objectAnimator5 != null && objectAnimator5.isRunning()) {
                throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
            }
            this.B = objectAnimator5;
            objectAnimator5.addListener(new n(this, 1));
        }
        if (isVisible() || z10) {
            if (z10) {
                objectAnimator = this.A;
            } else {
                objectAnimator = this.B;
            }
            if (z10) {
                objectAnimator2 = this.B;
            } else {
                objectAnimator2 = this.A;
            }
            if (!z12) {
                if (objectAnimator2.isRunning()) {
                    boolean z14 = this.E;
                    this.E = true;
                    new ValueAnimator[]{objectAnimator2}[0].cancel();
                    this.E = z14;
                }
                if (objectAnimator.isRunning()) {
                    objectAnimator.end();
                } else {
                    boolean z15 = this.E;
                    this.E = true;
                    new ValueAnimator[]{objectAnimator}[0].end();
                    this.E = z15;
                }
                return super.setVisible(z10, false);
            }
            if (!objectAnimator.isRunning()) {
                if (z10 && !super.setVisible(z10, false)) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                e eVar = this.f10695y;
                if (!z10 ? eVar.f10640h != 0 : eVar.f10639g != 0) {
                    if (!z11 && objectAnimator.isPaused()) {
                        objectAnimator.resume();
                        return z13;
                    }
                    objectAnimator.start();
                    return z13;
                }
                boolean z16 = this.E;
                this.E = true;
                new ValueAnimator[]{objectAnimator}[0].end();
                this.E = z16;
                return z13;
            }
        }
        return false;
    }

    public final void f(c cVar) {
        ArrayList arrayList = this.D;
        if (arrayList != null && arrayList.contains(cVar)) {
            this.D.remove(cVar);
            if (this.D.isEmpty()) {
                this.D = null;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.H;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        ObjectAnimator objectAnimator = this.A;
        if (objectAnimator == null || !objectAnimator.isRunning()) {
            ObjectAnimator objectAnimator2 = this.B;
            if (objectAnimator2 != null && objectAnimator2.isRunning()) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i6) {
        this.H = i6;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.G.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        return d(z10, z11, true);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        e(true, true, false);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        e(false, true, false);
    }
}
