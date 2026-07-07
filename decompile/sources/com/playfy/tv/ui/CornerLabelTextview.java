package com.playfy.tv.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import ed.c;
import ld.i;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class CornerLabelTextview extends View {
    public static final /* synthetic */ int F = 0;
    public final float A;
    public final int B;
    public final int C;
    public final String D;
    public final i E;

    /* renamed from: x, reason: collision with root package name */
    public final Paint f3374x;

    /* renamed from: y, reason: collision with root package name */
    public final TextPaint f3375y;

    /* renamed from: z, reason: collision with root package name */
    public final float f3376z;

    public CornerLabelTextview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, -1);
        this.f3376z = 40.0f;
        this.A = 16.0f;
        this.B = 0;
        this.C = -1;
        this.D = HttpUrl.FRAGMENT_ENCODE_SET;
        i iVar = i.f8329x;
        this.E = iVar;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, c.f4565a);
        this.A = obtainStyledAttributes.getDimension(5, this.A);
        this.C = obtainStyledAttributes.getColor(4, this.C);
        this.f3376z = obtainStyledAttributes.getDimension(1, this.f3376z);
        this.B = obtainStyledAttributes.getColor(0, this.B);
        if (obtainStyledAttributes.hasValue(3)) {
            this.D = obtainStyledAttributes.getString(3);
        }
        if (obtainStyledAttributes.hasValue(2)) {
            int i6 = obtainStyledAttributes.getInt(2, 0);
            i[] values = i.values();
            if (i6 >= 0 && i6 < values.length) {
                iVar = values[i6];
            }
            this.E = iVar;
        }
        obtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.f3374x = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f3374x.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
        this.f3374x.setAntiAlias(true);
        this.f3374x.setColor(this.B);
        TextPaint textPaint = new TextPaint(1);
        this.f3375y = textPaint;
        textPaint.setAntiAlias(true);
        this.f3375y.setTextSize(this.A);
        this.f3375y.setColor(this.C);
        this.f3375y.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
    }

    public static float[] a(CornerLabelTextview cornerLabelTextview, Rect rect, float f3, float f10, float f11) {
        RectF rectF = new RectF(rect);
        TextPaint textPaint = cornerLabelTextview.f3375y;
        String str = cornerLabelTextview.D;
        rectF.right = textPaint.measureText(str, 0, str.length());
        rectF.bottom = cornerLabelTextview.f3375y.descent() - cornerLabelTextview.f3375y.ascent();
        rectF.left = ((rect.width() - rectF.right) / 2.0f) + rectF.left;
        float height = ((rect.height() - rectF.bottom) / 2.0f) + rectF.top;
        rectF.top = height;
        return new float[]{rectF.left, height - cornerLabelTextview.f3375y.ascent(), f3, f10, f11};
    }

    public i getMode() {
        return this.E;
    }

    public String getText() {
        return this.D;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        if (width == height) {
            Path b10 = this.E.b(this, new Path(), width, height);
            b10.close();
            canvas.drawPath(b10, this.f3374x);
            canvas.save();
            int width2 = (int) (canvas.getWidth() - (this.f3376z / 2.0f));
            float height2 = canvas.getHeight();
            float f3 = this.f3376z / 2.0f;
            float[] a10 = this.E.a(this, width2, (int) (height2 - f3), (int) f3);
            float f10 = a10[0];
            float f11 = a10[1];
            canvas.rotate(a10[4], a10[2], a10[3]);
            canvas.drawText(this.D, f10, f11, this.f3375y);
            return;
        }
        throw new IllegalStateException("CornerLabelTextview's width must equal to height");
    }
}
