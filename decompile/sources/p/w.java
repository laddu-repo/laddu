package p;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f10400a;

    /* renamed from: b, reason: collision with root package name */
    public final k7.c f10401b;

    public w(TextView textView) {
        this.f10400a = textView;
        this.f10401b = new k7.c(textView);
    }

    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return ((a8.c) this.f10401b.f7745y).f(inputFilterArr);
    }

    public final void b(AttributeSet attributeSet, int i6) {
        TypedArray obtainStyledAttributes = this.f10400a.getContext().obtainStyledAttributes(attributeSet, h.a.f5740i, i6, 0);
        try {
            boolean z10 = true;
            if (obtainStyledAttributes.hasValue(14)) {
                z10 = obtainStyledAttributes.getBoolean(14, true);
            }
            obtainStyledAttributes.recycle();
            d(z10);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void c(boolean z10) {
        ((a8.c) this.f10401b.f7745y).l(z10);
    }

    public final void d(boolean z10) {
        ((a8.c) this.f10401b.f7745y).m(z10);
    }
}
