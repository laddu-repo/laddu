package p5;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e extends g implements Animatable {
    public static final /* synthetic */ int D = 0;
    public bb.b A = null;
    public ArrayList B = null;
    public final k.f C = new k.f(this);

    /* renamed from: y, reason: collision with root package name */
    public final d f10529y = new Drawable.ConstantState();

    /* renamed from: z, reason: collision with root package name */
    public final Context f10530z;

    /* JADX WARN: Type inference failed for: r1v1, types: [android.graphics.drawable.Drawable$ConstantState, p5.d] */
    public e(Context context, int i6) {
        this.f10530z = context;
    }

    @Override // p5.g, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f10532x;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f10532x;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f10532x;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        d dVar = this.f10529y;
        dVar.f10525a.draw(canvas);
        if (dVar.f10526b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f10532x;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.f10529y.f10525a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f10532x;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f10529y.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f10532x;
        if (drawable != null) {
            return drawable.getColorFilter();
        }
        return this.f10529y.f10525a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f10532x != null && Build.VERSION.SDK_INT >= 24) {
            return new ka.a(this.f10532x.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f10532x;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.f10529y.f10525a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f10532x;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.f10529y.f10525a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f10532x;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.f10529y.f10525a.getOpacity();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0133, code lost:
    
        if (r8.f10526b != null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0135, code lost:
    
        r8.f10526b = new android.animation.AnimatorSet();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x013c, code lost:
    
        r8.f10526b.playTogether(r8.f10527c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0143, code lost:
    
        return;
     */
    /* JADX WARN: Type inference failed for: r7v13, types: [v.l, v.e] */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void inflate(android.content.res.Resources r21, org.xmlpull.v1.XmlPullParser r22, android.util.AttributeSet r23, android.content.res.Resources.Theme r24) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p5.e.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f10532x;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.f10529y.f10525a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f10532x;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.f10529y.f10526b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f10532x;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.f10529y.f10525a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f10532x;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f10532x;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f10529y.f10525a.setBounds(rect);
        }
    }

    @Override // p5.g, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i6) {
        Drawable drawable = this.f10532x;
        if (drawable != null) {
            return drawable.setLevel(i6);
        }
        return this.f10529y.f10525a.setLevel(i6);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f10532x;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.f10529y.f10525a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i6) {
        Drawable drawable = this.f10532x;
        if (drawable != null) {
            drawable.setAlpha(i6);
        } else {
            this.f10529y.f10525a.setAlpha(i6);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f10532x;
        if (drawable != null) {
            drawable.setAutoMirrored(z10);
        } else {
            this.f10529y.f10525a.setAutoMirrored(z10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f10532x;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f10529y.f10525a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i6) {
        Drawable drawable = this.f10532x;
        if (drawable != null) {
            s1.c.x(drawable, i6);
        } else {
            this.f10529y.f10525a.setTint(i6);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f10532x;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        } else {
            this.f10529y.f10525a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f10532x;
        if (drawable != null) {
            drawable.setTintMode(mode);
        } else {
            this.f10529y.f10525a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f10532x;
        if (drawable != null) {
            return drawable.setVisible(z10, z11);
        }
        this.f10529y.f10525a.setVisible(z10, z11);
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f10532x;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        d dVar = this.f10529y;
        if (dVar.f10526b.isStarted()) {
            return;
        }
        dVar.f10526b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f10532x;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f10529y.f10526b.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
