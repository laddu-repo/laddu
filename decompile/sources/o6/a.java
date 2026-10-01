package o6;

import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.ArrayList;
import w6.g;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a extends Drawable implements Drawable.Callback, Animatable {
    public final ArrayList A = new ArrayList();
    public final int B;
    public final int C;
    public long D;
    public int E;
    public int F;
    public Drawable G;
    public final Drawable H;

    /* renamed from: x, reason: collision with root package name */
    public final g f10003x;

    /* renamed from: y, reason: collision with root package name */
    public final int f10004y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f10005z;

    public a(Drawable drawable, Drawable drawable2, g gVar, int i6, boolean z10) {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Drawable drawable3;
        this.f10003x = gVar;
        this.f10004y = i6;
        this.f10005z = z10;
        if (drawable != null) {
            num = Integer.valueOf(drawable.getIntrinsicWidth());
        } else {
            num = null;
        }
        if (drawable2 != null) {
            num2 = Integer.valueOf(drawable2.getIntrinsicWidth());
        } else {
            num2 = null;
        }
        this.B = a(num, num2);
        if (drawable != null) {
            num3 = Integer.valueOf(drawable.getIntrinsicHeight());
        } else {
            num3 = null;
        }
        if (drawable2 != null) {
            num4 = Integer.valueOf(drawable2.getIntrinsicHeight());
        } else {
            num4 = null;
        }
        this.C = a(num3, num4);
        this.E = 255;
        if (drawable != null) {
            drawable3 = drawable.mutate();
        } else {
            drawable3 = null;
        }
        this.G = drawable3;
        Drawable mutate = drawable2 != null ? drawable2.mutate() : null;
        this.H = mutate;
        if (i6 > 0) {
            Drawable drawable4 = this.G;
            if (drawable4 != null) {
                drawable4.setCallback(this);
            }
            if (mutate != null) {
                mutate.setCallback(this);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("durationMillis must be > 0.");
    }

    public final int a(Integer num, Integer num2) {
        int i6;
        int i10 = -1;
        if ((num != null && num.intValue() == -1) || (num2 != null && num2.intValue() == -1)) {
            return -1;
        }
        if (num != null) {
            i6 = num.intValue();
        } else {
            i6 = -1;
        }
        if (num2 != null) {
            i10 = num2.intValue();
        }
        return Math.max(i6, i10);
    }

    public final void b() {
        this.F = 2;
        this.G = null;
        ArrayList arrayList = this.A;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((pa.c) arrayList.get(i6)).a(this);
        }
    }

    public final void c(Drawable drawable, Rect rect) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth > 0 && intrinsicHeight > 0) {
            int width = rect.width();
            int height = rect.height();
            double f3 = a8.a.f(intrinsicWidth, intrinsicHeight, width, height, this.f10003x);
            double d10 = 2;
            int k8 = a8.b.k((width - (intrinsicWidth * f3)) / d10);
            int k9 = a8.b.k((height - (f3 * intrinsicHeight)) / d10);
            drawable.setBounds(rect.left + k8, rect.top + k9, rect.right - k8, rect.bottom - k9);
            return;
        }
        drawable.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z10;
        int save;
        Drawable drawable;
        int i6 = this.F;
        if (i6 == 0) {
            Drawable drawable2 = this.G;
            if (drawable2 != null) {
                drawable2.setAlpha(this.E);
                save = canvas.save();
                try {
                    drawable2.draw(canvas);
                    return;
                } finally {
                }
            }
            return;
        }
        Drawable drawable3 = this.H;
        if (i6 == 2) {
            if (drawable3 != null) {
                drawable3.setAlpha(this.E);
                save = canvas.save();
                try {
                    drawable3.draw(canvas);
                    return;
                } finally {
                }
            }
            return;
        }
        double uptimeMillis = (SystemClock.uptimeMillis() - this.D) / this.f10004y;
        double d10 = 0.0d;
        if (uptimeMillis >= 0.0d) {
            if (uptimeMillis > 1.0d) {
                d10 = 1.0d;
            } else {
                d10 = uptimeMillis;
            }
        }
        int i10 = this.E;
        int i11 = (int) (d10 * i10);
        if (this.f10005z) {
            i10 -= i11;
        }
        if (uptimeMillis >= 1.0d) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && (drawable = this.G) != null) {
            drawable.setAlpha(i10);
            save = canvas.save();
            try {
                drawable.draw(canvas);
            } finally {
            }
        }
        if (drawable3 != null) {
            drawable3.setAlpha(i11);
            save = canvas.save();
            try {
                drawable3.draw(canvas);
            } finally {
            }
        }
        if (z10) {
            b();
        } else {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.E;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        ColorFilter colorFilter;
        int i6 = this.F;
        if (i6 != 0) {
            Drawable drawable = this.H;
            if (i6 != 1) {
                if (i6 == 2 && drawable != null) {
                    return drawable.getColorFilter();
                }
                return null;
            }
            if (drawable != null && (colorFilter = drawable.getColorFilter()) != null) {
                return colorFilter;
            }
            Drawable drawable2 = this.G;
            if (drawable2 != null) {
                return drawable2.getColorFilter();
            }
            return null;
        }
        Drawable drawable3 = this.G;
        if (drawable3 != null) {
            return drawable3.getColorFilter();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.C;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.B;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.G;
        int i6 = this.F;
        if (i6 == 0) {
            if (drawable != null) {
                return drawable.getOpacity();
            }
            return -2;
        }
        Drawable drawable2 = this.H;
        if (i6 == 2) {
            if (drawable2 != null) {
                return drawable2.getOpacity();
            }
            return -2;
        }
        if (drawable != null && drawable2 != null) {
            return Drawable.resolveOpacity(drawable.getOpacity(), drawable2.getOpacity());
        }
        if (drawable != null) {
            return drawable.getOpacity();
        }
        if (drawable2 != null) {
            return drawable2.getOpacity();
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        if (this.F == 1) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.G;
        if (drawable != null) {
            c(drawable, rect);
        }
        Drawable drawable2 = this.H;
        if (drawable2 != null) {
            c(drawable2, rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i6) {
        boolean z10;
        boolean z11;
        Drawable drawable = this.G;
        if (drawable != null) {
            z10 = drawable.setLevel(i6);
        } else {
            z10 = false;
        }
        Drawable drawable2 = this.H;
        if (drawable2 != null) {
            z11 = drawable2.setLevel(i6);
        } else {
            z11 = false;
        }
        if (!z10 && !z11) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z10;
        boolean z11;
        Drawable drawable = this.G;
        if (drawable != null) {
            z10 = drawable.setState(iArr);
        } else {
            z10 = false;
        }
        Drawable drawable2 = this.H;
        if (drawable2 != null) {
            z11 = drawable2.setState(iArr);
        } else {
            z11 = false;
        }
        if (!z10 && !z11) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i6) {
        if (i6 >= 0 && i6 < 256) {
            this.E = i6;
            return;
        }
        throw new IllegalArgumentException(h8.c.i(i6, "Invalid alpha: ").toString());
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.G;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        Drawable drawable2 = this.H;
        if (drawable2 != null) {
            drawable2.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i6) {
        Drawable drawable = this.G;
        if (drawable != null) {
            drawable.setTint(i6);
        }
        Drawable drawable2 = this.H;
        if (drawable2 != null) {
            drawable2.setTint(i6);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintBlendMode(BlendMode blendMode) {
        Drawable drawable = this.G;
        if (drawable != null) {
            drawable.setTintBlendMode(blendMode);
        }
        Drawable drawable2 = this.H;
        if (drawable2 != null) {
            drawable2.setTintBlendMode(blendMode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.G;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
        Drawable drawable2 = this.H;
        if (drawable2 != null) {
            drawable2.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.G;
        if (drawable != null) {
            drawable.setTintMode(mode);
        }
        Drawable drawable2 = this.H;
        if (drawable2 != null) {
            drawable2.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Animatable animatable;
        Object obj = this.G;
        Animatable animatable2 = null;
        if (obj instanceof Animatable) {
            animatable = (Animatable) obj;
        } else {
            animatable = null;
        }
        if (animatable != null) {
            animatable.start();
        }
        Object obj2 = this.H;
        if (obj2 instanceof Animatable) {
            animatable2 = (Animatable) obj2;
        }
        if (animatable2 != null) {
            animatable2.start();
        }
        if (this.F != 0) {
            return;
        }
        this.F = 1;
        this.D = SystemClock.uptimeMillis();
        ArrayList arrayList = this.A;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((pa.c) arrayList.get(i6)).b(this);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Animatable animatable;
        Object obj = this.G;
        Animatable animatable2 = null;
        if (obj instanceof Animatable) {
            animatable = (Animatable) obj;
        } else {
            animatable = null;
        }
        if (animatable != null) {
            animatable.stop();
        }
        Object obj2 = this.H;
        if (obj2 instanceof Animatable) {
            animatable2 = (Animatable) obj2;
        }
        if (animatable2 != null) {
            animatable2.stop();
        }
        if (this.F != 2) {
            b();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
