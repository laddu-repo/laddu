package f5;

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
import p4.v;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class f extends i implements Animatable {
    public static final /* synthetic */ int B = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Context f5234x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public e5.l f5235y = null;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ArrayList f5236z = null;
    public final c A = new c(this);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final d f5233w = new d();

    public f(Context context, int i) {
        this.f5234x = context;
    }

    @Override // f5.i, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f5240v;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f5240v;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f5240v;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        d dVar = this.f5233w;
        dVar.f5227a.draw(canvas);
        if (dVar.f5228b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f5240v;
        return drawable != null ? drawable.getAlpha() : this.f5233w.f5227a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f5240v;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f5233w.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f5240v;
        return drawable != null ? drawable.getColorFilter() : this.f5233w.f5227a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f5240v == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new e(0, this.f5240v.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f5240v;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f5233w.f5227a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f5240v;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f5233w.f5227a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f5240v;
        return drawable != null ? drawable.getOpacity() : this.f5233w.f5227a.getOpacity();
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x0182, code lost:
    
        if (r8.f5228b != null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0184, code lost:
    
        r8.f5228b = new android.animation.AnimatorSet();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x018b, code lost:
    
        r8.f5228b.playTogether(r8.f5229c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0192, code lost:
    
        return;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void inflate(android.content.res.Resources r22, org.xmlpull.v1.XmlPullParser r23, android.util.AttributeSet r24, android.content.res.Resources.Theme r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 403
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f5.f.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f5240v;
        return drawable != null ? drawable.isAutoMirrored() : this.f5233w.f5227a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f5240v;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f5233w.f5228b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f5240v;
        return drawable != null ? drawable.isStateful() : this.f5233w.f5227a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f5240v;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f5240v;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f5233w.f5227a.setBounds(rect);
        }
    }

    @Override // f5.i, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f5240v;
        return drawable != null ? drawable.setLevel(i) : this.f5233w.f5227a.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f5240v;
        return drawable != null ? drawable.setState(iArr) : this.f5233w.f5227a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f5240v;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f5233w.f5227a.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z2) {
        Drawable drawable = this.f5240v;
        if (drawable != null) {
            drawable.setAutoMirrored(z2);
        } else {
            this.f5233w.f5227a.setAutoMirrored(z2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f5240v;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f5233w.f5227a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f5240v;
        if (drawable != null) {
            v.N(drawable, i);
        } else {
            this.f5233w.f5227a.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f5240v;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        } else {
            this.f5233w.f5227a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f5240v;
        if (drawable != null) {
            drawable.setTintMode(mode);
        } else {
            this.f5233w.f5227a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z10) {
        Drawable drawable = this.f5240v;
        if (drawable != null) {
            return drawable.setVisible(z2, z10);
        }
        this.f5233w.f5227a.setVisible(z2, z10);
        return super.setVisible(z2, z10);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f5240v;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        d dVar = this.f5233w;
        if (dVar.f5228b.isStarted()) {
            return;
        }
        dVar.f5228b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f5240v;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f5233w.f5228b.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws Throwable {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
