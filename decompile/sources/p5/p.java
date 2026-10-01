package p5;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class p extends g {
    public static final PorterDuff.Mode G = PorterDuff.Mode.SRC_IN;
    public ColorFilter A;
    public boolean B;
    public boolean C;
    public final float[] D;
    public final Matrix E;
    public final Rect F;

    /* renamed from: y, reason: collision with root package name */
    public n f10583y;

    /* renamed from: z, reason: collision with root package name */
    public PorterDuffColorFilter f10584z;

    /* JADX WARN: Type inference failed for: r0v5, types: [android.graphics.drawable.Drawable$ConstantState, p5.n] */
    public p() {
        this.C = true;
        this.D = new float[9];
        this.E = new Matrix();
        this.F = new Rect();
        ?? constantState = new Drawable.ConstantState();
        constantState.f10573c = null;
        constantState.f10574d = G;
        constantState.f10572b = new m();
        this.f10583y = constantState;
    }

    public static p a(Resources resources, int i6, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            p pVar = new p();
            ThreadLocal threadLocal = k0.l.f7568a;
            pVar.f10532x = resources.getDrawable(i6, theme);
            new o(pVar.f10532x.getConstantState());
            return pVar;
        }
        try {
            XmlResourceParser xml = resources.getXml(i6);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                p pVar2 = new p();
                pVar2.inflate(resources, xml, asAttributeSet, theme);
                return pVar2;
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException e10) {
            Log.e("VectorDrawableCompat", "parser error", e10);
            return null;
        } catch (XmlPullParserException e11) {
            Log.e("VectorDrawableCompat", "parser error", e11);
            return null;
        }
    }

    public final PorterDuffColorFilter b(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f10532x;
        if (drawable != null) {
            drawable.canApplyTheme();
            return false;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f10532x;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.F;
        copyBounds(rect);
        if (rect.width() > 0 && rect.height() > 0) {
            ColorFilter colorFilter = this.A;
            if (colorFilter == null) {
                colorFilter = this.f10584z;
            }
            Matrix matrix = this.E;
            canvas.getMatrix(matrix);
            float[] fArr = this.D;
            matrix.getValues(fArr);
            float abs = Math.abs(fArr[0]);
            float abs2 = Math.abs(fArr[4]);
            float abs3 = Math.abs(fArr[1]);
            float abs4 = Math.abs(fArr[3]);
            if (abs3 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || abs4 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int width = (int) (rect.width() * abs);
            int min = Math.min(2048, width);
            int min2 = Math.min(2048, (int) (rect.height() * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                canvas.translate(rect.left, rect.top);
                if (isAutoMirrored() && s1.c.o(this) == 1) {
                    canvas.translate(rect.width(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    canvas.scale(-1.0f, 1.0f);
                }
                rect.offsetTo(0, 0);
                n nVar = this.f10583y;
                Bitmap bitmap = nVar.f10576f;
                if (bitmap == null || min != bitmap.getWidth() || min2 != nVar.f10576f.getHeight()) {
                    nVar.f10576f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
                    nVar.f10580k = true;
                }
                if (!this.C) {
                    n nVar2 = this.f10583y;
                    nVar2.f10576f.eraseColor(0);
                    Canvas canvas2 = new Canvas(nVar2.f10576f);
                    m mVar = nVar2.f10572b;
                    mVar.a(mVar.f10563g, m.f10556p, canvas2, min, min2);
                } else {
                    n nVar3 = this.f10583y;
                    if (nVar3.f10580k || nVar3.f10577g != nVar3.f10573c || nVar3.f10578h != nVar3.f10574d || nVar3.j != nVar3.f10575e || nVar3.f10579i != nVar3.f10572b.getRootAlpha()) {
                        n nVar4 = this.f10583y;
                        nVar4.f10576f.eraseColor(0);
                        Canvas canvas3 = new Canvas(nVar4.f10576f);
                        m mVar2 = nVar4.f10572b;
                        mVar2.a(mVar2.f10563g, m.f10556p, canvas3, min, min2);
                        n nVar5 = this.f10583y;
                        nVar5.f10577g = nVar5.f10573c;
                        nVar5.f10578h = nVar5.f10574d;
                        nVar5.f10579i = nVar5.f10572b.getRootAlpha();
                        nVar5.j = nVar5.f10575e;
                        nVar5.f10580k = false;
                    }
                }
                n nVar6 = this.f10583y;
                if (nVar6.f10572b.getRootAlpha() >= 255 && colorFilter == null) {
                    paint = null;
                } else {
                    if (nVar6.f10581l == null) {
                        Paint paint2 = new Paint();
                        nVar6.f10581l = paint2;
                        paint2.setFilterBitmap(true);
                    }
                    nVar6.f10581l.setAlpha(nVar6.f10572b.getRootAlpha());
                    nVar6.f10581l.setColorFilter(colorFilter);
                    paint = nVar6.f10581l;
                }
                canvas.drawBitmap(nVar6.f10576f, (Rect) null, rect, paint);
                canvas.restoreToCount(save);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f10532x;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.f10583y.f10572b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f10532x;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f10583y.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f10532x;
        if (drawable != null) {
            return drawable.getColorFilter();
        }
        return this.A;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f10532x != null && Build.VERSION.SDK_INT >= 24) {
            return new o(this.f10532x.getConstantState());
        }
        this.f10583y.f10571a = getChangingConfigurations();
        return this.f10583y;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f10532x;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.f10583y.f10572b.f10565i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f10532x;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.f10583y.f10572b.f10564h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f10532x;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f10532x;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f10532x;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f10532x;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.f10583y.f10575e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f10532x;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            n nVar = this.f10583y;
            if (nVar != null) {
                m mVar = nVar.f10572b;
                if (mVar.f10569n == null) {
                    mVar.f10569n = Boolean.valueOf(mVar.f10563g.a());
                }
                if (!mVar.f10569n.booleanValue()) {
                    ColorStateList colorStateList = this.f10583y.f10573c;
                    if (colorStateList == null || !colorStateList.isStateful()) {
                        return false;
                    }
                    return true;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.graphics.drawable.Drawable$ConstantState, p5.n] */
    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f10532x;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.B && super.mutate() == this) {
            n nVar = this.f10583y;
            ?? constantState = new Drawable.ConstantState();
            constantState.f10573c = null;
            constantState.f10574d = G;
            if (nVar != null) {
                constantState.f10571a = nVar.f10571a;
                m mVar = new m(nVar.f10572b);
                constantState.f10572b = mVar;
                if (nVar.f10572b.f10561e != null) {
                    mVar.f10561e = new Paint(nVar.f10572b.f10561e);
                }
                if (nVar.f10572b.f10560d != null) {
                    constantState.f10572b.f10560d = new Paint(nVar.f10572b.f10560d);
                }
                constantState.f10573c = nVar.f10573c;
                constantState.f10574d = nVar.f10574d;
                constantState.f10575e = nVar.f10575e;
            }
            this.f10583y = constantState;
            this.B = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f10532x;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z10;
        PorterDuff.Mode mode;
        Drawable drawable = this.f10532x;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        n nVar = this.f10583y;
        ColorStateList colorStateList = nVar.f10573c;
        if (colorStateList != null && (mode = nVar.f10574d) != null) {
            this.f10584z = b(colorStateList, mode);
            invalidateSelf();
            z10 = true;
        } else {
            z10 = false;
        }
        m mVar = nVar.f10572b;
        if (mVar.f10569n == null) {
            mVar.f10569n = Boolean.valueOf(mVar.f10563g.a());
        }
        if (mVar.f10569n.booleanValue()) {
            boolean b10 = nVar.f10572b.f10563g.b(iArr);
            nVar.f10580k |= b10;
            if (b10) {
                invalidateSelf();
                return true;
            }
        }
        return z10;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f10532x;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i6) {
        Drawable drawable = this.f10532x;
        if (drawable != null) {
            drawable.setAlpha(i6);
        } else if (this.f10583y.f10572b.getRootAlpha() != i6) {
            this.f10583y.f10572b.setRootAlpha(i6);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f10532x;
        if (drawable != null) {
            drawable.setAutoMirrored(z10);
        } else {
            this.f10583y.f10575e = z10;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f10532x;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.A = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i6) {
        Drawable drawable = this.f10532x;
        if (drawable != null) {
            s1.c.x(drawable, i6);
        } else {
            setTintList(ColorStateList.valueOf(i6));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f10532x;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        n nVar = this.f10583y;
        if (nVar.f10573c != colorStateList) {
            nVar.f10573c = colorStateList;
            this.f10584z = b(colorStateList, nVar.f10574d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f10532x;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        n nVar = this.f10583y;
        if (nVar.f10574d != mode) {
            nVar.f10574d = mode;
            this.f10584z = b(nVar.f10573c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f10532x;
        if (drawable != null) {
            return drawable.setVisible(z10, z11);
        }
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f10532x;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v13, types: [p5.l, p5.i, java.lang.Object] */
    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i6;
        Paint.Cap cap;
        Paint.Join join;
        Drawable drawable = this.f10532x;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        n nVar = this.f10583y;
        nVar.f10572b = new m();
        TypedArray g10 = k0.b.g(resources, theme, attributeSet, a.f10514a);
        n nVar2 = this.f10583y;
        m mVar = nVar2.f10572b;
        int i10 = !k0.b.d(xmlPullParser, "tintMode") ? -1 : g10.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (i10 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i10 != 5) {
            if (i10 != 9) {
                switch (i10) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        nVar2.f10574d = mode;
        ColorStateList colorStateList = null;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
            TypedValue typedValue = new TypedValue();
            g10.getValue(1, typedValue);
            int i11 = typedValue.type;
            if (i11 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i11 >= 28 && i11 <= 31) {
                colorStateList = ColorStateList.valueOf(typedValue.data);
            } else {
                Resources resources2 = g10.getResources();
                int resourceId = g10.getResourceId(1, 0);
                ThreadLocal threadLocal = k0.c.f7551a;
                try {
                    colorStateList = k0.c.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e10) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e10);
                }
            }
        }
        ColorStateList colorStateList2 = colorStateList;
        if (colorStateList2 != null) {
            nVar2.f10573c = colorStateList2;
        }
        boolean z10 = nVar2.f10575e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z10 = g10.getBoolean(5, z10);
        }
        nVar2.f10575e = z10;
        float f3 = mVar.j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f3 = g10.getFloat(7, f3);
        }
        mVar.j = f3;
        float f10 = mVar.f10566k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f10 = g10.getFloat(8, f10);
        }
        mVar.f10566k = f10;
        if (mVar.j <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            throw new XmlPullParserException(g10.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f10 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            mVar.f10564h = g10.getDimension(3, mVar.f10564h);
            float dimension = g10.getDimension(2, mVar.f10565i);
            mVar.f10565i = dimension;
            if (mVar.f10564h <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                throw new XmlPullParserException(g10.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                float alpha = mVar.getAlpha();
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
                    alpha = g10.getFloat(4, alpha);
                }
                mVar.setAlpha(alpha);
                String string = g10.getString(0);
                if (string != null) {
                    mVar.f10568m = string;
                    mVar.f10570o.put(string, mVar);
                }
                g10.recycle();
                nVar.f10571a = getChangingConfigurations();
                nVar.f10580k = true;
                n nVar3 = this.f10583y;
                m mVar2 = nVar3.f10572b;
                ArrayDeque arrayDeque = new ArrayDeque();
                j jVar = mVar2.f10563g;
                v.e eVar = mVar2.f10570o;
                arrayDeque.push(jVar);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z11 = true;
                for (int i12 = 1; eventType != i12 && (xmlPullParser.getDepth() >= depth || eventType != 3); i12 = 1) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        j jVar2 = (j) arrayDeque.peek();
                        i6 = depth;
                        if ("path".equals(name)) {
                            ?? lVar = new l();
                            lVar.f10534e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                            lVar.f10536g = 1.0f;
                            lVar.f10537h = 1.0f;
                            lVar.f10538i = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                            lVar.j = 1.0f;
                            lVar.f10539k = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            lVar.f10540l = cap2;
                            Paint.Join join2 = Paint.Join.MITER;
                            lVar.f10541m = join2;
                            lVar.f10542n = 4.0f;
                            TypedArray g11 = k0.b.g(resources, theme, attributeSet, a.f10516c);
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                String string2 = g11.getString(0);
                                if (string2 != null) {
                                    lVar.f10554b = string2;
                                }
                                String string3 = g11.getString(2);
                                if (string3 != null) {
                                    lVar.f10553a = a8.i.e(string3);
                                }
                                lVar.f10535f = k0.b.b(g11, xmlPullParser, theme, "fillColor", 1);
                                float f11 = lVar.f10537h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                                    f11 = g11.getFloat(12, f11);
                                }
                                lVar.f10537h = f11;
                                int i13 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? g11.getInt(8, -1) : -1;
                                Paint.Cap cap3 = lVar.f10540l;
                                if (i13 == 0) {
                                    cap = cap2;
                                } else if (i13 != 1) {
                                    cap = i13 != 2 ? cap3 : Paint.Cap.SQUARE;
                                } else {
                                    cap = Paint.Cap.ROUND;
                                }
                                lVar.f10540l = cap;
                                int i14 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? g11.getInt(9, -1) : -1;
                                Paint.Join join3 = lVar.f10541m;
                                if (i14 == 0) {
                                    join = join2;
                                } else if (i14 != 1) {
                                    join = i14 != 2 ? join3 : Paint.Join.BEVEL;
                                } else {
                                    join = Paint.Join.ROUND;
                                }
                                lVar.f10541m = join;
                                float f12 = lVar.f10542n;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                                    f12 = g11.getFloat(10, f12);
                                }
                                lVar.f10542n = f12;
                                lVar.f10533d = k0.b.b(g11, xmlPullParser, theme, "strokeColor", 3);
                                float f13 = lVar.f10536g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                                    f13 = g11.getFloat(11, f13);
                                }
                                lVar.f10536g = f13;
                                float f14 = lVar.f10534e;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                                    f14 = g11.getFloat(4, f14);
                                }
                                lVar.f10534e = f14;
                                float f15 = lVar.j;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                                    f15 = g11.getFloat(6, f15);
                                }
                                lVar.j = f15;
                                float f16 = lVar.f10539k;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                                    f16 = g11.getFloat(7, f16);
                                }
                                lVar.f10539k = f16;
                                float f17 = lVar.f10538i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                                    f17 = g11.getFloat(5, f17);
                                }
                                lVar.f10538i = f17;
                                int i15 = lVar.f10555c;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                                    i15 = g11.getInt(13, i15);
                                }
                                lVar.f10555c = i15;
                            }
                            g11.recycle();
                            jVar2.f10544b.add(lVar);
                            if (lVar.getPathName() != null) {
                                eVar.put(lVar.getPathName(), lVar);
                            }
                            nVar3.f10571a = nVar3.f10571a;
                            z11 = false;
                        } else if ("clip-path".equals(name)) {
                            l lVar2 = new l();
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                TypedArray g12 = k0.b.g(resources, theme, attributeSet, a.f10517d);
                                String string4 = g12.getString(0);
                                if (string4 != null) {
                                    lVar2.f10554b = string4;
                                }
                                String string5 = g12.getString(1);
                                if (string5 != null) {
                                    lVar2.f10553a = a8.i.e(string5);
                                }
                                lVar2.f10555c = !k0.b.d(xmlPullParser, "fillType") ? 0 : g12.getInt(2, 0);
                                g12.recycle();
                            }
                            jVar2.f10544b.add(lVar2);
                            if (lVar2.getPathName() != null) {
                                eVar.put(lVar2.getPathName(), lVar2);
                            }
                            nVar3.f10571a = nVar3.f10571a;
                        } else if ("group".equals(name)) {
                            j jVar3 = new j();
                            TypedArray g13 = k0.b.g(resources, theme, attributeSet, a.f10515b);
                            float f18 = jVar3.f10545c;
                            if (k0.b.d(xmlPullParser, "rotation")) {
                                f18 = g13.getFloat(5, f18);
                            }
                            jVar3.f10545c = f18;
                            jVar3.f10546d = g13.getFloat(1, jVar3.f10546d);
                            jVar3.f10547e = g13.getFloat(2, jVar3.f10547e);
                            float f19 = jVar3.f10548f;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                                f19 = g13.getFloat(3, f19);
                            }
                            jVar3.f10548f = f19;
                            float f20 = jVar3.f10549g;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                                f20 = g13.getFloat(4, f20);
                            }
                            jVar3.f10549g = f20;
                            float f21 = jVar3.f10550h;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                                f21 = g13.getFloat(6, f21);
                            }
                            jVar3.f10550h = f21;
                            float f22 = jVar3.f10551i;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                                f22 = g13.getFloat(7, f22);
                            }
                            jVar3.f10551i = f22;
                            String string6 = g13.getString(0);
                            if (string6 != null) {
                                jVar3.f10552k = string6;
                            }
                            jVar3.c();
                            g13.recycle();
                            jVar2.f10544b.add(jVar3);
                            arrayDeque.push(jVar3);
                            if (jVar3.getGroupName() != null) {
                                eVar.put(jVar3.getGroupName(), jVar3);
                            }
                            nVar3.f10571a = nVar3.f10571a;
                        }
                    } else {
                        i6 = depth;
                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    depth = i6;
                }
                if (!z11) {
                    this.f10584z = b(nVar.f10573c, nVar.f10574d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(g10.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(g10.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public p(n nVar) {
        this.C = true;
        this.D = new float[9];
        this.E = new Matrix();
        this.F = new Rect();
        this.f10583y = nVar;
        this.f10584z = b(nVar.f10573c, nVar.f10574d);
    }
}
