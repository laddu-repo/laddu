package androidx.emoji2.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class e0 implements Spannable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f899v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Spannable f900w;

    public e0(Spannable spannable) {
        this.f900w = spannable;
    }

    public final void a() {
        Spannable spannable = this.f900w;
        if (!this.f899v) {
            if ((Build.VERSION.SDK_INT < 28 ? new kb.e(3) : new d0(3)).n(spannable)) {
                this.f900w = new SpannableString(spannable);
            }
        }
        this.f899v = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f900w.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f900w.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f900w.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f900w.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f900w.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f900w.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i10, Class cls) {
        return this.f900w.getSpans(i, i10, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f900w.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i10, Class cls) {
        return this.f900w.nextSpanTransition(i, i10, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.f900w.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i10, int i11) {
        a();
        this.f900w.setSpan(obj, i, i10, i11);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i10) {
        return this.f900w.subSequence(i, i10);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f900w.toString();
    }
}
