package f5;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
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
import java.io.IOException;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p4.v;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class r extends i {
    public static final PorterDuff.Mode E = PorterDuff.Mode.SRC_IN;
    public boolean A;
    public final float[] B;
    public final Matrix C;
    public final Rect D;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public p f5287w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public PorterDuffColorFilter f5288x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ColorFilter f5289y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f5290z;

    public r() {
        this.A = true;
        this.B = new float[9];
        this.C = new Matrix();
        this.D = new Rect();
        p pVar = new p();
        pVar.f5278c = null;
        pVar.f5279d = E;
        pVar.f5277b = new o();
        this.f5287w = pVar;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f5240v;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f5240v;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.D;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f5289y;
        if (colorFilter == null) {
            colorFilter = this.f5288x;
        }
        Matrix matrix = this.C;
        canvas.getMatrix(matrix);
        float[] fArr = this.B;
        matrix.getValues(fArr);
        float fAbs = Math.abs(fArr[0]);
        float fAbs2 = Math.abs(fArr[4]);
        float fAbs3 = Math.abs(fArr[1]);
        float fAbs4 = Math.abs(fArr[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (rect.width() * fAbs);
        int iMin = Math.min(2048, iWidth);
        int iMin2 = Math.min(2048, (int) (rect.height() * fAbs2));
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && getLayoutDirection() == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        p pVar = this.f5287w;
        Bitmap bitmap = pVar.f;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != pVar.f.getHeight()) {
            pVar.f = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            pVar.f5284k = true;
        }
        if (this.A) {
            p pVar2 = this.f5287w;
            if (pVar2.f5284k || pVar2.f5281g != pVar2.f5278c || pVar2.f5282h != pVar2.f5279d || pVar2.f5283j != pVar2.f5280e || pVar2.i != pVar2.f5277b.getRootAlpha()) {
                p pVar3 = this.f5287w;
                pVar3.f.eraseColor(0);
                Canvas canvas2 = new Canvas(pVar3.f);
                o oVar = pVar3.f5277b;
                oVar.a(oVar.f5268g, o.f5262p, canvas2, iMin, iMin2);
                p pVar4 = this.f5287w;
                pVar4.f5281g = pVar4.f5278c;
                pVar4.f5282h = pVar4.f5279d;
                pVar4.i = pVar4.f5277b.getRootAlpha();
                pVar4.f5283j = pVar4.f5280e;
                pVar4.f5284k = false;
            }
        } else {
            p pVar5 = this.f5287w;
            pVar5.f.eraseColor(0);
            Canvas canvas3 = new Canvas(pVar5.f);
            o oVar2 = pVar5.f5277b;
            oVar2.a(oVar2.f5268g, o.f5262p, canvas3, iMin, iMin2);
        }
        p pVar6 = this.f5287w;
        if (pVar6.f5277b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (pVar6.f5285l == null) {
                Paint paint2 = new Paint();
                pVar6.f5285l = paint2;
                paint2.setFilterBitmap(true);
            }
            pVar6.f5285l.setAlpha(pVar6.f5277b.getRootAlpha());
            pVar6.f5285l.setColorFilter(colorFilter);
            paint = pVar6.f5285l;
        }
        canvas.drawBitmap(pVar6.f, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f5240v;
        return drawable != null ? drawable.getAlpha() : this.f5287w.f5277b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f5240v;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f5287w.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f5240v;
        return drawable != null ? drawable.getColorFilter() : this.f5289y;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f5240v != null && Build.VERSION.SDK_INT >= 24) {
            return new q(this.f5240v.getConstantState());
        }
        this.f5287w.f5276a = getChangingConfigurations();
        return this.f5287w;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f5240v;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f5287w.f5277b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f5240v;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f5287w.f5277b.f5269h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f5240v;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f5240v;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f5240v;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f5240v;
        return drawable != null ? drawable.isAutoMirrored() : this.f5287w.f5280e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f5240v;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        p pVar = this.f5287w;
        if (pVar == null) {
            return false;
        }
        o oVar = pVar.f5277b;
        if (oVar.f5274n == null) {
            oVar.f5274n = Boolean.valueOf(oVar.f5268g.a());
        }
        if (oVar.f5274n.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.f5287w.f5278c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f5240v;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f5290z && super.mutate() == this) {
            p pVar = this.f5287w;
            p pVar2 = new p();
            pVar2.f5278c = null;
            pVar2.f5279d = E;
            if (pVar != null) {
                pVar2.f5276a = pVar.f5276a;
                o oVar = new o(pVar.f5277b);
                pVar2.f5277b = oVar;
                if (pVar.f5277b.f5267e != null) {
                    oVar.f5267e = new Paint(pVar.f5277b.f5267e);
                }
                if (pVar.f5277b.f5266d != null) {
                    pVar2.f5277b.f5266d = new Paint(pVar.f5277b.f5266d);
                }
                pVar2.f5278c = pVar.f5278c;
                pVar2.f5279d = pVar.f5279d;
                pVar2.f5280e = pVar.f5280e;
            }
            this.f5287w = pVar2;
            this.f5290z = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f5240v;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z2;
        PorterDuff.Mode mode;
        Drawable drawable = this.f5240v;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        p pVar = this.f5287w;
        ColorStateList colorStateList = pVar.f5278c;
        if (colorStateList == null || (mode = pVar.f5279d) == null) {
            z2 = false;
        } else {
            this.f5288x = a(colorStateList, mode);
            invalidateSelf();
            z2 = true;
        }
        o oVar = pVar.f5277b;
        if (oVar.f5274n == null) {
            oVar.f5274n = Boolean.valueOf(oVar.f5268g.a());
        }
        if (oVar.f5274n.booleanValue()) {
            boolean zB = pVar.f5277b.f5268g.b(iArr);
            pVar.f5284k |= zB;
            if (zB) {
                invalidateSelf();
                return true;
            }
        }
        return z2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j8) {
        Drawable drawable = this.f5240v;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j8);
        } else {
            super.scheduleSelf(runnable, j8);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f5240v;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f5287w.f5277b.getRootAlpha() != i) {
            this.f5287w.f5277b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z2) {
        Drawable drawable = this.f5240v;
        if (drawable != null) {
            drawable.setAutoMirrored(z2);
        } else {
            this.f5287w.f5280e = z2;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f5240v;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f5289y = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f5240v;
        if (drawable != null) {
            v.N(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f5240v;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        p pVar = this.f5287w;
        if (pVar.f5278c != colorStateList) {
            pVar.f5278c = colorStateList;
            this.f5288x = a(colorStateList, pVar.f5279d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f5240v;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        p pVar = this.f5287w;
        if (pVar.f5279d != mode) {
            pVar.f5279d = mode;
            this.f5288x = a(pVar.f5278c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z10) {
        Drawable drawable = this.f5240v;
        return drawable != null ? drawable.setVisible(z2, z10) : super.setVisible(z2, z10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f5240v;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i;
        char c10;
        int i10;
        Paint.Cap cap;
        Paint.Join join;
        Drawable drawable = this.f5240v;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        p pVar = this.f5287w;
        pVar.f5277b = new o();
        TypedArray typedArrayG = k0.b.g(resources, theme, attributeSet, a.f5215a);
        p pVar2 = this.f5287w;
        o oVar = pVar2.f5277b;
        int i11 = !k0.b.d(xmlPullParser, "tintMode") ? -1 : typedArrayG.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (i11 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i11 != 5) {
            if (i11 != 9) {
                switch (i11) {
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
        pVar2.f5279d = mode;
        ColorStateList colorStateListA = null;
        int i12 = 1;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
            TypedValue typedValue = new TypedValue();
            typedArrayG.getValue(1, typedValue);
            int i13 = typedValue.type;
            if (i13 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i13 >= 28 && i13 <= 31) {
                colorStateListA = ColorStateList.valueOf(typedValue.data);
            } else {
                Resources resources2 = typedArrayG.getResources();
                int resourceId = typedArrayG.getResourceId(1, 0);
                ThreadLocal threadLocal = k0.c.f7227a;
                try {
                    colorStateListA = k0.c.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e7) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e7);
                }
            }
        }
        ColorStateList colorStateList = colorStateListA;
        if (colorStateList != null) {
            pVar2.f5278c = colorStateList;
        }
        boolean z2 = pVar2.f5280e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z2 = typedArrayG.getBoolean(5, z2);
        }
        pVar2.f5280e = z2;
        float f = oVar.f5270j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f = typedArrayG.getFloat(7, f);
        }
        oVar.f5270j = f;
        float f4 = oVar.f5271k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f4 = typedArrayG.getFloat(8, f4);
        }
        oVar.f5271k = f4;
        if (oVar.f5270j <= 0.0f) {
            throw new XmlPullParserException(typedArrayG.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f4 > 0.0f) {
            oVar.f5269h = typedArrayG.getDimension(3, oVar.f5269h);
            float dimension = typedArrayG.getDimension(2, oVar.i);
            oVar.i = dimension;
            if (oVar.f5269h <= 0.0f) {
                throw new XmlPullParserException(typedArrayG.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                float alpha = oVar.getAlpha();
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
                    alpha = typedArrayG.getFloat(4, alpha);
                }
                oVar.setAlpha(alpha);
                String string = typedArrayG.getString(0);
                if (string != null) {
                    oVar.f5273m = string;
                    oVar.f5275o.put(string, oVar);
                }
                typedArrayG.recycle();
                pVar.f5276a = getChangingConfigurations();
                pVar.f5284k = true;
                p pVar3 = this.f5287w;
                o oVar2 = pVar3.f5277b;
                ArrayDeque arrayDeque = new ArrayDeque();
                l lVar = oVar2.f5268g;
                v.e eVar = oVar2.f5275o;
                arrayDeque.push(lVar);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z10 = true;
                while (eventType != i12 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        l lVar2 = (l) arrayDeque.peek();
                        i = depth;
                        if ("path".equals(name)) {
                            k kVar = new k();
                            kVar.f5242e = 0.0f;
                            kVar.f5243g = 1.0f;
                            kVar.f5244h = 1.0f;
                            kVar.i = 0.0f;
                            kVar.f5245j = 1.0f;
                            kVar.f5246k = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            kVar.f5247l = cap2;
                            Paint.Join join2 = Paint.Join.MITER;
                            kVar.f5248m = join2;
                            kVar.f5249n = 4.0f;
                            TypedArray typedArrayG2 = k0.b.g(resources, theme, attributeSet, a.f5217c);
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                String string2 = typedArrayG2.getString(0);
                                if (string2 != null) {
                                    kVar.f5260b = string2;
                                }
                                String string3 = typedArrayG2.getString(2);
                                if (string3 != null) {
                                    kVar.f5259a = v.u(string3);
                                }
                                kVar.f = k0.b.b(typedArrayG2, xmlPullParser, theme, "fillColor", 1);
                                float f10 = kVar.f5244h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                                    f10 = typedArrayG2.getFloat(12, f10);
                                }
                                kVar.f5244h = f10;
                                int i14 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? typedArrayG2.getInt(8, -1) : -1;
                                Paint.Cap cap3 = kVar.f5247l;
                                if (i14 == 0) {
                                    cap = cap2;
                                } else if (i14 != 1) {
                                    cap = i14 != 2 ? cap3 : Paint.Cap.SQUARE;
                                } else {
                                    cap = Paint.Cap.ROUND;
                                }
                                kVar.f5247l = cap;
                                int i15 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? typedArrayG2.getInt(9, -1) : -1;
                                Paint.Join join3 = kVar.f5248m;
                                if (i15 == 0) {
                                    join = join2;
                                } else if (i15 != 1) {
                                    join = i15 != 2 ? join3 : Paint.Join.BEVEL;
                                } else {
                                    join = Paint.Join.ROUND;
                                }
                                kVar.f5248m = join;
                                float f11 = kVar.f5249n;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                                    f11 = typedArrayG2.getFloat(10, f11);
                                }
                                kVar.f5249n = f11;
                                kVar.f5241d = k0.b.b(typedArrayG2, xmlPullParser, theme, "strokeColor", 3);
                                float f12 = kVar.f5243g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                                    f12 = typedArrayG2.getFloat(11, f12);
                                }
                                kVar.f5243g = f12;
                                float f13 = kVar.f5242e;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                                    f13 = typedArrayG2.getFloat(4, f13);
                                }
                                kVar.f5242e = f13;
                                float f14 = kVar.f5245j;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                                    f14 = typedArrayG2.getFloat(6, f14);
                                }
                                kVar.f5245j = f14;
                                float f15 = kVar.f5246k;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                                    f15 = typedArrayG2.getFloat(7, f15);
                                }
                                kVar.f5246k = f15;
                                float f16 = kVar.i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                                    f16 = typedArrayG2.getFloat(5, f16);
                                }
                                kVar.i = f16;
                                int i16 = kVar.f5261c;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                                    i16 = typedArrayG2.getInt(13, i16);
                                }
                                kVar.f5261c = i16;
                            }
                            typedArrayG2.recycle();
                            lVar2.f5251b.add(kVar);
                            if (kVar.getPathName() != null) {
                                eVar.put(kVar.getPathName(), kVar);
                            }
                            pVar3.f5276a = pVar3.f5276a;
                            z10 = false;
                            c10 = '\b';
                        } else {
                            c10 = '\b';
                            if ("clip-path".equals(name)) {
                                j jVar = new j();
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                    TypedArray typedArrayG3 = k0.b.g(resources, theme, attributeSet, a.f5218d);
                                    String string4 = typedArrayG3.getString(0);
                                    if (string4 != null) {
                                        jVar.f5260b = string4;
                                    }
                                    String string5 = typedArrayG3.getString(1);
                                    if (string5 != null) {
                                        jVar.f5259a = v.u(string5);
                                    }
                                    jVar.f5261c = !k0.b.d(xmlPullParser, "fillType") ? 0 : typedArrayG3.getInt(2, 0);
                                    typedArrayG3.recycle();
                                }
                                lVar2.f5251b.add(jVar);
                                if (jVar.getPathName() != null) {
                                    eVar.put(jVar.getPathName(), jVar);
                                }
                                pVar3.f5276a = pVar3.f5276a;
                            } else if ("group".equals(name)) {
                                l lVar3 = new l();
                                TypedArray typedArrayG4 = k0.b.g(resources, theme, attributeSet, a.f5216b);
                                float f17 = lVar3.f5252c;
                                if (k0.b.d(xmlPullParser, "rotation")) {
                                    f17 = typedArrayG4.getFloat(5, f17);
                                }
                                lVar3.f5252c = f17;
                                lVar3.f5253d = typedArrayG4.getFloat(1, lVar3.f5253d);
                                lVar3.f5254e = typedArrayG4.getFloat(2, lVar3.f5254e);
                                float f18 = lVar3.f;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                                    f18 = typedArrayG4.getFloat(3, f18);
                                }
                                lVar3.f = f18;
                                float f19 = lVar3.f5255g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                                    f19 = typedArrayG4.getFloat(4, f19);
                                }
                                lVar3.f5255g = f19;
                                float f20 = lVar3.f5256h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                                    f20 = typedArrayG4.getFloat(6, f20);
                                }
                                lVar3.f5256h = f20;
                                float f21 = lVar3.i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                                    f21 = typedArrayG4.getFloat(7, f21);
                                }
                                lVar3.i = f21;
                                String string6 = typedArrayG4.getString(0);
                                if (string6 != null) {
                                    lVar3.f5258k = string6;
                                }
                                lVar3.c();
                                typedArrayG4.recycle();
                                lVar2.f5251b.add(lVar3);
                                arrayDeque.push(lVar3);
                                if (lVar3.getGroupName() != null) {
                                    eVar.put(lVar3.getGroupName(), lVar3);
                                }
                                pVar3.f5276a = pVar3.f5276a;
                            }
                        }
                        i10 = 1;
                    } else {
                        i = depth;
                        c10 = '\b';
                        i10 = 1;
                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    i12 = i10;
                    depth = i;
                }
                if (!z10) {
                    this.f5288x = a(pVar.f5278c, pVar.f5279d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(typedArrayG.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(typedArrayG.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public r(p pVar) {
        this.A = true;
        this.B = new float[9];
        this.C = new Matrix();
        this.D = new Rect();
        this.f5287w = pVar;
        this.f5288x = a(pVar.f5278c, pVar.f5279d);
    }
}
