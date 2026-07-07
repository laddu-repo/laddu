package r0;

import android.os.Build;
import android.os.LocaleList;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Objects;
import m6.u;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f11250a;

    /* renamed from: b, reason: collision with root package name */
    public final TextDirectionHeuristic f11251b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11252c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11253d;

    public c(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i6, int i10) {
        PrecomputedText.Params.Builder breakStrategy;
        PrecomputedText.Params.Builder hyphenationFrequency;
        PrecomputedText.Params.Builder textDirection;
        if (Build.VERSION.SDK_INT >= 29) {
            breakStrategy = u.j(textPaint).setBreakStrategy(i6);
            hyphenationFrequency = breakStrategy.setHyphenationFrequency(i10);
            textDirection = hyphenationFrequency.setTextDirection(textDirectionHeuristic);
            textDirection.build();
        }
        this.f11250a = textPaint;
        this.f11251b = textDirectionHeuristic;
        this.f11252c = i6;
        this.f11253d = i10;
    }

    public final boolean equals(Object obj) {
        LocaleList textLocales;
        LocaleList textLocales2;
        boolean equals;
        if (obj != this) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                int i6 = Build.VERSION.SDK_INT;
                if (i6 < 23 || (this.f11252c == cVar.f11252c && this.f11253d == cVar.f11253d)) {
                    TextPaint textPaint = this.f11250a;
                    float textSize = textPaint.getTextSize();
                    TextPaint textPaint2 = cVar.f11250a;
                    if (textSize == textPaint2.getTextSize() && textPaint.getTextScaleX() == textPaint2.getTextScaleX() && textPaint.getTextSkewX() == textPaint2.getTextSkewX() && textPaint.getLetterSpacing() == textPaint2.getLetterSpacing() && TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) && textPaint.getFlags() == textPaint2.getFlags()) {
                        if (i6 >= 24) {
                            textLocales = textPaint.getTextLocales();
                            textLocales2 = textPaint2.getTextLocales();
                            equals = textLocales.equals(textLocales2);
                            if (!equals) {
                                return false;
                            }
                        } else if (!textPaint.getTextLocale().equals(textPaint2.getTextLocale())) {
                            return false;
                        }
                        if (textPaint.getTypeface() == null) {
                            if (textPaint2.getTypeface() != null) {
                                return false;
                            }
                        } else if (!textPaint.getTypeface().equals(textPaint2.getTypeface())) {
                            return false;
                        }
                        if (this.f11251b == cVar.f11251b) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        LocaleList textLocales;
        int i6 = Build.VERSION.SDK_INT;
        TextDirectionHeuristic textDirectionHeuristic = this.f11251b;
        int i10 = this.f11253d;
        int i11 = this.f11252c;
        TextPaint textPaint = this.f11250a;
        if (i6 >= 24) {
            Float valueOf = Float.valueOf(textPaint.getTextSize());
            Float valueOf2 = Float.valueOf(textPaint.getTextScaleX());
            Float valueOf3 = Float.valueOf(textPaint.getTextSkewX());
            Float valueOf4 = Float.valueOf(textPaint.getLetterSpacing());
            Integer valueOf5 = Integer.valueOf(textPaint.getFlags());
            textLocales = textPaint.getTextLocales();
            return Objects.hash(valueOf, valueOf2, valueOf3, valueOf4, valueOf5, textLocales, textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), textDirectionHeuristic, Integer.valueOf(i11), Integer.valueOf(i10));
        }
        return Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocale(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), textDirectionHeuristic, Integer.valueOf(i11), Integer.valueOf(i10));
    }

    public final String toString() {
        String fontVariationSettings;
        LocaleList textLocales;
        StringBuilder sb2 = new StringBuilder("{");
        StringBuilder sb3 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f11250a;
        sb3.append(textPaint.getTextSize());
        sb2.append(sb3.toString());
        sb2.append(", textScaleX=" + textPaint.getTextScaleX());
        sb2.append(", textSkewX=" + textPaint.getTextSkewX());
        int i6 = Build.VERSION.SDK_INT;
        sb2.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb2.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        if (i6 >= 24) {
            StringBuilder sb4 = new StringBuilder(", textLocale=");
            textLocales = textPaint.getTextLocales();
            sb4.append(textLocales);
            sb2.append(sb4.toString());
        } else {
            sb2.append(", textLocale=" + textPaint.getTextLocale());
        }
        sb2.append(", typeface=" + textPaint.getTypeface());
        if (i6 >= 26) {
            StringBuilder sb5 = new StringBuilder(", variationSettings=");
            fontVariationSettings = textPaint.getFontVariationSettings();
            sb5.append(fontVariationSettings);
            sb2.append(sb5.toString());
        }
        sb2.append(", textDir=" + this.f11251b);
        sb2.append(", breakStrategy=" + this.f11252c);
        sb2.append(", hyphenationFrequency=" + this.f11253d);
        sb2.append("}");
        return sb2.toString();
    }

    public c(PrecomputedText.Params params) {
        TextPaint textPaint;
        TextDirectionHeuristic textDirection;
        int breakStrategy;
        int hyphenationFrequency;
        textPaint = params.getTextPaint();
        this.f11250a = textPaint;
        textDirection = params.getTextDirection();
        this.f11251b = textDirection;
        breakStrategy = params.getBreakStrategy();
        this.f11252c = breakStrategy;
        hyphenationFrequency = params.getHyphenationFrequency();
        this.f11253d = hyphenationFrequency;
    }
}
