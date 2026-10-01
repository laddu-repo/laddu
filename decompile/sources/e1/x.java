package e1;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.ReplacementSpan;
import com.google.android.gms.internal.measurement.j5;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class x extends ReplacementSpan {
    public TextPaint B;

    /* renamed from: y, reason: collision with root package name */
    public final w f4200y;

    /* renamed from: x, reason: collision with root package name */
    public final Paint.FontMetricsInt f4199x = new Paint.FontMetricsInt();

    /* renamed from: z, reason: collision with root package name */
    public short f4201z = -1;
    public float A = 1.0f;

    public x(w wVar) {
        j5.e(wVar, "rasterizer cannot be null");
        this.f4200y = wVar;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i6, int i10, float f3, int i11, int i12, int i13, Paint paint) {
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i6, i10, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint2 = this.B;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.B = textPaint2;
                    }
                    textPaint = textPaint2;
                    textPaint.set(paint);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        characterStyle.updateDrawState(textPaint);
                    }
                }
            }
            if (paint instanceof TextPaint) {
                textPaint = (TextPaint) paint;
            }
        } else if (paint instanceof TextPaint) {
            textPaint = (TextPaint) paint;
        }
        TextPaint textPaint3 = textPaint;
        if (textPaint3 != null && textPaint3.bgColor != 0) {
            int color = textPaint3.getColor();
            Paint.Style style = textPaint3.getStyle();
            textPaint3.setColor(textPaint3.bgColor);
            textPaint3.setStyle(Paint.Style.FILL);
            canvas.drawRect(f3, i11, f3 + this.f4201z, i13, textPaint3);
            textPaint3.setStyle(style);
            textPaint3.setColor(color);
        }
        k.a().getClass();
        float f10 = i12;
        Paint paint2 = textPaint3;
        if (textPaint3 == null) {
            paint2 = paint;
        }
        w wVar = this.f4200y;
        ic.s sVar = wVar.f4197b;
        Typeface typeface = (Typeface) sVar.A;
        Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        canvas.drawText((char[]) sVar.f6782y, wVar.f4196a * 2, 2, f3, f10, paint2);
        paint2.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i6, int i10, Paint.FontMetricsInt fontMetricsInt) {
        short s;
        Paint.FontMetricsInt fontMetricsInt2 = this.f4199x;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        w wVar = this.f4200y;
        f1.a b10 = wVar.b();
        int a10 = b10.a(14);
        short s7 = 0;
        if (a10 != 0) {
            s = ((ByteBuffer) b10.A).getShort(a10 + b10.f4630x);
        } else {
            s = 0;
        }
        this.A = abs / s;
        f1.a b11 = wVar.b();
        int a11 = b11.a(14);
        if (a11 != 0) {
            ((ByteBuffer) b11.A).getShort(a11 + b11.f4630x);
        }
        f1.a b12 = wVar.b();
        int a12 = b12.a(12);
        if (a12 != 0) {
            s7 = ((ByteBuffer) b12.A).getShort(a12 + b12.f4630x);
        }
        short s10 = (short) (s7 * this.A);
        this.f4201z = s10;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s10;
    }
}
