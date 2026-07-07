package k;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class g extends Drawable implements Drawable.Callback {
    public static final /* synthetic */ int J = 0;
    public Drawable A;
    public int B;
    public boolean C;
    public int D;
    public boolean E;
    public a1.e F;
    public long G;
    public long H;
    public f I;

    /* renamed from: x, reason: collision with root package name */
    public b f7524x;

    /* renamed from: y, reason: collision with root package name */
    public Rect f7525y;

    /* renamed from: z, reason: collision with root package name */
    public Drawable f7526z;

    /* JADX WARN: Removed duplicated region for block: B:11:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.C = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f7526z
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r8 = 0
            if (r3 == 0) goto L38
            long r9 = r13.G
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 == 0) goto L3a
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L22
            int r9 = r13.B
            r3.setAlpha(r9)
            r13.G = r6
            goto L3a
        L22:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r10 = (int) r9
            k.b r9 = r13.f7524x
            int r9 = r9.f7515y
            int r10 = r10 / r9
            int r9 = 255 - r10
            int r10 = r13.B
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = 1
            goto L3b
        L38:
            r13.G = r6
        L3a:
            r3 = 0
        L3b:
            android.graphics.drawable.Drawable r9 = r13.A
            if (r9 == 0) goto L65
            long r10 = r13.H
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 == 0) goto L67
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L52
            r9.setVisible(r8, r8)
            r0 = 0
            r13.A = r0
            r13.H = r6
            goto L67
        L52:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            k.b r4 = r13.f7524x
            int r4 = r4.f7516z
            int r3 = r3 / r4
            int r4 = r13.B
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L68
        L65:
            r13.H = r6
        L67:
            r0 = r3
        L68:
            if (r14 == 0) goto L74
            if (r0 == 0) goto L74
            a1.e r14 = r13.F
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k.g.a(boolean):void");
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        b bVar = this.f7524x;
        if (theme != null) {
            bVar.c();
            int i6 = bVar.f7500h;
            Drawable[] drawableArr = bVar.f7499g;
            for (int i10 = 0; i10 < i6; i10++) {
                Drawable drawable = drawableArr[i10];
                if (drawable != null && drawable.canApplyTheme()) {
                    drawableArr[i10].applyTheme(theme);
                    bVar.f7497e |= drawableArr[i10].getChangingConfigurations();
                }
            }
            Resources resources = theme.getResources();
            if (resources != null) {
                bVar.f7494b = resources;
                int i11 = resources.getDisplayMetrics().densityDpi;
                if (i11 == 0) {
                    i11 = 160;
                }
                int i12 = bVar.f7495c;
                bVar.f7495c = i11;
                if (i12 != i11) {
                    bVar.f7504m = false;
                    bVar.j = false;
                    return;
                }
                return;
            }
            return;
        }
        bVar.getClass();
    }

    public final void b(Drawable drawable) {
        if (this.I == null) {
            this.I = new f();
        }
        f fVar = this.I;
        fVar.f7523y = drawable.getCallback();
        drawable.setCallback(fVar);
        try {
            if (this.f7524x.f7515y <= 0 && this.C) {
                drawable.setAlpha(this.B);
            }
            b bVar = this.f7524x;
            if (bVar.C) {
                drawable.setColorFilter(bVar.B);
            } else {
                if (bVar.F) {
                    drawable.setTintList(bVar.D);
                }
                b bVar2 = this.f7524x;
                if (bVar2.G) {
                    drawable.setTintMode(bVar2.E);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f7524x.f7513w);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                s1.c.w(drawable, s1.c.o(this));
            }
            drawable.setAutoMirrored(this.f7524x.A);
            Rect rect = this.f7525y;
            if (rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
            f fVar2 = this.I;
            Drawable.Callback callback = (Drawable.Callback) fVar2.f7523y;
            fVar2.f7523y = null;
            drawable.setCallback(callback);
        } catch (Throwable th) {
            f fVar3 = this.I;
            Drawable.Callback callback2 = (Drawable.Callback) fVar3.f7523y;
            fVar3.f7523y = null;
            drawable.setCallback(callback2);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(int r10) {
        /*
            r9 = this;
            int r0 = r9.D
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            k.b r0 = r9.f7524x
            int r0 = r0.f7516z
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.A
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.f7526z
            if (r0 == 0) goto L29
            r9.A = r0
            k.b r0 = r9.f7524x
            int r0 = r0.f7516z
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.H = r0
            goto L35
        L29:
            r9.A = r4
            r9.H = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.f7526z
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            k.b r0 = r9.f7524x
            int r1 = r0.f7500h
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.d(r10)
            r9.f7526z = r0
            r9.D = r10
            if (r0 == 0) goto L5a
            k.b r10 = r9.f7524x
            int r10 = r10.f7515y
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.G = r2
        L51:
            r9.b(r0)
            goto L5a
        L55:
            r9.f7526z = r4
            r10 = -1
            r9.D = r10
        L5a:
            long r0 = r9.G
            r10 = 1
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L67
            long r0 = r9.H
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L7e
        L67:
            a1.e r0 = r9.F
            if (r0 != 0) goto L78
            a1.e r0 = new a1.e
            r1 = r9
            k.e r1 = (k.e) r1
            r2 = 8
            r0.<init>(r1, r2)
            r9.F = r0
            goto L7b
        L78:
            r9.unscheduleSelf(r0)
        L7b:
            r9.a(r10)
        L7e:
            r9.invalidateSelf()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: k.g.c(int):boolean");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return this.f7524x.canApplyTheme();
    }

    public abstract void d(b bVar);

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f7526z;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.A;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.B;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f7524x.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        boolean z10;
        b bVar = this.f7524x;
        if (bVar.f7511u) {
            z10 = bVar.f7512v;
        } else {
            bVar.c();
            bVar.f7511u = true;
            int i6 = bVar.f7500h;
            Drawable[] drawableArr = bVar.f7499g;
            int i10 = 0;
            while (true) {
                if (i10 < i6) {
                    if (drawableArr[i10].getConstantState() == null) {
                        bVar.f7512v = false;
                        z10 = false;
                        break;
                    }
                    i10++;
                } else {
                    bVar.f7512v = true;
                    z10 = true;
                    break;
                }
            }
        }
        if (z10) {
            this.f7524x.f7496d = getChangingConfigurations();
            return this.f7524x;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f7526z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f7525y;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        b bVar = this.f7524x;
        if (bVar.f7503l) {
            if (!bVar.f7504m) {
                bVar.b();
            }
            return bVar.f7506o;
        }
        Drawable drawable = this.f7526z;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        b bVar = this.f7524x;
        if (bVar.f7503l) {
            if (!bVar.f7504m) {
                bVar.b();
            }
            return bVar.f7505n;
        }
        Drawable drawable = this.f7526z;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        b bVar = this.f7524x;
        if (bVar.f7503l) {
            if (!bVar.f7504m) {
                bVar.b();
            }
            return bVar.f7508q;
        }
        Drawable drawable = this.f7526z;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        b bVar = this.f7524x;
        if (bVar.f7503l) {
            if (!bVar.f7504m) {
                bVar.b();
            }
            return bVar.f7507p;
        }
        Drawable drawable = this.f7526z;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f7526z;
        int i6 = -2;
        if (drawable != null && drawable.isVisible()) {
            b bVar = this.f7524x;
            if (bVar.f7509r) {
                return bVar.s;
            }
            bVar.c();
            int i10 = bVar.f7500h;
            Drawable[] drawableArr = bVar.f7499g;
            if (i10 > 0) {
                i6 = drawableArr[0].getOpacity();
            }
            for (int i11 = 1; i11 < i10; i11++) {
                i6 = Drawable.resolveOpacity(i6, drawableArr[i11].getOpacity());
            }
            bVar.s = i6;
            bVar.f7509r = true;
        }
        return i6;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Drawable drawable = this.f7526z;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        b bVar = this.f7524x;
        Rect rect2 = null;
        boolean z10 = false;
        if (!bVar.f7501i) {
            Rect rect3 = bVar.f7502k;
            if (rect3 == null && !bVar.j) {
                bVar.c();
                Rect rect4 = new Rect();
                int i6 = bVar.f7500h;
                Drawable[] drawableArr = bVar.f7499g;
                for (int i10 = 0; i10 < i6; i10++) {
                    if (drawableArr[i10].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i11 = rect4.left;
                        if (i11 > rect2.left) {
                            rect2.left = i11;
                        }
                        int i12 = rect4.top;
                        if (i12 > rect2.top) {
                            rect2.top = i12;
                        }
                        int i13 = rect4.right;
                        if (i13 > rect2.right) {
                            rect2.right = i13;
                        }
                        int i14 = rect4.bottom;
                        if (i14 > rect2.bottom) {
                            rect2.bottom = i14;
                        }
                    }
                }
                bVar.j = true;
                bVar.f7502k = rect2;
            } else {
                rect2 = rect3;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            if ((rect2.left | rect2.top | rect2.bottom | rect2.right) != 0) {
                z10 = true;
            }
        } else {
            Drawable drawable = this.f7526z;
            if (drawable != null) {
                z10 = drawable.getPadding(rect);
            } else {
                z10 = super.getPadding(rect);
            }
        }
        if (this.f7524x.A && s1.c.o(this) == 1) {
            int i15 = rect.left;
            rect.left = rect.right;
            rect.right = i15;
        }
        return z10;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        b bVar = this.f7524x;
        if (bVar != null) {
            bVar.f7509r = false;
            bVar.f7510t = false;
        }
        if (drawable == this.f7526z && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f7524x.A;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z10;
        Drawable drawable = this.A;
        boolean z11 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.A = null;
            z10 = true;
        } else {
            z10 = false;
        }
        Drawable drawable2 = this.f7526z;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.C) {
                this.f7526z.setAlpha(this.B);
            }
        }
        if (this.H != 0) {
            this.H = 0L;
            z10 = true;
        }
        if (this.G != 0) {
            this.G = 0L;
        } else {
            z11 = z10;
        }
        if (z11) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.E && super.mutate() == this) {
            e eVar = (e) this;
            b bVar = new b(eVar.M, eVar, null);
            bVar.I = bVar.I.clone();
            bVar.J = bVar.J.clone();
            d(bVar);
            this.E = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.A;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f7526z;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i6) {
        boolean z10;
        b bVar = this.f7524x;
        int i10 = this.D;
        int i11 = bVar.f7500h;
        Drawable[] drawableArr = bVar.f7499g;
        boolean z11 = false;
        for (int i12 = 0; i12 < i11; i12++) {
            Drawable drawable = drawableArr[i12];
            if (drawable != null) {
                if (Build.VERSION.SDK_INT >= 23) {
                    z10 = s1.c.w(drawable, i6);
                } else {
                    z10 = false;
                }
                if (i12 == i10) {
                    z11 = z10;
                }
            }
        }
        bVar.f7514x = i6;
        return z11;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i6) {
        Drawable drawable = this.A;
        if (drawable != null) {
            return drawable.setLevel(i6);
        }
        Drawable drawable2 = this.f7526z;
        if (drawable2 != null) {
            return drawable2.setLevel(i6);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable == this.f7526z && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i6) {
        if (!this.C || this.B != i6) {
            this.C = true;
            this.B = i6;
            Drawable drawable = this.f7526z;
            if (drawable != null) {
                if (this.G == 0) {
                    drawable.setAlpha(i6);
                } else {
                    a(false);
                }
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z10) {
        b bVar = this.f7524x;
        if (bVar.A != z10) {
            bVar.A = z10;
            Drawable drawable = this.f7526z;
            if (drawable != null) {
                drawable.setAutoMirrored(z10);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        b bVar = this.f7524x;
        bVar.C = true;
        if (bVar.B != colorFilter) {
            bVar.B = colorFilter;
            Drawable drawable = this.f7526z;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z10) {
        b bVar = this.f7524x;
        if (bVar.f7513w != z10) {
            bVar.f7513w = z10;
            Drawable drawable = this.f7526z;
            if (drawable != null) {
                drawable.setDither(z10);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f3, float f10) {
        Drawable drawable = this.f7526z;
        if (drawable != null) {
            drawable.setHotspot(f3, f10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i6, int i10, int i11, int i12) {
        Rect rect = this.f7525y;
        if (rect == null) {
            this.f7525y = new Rect(i6, i10, i11, i12);
        } else {
            rect.set(i6, i10, i11, i12);
        }
        Drawable drawable = this.f7526z;
        if (drawable != null) {
            drawable.setHotspotBounds(i6, i10, i11, i12);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i6) {
        setTintList(ColorStateList.valueOf(i6));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        b bVar = this.f7524x;
        bVar.F = true;
        if (bVar.D != colorStateList) {
            bVar.D = colorStateList;
            this.f7526z.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        b bVar = this.f7524x;
        bVar.G = true;
        if (bVar.E != mode) {
            bVar.E = mode;
            this.f7526z.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        Drawable drawable = this.A;
        if (drawable != null) {
            drawable.setVisible(z10, z11);
        }
        Drawable drawable2 = this.f7526z;
        if (drawable2 != null) {
            drawable2.setVisible(z10, z11);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.f7526z && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }
}
