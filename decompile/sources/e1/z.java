package e1;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class z implements Spannable {

    /* renamed from: x, reason: collision with root package name */
    public boolean f4202x = false;

    /* renamed from: y, reason: collision with root package name */
    public Spannable f4203y;

    public z(Spannable spannable) {
        this.f4203y = spannable;
    }

    public final void a() {
        zb.d dVar;
        Spannable spannable = this.f4203y;
        if (!this.f4202x) {
            if (Build.VERSION.SDK_INT < 28) {
                dVar = new zb.d(8);
            } else {
                dVar = new zb.d(8);
            }
            if (dVar.x(spannable)) {
                this.f4203y = new SpannableString(spannable);
            }
        }
        this.f4202x = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i6) {
        return this.f4203y.charAt(i6);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        IntStream chars;
        chars = this.f4203y.chars();
        return chars;
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        IntStream codePoints;
        codePoints = this.f4203y.codePoints();
        return codePoints;
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f4203y.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f4203y.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f4203y.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i6, int i10, Class cls) {
        return this.f4203y.getSpans(i6, i10, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f4203y.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i6, int i10, Class cls) {
        return this.f4203y.nextSpanTransition(i6, i10, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.f4203y.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i6, int i10, int i11) {
        a();
        this.f4203y.setSpan(obj, i6, i10, i11);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i6, int i10) {
        return this.f4203y.subSequence(i6, i10);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f4203y.toString();
    }
}
